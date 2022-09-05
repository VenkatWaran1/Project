package org.classtask;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoAutomation {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\Venkat Waran\\eclipse-Selenium\\Selenium\\Driver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demo.automationtesting.in/Alerts.html");
		
		WebElement lnkAl = driver.findElement(By.xpath("(//a[@class='analystic'])[3]"));
		lnkAl.click();
		
		WebElement btnprmt = driver.findElement(By.xpath("//button[@class='btn btn-info']"));
		btnprmt.click();
		
		Alert al = driver.switchTo().alert();
		al.sendKeys("Venkat");
		al.accept();
		
		WebElement txt = driver.findElement(By.id("demo1"));
		String text = txt.getText();
		System.out.println(text);
		
		
		
		
	}

}