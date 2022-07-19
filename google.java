package com.sample.pages;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class google {
public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
	ChromeDriver driver = new ChromeDriver();
	driver.get("https://www.google.co.in/");
	String title = driver.getTitle();
	System.out.println("Title - "+title);
	Assert.assertEquals("Goo", title);
	System.out.println("testing done");
	
}
}
