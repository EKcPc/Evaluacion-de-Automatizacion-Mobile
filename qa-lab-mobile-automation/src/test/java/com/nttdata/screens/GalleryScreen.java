package com.nttdata.screens;

import io.appium.java_client.pagefactory.AndroidFindBy;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class GalleryScreen extends PageObject {

    @AndroidFindBy(xpath = "//android.widget.TextView[@resource-id=\"com.saucelabs.mydemoapp.android:id/productTV\"]")
    private WebElement lblProduct;

    @AndroidFindBy(xpath = "//android.widget.ImageView[@content-desc=\"Sauce Labs Backpack\"]")
    private WebElement backpackProduct;

    @AndroidFindBy (xpath ="//android.widget.ImageView[@content-desc=\"Increase item quantity\"]")
    private WebElement increaseUnit;

    @AndroidFindBy (xpath = "//android.widget.Button[@content-desc=\"Tap to add product to cart\"]")
    private WebElement btnInCar;

    @AndroidFindBy (xpath = "//android.widget.Button[@content-desc=\"Tap to add product to cart\"]")
    private WebElement btnAddCar;

    @AndroidFindBy (xpath = "//android.widget.TextView[@resource-id=\"com.saucelabs.mydemoapp.android:id/titleTV\"]")
    private WebElement lblBackpackCar;



    @AndroidFindBy(xpath = "//android.widget.ImageView[@content-desc=\"Sauce Labs Bolt T-Shirt\"]")
    private WebElement boltProduct;

    @AndroidFindBy(xpath = "//android.widget.ImageView[@content-desc=\"Sauce Labs Bike Light\"]")
    private WebElement bikeProduct;


    public boolean isProductDisplayed() {
        waitFor(ExpectedConditions.visibilityOf(lblProduct));
        return lblProduct.isDisplayed();
    }


    public WebElement getBackpackProduct() {
        return backpackProduct;
    }

    public WebElement getBoltProduct(){
        return boltProduct;
    }

    public WebElement getBikeProduct(){
        return bikeProduct;
    }

    public WebElement getBtnInCar() {
        return btnInCar;
    }

    public WebElement getBtnAddCar() {
        return btnInCar;
    }
    public WebElement getIncreaseUnit() {
        return increaseUnit;
    }

    public WebElement getLblBackpackCar() {
        return lblBackpackCar;
    }


}
