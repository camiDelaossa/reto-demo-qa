package questions;

import models.ActualData;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import userInterface.TextBoxUI;

public class TextBoxValuesQuestion implements Question<ActualData> {

  private static final String NAME = "Name:";
  private static final String EMAIL = "Email:";
  private static final String CURRENT_ADDRESS = "Current Address :";
  private static final String PERMANANET_ADDRESS = "Permananet Address :";

  @Override
  public ActualData answeredBy(Actor actor) {
    String actualFullName = Text.of(TextBoxUI.LBL_FULL_NAME).viewedBy(actor).value().replace(NAME, "").trim();
    String actualEmail = Text.of(TextBoxUI.LBL_EMAIL).viewedBy(actor).value().replace(EMAIL, "").trim();
    String actualAddress = Text.of(TextBoxUI.LBL_ADDRESS).viewedBy(actor).value().replace(CURRENT_ADDRESS, "").trim();
    String actualPermanentAddress = Text.of(TextBoxUI.LBL_PERMANENT_ADDRESS).viewedBy(actor).value().replace(PERMANANET_ADDRESS, "").trim();
    return new ActualData(actualFullName, actualEmail, actualAddress, actualPermanentAddress);
  }

  public static Question<ActualData> validateFields() {
    return new TextBoxValuesQuestion();
  }

}
