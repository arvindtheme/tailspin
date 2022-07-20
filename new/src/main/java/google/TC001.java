package google;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TC001 {
	@Test
	public void google() {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.google.co.in/");
		String title = driver.getTitle();
		System.out.println("Title - "+title);
		Assert.assertEquals("Google", title);
		System.out.println("testing done");
	}
}
