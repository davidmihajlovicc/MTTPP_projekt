package com.example.framework.pages;

import com.example.framework.core.Waits;
import org.openqa.selenium.WebDriver;

public abstract class BasePage {
    protected final WebDriver driver;
    protected final Waits waits;

    protected BasePage(WebDriver driver, Waits waits) {
        this.driver = driver;
        this.waits = waits;
    }
}
