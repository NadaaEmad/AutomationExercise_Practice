package automationExercise.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class DeleteAccountPage {
    private WebDriver driver;

    //Locators
    private final By accountDeletedText = By.xpath("//h2/b");
    public DeleteAccountPage(WebDriver driver){
        this.driver = driver;
    }

    //*[@id="form"]/div/div/div/h2/b
    //Validations
    public void assertOnAccountDeletedText(String expectedResult){
        Assert.assertEquals(driver.findElement(accountDeletedText).getText(), expectedResult);
    }
}
