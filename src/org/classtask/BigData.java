package org.classtask;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class BigData {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Venkat Waran\\eclipse-Selenium\\Selenium\\Driver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://www.greenstechnologys.com/");
		WebElement lnkcourse = driver.findElement(By.xpath("//a[text()='COURSES']"));
		Actions action=new Actions(driver);
		action.moveToElement(lnkcourse).perform();
	
		WebElement text = driver.findElement(By.xpath("//span[text()='Bigdata Training']"));
		String text2 = text.getText();
		System.out.println(text2);
		
		text.click();
		
		Thread.sleep(3000);
		
		driver.close();
				
				
		
	}

}
