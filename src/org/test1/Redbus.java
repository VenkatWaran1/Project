package org.test1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Redbus {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\Venkat Waran\\eclipse-Selenium\\Selenium\\Driver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.redbus.in/");
		
		driver.manage().window().maximize();
		
		WebElement btnDrop = driver.findElement(By.id("sign-in-icon-down"));
		btnDrop.click();
		
		WebElement butSign= driver.findElement(By.id("hc"));
		butSign.click();
		
		WebElement numMob = driver.findElement(By.xpath(("//input[@type='number']")));
		numMob.sendKeys("9790272082");
		
		
		
		
		
	}

}
