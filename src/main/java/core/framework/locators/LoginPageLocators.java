package core.framework.locators;
import org.openqa.selenium.By;

public class LoginPageLocators {
    public static final By USERNAME_FIELD = By.cssSelector("[name=\"username\"]");
    public static final By PASSWORD_FIELD = By.cssSelector("[name=\"password\"]");
    public static final By LOGIN_BUTTON = By.cssSelector("[type=\"submit\"]");
}