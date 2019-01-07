package com.rsonline.uk.steps;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;
import java.util.stream.Collectors;

class CommonSteps {

    private static final Logger LOGGER = LoggerFactory.getLogger(CommonSteps.class);

    public static void dismiss_alert_if_present(WebDriver driver){
        try {
            WebElement noThanks = driver.findElement(By.ByjQuerySelector.cssSelector("a.acsInviteButton:nth-child(6)"));
            if (null != noThanks && noThanks.isDisplayed()) noThanks.click();
        } catch (Exception e) {
            LOGGER.info("No survey alert present hence doing nothing");
        }
    }

    public static void apply_filter_by_value(List<WebElementFacade> elements, String value){

        elements.stream()
                .filter(webElementFacade -> webElementFacade.getText().trim().contains(value))
                .findFirst()
                .ifPresent(WebElementFacade::click);
    }

    public static List<WebElementFacade> get_applied_filters(List<WebElementFacade> elements, String value){
        return elements.stream()
                .filter(element -> element.getText().contains(value))
                .collect(Collectors.toList());
    }
}
