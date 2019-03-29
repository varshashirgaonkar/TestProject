package seleniumTestScenarios;

import java.io.IOException;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import Base.BaseTest;
import selenium_prj.po.SignUpPO;
import utility.ScreenShot;


public class SignUpTest extends BaseTest{
	
	@Test
	public void validateSignupFunctionality() throws IOException
	{
		String fileSavePath=projectRootpath+"/Reports/Screenshot";
		setDriver();
		openUrl();
		SignUpPO sp = PageFactory.initElements(driver, SignUpPO.class);
		sp.cliconsignup();
		System.out.println("Take screenshot1");
		ScreenShot.capture(driver, fileSavePath, "signup");
		
		sp.createSign();
		System.out.println("Take screenshot2");
		ScreenShot.capture(driver, fileSavePath, "signup");
		
		sp.backtohome();
		System.out.println("Take screenshot3");
		ScreenShot.capture(driver, fileSavePath, "signup");
		
		
		
	}

}
