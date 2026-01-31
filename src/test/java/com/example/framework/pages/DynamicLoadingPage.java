package com.example.framework.pages;

import com.example.framework.core.Waits;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DynamicLoadingPage extends BasePage {

    private final By example2 = By.cssSelector("a[href='/dynamic_loading/2']");
    private final By startButton = By.cssSelector("#start button");
    private final By finishText = By.cssSelector("#finish h4");

    public DynamicLoadingPage(WebDriver driver, Waits waits) {
        super(driver, waits);
    }

    public DynamicLoadingPage openRoot() {
        driver.get("https://the-internet.herokuapp.com/dynamic_loading");
        return this;
    }

    public DynamicLoadingPage openExample2() {
        openRoot();
        waits.clickable(example2).click();
        return this;
    }

    public DynamicLoadingPage start() {
        waits.clickable(startButton).click();
        return this;
    }

    public String getFinishText() {
        return waits.visible(finishText).getText();
    }
}
