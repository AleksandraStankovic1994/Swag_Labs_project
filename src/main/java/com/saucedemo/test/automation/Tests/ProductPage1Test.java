package com.saucedemo.test.automation.Tests;

import com.saucedemo.test.automation.BaseTest.BaseTest;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ProductPage1Test extends BaseTest {
    private final static String PASSWORD = "secret_sauce";
    private static final Logger log = LoggerFactory.getLogger(CartPageTest.class);
    @Test
    public void checkoutFilterButton() throws InterruptedException {
        loginPage.inputUserName("standard_user");
        loginPage.inputPassword(PASSWORD);
        loginPage.logInButton.click();
        productPage.filter_field.click();
        Assert.assertTrue(productPage.filter_field.isDisplayed());
        Assert.assertFalse(productPage.filter_field.isSelected());
    }
    @Test
    public void checkingIconsforSocialMedia() {
        loginPage.inputUserName("standard_user");
        loginPage.inputPassword(PASSWORD);
        loginPage.logInButton.click();
        productPage.twitter_icon.click();
        Assert.assertTrue(productPage.twitter_icon.isDisplayed());
        Assert.assertFalse(productPage.xSite.isSelected());
    }
    @Test
    public void checkoutIconsForSocialMedia2 (){
        loginPage.inputUserName("standard_user");
        loginPage.inputPassword(PASSWORD);
        loginPage.logInButton.click();
        productPage.facebook_button.click();
        Assert.assertFalse(productPage.facebook_button.isSelected());
        Assert.assertTrue(productPage.facebook_button.isDisplayed());
    }
    @Test
    public void checkoutIconsForSocialMedia3() throws InterruptedException {
        loginPage.inputUserName("standard_user");
        loginPage.inputPassword(PASSWORD);
        loginPage.logInButton.click();
        productPage.linked_in_button.click();
        Thread.sleep(1000);
        Assert.assertFalse(productPage.linked_in_button.isSelected());
        Assert.assertTrue(productPage.linked_in_button.isDisplayed());
    }
    @Test
    public void checkOutMemuBarOptions_about(){
        loginPage.inputUserName("standard_user");
        loginPage.inputPassword(PASSWORD);
        loginPage.logInButton.click();
        productPage.menu_bar.click();
        productPage.about_option.click();
        Assert.assertTrue(productPage.sauceLabs_logo.isDisplayed());
        Assert.assertTrue(productPage.testingButton.isDisplayed());
    }
    @Test
    public void checkOutMemuBarOptions_resetApp() {
        loginPage.inputUserName("standard_user");
        loginPage.inputPassword(PASSWORD);
        loginPage.logInButton.click();
        productPage.add_backpack.click();
        productPage.cartWithnumber1.isSelected();
        productPage.menu_bar.click();
        productPage.resetAppOption.click();
        Assert.assertTrue(productPage.cart.isDisplayed());
        Assert.assertTrue(productPage.remove_backpack_button.isDisplayed());
    }


        }



