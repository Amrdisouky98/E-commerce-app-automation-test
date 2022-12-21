package org.example.pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class P01_Registration {

    WebDriver driver;

    public P01_Registration(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    public By genderRadio(){
        return By.id("gender-male");
    }

    public By firstName(){
        return By.id("FirstName");
    }

    public By lastName(){
        return By.id("LastName");
    }

    @FindBy(name = "DateOfBirthDay")
    public WebElement dayOfBirthList;

    @FindBy(name = "DateOfBirthMonth")
    public WebElement monthOfBirthList;

    @FindBy(name = "DateOfBirthYear")
    public WebElement yearOfBirthList;

    @FindBy(id ="Email")
    public WebElement email;

    @FindBy(id = "Company")
    public WebElement companyName;

    @FindBy(id = "Password")
    public WebElement password;

    @FindBy(id = "ConfirmPassword")
    public WebElement confirmPassword;

    @FindBy(id = "register-button")
    public WebElement registrationButton;

    @FindBy(xpath = "//div[@class=\"result\"]")
    public WebElement registrationMessage;

}
