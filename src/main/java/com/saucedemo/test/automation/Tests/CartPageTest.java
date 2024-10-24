package com.saucedemo.test.automation.Tests;

import com.saucedemo.test.automation.BaseTest.BaseTest;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CartPageTest extends BaseTest {
    private final static String PASSWORD = "secret_sauce";
    private static final Logger log = LoggerFactory.getLogger(CartPageTest.class);

    @Test
    public void addToCartOneItem() {
        loginPage.inputUserName("standard_user");
        loginPage.inputPassword(PASSWORD);
        loginPage.logInButton.click();
        productPage.backpack_image.click();
        productPage.add_to_cart_button.click();
        Assert.assertTrue(productPage.your_cart.isDisplayed());
        Assert.assertTrue(productPage.continue_shopping.isDisplayed());
    }

    @Test
    public void removeOneItemFromCart() {
        loginPage.inputUserName("standard_user");
        loginPage.inputPassword(PASSWORD);
        loginPage.logInButton.click();
        productPage.backpack_image.click();
        productPage.add_to_cart_button.click();
        productPage.remove_button.click();
        Assert.assertTrue(productPage.your_cart.isDisplayed());
        Assert.assertTrue(productPage.cart.isDisplayed());
    }

    @Test
    public void addToCartMultippleitems() {
        loginPage.inputUserName("standard_user");
        loginPage.inputPassword(PASSWORD);
        loginPage.logInButton.click();
        productPage.add_backpack.click();
        productPage.add_T_shirt.click();
        productPage.add_onesie.click();
        productPage.cart.click();
        Assert.assertTrue(productPage.shopping_list.isDisplayed());
        Assert.assertTrue(productPage.checkout.isDisplayed());
    }

    @Test
    public void removeMultipleItemsFromCart() {
        loginPage.inputUserName("standard_user");
        loginPage.inputPassword(PASSWORD);
        loginPage.logInButton.click();
        productPage.add_backpack.click();
        productPage.add_T_shirt.click();
        productPage.add_onesie.click();
        productPage.cart.click();
        productPage.remove_Backpack.click();
        productPage.remove_T_Shirt.click();
        productPage.remove_onesie.click();
        Assert.assertTrue(productPage.continue_shopping.isDisplayed());
        Assert.assertTrue(productPage.checkout.isDisplayed());
    }

    @Test
    public void ShoppingItemsAndCheckoutComplete() throws InterruptedException {
        loginPage.inputUserName("standard_user");
        loginPage.inputPassword(PASSWORD);
        loginPage.logInButton.click();
        productPage.add_backpack.click();
        Thread.sleep(2000);
        productPage.cart.click();
        productPage.checkout.click();
        Thread.sleep(2000);
        productPage.inputFirst_name("Petar");
        productPage.inputLast_name_field("Petrovic");
        productPage.inputZip_postal_code("11000 Belgrade");
        productPage.continue_button.click();
        productPage.finish_button.click();
        Assert.assertTrue(productPage.thank_you_for_order.isDisplayed());
        Assert.assertTrue(productPage.back_home_button.isDisplayed());
    }

    @Test
    public void cartIsEmptyBeforeShopping() {
        loginPage.inputUserName("standard_user");
        loginPage.inputPassword(PASSWORD);
        loginPage.logInButton.click();
        productPage.cart.click();
        Assert.assertTrue(productPage.your_cart.isDisplayed());
        Assert.assertTrue(productPage.continue_shopping.isDisplayed());
        Assert.assertTrue(productPage.checkout.isDisplayed());
    }

    @Test
    public void CheckingYourInformationPage() throws InterruptedException {
        loginPage.inputUserName("standard_user");
        loginPage.inputPassword(PASSWORD);
        loginPage.logInButton.click();
        productPage.add_backpack.click();
        Thread.sleep(2000);
        productPage.cart.click();
        productPage.checkout.click();
        Assert.assertTrue(productPage.first_name_field.isDisplayed());
        Assert.assertTrue(productPage.last_name_field.isDisplayed());
        Assert.assertTrue(productPage.zip_postal_code.isDisplayed());
    }
    @Test
    public void CheckingOverview () throws InterruptedException {
        loginPage.inputUserName("standard_user");
        loginPage.inputPassword(PASSWORD);
        loginPage.logInButton.click();
        productPage.add_backpack.click();
        Thread.sleep(2000);
        productPage.cart.click();
        productPage.checkout.click();
        productPage.inputFirst_name("Petar");
        productPage.inputLast_name_field("Petrovic");
        productPage.inputZip_postal_code("11000 Belgrade");
        productPage.continue_button.click();
        Assert.assertTrue(productPage.finish_button.isDisplayed());
        Assert.assertFalse(productPage.cartWithnumber1.isDisplayed());

    }
}