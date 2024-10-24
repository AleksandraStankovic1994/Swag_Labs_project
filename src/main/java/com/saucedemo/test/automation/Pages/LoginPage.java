package com.saucedemo.test.automation.Pages;

import com.saucedemo.test.automation.BaseTest.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BaseTest {
    private final String login_page_url="https://www.saucedemo.com/";
    public LoginPage(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver, this);
    }
    @FindBy (id="login_button_container")
    public WebElement logInForm;
    @FindBy (id = "inventory_container")
    public WebElement listOfItems;
    @FindBy (id ="user-name")
    public WebElement usernameField;
    @FindBy (id ="password")
    public WebElement passwordField;
    @FindBy(id="login-button")
    public WebElement logInButton;
    @FindBy(id= "shopping_cart_container")
    public WebElement cart;
    @FindBy (tagName = "h3")
    public WebElement error_message;
    @FindBy(name="user-name")
    public WebElement userName;
    @FindBy (name="password")
    public WebElement passWord;
    @FindBy (id="react-burger-menu-btn")
    public WebElement menu_button;
    @FindBy (id="logout_sidebar_link")
    public WebElement logOutButton;
    @FindBy (id="login_credentials")
    public WebElement logInCredentitals;
    public void getTitle(String title){
        driver.findElement(By.linkText("Swag Labs"));
    }
    public  void inputUserName(String username){
        usernameField.clear();
        usernameField.sendKeys(username);
    }
    public void inputPassword(String password){
        passwordField.clear();
        passwordField.sendKeys(password);
    }
    public void clickOnLoginButton() {
        logInButton.click();
    }
    public void setlistOfItems (){
        listOfItems.isDisplayed();
    }
    public void seterror_message(){
        error_message.isDisplayed();
    }
    public void setUserName() {
        userName.click();
    }
    public void setpassWord (){
        passWord.click();
    }
    public void clickOnMenuButton(){
        menu_button.click();
    }
    public void clickOnLogOutButton(){
        logOutButton.click();
    }
    public void setLogInCredentials(){
        logInCredentitals.isDisplayed();
    }
}

