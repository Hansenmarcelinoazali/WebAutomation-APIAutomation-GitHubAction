package com.HNE.StepDef;

import com.HNE.BaseTest;
import com.HNE.Page.LoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import org.openqa.selenium.WebDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LoginPageStepDef extends BaseTest {
    private static final Logger log = LoggerFactory.getLogger(LoginPageStepDef.class);
    LoginPage loginPage;

    @Given("user is on login page")
    public void userIsOnLoginPage() {

        loginPage = new LoginPage(driver);
        loginPage.GotoLoginPage();

    }


    @And("user insert valid username with {string}")
    public void userInsertValidUsernameWith(String inputUsername) {

        loginPage.InsertValidUsername(inputUsername);

    }

    @And("user insert valid password with {string}")
    public void userInsertValidPasswordWith(String inputPassword) {
        loginPage.InsertPassword(inputPassword);
    }

    @And("user click login button")
    public void userClickLoginButton() {
        loginPage.LoginButton();
    }
}
