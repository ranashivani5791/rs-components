package com.rsonline.uk.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.Alert;
import org.openqa.selenium.NoAlertPresentException;
import org.springframework.boot.test.context.TestComponent;

import java.util.List;

@TestComponent
public class TrolleyPage extends PageObject {

    @FindBy(css = "table.cartTable tbody tr.dataRow.lineRow td.descriptionTd")
    private WebElementFacade basketItems;

    @FindBy(css = ".cartTable tr.dataRow td.quantityTd input")
    private WebElementFacade basketQty;

    @FindBy(id = "checkoutSecurelyAndPuchBtn")
    private WebElementFacade checkoutSecurely;

    @FindBy(id = "guestCheckoutForm:GuestWidgetAction_emailAddress_decorate:GuestWidgetAction_emailAddress")
    private WebElementFacade tbxGuestEmail;

    @FindBy(id = "loginForm:LoginWidgetAction_username_decorate:LoginWidgetAction_username")
    private WebElementFacade tbxUserEmail;

    @FindBy(id = "loginForm:LoginWidgetAction_password_decorate:LoginWidgetAction_password")
    private WebElementFacade tbxPassword;

    @FindBy(id = "guestCheckoutForm:guestCheckout")
    private WebElementFacade btnGuest;

    @FindBy(id = "loginForm:login")
    private WebElementFacade btnLogin;

    @FindBy(css = "a.acsInviteButton:nth-child(6)")
    private WebElementFacade noThanks;

    public WebElementFacade getCheckoutSecurely() {
        return checkoutSecurely;
    }

    public WebElementFacade getBasketItems() {
        return basketItems;
    }

    public WebElementFacade getBasketQty() {
        return basketQty;
    }

    public WebElementFacade getTbxGuestEmail() {
        return tbxGuestEmail;
    }

    public WebElementFacade getTbxUserEmail() {
        return tbxUserEmail;
    }

    public WebElementFacade getTbxPassword() {
        return tbxPassword;
    }

    public WebElementFacade getBtnGuest() {
        return btnGuest;
    }

    public WebElementFacade getBtnLogin() {
        return btnLogin;
    }

}
