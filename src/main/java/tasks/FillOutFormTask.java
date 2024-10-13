package tasks;

import models.FormData;
import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Enter;
import userInterface.TextBoxUI;

public class FillOutFormTask implements Task {

  private final FormData formData;

  public FillOutFormTask(FormData formData) {
    this.formData = formData;
  }

  @Override
  public <T extends Actor> void performAs(T actor) {
    actor.attemptsTo(
        Enter.theValue(formData.getFullName()).into(TextBoxUI.TXT_FULLNAME),
        Enter.theValue(formData.getEmail()).into(TextBoxUI.TXT_EMAIL),
        Enter.theValue(formData.getCurrentAddress()).into(TextBoxUI.TXT_ADDRESS),
        Enter.theValue(formData.getPermanentAddress()).into(TextBoxUI.TXT_PERMANENT_ADDRESS)
    );
  }

  public static Performable fillOutForm(FormData formData) {
    return Instrumented.instanceOf(FillOutFormTask.class).withProperties(formData);
  }

}
