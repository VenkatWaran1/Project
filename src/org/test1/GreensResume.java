package org.test1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GreensResume {
	
		public static void main(String[] args) {
			
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\Venkat Waran\\eclipse-Selenium\\Selenium\\Driver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://greenstech.in/selenium-course-content.html");
		
		WebElement btnModel = driver.findElement(By.id("heading201"));
		btnModel.click();
		
		WebElement btnResume = driver.findElement(By.xpath("(//a[@title='Model Resume training in chennai'])[1]"));
		btnResume.click();
		
		
		}

}
