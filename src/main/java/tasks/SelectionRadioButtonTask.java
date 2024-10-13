package tasks;

import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;
import userInterface.RadioButtonUI;
import userInterface.TextBoxUI;


public class SelectionRadioButtonTask implements Task {

  @Override
  public <T extends Actor> void performAs(T actor) {
    actor.attemptsTo(
        Scroll.to(RadioButtonUI.BTN_ELEMENTS),
        Click.on(RadioButtonUI.BTN_ELEMENTS),
        Click.on(RadioButtonUI.BTN_RADIO_BUTTON)
    );
  }
  public static Performable selectionRadioButtons() {
    return Instrumented.instanceOf(SelectionRadioButtonTask.class).withProperties();
  }
}
