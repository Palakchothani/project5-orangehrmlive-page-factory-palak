package com.orangehrmlive.demo.pages;

import com.aventstack.extentreports.Status;
import com.orangehrmlive.demo.customlistener.CustomListeners;
import com.orangehrmlive.demo.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends Utility
{
    @CacheLookup
    @FindBy(name = "username")
    WebElement username;

    @CacheLookup
    @FindBy(name = "password")
    WebElement password;

    @CacheLookup
    @FindBy(xpath = "//button[@type='submit']")
    WebElement loginButton;

    @CacheLookup
    @FindBy(xpath = "//h6[contains(@class,'header-breadcrumb-module')]")
    WebElement dashBoardMessage;

    public void usernameField(String userName) {
        CustomListeners.test.log(Status.PASS,"Enter EmailId " + userName);
        sendTextToElement(username, userName);

    }
    public void passwordField(String passcode) {
        CustomListeners.test.log(Status.PASS,"Enter Password " + password);
        sendTextToElement(password, passcode);
    }
    public void clickToLoginButton(){
        CustomListeners.test.log(Status.PASS,"Enter EmailId " + loginButton);
        clickOnElement(loginButton);
    }

    public String MessageOccur(){
        CustomListeners.test.log(Status.PASS,"Enter EmailId " + dashBoardMessage);
        return getTextFromElement(dashBoardMessage);
    }
}
