package tasks;

import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;
import userInterface.CheckBoxUI;

public class SelectCheckBoxTask implements Task {

  private String checkBoxName;

  public SelectCheckBoxTask(String checkBox) {
    this.checkBoxName = checkBox;
  }

  @Override
  public <T extends Actor> void performAs(T actor) {
    actor.attemptsTo(
        Scroll.to(CheckBoxUI.BTN_CHECKBOX_OPTION.of(checkBoxName)),
        Click.on(CheckBoxUI.BTN_CHECKBOX_OPTION.of(checkBoxName))
    );
  }

  public static Performable selectCheckBoxeName(String checkBoxName) {
    return Instrumented.instanceOf(SelectCheckBoxTask.class).withProperties(checkBoxName);
  }

}
