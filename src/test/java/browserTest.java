import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class browserTest {
	public static void main(String[] args) {
		String userPath = System.getProperty("user.dir");
		System.out.print(userPath);
		System.setProperty("webdriver.chrome.driver",
				userPath + "\\driver\\chrome\\chromedriver.exe");
//		WebDriver driver = new FirefoxDriver();
		WebDriver driver = new ChromeDriver();
		driver.get("https://github.com/mozilla/geckodriver/releases");
		driver.close();
	}
}
