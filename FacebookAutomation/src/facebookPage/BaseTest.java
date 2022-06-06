package facebookPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTest extends UtilityFunctions {
	public static WebDriver driver =null;

	public static void initializeWebdriver() {
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"/driver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/r.php?locale=en_GB&display=page");
		driver.manage().window().maximize();
	}

	public static void tearDown() {
		driver.quit();
	}

	
}






