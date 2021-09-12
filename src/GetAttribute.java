import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GetAttribute {

	public static void main(String[] args) {
			System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
			 WebDriver driver = new ChromeDriver();
			 driver.get("https://www.toolsqa.com/automation-practice-form/");
			 WebElement b =driver.findElement(By.xpath("//span[text()='Tutorial']"));
			 sendkeys(driver,b,10);
			 Actions a=new Actions(driver);
			 a.moveToElement(driver.findElement(By.xpath("//span[text()='Tutorial']"))).perform();
			 driver.findElement(By.id(id))
			 
		
		
		
	}	

	
	private static void Sendkeys() {
		// TODO Auto-generated method stub
		
	}


	public static void sendkeys(WebDriver driver, WebElement element,int timeout) {
		new WebDriverWait(driver,timeout);
		until(ExpectedConditions.visibilityOf(element));
		element.click();
	}


	private static void until(ExpectedCondition<WebElement> visibilityOf) {
		// TODO Auto-generated method stub
		
	}
	
}
