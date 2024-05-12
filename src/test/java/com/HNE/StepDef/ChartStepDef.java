package com.HNE.StepDef;

import com.HNE.BaseTest;
import com.HNE.Page.ChartPage;
import io.cucumber.java.en.Then;

public class ChartStepDef extends BaseTest {

    ChartPage chartPage;

    @Then("user see the product which was recently added {string}")
    public void userSeeTheProductWhichWasRecentlyAdded(String itemname) {

        this.chartPage = new ChartPage(driver);
        chartPage.checkItem(itemname);

    }
}
