package core.framework.pages;

import core.framework.helpers.ElementHelper;
import core.framework.locators.LoginPageLocators;
import org.openqa.selenium.WebDriver;

public class LoginPageHelper {
    private final WebDriver driver;

    public LoginPageHelper(WebDriver driver) {
        this.driver = driver;
    }

    public void enterUsername(String username) {
        ElementHelper.sendKeys(driver, LoginPageLocators.USERNAME_FIELD, username);
    }

    public void enterPassword(String password) {
        ElementHelper.sendKeys(driver, LoginPageLocators.PASSWORD_FIELD, password);
    }

    public void clickLoginButton() {
        ElementHelper.click(driver, LoginPageLocators.LOGIN_BUTTON);
    }
}
