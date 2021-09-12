package com.Robotclass;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class robopractise {

	public static void main(String[] args) throws AWTException {
		
	
		WebDriver driver;
		
		Robot robot=new Robot();
		System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://demosite.center/wordpress/wp-login.php");
		driver.findElement(By.xpath("//input[@id='user_login']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@id='user_pass']")).sendKeys("demo123");
		driver.findElement(By.xpath("//input[@id='wp-submit']")).click();
		
		Actions actions=new Actions(driver);
		actions.moveToElement(driver.findElement(By.xpath("//span[text()='New']"))).perform();
		
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//li[@id='wp-admin-bar-new-media']")).click();
		driver.findElement(By.xpath("//Input[@id='plupload-browse-button']")).click();
	
		robot.setAutoDelay(2000);
		
		StringSelection stringSelection=new StringSelection("C:\\Users\\Admin\\Desktop\\SaurabhBahurupi_ApplicationForm.pdf");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection, null);		
				
		robot.setAutoDelay(3000);
		
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyRelease(KeyEvent.VK_V);
		
		robot.setAutoDelay(3000);
		
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
}
}