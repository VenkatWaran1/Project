package org.classtask;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookDebug {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Venkat Waran\\eclipse-Selenium\\Selenium\\Driver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/pages/create/?ref_type=registration_form");
		
		Thread.sleep(3000);
		
		WebElement txtUsrName = driver.findElement(By.id("email"));
		txtUsrName.sendKeys("VenkatWaran");
		String attribute = txtUsrName.getAttribute("value");
		System.out.println(attribute);
		
		WebElement txtPass= driver.findElement(By.id("pass"));
		txtPass.sendKeys("Venkat@123");
		
		
		
		
		
		
	}
	

}
