package com.rsonline.uk.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.pages.PageObject;
import org.springframework.boot.test.context.TestComponent;

import java.util.List;

@TestComponent
public class BrandPage extends PageObject {

    @FindBy(xpath = "/html/body/div[3]/section/div[3]/div/div[1]/aside/section/div[1]/div/ul/li[2]")
    private List<WebElementFacade> topCategory;

    public List<WebElementFacade> getTopCategory(){
        return topCategory;
    }
}
