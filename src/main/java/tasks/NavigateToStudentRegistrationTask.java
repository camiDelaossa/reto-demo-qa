package tasks;

import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;
import userInterface.StudentRegistrationUI;

public class NavigateToStudentRegistrationTask implements Task {


  @Override
  public <T extends Actor> void performAs(T actor) {
    actor.attemptsTo(
        Scroll.to(StudentRegistrationUI.BTN_FORMS),
        Click.on(StudentRegistrationUI.BTN_FORMS),
        Click.on(StudentRegistrationUI.BTN_BUTTON_PRACTICE_FORM)
    );
  }
  public static Performable navigateToStudentRegistration() {
    return Instrumented.instanceOf(NavigateToStudentRegistrationTask.class).withProperties();
  }
}
