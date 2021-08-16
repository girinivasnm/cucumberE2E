package stepDefinition;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class loginPageStepDefinition extends BaseClass {

	/*
	 * WebDriver driver;
	 * 
	 * @Before public void setUp() {
	 * 
	 * System.setProperty("webdriver.chrome.driver",
	 * "E:\\BACKUP's\\Wipro Laptop Backup\\Selenium\\Softwares\\chromedriver.exe");
	 * driver = new ChromeDriver(); }
	 */

	@Given("^User opens the login page$")
	public void openLoginPage() {
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");

	}

	@When("^User provides the necessary details$")
	public void user_provides_the_necessary_details() {
		driver.findElement(By.id("email")).sendKeys("abc");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("abc");
		driver.findElement(By.name("login")).click();
	}

	@Then("^User should be successfully landed in the home page$")
	public void user_should_be_successfully_landed_in_the_home_page() {
		driver.getTitle().compareTo("Facebook");

	}


}
