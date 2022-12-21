package org.example.stepsDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.example.pages.P04_Home;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import java.util.ArrayList;

public class S07_FollowUs {

    WebDriver driver = Hooks.driver;
    P04_Home FollowUs = new P04_Home(Hooks.driver);

    @Given("user clicks on facebook link")
    public void visitFacebook(){
        driver.findElement(FollowUs.facebookLink()).click();
    }

    @Given("user clicks on twitter link")
    public void visitTwitter(){driver.findElement(FollowUs.twitterLink()).click();}

    @Given("user clicks on rss link")
    public void visitRSS(){driver.findElement(FollowUs.rssLink()).click();}

    @Given("user clicks on youtube link")
    public void visitYoutube(){driver.findElement(FollowUs.youtubeLink()).click();}

    @Then("^user heads to \"(.*)\" page$")
    public void SocialMediaVisit(String url) throws InterruptedException {
        ArrayList<String> Tabs = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(Tabs.get(1));
        Assert.assertTrue(driver.getCurrentUrl().contains(url));
        Thread.sleep(2000);
        driver.switchTo().window(Tabs.get(0));
    }







    /*   Thread.sleep(2000);
        ArrayList<String> WindowControl = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(WindowControl.get(1));
*/

}
