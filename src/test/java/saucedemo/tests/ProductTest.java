package saucedemo.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import saucedemo.core.BaseTest;
import saucedemo.core.DriverManager;
import saucedemo.pages.*;

public class ProductTest extends BaseTest {
    @Test
    public void addToCart() {
        //Login first
        GlobalPage globalPage = new GlobalPage(DriverManager.getDriver());
        LoginPage loginPage = new LoginPage(DriverManager.getDriver());
        ProductPage productPage = new ProductPage(DriverManager.getDriver());
        ScrollPage scrollPage = new ScrollPage(DriverManager.getDriver());

        globalPage.clickHamburgerMenu();
        globalPage.clickLoginMenu();

        loginPage.login("bod@example.com", "10203040");

        Assert.assertTrue(productPage.isProductTitlePage());

        // Add to cart
        productPage.clickFirstProduct();
        scrollPage.swipeVertical(0.8, 0.2);
        productPage.addToCart();

        //assert
        Assert.assertTrue(productPage.isCartBadgeDisplayed());
    }

    @Test
    public void checkoutProduct() {
        //Login first
        GlobalPage globalPage = new GlobalPage(DriverManager.getDriver());
        LoginPage loginPage = new LoginPage(DriverManager.getDriver());
        ProductPage productPage = new ProductPage(DriverManager.getDriver());
        CheckoutPage checkoutPage = new CheckoutPage(DriverManager.getDriver());
        ScrollPage scrollPage = new ScrollPage(DriverManager.getDriver());

        globalPage.clickHamburgerMenu();
        globalPage.clickLoginMenu();

        loginPage.login("bod@example.com", "10203040");

        Assert.assertTrue(productPage.isProductTitlePage());

        // Add to cart
        productPage.clickFirstProduct();
        scrollPage.swipeVertical(0.8, 0.2);
        productPage.addToCart();

        // Go to cart
        productPage.clickCartIcon();

        Assert.assertTrue(productPage.isProductTitleDisplayed());

        //Checkout
        checkoutPage.clickCheckout();
        // Input checkout info
        checkoutPage.checkout("Reza Fahmi Pahlevi", "jl.kemerdekaan no.45", "Banyumas", "purwokerto","12345", "Indonesia");
        scrollPage.swipeVertical(0.8, 0.2);
        //klik continue to payment
        checkoutPage.clickToPayment();
        // Input credit card info
        checkoutPage.creditCardInfo("Reza Fahmi Pahlevi", "4111 1111 1111 1111", "12/25", "123");
        checkoutPage.clickToReview();
        scrollPage.swipeVertical(0.5, 0.2);
        // assert review info
        Assert.assertTrue(checkoutPage.reviewFullFields());
        // Complete checkout
        checkoutPage.clickReviewCheckout();
        // back to product page
        checkoutPage.clickCompleteCheckout();
        // assert back to product page
        Assert.assertTrue(productPage.isProductTitlePage());
    }
}
