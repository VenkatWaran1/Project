package org.classtask;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScript {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\Venkat Waran\\eclipse-Selenium\\Selenium\\Driver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		
//TypeCasting
		
		JavascriptExecutor executor=(JavascriptExecutor) driver;
		
		WebElement txtUserName = driver.findElement(By.id("email"));
		
		executor.executeScript("arguments[0].setAttribute('value','Venkat')", txtUserName);
		Object name = executor.executeScript("return arguments[0].getAttribute('value')", txtUserName);
		System.out.println(name);
		
		WebElement txtpwd = driver.findElement(By.id("pass"));
		
		executor.executeScript("arguments[0].setAttribute('value','Password123')", txtpwd);
		Object password = executor.executeScript("return arguments[0].getAttribute('value')", txtpwd);
		System.out.println(password);
		
		WebElement btnLogin = driver.findElement(By.name("login"));
		executor.executeScript("arguments[0].click()", btnLogin);
			
		
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
}
