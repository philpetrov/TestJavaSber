package ru.sberLeasing;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverSettings {

    public ChromeDriver driver;

    //выполнения ДО, инициализация драйвера
    @Before
    public void setUp() {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Филипп Петров\\Desktop\\chromedriver.exe");
        driver = new ChromeDriver();
        //лог результата
        System.out.println("test start");
    }

    //выход драйвера
    @After
    public void close () {
        //лог в консоль, тест закончен
        System.out.println("test close");
        driver.quit();
    }

}
