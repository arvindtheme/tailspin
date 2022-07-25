package tailspin;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GetTitle {
	@Test
	public void google() {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://localhost:5001/");
		String title = driver.getTitle();
		System.out.println("Title - "+title);
		Assert.assertEquals("TailSpin", title);
		System.out.println("testing done");
	}
}
