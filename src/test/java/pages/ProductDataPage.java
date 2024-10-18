package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import utils.ActionsUtil;

public class ProductDataPage {
    WebDriver driver;

    public ProductDataPage(WebDriver driver) {
        this.driver = driver;
    }

    // Localizadores
    By startDate = By.id("startdate");
    By insuranceSumDropdown = By.id("insurancesum");
    By meritRatingDropdown = By.id("meritrating");
    By damageInsuranceDropdown = By.id("damageinsurance");
    By optionalEuroProtection = By.id("EuroProtection");
    By optionalLegalDefense = By.id("LegalDefenseInsurance");
    By courtesyCarDropdown = By.id("courtesycar");
    By nextButton = By.id("nextselectpriceoption");

    public void enterStartDate(String startDateValue) {
        driver.findElement(startDate).sendKeys(startDateValue);
    }

    public void selectInsuranceSum(String insuranceSum) {
        new Select(driver.findElement(insuranceSumDropdown)).selectByVisibleText(insuranceSum);
    }

    public void selectMeritRating(String meritRating) {
        new Select(driver.findElement(meritRatingDropdown)).selectByVisibleText(meritRating);
    }

    public void selectDamageInsurance(String damageInsurance) {
        new Select(driver.findElement(damageInsuranceDropdown)).selectByVisibleText(damageInsurance);
    }

    public void selectOptionalEuroProtection() {
        ActionsUtil.clickElement(driver, optionalEuroProtection);
    }

    public void selectOptionalLegalDefenseInsurance() {
        ActionsUtil.clickElement(driver, optionalLegalDefense);
    }

    public void selectCourtesyCar(String option) {
        new Select(driver.findElement(courtesyCarDropdown)).selectByVisibleText(option);
    }

    public void clickNext() {
        driver.findElement(nextButton).click();
    }
}
