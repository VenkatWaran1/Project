package org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Icici {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Venkat Waran\\eclipse-workspace1\\Selenium\\Driver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://infinity.icicibank.com/corp/Login.jsp");
		
		WebElement txtSearch = driver.findElement(By.id("DUMMY1"));
		
		txtSearch.sendKeys("Greens Technology");
		

}
}
