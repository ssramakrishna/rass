package qsp;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateAccount {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[text()='Log in']")).click();
		driver.findElement(By.xpath("//input[@class=\"button-1 register-button\"]")).click();
		driver.findElement(By.xpath("//input[@id='gender-male']")).click();
		driver.findElement(By.xpath("//input[@id='FirstName']")).sendKeys("Ram");
		driver.findElement(By.xpath("//input[@id='LastName']")).sendKeys("SB");
		driver.findElement(By.xpath("//input[@id='Email']")).sendKeys("ssramakrishna1252@gmail.com");
		driver.findElement(By.xpath("//input[@id='Password']")).sendKeys("Rama@1252");
		driver.findElement(By.xpath("//input[@id='ConfirmPassword']")).sendKeys("Rama@1252");
		driver.findElement(By.xpath("//input[@id='register-button']")).click();		
		driver.findElement(By.xpath("//a[@class='ico-logout']")).click();
	}
}







//String dw = driver.getWindowHandle();
//driver.switchTo().newWindow(WindowType.TAB);
//driver.get("https://fireflink.com/");
//String f = driver.getWindowHandle();
//driver.switchTo().window(dw);
//driver.manage().window().maximize();
//driver.manage().window().minimize();
