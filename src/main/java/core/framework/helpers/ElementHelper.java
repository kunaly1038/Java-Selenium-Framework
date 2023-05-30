package core.framework.helpers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ElementHelper {
    public static void sendKeys(WebDriver driver, By locator, String text) {
        WebElement element = driver.findElement(locator);
        element.sendKeys(text);
    }

    public static void click(WebDriver driver, By locator) {
        WebElement element = driver.findElement(locator);
        element.click();
    }

    public static String getText(WebDriver driver, By locator) {
        WebElement element = driver.findElement(locator);
        return element.getText();
    }
}
