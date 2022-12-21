package org.example.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class P03_PasswordRecovery {

    WebDriver driver;

    public P03_PasswordRecovery(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    public By userEmail(){
        return By.id("Email");
    }

    public By recoverBtn(){
        return By.name("send-email");
    }

    public By confirmMsg(){
        return By.cssSelector("p[class=\"content\"]");
    }
}
