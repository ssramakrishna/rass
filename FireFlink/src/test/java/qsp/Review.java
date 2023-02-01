package qsp;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Review {

	public static void main(String[] args) throws InterruptedException {
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

		driver.findElement(By.xpath("(//a[@href='/141-inch-laptop'])[2]")).click();
		driver.findElement(By.xpath("(//a[@href='/productreviews/31'])[2]")).click();
		driver.findElement(By.xpath("//input[@class='review-title']")).sendKeys("Good");
		driver.findElement(By.xpath("//textarea[@id='AddProductReview_ReviewText']")).sendKeys("Good Good");
		driver.findElement(By.xpath("//input[@checked='checked']")).click();
		driver.findElement(By.xpath("//input[@name='add-review']")).click();

		driver.findElement(By.xpath("//a[@class='ico-logout']")).click();
		Thread.sleep(2000);

		driver.quit();
	}
}
