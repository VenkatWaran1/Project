package org.test1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Swiggy {
public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Venkat Waran\\eclipse-Selenium\\Selenium\\Driver\\chromedriver.exe");
	
	WebDriver driver=new ChromeDriver();
	
	driver.get("https://www.swiggy.in/");
	
	WebElement btnSignUp = driver.findElement(By.xpath("//a[@class='r2iyh']"));
	btnSignUp.click();
	
	WebElement mobNo = driver.findElement(By.id("mobile"));
	mobNo.sendKeys("9790272080");
	
	WebElement userName = driver.findElement(By.id("name"));
	userName.sendKeys("VenkatWaran");
	
	WebElement userEmail = driver.findElement(By.id("email"));
	userEmail.sendKeys("venkatwaran94@gmail.com");
	
	WebElement userPwd = driver.findElement(By.id("password"));
	userPwd.sendKeys("Venkat@123");
	
	
	
}

}
