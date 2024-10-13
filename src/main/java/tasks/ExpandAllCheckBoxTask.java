package tasks;

import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import userInterface.CheckBoxUI;

public class ExpandAllCheckBoxTask implements Task {


  @Override
  public <T extends Actor> void performAs(T actor) {
    actor.attemptsTo(
        Click.on(CheckBoxUI.BTN_EXPAND_ALL)
    );
  }

  public static Performable selectExpandAll() {
    return Instrumented.instanceOf(ExpandAllCheckBoxTask.class).withProperties();
  }
}
