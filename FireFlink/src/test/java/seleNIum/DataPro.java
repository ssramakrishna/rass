package seleNIum;

import java.io.IOException;
import java.time.Duration;
import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;

public class DataPro 
{
	@Test(dataProvider = "testData")
	public void test(String userName, String password) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[@href='/login']")).click();
		driver.findElement(By.xpath("//input[@id='Email']")).sendKeys(userName);
		driver.findElement(By.xpath("//input[@id='Password']")).sendKeys(password);

		driver.findElement(By.xpath("//input[@class='button-1 login-button']")).click();
		driver.findElement(By.xpath("//a[@class='ico-logout']")).click();
		driver.quit();
	}

	@DataProvider(name = "testData")
	private Object[][] testData() throws EncryptedDocumentException, IOException {
		return Login.readExcell("rrr");
	}
}
