package qsp;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
public class AddingTO_Wishlist {
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

		driver.findElement(By.xpath("(//a[@href='/25-virtual-gift-card'])[2]")).click();

		driver.findElement(By.xpath("//input[@class='recipient-name']")).sendKeys("Rama");
		driver.findElement(By.xpath("//input[@class='recipient-email']")).sendKeys("ssramakrishna1252@gmail.com");

		driver.findElement(By.xpath("//input[@id='add-to-wishlist-button-2']")).click();

		driver.findElement(By.xpath("(//span[@class='cart-label'])[2]")).click();

		Thread.sleep(2000);

		driver.findElement(By.xpath("//a[@class='ico-logout']")).click();
		System.out.println("Gift card added to wishlist");
		driver.quit();
	}
}
