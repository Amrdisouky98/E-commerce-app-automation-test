package org.example.stepsDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P04_Home;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

public class S06_Category {

    WebDriver driver = Hooks.driver;
    P04_Home CategorySelect = new P04_Home(Hooks.driver);

    @When("User hover with mouse on Apparel category")
    public void pointOnCategory() throws InterruptedException {
       WebElement Hoverable = driver.findElement(CategorySelect.apparelCategory());
        new Actions(driver).moveToElement(Hoverable).perform();
    }

    @And("User click on shoes sub-category in DDL")
    public void clickOnSubcategory(){
        driver.findElement(CategorySelect.subCategory()).click();
    }

    @Then("User heads to Apparel category page")
    public void navigateToCategory(){
        Assert.assertEquals("https://demo.nopcommerce.com/shoes", driver.getCurrentUrl());
    }
}
