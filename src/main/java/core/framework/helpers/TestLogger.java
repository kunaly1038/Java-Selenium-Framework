package core.framework.helpers;

import org.testng.Reporter;

public class TestLogger {
    public static void log(String message) {
        Reporter.log(message);
    }
}
