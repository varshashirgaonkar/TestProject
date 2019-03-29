package selenium_prj.po;

import java.util.List;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import utility.ScreenShot;

public class loginPF {
	//implementation 1
	//@FindBy(name="username")
	//WebElement username;
	
	//implementation 2
	@FindBy(how=How.NAME,using="username")
	WebElement username;
	
	//@FindBy(name="password")
	//WebElement password;
	
	@FindBy(how=How.NAME,using="password")
	WebElement password;
	
//	@FindBy(xpath="//input[@type='submit']")
	//WebElement loginbutton; 
	
	@FindBy(how=How.XPATH,using="//input[@type='submit']")
	WebElement loginbutton;
	
	WebDriver driver;
	
	
	//String fileSavePath=projectRootpath+"/Reports/Screenshot";

	public loginPF(WebDriver driver) {
		this.driver=driver;
	}

	public void findElementsOnWebpage()
	{
		username.sendKeys("varsha_shirgaonkar");
		password.sendKeys("varsha123");
		//ScreenShot.capture(driver, fileSavePath, "login");
		
		driver.manage().timeouts().pageLoadTimeout(10000, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10000, TimeUnit.SECONDS);
		loginbutton.click();
	}

	public void checkPageTitle()
	{
		String s1 = "CRMPRO";
		String elm= driver.getTitle();

		//String actualValue=elm.getText();

		if(s1.equals(elm)){
			System.out.println("pass");
			System.out.println(elm);
		}else{
			System.out.println("fail");
		}
	}

	
}


