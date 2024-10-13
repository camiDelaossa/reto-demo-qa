package stepDefinitions;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import java.io.IOException;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import org.junit.Assert;
import questions.SelecRadioButtonValuesQuestion;
import tasks.SelectionRadioButtonTask;
import tasks.SelectionYesRadioButtonTask;

public class RadioButtonDemoQAStepDefinitios {

  @Before
  public void bf() throws IOException {
    OnStage.setTheStage(new OnlineCast());
  }

  @Given("^I select the Radio Buttons option from the Elements section$")
  public void iSelectTheRadioButtonsOptionFromTheElementsSection() {
    OnStage.theActorInTheSpotlight().attemptsTo(SelectionRadioButtonTask.selectionRadioButtons());
  }


  @When("^I click on the Yes radio button$")
  public void iClickOnTheYesRadioButton() {
    OnStage.theActorInTheSpotlight()
        .attemptsTo(SelectionYesRadioButtonTask.selectionYesRadioButtons());
  }

  @Then("^I validate that the Yes option is selected$")
  public void iValidateThatTheYesOptionIsSelected() {
    // Obtener el valor del radio button seleccionado
    String selectedRadioButton = SelecRadioButtonValuesQuestion.selectedRadioButtonsValue()
        .answeredBy(OnStage.theActorInTheSpotlight());

    // Asegurarse de que el valor no sea nulo
    Assert.assertNotNull("The selected radio button value should not be null.", selectedRadioButton);

    // Validar que el valor seleccionado sea "Yes"
    Assert.assertEquals("The selected radio button is not 'Yes'.", "Yes", selectedRadioButton);
  }

}
