import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UplodeFile {

	public static void main(String[] args) {

			
			System.setProperty("webdriver.chrome.driver","C:/Users/Admin/Downloads/Driver/chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get("https://www.toolsqa.com/automation-practice-form/");
			driver.findElement(By.id("photo")).sendKeys("C:/Users/Admin/Desktop/Desktop/Advt IT officers");
				}

}
