package tasks;

import models.StudentRegistrationForm;
import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;
import userInterface.StudentRegistrationUI;

public class SubmitEstudentRegisterFormTask implements Task {

  @Override
  public <T extends Actor> void performAs(T actor) {
    actor.attemptsTo(
        Scroll.to(StudentRegistrationUI.BTN_SUBMIT),
        Click.on(StudentRegistrationUI.BTN_SUBMIT)
    );
  }
  public static Performable submitEstudentRegisterForm() {
    return Instrumented.instanceOf(SubmitEstudentRegisterFormTask.class).withProperties();
}
}
