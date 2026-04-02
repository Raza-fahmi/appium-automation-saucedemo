package saucedemo.pages;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;


public class ProductPage extends BasePage{
    public ProductPage(AndroidDriver driver) {
        super(driver);
    }

    @AndroidFindBy(accessibility = "title")
    private WebElement elTitle;

    @AndroidFindBy(uiAutomator = "new UiSelector().resourceId(\"com.saucelabs.mydemoapp.android:id/productIV\").instance(0)")
    private WebElement productImage;

    @AndroidFindBy(accessibility = "Tap to add product to cart")
    private WebElement btnAddToCart;

    @AndroidFindBy(id = "com.saucelabs.mydemoapp.android:id/cartIV")
    private WebElement cartIcon;

    @AndroidFindBy(id = "com.saucelabs.mydemoapp.android:id/cartTV")
    private WebElement cartBadge;

    @AndroidFindBy(id = "com.saucelabs.mydemoapp.android:id/titleTV")
    private WebElement productTitle;

    public boolean isProductTitlePage() {
        String title = elTitle.getText();
        return title.contains("Products");
    }

    public void clickFirstProduct(){
        productImage.click();
    }

    public void addToCart(){
        btnAddToCart.click();
    }

    public void clickCartIcon(){
        cartIcon.click();
    }

    public boolean isCartBadgeDisplayed() {
        String title = cartBadge.getText();
        return title.contains("1");
    }

    public boolean isProductTitleDisplayed() {
        String title = productTitle.getText();
        return title.contains("Sauce Labs Backpack");
    }


}
