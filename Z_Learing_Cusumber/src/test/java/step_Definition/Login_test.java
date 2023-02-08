package step_Definition;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Login_test {

	WebDriver driver;

	@Given("browser is open")
	public void browser_is_open() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	}

	@And("application is displayed")
	public void application_is_displayed() {
		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
	}

	@When("user clicks on login link")
	public void user_clicks_on_login_link() {

		driver.findElement(By.xpath("//a[@href='/login']")).click();

	}

	@When("user enters valid credentials")
	public void user_enters_valid_credentials() {
		driver.findElement(By.xpath("//input[@id='Email']")).sendKeys("ramssb007@gmail.com");
		driver.findElement(By.xpath("//input[@id='Password']")).sendKeys("Rama@1252");
	}

	@When("user clicks on ogin button")
	public void user_clicks_on_ogin_button() {
		driver.findElement(By.xpath("//input[@class='button-1 login-button']")).click();
	}

	@Then("user must be successfully logged in")
	public void user_must_be_successfully_logged_in() {
		System.out.println("Login done");

	}

	@Then("browser closes")
	public void browser_closes() {
		driver.findElement(By.xpath("//a[@class='ico-logout']")).click();
		driver.quit();
	}
}
