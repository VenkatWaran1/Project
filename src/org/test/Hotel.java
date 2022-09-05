package org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hotel {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Venkat Waran\\eclipse-workspace1\\Selenium\\Driver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://adactinhotelapp.com/");
		
		WebElement txtUserName = driver.findElement(By.id("username"));
		
		txtUserName.sendKeys("VenkatWaran");
		
		WebElement txtPassword = driver.findElement(By.id("password"));
		
		txtPassword.sendKeys("Venkat@1234");
		
	}
}

