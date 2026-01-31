package com.example.framework.pages;

import com.example.framework.core.Waits;
import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage {

    private static final String BASE_URL = "https://the-internet.herokuapp.com";

    public HomePage(WebDriver driver, Waits waits) {
        super(driver, waits);
    }

    public HomePage open() {
        driver.get(BASE_URL);
        return this;
    }

    public String getTitle() {
        return driver.getTitle();
    }
}
