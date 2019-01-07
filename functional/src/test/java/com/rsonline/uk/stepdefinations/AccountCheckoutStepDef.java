package com.rsonline.uk.stepdefinations;

import com.rsonline.uk.steps.*;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.runtime.java.StepDefAnnotation;
import net.thucydides.core.annotations.Steps;

@StepDefAnnotation
public class AccountCheckoutStepDef{

    @Steps
    HomePageSteps homePageSteps;

    @Steps
    HeaderSteps headerSteps;

    @Steps
    ProductDetailsPageSteps productDetailsPageSteps;

    @Steps
    TrolleyPageSteps trolleyPageSteps;

    @Steps
    RegisteredUserDetailsPageSteps registeredUserDetailsPageSteps;

    @Steps
    PaymentsPageSteps paymentsPageSteps;

    private String productId;

    @Given("^As a registered user$")
    public void asARegisteredUser() {
        homePageSteps.open_home_page();
    }

    @When("^I will search the product by '(.*)'$")
    public void iWillSearchTheProductByName(String sku) {
        this.productId = sku;
        headerSteps.perform_search(sku);
    }

    @And("^add them to the basket$")
    public void addThemToTheBasket() {
        productDetailsPageSteps.perform_validations_and_add_to_basket(productId);
    }

    @And("^will perform the checkout as registered user with '(.*)' and '(.*)'$")
    public void willPerformTheCheckoutAsRegisteredUser(String username, String password) {
        trolleyPageSteps.validate_sku_and_perform_checkout(productId);
        trolleyPageSteps.continue_as_registered_user(username, password);
        registeredUserDetailsPageSteps.fill_customer_delivery_form();
    }

    @Then("^I will be presented with options to pay$")
    public void iWillBePresentedWithOptionsToPay() {
    }
}
