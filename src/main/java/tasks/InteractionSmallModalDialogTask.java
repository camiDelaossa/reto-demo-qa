package tasks;

import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import userInterface.ModalDialogUI;

public class InteractionModalDialogTask implements Task {

  @Override
  public <T extends Actor> void performAs(T actor) {
    actor.attemptsTo(
        Click.on(ModalDialogUI.BTN_SMALL_BUTTON)
    );

  }
  public static Performable interactionModalDialog() {
    return Instrumented.instanceOf(InteractionModalDialogTask.class).withProperties();
  }
}
