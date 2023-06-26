package stepdefinitions;

import io.cucumber.java.After;
import io.cucumber.java.ParameterType;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.qameta.allure.Allure;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import pages.HomePage;
import pages.ResultPage;

import java.io.ByteArrayInputStream;
import java.time.Duration;
import java.util.List;

import static org.testng.Assert.fail;
import static org.assertj.core.api.Assertions.*;


public class BingSteps {
    WebDriver driver;

    @Given("User is on bing.com webpage")
    public void userIsOnBingComWebpage() {
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--headless");

        driver = new ChromeDriver(chromeOptions);

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.manage().window().maximize();
        driver.get("https://www.bing.com");
    }

    @When("User searches for {string}")
    public void userSearchesFor(String arg0) {
        HomePage homePage = new HomePage(driver);
        homePage.searchFor(arg0);
    }

    @Then("First three results contains {string}")
    public void firstThreeResultsContains(String arg0) {
        ResultPage resultPage = new ResultPage(driver);
        List<String> headers = resultPage.getHeadersText();
        assertThat(headers).hasSizeGreaterThan(1);
    }

    @Then("number {int} is less than {int}")
    public void numberIsLessThan(int arg0, int arg1) {
        assertThat(arg0).isLessThan(arg1);
    }


    @Then("I want to fail my test")
    public void iWantToFailMyTest() {
        fail();
    }

    @After
    public void doScreenshotOnFail(Scenario scenario) {
        if (scenario.isFailed()) {
            byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
            // do screenshot
            Allure.addAttachment("Failed screenshot", new ByteArrayInputStream(screenshot));
        }


        driver.quit();
    }
}
