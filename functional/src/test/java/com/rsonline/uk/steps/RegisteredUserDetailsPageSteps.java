package com.rsonline.uk.steps;

import com.rsonline.uk.pages.RegisteredUserDetailsPage;
import net.thucydides.core.annotations.Step;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.TestComponent;

@TestComponent
public class RegisteredUserDetailsPageSteps extends CommonSteps{

    @Autowired
    RegisteredUserDetailsPage registeredUserDetailsPage;

    /**
     * Nothing to fill as once delivery address is filled it will be saved in customer account.
     */
    @Step
    public void fill_customer_delivery_form() {
        CommonSteps.dismiss_alert_if_present(registeredUserDetailsPage.getDriver());
        registeredUserDetailsPage.getContinueToPayment().waitUntilVisible();
        registeredUserDetailsPage.getContinueToPayment().click();
    }
}
