package seleniumTestScenarios;

import java.io.IOException;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import Base.BaseTest;
import selenium_prj.po.loginPF;
import utility.ScreenShot;

public class loginTestPF extends BaseTest{
	
	
	@Test
	public void validateLoginFunctionality() throws IOException
	{
		String fileSavePath=projectRootpath+"/Reports/Screenshot";
		setDriver();
		openUrl();
		ScreenShot.capture(driver, fileSavePath, "login");
		
		//loginPO lp= new loginPO(driver);
		loginPF lp = PageFactory.initElements(driver, loginPF.class);
		lp.findElementsOnWebpage();
		ScreenShot.capture(driver, fileSavePath, "login");
		
		lp.checkPageTitle();
		
		ScreenShot.capture(driver, fileSavePath, "login");
		
	}
	
	// TODO Auto-generated method stub
			
}
