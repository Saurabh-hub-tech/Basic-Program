package com.test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Codechallenge {

	public static void main(String[] args) {
		
		
			System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
		
			WebDriver driver=new ChromeDriver();
			driver.get("https://www.zoopla.co.uk");
		
			driver.findElement(By.id("search-input-location")).sendKeys("London");
			driver.findElement(By.id("search-submit")).click();
			
//			List<WebElement> refList = driver.findElements(By.tagName("a"));
//
//			   //iterate over web elements and use the getAttribute method to 
//			   //find the hypertext reference's value.
//
//			    for(WebElement we : refList) {
//			        System.out.println(we.getAttrlisting-results-price text-priceibute("href"));
//			    }
//			
//			
//			
//		}
			
		List <WebElement> a =driver.findElements(By.xpath("//ul[@class=\"listing-results clearfix js-gtm-list\"]/li/div/div[2]/a"));
		
		int size=a.size();  //return 25;
		System.out.println(a.get(0).getText());
		
		
		
		
		
		
		
		
		
		
		
			
		
			

	}
}

