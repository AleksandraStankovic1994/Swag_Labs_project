package com.saucedemo.test.automation.Tests;

import com.saucedemo.test.automation.BaseTest.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LogInPageTest extends BaseTest {

    private final static String PASSWORD = "secret_sauce";

    @Test
    public void validUsernameAndValidPassword() {
        loginPage.inputUserName("standard_user");
        loginPage.inputPassword(PASSWORD);
        loginPage.logInButton.click();
        Assert.assertTrue(loginPage.listOfItems.isDisplayed());
        Assert.assertTrue(loginPage.cart.isDisplayed());
    }

    @Test
    public void validUsernameAndValidPassword1() {
        loginPage.inputUserName("locked_out_user");
        loginPage.inputPassword(PASSWORD);
        loginPage.logInButton.click();
        Assert.assertTrue(loginPage.logInForm.isDisplayed());
        Assert.assertTrue(loginPage.error_message.isDisplayed());

    }

    @Test
    public void validUsernameAndValidPassword2() {
        loginPage.inputUserName("problem_user");
        loginPage.inputPassword(PASSWORD);
        loginPage.logInButton.click();
        Assert.assertTrue(loginPage.listOfItems.isDisplayed());
        Assert.assertTrue(loginPage.cart.isDisplayed());
    }

    @Test
    public void validUsernameAndValidPassword3() {
        loginPage.inputUserName("performance_glitch_user");
        loginPage.inputPassword(PASSWORD);
        loginPage.logInButton.click();
        Assert.assertTrue(loginPage.listOfItems.isDisplayed());
        Assert.assertTrue(loginPage.cart.isDisplayed());
    }

    @Test
    public void validUsernameAndValidPassword4() {
        loginPage.inputUserName("error_user");
        loginPage.inputPassword(PASSWORD);
        loginPage.logInButton.click();
        Assert.assertTrue(loginPage.listOfItems.isDisplayed());
        Assert.assertTrue(loginPage.cart.isDisplayed());
    }

    @Test
    public void validUsernameAndValidPassword5() {
        loginPage.inputUserName("visual_user");
        loginPage.inputPassword(PASSWORD);
        loginPage.logInButton.click();
        Assert.assertTrue(loginPage.listOfItems.isDisplayed());
        Assert.assertTrue(loginPage.cart.isDisplayed());
    }

    @Test
    public void logInwithinvalidUsernameAndValidPassword() {
        loginPage.inputUserName("Petar");
        loginPage.inputPassword(PASSWORD);
        loginPage.logInButton.click();
        Assert.assertTrue(loginPage.logInForm.isDisplayed());
        Assert.assertTrue(loginPage.error_message.isDisplayed());
    }

    @Test
    public void logInwithvalidUsernameAndinvalidPassword() {
        loginPage.inputUserName("standard_user");
        loginPage.inputPassword("password");
        loginPage.logInButton.click();
        Assert.assertTrue(loginPage.logInForm.isDisplayed());
        Assert.assertTrue(loginPage.error_message.isDisplayed());
    }

    @Test
    public void logInwithinvalidUsernameAndinvalidPassword() {
        loginPage.inputUserName("Petar ");
        loginPage.inputPassword("password");
        loginPage.logInButton.click();
        Assert.assertTrue(loginPage.logInForm.isDisplayed());
        Assert.assertTrue(loginPage.error_message.isDisplayed());
    }

    @Test
    public void validationOfLogInpageButtons() {
        loginPage.userName.click();
        loginPage.passWord.click();
        Assert.assertTrue(loginPage.userName.isEnabled());
        Assert.assertTrue(loginPage.passWord.isEnabled());
    }
    @Test
    public void logOutOfPage (){
        loginPage.inputUserName("standard_user");
        loginPage.inputPassword(PASSWORD);
        loginPage.logInButton.click();
        loginPage.menu_button.click();
        loginPage.logOutButton.click();
        Assert.assertTrue(loginPage.logInForm.isDisplayed());
        Assert.assertTrue(loginPage.logInCredentitals.isDisplayed());
    }
}



