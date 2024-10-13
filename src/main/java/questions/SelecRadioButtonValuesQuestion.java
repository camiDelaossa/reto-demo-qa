package questions;

import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import org.openqa.selenium.WebElement;
import userInterface.RadioButtonUI;

public class SelecRadioButtonValuesQuestion implements Question<String> {

  @Override
  public String answeredBy(Actor actor) {
    WebElementFacade webElementFacade = RadioButtonUI.BTN_SELECT_RADIO_BUTTON.resolveFor(actor);
    WebElement webElement = webElementFacade;
    return webElement.getText();
  }

public static Question<String> selectedRadioButtonsValue() {
    return new SelecRadioButtonValuesQuestion();
  }

}
