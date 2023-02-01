package qsp;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Order {
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
		driver.findElement(By.xpath("(//input[@class='button-2 product-box-add-to-cart-button'])[2]")).click();
		driver.findElement(By.xpath("(//span[@class='cart-label'])[1]")).click();

		WebElement e = driver.findElement(By.xpath("//select[@name='CountryId']"));
		Select s = new Select(e);
		s.selectByVisibleText("India");

		driver.findElement(By.xpath("//input[@id='termsofservice']")).click();
		driver.findElement(By.xpath("//button[@id='checkout']")).click();

		WebElement e1 = driver.findElement(By.xpath("//select[@id='BillingNewAddress_CountryId']"));
		Select s1 = new Select(e1);
		s1.selectByVisibleText("India");

		driver.findElement(By.xpath("//input[@id='BillingNewAddress_City']")).sendKeys("Bangalore");
		driver.findElement(By.xpath("//input[@id='BillingNewAddress_Address1']")).sendKeys("xyz");
		driver.findElement(By.xpath("//input[@name='BillingNewAddress.ZipPostalCode']")).sendKeys("560068");
		driver.findElement(By.xpath("//input[@name='BillingNewAddress.PhoneNumber']")).sendKeys("1111111111");
		driver.findElement(By.xpath("(//input[@class='button-1 new-address-next-step-button'])[1]")).click();
		driver.findElement(By.xpath("//input[@id='PickUpInStore']")).click();
		driver.findElement(By.xpath("(//input[@class='button-1 new-address-next-step-button'])[2]")).click();
		driver.findElement(By.xpath("//input[@class='button-1 payment-method-next-step-button']")).click();
		driver.findElement(By.xpath("//input[@class='button-1 payment-info-next-step-button']")).click();
		driver.findElement(By.xpath("//input[@class='button-1 confirm-order-next-step-button']")).click();
		driver.findElement(By.xpath("//input[@class='button-2 order-completed-continue-button']")).click();

		System.out.println("order placed");
		Thread.sleep(2000);

		driver.findElement(By.xpath("//a[@class='ico-logout']")).click();
		Thread.sleep(2000);

		driver.quit();
	}
}

//		

//driver.findElement(By.xpath("//input[@class='button-2 order-completed-continue-button']")).click();
//Thread.sleep(2000);

//driver.findElement(By.xpath(" "))

//
//Thread.sleep(10);
//
//int y = driver.findElement(By.xpath("(//a[@href='/141-inch-laptop'])[2]")).getLocation().getX();
//JavascriptExecutor r = (JavascriptExecutor) driver;
//r.executeScript("window.scrollBy(0,"+y+")");
//driver.findElement(By.xpath("(//a[@href='/141-inch-laptop'])[2]")).click();
//
//WebElement e = driver.findElement(By.xpath("//select[@name='CountryId']"));
//
//Select s = new Select(e);
//s.selectByVisibleText("India");
