package qsp;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class AddCartAndRemove {

	public static void main(String[] args) throws AWTException, InterruptedException {
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
		
		driver.findElement(By.xpath("(//a[@href='/141-inch-laptop'])[4]")).click();
		driver.findElement(By.xpath("//input[@id='add-to-cart-button-31']")).click();
		
		driver.findElement(By.xpath("//span[text()='Shopping cart']")).click();
		driver.findElement(By.name("itemquantity2976457")).clear();
		Thread.sleep(6000);
		driver.findElement(By.name("itemquantity2976457")).sendKeys("0");
		
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
		driver.findElement(By.className("ico-logout")).click();
		
		driver.quit();
		
		

		
		
	}

}
