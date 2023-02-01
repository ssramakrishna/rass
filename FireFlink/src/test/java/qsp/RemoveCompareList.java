package qsp;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class RemoveCompareList {

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

		driver.findElement(By.xpath("(//a[@href='/build-your-own-computer'])[2]")).click();
		driver.findElement(By.xpath("//input[@class='button-2 add-to-compare-list-button']")).click();
		driver.findElement(By.xpath("//img[@src='/Themes/DefaultClean/Content/images/logo.png']")).click();

		driver.findElement(By.xpath("(//a[@href='/build-your-own-expensive-computer-2'])[2]")).click();
		driver.findElement(By.xpath("//input[@class='button-2 add-to-compare-list-button']")).click();

		driver.findElement(By.xpath("(//input[@type='button'])[2]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//input[@type='button'])[2]")).click();
		Thread.sleep(2000);

		System.out.println("Both product removed from compare List");
		System.out.println("Logging Out");

		driver.findElement(By.xpath("//a[@class='ico-logout']")).click();
		Thread.sleep(2000);

		driver.quit();
	}

}
