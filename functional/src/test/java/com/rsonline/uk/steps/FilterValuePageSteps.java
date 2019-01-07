package com.rsonline.uk.steps;

import com.rsonline.uk.pages.FilterValuePage;
import net.serenitybdd.core.pages.WebElementFacade;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.TestComponent;

@TestComponent
public class FilterValuePageSteps extends CommonSteps{

    @Autowired
    FilterValuePage filterValuePage;

    public void apply_filter_by_value(String value){
        CommonSteps.dismiss_alert_if_present(filterValuePage.getDriver());
        CommonSteps.apply_filter_by_value(filterValuePage.getAttributeValues(), value);
    }
}
