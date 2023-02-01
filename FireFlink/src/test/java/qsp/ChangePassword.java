package qsp;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class ChangePassword {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[@href='/login']")).click();
		driver.findElement(By.xpath("//input[@id='Email']")).sendKeys("ramssb007@gmail.com");
		driver.findElement(By.xpath("//input[@id='Password']")).sendKeys("Radha@1252");
		driver.findElement(By.xpath("//input[@class='button-1 login-button']")).click();
		
		JavascriptExecutor j = (JavascriptExecutor) driver;
		j.executeScript("window.scrollTo(0,document.body.scrollHeight)");
		
		
		driver.findElement(By.xpath("(//a[@class='account'])[2]")).click();
		driver.findElement(By.xpath("//a[text()='Change password']")).click();
		driver.findElement(By.id("OldPassword")).sendKeys("Radha@1252");
		driver.findElement(By.xpath("//input[@id='NewPassword']")).sendKeys("Rama@1252");
		driver.findElement(By.id("ConfirmNewPassword")).sendKeys("Rama@1252");
		driver.findElement(By.xpath("//input[@class='button-1 change-password-button']")).click();
		
		driver.findElement(By.xpath("//a[@class='ico-logout']")).click();
		Thread.sleep(2000);
		
		System.out.println("password has been changed");

		driver.quit();
;
		
	}

}
