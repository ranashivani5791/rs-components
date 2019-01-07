package com.rsonline.uk.steps;

import com.github.javafaker.Faker;
import com.rsonline.uk.pages.GuestUserDetailsPage;
import net.thucydides.core.annotations.Step;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.TestComponent;

import java.util.Locale;

@TestComponent
public class GuestDetailsPageSteps extends CommonSteps{

    @Autowired
    GuestUserDetailsPage guestUserDetailsPage;

    /**
     * This method is filling guest details using faker library
     */
    @Step
    public void fill_guest_details() {
        Faker faker = new Faker(new Locale("en-GB"));
        CommonSteps.dismiss_alert_if_present(guestUserDetailsPage.getDriver());
        guestUserDetailsPage.getContinueToPayment().waitUntilVisible();
        guestUserDetailsPage.getCustomerTitle().selectByValue("2");
        guestUserDetailsPage.getCustomerFirstName().sendKeys(faker.name().firstName());
        guestUserDetailsPage.getCustomerLastName().sendKeys(faker.name().lastName());
        guestUserDetailsPage.getCustomerContactNumber().sendKeys(faker.phoneNumber().cellPhone());;
        guestUserDetailsPage.getCustomerCompanyName().sendKeys(faker.company().name());
        guestUserDetailsPage.getCustomerAddressLine().sendKeys(faker.address().buildingNumber());
        guestUserDetailsPage.getCustomerTown().sendKeys(faker.address().city());
        guestUserDetailsPage.getCustomerPostCode().sendKeys(faker.address().zipCode());
        guestUserDetailsPage.getContinueToPayment().click();
    }
}
