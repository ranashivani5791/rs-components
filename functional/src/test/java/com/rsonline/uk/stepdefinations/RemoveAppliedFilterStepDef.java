package com.rsonline.uk.stepdefinations;

import com.rsonline.uk.steps.FilterValuePageSteps;
import com.rsonline.uk.steps.HeaderSteps;
import com.rsonline.uk.steps.HomePageSteps;
import com.rsonline.uk.steps.ResultsPageSteps;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.runtime.java.StepDefAnnotation;
import net.thucydides.core.annotations.Steps;

@StepDefAnnotation
public class RemoveAppliedFilterStepDef {

    @Steps
    HomePageSteps homePageSteps;

    @Steps
    HeaderSteps headerSteps;

    @Steps
    ResultsPageSteps resultsPageSteps;

    @Steps
    FilterValuePageSteps FilterValuePageSteps;

    private String attribute;

    private String attributeValue;

    @Given("^As a user for for given '(.*)'$")
    public void asARandomGuestUser(String category) {
        homePageSteps.open_home_page();
        headerSteps.perform_search(category);
    }

    @And("^applied '(.*)' with '(.*)'$")
    public void iSearchForAProductByCategory(String category, String value) {
        this.attribute = category;
        this.attributeValue = value;
        resultsPageSteps.apply_main_filter(attribute);
        FilterValuePageSteps.apply_filter_by_value(value);
        resultsPageSteps.click_on_apply();
        resultsPageSteps.validate_applied_filters(attribute, attributeValue);
    }

    @When("^I want to remove applied filters$")
    public void addCategoryAttributeWithCategoryValue() {
        resultsPageSteps.click_on_remove_all_filters();
    }

    @Then("^applied filters should get removed$")
    public void givenFiltersShouldBeApplied() {
        resultsPageSteps.validate_no_filters(attribute, attributeValue);
    }
}
