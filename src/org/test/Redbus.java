package org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Redbus {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Venkat Waran\\eclipse-workspace1\\Selenium\\Driver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.redbus.in/");
		
		WebElement txtSource = driver.findElement(By.id("src"));
		
		txtSource.sendKeys("Chennai");
		
		WebElement txtDestination = driver.findElement(By.id("dest"));
		
		txtDestination.sendKeys("Cuddalore");
		
		Thread.sleep(5000);
		driver.navigate().back();
		
		driver.close();
		
		
	}
}
