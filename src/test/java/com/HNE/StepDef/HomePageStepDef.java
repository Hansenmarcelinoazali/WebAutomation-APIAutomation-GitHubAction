package com.HNE.StepDef;

import com.HNE.BaseTest;
import com.HNE.Page.HomePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class HomePageStepDef extends BaseTest {
    HomePage homePage;

    @Then("user is on homepage and see product {string}")
    public void userIsOnHomepageAndSeeProduct(String productNameHomepage) {
        this.homePage = new HomePage(driver);

        homePage.ValisasiHomePageDisplayed();
        homePage.GetDataOnHomePage(productNameHomepage);

//        homePage.setNameProductOnHomePage(productNameHomepage);
//        homePage.setDescrionProductOnHomePage(productNameHomepage);
//        homePage.setPriceOnHomepage(productNameHomepage);

    }

    @And("user click add to cart button for {string}")
    public void userClickAddToCartButtonFor(String itemname) {

        homePage.ClickButtonAddtoChart(itemname);
    }


    @Then("chart button should display {string}")
    public void chartButtonShoudDisplay(String valueChartExpec) {
        homePage.ChartButtonValue(valueChartExpec);
    }

    @And("user clik cart button")
    public void userClikCartButton() {
        homePage.clickChart();

    }
}
