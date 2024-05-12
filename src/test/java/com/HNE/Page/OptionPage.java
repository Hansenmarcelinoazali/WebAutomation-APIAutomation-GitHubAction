package com.HNE.Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;


public class OptionPage {

    WebDriver driver;

    By nameOption = By.xpath("//*[@id=\"react-burger-menu-btn\"]");
    By buttonLogout = By.id("logout_sidebar_link");

    public OptionPage(WebDriver driver) {
        this.driver = driver;
    }

    public void OptionMenu() {
        driver.findElement(nameOption).click();

    }

    public void ClickLogout()throws  InterruptedException{

        Thread.sleep(3000);
        driver.findElement(buttonLogout).click();
    }


}

