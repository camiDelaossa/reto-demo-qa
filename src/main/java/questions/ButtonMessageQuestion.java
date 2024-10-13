package questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.targets.Target;

public class ButtonMessageQuestion implements Question<Boolean> {

  private final Target target;

  public ButtonMessageQuestion(Target target) {
    this.target = target;
  }

  @Override
  public Boolean answeredBy(Actor actor) {
    return target.resolveFor(actor).isVisible();
  }

  public static ButtonMessageQuestion isPresent(Target target) {
    return new ButtonMessageQuestion(target);
  }

}
