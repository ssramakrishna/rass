package qsp;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
public class NewsletterSubscrib {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[@href='/login']")).click();
		driver.findElement(By.xpath("//input[@id='Email']")).sendKeys("ramssb007@gmail.com");
		driver.findElement(By.xpath("//input[@id='Password']")).sendKeys("Rama@1252");
		driver.findElement(By.xpath("//input[@class='button-1 login-button']")).click();
		
		driver.findElement(By.xpath("//input[@id='newsletter-email']")).sendKeys("ramssb007@gmail.com");
		driver.findElement(By.xpath("//input[@id='newsletter-subscribe-button']")).click();
		
		System.out.println("SubScribed");
		driver.findElement(By.xpath("//a[@class='ico-logout']")).click();
		
		driver.quit();
	}

}
