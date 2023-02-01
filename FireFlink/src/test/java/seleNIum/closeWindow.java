package seleNIum;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class closeWindow {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();

		driver.get("file:///C:/Users/ssrag/Downloads/MultipleWindow.html");

		String parent = driver.getWindowHandle();

		driver.findElement(By.xpath("//input[@type='button']")).click();
		Thread.sleep(5000);

		Set<String> childs = driver.getWindowHandles();

		for (String h : childs) 
		{
			if (!(parent==h)) 
			{
				driver.switchTo().window(h);

				driver.close();
			}
		}
	}
}