package com.rsonline.uk.steps;

import com.github.javafaker.Faker;
import com.rsonline.uk.pages.TrolleyPage;
import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.Step;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.TestComponent;

import static org.assertj.core.api.Assertions.assertThat;

@TestComponent
public class TrolleyPageSteps extends CommonSteps{

    @Autowired
    TrolleyPage trolleyPage;

    @Step
    public void validate_and_perform_checkout(String name){
        trolleyPage.getCheckoutSecurely().waitUntilVisible();
        CommonSteps.dismiss_alert_if_present(trolleyPage.getDriver());
        WebElementFacade basketItem = trolleyPage.getBasketItems();
        WebElementFacade nameDescription = basketItem.findBy(By.className("link2"));
        assertThat(nameDescription.getText()).containsSequence(name);
        trolleyPage.getCheckoutSecurely().click();
    }

    @Step
    public void validate_sku_and_perform_checkout(String productId){
        trolleyPage.getCheckoutSecurely().waitUntilVisible();
        CommonSteps.dismiss_alert_if_present(trolleyPage.getDriver());
        WebElementFacade basketItem = trolleyPage.getBasketItems();
        WebElementFacade textTitle = basketItem.findBy(By.className("textTitle"));
        assertThat(textTitle.getText()).containsSequence(productId);
        trolleyPage.getCheckoutSecurely().click();
    }

    @Step
    public void continue_as_registered_user(String user, String password){
        trolleyPage.getTbxUserEmail().waitUntilEnabled();
        trolleyPage.getTbxUserEmail().clear();
        trolleyPage.getTbxUserEmail().sendKeys(user);
        trolleyPage.getTbxPassword().sendKeys(password);
        trolleyPage.getBtnLogin().click();
    }

    @Step
    public void continue_as_guest(){
        Faker faker = new Faker();
        trolleyPage.getTbxGuestEmail().waitUntilEnabled();
        trolleyPage.getTbxGuestEmail().clear();
        trolleyPage.getTbxGuestEmail().sendKeys(faker.internet().emailAddress());
        trolleyPage.getBtnGuest().click();
    }

}
