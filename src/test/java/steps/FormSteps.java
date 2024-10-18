package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.*;

import java.time.Duration;

public class FormSteps {
    WebDriver driver;
    VehicleDataPage vehicleDataPage;
    InsurantDataPage insurantDataPage;
    ProductDataPage productDataPage;
    PriceOptionPage priceOptionPage;
    SendQuotePage sendQuotePage;

    public FormSteps() {
        System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        driver = new ChromeDriver(options);

        vehicleDataPage = new VehicleDataPage(driver);
        insurantDataPage = new InsurantDataPage(driver);
        productDataPage = new ProductDataPage(driver);
        priceOptionPage = new PriceOptionPage(driver);
        sendQuotePage = new SendQuotePage(driver);
    }

    @Given("the user is on the Vehicle Data page")
    public void userOnVehicleDataPage() {
        driver.get("http://sampleapp.tricentis.com/101/app.php");
    }

    @When("the user fills in vehicle data")
    public void fillVehicleData() {
        vehicleDataPage.selectMake("Audi");
        vehicleDataPage.selectModel("Scooter");
        vehicleDataPage.enterCylinderCapacity("2000");
        vehicleDataPage.enterEnginePerformance("150");
        vehicleDataPage.enterDateOfManufacture("01/01/2020");
        vehicleDataPage.selectNumberOfSeats("4");
        vehicleDataPage.selectRightHandDriveYes();
        vehicleDataPage.selectNumberOfSeatsMotorcycle("2");
        vehicleDataPage.selectFuelType("Petrol");
        vehicleDataPage.enterPayload("500");
        vehicleDataPage.enterTotalWeight("2000");
        vehicleDataPage.enterListPrice("30000");
        vehicleDataPage.enterLicensePlateNumber("KKA7123");
        vehicleDataPage.enterAnnualMileage("15000");
        vehicleDataPage.clickNext();
    }

    @When("the user fills in insurant data")
    public void fillInsurantData() {
        insurantDataPage.enterFirstName("Joao");
        insurantDataPage.enterLastName("Rocha");
        insurantDataPage.enterBirthDate("07/09/2005");
        insurantDataPage.selectGenderMale();
        insurantDataPage.enterStreetAddress("Rua do Brasil");
        insurantDataPage.selectCountry("Brazil");
        insurantDataPage.enterZipCode("50750");
        insurantDataPage.enterCity("Recife");
        insurantDataPage.selectOccupation("Employee");
        insurantDataPage.selectHobbySpeeding();
        insurantDataPage.enterWebsite("https://acccenture.com");
        insurantDataPage.uploadPicture("C:\\Users\\Jaoow\\Downloads\\OIG2.jpg");
        insurantDataPage.clickNext();
    }

    @When("the user fills in product data")
    public void fillProductData() {
        productDataPage.enterStartDate("12/19/2024");
        productDataPage.selectInsuranceSum("5.000.000,00");
        productDataPage.selectMeritRating("Bonus 1");
        productDataPage.selectDamageInsurance("Full Coverage");
        productDataPage.selectOptionalEuroProtection();
        productDataPage.selectOptionalLegalDefenseInsurance();
        productDataPage.selectCourtesyCar("Yes");
        productDataPage.clickNext();
    }

    @When("the user selects a price option")
    public void selectPriceOption() {
        priceOptionPage.selectGoldOption();
        priceOptionPage.clickNext();
    }

    @When("the user fills in the send quote form")
    public void fillSendQuoteForm() {
        sendQuotePage.enterEmail("joaol.rocha@accenture.com");
        sendQuotePage.enterPhone("1234567890");
        sendQuotePage.enterUsername("jlrocha");
        sendQuotePage.enterPassword("Pa$$w0rd");
        sendQuotePage.enterConfirmPassword("Pa$$w0rd");
        sendQuotePage.enterComments("No aguardo de sua reposta.");
        sendQuotePage.clickSendEmail();
    }


    @Then("the user should see {string} on the screen")
    public void verifyMessage(String message) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='sweet-alert showSweetAlert visible']//h2[text()='" + message + "']")));

        String alertMessage = driver.findElement(By.xpath("//div[@class='sweet-alert showSweetAlert visible']//h2")).getText();
        assert alertMessage.equals(message) : "Expected message: " + message + ", but got: " + alertMessage;
    }
}
