package seleniumTestScenarios;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import Base.BaseTest;
import selenium_prj.po.companiesPF;
import selenium_prj.po.companiesPO;
import utility.ScreenShot;

public class companiesTestPF extends BaseTest{

	
	@Test
	public void validateCompanyFunctionality() throws IOException
	{
		String fileSavePath=projectRootpath+"/Reports/Screenshot";
		companiesPF cp= PageFactory.initElements(driver, companiesPF.class);
		cp.selectNewCompanies();
		ScreenShot.capture(driver, fileSavePath, "companies");
		cp.selectCategory();
		ScreenShot.capture(driver, fileSavePath, "companies");
	}
	
	// TODO Auto-generated method stub
			
	
}
