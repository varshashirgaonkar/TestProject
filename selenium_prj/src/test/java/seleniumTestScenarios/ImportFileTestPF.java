package seleniumTestScenarios;

import org.testng.annotations.Test;

import java.io.IOException;

import org.openqa.selenium.support.PageFactory;

import Base.BaseTest;
import selenium_prj.po.importFilePF;
import utility.ScreenShot;

public class ImportFileTestPF extends BaseTest{
	
	
	@Test
	public void validateImportFunctionality() throws IOException
	{
		String fileSavePath=projectRootpath+"/Reports/Screenshot";
		importFilePF fpf = PageFactory.initElements(driver, importFilePF.class);
		fpf.clickImportLink();
		ScreenShot.capture(driver, fileSavePath, "importfile");
		fpf.browseandselect();
		ScreenShot.capture(driver, fileSavePath, "importfile");
		String filePath="C:\\Users\\USER\\Documents\\Selenium documents\\usageOf Action Class.docx";
		fpf.selectFileToImport(filePath);
		ScreenShot.capture(driver, fileSavePath, "importfile");
		
	}
	
	// TODO Auto-generated method stub
			
}
