package com.debarnab.cucumber;//package com.debarnab.cucumber;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src//test//resources//features"
        , glue = {"com.debarnab.cucumber.testSteps"}
        , format = {"pretty", "html:target/site/billing/cucumber-pretty.html", "json:target/cucumber.json"}
        //, tags = {"@billing"}
)
public class AllExecution {
}
