package com.epam.home.pages;

import com.epam.home.model.Instance;
import com.epam.home.utils.StringParser;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CalculatorPage extends AbstractPage {

    public static Double totalEstimatedCost = null;

    public CalculatorPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//div[@class='tab-holder compute']")
    private WebElement computeEngineLink;

    @FindBy(xpath = "//input[@ng-model='listingCtrl.computeServer.quantity']")
    private WebElement numberOfInstancesField;

    @FindBy(xpath = "//input[@ng-model='listingCtrl.computeServer.label']")
    private WebElement whatAreTheseInstancesForField;

    @FindBy(xpath = "//*[@id='select_61']")
    private WebElement operationSystemDropDownList;

    @FindBy(xpath = "//*[@id='select_65']")
    private WebElement vmClassDropDownList;

    @FindBy(xpath = "//*[@id='select_96']")
    private WebElement instanceTypeDropDownList;

    @FindBy(xpath = "//*[@aria-label='Add GPUs']")
    private WebElement addGPUsCheckbox;

    @FindBy(xpath = "//*[@placeholder='Number of GPUs']")
    private WebElement numberOfGPUsDropDownList;

    @FindBy(xpath = "//*[@placeholder='GPU type']")
    private WebElement gpuTypeDropDownList;

    @FindBy(xpath = "//*[@id='select_value_label_46']")
    private WebElement localSSDDropDownList;

    @FindBy(xpath = "//*[@id='select_100']")
    private WebElement datacenterLocationDropDownList;

    @FindBy(xpath = "//*[@id='select_105']")
    private WebElement commitedUsageDropDownList;

    @FindBy(xpath = "//button[@aria-label='Add to Estimate']")
    private WebElement addToEstimateButton;

    @FindBy(xpath = "//div[text()[contains(.,'VM class')]]")
    private WebElement vMClassInfo;

    @FindBy(xpath = "//div[text()[contains(.,'Instance type')]]")
    private WebElement instanceTypeInfo;

    @FindBy(xpath = "//div[text()[contains(.,'Region')]]")
    private WebElement regionInfo;

    @FindBy(xpath = "//div[text()[contains(.,'Total available local SSD space')]]")
    private WebElement totalAvailableLocalSSDSpaceInfo;

    @FindBy(xpath = "//div[text()[contains(.,'Commitment term')]]")
    private WebElement commitmentTermInfo;

    @FindBy(xpath = "//b[text()[contains(.,'Total Estimated Cost')]]")
    private WebElement totalEstimatedCostInfo;

    @FindBy(xpath = "//*[@id='email_quote']")
    private WebElement emailEstimateButton;

    @FindBy(xpath = "//*[@id='fe_text']")
    private WebElement emailAddress;

    @FindBy(xpath = "//input[@type='email']")
    private WebElement emailField;

    @FindBy(xpath = "//button[@aria-label='Send Email']")
    private WebElement sendEmailButton;

    @FindBy(xpath = "//*[@class='cp-header']//iframe")
    private WebElement iframe;


    public CalculatorPage enterIntoFrame() {
        driver.switchTo().frame(waitForElement(iframe));
        logger.info("switching to frame");
        return this;
    }

    public CalculatorPage chooseComputerEngine() {
        waitUntilElementPresent(computeEngineLink).click();
        logger.info("Click on icon 'COMPUTE ENGINE'");
        return this;
    }

    public CalculatorPage inputNumberOfInstances(Instance instance) {
        waitUntilElementPresent(numberOfInstancesField).sendKeys(instance.getNumberOfInstances());
        logger.info("input 'Number of instances': " + instance.getNumberOfInstances());
        return this;
    }

    public CalculatorPage inputWhatAreTheseInstancesFor(Instance instance) {
        waitUntilElementPresent(whatAreTheseInstancesForField).sendKeys(instance.getWhatAreTheseInstancesFor());
        logger.info("input 'What are these instances for?': " + instance.getWhatAreTheseInstancesFor());
        return this;
    }

    public CalculatorPage chooseOperatingSystem(Instance instance) {
        String optionOperatingSystem = String.format("//md-option/div[text()='%s']", instance.getOperationSystem());
        waitUntilElementPresent(operationSystemDropDownList).click();
        logger.info("Click on drop down 'Operating System / Software'");
        waitUntilElementPresent(By.xpath(optionOperatingSystem)).click();
        logger.info("Choose 'Operating System / Software': " + instance.getOperationSystem());
        return this;
    }

    public CalculatorPage chooseVMClass(Instance instance) {
        String optionVMClass = String.format("(//md-option/div[text()='%s'])[2]", instance.getVMClass());
        waitUntilElementPresent(vmClassDropDownList).click();
        logger.info("Click on drop down 'VM Class'");
        waitUntilElementPresent(By.xpath(optionVMClass)).click();
        logger.info("Choose 'VM Class': " + instance.getVMClass());
        return this;
    }

    public CalculatorPage chooseInstanceType(Instance instance) {
        String optionInstanceType = String.format("//div[text()[contains(.,'%s')]]", instance.getInstanceType());
        waitUntilElementPresent(instanceTypeDropDownList).click();
        logger.info("Click on drop down 'Instance type'");
        waitUntilElementPresent(By.xpath(optionInstanceType)).click();
        logger.info("Choose 'Instance type': " + instance.getInstanceType());
        return this;
    }

    public CalculatorPage clickOnCheckboxAddGPUs() {
        waitUntilElementPresent(addGPUsCheckbox).click();
        logger.info("Click on checkbox 'Add GPUs'");
        return this;
    }

    public CalculatorPage chooseNumberOfGPU(Instance instance) {
        String optionGPU = String.format("//div[text()='%s']", instance.getNumberOfGPU());
        waitUntilElementPresent(numberOfGPUsDropDownList).click();
        logger.info("Click on drop down 'Number of GPUs'");
        waitUntilElementPresent(By.xpath(optionGPU)).click();
        logger.info("Choose 'Number of GPUs': " + instance.getNumberOfGPU());
        return this;
    }

    public CalculatorPage chooseGPUType(Instance instance) {
        String optionGPUType = String.format("//div[text()='%s']", instance.getGpuType());
        waitUntilElementPresent(gpuTypeDropDownList).click();
        logger.info("Click on drop down 'GPU type'");
        waitUntilElementPresent(By.xpath(optionGPUType)).click();
        logger.info("Choose 'GPU type': " + instance.getGpuType());
        return this;
    }

    public CalculatorPage chooseLocalSSD(Instance instance) {
        String optionLocalSSD = String.format("//div[text()='%s']", instance.getLocalSSD());
        waitUntilElementPresent(localSSDDropDownList).click();
        logger.info("Click on drop down 'Local SSD'");
        waitUntilElementPresent(By.xpath(optionLocalSSD)).click();
        logger.info("Choose 'Local SSD': " + instance.getLocalSSD());
        return this;
    }

    public CalculatorPage chooseDataCenterLocation(Instance instance) {
        String optionDataCentrLocation = String.format("//*[@id='select_option_199']/div[text()[contains(.,'%s')]]", instance.getDataCenterLocation());
        waitUntilElementPresent(datacenterLocationDropDownList).click();
        logger.info("Click on drop down 'Datacenter location'");
        waitUntilElementPresent(By.xpath(optionDataCentrLocation)).click();
        logger.info("Choose 'Datacenter location': " + instance.getDataCenterLocation());
        return this;
    }

    public CalculatorPage chooseCommitedUsage(Instance instance) {
        String optionCommitedUsage = String.format("(//div[text()='%s'])[2]", instance.getCommittedUsage());
        waitUntilElementPresent(commitedUsageDropDownList).click();
        logger.info("Click on drop down 'Commited usage'");
        waitUntilElementPresent(By.xpath(optionCommitedUsage)).click();
        logger.info("Choose 'Commited usage': " + instance.getCommittedUsage());
        return this;
    }

    public CalculatorPage clickButtonAddToEstimate() {
        waitUntilElementPresent(addToEstimateButton).click();
        logger.info("Click on button 'Add to Estimate'");
        return this;
    }

    public String getVmClass() {
        return vMClassInfo.getText();
    }

    public String getInstanceType() {
        return instanceTypeInfo.getText();
    }

    public String getRegion() {
        return regionInfo.getText();
    }

    public String getTotalAvailaleLocalSSDspace() {
        return totalAvailableLocalSSDSpaceInfo.getText();
    }

    public Double getTotalEstimatedCost() {
        return StringParser.getDoubleFromString(totalEstimatedCostInfo.getText());
    }

    public CalculatorPage totalEstimatedCost() {
        totalEstimatedCost = StringParser.getDoubleFromString(totalEstimatedCostInfo.getText());
        return this;
    }

    public CalculatorPage clickEmailEstimateButton() {
        waitUntilElementPresent(emailEstimateButton).click();
        return this;
    }

    public void openNewTab() {
        ((ChromeDriver) driver).executeScript("window.open()");
        logger.info("open new tab");
    }

    public void swithTab() {
        for (String tab : driver.getWindowHandles()) {
            driver.switchTo().window(tab);
        }
        logger.info("switching in new tab");
    }

    public MinutEmailPage sendLetter(String address) {
        String firstTab = driver.getWindowHandle();
        openNewTab();
        swithTab();
        String secondTab = driver.getWindowHandle();
        driver.get(address);
        logger.info("input address: " + address);
        String email = saveEmailAddress();
        driver.switchTo().window(firstTab);
        logger.info("switching in previous tab");
        enterIntoFrame();
        inputEmailAdderess(email);
        clickSendEmailButton();
        driver.switchTo().window(secondTab);
        logger.info("switching in new tab");
        return new MinutEmailPage(driver);
    }

    public String saveEmailAddress() {
        waitUntilElementPresent(emailAddress);
        return emailAddress.getAttribute("value");
    }

    public void inputEmailAdderess(String address) {
        waitUntilElementPresent(emailField).sendKeys(address);
        logger.info("input address: " + address);
    }

    public void clickSendEmailButton() {
        waitUntilElementPresent(sendEmailButton).click();
        logger.info("Click on button 'SEND EMAIL'");
    }
}