package com.epam.home.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductsPage extends AbstractPage {

    public ProductsPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//a[@track-name='seePricing']")
    private WebElement seePriceButton;

    public PricingPage clickSeeePriceButton() {
        waitUntilElementPresent(seePriceButton).click();
        logger.info("Click on button 'SEE PRICING'");
        return new PricingPage(driver);
    }
}
