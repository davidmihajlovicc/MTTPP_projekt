package com.example.framework.tests;

import com.example.framework.core.BaseTest;
import com.example.framework.pages.CheckboxesPage;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CheckboxTests extends BaseTest {

    @Test
    void checkbox1_toggle_changesState() {
        CheckboxesPage page = new CheckboxesPage(driver, waits).open();
        boolean before = page.isCheckbox1Selected();
        page.toggleCheckbox1();
        boolean after = page.isCheckbox1Selected();

        Assertions.assertNotEquals(before, after);
    }

    @Test
    void checkbox2_toggle_changesState() {
        CheckboxesPage page = new CheckboxesPage(driver, waits).open();
        boolean before = page.isCheckbox2Selected();
        page.toggleCheckbox2();
        boolean after = page.isCheckbox2Selected();

        Assertions.assertNotEquals(before, after);
    }
}
