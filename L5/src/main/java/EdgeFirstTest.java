import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class EdgeFirstTest {
    public static void main(String[] args) {
        WebDriver driver = new EdgeDriver();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://ecogolik.ru/");

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        // получение заголовка сайта и его вывод
        WebElement title = wait.until(ExpectedConditions.presenceOfElementLocated(By.
                xpath("//div[@class='page-header__top-row']")));

        System.out.println("\nSite title:\n" + title.getText() + "\n");

        // поиск элементов и их вывод
        List<WebElement> elements = driver.findElements(By.
                xpath("//nav[@class='page-header__nav-row']"));

        System.out.println("Elements");
        for (int i = 0; i < elements.size(); i++) {
            System.out.println(elements.get(i).getText());
        }

        WebElement firstElement = driver.findElement(By.
                xpath("//div[@class='page-header__item'][2]"));
        firstElement.click();

        WebElement secondElement = driver.findElement(By.
                cssSelector("a[href=\"/kosmetika_dlya_litsa/\"]:nth-of-type(1)"));
        secondElement.click();

        driver.quit();
    }
}
