package com.example.framework.pages;

import com.example.framework.core.Waits;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.List;

public class AddRemoveElementsPage extends BasePage {

    private final By addElementButton = By.cssSelector("button[onclick='addElement()']");
    private final By deleteButtons = By.cssSelector("#elements button.added-manually");

    public AddRemoveElementsPage(WebDriver driver, Waits waits) {
        super(driver, waits);
    }

    public AddRemoveElementsPage open() {
        driver.get("https://the-internet.herokuapp.com/add_remove_elements/");
        return this;
    }

    public AddRemoveElementsPage clickAddElement() {
        waits.clickable(addElementButton).click();
        return this;
    }

    public int getDeleteButtonsCount() {
        List<?> buttons = driver.findElements(deleteButtons);
        return buttons.size();
    }

    public AddRemoveElementsPage clickFirstDelete() {
        waits.clickable(deleteButtons).click();
        return this;
    }
}
