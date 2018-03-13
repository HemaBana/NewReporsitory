package scripts.AuthorizedRepresentative;

import java.util.concurrent.TimeoutException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import generic.BaseTest;
import generic.Lib;
import pages.AuthorizedRepresentative;



public class AuthRep_Scenarios extends BaseTest{

	
	@Test(priority=1)
public void testAuthRep_Add() throws InterruptedException, TimeoutException{
		
		AuthorizedRepresentative au =new AuthorizedRepresentative(driver);
		 driver.manage().window().maximize();
		Thread.sleep(5000);
       
        WebElement a =driver.findElement(By.xpath("(//input[@type='text'])[1]"));
        a.sendKeys("Joh");
        Thread.sleep(5000);
        driver.findElement(By.xpath("//a[contains(text(),'John Walker')]")).click();
        Thread.sleep(3000);
        WebElement PatListBox = driver.findElement(By.xpath(".//*[@id='statusIndicator']/select"));
    	Select select=new Select(PatListBox);
    	select.selectByValue("2");
    	//Thread.sleep(3000);
    	Lib.getWebElement(driver,".//*[@id='tab-content-2']/div/md-content/div/div[1]/h3/span/a/i");
    	au.clickPlusIcon();
    	driver.findElement(By.xpath("//input[@name='arPatient']")).sendKeys("cas");
    	Lib.getWebElement(driver,"//span[contains(text(),'Macline')]");
    	driver.findElement(By.xpath("//span[contains(text(),'Macline')]")).click();
    	WebElement Relation = driver.findElement(By.name("arRelationship"));
      	Select select1=new Select(Relation);
      	select1.selectByVisibleText("Legal Representative");
    	//Thread.sleep(5000);
      	Lib.getWebElement(driver,"//button[text()='Save']");
    	au.clickSaveButton();
    	Thread.sleep(8000);
    	String message=driver.findElement(By.xpath("//div[@class='toast-message']")).getText();
 	    System.out.println(message);
	}
    	
 	  
 		  @Test(priority=2)
 		 public void testAuthRep_Edit() throws InterruptedException
 		  {
 			 AuthorizedRepresentative au =new AuthorizedRepresentative(driver);
 			 Thread.sleep(5000);
 	        au.clickEditButton();	
 	   driver.findElement(By.xpath("//input[@name='arPatient']")).clear();
   	driver.findElement(By.xpath("//input[@name='arPatient']")).sendKeys("Linda");
   	Thread.sleep(3000);
   	driver.findElement(By.xpath("//span[contains(text(),'Mark')]")).click();
   	WebElement Relation = driver.findElement(By.name("arRelationship"));
     	Select select1=new Select(Relation);
     	select1.selectByIndex(2);
   	Thread.sleep(3000);
   	au.clickSaveButton();
   	Thread.sleep(8000);
   	String message=driver.findElement(By.xpath("//div[@class='toast-message']")).getText();
   	System.out.println(message);
 		  }
   	
   	@Test(priority=3)
    public void testAuthRep_Delete() throws InterruptedException
	  {
   	 AuthorizedRepresentative au =new AuthorizedRepresentative(driver);
		 Thread.sleep(5000);
		 au.clickDeleteButton();
		 au.clickOkButton();
		 au.clickSaveButton();
		 Thread.sleep(8000);
		 String message=driver.findElement(By.xpath("//div[@class='toast-message']")).getText();
		 System.out.println(message);
   
}
 	   
	}



