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
import java.util.concurrent.TimeUnit;

public class Chrome {

    public static void main(String[] args) {
        //System.setProperty("webdriver.chrome.driver", "C:\\Users\\в\\Desktop\\chromedriver-win32\\chromedriver-win32\\chromedriver-win64\\chromedriver.exe");

        // объявление драйвера
        WebDriver driver = new ChromeDriver();

        // неявное ожидание
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        // открытие главной страницы
        driver.get("https://testng.org/");

        // получение заголовка сайта
        String title = driver.getTitle();

        System.out.println("\nЗаголовок сайта: " + title + "\n");

        // поиск элементов
        List<WebElement> elements = driver.findElements(By.cssSelector(".toc-link.node-name--H2." +
                "ignoreactive,.toc-link.node-name--H3,.toc-link.node-name--H4,.toc-link.node-name--H2," +
                ".toc-link.node-name--H5 "));

        for (int i = 0; i < elements.size(); i++) {
            System.out.println(elements.get(i).getAttribute("text"));
        }

        // поиск по тексту с конкретным значением
        /*WebElement firstElement = driver.findElement(By.
                xpath("//a[text()='1.2. Mailing-lists']"));
        firstElement.click();

        WebElement secondElement = driver.findElement(By.
                cssSelector("li.toc-list-item > a[href=\"#_dependencies\"]"));
        secondElement.click();*/

        // закрытие браузера

        // явное ожидание (10 секунд)
        //WebDriverWait wait = new WebDriverWait(driver, 7);

        driver.quit();
    }
}
