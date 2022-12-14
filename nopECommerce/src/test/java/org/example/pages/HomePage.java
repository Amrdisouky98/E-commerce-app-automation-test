package org.example.pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
    WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    public By registerPageButton(){
        return By.cssSelector("a[href=\"/register?returnUrl=%2F\"]");
    }

    public By loginPageButton(){
        return By.className("ico-login");
    }
}
