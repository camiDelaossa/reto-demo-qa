package tasks;

import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;
import userInterface.ButtonUI;
import userInterface.ModalDialogUI;

public class NavigateToModalsTask implements Task {

  @Override
  public <T extends Actor> void performAs(T actor) {
    actor.attemptsTo(
        Scroll.to(ModalDialogUI.BTN_ALERTS_FRAME_WINDOWS),
        Click.on(ModalDialogUI.BTN_ALERTS_FRAME_WINDOWS),
        Click.on(ModalDialogUI.BTN_BUTTON_MODALS_DIALOG)
    );

  }
  public static Performable navigateToModals() {
    return Instrumented.instanceOf(NavigateToModalsTask.class).withProperties();
  }
}
