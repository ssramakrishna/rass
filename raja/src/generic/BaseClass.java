package generic;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import pom.Login;
public class BaseClass 
{
	public WebDriver a;
	@BeforeClass
	public void openBrowser()
	{
		Reporter.log("openBrowser",true);
		a= new ChromeDriver();
		a.manage().window().maximize();
		a.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	@BeforeMethod
	public void login() throws IOException
	{
		Reporter.log("Login",true);
		a.get("url");
		
		FileLib f = new FileLib();
		String url = f.getproperty("url");
		String un = f.getproperty("un");
		String pwd = f.getproperty("pwd");
		
		a.get(url);
		Login l = new Login(a);
		l.setLogin(un,pwd);
		
	}
	@AfterMethod
	public void logout()
	{
		Reporter.log("Log out",true);
	}
	@AfterClass
	public void closeBrowser()
	{
		Reporter.log("close Browser",true);
		a.close();
	}
}
