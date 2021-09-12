import java.sql.Driver;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Windowpopup {

	private static final boolean False = false;

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver","C:/Users/Admin/Downloads/Driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/popup.php");
		driver.findElement(By.xpath("//a[text()=\"Click Here\"]")).click();
		Set<String> s= driver.getWindowHandles();
		Iterator<String> It=s.iterator();
		
		for(String s : Set) {
			if(s.equals(2)){
				driver.switchTo().window();
				
			}

		}
		
//		IT.next();
//		String second = IT.next();
//		String third =IT.next();
//		driver.switchTo().window(third);
//		driver.switchTo().window(second);
//		driver.findElement(By.name("emailid")).sendKeys("xyz@gmail.com");
//		driver.findElement(By.xpath("//input[@type='submit']")).click();
//		
//	
		
		
	}

}
