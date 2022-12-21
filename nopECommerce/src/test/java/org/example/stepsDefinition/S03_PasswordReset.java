package org.example.stepsDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.example.pages.P02_Login;
import org.example.pages.P03_PasswordRecovery;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class S03_PasswordReset {

    WebDriver driver = Hooks.driver;
    P03_PasswordRecovery recover = new P03_PasswordRecovery(Hooks.driver);
    P02_Login login = new P02_Login(Hooks.driver);


    @Given("User clicks on forget password button")
    public void forgotClick(){
        driver.findElement(login.forgotPassBtn()).click();
    }

    @Then("User navigates to password recovery page")
    public void recoverPage(){
        Assert.assertEquals("https://demo.nopcommerce.com/passwordrecovery",driver.getCurrentUrl());
    }

    @And("User enters the email he wants to reset the passowrd at")
    public void emailEntry(){
        driver.findElement(recover.userEmail()).sendKeys("amrtestmail@gmail.com");
    }

    @And("User clicks on recover button")
    public void recoverClick(){
        driver.findElement(recover.recoverBtn()).click();
    }

    @And("A reset confirmation message appears")
    public void confirmMsg(){
        org.testng.Assert.assertEquals("Email with instructions has been sent to you.",recover.confirmMsg());
    }
}
