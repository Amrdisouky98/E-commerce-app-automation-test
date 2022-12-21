package org.example.stepsDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.example.pages.P04_Home;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class S09_Wishlist {

    WebDriver driver = Hooks.driver;
    P04_Home WishStep = new P04_Home(Hooks.driver);
    String wishlistNumber;
    @Given("user navigates to needed product then click add to wishlist button")
    public void AddToWishlist(){
        driver.findElements(WishStep.HTCwish()).get(2).click();}

    @Then("A green success message should appear")
    public void SuccessMsg(){
        Assert.assertTrue(driver.findElement(WishStep.wishlistSuccessMsg()).isDisplayed());
    }

    @Then("number of wishlist products on homepage get increased")
    public void wishlistItems(){
        wishlistNumber = driver.findElement(WishStep.wishlistItemsNumber()).getText();
    }

    @And("number of wishlist products equals to number of real wishlist actions")
    public void wishlistNum(){
        wishlistNumber = wishlistNumber.replaceAll("[^0-9]","");
        Assert.assertTrue(Integer.parseInt(wishlistNumber)>0);
    }


}
