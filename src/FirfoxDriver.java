import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FirfoxDriver {

	public static void main(String[] args) {
				
		System.setProperty("webdriver.chrome.driver","C:/Users/Admin/Downloads/Driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		//List button=driver.findElement(By.name("sex"));
		WebElement email= driver.findElement(By.id("email"));
		WebElement pswd = driver.findElement(By.id("pass'"));
		sendKeys(driver,email,10,"xyz");
		
		public static void sendKeys(WebDriver driver1, WebElement element,int timeout,String value) {
			new WebDriverWait(driver1,timeout);
			until(ExpectedConditions.visibilityOf(element));
			element.sendKeys(value);
		}	
		
				
				
	
	}

	private static void sendKeys(WebDriver driver, WebElement email, int i, String string) {
		// TODO Auto-generated method stub
		
	}

	private static void until(ExpectedCondition<WebElement> visibilityOf) {
		// TODO Auto-generated method stub
		
	}

}
