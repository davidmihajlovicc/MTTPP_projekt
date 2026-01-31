package com.example.framework.tests;

import com.example.framework.core.BaseTest;
import com.example.framework.pages.LoginPage;
import com.example.framework.pages.SecureAreaPage;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LoginTests extends BaseTest {

    @Test
    void loginSuccess_validCredentials_showsSuccessMessage() {
        LoginPage login = new LoginPage(driver, waits).open()
                .typeUsername("tomsmith")
                .typePassword("SuperSecretPassword!");

        SecureAreaPage secure = login.submitValid();

        Assertions.assertTrue(secure.getFlashText().contains("You logged into a secure area!"));
    }

    @Test
    void loginFail_wrongPassword_showsErrorMessage() {
        LoginPage login = new LoginPage(driver, waits).open()
                .typeUsername("tomsmith")
                .typePassword("wrong");

        login.submitInvalid();

        Assertions.assertTrue(login.getFlashText().contains("Your password is invalid!"));
    }

    @Test
    void logout_afterSuccessfulLogin_returnsToLogin() {
        LoginPage login = new LoginPage(driver, waits).open()
                .typeUsername("tomsmith")
                .typePassword("SuperSecretPassword!");

        SecureAreaPage secure = login.submitValid();
        LoginPage back = secure.logout();

        Assertions.assertTrue(back.getFlashText().contains("You logged out of the secure area!"));
    }
}
