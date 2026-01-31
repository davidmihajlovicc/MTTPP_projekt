package com.example.framework.tests;

import com.example.framework.core.BaseTest;
import com.example.framework.pages.DropdownPage;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class DropdownTests extends BaseTest {

    @Test
    void dropdown_selectOption1_isSelected() {
        DropdownPage page = new DropdownPage(driver, waits).open()
                .selectByVisibleText("Option 1");

        Assertions.assertEquals("Option 1", page.getSelectedOptionText());
    }
}
