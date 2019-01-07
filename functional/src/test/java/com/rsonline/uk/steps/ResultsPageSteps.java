package com.rsonline.uk.steps;

import com.rsonline.uk.pages.ResultsPage;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.Step;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.TestComponent;

import java.util.List;
import java.util.stream.Collectors;

import static org.assertj.core.api.Assertions.assertThat;

@TestComponent
public class ResultsPageSteps extends CommonSteps {

    @Autowired
    ResultsPage resultsPage;

    @Step
    public void add_item_to_cart() {
        resultsPage.getBtnAddItem().waitUntilClickable();
        resultsPage.getBtnAddItem().click();
        resultsPage.getAddedToCart().waitUntilPresent();
    }

    @Step
    public void apply_main_filter(String attribute){
        CommonSteps.dismiss_alert_if_present(resultsPage.getDriver());
        CommonSteps.apply_filter_by_value(resultsPage.getFilterAttributes(), attribute);
    }

    @Step
    public void click_on_apply(){
        resultsPage.getBtnApplyFilter().click();
    }

    @Step
    public void click_on_remove_all_filters(){
        resultsPage.getRemoveAll().waitUntilVisible();
        resultsPage.getRemoveAll().click();
    }

    @Step
    public void validate_applied_filters(String attribute, String value){

        resultsPage.getAppliedFilters().waitUntilVisible();

        List<WebElementFacade> filter = CommonSteps.get_applied_filters(resultsPage.getAppliedFilter(), attribute);

        assertThat(filter.size()).isGreaterThan(0);

        List<WebElementFacade> attributes = CommonSteps.get_applied_filters(resultsPage.getAppliedAttribute(), value);

        assertThat(attributes.size()).isGreaterThan(0);
    }

    @Step
    public void validate_no_filters(String attribute, String value){

        resultsPage.getAppliedFilters().waitUntilNotVisible();

        List<WebElementFacade> filter = CommonSteps.get_applied_filters(resultsPage.getAppliedFilter(), attribute);

        assertThat(filter.size()).isEqualTo(0);

        List<WebElementFacade> attributes = CommonSteps.get_applied_filters(resultsPage.getAppliedAttribute(), value);

        assertThat(attributes.size()).isEqualTo(0);
    }
}
