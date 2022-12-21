package org.example.pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class P04_Home {

    WebDriver driver;

    public P04_Home(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public By registerPageButton() {
        return By.cssSelector("a[href=\"/register?returnUrl=%2F\"]");
    }

    public By loginPageButton() {
        return By.className("ico-login");
    }

    public By searchField() {
        return By.id("small-searchterms");
    }

    public By searchBtn() {
        return By.xpath("//button[text()='Search']");
    }

    @FindBy(id = "customerCurrency")
    public WebElement currencyDDL;

    public By apparelCategory() {
        return By.cssSelector("a[href=\"/apparel\"]");
    }

    public By subCategory(){
        return By.cssSelector("ul[class=\"top-menu notmobile\"] a[href=\"/shoes\"]");
    }

    public By homeSliders(String sliderno){
        return By.xpath("(//a[@href=\"http://demo.nopcommerce.com/\"])["+sliderno+"]");
    }

    public By facebookLink(){
        return By.cssSelector("[href=\"http://www.facebook.com/nopCommerce\"]");
    }

    public By twitterLink(){
        return By.cssSelector("[href=\"https://twitter.com/nopCommerce\"]");
    }

    public By rssLink(){
        return By.cssSelector("[href=\"/news/rss/1\"]");
    }

    public By youtubeLink(){
        return By.cssSelector("[href=\"http://www.youtube.com/user/nopCommerce\"]");
    }
    public By HTCwish (){return By.cssSelector("button[class=\"button-2 add-to-wishlist-button\"]");}
    public By wishlistSuccessMsg (){return By.cssSelector("div[class = \"bar-notification success\"]");}
    public By wishlistItemsNumber(){return By.cssSelector("span[class=\"wishlist-qty\"]");}
}
