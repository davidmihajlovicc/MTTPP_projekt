package com.example.framework.tests;

import com.example.framework.core.BaseTest;
import com.example.framework.pages.AddRemoveElementsPage;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AddRemoveElementsTests extends BaseTest {

    @Test
    void addAndRemoveElement_changesDeleteButtonsCount() {
        AddRemoveElementsPage page = new AddRemoveElementsPage(driver, waits).open();

        Assertions.assertEquals(0, page.getDeleteButtonsCount());

        page.clickAddElement();
        Assertions.assertEquals(1, page.getDeleteButtonsCount());

        page.clickFirstDelete();
        Assertions.assertEquals(0, page.getDeleteButtonsCount());
    }
}
