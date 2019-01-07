package com.rsonline.uk.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.pages.PageObject;
import org.springframework.boot.test.context.TestComponent;

@TestComponent
public class HeaderComponentsPage extends PageObject {

    @FindBy(id = "searchTerm")
    private WebElementFacade tbxSearch;

    @FindBy(id = "btnSearch")
    private WebElementFacade btnSearch;

    @FindBy(css = "i.icon-cart")
    private WebElementFacade basket;

    public WebElementFacade getTbxSearch(){
        return tbxSearch;
    }

    public WebElementFacade getBtnSearch(){
        return btnSearch;
    }

    public WebElementFacade getBasket(){
        return basket;
    }
}
