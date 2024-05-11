package com.HNE.Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    WebDriver driver;

    By detectUsernameField = By.name("user-name");
    By detectPasswordField = By.name("password");
    By detectLoginButton = By.name("login-button");

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

}
