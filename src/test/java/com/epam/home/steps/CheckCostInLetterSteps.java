package com.epam.home.steps;

import com.epam.home.driver.DriverSingleton;
import com.epam.home.model.Instance;
import com.epam.home.pages.*;
import com.epam.home.service.InstanceCreator;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.After;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static com.epam.home.pages.CalculatorPage.totalEstimatedCost;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;

public class CheckCostInLetterSteps {

    Instance testInstance = InstanceCreator.withCredentialsFromProperty();
    private static final String MAIN_URL = "http://mail.ru";
    private static final String CHROMEDRIVER_EXE = "C:\\Program Files\\driverSelenium\\chromedriver.exe";
    private static final String LOGIN = "sysrq08884";
    private static final String PASSWORD = "5682777a";
    private MainPage mainPage;
    private PricingPage pricingPage;
    private CalculatorPage calculatorPage;
    private MinutEmailPage minutEmailPage;
    private ProductsPage productsPage;
    private WebDriver webDriver;
    double totalEstimateCostInLetter;

    public CheckCostInLetterSteps()
    {

        webDriver = DriverSingleton.getDriver();
        mainPage = new MainPage(webDriver);
        pricingPage = new PricingPage(webDriver);
        calculatorPage = new CalculatorPage(webDriver);
        minutEmailPage = new MinutEmailPage(webDriver);
        productsPage = new ProductsPage(webDriver);
    }

    @Given("^I am on main application page$")
    public void loadMainPage()
    {
        mainPage.openMainPage();
    }

    @When("^I click on button see products$")
    public void clickOnButtonSeeProducts()
    {
        mainPage.clickExploreAllProductsButton();
    }

    @When("^I click on button see pricing$")
    public void clickOnButtonSeePricing()
    {
        productsPage.clickSeeePriceButton();
    }

    @When("^I click on link calculators$")
    public void clickOnLinkCalculator()
    {
        pricingPage.clickCalculatorButton();
    }

    @When("^I fill up form with$")
    public void fillForm()
    {
        totalEstimateCostInLetter =calculatorPage
                .enterIntoFrame()
                .chooseComputerEngine()
                .inputNumberOfInstances(testInstance)
                .inputWhatAreTheseInstancesFor(testInstance)
                .chooseOperatingSystem(testInstance)
                .chooseVMClass(testInstance)
                .chooseInstanceType(testInstance)
                .clickOnCheckboxAddGPUs()
                .chooseNumberOfGPU(testInstance)
                .chooseGPUType(testInstance)
                .chooseLocalSSD(testInstance)
                .chooseDataCenterLocation(testInstance)
                .chooseCommitedUsage(testInstance)
                .clickButtonAddToEstimate()
                .totalEstimatedCost()
                .clickEmailEstimateButton()
                .sendLetter("https://10minutemail.net")
                .clickOnIncomingLetter()
                .getTotalEstimatedMonthlyCostFromLetter();
    }



    @Then("^I see price in letter$")
    public void seeLogoutLink()
    {
        assertThat(totalEstimateCostInLetter, is(equalTo(totalEstimatedCost)));
    }



    @After()
    public void afterClass()
    {
        webDriver.quit();
    }
}
