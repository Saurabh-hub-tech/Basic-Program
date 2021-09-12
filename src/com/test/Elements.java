package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Elements {
	WebDriver driver;
	
	By username=By.xpath("//input[@id='user_login']");
	By paswd=By.xpath("//input[@id='user_pass']");
	By submit=By.xpath("//input[@id='wp-submit']");
			
	public void Elements(WebDriver driver) {
		this.driver=driver;
		
	}
		public void login1(WebDriver driver) {
			
			driver.findElement(username).sendKeys("admin");
			driver.findElement(paswd).sendKeys("demo123");
			driver.findElement(submit).click();
		}
	

}
