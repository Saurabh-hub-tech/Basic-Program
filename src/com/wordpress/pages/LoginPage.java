package com.wordpress.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	
	WebDriver driver;
	
	By username=By.id("user_login");
	By password=By.id("user_pass");
	By button=By.id("wp-submit");
	
	public LoginPage(WebDriver driver)
	{
		
		this.driver=driver;
		
	}
	
	public void username()
	{
		
		driver.findElement(username).sendKeys("admin");
	}
	
	public void paswd()
	{
		driver.findElement(password).sendKeys("demo123");
	}
	
	public void button()
	{
		driver.findElement(button).click();
		
	}
	

}
