package com.epam.home.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PricingPage extends AbstractPage {

    public PricingPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//*[@track-name='pricing']")
    private WebElement pricingButton;

    @FindBy(xpath = "//*[@track-metadata-eventdetail='calculators']")
    private WebElement calculatorLink;

    @FindBy(xpath = "//img[@class='cloud-hero__image cloud-hero__image--scaled']")
    private WebElement image;


    public CalculatorPage clickCalculatorButton() {
        waitUntilElementPresent(image);
        waitUntilElementPresent(pricingButton).click();
        waitUntilElementPresent(calculatorLink).click();
        logger.info("Click on link 'Calculators'");
        return new CalculatorPage(driver);
    }
}
