package saucedemo.pages;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;

public class CheckoutPage extends BasePage{
    public CheckoutPage(AndroidDriver driver) {
        super(driver);
    }

    @AndroidFindBy(accessibility = "Confirms products for checkout")
    private WebElement btnCheckout;

    @AndroidFindBy(id = "com.saucelabs.mydemoapp.android:id/fullNameET")
    private WebElement fieldFullName;

    @AndroidFindBy(id = "com.saucelabs.mydemoapp.android:id/address1ET")
    private WebElement fieldAddress;

    @AndroidFindBy(id = "com.saucelabs.mydemoapp.android:id/cityET")
    private WebElement fieldCity;

    @AndroidFindBy(id = "com.saucelabs.mydemoapp.android:id/stateET")
    private WebElement fieldState;

    @AndroidFindBy(id = "com.saucelabs.mydemoapp.android:id/zipET")
    private WebElement fieldZip;

    @AndroidFindBy(id = "com.saucelabs.mydemoapp.android:id/countryET")
    private WebElement fieldCountry;

    @AndroidFindBy(accessibility = "Saves user info for checkout")
    private WebElement btnToPayment;

    @AndroidFindBy(id = "com.saucelabs.mydemoapp.android:id/nameET")
    private WebElement fieldCardName;

    @AndroidFindBy(id = "com.saucelabs.mydemoapp.android:id/cardNumberET")
    private WebElement fieldCardNumber;

    @AndroidFindBy(id = "com.saucelabs.mydemoapp.android:id/expirationDateET")
    private WebElement fieldExpirationDate;

    @AndroidFindBy(id = "com.saucelabs.mydemoapp.android:id/securityCodeET")
    private WebElement fieldSecurityCode;

    @AndroidFindBy(accessibility = "Saves payment info and launches screen to review checkout data")
    private WebElement btnToReview;

    @AndroidFindBy(id = "com.saucelabs.mydemoapp.android:id/fullNameTV")
    private WebElement reviewFullName;

    @AndroidFindBy(id = "com.saucelabs.mydemoapp.android:id/addressTV")
    private WebElement reviewAddress;

    @AndroidFindBy(id = "com.saucelabs.mydemoapp.android:id/cityTV")
    private WebElement reviewCity;

    @AndroidFindBy(id = "com.saucelabs.mydemoapp.android:id/countryTV")
    private WebElement reviewCountry;

    @AndroidFindBy(accessibility = "Completes the process of checkout")
    private WebElement btnReviewCheckout;

    @AndroidFindBy(accessibility = "Tap to open catalog")
    private WebElement btnCompleteCheckout;

    @AndroidFindBy(id = "com.saucelabs.mydemoapp.android:id/completeTV")
    private WebElement completeMessage;

    public void clickCheckout(){
        btnCheckout.click();
    }

    public void inputFullName(String fullName){
        fieldFullName.sendKeys(fullName);
    }

    public void inputAddress(String address){
        fieldAddress.sendKeys(address);
    }

    public void inputCity(String city){
        fieldCity.sendKeys(city);
    }

    public void inputState(String state){
        fieldState.sendKeys(state);
    }

    public void inputZip(String zip){
        fieldZip.sendKeys(zip);
    }

    public void inputCountry(String country){
        fieldCountry.sendKeys(country);
    }

    public void checkout(String fullName, String address, String city, String state, String zip, String country){
        inputFullName(fullName);
        inputAddress(address);
        inputCity(city);
        inputState(state);
        inputZip(zip);
        inputCountry(country);
    }

    public void clickToPayment(){
        btnToPayment.click();
    }

    public void inputCardName(String cardName){
        fieldCardName.sendKeys(cardName);
    }

    public void inputCardNumber(String cardNumber){
        fieldCardNumber.sendKeys(cardNumber);
    }

    public void inputExpirationDate(String expirationDate){
        fieldExpirationDate.sendKeys(expirationDate);
    }

    public void inputSecurityCode(String securityCode){
        fieldSecurityCode.sendKeys(securityCode);
    }

    public void creditCardInfo(String cardName, String cardNumber, String expirationDate, String securityCode){
        inputCardName(cardName);
        inputCardNumber(cardNumber);
        inputExpirationDate(expirationDate);
        inputSecurityCode(securityCode);
    }

    public void clickToReview(){
        btnToReview.click();
    }

    public boolean isFullNameReviewDisplayed(String fullName){
        String name = reviewFullName.getText();
        return name.contains(fullName);
    }

    public boolean isAddressReviewDisplayed(String address){
        String addr = reviewAddress.getText();
        return addr.contains(address);
    }

    public boolean isCityReviewDisplayed(String city){
        String cty = reviewCity.getText();
        return cty.contains(city);
    }

    public boolean isCountryReviewDisplayed(String country){
        String ctry = reviewCountry.getText();
        return ctry.contains(country);
    }

    public boolean reviewFullFields() {
        isFullNameReviewDisplayed("Reza Fahmi Pahlevi");
        isAddressReviewDisplayed("jl.kemerdekaan no.45");
        isCityReviewDisplayed("Banyumas");
        isCountryReviewDisplayed("Indonesia");
        return true;
    }

    public void clickReviewCheckout(){
        btnReviewCheckout.click();
    }

    public void clickCompleteCheckout(){
        btnCompleteCheckout.click();
    }
}
