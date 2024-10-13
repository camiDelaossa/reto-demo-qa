package userInterface;

import net.serenitybdd.screenplay.targets.Target;

public class RadioButtonUI {

  public static final Target BTN_ELEMENTS = Target.the("click elements")
      .locatedBy("//div[@class='card-body']/h5[text()='Elements']");
  public static final Target BTN_RADIO_BUTTON = Target.the("click radioButton")
      .locatedBy("//li[span[@class='text' and text()='Radio Button']]");
  public static final Target BTN_SELECT_YES_RADIO_BUTTON = Target.the("click radioButton")
      .locatedBy("//label[@for='yesRadio']");

  public static final Target BTN_SELECT_RADIO_BUTTON = Target.the("click checkbox option")
      .locatedBy("//span[@class='text-success']");
}
