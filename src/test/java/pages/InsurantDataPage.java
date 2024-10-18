package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import utils.ActionsUtil;

public class InsurantDataPage {
    WebDriver driver;

    public InsurantDataPage(WebDriver driver) {
        this.driver = driver;
    }

    // Localizadores
    By firstName = By.id("firstname");
    By lastName = By.id("lastname");
    By birthDate = By.id("birthdate");
    By genderMale = By.id("gendermale");
    By streetAddress = By.id("streetaddress");
    By countryDropdown = By.id("country");
    By zipCode = By.id("zipcode");
    By city = By.id("city");
    By occupationDropdown = By.id("occupation");
    By hobbiesSpeeding = By.id("speeding");
    By website = By.id("website");
    By picture = By.id("picturecontainer");
    By nextButton = By.id("nextenterproductdata");

    public void enterFirstName(String firstNameValue) {
        driver.findElement(firstName).sendKeys(firstNameValue);
    }

    public void enterLastName(String lastNameValue) {
        driver.findElement(lastName).sendKeys(lastNameValue);
    }

    public void enterBirthDate(String birthDateValue) {
        driver.findElement(birthDate).sendKeys(birthDateValue);
    }

    public void selectGenderMale() {
        Actions actions = new Actions(driver);
        WebElement genderMaleRadio = driver.findElement(genderMale);
        actions.moveToElement(genderMaleRadio).click().perform();
    }

    public void enterStreetAddress(String streetAddressValue) {
        driver.findElement(streetAddress).sendKeys(streetAddressValue);
    }

    public void selectCountry(String country) {
        new Select(driver.findElement(countryDropdown)).selectByVisibleText(country);
    }

    public void enterZipCode(String zipCodeValue) {
        driver.findElement(zipCode).sendKeys(zipCodeValue);
    }

    public void enterCity(String cityValue) {
        driver.findElement(city).sendKeys(cityValue);
    }

    public void selectOccupation(String occupation) {
        new Select(driver.findElement(occupationDropdown)).selectByVisibleText(occupation);
    }

    public void selectHobbySpeeding() {
        ActionsUtil.clickElement(driver, hobbiesSpeeding);
    }

    public void enterWebsite(String websiteValue) {
        driver.findElement(website).sendKeys(websiteValue);
    }

    public void uploadPicture(String picturePath) {
        driver.findElement(picture).sendKeys(picturePath);
    }

    public void clickNext() {
        driver.findElement(nextButton).click();
    }
}
