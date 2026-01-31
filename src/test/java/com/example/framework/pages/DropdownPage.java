package com.example.framework.pages;

import com.example.framework.core.Waits;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownPage extends BasePage {

    private final By dropdown = By.id("dropdown");

    public DropdownPage(WebDriver driver, Waits waits) {
        super(driver, waits);
    }

    public DropdownPage open() {
        driver.get("https://the-internet.herokuapp.com/dropdown");
        return this;
    }

    public DropdownPage selectByVisibleText(String text) {
        Select sel = new Select(waits.visible(dropdown));
        sel.selectByVisibleText(text);
        return this;
    }

    public String getSelectedOptionText() {
        Select sel = new Select(waits.visible(dropdown));
        return sel.getFirstSelectedOption().getText();
    }
}
