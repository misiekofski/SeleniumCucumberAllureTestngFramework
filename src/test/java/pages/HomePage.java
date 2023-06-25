package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends BasePage {
    private WebDriver driver;

    public HomePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(name="q")
    private WebElement searchInput;

    public ResultPage searchFor(String query) {
        searchInput.sendKeys(query);
        searchInput.submit();
        return new ResultPage(driver);
    }

}
