package userInterface;

import net.serenitybdd.screenplay.targets.Target;

public class StudentRegistrationUI {

  public static final Target BTN_FORMS = Target.the("click forms")
      .locatedBy("//div[@class='card-body']/h5[text()='Forms']");
  public static final Target BTN_BUTTON_PRACTICE_FORM = Target.the("click practice form")
      .locatedBy("//li[span[@class='text' and text()='Practice Form']]");

  public static final Target  TXT_FIRST_NAME = Target.the("first name field")
      .locatedBy("//input[@placeholder='First Name']");
  public static final Target TXT_LAST_NAME = Target.the("first last field")
      .locatedBy("//input[@placeholder='Last Name']");
  public static final Target TXT_EMAIL = Target.the("email field")
      .locatedBy("//input[@id='userEmail']");
  public static final Target BTN_GENDER = Target.the("gender field")
      .locatedBy("//label[contains(.,'{0}')]");

  public static final Target TXT_MOBILE = Target.the("mobile field")
      .locatedBy("//input[contains(@id,'userNumber')]");

  public static final Target BTN_PICTURE = Target.the("Pic field")
      .locatedBy("//input[contains(@id,'uploadPicture')]");

  public static final Target TXT_ADDREES = Target.the("address field")
      .locatedBy("//textarea[contains(@id,'currentAddress')]");

  public static final Target BTN_UPLOAD = Target.the("address field")
      .locatedBy("//input[@id='uploadPicture']");

  public static final Target BTN_SUBMIT = Target.the("city field")
      .locatedBy("//button[@id='submit']");

  public static final Target TABLE_TR = Target.the("values table")
      .locatedBy("//table[@class='table table-dark table-striped table-bordered table-hover']/tbody/tr");

}
