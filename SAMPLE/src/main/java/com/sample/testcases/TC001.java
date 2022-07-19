package com.sample.testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.sample.pages.orangeHRM;
import com.sample.testng.api.base.ProjectSpecificMethods;

public class TC001 extends ProjectSpecificMethods{	

	@BeforeTest
	public void setValues() {
		testCaseName = "Login";
		testDescription = "Login testCase";
		nodes = "Leads";
		authors = "Bezil";
		category = "Smoke";
		dataSheetName = "TC001";
	}

	@Test(dataProvider = "fetchData")
	public void createLeaf(String userName, String password) {
		new orangeHRM(driver,node).enterUserName(userName).enterPassword(password).clickLogin().getTitle();
	}


}





