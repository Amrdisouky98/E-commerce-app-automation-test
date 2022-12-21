package org.example.stepsDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.example.pages.P04_Home;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class S05_Searching {

    WebDriver driver = Hooks.driver;
    P04_Home homeSearch = new P04_Home(Hooks.driver);


    @Given("User click on search field")
    public void searchFieldClick(){
        driver.findElement(homeSearch.searchField()).click();
    }

    @And("Start typing favoured product name")
    public void productSearch(){
        driver.findElement(homeSearch.searchField()).sendKeys("Nokia");
    }

    @And("Click on search button")
    public void searchClick(){driver.findElement(homeSearch.searchBtn()).click();}

    @Then("User should be directed to search result page")
    public void searchResult(){
        Assert.assertEquals("https://demo.nopcommerce.com/search?q=Nokia",driver.getCurrentUrl());
    }

}
