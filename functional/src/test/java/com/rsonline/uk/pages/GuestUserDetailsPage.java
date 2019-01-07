package com.rsonline.uk.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.pages.PageObject;
import org.springframework.boot.test.context.TestComponent;

@TestComponent
public class GuestUserDetailsPage extends PageObject {

    @FindBy(css = ".title")
    private WebElementFacade customerTitle;

    @FindBy(id = "deliveryCollectionForm:CustomerContactDetailsWidgetAction_firstName_decorate:CustomerContactDetailsWidgetAction_firstName")
    private WebElementFacade firstName;

    @FindBy(id = "deliveryCollectionForm:CustomerContactDetailsWidgetAction_surName_decorate:CustomerContactDetailsWidgetAction_surName")
    private WebElementFacade surName;

    @FindBy(id = "deliveryCollectionForm:CustomerContactDetailsWidgetAction_contactNumber_decorate:CustomerContactDetailsWidgetAction_contactNumber")
    private WebElementFacade contactNumber;

    @FindBy(id = "deliveryCollectionForm:GuestDeliveryAddressWidgetAction_companyNameOne_decorate:GuestDeliveryAddressWidgetAction_companyNameOne")
    private WebElementFacade companyName;

    @FindBy(id = "deliveryCollectionForm:GuestDeliveryAddressWidgetAction_addressLineOne_decorate:GuestDeliveryAddressWidgetAction_addressLineOne")
    private WebElementFacade addressLine1;

    @FindBy(id = "deliveryCollectionForm:GuestDeliveryAddressWidgetAction_addressLineThree_decorate:GuestDeliveryAddressWidgetAction_addressLineThree")
    private WebElementFacade town;

    @FindBy(id = "deliveryCollectionForm:GuestDeliveryAddressWidgetAction_postCode_decorate:GuestDeliveryAddressWidgetAction_postCode")
    private WebElementFacade postCode;

    @FindBy(id = "checkoutSecurelyBtn")
    private WebElementFacade continueToPayment;

    public WebElementFacade getCustomerTitle(){
        return customerTitle;
    }

    public WebElementFacade getCustomerFirstName(){
        return firstName;
    }

    public WebElementFacade getCustomerLastName(){
        return surName;
    }

    public WebElementFacade getCustomerContactNumber(){
        return contactNumber;
    }

    public WebElementFacade getCustomerCompanyName(){
        return companyName;
    }

    public WebElementFacade getCustomerAddressLine(){
        return addressLine1;
    }

    public WebElementFacade getCustomerTown(){
        return town;
    }

    public WebElementFacade getCustomerPostCode(){
        return postCode;
    }

    public WebElementFacade getContinueToPayment(){
        return continueToPayment;
    }
}
