import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class RadioButton {

	public static void main(String[] args) {
	
			System.setProperty("webdriver.chrome.driver","C:/Users/Admin/Downloads/Driver/chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get("https://www.toolsqa.com/automation-practice-form/");
//			List<WebElement> Radio=driver.findElements(By.name("Gender"));
//			boolean value=Radio.get(0).isSelected();
//			if(value==true) {
//				Radio.get(1).click();
//			}else {
//			Radio.get(1).click();
//			}
			List<WebElement> Radio=driver.findElements(By.name("sex"));
			boolean bvalue=Radio.get(0).isSelected();
			if(bvalue==false) {
				Radio.get(1).click();}
			else{
					Radio.get(0).click();
				}
			
			}
			
	}
	


