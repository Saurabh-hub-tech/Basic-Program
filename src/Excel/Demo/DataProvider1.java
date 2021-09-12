package Excel.Demo;

import java.sql.Driver;
import java.util.ArrayList;
import java.util.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Excel.Demo.Excel;

public class DataProvider1 {
	WebDriver driver;
	
	
	@BeforeMethod
	public void Prerequsite() {
	System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
	driver =new ChromeDriver();	
	driver.get("http://demosite.center/wordpress/wp-login.php");
	}
	
	@Test(priority=0,dataProvider="getTestData")
	
	public void login(String UserName, String Password) {
	driver.findElement(By.xpath("//input[@id='user_login']")).sendKeys(UserName);
	driver.findElement(By.xpath("//input[@id='user_pass']")).sendKeys(Password);
	driver.findElement(By.xpath("//input[@id='wp-submit']")).click();	
	Assert.assertTrue(false);
	}
	
	@DataProvider
	public Iterator<Object[]> getTestData() {
		ArrayList<Object[]>testData = Excel.getDatafromExcel();
		return testData.iterator();
	}
	
	
	@Test(priority=1, dependsOnMethods="login")
	public void HomePage() {
		String a= driver.getTitle();
		Assert.assertEquals(a, "Google");
	}
	
}
