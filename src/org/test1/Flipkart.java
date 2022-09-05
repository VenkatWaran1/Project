package org.test1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Venkat Waran\\eclipse-Selenium\\Selenium\\Driver\\chromedriver.exe");
	
	WebDriver driver=new ChromeDriver();
	
	driver.get(" https://www.flipkart.com/");
	
	WebElement btnLogIn = driver.findElement(By.xpath("//a[@class='_1_3w1N']"));
	btnLogIn.click();
	
	WebElement txtuserId = driver.findElement(By.xpath("(//div[@class='IiD88i _351hSN'])[1]"));
	txtuserId.sendKeys("9790272082");
	
	
	
	}
}
