package com.rsonline.uk.steps;

import com.rsonline.uk.pages.HeaderComponentsPage;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.Step;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.TestComponent;

@TestComponent
public class HeaderSteps extends CommonSteps{

    @Autowired
    HeaderComponentsPage headerComponentsPage;

    /**
     * This method is to perform search
     */

    @Step
    public void perform_search(String value) {
        CommonSteps.dismiss_alert_if_present(headerComponentsPage.getDriver());
        WebElementFacade tbSearch = headerComponentsPage.getTbxSearch();
        tbSearch.clear();
        tbSearch.sendKeys(value);
        headerComponentsPage.getBtnSearch().click();
    }

    /**
     * This method is clicking on basket
     */

    @Step
    public void go_to_basket() {
        headerComponentsPage.getBasket().click();
    }
}
