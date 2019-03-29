package selenium_prj.po;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class importFilePF {

	@FindBy(how=How.LINK_TEXT,using="Import")
	WebElement importLink;
	@FindBy(how=How.NAME,using="import_file")
	WebElement chooseFile;
	
	WebDriver driver;
	
	public importFilePF(WebDriver driver)
	{
		this.driver=driver;
	}

	public void clickImportLink()
	{
		//driver.switchTo().frame("mainpanel");
		importLink.click();
	}
	
	public void browseandselect()
	{
		chooseFile.click();
	}

	public void selectFileToImport(String filePath) {
		uploadFileWithRobot(filePath);
		System.out.println("file imported successfully");
		
	}
	
	public void setContentToClipboard(String strContent){
		StringSelection stringSelection = new StringSelection(strContent);
        Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
        clipboard.setContents(stringSelection, null);
	}
	
	 //File upload by Robot Class
    public void uploadFileWithRobot (String strContent) {
    	setContentToClipboard(strContent);
 
        Robot robot = null;
 
        try {
            robot = new Robot();
        } catch (AWTException e) {
            e.printStackTrace();
        }
 
        robot.delay(250);
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);
        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_V);
        robot.keyRelease(KeyEvent.VK_V);
        robot.keyRelease(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.delay(150);
        robot.keyRelease(KeyEvent.VK_ENTER);
    }    
}







