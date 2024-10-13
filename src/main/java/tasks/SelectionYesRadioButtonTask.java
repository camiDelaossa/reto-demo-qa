package tasks;

import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import userInterface.RadioButtonUI;

public class SelectionYesRadioButtonTask implements Task {

  @Override
  public <T extends Actor> void performAs(T actor) {
    actor.attemptsTo(
        Click.on(RadioButtonUI.BTN_SELECT_YES_RADIO_BUTTON)
    );
  }
  public static Performable selectionYesRadioButtons() {
    return Instrumented.instanceOf(SelectionYesRadioButtonTask.class).withProperties();
  }
}
