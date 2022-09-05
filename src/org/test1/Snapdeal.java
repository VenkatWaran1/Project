package org.test1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Snapdeal {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Venkat Waran\\eclipse-Selenium\\Selenium\\Driver\\chromedriver.exe");
	
	WebDriver driver=new ChromeDriver();
	
	//Click signin and click new register and enter mobile number abd click continue
	
	driver.get("https://www.snapdeal.com/");
	
	WebElement lnkSignIn = driver.findElement(By.xpath("//span[text()='Sign In']"));
	Actions actions=new Actions(driver);
	actions.moveToElement(lnkSignIn).perform();
	
	WebElement btnRegister = driver.findElement(By.xpath("(//span[text()='Register'])[1]"));
	btnRegister.click();
	
	Thread.sleep(3000);
	
	
	
	
	
	
	}
}
