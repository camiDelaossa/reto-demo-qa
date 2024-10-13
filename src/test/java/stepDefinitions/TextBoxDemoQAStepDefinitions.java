package stepDefinitions;

import static org.junit.Assert.assertEquals;

import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import driver.DriverSC;
import java.io.IOException;
import models.ActualData;
import models.FormData;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import questions.TextBoxValuesQuestion;
import tasks.FillOutFormTask;
import tasks.NavigateToTextBoxTask;
import tasks.SubmitFormTask;

public class TextBoxDemoQAStepDefinitions {

  private static final String FULL_NAME = "Maria Camila";
  private static final String EMAIL = "maria@gmail.com";
  private static final String CURRENT_ADDRESS = "my current address";
  private static final String PERMANENT_ADDRESS = "my permanent address";

  @Before
  public void bf() throws IOException {
    OnStage.setTheStage(new OnlineCast());
  }

  @Given("^I am on the DemoQA homepage (.*)$")
  public void iAmOnTheDemoQAHomepage(String url) {
    OnStage.theActorCalled("Camila").can(BrowseTheWeb.with(DriverSC.chromeDriver(url)));
  }

  @And("^I select the Textbox option$")
  public void iSelectTheTextboxOption() {
    OnStage.theActorInTheSpotlight().attemptsTo(NavigateToTextBoxTask.selectTextBox());
  }

  @When("^I fill in the form fields with the required information$")
  public void iFillInTheFormFieldsWithTheRequiredInformation() {
    final FormData form = new FormData();
    form.setFullName(FULL_NAME);
    form.setEmail(EMAIL);
    form.setCurrentAddress(CURRENT_ADDRESS);
    form.setPermanentAddress(PERMANENT_ADDRESS);
    OnStage.theActorInTheSpotlight().attemptsTo(FillOutFormTask.fillOutForm(form));
  }

  @And("^I click the Submit button$")
  public void iClickTheSubmitButton() {
    OnStage.theActorInTheSpotlight().attemptsTo(SubmitFormTask.submitForm());
  }

  @Then("^I verify that the information displayed after submission matches exactly what was entered in the form$")
  public void iVerifyThatTheInformationDisplayedAfterSubmissionMatchesExactlyWhatWasEnteredInTheForm() {
    ActualData actualData = TextBoxValuesQuestion.validateFields()
        .answeredBy(OnStage.theActorInTheSpotlight());
    assertEquals("The full name does not match", FULL_NAME, actualData.getFullName());
    assertEquals("The email does not match", EMAIL, actualData.getEmail());
    assertEquals("The current address does not match", CURRENT_ADDRESS,
        actualData.getCurrentAddress());
    assertEquals("The permanent address does not match", PERMANENT_ADDRESS,
        actualData.getPermanentAddress());
  }

}
