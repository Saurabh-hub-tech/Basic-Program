import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHover {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:/Users/Admin/Downloads/Driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.toolsqa.com/automation-practice-form/");
		Actions action=new Actions(driver);
		
		action.moveToElement(driver.findElement(By.xpath("//ul[@id='primary-menu']/li[4]/a/span/span[contains(text(),\"Online Training\")]"))).perform();
		driver.findElement(By.xpath(" //span[contains(text(),\"Selenium Training\")]")).click();
		
		
		
		
		
		
		
		
		
		
		
	}

}
