package automationExercise.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AccountInfoPage {

    WebDriver driver;

    public AccountInfoPage(WebDriver driver){
        this.driver = driver;
    }


    private final By femaleGender_radioButton = By.id("id_gender2");
    private final By password_field = By.id("password");
    private final By days_field = By.id("days");
    private final By months_field = By.id("months");
    private final By year_field = By.id("years");
    private final By newsletter_checkbox = By.id("newsletter");
    private final By option_checkbox = By.id("optin");
    private final By firstName_textField = By.id("first_name");
    private final By lastName_textField = By.id("last_name");
    private final By company_textField = By.id("company");
    private final By address1_field = By.id("address1");
    private final By address2_field = By.id("address2");
    private final By country_field = By.id("country");
    private final By state_field = By.id("state");
    private final By city_field = By.id("city");
    private final By zipCode_field = By.id("zipcode");
    private final By mobileNumber_field = By.id("mobile_number");
    private final By createAccountButton = By.xpath("//button[@data-qa=\"create-account\"]");


    public void fillAccountInfo(String password, String days, String months, String year){
        driver.findElement(femaleGender_radioButton).click();
        driver.findElement(password_field).sendKeys(password);
        driver.findElement(days_field).sendKeys(days);
        driver.findElement(months_field).sendKeys(months);
        driver.findElement(year_field).sendKeys(year);
        driver.findElement(newsletter_checkbox).click();
        driver.findElement(option_checkbox).click();
    }

    public void fillAddressInfo(String firstName, String lastName, String company, String address1, String address2,
                                String country, String state, String city, String zipcode, String mobile_number){

        driver.findElement(firstName_textField).sendKeys(firstName);
        driver.findElement(lastName_textField).sendKeys(lastName);
        driver.findElement(company_textField).sendKeys(company);
        driver.findElement(address1_field).sendKeys(address1);
        driver.findElement(address2_field).sendKeys(address2);
        driver.findElement(country_field).sendKeys(country);
        driver.findElement(state_field).sendKeys(state);
        driver.findElement(city_field).sendKeys(city);
        driver.findElement(zipCode_field).sendKeys(zipcode);
        driver.findElement(mobileNumber_field).sendKeys(mobile_number);
    }

    public void clickCreateAccountButton(){
        driver.findElement(createAccountButton).click();
    }

}
