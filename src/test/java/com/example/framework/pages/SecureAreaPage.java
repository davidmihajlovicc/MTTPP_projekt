package com.example.framework.pages;

import com.example.framework.core.Waits;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SecureAreaPage extends BasePage {

    private final By flash = By.id("flash");
    private final By logoutButton = By.cssSelector("a.button.secondary.radius");

    public SecureAreaPage(WebDriver driver, Waits waits) {
        super(driver, waits);
    }

    public String getFlashText() {
        return waits.visible(flash).getText();
    }

    public LoginPage logout() {
        waits.clickable(logoutButton).click();
        return new LoginPage(driver, waits);
    }
}
