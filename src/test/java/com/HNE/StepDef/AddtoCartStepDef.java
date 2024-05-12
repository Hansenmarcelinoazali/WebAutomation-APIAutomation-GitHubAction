package com.HNE.StepDef;

import com.HNE.BaseTest;
import com.HNE.Page.AddtoCart;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

import java.time.Duration;

public class AddtoCartStepDef extends BaseTest {
    AddtoCart addtoCart;

    @Given("user is on home page automation exercise")
    public void userIsOnHomePageAutomationExercise() {
        this.addtoCart =new AddtoCart(driver);
        addtoCart.GotoLoginAddCart();
    }


    @And("the user clicks view product on the first product")
    public void theUserClicksViewProductOnTheFirstProduct() {
        addtoCart.clickviewproduct();
    }

    @And("user click quantity and input {string}")
    public void userClickQuantityAndInput(String quantity) {
        addtoCart.inputQuantity(quantity);
    }

    @And("user click button add to cart")
    public void userClickButtonAddToCart() {
        addtoCart.ClickAddtoCart();

    }

    @Then("user cannot add to cart")
    public void userCannotAddToCart() {
        addtoCart.Popup();

    }
}
