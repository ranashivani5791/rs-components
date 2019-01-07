package com.rsonline.uk.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.pages.PageObject;
import org.springframework.boot.test.context.TestComponent;

import java.util.List;

@TestComponent
public class FilterValuePage extends PageObject {

    @FindBy(css = "div.popover div.checkbox label span[ng-class]")
    List<WebElementFacade> attributeValues;

    public List<WebElementFacade> getAttributeValues(){
        return attributeValues;
    }
}
