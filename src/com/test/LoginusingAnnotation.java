package com.test;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.xalan.xsltc.compiler.util.ObjectType;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;



public class LoginusingAnnotation {
WebDriver driver;


@BeforeMethod
public void startTest()
{
System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
 driver =new ChromeDriver();	
driver.get("http://demosite.center/wordpress/wp-login.php");

}

@Parameters({"userId","Paswd"})
@Test(priority=0,groups="Login")

public void test2(String userId, String Paswd)
{
	driver.findElement(By.xpath("//input[@id='user_login']")).sendKeys(userId);
	driver.findElement(By.xpath("//input[@id='user_pass']")).sendKeys(Paswd);
	driver.findElement(By.xpath("//input[@id='wp-submit']")).click();
//	Elements a=new Elements();
//	a.login1(driver);
	
//	File file = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//	
//	try {
//		FileUtils.copyFile(file, new File("C:\\Users\\Admin\\Desktop\\HomePage.png"));
//	} catch (IOException e) {
//		// TODO Auto-generated catch block
//		e.printStackTrace();
//	}
}

//@Test(priority=3,groups="New")
//public void test3(String userId, String Paswd) {
//driver.findElement(By.xpath("//input[@id='user_login']")).sendKeys(userId);
//driver.findElement(By.xpath("//input[@id='user_pass']")).sendKeys(Paswd);
//driver.findElement(By.xpath("//input[@id='wp-submit']")).click();


//	LoginMethod.login("admin", "demo123");
//	Actions actions=new Actions(driver);
//	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//	actions.moveToElement(driver.findElement(By.xpath("//span[@class='ab-label' and text()='New']"))).perform();
//	driver.findElement(By.xpath("//li[@id='wp-admin-bar-new-post']")).click();
//	
//}
//
//@Test(priority=4,groups="New")
//public void test4(String userId, String Paswd) {
////	driver.findElement(By.xpath("//input[@id='user_login']")).sendKeys(userId);
////	driver.findElement(By.xpath("//input[@id='user_pass']")).sendKeys(Paswd);
////	driver.findElement(By.xpath("//input[@id='wp-submit']")).click();
//	LoginMethod.login("admin", "demo123");
//	Actions actions=new Actions(driver);
//	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//	actions.moveToElement(driver.findElement(By.xpath("//span[@class='ab-label' and text()='New']"))).perform();
//	driver.findElement(By.xpath("//li[@id='wp-admin-bar-new-post']")).click();
//}
//


@AfterMethod
public void Close() {
	driver.close();
}
}
