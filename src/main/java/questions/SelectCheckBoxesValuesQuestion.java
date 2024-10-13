package questions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import models.ActualData;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import org.openqa.selenium.WebElement;
import userInterface.CheckBoxUI;

public class SelectCheckBoxesValuesQuestion implements Question<List<String>> {

  @Override
  public List<String> answeredBy(Actor actor) {
    List<WebElementFacade> webElementFacadeList = CheckBoxUI.BTN_SELECT_CHECKBOXES.resolveAllFor(actor);
    List<String> checkboxTexts = new ArrayList<>();
    for (WebElement checkbox : webElementFacadeList) {
      checkboxTexts.add(checkbox.getText().toLowerCase());
    }
    return checkboxTexts;
  }

  public static Question<List<String>> selectedCheckboxes() {
    return new SelectCheckBoxesValuesQuestion();
  }
}
