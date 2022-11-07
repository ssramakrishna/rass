package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login 
{
	@FindBy()
	private WebElement lgbx;
	
	@FindBy()
	private WebElement pwdbx;

	public Login(WebDriver a) 
	{
		PageFactory.initElements(a, this);
	}

	public void setLogin(String un, String pwd) 
	{
		lgbx.sendKeys(un);
		pwdbx.sendKeys(pwd);
		
	}

}
