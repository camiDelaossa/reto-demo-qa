package questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.targets.Target;
import net.serenitybdd.screenplay.waits.WaitUntil;

public class ModalDialogValuesQuestion implements Question <Boolean>{
  private final Target target;

  public ModalDialogValuesQuestion(Target target) {
    this.target = target;
  }

  @Override
  public Boolean answeredBy(Actor actor) {
    WaitUntil.the(target, WebElementStateMatchers.isVisible()).forNoMoreThan(5).seconds();
    return target.resolveFor(actor).isVisible();
  }

  public static ModalDialogValuesQuestion isPresent(Target target) {
    return new ModalDialogValuesQuestion(target);
  }

}
