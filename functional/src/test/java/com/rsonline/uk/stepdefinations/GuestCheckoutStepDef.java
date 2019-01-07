package com.rsonline.uk.stepdefinations;

import com.rsonline.uk.steps.*;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.runtime.java.StepDefAnnotation;
import net.thucydides.core.annotations.Steps;

@StepDefAnnotation
public class GuestCheckoutStepDef {

    @Steps
    HomePageSteps homePageSteps;

    @Steps
    HeaderSteps headerSteps;

    @Steps
    ResultsPageSteps resultsPageSteps;

    @Steps
    TrolleyPageSteps trolleyPageSteps;

    @Steps
    PaymentsPageSteps paymentsPageSteps;

    @Steps
    GuestDetailsPageSteps guestDetailsPageSteps;

    private String name;

    @Given("^As a guest user$")
    public void asACustomer(){
        homePageSteps.open_home_page();
    }

    @When("^I will search the required product by '(.*)'$")
    public void iWantToBuyABookFromAmazon(String name) {
        this.name = name;
        headerSteps.perform_search(name);
    }

    @And("^add it to the basket$")
    public void addItToTheBasket() {
        resultsPageSteps.add_item_to_cart();
    }

    @And("^will perform the checkout as random guest$")
    public void willPerformTheCheckoutByProvidingGuest() {
        headerSteps.go_to_basket();
        trolleyPageSteps.validate_and_perform_checkout(name);
        trolleyPageSteps.continue_as_guest();
        guestDetailsPageSteps.fill_guest_details();
    }

    @Then("^I should be presented with options to pay$")
    public void iShouldBeAbleToNavigateToPaymentsPage() {
        paymentsPageSteps.validate_payments_page();
    }
}
