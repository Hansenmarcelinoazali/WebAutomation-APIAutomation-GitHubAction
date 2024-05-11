package com.HNE;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class BaseTest {
    protected static WebDriver driver;

    protected void getDriver() {
//        ChromeOptions options = new ChromeOptions();
//        options.addArguments("--headless");
//        WebDriverManager.chromedriver().setup();
//        driver = new ChromeDriver(options);


        driver = WebDriverManager.chromedriver().create();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));


    }
}
