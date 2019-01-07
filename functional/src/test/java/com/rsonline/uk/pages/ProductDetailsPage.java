package com.rsonline.uk.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.springframework.boot.test.context.TestComponent;

@TestComponent
public class ProductDetailsPage extends PageObject {

    @FindBy(xpath = "/html/body/div[4]/div/div[2]/div[2]/div[1]/div[2]/div/div[2]/div/div[1]/input")
    private WebElementFacade tbxQuantity;

    @FindBy(css= ".btn-primary-red")
    private WebElementFacade btnAddToBasket;

    @FindBy(xpath= "/html/body/div[4]/div/div[2]/div[2]/div[1]/div[2]/div/div[2]/div/div[4]/button")
    private WebElementFacade btnViewBasket;

    @FindBy(xpath= "/html/body/div[4]/div/div[1]/div[1]/div[3]/ul/li[1]/span[2]")
    private WebElementFacade lblSku;

    public WebElementFacade getTbxQuantity(){
        return tbxQuantity;
    }

    public WebElementFacade getBtnAddToBasket(){
        return btnAddToBasket;
    }

    public WebElementFacade getBtnViewBasket(){
        return btnViewBasket;
    }

    public WebElementFacade getSku(){
        return lblSku;
    }
}
