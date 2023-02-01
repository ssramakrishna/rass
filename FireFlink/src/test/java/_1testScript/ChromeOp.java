package _1testScript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;

public class ChromeOp 
{
	@Test(groups = "smoke")
	public void chromeOption() {
		WebDriverManager.chromedriver().setup();
		ChromeOptions op = new ChromeOptions();
		op.addArguments("--incognito");
		op.addArguments("--disable-notificatons");
		op.addArguments("--start-maximized");
		//op.addArguments("--headless");

		

		WebDriver driver = new ChromeDriver(op);
		driver.get("https://www.easemytrip.com/");
		System.out.println("Ram");
		
		driver.quit();

	}

}
