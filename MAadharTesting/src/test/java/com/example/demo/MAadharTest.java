package com.example.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class MAadharTest
{
	WebDriver driver;
	
	@Test 
	public void MAadhar() {
		driver.get("http://localhost:4200//");
		driver.findElement(By.id("email")).sendKeys("kavi@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("kavi@123");
		driver.findElement(By.name("login")).submit();
	}
	public void ApplyNewAadhar() {
		driver.get("http://localhost:4200/");
		driver.findElement(By.id("name")).sendKeys("kavi@gmail.com");
		driver.findElement(By.id("address")).sendKeys("xyz street");
		driver.findElement(By.id("email")).sendKeys("kavi@123");
		driver.findElement(By.id("gender")).sendKeys("Female");
		driver.findElement(By.name("apply")).submit();
	}
	@BeforeMethod
	  public void beforeMethod() {
		  System.setProperty("webdriver.chrome.driver","D:\\\\Phase 5\\\\SeleniumJarFiles\\\\chrome-Driver\\\\chromedriver.exe");
		  driver=new ChromeDriver();
		  
	  }
	  @AfterMethod
	  public void afterMethod() {
		 // driver.close();
		  driver=null;
		  
	  }
}
