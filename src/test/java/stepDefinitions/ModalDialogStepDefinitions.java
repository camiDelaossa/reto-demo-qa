package stepDefinitions;

import static org.junit.Assert.assertTrue;

import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import java.io.IOException;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import questions.ModalDialogValuesQuestion;
import tasks.CloseLargeModalDialogTask;
import tasks.CloseSmallModalDialogTask;
import tasks.InteractionLargeModalDialogTask;
import tasks.InteractionSmallModalDialogTask;
import tasks.NavigateToModalsTask;
import userInterface.ModalDialogUI;

public class ModalDialogStepDefinitions {

  @Before
  public void bf() throws IOException {
    OnStage.setTheStage(new OnlineCast());
  }

  @Given("^I select the alerts, frame, and windows option from the elements section$")
  public void iSelectTheAlertsFrameAndWindowsOptionFromTheElementsSection() {
    OnStage.theActorInTheSpotlight().attemptsTo(NavigateToModalsTask.navigateToModals());
  }


  @When("^I click the small modal button$")
  public void iClickTheSmallModalButton() {
    OnStage.theActorInTheSpotlight()
        .attemptsTo(InteractionSmallModalDialogTask.interactionSmallModalDialog());
  }

  @Then("^I should verify that the small modal is displayed$")
  public void iShouldVerifyThatTheSmallModalIsDisplayed() {
    assertTrue("The small modal dialog is not visible",
        ModalDialogValuesQuestion.isPresent(ModalDialogUI.TXT_SMALL_MODAL_TITTLE)
            .answeredBy(OnStage.theActorInTheSpotlight())
    );
  }

  @And("^I close the small modal by clicking the close button$")
  public void iCloseTheSmallModalByClickingTheCloseButton() {
    OnStage.theActorInTheSpotlight().attemptsTo(CloseSmallModalDialogTask.closeSmallModalDialog());
  }

  @When("^I click the large modal button$")
  public void iClickTheLargeModalButton() {
    OnStage.theActorInTheSpotlight()
        .attemptsTo(InteractionLargeModalDialogTask.interactionSLargeModalDialog());
  }

  @Then("^I should verify that the large modal is displayed$")
  public void iShouldVerifyThatTheLargeModalIsDisplayed() {
    assertTrue("The large modal dialog is not visible",
        ModalDialogValuesQuestion.isPresent(ModalDialogUI.TXT_LARGE_MODAL_TITTLE)
            .answeredBy(OnStage.theActorInTheSpotlight())
    );
  }

  @And("^I close the latge modal by clicking the close button$")
  public void iCloseTheLatgeModalByClickingTheCloseButton() {
    OnStage.theActorInTheSpotlight().attemptsTo(CloseLargeModalDialogTask.closeLargeModalDialog());
  }

}
