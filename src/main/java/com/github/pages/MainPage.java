package com.github.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MainPage {

    private WebDriver driver;
    private WebDriverWait wait;

    @FindBy(xpath = "//input[@value='Continue']")
    private WebElement continueButton;

    public MainPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver,30);
        PageFactory.initElements(driver,this);
    }

    public void goTOMainPage() {
        this.wait.until(ExpectedConditions.visibilityOf(this.continueButton));
    }
}
