package org.classtask;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hotel {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Venkat Waran\\eclipse-Selenium\\Selenium\\Driver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://adactinhotelapp.com/");
		
		WebElement element = driver.findElement(By.xpath("//p[contains(text(),'Adactin')]"));
		String text = element.getText();
		System.out.println(text);
		
		WebElement findElement = driver.findElement(By.id("username"));
		String attribute = findElement.getAttribute("type");
		System.out.println(attribute);
}
}
