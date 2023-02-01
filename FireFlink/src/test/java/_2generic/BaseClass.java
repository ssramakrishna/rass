package _2generic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import _1testScript.Module;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass 
{
	public WebDriver driver;

	@BeforeSuite
	public void beforesuite() {
		System.out.println("beforesuite");
	}

	@BeforeClass
	public void beforeclass() {
		WebDriverManager.chromedriver().setup();
		ChromeOptions op = new ChromeOptions();
		op.addArguments("--incognito");
		op.addArguments("--disable-notificatons");
		op.addArguments("--start-maximized");
		// op.addArguments("--headless");

		driver = new ChromeDriver(op);
		System.out.println("beforeclass");
	}

	@BeforeMethod
	public void beforemethod() {
		driver.get("https://www.easemytrip.com/");
		System.out.println("beforemethod");
	}

	@AfterMethod
	public void aftermethod() {
		System.out.println("beforemethod");
	}

	@AfterClass
	public void afterclass() {
		System.out.println("beforeclass");
	}

	@AfterSuite
	public void aftersuite() {
		System.out.println("beforesuite");
	}

}
