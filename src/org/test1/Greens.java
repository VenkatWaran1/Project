package org.test1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Greens {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Venkat Waran\\eclipse-Selenium\\Selenium\\Driver\\chromedriver.exe");
	
	WebDriver driver=new ChromeDriver();
	
	driver.get("http://greenstech.in/selenium-course-content.html");
	
	WebElement btnIq = driver.findElement(By.id("heading20"));
	btnIq.click();
	
	WebElement btnCts = driver.findElement(By.xpath("(//a[@title='Interview Questions'])[6]"));
	btnCts.click();
	
	
	
	
	}

}
