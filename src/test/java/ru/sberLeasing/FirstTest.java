package ru.sberLeasing;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;


public class FirstTest extends WebDriverSettings {

    @Test
    public void firstTest() throws InterruptedException {
        // 1. Переходим в поиск гугл
        driver.get("https://www.google.com/");
        //полный экран
        driver.manage().window().maximize();
        // 2. проверяем соответствие по title
        String title = driver.getTitle();
        Assert.assertTrue(title.equals("Google"));
        // 3. поиск поискового окна
        WebElement googlesearchbox = driver.findElement(By.cssSelector("input"));
        // 4. ввод текста "Сберлизинг"
        googlesearchbox.sendKeys("Сберлизинг");
        // 5. нажатие ENTER
        googlesearchbox.sendKeys(Keys.ENTER);
        // 6. поиск ссылки Сберлизинг
        WebElement sberlizingurl = driver.findElement(By.xpath("//*[@id=\"rso\"]/div[1]/div/div/div/div/div/div[1]/a/h3"));
        // 7. переход на сайт Сберлизинг
        sberlizingurl.click();
        // 8. проверяем соответствие сайта по title
        //Assert.assertTrue(title.equals("СберЛизинг — официальный сайт лизинговой компании. Лизинг для юридических лиц и ИП."));
        // 9. Закрываем окно предупреждения cookie
        WebElement cookiewarning = driver.findElement(By.cssSelector(".cookie-warning__close.sbl-btn.sbl-btn_secondary.sbl-btn_medium"));
        cookiewarning.click();
        // 10. находим кнопку "Авто в наличии"
        WebElement autoinstock = driver.findElement(By.cssSelector(".header-menu__link"));
        // 11. нажимаем на кнопку "Авто в наличии"
        autoinstock.click();
        // 12. Находим поле город
        WebElement sitybox = driver.findElement(By.cssSelector(".horizontal-filter-block__search-string"));
        // 13. Нажимаем на поле выбор города
        sitybox.click();
        // 14. Вводим город Санкт-Петербург
        sitybox.sendKeys("Санкт-Петербург");
        // 15. Находим Санкт-Петербург в списке
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement sityselect = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(".horizontal-filter-block__black-selector-values")));
        // 16. Выбираем Санкт-Петербург из списка
        sityselect.click();
        // 17. Ищем окно МАРКА
        WebElement brandbox = driver.findElement(By.xpath("//*[@id=\"marketplace-horizontal-filter\"]/div/div[1]/div[2]/div[2]/input"));
        // 18. Нажимаем на окно МАРКА
        brandbox.click();
        // 19. Вводим mercedes-benz
        brandbox.sendKeys("mercedes-benz");
        // 20. Выбираем mercedes-benz
        WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement brandselect = wait2.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"marketplace-horizontal-filter\"]/div/div[1]/div[2]/div[3]/div/div/label")));
        brandselect.click();
        // 21. Находим окно модель
        WebElement modelbox = driver.findElement(By.xpath("//*[@id=\"marketplace-horizontal-filter\"]/div/div[1]/div[3]/div[2]/input"));
        // 22. Нажимаем на окно выбора модели
        modelbox.click();
        // 23. Ввод слова универсал
        modelbox.sendKeys("E универсал");
        // 24. Поиск элемента унииверсал
        WebElement modeluniversal = driver.findElement(By.xpath("//*[@id=\"marketplace-horizontal-filter\"]/div/div[1]/div[3]/div[3]/div/div/label"));
        // 25. Нажатие на окно универсал
        modeluniversal.click();
        // 26. Найти кнопку Показать все предложения
        WebElement buttonshow = driver.findElement(By.xpath("//*[@id=\"marketplace-horizontal-filter\"]/div/div[4]/div/div[2]/a"));
        // 27. Нажать на кнопку показа предложений
        buttonshow.click();
        buttonshow.click();


    }

    //https://www.sberleasing.ru/
}
