package userInterface;

import net.serenitybdd.screenplay.targets.Target;

public class TextBoxUI {

  //NavigateToTextBoxTask
  public static final Target BTN_ELEMENTS = Target.the("click elements")
      .locatedBy("//div[@class='card-body']/h5[text()='Elements']");
  public static final Target BTN_TEXT_BOX = Target.the("click texBox")
      .locatedBy("//li[span[@class='text' and text()='Text Box']]");

  //FillOutFormTask
  public static final Target TXT_FULLNAME = Target.the("Full name")
      .locatedBy("//input[contains(@id,'userName')]");
  public static final Target TXT_EMAIL = Target.the("EMAIL").locatedBy("//input[@id='userEmail']");
  public static final Target TXT_ADDRESS = Target.the("ADDRESS")
      .locatedBy("//textarea[contains(@id,'currentAddress')]");
  public static final Target TXT_PERMANENT_ADDRESS = Target.the("PERMANENT ADDRESS")
      .locatedBy("//textarea[@id='permanentAddress']");

  //SubmitFormTask
  public static final Target BTN_SUBMIT = Target.the("click submit")
      .locatedBy("//button[@id='submit']");

  //Validation
  public static final Target LBL_FULL_NAME = Target.the("validate full name")
      .locatedBy("//p[contains(@id,'name')]");
  public static final Target LBL_EMAIL = Target.the("validate email")
      .locatedBy("//p[contains(@id,'email')]");
  public static final Target LBL_ADDRESS = Target.the("validate address")
      .locatedBy("//p[contains(@id,'currentAddress')]");
  public static final Target LBL_PERMANENT_ADDRESS = Target.the("validate permanent address")
      .locatedBy("//p[contains(@id,'permanentAddress')]");

}
