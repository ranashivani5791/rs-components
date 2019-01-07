package com.rsonline.uk.steps;

import com.rsonline.uk.pages.PaymentsPage;
import net.thucydides.core.annotations.Step;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.TestComponent;

@TestComponent
public class PaymentsPageSteps extends CommonSteps{

    @Autowired
    PaymentsPage paymentsPage;

    @Step
    public void validate_payments_page() {
        paymentsPage.getBtnCheckout().waitUntilVisible();
    }
}
