package com.HNE.Page;

import com.HNE.Page.HomePage;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ChartPage {
    WebDriver driver;
    HomePage homePage;

    public ChartPage(WebDriver driver) {
        this.driver = driver;
    }



    public String generateXpathForProductName(String itemName) {

        HomePage homePage = new HomePage(driver);
        return "//div[contains(@class, 'inventory_item_name') and contains(text(), '" + itemName + "')]";
    }

//    public void penampung(String nameprod, String descpr, String price){
//        String xPathProductName = generateXpathForProductName(nameprod);
//        WebElement getItemnameChart = driver.findElement(By.xpath(xPathProductName));
//        String finalItemname = getItemnameChart.getText();
//        System.out.println("check "+nameprod);
//
//
//    }



    public void checkItem(String itemname) {
//        String xPathProductName = generateXpathForProductName(itemname);
//        WebElement getItemnameChart = driver.findElement(By.xpath(xPathProductName));
//        String finalItemname = getItemnameChart.getText();
//        Assertions.assertEquals(finalItemname,homePage.nameProductOnHomePage);
       String test =  homePage.nameProductOnHomePage;
        System.out.println(test);

    }
}
