package automationExercise.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class SignUpLoginPage {
    private WebDriver driver;

    // Locators
    private final By loginToAccount_text = By.cssSelector("div[class='login-form'] > h2");
    private final By loginEmail_textField = By.xpath("//input[@data-qa=\"login-email\"]");
    private final By loginPassword_textField = By.xpath("//input[@data-qa=\"login-password\"]");
    private final By loginButton = By.xpath("//button[@data-qa=\"login-button\"]");




    private final By userName_textArea = By.xpath("//input[@name='name']");
    private final By userEmail_textArea = By.xpath("//input[@data-qa='signup-email']");
    private final By signupButton = By.xpath("//button[@data-qa='signup-button']");


    public SignUpLoginPage(WebDriver driver) {
        this.driver = driver;
    }

    // Actions

    public String getLoginToAccountText(){
        return driver.findElement(loginToAccount_text).getText();
    }

    public void enterCorrectEmailAndPassword(String email, String password) {
        driver.findElement(loginEmail_textField).sendKeys(email);
        driver.findElement(loginPassword_textField).sendKeys(password);
    }

    public void clickLoginButton(){
        driver.findElement(loginButton).click();
    }

    // Validations
    public void assertOnLoginToAccountText(String expectedResult) {
        Assert.assertEquals(getLoginToAccountText(), expectedResult);
    }

    public void signup(String username, String userEmail){
        driver.findElement(userName_textArea).sendKeys(username);
        driver.findElement(userEmail_textArea).sendKeys(userEmail);

    }

    public void clickSignupButton(){
        driver.findElement(signupButton).click();
    }


}