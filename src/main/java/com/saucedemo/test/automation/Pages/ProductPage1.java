package com.saucedemo.test.automation.Pages;

import com.saucedemo.test.automation.BaseTest.BaseTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductPage1 extends BaseTest {
    private final String cart_page_url_="https://www.saucedemo.com/cart.html";
    public ProductPage1(WebDriver driver) {
        this.driver = driver;

        PageFactory.initElements(driver, this);
    }
@FindBy (id="remove-sauce-labs-backpack")
    public WebElement remove_backpack;
    @FindBy (id="remove-sauce-labs-bike-light")
    public WebElement remove_bike;
    @FindBy (id="remove-sauce-labs-bolt-t-shirt")
    public WebElement remove_T_shirt;
    @FindBy (id="remove-sauce-labs-fleece-jacket")
    public WebElement remove_jacket;
    @FindBy(id="remove-test.allthethings()-t-shirt-(red)")
    public WebElement remove_red_T_shirt;
    @FindBy (id="remove-sauce-labs-onesie")
    public WebElement remove_onesie;

    public void setRemove_backpack () {
        remove_backpack.isDisplayed();
    }
    public void setRemove_bike(){
        remove_bike.isDisplayed();
    }
    public void setRemove_T_shirt (){
        remove_T_shirt.isDisplayed();
    }
    public void setRemove_jacket (){
        remove_jacket.isDisplayed();
    }

    public void setRemove_onesie() {
        remove_onesie.isDisplayed();
    }

    public void setRemove_red_T_shirt() {
        this.remove_red_T_shirt.isDisplayed();
    }
}
