package tasks;

import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import userInterface.CheckBoxUI;
import userInterface.TextBoxUI;

public class NavigateToChecktBoxTask implements Task {

  @Override
  public <T extends Actor> void performAs(T actor) {
    actor.attemptsTo(
        Click.on(CheckBoxUI.BTN_ELEMENTS),
        Click.on(CheckBoxUI.BTN_CHECK_BOX)
    );
  }

  public static Performable selectCheckBox() {
    return Instrumented.instanceOf(NavigateToChecktBoxTask.class).withProperties();
  }

}
