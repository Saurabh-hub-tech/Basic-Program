import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MainspringTest {

	public static void main(String[] args) {
		
		
	      System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");          

	      WebDriver driver=new ChromeDriver();

	      driver.get("https://mainspring.cognizant.com/");
	      
	      driver.findElement(By.id("username")).sendKeys("366285");
	      driver.findElement(By.id("PasswordInternal")).sendKeys("London@2019");
	      driver.findElement(By.id("Log_On1")).click();

	      driver.manage().window().maximize();

	      driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

	   
	      Actions action=new Actions(driver);

	      action.moveToElement(driver.findElement(By.xpath("//div[@class='left_menu_icon_overlay']"))).perform();

	      action.click();

	      //driver.manage().timeouts().implicitlyWait(Timeout.Page_Load_Timeout, TimeUnit.SECONDS);
	      
	      try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}

	      try {
	      
	      driver.findElement(By.xpath("//table[@id=\"gridview-1020-record-101\"]/tbody/tr/td[3]")).click();
	     
	      }catch(NoSuchElementException e) {
	    	  
	    	  System.out.println("Program Stop");
	      }
	      action.moveToElement(driver.findElement(By.id("LOCK_Execute"))).perform();

	      action.click();
	      
	   // driver.manage().timeouts().implicitlyWait(Timeout.Page_Load_Timeout, TimeUnit.SECONDS);
	      
	      try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
	      
	      
	      driver.findElement(By.id("LOCK_Workpackages")).click();

	      driver.findElement(By.xpath("//div[@class='x-grid-item-container']/table[@id='gridview-1022-record-20']")).click();
	    
	      driver.switchTo().frame("contentframe");
	      
	      driver.findElement(By.id("a_5507495")).click();
	 
	      try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
	      
	   //   driver.switchTo().frame("contentframe");
	      
	      
	      
	     //driver.switchTo().frame("5507495");
	     
	     
	     try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
	     
	     int size = driver.findElements(By.tagName("iframe")).size();
	     
	     System.out.println(size);
	     
	     driver.switchTo().frame(1); // Switching to the  inner Frame    		
		   
	     driver.findElement(By.xpath("//table[@id='treeview-1087-record-863']/tbody/tr[@class='summaryTask noneditableRow x-grid-tree-node-expanded  x-grid-row']/td[2]")).click();
	    
	    
	    
	}
	
	}


