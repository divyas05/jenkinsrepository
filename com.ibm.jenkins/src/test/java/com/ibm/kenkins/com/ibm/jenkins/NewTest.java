package com.ibm.kenkins.com.ibm.jenkins;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class NewTest {
	public WebDriver driver;
  @Test
  public void launchtest() {
	  System.out.println("browser launced");
  }
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver.exe");
	  driver =new ChromeDriver();
	  driver.get("http://elearning.hommelle.com/");
	  String actual=driver.getTitle();
	  String expected="eLearning - eLearning";
	  assertEquals(actual, expected);
  }

  @AfterTest
  public void afterTest() {
	  driver.quit();
  }

}
