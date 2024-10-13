package stepDefinitions;

import cucumber.api.DataTable;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import java.io.IOException;
import java.util.List;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import org.junit.Assert;
import questions.SelectCheckBoxesValuesQuestion;
import tasks.ExpandAllCheckBoxTask;
import tasks.NavigateToChecktBoxTask;
import tasks.SelectCheckBoxTask;

public class CheckboxDemoQAStepDefinitions {

  @Before
  public void bf() throws IOException {
    OnStage.setTheStage(new OnlineCast());
  }

  @Given("^I select the Checkbox option under the Elements section$")
  public void iSelectTheCheckboxOptionUnderTheElementsSection() {
    OnStage.theActorInTheSpotlight().attemptsTo(NavigateToChecktBoxTask.selectCheckBox());
  }


  @When("^I click the expand all button to display more options$")
  public void iClickTheExpandButtonToDisplayMoreOptions() {
    OnStage.theActorInTheSpotlight().attemptsTo(ExpandAllCheckBoxTask.selectExpandAll());
  }

  @And("^I select the checkboxes$")
  public void iSelectTheCheckbox(DataTable checkboxes) {
    List<String> checkboxList = checkboxes.asList(String.class);
    for (String checkbox : checkboxList) {
      OnStage.theActorInTheSpotlight()
          .attemptsTo(SelectCheckBoxTask.selectCheckBoxeName(checkbox));
    }
  }

  @Then("^I validate that the checkboxes has been selected correctly$")
  public void iValidateThatTheCheckboxHasBeenSelectedCorrectly(DataTable checkboxes) {
    List<String> checkboxList = checkboxes.asList(String.class);
    List<String> checkboxesSelected = SelectCheckBoxesValuesQuestion.selectedCheckboxes()
        .answeredBy(OnStage.theActorInTheSpotlight());
    for (String checkbox : checkboxList) {
      boolean isSelected = checkboxesSelected.contains(checkbox.toLowerCase());
      Assert.assertTrue("Checkbox '" + checkbox + "' should be selected but it is not.", isSelected);
    }
  }

}
