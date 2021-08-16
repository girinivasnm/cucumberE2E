package stepDefinition;

import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class CommonStepDefinition extends BaseClass {

	@Before
	public void setUp() {

		System.setProperty("webdriver.chrome.driver",
				"E:\\BACKUP's\\Wipro Laptop Backup\\Selenium\\Softwares\\chromedriver.exe");
		driver = new ChromeDriver();
	}

	@After
	public void tearDown() {
		driver.close();
		driver.quit();
	}
	
}
