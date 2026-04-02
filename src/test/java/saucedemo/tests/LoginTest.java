package saucedemo.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import saucedemo.core.BaseTest;
import saucedemo.pages.GlobalPage;
import saucedemo.pages.LoginPage;
import saucedemo.pages.ProductPage;

import saucedemo.core.DriverManager;

public class LoginTest extends BaseTest {

    @Test(priority = 1)
    public void successLogin() {
        GlobalPage globalPage = new GlobalPage(DriverManager.getDriver());
        LoginPage loginPage = new LoginPage(DriverManager.getDriver());
        ProductPage productPage = new ProductPage(DriverManager.getDriver());

        // Go to Login page
        globalPage.clickHamburgerMenu();
        globalPage.clickLoginMenu();

        // Input Credentials and login
        loginPage.login("bod@example.com", "10203040");

        // Check Login success
        Assert.assertTrue(productPage.isProductTitlePage());
    }

    @Test(priority = 2)
    public void lockedLogin() {
        GlobalPage globalPage = new GlobalPage(DriverManager.getDriver());
        LoginPage loginPage = new LoginPage(DriverManager.getDriver());

        // Go to Login page
        globalPage.clickHamburgerMenu();
        globalPage.clickLoginMenu();

        // Input Credentials and login
        loginPage.login("alice@example.com", "10203040");

        // Check Login failed
        Assert.assertTrue(loginPage.isErrorMassage());
    }
}
