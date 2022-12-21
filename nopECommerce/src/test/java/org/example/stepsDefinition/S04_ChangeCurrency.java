package org.example.stepsDefinition;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P04_Home;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class S04_ChangeCurrency {

    WebDriver driver = Hooks.driver;
    P04_Home currencyFeature = new P04_Home(Hooks.driver);

    @When("User click on currencies DDL then click on Euro sign")
    public void chooseCurrency(){
        Select selectCurrency = new Select(currencyFeature.currencyDDL);
        selectCurrency.selectByVisibleText("Euro");
    }

    @Then("Currency changes from US to Euro")
    public void currencyChange(){
        String expectedResult = "Euro";
        String actualResult = driver.findElement(By.id("customerCurrency")).getText();
        Assert.assertTrue(actualResult.contains(expectedResult));
    }
}
