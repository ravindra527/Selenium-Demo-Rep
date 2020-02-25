package com.pack.selenium;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base  {
	
public static WebDriver driver = null;
	public static void getBrowser() {
		System.setProperty("webdriver.chrome.driver", "D:\\I2690\\MySoft\\ChromeDriver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://demo.automationtesting.in/");
		
	}

  }
