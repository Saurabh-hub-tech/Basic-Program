import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Waits {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:/Users/Admin/Downloads/Driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		WebElement email= driver.findElement(By.id("email"));
		sendKeys(driver,email, 10, "XYZ");
	}

	private static void sendKeys(WebDriver driver, WebElement element, int i, String value) {
	
		new WebDriverWait(driver, i);
		until(ExpectedConditions.visibilityOf(element));
		element.sendKeys(value);
		
		
		
		
	}

	private static void until(ExpectedCondition<WebElement> visibilityOf) {
		// TODO Auto-generated method stub
		
	}

}
