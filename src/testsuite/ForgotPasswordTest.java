package testsuite;
/*4. Write down the following test into ‘ForgotPasswordTest’
class
1. userShouldNavigateToForgotPasswordPageSuccessfully
* click on the ‘Forgot your password’ link
* Verify the text ‘Forgot Your Password?’*/

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.Utility;

public class ForgotPasswordTest extends Utility {
    String BaseUrl = "https://opensource-demo.orangehrmlive.com/";
    @Before
    public void setUp() {
        openBrowser(BaseUrl);
    }
    @Test
    public void userShouldNavigateToForgotPasswordPageSuccessfully()
    {
        clickOnElement(By.xpath("//a[contains(text(),'Forgot your password?')]"));// Find the Forgot your password and click
        String ActMsg = getTextFromElement(By.xpath("//h1[contains(text(),'Forgot Your Password?')]"));
        System.out.println("Forgot password acutal message:" +ActMsg);
        messageValidation("Forgot Your Password?",ActMsg); //Validate actual and expected message
    }
    @After
    public void closedown() {
        closeBrowser();
    }
}
