package org.test1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Automation {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Venkat Waran\\eclipse-workspace1\\Selenium\\Driver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://demo.automationtesting.in/Register.html");
		
		WebElement txtFstName = driver.findElement(By.xpath("(//input[@type='text'])[1]"));		
		txtFstName.sendKeys("Venkat");
		
		WebElement txtLstName = driver.findElement(By.xpath("(//input[@type='text'])[2]"));
		
		txtLstName.sendKeys("Waran");
	
		WebElement txtAddr = driver.findElement(By.xpath(("//textarea[@rows='3']")));
		
		txtAddr.sendKeys("9/20 Nedunjalai Nagar,"
				+ "\n"+"Thirupapuliyur,"
				+"\n"+ "Cuddalore - 607002");
		
		WebElement txtmail = driver.findElement(By.xpath("//input[@type='email']"));
		txtmail.sendKeys("venkatwaran94@gmail.com");
		
		WebElement nummob = driver.findElement(By.xpath("//input[@type='tel']"));
		nummob.sendKeys("9790272082");
		
		WebElement btnGender  = driver.findElement(By.xpath("//input[@value='Male']"));
		btnGender.click();
		
		WebElement chkbox = driver.findElement(By.xpath("//input[@value='Cricket']"));
		chkbox.click();
		
		WebElement chkbox2 = driver.findElement(By.xpath("//input[@value='Movies']"));
		chkbox2.click();
		
		
		WebElement txtpwd1 = driver.findElement(By.xpath("//input[@id='firstpassword']"));
		txtpwd1.sendKeys("Venkat@12345");
		
		WebElement txtpwd2 = driver.findElement(By.xpath("//input[@id='secondpassword']"));
		txtpwd2.sendKeys("Venkat@12345");
			
		
		
		
	}

}
