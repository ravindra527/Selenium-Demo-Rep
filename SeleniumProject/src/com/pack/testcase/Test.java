package com.pack.testcase;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import com.pack.selenium.Base;

public class Test extends Base {
	public static void main(String[] args) {
		
		getBrowser();
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//button[text()='Skip Sign In']")).click();
		By b = By.id("Skills");
		driver.findElement(b).click();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS );
		driver.close();
		System.out.println("+++++++++++++++++++ Excuted succesfylly ++++++++++++++++++++++++");
	
	}

}
