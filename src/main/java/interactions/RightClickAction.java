package interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import userInterface.ButtonUI;

public class RightClickAction implements Interaction {

  private final Target button;

  public RightClickAction(Target button) {
    this.button = button;
  }

  @Override
  public <T extends Actor> void performAs(T actor) {
    WebElement rightClickButton = ButtonUI.BTN_RIGHT_CLICK_BUTTON.resolveFor(actor);
    Actions actions = new Actions(BrowseTheWeb.as(actor).getDriver());
    actions.contextClick(rightClickButton).perform();
  }

  public static RightClickAction on(Target button) {
    return new RightClickAction(button);
  }

}
