package com.rsonline.uk.stepdefinations;

import com.rsonline.uk.steps.*;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.runtime.java.StepDefAnnotation;
import net.thucydides.core.annotations.Steps;

@StepDefAnnotation
public class SearchByBrandStepDef {

    @Steps
    HomePageSteps homePageSteps;

    @Steps
    HeaderSteps headerSteps;

    @Steps
    ResultsPageSteps resultsPageSteps;

    @Steps
    FilterValuePageSteps FilterValuePageSteps;

    @Steps
    BrandPageSteps brandPageSteps;

    private String attribute;

    private String attributeValue;

    @Given("^As a random rs-component guest user$")
    public void asARandomGuestUser() {
        homePageSteps.open_home_page();
    }

    @When("^I search for product by '(.*)'$")
    public void iSearchForAProductByCategory(String category) {
        headerSteps.perform_search(category);
    }

    @And("^add apply a filters with '(.*)' and '(.*)'$")
    public void addCategoryAttributeWithCategoryValue(String attribute, String value) {
        this.attribute = attribute;
        this.attributeValue = value;
        brandPageSteps.select_top_category();
        resultsPageSteps.apply_main_filter(attribute);
        FilterValuePageSteps.apply_filter_by_value(value);
        resultsPageSteps.click_on_apply();
    }

    @Then("^given filter should be applied$")
    public void givenFiltersShouldBeApplied() {
        resultsPageSteps.validate_applied_filters(attribute, attributeValue);
    }
}
