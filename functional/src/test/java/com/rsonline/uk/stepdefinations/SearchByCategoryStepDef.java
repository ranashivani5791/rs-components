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
public class SearchByCategoryStepDef {

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

    @Given("^As a random guest user$")
    public void asARandomGuestUser() {
        homePageSteps.open_home_page();
    }

    @When("^I search for a product by '(.*)'$")
    public void iSearchForAProductByCategory(String category) {
        headerSteps.perform_search(category);
    }

    @And("^add apply filters with '(.*)' and '(.*)'$")
    public void addCategoryAttributeWithCategoryValue(String attribute, String value) {
        this.attribute = attribute;
        this.attributeValue = value;
        resultsPageSteps.apply_main_filter(attribute);
        FilterValuePageSteps.apply_filter_by_value(value);
        resultsPageSteps.click_on_apply();
    }

    @Then("^given filters should be applied$")
    public void givenFiltersShouldBeApplied() {
        resultsPageSteps.validate_applied_filters(attribute, attributeValue);
    }
}
