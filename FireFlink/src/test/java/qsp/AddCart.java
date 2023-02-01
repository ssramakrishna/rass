package qsp;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class AddCart {
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
		int y = driver.findElement(By.xpath("(//a[@href='/25-virtual-gift-card'])[2]")).getLocation().getY();
		j.executeScript("window.scrollBy(0," + y + ")");

		String mainPageProductName = driver.findElement(By.xpath("(//a[@href='/25-virtual-gift-card'])[2]")).getText();

		driver.findElement(By.xpath("(//input[@class='button-2 product-box-add-to-cart-button'])[1]")).click();

		driver.findElement(By.xpath("//input[@class='recipient-name']")).sendKeys("Ram");
		driver.findElement(By.xpath("//input[@class='recipient-email']")).sendKeys("ssramakrishna1252@gmail.com");
		driver.findElement(By.xpath("//textarea[@class='message']")).sendKeys("Radha");

		// JavascriptExecutor k = (JavascriptExecutor) driver;
		// int x =
		// driver.findElement(By.xpath("//input[@id='addtocart_2_EnteredQuantity']]")).getLocation().getY();
		// k.executeScript("window.scrollBy(0,"+x+")");
		//
		// driver.findElement(By.xpath("//input[@id='addtocart_2_EnteredQuantity']]")).clear();
		// driver.findElement(By.xpath("//input[@class='qty-input
		// valid']")).sendKeys("2");

		driver.findElement(By.xpath("//input[@id='add-to-cart-button-2']")).click();

		System.out.println("Added to cart");

		driver.findElement(By.xpath("(//a[@class='ico-cart'])[2]")).click();

		String addedProductName = driver.findElement(By.xpath("//a[@class='product-name']")).getText();
		System.out.println("Added product name:  " + addedProductName);

		if (mainPageProductName.equals(addedProductName)) {
			System.out.println("mainPageProductName" + "and" + "addedProductName" + "are SAME");

		} else {
			System.out.println("NOT SAME");
		}
		System.out.println("Done");

		System.out.println("LOGGING OUT WITHIN 2 SEC");

		driver.findElement(By.xpath("//a[@class='ico-logout']")).click();
		Thread.sleep(2000);

		driver.quit();
	}

}
