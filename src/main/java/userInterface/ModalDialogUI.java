package userInterface;

import net.serenitybdd.screenplay.targets.Target;

public class ModalDialogUI {

  public static final Target BTN_ALERTS_FRAME_WINDOWS = Target.the("click elements")
      .locatedBy("//div[@class='card-body']/h5[text()='Alerts, Frame & Windows']");
  public static final Target BTN_BUTTON_MODALS_DIALOG = Target.the("click Button")
      .locatedBy("//li[span[@class='text' and text()='Modal Dialogs']]");
  public static final Target BTN_SMALL_MODAL = Target.the("click small button")
      .locatedBy("//button[@id='showSmallModal']");
  public static final Target BTN_LARGE_MODAL = Target.the("click large button")
      .locatedBy("//button[@id='showLargeModal']");

  //validacion
  public static final Target TXT_SMALL_MODAL_TITTLE = Target.the("Validate small modal tittle")
      .locatedBy("//div[@id='example-modal-sizes-title-sm' and text()='Small Modal']");
  public static final Target TXT_LARGE_MODAL_TITTLE = Target.the("Validate large modal tittle ")
      .locatedBy("//div[@id='example-modal-sizes-title-lg' and text()='Large Modal']");

  public static final Target BTN_CLOSE_SMALL_MODAL = Target.the("Close small modal")
      .locatedBy("//button[@id='closeSmallModal']");

  public static final Target BTN_CLOSE_LARGE_MODAL = Target.the("Close large modal")
      .locatedBy("//button[@id='closeLargeModal']");

}
