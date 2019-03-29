package Base;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTest {

	protected static WebDriver driver;
	protected static String projectRootpath;
	
	static
	{
		projectRootpath = System.getProperty("user.dir");
	}
	
	public static void setDriver() {
		// derive project location on machine
		
		//navigate to the folder with google chrome driver
		String chromedriverpath = projectRootpath + "/google_driver/chromedriver.exe";
		//set properties
		System.setProperty("webdriver.chrome.driver", chromedriverpath); 
		
	}
	
	public static void openUrl() {
		driver = new ChromeDriver();
		driver.get("https://classic.crmpro.com/index.html");//get will wait for ur page to load

		driver.manage().window().maximize(); //method cascading
		driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	}
}
