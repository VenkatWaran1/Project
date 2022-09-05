package org.test1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClearTrip {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Venkat Waran\\eclipse-Selenium\\Selenium\\Driver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.cleartrip.com/trains");
		
		WebElement txtSrcStn = driver.findElement(By.xpath("(//input[@type='text'])[1]"));
		txtSrcStn.sendKeys("Chennai");
		
		WebElement txtDtnStn = driver.findElement(By.xpath("(//input[@type='text'])[2]"));
		txtDtnStn.sendKeys("Cuddalore Port");
		
		WebElement btnSearch = driver.findElement(By.xpath("//button[@type='submit']"));
		btnSearch.click();
		
	}

}
