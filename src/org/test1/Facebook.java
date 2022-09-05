package org.test1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Venkat Waran\\eclipse-Selenium\\Selenium\\Driver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		WebElement txtUserName = driver.findElement(By.xpath("//input[@type='text']"));
		txtUserName.sendKeys("VenkatWaran");
		
		WebElement txtPwd = driver.findElement(By.xpath("//input[@type='password']"));
		txtPwd.sendKeys("Venkat@123");
		
		WebElement btnLogIn = driver.findElement(By.xpath("//button[@value='1']"));
		btnLogIn.click();
		
		
	}

}
