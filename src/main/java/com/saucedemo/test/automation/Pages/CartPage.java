package com.saucedemo.test.automation.Pages;

import com.saucedemo.test.automation.BaseTest.BaseTest;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CartPage extends BaseTest {
    private String ProductPage;
    private final String cart_page_URL="https://www.saucedemo.com/inventory.html";
    public CartPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    @FindBy(id="item_4_img_link")
    public WebElement backpack_image;
    @FindBy (id="add-to-cart")
    public WebElement add_to_cart_button;
    @FindBy(id="cart_contents_container")
    public WebElement shopping_list;
    @FindBy (id="remove")
    public WebElement remove_button;
    @FindBy (className = "back-image")
    public WebElement continue_shopping;
    @FindBy (id="menu_button_container")
    public WebElement your_cart;
    @FindBy( id="checkout")
    public WebElement checkout;
    @FindBy (css= "Sauce Labs Bolt T-Shirt")
    public WebElement bolt_T_shirt;
    @FindBy (css="Sauce Labs Onesie")
    public WebElement onesie;
    @FindBy (id="back-to-products")
    public WebElement back_to_products_button;
    @FindBy(id= "shopping_cart_container")
    public WebElement cart;
    @FindBy (id="add-to-cart-sauce-labs-backpack")
    public WebElement add_backpack;
    @FindBy (id="add-to-cart-sauce-labs-bolt-t-shirt")
    public WebElement add_T_shirt;
    @FindBy (id="add-to-cart-sauce-labs-onesie")
    public WebElement add_onesie;
    @FindBy (id="remove-sauce-labs-backpack")
    public WebElement remove_Backpack;
    @FindBy (id="remove-sauce-labs-bolt-t-shirt")
    public WebElement remove_T_Shirt;
    @FindBy (id="remove-sauce-labs-onesie")
    public WebElement remove_onesie;
    @FindBy(id="first-name")
    public WebElement first_name_field;
    @FindBy(id="last-name")
    public WebElement last_name_field;
    @FindBy(id="postal-code")
    public WebElement zip_postal_code;
    @FindBy (id="continue")
    public WebElement continue_button;
    @FindBy (id="finish")
    public WebElement finish_button;
    @FindBy(tagName ="h2")
    public WebElement thank_you_for_order;
    @FindBy (id="back-to-products")
    public WebElement back_home_button;
    @FindBy (className = "product_sort_container")
    public WebElement filter_field;
    @FindBy(xpath = "#header_container > div.header_secondary_container > div > span > select > option:nth-child(1)")
    public WebElement nameAZ;
    @FindBy (id="item_3_img_link")
    public WebElement nameZA;
    @FindBy(name="Price(lowtohigh)")
    public WebElement priceLowHigh;
    @FindBy(name="Price (high to low)")
    public WebElement pricehighToLow;
    @FindBy (tagName ="a")
    public WebElement xSite;
    @FindBy (className ="social_twitter")
    public WebElement twitter_icon;
    @FindBy (className = "social_facebook")
    public WebElement facebook_button;
    @FindBy (tagName = "g")
    public WebElement facebook_login_form;
    @FindBy (className ="social_linkedin")
    public WebElement linked_in_button;
    @FindBy (css="ember33")
    public WebElement linked_in_page;
    @FindBy (id="about_sidebar_link")
    public WebElement about_option;
    @FindBy (id="react-burger-menu-btn")
    public WebElement menu_bar;
    @FindBy (id="__next")
    public WebElement sauceLabs_logo;
    @FindBy (tagName="a")
    public WebElement testingButton;
    @FindBy (id="remove-sauce-labs-backpack")
    public WebElement remove_backpack_button;
    @FindBy(tagName= "a")
    public WebElement cartWithnumber1;
    @FindBy (id="reset_sidebar_link")
    public WebElement resetAppOption;
    @FindBy (name = "organization_guest_contextual-sign-in-modal_sign-in-modal_outlet-button")
    public WebElement linkedInDescription;

    public void setRemove_backpack_button(){
        remove_backpack_button.isDisplayed();
    }
    public void setLinkedInDescription(){
        linkedInDescription.isSelected();
    }
    public void setCartWithnumber1(){
        cartWithnumber1.isDisplayed();
    }
    public void setResetAppOption(){
        resetAppOption.click();
    }
    public void setImage_of_root (){
        testingButton.isSelected();
    }
    public void clickOnAbout_option(){
        about_option.click();
    }
    public void clickOnMenu_bar(){
        menu_bar.click();
    }
    public void setLinked_in_page (){
        linked_in_page.isDisplayed();
    }
    public void setLinked_in_form(){
        linked_in_button.click();
    }
    public void setFacebook_login_form () {
        facebook_login_form.isDisplayed();
    }
    public void setFacebook_button (){
        facebook_button.click();
    }
    public void setxSite () {
        xSite.isDisplayed();
    }
    public void setTwitter_icon() {
        twitter_icon.click();
    }
    public void setPriceLowHigh (){
        priceLowHigh.click();
    }
    public void setNameZA(){
        nameZA.click();
    }
    public void setNameAZ() {
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();");
        nameAZ.click();
    }
    public void setFilter_field (){
        filter_field.click();
    }

    public void clickOnButton() {
        back_home_button.click();
    }
    public void setThank_you_for_order(){
        thank_you_for_order.isDisplayed();
    }
    public void clickOnfinishButton(){
        finish_button.click();
    }
    public void clickOnContinueButton() {
        continue_button.click();
    }
    public void inputZip_postal_code(String postalCode){
        zip_postal_code.clear();
        zip_postal_code.sendKeys(postalCode);
    }
    public void inputLast_name_field(String lastName){
        last_name_field.clear();
        last_name_field.sendKeys(lastName);
    }
    public void inputFirst_name(String firstName) {
        first_name_field.clear();
        first_name_field.sendKeys(firstName);
    }
    public void setRemove_onesie () {
        remove_onesie.click();
    }

    public void setRemove_T_Shirt (){
        remove_T_Shirt.click();
    }
    public void setRemove_Backpack (){
        remove_Backpack.click();
    }
    public void setAdd_onesie (){
        add_onesie.click();
    }
    public void setAdd_T_shirt(){
        add_T_shirt.click();
    }
    public void setAdd_backpack () {
        add_backpack.click();
    }
    public void clickOnCart(){
        cart.click();
    }
    public void setBack_to_products_button () {
        back_to_products_button.click();
    }
    public void setonesie() {
        onesie.click();
    };
    public void setcheckout(){
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();");
        checkout.click();
        System.out.println(" CHECKOUT");
    }
    public void setBackpack_image(){
        backpack_image.isDisplayed();
    }
    public void clickOnAddToCartButton(){
        add_to_cart_button.click();
    }
    public void setShopping_list () {
        shopping_list.isDisplayed();
    }
    public void clickOnRemove_button (){
        remove_button.click();
    }
    public void Your_cart (){
        your_cart.isDisplayed();
    }
    public void clickOnContinue_shopping(){
        continue_shopping.click();
    }
    public void setBolt_T_shirt (){bolt_T_shirt.isDisplayed();}

}
