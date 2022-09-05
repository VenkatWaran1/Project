package org.test1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google {
public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Venkat Waran\\eclipse-Selenium\\Selenium\\Driver\\chromedriver.exe");
	
	WebDriver driver=new ChromeDriver();
	
	driver.get("https://accounts.google.com/signup/v2/webcreateaccount?hl=en&flowName=GlifWebSignIn&flowEntry=SignUp");
	
	WebElement fstName = driver.findElement(By.xpath("(//input[@type='text'])[1]"));
	fstName.sendKeys("Venkat");
	
	WebElement lastName = driver.findElement(By.xpath("(//input[@type='text'])[2]"));
	lastName.sendKeys("Waran");
	
	WebElement email = driver.findElement(By.xpath("//input[@type='email']"));
	email.sendKeys("venkat9790272082");
	
	WebElement fstPwd = driver.findElement(By.xpath("(//input[@type='password'])[1]"));
	fstPwd.sendKeys("Venkat@123");
	
	WebElement secPwd = driver.findElement(By.xpath("(//input[@type='password'])[2]"));
	secPwd.sendKeys("Venkat@123");
	
	WebElement chkBox = driver.findElement(By.xpath("//input[@type='checkbox']"));
	chkBox.click();
	
	WebElement btnNext = driver.findElement(By.xpath("(//span[@jsname='V67aGc'])[2]"));
	btnNext.click();
	
	
	
	
}
}
