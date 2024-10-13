package tasks;

import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;
import userInterface.ButtonUI;
import userInterface.CheckBoxUI;

public class NavigateToButtonTask implements Task {

  @Override
  public <T extends Actor> void performAs(T actor) {
    actor.attemptsTo(
        Scroll.to(ButtonUI.BTN_ELEMENTS),
        Click.on(ButtonUI.BTN_ELEMENTS),
        Click.on(ButtonUI.BTN_BUTTON)
    );
  }

  public static Performable selectButton() {
    return Instrumented.instanceOf(NavigateToButtonTask.class).withProperties();
  }


}
