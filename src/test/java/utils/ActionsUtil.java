package utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class ActionsUtil {

    public static void clickElement(WebDriver driver, By locator) {
        Actions actions = new Actions(driver);
        WebElement rightHandDriveYesRadio = driver.findElement(locator);
        actions.moveToElement(rightHandDriveYesRadio).click().perform();
    }
}
