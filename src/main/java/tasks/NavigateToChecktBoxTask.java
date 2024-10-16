package tasks;

import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;
import userInterface.CheckBoxUI;
import userInterface.RadioButtonUI;
import userInterface.TextBoxUI;

public class NavigateToChecktBoxTask implements Task {

  @Override
  public <T extends Actor> void performAs(T actor) {
    actor.attemptsTo(
        Scroll.to(CheckBoxUI.BTN_ELEMENTS),
        Click.on(CheckBoxUI.BTN_ELEMENTS),
        Click.on(CheckBoxUI.BTN_CHECK_BOX)
    );
  }

  public static Performable selectCheckBox() {
    return Instrumented.instanceOf(NavigateToChecktBoxTask.class).withProperties();
  }

}
