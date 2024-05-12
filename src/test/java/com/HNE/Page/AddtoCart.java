package com.HNE.Page;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.security.Key;
import java.time.Duration;

public class AddtoCart {

    WebDriver driver;


    By xpathFirstProduct = By.xpath("/html/body/section[2]/div[1]/div/div[2]/div[1]/div[2]/div/div[2]/ul/li/a");
By nameQuantity = By.id("quantity");
By xpathButtonAddtoCart = By.xpath("/html/body/section/div/div/div[2]/div[2]/div[2]/div/span/button");
    By popUpAfterAddtoCart = By.xpath("//*[@id=\"cartModal\"]/div/div");


    public  AddtoCart(WebDriver driver){
        this.driver = driver;
    }

    public void GotoLoginAddCart(){

        driver.get("https://automationexercise.com/");

    }

    public void clickviewproduct(){
driver.findElement(xpathFirstProduct).click();
    }

    public void inputQuantity(String quantity){
        driver.findElement(nameQuantity).sendKeys(Keys.DELETE);
        driver.findElement(nameQuantity).sendKeys(quantity);

    }

    public void ClickAddtoCart(){
        driver.findElement(xpathButtonAddtoCart).click();
    }
    public void Popup(){

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(2000));

        wait.until(ExpectedConditions.visibilityOfElementLocated(popUpAfterAddtoCart));

        WebElement element =  driver.findElement(popUpAfterAddtoCart);
        if(element.isDisplayed()){
            System.out.println("element ini harusnya tidak tampil");
            Assert.fail();

        }

    }

}
