package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class SendQuotePage {
    WebDriver driver;

    public SendQuotePage(WebDriver driver) {
        this.driver = driver;
    }

    // Localizadores
    By emailField = By.id("email");
    By phoneField = By.id("phone");
    By usernameField = By.id("username");
    By passwordField = By.id("password");
    By confirmPasswordField = By.id("confirmpassword");
    By commentsField = By.id("Comments");
    By sendEmailButton = By.id("sendemail");
    By prevButton = By.id("prevselectpriceoption");

    public void enterEmail(String email) {
        driver.findElement(emailField).sendKeys(email);
    }

    public void enterPhone(String phone) {
        driver.findElement(phoneField).sendKeys(phone);
    }

    public void enterUsername(String username) {
        driver.findElement(usernameField).sendKeys(username);
    }

    public void enterPassword(String password) {
        driver.findElement(passwordField).sendKeys(password);
    }

    public void enterConfirmPassword(String confirmPassword) {
        driver.findElement(confirmPasswordField).sendKeys(confirmPassword);
    }

    public void enterComments(String comments) {
        driver.findElement(commentsField).sendKeys(comments);
    }

    public void clickSendEmail() {
        driver.findElement(sendEmailButton).click();
    }

}
