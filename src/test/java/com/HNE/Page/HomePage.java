package com.HNE.Page;

import com.HNE.Page.ChartPage;
import com.HNE.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.time.Instant;
import java.util.List;

public class HomePage {

    public  String nameProductOnHomePage;
    public String descrionProductOnHomePage;
    public String priceOnHomepage;


    protected String chartVal;

    WebDriver driver;
    By detectListIsdisplayed = By.cssSelector(".inventory_list[data-test='inventory-list']");

    public HomePage(WebDriver driver) {
        this.driver = driver;

    }

    public void ValisasiHomePageDisplayed() {
        driver.findElement(detectListIsdisplayed).isDisplayed();
    }

    public String generateXPathForItem(String itemName) {
        return "//div[contains(@class, 'inventory_item_name') and contains(text(), '" + itemName + "')]";
    }

    public String generateXpathForDescription(String itemname) {
        return  "//div[contains(@class, 'inventory_item_name') and text()='" + itemname + "']/ancestor::div[@class='inventory_item_description']//div[@class='inventory_item_desc']";

    }

    public  String generateXpathforPriceHomePage(String itemname){

        return "//div[contains(@class, 'inventory_item_name') and text()='" + itemname + "']/ancestor::div[@class='inventory_item_description']//div[@class='inventory_item_price']";
    }


    public void GetDataOnHomePage(String productNameOnHomePage) {
        //product title
        String xpath = generateXPathForItem(productNameOnHomePage);
        WebElement item = driver.findElement(By.xpath(xpath));
        nameProductOnHomePage = item.getText();

        //product description
        String XpathProduct = generateXpathForDescription(productNameOnHomePage);
        WebElement descriptionElement = driver.findElement(By.xpath(XpathProduct));
        descrionProductOnHomePage=descriptionElement.getText();


        //product price home page
        String priceRet = generateXpathforPriceHomePage(productNameOnHomePage);
        WebElement priceHomePage = driver.findElement(By.xpath(priceRet));
        priceOnHomepage = priceHomePage.getText();


//        chartPage.penampung(nameProductOnHomePage,descrionProductOnHomePage,priceOnHomepage);



    }
    public void ClickButtonAddtoChart(String itemname){
        String xpath = "//button[@data-test='add-to-cart-" + itemname.toLowerCase().replace(" ", "-") + "']";
        driver.findElement(By.xpath(xpath)).click();

    }


    public void ChartButtonValue(String val){
        String xpath = "//span[text()='" + val + "']";

        chartVal = driver.findElement(By.xpath(xpath)).getText();
        System.out.println(chartVal);
    }

    public void clickChart(){

        driver.findElement(By.xpath("//*[@id=\"shopping_cart_container\"]/a")).click();
    }


}
