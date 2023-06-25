package runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.Test;

@Test
@CucumberOptions(
        features = "src/test/resources/features",
        plugin = {
                "io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm",
                "progress",
                "summary"
        },
        glue = "stepdefinitions"
)
public class MyRunnerTest extends AbstractTestNGCucumberTests {
}