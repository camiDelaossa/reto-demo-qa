package userInterface;

import net.serenitybdd.screenplay.targets.Target;

public class ButtonUI {

  public static final Target BTN_ELEMENTS = Target.the("click elements")
      .locatedBy("//div[@class='card-body']/h5[text()='Elements']");

  public static final Target BTN_BUTTON = Target.the("click Button")
      .locatedBy("//li[span[@class='text' and text()='Buttons']]");

  public static final Target BTN_DOUBLE_CLICK_BUTTON = Target.the("Double click Button")
      .locatedBy("//button[@id='doubleClickBtn']");

  public static final Target BTN_RIGHT_CLICK_BUTTON = Target.the("Right click Button")
      .locatedBy("//button[@id='rightClickBtn']");

  public static final Target BTN_CLICK_ME_BUTTON = Target.the("click Me Button")
      .locatedBy("//button[@class='btn btn-primary' and text()='Click Me']");

  public static final Target BTN_DOUBLE_CLICK_BUTTON_MESSAGE = Target.the("Double click Button message")
      .locatedBy("//p[@id='doubleClickMessage']");

  public static final Target BTN_RIGHT_CLICK_BUTTON_MESSAGE = Target.the("Right click Button message")
      .locatedBy("//p[@id='rightClickMessage']");

  public static final Target BTN_CLICK_ME_BUTTON_MESSAGE = Target.the("click Me Button message")
      .locatedBy("//p[@id='dynamicClickMessage']");

}
