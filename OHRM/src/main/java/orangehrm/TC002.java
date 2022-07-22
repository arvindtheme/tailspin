package orangehrm;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
//failure testcase - entered wrong password 
public class TC002 {
	@Test
	public void loginfailureHRM() {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin1");
		driver.findElement(By.id("btnLogin")).click();
		String msg = driver.findElement(By.id("spanMessage")).getText();
		System.out.println("Error Message" +msg);
		
	}
}
