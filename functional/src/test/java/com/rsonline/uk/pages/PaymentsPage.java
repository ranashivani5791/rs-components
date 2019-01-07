package com.rsonline.uk.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.pages.PageObject;
import org.springframework.boot.test.context.TestComponent;

@TestComponent
public class PaymentsPage extends PageObject {

    @FindBy(id = "checkoutSecurelyBtn")
    private WebElementFacade btnCheckout;

    public WebElementFacade getBtnCheckout(){
        return btnCheckout;
    }
}
