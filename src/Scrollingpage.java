import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


//Refer below site for more details
//https://www.softwaretestingmaterial.com/scroll-web-page-using-selenium-webdriver/
	
public class Scrollingpage {


			public static void main(String[] args) throws IOException {
				
				System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
				WebDriver driver=new ChromeDriver();
				driver.get("http://demo.guru99.com/V4/manager/addcustomerpage.php");
				JavascriptExecutor js = (JavascriptExecutor) driver;
			//	js.executeScript("window.scrollBy(0,500)");//we use 250or500 pixels for vertical scrolling in order to see how scroll method works
//				js.executeScript("window.scrollBy(0,document.body.scrollHeight)");//To scroll to the Bottom of the Web Page using Selenium WebDriver:
//				js.executeScript("window.scrollBy(0,-250)");
//				js.executeScript("window.scrollBy(0,500)");
				WebElement sub=driver.findElement(By.name("sub"));
			js.executeScript("arguments[0].scrollIntoView();",sub );	//scroll the page until the mentioned element is visible on the current page, its use for horizontal scrolling as well.
				
				//js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
//				flash(sub, driver);
			}

		}


	


