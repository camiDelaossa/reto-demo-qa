package userInterface;

import net.serenitybdd.screenplay.targets.Target;

public class CheckBoxUI {

  //NavigateToTextBoxTask
  public static final Target BTN_ELEMENTS = Target.the("click elements")
      .locatedBy("//div[@class='card-body']/h5[text()='Elements']");

  public static final Target BTN_CHECK_BOX = Target.the("click checkbox")
      .locatedBy("//li[span[@class='text' and text()='Check Box']]");

  public static final Target BTN_EXPAND_ALL = Target.the("click expand all")
      .locatedBy("//*[@title='Expand all']");

  public static final Target BTN_CHECKBOX_OPTION = Target.the("click checkbox option")
    .locatedBy("//span[@class='rct-title' and text()='{0}']");

  public static final Target BTN_SELECT_CHECKBOXES = Target.the("click checkbox option")
      .locatedBy("//span[@class='text-success']");
}
