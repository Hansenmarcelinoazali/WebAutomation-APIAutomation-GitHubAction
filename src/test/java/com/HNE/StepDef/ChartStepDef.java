package com.HNE.StepDef;

import com.HNE.BaseTest;
import com.HNE.Page.ChartPage;
import com.HNE.Page.HomePage;
import io.cucumber.java.en.Then;

public class ChartStepDef extends BaseTest {

    ChartPage chartPage;
//    HomePage homePage;

    @Then("user see the product which was recently added {string}")
    public void userSeeTheProductWhichWasRecentlyAdded(String itemname) {

        chartPage = new ChartPage(driver);
        chartPage.checkItem(itemname);

    }
}
