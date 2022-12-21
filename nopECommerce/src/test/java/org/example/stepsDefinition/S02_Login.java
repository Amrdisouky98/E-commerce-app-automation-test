package org.example.stepsDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.en_scouse.An;
import org.example.pages.P04_Home;
import org.example.pages.P02_Login;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class S02_Login {

    WebDriver driver = Hooks.driver;
    P04_Home HomeLogin = new P04_Home(Hooks.driver);
    P02_Login login = new P02_Login(Hooks.driver);


    @Given("User navigates to Login page")
    public void loginPageClick() {driver.findElement(HomeLogin.loginPageButton()).click();}

    @When("Insert enter valid email")
    public void usernameEntry() {driver.findElement(login.emailText()).sendKeys("amrtestmail@gmail.com");}

    @And("Insert valid password")
    public void passwordEntry() {driver.findElement(login.passwordText()).sendKeys("test@pass98");}

    @An("Click on login button")
    public void loginBtnClick() {driver.findElement(login.LoginButton()).click();}

    @Then("The user should be logged in successfully")
    public void successMsg() {
        Assert.assertEquals(driver.getCurrentUrl(),"https://demo.nopcommerce.com/");
    }
}
