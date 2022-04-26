package testsuite;
/*3. Write down the following test into ‘LoginTest’ class
1. userSholdLoginSuccessfullyWithValidCredentials
* Enter “Admin” username
* Enter “admin123 password
* Click on ‘LOGIN’ button
* Verify the ‘Welcome’ text is display*/

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.Utility;

public class LoginTest extends Utility
{
    String BaseUrl = "https://opensource-demo.orangehrmlive.com/";
    @Before
    public void setUp() {
        openBrowser(BaseUrl);
    }
    @Test
    public void userSholdLoginSuccessfullyWithValidCredentials()
    {
        sendTextToElement(By.name("txtUsername"),"Admin");//Find username element and enter the username
        sendTextToElement(By.name("txtPassword"),"admin123"); //Find password element and enter the password
        clickOnElement(By.id("btnLogin"));//Find Login Button element and click

        String ActMsg = getTextFromElement(By.xpath("//a[@id='welcome']"));
        System.out.println("Actual Message :" +ActMsg);
        boolean x = ActMsg.contains("Welcome");//if login successful give true value
        boolean y = true;
        //Validate actual and expected message
        Assert.assertEquals("Massage is not as expected:",x,y);//x && y = true
    }
    @After
    public void closedown()
    {
        closeBrowser();
    }

}
