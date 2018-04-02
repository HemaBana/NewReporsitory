package generic;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import javax.net.ssl.SSLEngineResult.Status;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.SkipException;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;



import pages.LoginPage;



public  class BaseTest implements IAutoConst {
 public static WebDriver driver;
 /*static{
  System.setProperty(CHROME_KEY,CHROME_VALUE);
  System.setProperty(GECKO_KEY,GECKO_VALUE);
 }*/



 //@Parameters({"node","browser"})

    


@BeforeSuite
 public void openApplication()
 {
	 System.setProperty("webdriver.chrome.driver","./driver/chromedriver_New1.exe");
   driver=new ChromeDriver();
  String url=Lib.getProperty(CONFIG_PATH,"URL");
  driver.get(url);

    
 }




@Test		
public void testLogin() throws InterruptedException{
			String un=Lib.getCellValue(IAutoConst.XLPATH,"ValidLogin",1,0);
			String pw=Lib.getCellValue(IAutoConst.XLPATH,"ValidLogin",1,1);
			//String title=Lib.getCellValue(IAutoConst.XLPATH,"ValidLogin",1,2);
			LoginPage l=new LoginPage(driver);
			l.setUserName(un);
			Thread.sleep(5000);
			l.clickNext();
			Thread.sleep(5000);
			l.setPassword(pw);
			l.clickLogin();
			l.clickSign();
			Thread.sleep(5000);
		
		
			WebElement Partice = driver.findElement(By.xpath("//select[contains(@ng-options,'PracticeId')]"));
			Select select1=new Select(Partice);
		    select1.selectByIndex(1);
			
			

			Thread.sleep(9000);	
			
	
	/*	    
		driver.findElement(By.xpath("//option[contains(text(),'Omega')]")).click();
			 WebElement to1=driver.findElement(By.xpath("//div[contains(@class,'form')][2]"));
			    Actions action1=new Actions(driver);
				action1.moveToElement(to1).perform();
				Thread.sleep(8000);	*/
				
				WebElement Facility = driver.findElement(By.xpath("//select[contains(@ng-options,'BusinessUnitId')]"));
			  	Select select2=new Select(Facility);
			    select2.selectByIndex(1);
			    Thread.sleep(5000);	
			
			    WebElement Role = driver.findElement(By.xpath("//select[contains(@ng-options,'RoleId')]"));
			  	Select select3=new Select(Role);
			    select3.selectByIndex(1);
			    Thread.sleep(5000);	
			    driver.findElement(By.xpath("//option[contains(text(),'Front')]")).click();
				driver.findElement(By.xpath("//button[contains(text(),'Login')]")).click();
		
 
		}
 

//@AfterSuite

 public static void closeApplication()
 {
 driver.close();
 }

}
