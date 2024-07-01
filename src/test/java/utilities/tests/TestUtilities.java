package utilities.tests;

import automationExercise.pages.AccountCreatedPage;
import automationExercise.pages.AccountInfoPage;
import automationExercise.pages.HomePage;
import automationExercise.pages.SignUpLoginPage;
import com.beust.ah.A;
import org.openqa.selenium.WebDriver;

public class TestUtilities {

    WebDriver driver;
    HomePage homePage;
    SignUpLoginPage signUpLoginPage;
    AccountInfoPage accountInfoPage;
    AccountCreatedPage accountCreatedPage;

    public TestUtilities(WebDriver driver){
        this.driver = driver;
        homePage = new HomePage(driver);
        signUpLoginPage = new SignUpLoginPage(driver);
        accountInfoPage = new AccountInfoPage(driver);
        accountCreatedPage = new AccountCreatedPage(driver);
    }

    public void registerNewAccount(){
        homePage.navigateToSignupLoginPage();
        signUpLoginPage.signup("Nada Emad", "nada.emad@gmail.com");
        signUpLoginPage.clickSignupButton();
        accountInfoPage.fillAccountInfo("Nn@123456", "25", "August" ,"2000");
        accountInfoPage.fillAddressInfo("Nada", "Emad", "Giza Systems", "New Cairo", "Plot 125",
                "Canada", "Canada", "Canada", "123456789", "01005457869");
        accountInfoPage.clickCreateAccountButton();
        accountCreatedPage.clickContinue();
        homePage.logout();

    }
}
