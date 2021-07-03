package homePage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Login {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "F:\\Software\\Java\\Tools\\Selenium\\Drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver1 = new ChromeDriver();
		driver1.get("https://www.guru99.com/software-testing.html");
		
		System.setProperty("webdriver.gecko.driver", "F:\\Software\\Java\\Tools\\Selenium\\Drivers\\geckodriver-v0.29.1-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.guru99.com/software-testing.html");
	}

}
