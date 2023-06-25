package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class ResultPage extends BasePage {

    public ResultPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = "h2")
    List<WebElement> headers;

    public List<String> getHeadersText() {
        return headers
                .stream()
                .map(WebElement::getText)
                .toList();
    }
}
