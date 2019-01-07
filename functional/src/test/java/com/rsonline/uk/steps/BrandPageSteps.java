package com.rsonline.uk.steps;

import com.rsonline.uk.pages.BrandPage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.TestComponent;
import static org.assertj.core.api.Assertions.*;

@TestComponent
public class BrandPageSteps {

    @Autowired
    BrandPage brandPage;

    public void select_top_category(){
        assertThat(brandPage.getTopCategory().size()).isGreaterThan(0);
        brandPage.getTopCategory().get(0).click();
    }
}
