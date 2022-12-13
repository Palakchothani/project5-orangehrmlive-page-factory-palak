package com.orangehrmlive.demo.testsuite;

import com.orangehrmlive.demo.customlistener.CustomListeners;
import com.orangehrmlive.demo.pages.LoginPage;
import com.orangehrmlive.demo.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(CustomListeners.class)
public class LoginPageTest extends BaseTest{
    LoginPage loginPage;

    @BeforeMethod(alwaysRun = true)
    public void inIt() {
        loginPage = new LoginPage();
    }

    @Test(groups = {"sanity","regression"})
    public void userShouldLoginSuccessfullyWithValidCredentials() {
        loginPage.usernameField("Admin");
        loginPage.passwordField("admin123");
        loginPage.clickToLoginButton();
        String expectedMessage = "Dashboard";
        Assert.assertEquals(loginPage.MessageOccur(),expectedMessage,"Message not Displayed");
    }
}
