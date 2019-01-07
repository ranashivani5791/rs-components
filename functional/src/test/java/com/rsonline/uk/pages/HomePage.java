package com.rsonline.uk.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.WhenPageOpens;
import net.thucydides.core.pages.PageObject;
import org.springframework.boot.test.context.TestComponent;

@TestComponent
public class HomePage extends PageObject {

    @FindBy(id = "js-cookie-accept")
    private WebElementFacade acceptCookie;

    @WhenPageOpens
    public void maximize(){
        this.getDriver().manage().window().maximize();
        acceptCookie.click();
    }
}
