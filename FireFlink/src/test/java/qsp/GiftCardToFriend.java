package qsp;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class GiftCardToFriend {

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

		JavascriptExecutor j = (JavascriptExecutor) driver;
		j.executeScript("window.scrollBy(0,500)");

		driver.findElement(By.xpath("(//a[@href='/25-virtual-gift-card'])[2]")).click();
		driver.findElement(By.xpath("//input[@value='Email a friend']")).click();
		driver.findElement(By.xpath("//input[@class='friend-email']")).sendKeys("ssramakrishna1252@gmail.com");
		driver.findElement(By.xpath("//textarea[@id='PersonalMessage']")).sendKeys("RADHA");
		driver.findElement(By.xpath("//input[@name='send-email']")).click();

		driver.findElement(By.xpath("//a[@class='ico-logout']")).click();
		driver.quit();
	}
}
