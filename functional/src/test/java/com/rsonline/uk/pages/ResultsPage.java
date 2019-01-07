package com.rsonline.uk.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.pages.PageObject;
import org.springframework.boot.test.context.TestComponent;

import java.util.List;

@TestComponent
public class ResultsPage extends PageObject {

    @FindBy(id = "atbBtn-1")
    private WebElementFacade btnAddItem;

    @FindBy(css = ".addToBasketMessage .addToBasketMessageCart")
    private WebElementFacade addedToCart;

    @FindBy(css = "div.filter-container a")
    private List<WebElementFacade> filterAttributes;

    @FindBy(css = "div.popover rs-apply-button button")
    private WebElementFacade btnApplyFilter;

    @FindBy(className = "appliedFilters")
    private WebElementFacade appliedFilters;

    @FindBy(className = "appliedFilter")
    private List<WebElementFacade> appliedFilter;

    public List<WebElementFacade> getAppliedFilter(){
        return appliedFilter;
    }

    @FindBy(className = "appliedAttribute")
    private List<WebElementFacade> appliedAttribute;

    @FindBy(linkText = "Remove all")
    private WebElementFacade removeAll;

    public WebElementFacade getRemoveAll(){
        return removeAll;
    }

    public List<WebElementFacade> getAppliedAttribute(){
        return appliedAttribute;
    }

    public WebElementFacade getAppliedFilters(){
        return appliedFilters;
    }

    public WebElementFacade getBtnAddItem(){
        return btnAddItem;
    }

    public WebElementFacade getAddedToCart(){
        return addedToCart;
    }

    public List<WebElementFacade> getFilterAttributes(){
        return filterAttributes;
    }

    public WebElementFacade getBtnApplyFilter(){
        return btnApplyFilter;
    }

}
