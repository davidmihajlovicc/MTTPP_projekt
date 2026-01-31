package com.example.framework.tests;

import com.example.framework.core.BaseTest;
import com.example.framework.pages.DynamicLoadingPage;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class DynamicLoadingTests extends BaseTest {

    @Test
    void dynamicLoading_example2_waitsUntilHelloWorldVisible() {
        DynamicLoadingPage page = new DynamicLoadingPage(driver, waits)
                .openExample2()
                .start();

        Assertions.assertEquals("Hello World!", page.getFinishText());
    }
}
