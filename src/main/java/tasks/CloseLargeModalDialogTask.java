package tasks;

import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import userInterface.ModalDialogUI;

public class CloseLargeModalDialogTask implements Task {

  @Override
  public <T extends Actor> void performAs(T actor) {
    actor.attemptsTo(
        Click.on(ModalDialogUI.BTN_CLOSE_LARGE_MODAL)
    );
  }
  public static Performable closeLargeModalDialog() {
    return Instrumented.instanceOf(CloseLargeModalDialogTask.class).withProperties();
  }
}
