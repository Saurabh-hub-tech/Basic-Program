package com.test;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annotations {

	@BeforeSuite
	public void setup() {
		
		System.out.println("set up property for crome");
	
	}
	@BeforeClass
	public void login() {
		
		System.out.println("launch crome browser");
	}
			
	@BeforeTest
	public void logintoapp() {
		
		System.out.println("Logintoapp");
		
	}
	@BeforeMethod
	public void enterURL() {
		
		System.out.println("enter URL");
	}
	
	@Test(invocationCount=2)
	public void googleTitleTest() {
		System.out.println("Title test");
			}
	
	@Test
	public void googleName() {
		System.out.println("Name");
			}
	
	
	
	@AfterMethod
	public void logout() {
		
		System.out.println("logout fromapp");
		
	}
	
	
	
}
