import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.rules.Timeout;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {

	
		public static void main(String[] args) {
			System.setProperty("webdriver.chrome.driver","C:/Users/Admin/Desktop/chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get("https://www.toolsqa.com/automation-practice-form/");
			
			Select drpdwn=new Select(driver.findElement(By.id("continents")));
			//Select drp = new Select(driver.findElement(By.id("continents")));
	
			List<WebElement> elements=drpdwn.getOptions();
			
			for(int i=0; i<elements.size(); i++) {
				
				String Name= drpdwn.getOptions().get(i).getText();
				System.out.println(Name);
			}
			
//		System.setProperty(key, value)
//		WebDriver driver=new Chromedriver();
//				
//			}
//			
	}}


