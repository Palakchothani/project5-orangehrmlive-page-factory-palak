package com.orangehrmlive.demo.testsuite;

import com.orangehrmlive.demo.customlistener.CustomListeners;
import com.orangehrmlive.demo.pages.ForgotPassword;
import com.orangehrmlive.demo.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(CustomListeners.class)
public class ForgotPasswordPageTest extends BaseTest {
    ForgotPassword forgotPassword;

    @BeforeMethod(alwaysRun = true)
    public void inIt() {
        forgotPassword = new ForgotPassword();
    }


    @Test(groups = {"smoke","regression"})
    public void userShouldNavigateToForgotPasswordPageSuccessfully(){
        forgotPassword.forgotPasswordLink();

        String expectedMessage = "Reset Password";
        Assert.assertEquals(forgotPassword.resetPasswordMessage(),expectedMessage,"no message displayed");
    }
}

