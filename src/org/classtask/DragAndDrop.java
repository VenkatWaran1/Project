package org.classtask;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Venkat Waran\\eclipse-Selenium\\Selenium\\Driver\\chromedriver.exe");
		
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demo.guru99.com/test/drag_drop.html");
		
		//driver.manage().window().maximize();
		
		//Thread.sleep(3000);
		
		WebElement s = driver.findElement(By.id("credit2"));
		WebElement d = driver.findElement(By.id("bank"));
		
		Actions actions = new Actions(driver);
		actions.dragAndDrop(s, d).perform();
		
		WebElement s1 = driver.findElement(By.id("fourth"));
		WebElement d1 = driver.findElement(By.id("amt7"));
		
		Actions actions1 = new Actions(driver);
		actions1.dragAndDrop(s1, d1).perform();
		
		WebElement s2 = driver.findElement(By.id("credit1"));
		WebElement d2 = driver.findElement(By.id("loan"));
	
		Actions actions2 = new Actions(driver);
		actions2.dragAndDrop(s2, d2).perform();
		
		WebElement s3 = driver.findElement(By.id("fourth"));
		WebElement d3 = driver.findElement(By.id("amt8"));
		
		Actions actions3 = new Actions(driver);
		actions3.dragAndDrop(s3, d3).perform();
		
		WebElement result = driver.findElement(By.id("equal"));
		String text = result.getText();
		System.out.println(text);
		
			
		
		
		
	}

	
}
