package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import utils.ActionsUtil;

public class VehicleDataPage {
    WebDriver driver;

    public VehicleDataPage(WebDriver driver) {
        this.driver = driver;
    }

    By makeDropdown = By.id("make");
    By modelDropdown = By.id("model");
    By cylinderCapacity = By.id("cylindercapacity");
    By enginePerformance = By.id("engineperformance");
    By dateOfManufacture = By.id("dateofmanufacture");
    By numberOfSeatsDropdown = By.id("numberofseats");
    By numberOfSeatsMotorcycle = By.id("numberofseatsmotorcycle");
    By rightHandDriveYes = By.id("righthanddriveyes");
    By rightHandDriveNo = By.id("righthanddriveno");
    By fuelDropdown = By.id("fuel");
    By payload = By.id("payload");
    By totalWeight = By.id("totalweight");
    By listPrice = By.id("listprice");
    By licensePlateNumber = By.id("licenseplatenumber");
    By annualMileage = By.id("annualmileage");
    By nextButton = By.id("nextenterinsurantdata");

    public void selectMake(String make) {
        new Select(driver.findElement(makeDropdown)).selectByVisibleText(make);
    }

    public void selectModel(String model) {
        new Select(driver.findElement(modelDropdown)).selectByVisibleText(model);
    }

    public void enterCylinderCapacity(String capacity) {
        driver.findElement(cylinderCapacity).sendKeys(capacity);
    }

    public void enterEnginePerformance(String performance) {
        driver.findElement(enginePerformance).sendKeys(performance);
    }

    public void enterDateOfManufacture(String date) {
        driver.findElement(dateOfManufacture).sendKeys(date);
    }

    public void selectNumberOfSeats(String seats) {
        new Select(driver.findElement(numberOfSeatsDropdown)).selectByVisibleText(seats);
    }

    public void selectNumberOfSeatsMotorcycle(String seats) {
        new Select(driver.findElement(numberOfSeatsMotorcycle)).selectByVisibleText(seats);
    }

    public void selectRightHandDriveYes() {
        ActionsUtil.clickElement(driver, rightHandDriveYes);
    }

    public void selectRightHandDriveNo() {
        ActionsUtil.clickElement(driver, rightHandDriveNo);
    }

    public void selectFuelType(String fuel) {
        new Select(driver.findElement(fuelDropdown)).selectByVisibleText(fuel);
    }

    public void enterPayload(String payloadValue) {
        driver.findElement(payload).sendKeys(payloadValue);
    }

    public void enterTotalWeight(String weight) {
        driver.findElement(totalWeight).sendKeys(weight);
    }

    public void enterListPrice(String price) {
        driver.findElement(listPrice).sendKeys(price);
    }

    public void enterLicensePlateNumber(String license) {
        driver.findElement(licensePlateNumber).sendKeys(license);
    }

    public void enterAnnualMileage(String mileage) {
        driver.findElement(annualMileage).sendKeys(mileage);
    }

    public void clickNext() {
        driver.findElement(nextButton).click();
    }
}
