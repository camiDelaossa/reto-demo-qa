package tasks;

import java.nio.file.Path;
import java.nio.file.Paths;
import models.StudentRegistrationForm;
import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Upload;
import userInterface.StudentRegistrationUI;

public class RegisterStudentTask implements Task {

  private final StudentRegistrationForm studentRegistrationForm;

  public RegisterStudentTask(StudentRegistrationForm studentRegistrationForm) {
    this.studentRegistrationForm = studentRegistrationForm;
  }

  @Override
  public <T extends Actor> void performAs(T actor) {
    Path absolutePath = Paths.get(studentRegistrationForm.getPicturePath()).toAbsolutePath();
    actor.attemptsTo(
        Enter.theValue(studentRegistrationForm.getFirstName()).into(StudentRegistrationUI.TXT_FIRST_NAME),
        Enter.theValue(studentRegistrationForm.getLastName()).into(StudentRegistrationUI.TXT_LAST_NAME),
        Enter.theValue(studentRegistrationForm.getEmail()).into(StudentRegistrationUI.TXT_EMAIL),
        Click.on(StudentRegistrationUI.BTN_GENDER.of(studentRegistrationForm.getGender())),
        Enter.theValue(studentRegistrationForm.getMobileNumber()).into(StudentRegistrationUI.TXT_MOBILE),
        Upload.theFile(absolutePath).to(StudentRegistrationUI.BTN_UPLOAD),
        Enter.theValue(studentRegistrationForm.getCurrentAddress()).into(StudentRegistrationUI.TXT_ADDREES)
    );
  }
  public static Performable registerStudent(StudentRegistrationForm studentRegistrationForm) {
    return Instrumented.instanceOf(RegisterStudentTask.class).withProperties(studentRegistrationForm);
  }
}
