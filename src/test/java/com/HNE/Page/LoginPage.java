package com.HNE.Page;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
    WebDriver driver;

    By detectUsernameField = By.name("user-name");
    By detectPasswordField = By.name("password");
    By detectLoginButton = By.name("login-button");

    By errorCauseInvalid = By.xpath("//*[@id=\"login_button_container\"]/div/form/div[3]/h3");

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public void GotoLoginPage() {
        driver.get("https://www.saucedemo.com/");
    }

    public void InsertValidUsername(String inputUsername) {
        driver.findElement(detectUsernameField).sendKeys(inputUsername);
    }

    public void InsertPassword(String password){
        driver.findElement(detectPasswordField).sendKeys(password);
    }

    public void LoginButton(){
        driver.findElement(detectLoginButton).click();
    }

    public void ErrorinvalidLogin(String Message){
WebElement getError = driver.findElement(errorCauseInvalid);
String Result = getError.getText();
        Assertions.assertEquals(Message,Result);
    }

}
