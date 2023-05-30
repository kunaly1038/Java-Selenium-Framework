package core.tests;

import core.framework.helpers.ConfigReader;
import net.bytebuddy.implementation.bytecode.Throw;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import core.framework.pages.LoginPageHelper;

public class loginTest extends BaseTest {
        LoginPageHelper loginPage = new LoginPageHelper(driver);

    String username = ConfigReader.getProperty("username");
    String password = ConfigReader.getProperty("password");

    @BeforeClass
    public void setupLoginPage() {
        loginPage = new LoginPageHelper(driver);
    }

    @Test
    public void testLogin() throws Throwable {

        loginPage.enterUsername(username);
        loginPage.enterPassword(password);
        loginPage.clickLoginButton();
        Thread.sleep(5000);
        // HomePage homePage = new HomePage(driver);
        // String welcomeMessage = homePage.getWelcomeMessage();
        // Assert.assertEquals(welcomeMessage, "Welcome, testuser!");
    }
}
