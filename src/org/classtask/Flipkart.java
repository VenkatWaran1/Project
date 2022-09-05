package org.classtask;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Flipkart {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Venkat Waran\\eclipse-Selenium\\Selenium\\Driver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.flipkart.com/");
		
		//Thread.sleep(3000);
		
		WebElement btnClose = driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']"));
		btnClose.click();
		
		WebElement lnkMore = driver.findElement(By.className("exehdJ"));
		Actions actions = new Actions(driver);
		actions.moveToElement(lnkMore).perform();
		
		WebElement lnkCusCare = driver.findElement(By.xpath("(//div[@class='_3vhnxf'])[2]"));
		lnkCusCare.click();
		
		WebElement element = driver.findElement(By.xpath("(//span[@class='hDTmm5'])[1]"));
		String text = element.getText();
		System.out.println(text);
		
		
		
		
		
		
	}
}
