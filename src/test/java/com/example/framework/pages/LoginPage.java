package com.example.framework.pages;

import com.example.framework.core.Waits;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage {

    private final By username = By.id("username");
    private final By password = By.id("password");
    private final By loginButton = By.cssSelector("button[type='submit']");
    private final By flash = By.id("flash");

    public LoginPage(WebDriver driver, Waits waits) {
        super(driver, waits);
    }

    public LoginPage open() {
        driver.get("https://the-internet.herokuapp.com/login");
        return this;
    }

    public LoginPage typeUsername(String value) {
        waits.visible(username).clear();
        waits.visible(username).sendKeys(value);
        return this;
    }

    public LoginPage typePassword(String value) {
        waits.visible(password).clear();
        waits.visible(password).sendKeys(value);
        return this;
    }

    public SecureAreaPage submitValid() {
        waits.clickable(loginButton).click();
        return new SecureAreaPage(driver, waits);
    }

    public LoginPage submitInvalid() {
        waits.clickable(loginButton).click();
        return this;
    }

    public String getFlashText() {
        return waits.visible(flash).getText();
    }
}
