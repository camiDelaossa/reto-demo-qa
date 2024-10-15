package questions;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class StudentTableDataQuestion implements Question<Map<String, String>> {

  public static final String XPATH_EXPRESSION = ".//td";
  private final Target target;

  public StudentTableDataQuestion(Target target) {
    this.target = target;
  }

  @Override
  public Map<String, String> answeredBy(Actor actor) {
    List<WebElementFacade> rows = target.resolveAllFor(actor);
    Map<String, String> studentData = new HashMap<>();
    for (WebElement row : rows) {
      List<WebElement> cells = row.findElements(By.xpath(XPATH_EXPRESSION));
      String key = cells.get(0).getText();
      String value = cells.get(1).getText();
      studentData.put(key, value);
    }
    return studentData;
  }

  public static StudentTableDataQuestion studentData(Target target) {
    return new StudentTableDataQuestion(target);
  }
}
