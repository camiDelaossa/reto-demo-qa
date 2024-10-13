package stepDefinitions;

import static org.junit.Assert.assertTrue;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import java.io.IOException;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import org.junit.Assert;
import questions.ButtonMessageQuestion;
import tasks.ButtonClickTask;
import tasks.NavigateToButtonTask;
import userInterface.ButtonUI;


public class ButtonDemoQAStepDefinitions {

  @Before
  public void bf() throws IOException {
    OnStage.setTheStage(new OnlineCast());
  }


  @Given("^I select the Buttons option from the Elements section$")
  public void iSelectTheButtonsOptionFromTheElementsSection() {
    OnStage.theActorInTheSpotlight().attemptsTo(NavigateToButtonTask.selectButton());
  }

  @When("^I click on the buttons Double Click Me, Right Click Me, and Click Me$")
  public void iClickOnTheButtonsDoubleClickMeRightClickMeAndClickMe() {
    OnStage.theActorInTheSpotlight().attemptsTo(ButtonClickTask.clickButton());
  }

  @Then("^I validate that the buttons have been successfully clicked$")
  public void iValidateThatTheButtonsHaveBeenSuccessfullyClicked() {
    assertTrue("The double click button message is not visible",
        ButtonMessageQuestion.isPresent(ButtonUI.BTN_DOUBLE_CLICK_BUTTON_MESSAGE)
            .answeredBy(OnStage.theActorInTheSpotlight())
    );
    assertTrue("The right click button message is not visible",
        ButtonMessageQuestion.isPresent(ButtonUI.BTN_RIGHT_CLICK_BUTTON_MESSAGE)
            .answeredBy(OnStage.theActorInTheSpotlight())
    );
    assertTrue("The click button message is not visible",
        ButtonMessageQuestion.isPresent(ButtonUI.BTN_CLICK_ME_BUTTON_MESSAGE)
            .answeredBy(OnStage.theActorInTheSpotlight())
    );
  }


}
