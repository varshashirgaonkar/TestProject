package selenium_prj.po;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;



public class SignUpPO {
	
	@FindBy(xpath="//a[@href='/index.html']")
	WebElement home ;
	
	@FindBy(linkText="Sign Up")
	WebElement SignUp ;
	
	
	@FindBy(xpath = "//select[@name='payment_plan_id']")
	WebElement elm1 ;
	
	@FindBy(xpath = "//input[@name ='first_name']")
	WebElement firstname ;
	@FindBy(name="surname")
	WebElement surname;
	@FindBy(name="email")
	WebElement email;
	@FindBy(name="email_confirm")
	WebElement email_confirm;
	@FindBy(name="username")
	WebElement username;
	@FindBy(name="password")
	WebElement password;
	@FindBy(name="passwordconfirm")
	WebElement passwordconfirm;
	@FindBy(name="agreeTerms")
	WebElement agreeTerms;
	@FindBy(linkText="terms and conditions")
	WebElement terms;
	
	WebDriver driver;

	public SignUpPO(WebDriver driver) {
		this.driver=driver;
	}
	
	public void cliconsignup()
	{
		SignUp.click();
	}
	
	public void createSign(){
		
		Select s = new Select(elm1);
		s.selectByValue("1");
		//s.selectByIndex(1);
		//s.selectByVisibleText("Free Edition");
		//driver.findElement(By.name("first_name")).sendKeys("varsha");
		firstname.sendKeys("varsha");
		surname.sendKeys("shirgaonkar");
		email.sendKeys("varsha6.6.1992@gmail.com");
		email_confirm.sendKeys("varsha6.6.1992@gmail.com");
		username.sendKeys("varsha_shirgaonkar");
		password.sendKeys("varsha123");
		passwordconfirm.sendKeys("varsha123");
		agreeTerms.click();
		terms.click();
		
	}
	
	public void backtohome(){
		driver.navigate().back();
		home.click();
	}

}
