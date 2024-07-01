package automationExercise.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class HomePage {
    private WebDriver driver;
    String HomePageURL = "https://automationexercise.com/";

    // Locators
    private final By homePageText = By.xpath("(//h1)[1]");
    private final By signupLogin_link = By.xpath("//a[@href=\"/login\"]");
    private final By loggedUserInfoText = By.xpath("(//a)[11]");
    private final By deleteAccountButton = By.xpath("//a[@href=\"/delete_account\"]");
    private final By logoutButton = By.xpath("//a[@href=\"/logout\"]");



    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    // Actions
    public void navigateToURL(){
        driver.navigate().to(HomePageURL);
    }

    public String getHomePageText(){
        return driver.findElement(homePageText).getText();
    }
    public void navigateToSignupLoginPage(){
        driver.findElement(signupLogin_link).click();
    }

    public void logout(){
        driver.findElement(logoutButton).click();
    }

    // Validations
    public void assertOnHomePageText(String expectedResult){
        Assert.assertEquals(getHomePageText(), expectedResult);
    }
    public void assertOnLoggedUserInfo(String username){
        Assert.assertEquals(driver.findElement(loggedUserInfoText).getText(), "Logged in as " + username);
    }

    public void clickDeleteAccountButton(){
        driver.findElement(deleteAccountButton).click();
    }



}