package com.epam.home.pages;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public abstract class AbstractPage {

    protected static WebDriver driver;
    protected final Logger logger = LogManager.getRootLogger();
    protected final int WAIT_TIMEOUT_SECONDS = 10;
    protected final int WAIT_TIMEOUT_SECONDS_FOR_RECEIVE_LETTER = 90;


    protected AbstractPage(WebDriver driver) {
        this.driver = driver;
    }

    protected WebElement waitUntilElementPresent(By by) {
        return new WebDriverWait(driver,WAIT_TIMEOUT_SECONDS).until(ExpectedConditions.presenceOfElementLocated(by));
    }

    protected WebElement waitUntilElementPresent(WebElement webElement) {
        return new WebDriverWait(driver,WAIT_TIMEOUT_SECONDS).until(ExpectedConditions.elementToBeClickable(webElement));
    }

    protected WebElement waitForElement(WebElement webElement) {
        return new WebDriverWait(driver,WAIT_TIMEOUT_SECONDS).until(ExpectedConditions.visibilityOf(webElement));
    }

    protected WebElement waitUntilLetterComing(WebElement webElement) {
        return new WebDriverWait(driver,WAIT_TIMEOUT_SECONDS_FOR_RECEIVE_LETTER).until(ExpectedConditions.elementToBeClickable(webElement));
    }
}