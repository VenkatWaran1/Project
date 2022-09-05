package org.test1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Myntra {

public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Venkat Waran\\eclipse-Selenium\\Selenium\\Driver\\chromedriver.exe");
	
	WebDriver driver=new ChromeDriver();
	
	driver.get("https://www.myntra.com/register?referer=https://www.myntra.com/");
	
	WebElement mobNo = driver.findElement(By.xpath("//input[@type='tel']"));
	mobNo.sendKeys("9790272082");
	
	
	
	
	
}

}
