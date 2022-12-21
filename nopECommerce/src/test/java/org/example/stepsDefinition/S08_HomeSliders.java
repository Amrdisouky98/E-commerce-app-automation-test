package org.example.stepsDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.example.pages.P04_Home;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class S08_HomeSliders {

    WebDriver driver = Hooks.driver;
    P04_Home HomeSlider = new P04_Home(Hooks.driver);

    @Given("user select the first slider on homepage")
    public void selectFirstSlider(){
        driver.findElement(HomeSlider.homeSliders("1")).click();
    }

    @Then("user head to first product's page")
    public void navigateToFirstProduct(){
        Assert.assertEquals(driver.getCurrentUrl(),"https://demo.nopcommerce.com/nokia-lumia-1020");
    }

    @Given("user select the second slider on homepage")
    public void selectSecondSlider(){
        driver.findElement(HomeSlider.homeSliders("2")).click();
    }

    @Then("user head to second product's page")
    public void navigateToSecondProduct(){
        Assert.assertEquals(driver.getCurrentUrl(),"https://demo.nopcommerce.com/iphone-6");
    }
}
