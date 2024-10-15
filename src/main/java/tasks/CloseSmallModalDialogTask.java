package tasks;

import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import userInterface.ModalDialogUI;

public class CloseSmallModalDialogTask implements Task {

  @Override
  public <T extends Actor> void performAs(T actor) {
    actor.attemptsTo(
        Click.on(ModalDialogUI.BTN_CLOSE_SMALL_MODAL)
    );
  }
  public static Performable closeSmallModalDialog() {
    return Instrumented.instanceOf(CloseSmallModalDialogTask.class).withProperties();
  }
}
