package com.HNE.StepDef;

import com.HNE.BaseTest;
import com.HNE.Page.OptionPage;
import io.cucumber.java.en.And;
import org.openqa.selenium.WebDriver;

public class OptionStepDef extends BaseTest {
    OptionPage optionPage;

    @And("user click option button")
    public void userClickOptionButton() {
        this.optionPage = new OptionPage(driver);

        optionPage.OptionMenu();


    }

    @And("user click logout button")
    public void userClickLogoutButton()throws InterruptedException {
        optionPage.ClickLogout();
    }
}
