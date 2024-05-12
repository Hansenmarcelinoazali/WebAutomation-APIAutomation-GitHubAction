package com.HNE.Page;

import com.HNE.Page.HomePage;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ChartPage {
    public static String nameProductOnHomePage;
    public static String descrionProductOnHomePage;
    public static String priceOnHomepage;

    WebDriver driver;
    HomePage homePage;


    public ChartPage(WebDriver driver) {
        this.driver = driver;
//        homePage = new HomePage(driver);

    }

    public String generateXpathForProductName(String itemName) {

        return "//div[contains(@class, 'inventory_item_name') and contains(text(), '" + itemName + "')]";
    }

    public String generateXpathfordescription(String itemname) {
        return "//div[@class='inventory_item_name' and text()='" + itemname + "']/parent::a/following-sibling::div[@class='inventory_item_desc']";
    }

    public String generateXpathPrice(String itemname) {
        return "//div[@class='inventory_item_name' and text()='" + itemname + "']/parent::a/following-sibling::div[@class='item_pricebar']//div[@class='inventory_item_price']";

    }


    public void checkItem(String itemname) {
//        System.out.println("testing name :" + nameProductOnHomePage);

//product name
        String xPathProductname = generateXpathForProductName(itemname);
        String getProductNameChart = driver.findElement(By.xpath(xPathProductname)).getText();

        //product description
        String xpathDescription = generateXpathfordescription(itemname);
        String getDescriptionChart = driver.findElement(By.xpath(xpathDescription)).getText();

        System.out.println(getDescriptionChart);
//product price
        String xpathforPrice = generateXpathPrice(itemname);
        String getPriceChart = driver.findElement(By.xpath(xpathforPrice)).getText();

        System.out.println(getPriceChart);

        Assertions.assertEquals(getProductNameChart, nameProductOnHomePage);
        Assertions.assertEquals(getDescriptionChart,descrionProductOnHomePage);
        Assertions.assertEquals(getPriceChart,priceOnHomepage);


    }
}
