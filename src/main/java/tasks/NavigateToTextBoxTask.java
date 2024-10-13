package tasks;

import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;
import userInterface.TextBoxUI;

public class NavigateToTextBoxTask implements Task {

  @Override
  public <T extends Actor> void performAs(T actor) {
    actor.attemptsTo(
        Scroll.to(TextBoxUI.BTN_ELEMENTS),
        Click.on(TextBoxUI.BTN_ELEMENTS),
        Click.on(TextBoxUI.BTN_TEXT_BOX)
    );
  }

  public static Performable selectTextBox() {
    return Instrumented.instanceOf(NavigateToTextBoxTask.class).withProperties();
  }
}
