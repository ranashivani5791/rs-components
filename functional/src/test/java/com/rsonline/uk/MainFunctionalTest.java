package com.rsonline.uk;

import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;

@EnableAutoConfiguration
@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        plugin = {"pretty",
                "html:target/cucumber",
                "json:target/cucumber/cucumber.json"},
        features="src/test/resources/features",
        tags = "not @avoid")
public class MainFunctionalTest {}
