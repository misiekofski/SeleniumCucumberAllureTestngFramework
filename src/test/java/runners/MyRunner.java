package runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.Test;

@Test
@CucumberOptions(
        features = "src/test/features",
        plugin = {
                "io.qameta.allure.cucumber5jvm.AllureCucumber5Jvm",
                "progress",
                "summary"
        },
        glue = "stepdefinitions"
)
public class MyRunner extends AbstractTestNGCucumberTests {
}