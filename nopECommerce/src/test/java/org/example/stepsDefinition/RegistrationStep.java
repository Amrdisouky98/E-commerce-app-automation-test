package org.example.stepsDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.HomePage;
import org.example.pages.RegistrationPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class RegistrationStep {

    WebDriver driver = Hooks.driver;
    HomePage HomeRegister = new HomePage(Hooks.driver);
    RegistrationPage register = new RegistrationPage(Hooks.driver);

    @When("User navigate to register page")
    public void registerTabClick(){
        driver.findElement(HomeRegister.registerPageButton()).click();
    }

    @Then("Guest user should be directed to registering page")
    public void guestDirecting(){
        Assert.assertEquals(driver.getCurrentUrl(),"https://demo.nopcommerce.com/register?returnUrl=%2F");
    }

    @When("User select gender")
    public void choosingGender(){
        driver.findElement(register.genderRadio()).click();
    }

    @And("Insert valid Firstname")
    public void firstName(){
        driver.findElement(register.firstName()).sendKeys("Amr");
    }

    @And("Insert valid Lastname")
    public void lastName(){
        driver.findElement(register.lastName()).sendKeys("Disouky");
    }

    @And("Enter his birthday")
    public void dayOfBirth(){
        WebElement selectElement = register.dayOfBirthList;
        Select selectObject = new Select(selectElement);
        selectObject.selectByValue("8");
    }

    @And("Enter his birthmonth")
    public void monthOfBirth(){
        WebElement selectElement = register.monthOfBirthList;
        Select selectObject = new Select(selectElement);
        selectObject.selectByValue("7");
    }

    @And("Enter his birthyear")
    public void yearOfBirth(){
        WebElement selectElement = register.yearOfBirthList;
        Select selectObject = new Select(selectElement);
        selectObject.selectByValue("1998");
    }

    @And("Enter valid email")
    public void enterEmail(){
        register.email.sendKeys("amrtestmail@gmail.com");
    }

    @And("Enter any company name")
    public void enterCompanyName(){
        register.companyName.sendKeys("Automation Chapter");
    }

    @And("Enter valid password")
    public void enterPassword(){
        register.password.sendKeys("test@pass98");
    }

    @And("Confirm recently entered password")
    public void reEnterPassword(){
        register.confirmPassword.sendKeys("test@pass98");
    }

    @And("Click register button")
    public void clickRegister(){
        register.registrationButton.click();
    }

    @And("the user should be registered successfully")
    public void successRegistration(){
        Assert.assertEquals(driver.getCurrentUrl(),"https://demo.nopcommerce.com/registerresult/1?returnUrl=/");
    }

    @And("a success green message is displayed")
    public void message() throws InterruptedException {
        Thread.sleep(3000);
        String expectedResult = "Your registration completed";
        String actualResult = register.registrationMessage.getText();
        Assert.assertTrue(actualResult.contains(expectedResult));
    }
}
