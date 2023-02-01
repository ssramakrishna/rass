package seleNIum;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ChromeO 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriverManager.chromedriver().setup();

		ChromeOptions op = new ChromeOptions();
		op.addArguments("--disable-notifications");
		op.addArguments("--incognito");

		Thread.sleep(3000);
		WebDriver driver = new ChromeDriver(op);

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://www.easemytrip.com/");

	}
}