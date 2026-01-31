package com.example.framework.pages;

import com.example.framework.core.Waits;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CheckboxesPage extends BasePage {

    private final By checkbox1 = By.cssSelector("#checkboxes input:nth-of-type(1)");
    private final By checkbox2 = By.cssSelector("#checkboxes input:nth-of-type(2)");

    public CheckboxesPage(WebDriver driver, Waits waits) {
        super(driver, waits);
    }

    public CheckboxesPage open() {
        driver.get("https://the-internet.herokuapp.com/checkboxes");
        return this;
    }

    public boolean isCheckbox1Selected() {
        WebElement el = waits.visible(checkbox1);
        return el.isSelected();
    }

    public boolean isCheckbox2Selected() {
        WebElement el = waits.visible(checkbox2);
        return el.isSelected();
    }

    public CheckboxesPage toggleCheckbox1() {
        waits.clickable(checkbox1).click();
        return this;
    }

    public CheckboxesPage toggleCheckbox2() {
        waits.clickable(checkbox2).click();
        return this;
    }
}
