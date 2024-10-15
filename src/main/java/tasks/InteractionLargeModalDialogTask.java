package tasks;

import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import userInterface.ModalDialogUI;

public class InteractionLargeModalDialogTask implements Task {

  @Override
  public <T extends Actor> void performAs(T actor) {
    actor.attemptsTo(
        Click.on(ModalDialogUI.BTN_LARGE_MODAL)
    );

  }
  public static Performable interactionSLargeModalDialog() {
    return Instrumented.instanceOf(InteractionLargeModalDialogTask.class).withProperties();
  }
}
