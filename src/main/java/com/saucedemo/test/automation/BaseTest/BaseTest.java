package com.saucedemo.test.automation.BaseTest;

import com.saucedemo.test.automation.Pages.LoginPage;
import com.saucedemo.test.automation.Pages.CartPage;
import com.saucedemo.test.automation.Pages.ProductPage1;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.time.Duration;

public class BaseTest {
    protected WebDriver driver;
    protected LoginPage loginPage;
    protected CartPage productPage;
    protected ProductPage1 productPage1;

    @BeforeMethod
    public void setUp() {
        System.setProperty("web.driver.chrome.driver", "C:\\driver\\chromedriver-win64\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        loginPage = new LoginPage(driver);
        driver.navigate().to("https://www.saucedemo.com/");
        productPage= new CartPage(driver);
        driver.navigate().to("https://www.saucedemo.com/inventory.html");
        productPage1= new ProductPage1(driver);
        driver.navigate().to("https://www.saucedemo.com/inventory.html");


    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }
}
