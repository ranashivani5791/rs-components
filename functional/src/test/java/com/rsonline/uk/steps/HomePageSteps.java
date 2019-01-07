package com.rsonline.uk.steps;

import com.rsonline.uk.pages.HomePage;
import net.thucydides.core.annotations.Step;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.TestComponent;

@TestComponent
public class HomePageSteps extends CommonSteps{

    @Autowired
    HomePage homePage;

    @Step
    public void open_home_page() {
        homePage.open();
    }

}
