package com.sample.pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.aventstack.extentreports.ExtentTest;
import com.sample.testng.api.base.ProjectSpecificMethods;


public class orangeHRM extends ProjectSpecificMethods {


	public orangeHRM(RemoteWebDriver driver, ExtentTest node){
		this.driver = driver;
		this.node = node;
				
	}

	 public orangeHRM enterUserName(String userName){
		clearAndType(locateElement("id","txtUsername"), userName);
		return this;
	 }
	 
	 public orangeHRM enterPassword (String password){
			clearAndType(locateElement("id","txtPassword"), password);
			return this;
		 }
	 
	 public orangeHRM clickLogin(){
		 clickje(locateElement("id","btnLogin"));
		 return this;
	 }
	 public orangeHRM getTitle(){
		 String title = driver.getTitle();
		 System.out.println("Title:" +title);
		 return this;
	 }

	}

	

