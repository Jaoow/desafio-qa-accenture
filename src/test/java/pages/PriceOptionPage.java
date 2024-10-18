package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.ActionsUtil;

import java.time.Duration;

public class PriceOptionPage {
    WebDriver driver;

    public PriceOptionPage(WebDriver driver) {
        this.driver = driver;
    }

    // Localizadores
    By selectGold = By.id("selectgold");
    By nextButtonQuote = By.id("nextsendquote");

    public void selectGoldOption() {
        ActionsUtil.clickElement(driver, selectGold);
    }

    public void clickNext() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement nextButton = wait.until(ExpectedConditions.elementToBeClickable(nextButtonQuote));
        nextButton.click();
    }
}
