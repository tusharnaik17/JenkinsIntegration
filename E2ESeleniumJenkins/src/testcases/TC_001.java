package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TC_001 {
	
	@Test
	public void testcase() {
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		ChromeDriver chromeDriver = new ChromeDriver();
		chromeDriver.get("https://facebook.com");
		chromeDriver.findElementById("email").sendKeys("Hello");
		chromeDriver.findElement(By.id("pass")).sendKeys("hello");
		chromeDriver.quit();
	}
}
