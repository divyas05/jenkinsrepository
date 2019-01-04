package com.ibm.kenkins.com.ibm.jenkins;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class normaldemoTest{
	WebDriver driver;
	public void demotest() {
		 System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver.exe");
		  driver =new ChromeDriver();
		  driver.get("http://elearning.hommelle.com/");
		  String actual=driver.getTitle();
		  String expected="eLearning - eLearning";
		  assertEquals(actual, expected);
	}
	}


