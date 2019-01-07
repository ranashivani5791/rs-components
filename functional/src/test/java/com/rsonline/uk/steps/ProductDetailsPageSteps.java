package com.rsonline.uk.steps;

import com.rsonline.uk.pages.ProductDetailsPage;
import net.thucydides.core.annotations.Step;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.TestComponent;
import static org.assertj.core.api.Assertions.*;

@TestComponent
public class ProductDetailsPageSteps extends CommonSteps{

    @Autowired
    ProductDetailsPage productDetailsPage;

    /**
     * This method is used to perform validation on product details page
     */
    @Step
    public void perform_validations_and_add_to_basket(String productId){
        CommonSteps.dismiss_alert_if_present(productDetailsPage.getDriver());
        productDetailsPage.getSku().waitUntilVisible();
        assertThat(productDetailsPage.getSku().getText()).containsSequence(productId);
        productDetailsPage.getBtnAddToBasket().click();
        productDetailsPage.getBtnViewBasket().waitUntilVisible();
        productDetailsPage.getBtnViewBasket().click();
    }
}
