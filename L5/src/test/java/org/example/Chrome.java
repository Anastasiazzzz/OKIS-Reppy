/*
Задание 3:
1. Сконфигурировать запуск первого браузера и переход на главную страницу сайта https://testng.org/.
2. Реализовать явное или неявное ожидание (wait).
3. Получить заголовок сайта и вывести его в консоль.
4. Добавить команду закрытия браузера.

Задание 4:
1. Определить элементы ссылок содержания Table of Contents сайта. Вывести список из названий этих подпунктов в консоль.
2. Реализовать нажатие на один из элементов содержания. Поиск элемента организовать двумя разными методами объекта By (css селекторы, xPath локаторы).
   Не использовать в локаторах абсолютные пути до элемента.
 */

package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class Chrome {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\в\\Desktop\\chromedriver-win32\\chromedriver-win32\\chromedriver-win64\\chromedriver.exe");

        // объявление драйвера
        WebDriver driver = new ChromeDriver();

        // неявное ожидание
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        // открытие главной страницы
        driver.get("https://testng.org/");

        // явное ожидание
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        // получение заголовка сайта и его вывод
        WebElement title = wait.until(ExpectedConditions.presenceOfElementLocated(By.
                xpath("//h1[text()=\"TestNG Documentation\"]")));

        System.out.println("Title:\n" + title.getText() + "\n");

        // поиск элементов и их вывод
        List<WebElement> elements = driver.findElements(By.cssSelector(".toc-link.node-name--H2." +
                "ignoreactive,.toc-link.node-name--H3,.toc-link.node-name--H4,.toc-link.node-name--H2," +
                ".toc-link.node-name--H5 "));

        System.out.println("Elements:");
        for (int i = 0; i < elements.size(); i++) {
            System.out.println(elements.get(i).getAttribute("text"));
        }

        // поиск по тексту с конкретным значением
        WebElement firstElement = driver.findElement(By.
                xpath("//a[text()='5. YAML']"));
        firstElement.click();

        WebElement secondElement = driver.findElement(By.
                cssSelector("li.toc-list-item > a[href=\"#_dry_run_for_your_tests\"]"));
        secondElement.click();

        // закрытие браузера
        driver.quit();
    }
}
