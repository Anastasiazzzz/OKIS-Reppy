import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class EdgeSecondTest {
    public static void main(String[] args) {
        WebDriver driver = new EdgeDriver();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://animego.org/");

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        // получение заголовка сайта и его вывод
        WebElement title = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//header[@class=\"navbar navbar-expand-lg navbar-dark bg-dark d-lg-none w-100 mm-slideout border-bottom-0\"]")));

        System.out.println("\nSite title:\n" + title.getText() + "\n");

        // поиск элементов и их вывод
        WebElement titleOfElements = driver.findElement(By.xpath("//h3[@class=\"card-title h4\"]"));

        List<WebElement> elements = driver.findElements(By.xpath("//span[@class=\"mr-1\" and (text()=\"Понедельник\" or text()=\"Вторник\" or text()=\"Среда\" or text()=\"Четверг\" or text()=\"Пятница\" or text()=\"Суббота\" or text()=\"Воскресенье\")]"));

        System.out.println("Elements:");
        System.out.println(titleOfElements.getText());
        for (int i = 0; i < elements.size(); i++) {
            System.out.println(elements.get(i).getText());
        }

        WebElement firstElement = driver.findElement(By.cssSelector("a.read-more-link[role=\"button\"]"));
        firstElement.click();

        WebElement secondElement = driver.findElement(By.xpath("//div[@class=\"h2 mb-3\"]//a"));
        secondElement.click();

        driver.quit();
    }
}
