package tasks;

import interactions.RightClickAction;
import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.DoubleClick;

import net.serenitybdd.screenplay.actions.Scroll;
import userInterface.ButtonUI;


public class ButtonClickTask implements Task {

  @Override
  public <T extends Actor> void performAs(T actor) {

    actor.attemptsTo(
        Scroll.to(ButtonUI.BTN_CLICK_ME_BUTTON),
        DoubleClick.on(ButtonUI.BTN_DOUBLE_CLICK_BUTTON),
        RightClickAction.on(ButtonUI.BTN_RIGHT_CLICK_BUTTON),
        Click.on(ButtonUI.BTN_CLICK_ME_BUTTON)
    );
  }

  public static Performable clickButton() {
    return Instrumented.instanceOf(ButtonClickTask.class).withProperties();
  }
}
