package stepDefinitions;

import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import java.io.IOException;
import java.util.Map;
import models.StudentRegistrationForm;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import org.junit.Assert;
import questions.StudentTableDataQuestion;
import tasks.NavigateToStudentRegistrationTask;
import tasks.RegisterStudentTask;
import tasks.SubmitEstudentRegisterFormTask;
import userInterface.StudentRegistrationUI;

public class StudentRegistrationStepDefinition {

  private static final String STUDENT_NAME = "Camila De la ossa";
  private static final String NAME = "Camila";
  private static final String LAST_NAME = "De la ossa";
  private static final String EMAIL = "camila@gmail.com";
  private static final String GENDER = "Female";
  private static final String MOBILE_NUMBER = "1234567890";
  private static final String CURRENT_ADDRESS = "new york address";
  private static final String PICTURE = "picture.jfif";
  private static final String FILE = "files/";

  @Before
  public void bf() throws IOException {
    OnStage.setTheStage(new OnlineCast());
  }

  @Given("^I select the practice form option under the forms section$")
  public void iSelectThePracticeFormOptionUnderTheFormsSection() {
    OnStage.theActorInTheSpotlight()
        .attemptsTo(NavigateToStudentRegistrationTask.navigateToStudentRegistration());
  }


  @When("^I fill in the form fields correctly$")
  public void iFillInTheFormFieldsCorrectly() {
    StudentRegistrationForm studentRegistrationForm = new StudentRegistrationForm();
    studentRegistrationForm.setFirstName(NAME);
    studentRegistrationForm.setLastName(LAST_NAME);
    studentRegistrationForm.setEmail(EMAIL);
    studentRegistrationForm.setGender(GENDER);
    studentRegistrationForm.setMobileNumber(MOBILE_NUMBER);
    studentRegistrationForm.setCurrentAddress(CURRENT_ADDRESS);
    studentRegistrationForm.setPicturePath(FILE.concat(PICTURE));
    OnStage.theActorInTheSpotlight()
        .attemptsTo(RegisterStudentTask.registerStudent(studentRegistrationForm));
  }

  @And("^I click the submit button$")
  public void iClickTheSubmitButton() {
    OnStage.theActorInTheSpotlight()
        .attemptsTo(SubmitEstudentRegisterFormTask.submitEstudentRegisterForm());
  }

  @Then("^I should verify that the entered data has been submitted correctly$")
  public void iShouldVerifyThatTheEnteredDataHasBeenSubmittedCorrectly() {
    Map<String, String> studentRegistrationTable = StudentTableDataQuestion.studentData(
        StudentRegistrationUI.TABLE_TR).answeredBy(OnStage.theActorInTheSpotlight());

    Assert.assertEquals("The student name does not match", STUDENT_NAME,
        studentRegistrationTable.get("Student Name"));
    Assert.assertEquals("The email does not match. Expected", EMAIL,
        studentRegistrationTable.get("Student Email"));
    Assert.assertEquals("The gender does not match", GENDER,
        studentRegistrationTable.get("Gender"));
    Assert.assertEquals("The mobile number does not match", MOBILE_NUMBER,
        studentRegistrationTable.get("Mobile"));
    Assert.assertEquals("The address does not match", CURRENT_ADDRESS,
        studentRegistrationTable.get("Address"));
    Assert.assertEquals("The picture name does not match", PICTURE,
        studentRegistrationTable.get("Picture"));
  }

}
