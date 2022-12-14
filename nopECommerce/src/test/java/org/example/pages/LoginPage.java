package org.example.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    WebDriver driver;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    public By emailText(){
        return By.id("Email");
    }

    public By passwordText(){
        return By.id("Password");
    }

    public By LoginButton(){
        return By.xpath("//button[@class='button-1 login-button']");
    }

    public By forgotPassBtn(){
        return By.cssSelector("span[class =\"forgot-password\"]");
    }


}
