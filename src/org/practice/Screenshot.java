package org.practice;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screenshot {
	
	public static void main(String[] args) throws IOException {
		
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\Venkat Waran\\eclipse-Selenium\\Selenium\\Driver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		TakesScreenshot tsc=(TakesScreenshot) driver;
		File source = tsc.getScreenshotAs(OutputType.FILE);
		System.out.println(source);
		File dest = new File("C:\\Users\\Venkat Waran\\Pictures\\TestScreenshot.png");
		FileUtils.copyFile(source, dest);
		
		
		
		
	
	}

}
