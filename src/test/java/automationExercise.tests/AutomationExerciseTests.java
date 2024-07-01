package automationExercise.tests;

import automationExercise.pages.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utilities.tests.TestUtilities;

import java.time.Duration;

public class AutomationExerciseTests {

    private WebDriver driver;
    private HomePage homePage;
    private SignUpLoginPage signUpLoginPage;
    private DeleteAccountPage deleteAccountPage;
    private TestUtilities testUtilities;


    @Test
    public void verifyValidLogin(){
        testUtilities.registerNewAccount();
        homePage.assertOnHomePageText("AutomationExercise");
        homePage.navigateToSignupLoginPage();
        signUpLoginPage.assertOnLoginToAccountText("Login to your account");
        signUpLoginPage.enterCorrectEmailAndPassword("nada.emad@gmail.com","Nn@123456");
        signUpLoginPage.clickLoginButton();
        homePage.assertOnLoggedUserInfo("Nada Emad");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
        homePage.clickDeleteAccountButton();
        deleteAccountPage.assertOnAccountDeletedText("ACCOUNT DELETED!");

    }

    // Configurations
    @BeforeMethod
    public void beforeMethod(){
        driver = new ChromeDriver();
        homePage = new HomePage(driver);

        homePage.navigateToURL();
        driver.manage().window().maximize();

        signUpLoginPage = new SignUpLoginPage(driver);
        deleteAccountPage = new DeleteAccountPage(driver);
        testUtilities = new TestUtilities(driver);

    }

    @AfterMethod
    public void afterMethod(){
        driver.quit();
    }

}
