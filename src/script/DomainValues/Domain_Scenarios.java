package script.DomainValues;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

import org.testng.annotations.Test;



import generic.BaseTest;
import generic.IAutoConst;
import generic.Lib;
import pages.DomainValues;


public class Domain_Scenarios extends BaseTest{
	
	  
	@Test(priority=1)
	public void testDomain_Add() throws InterruptedException{
		String v1=Lib.getCellValue(IAutoConst.XLPATH,"Domain_Add",1,0);
		String C1=Lib.getCellValue(IAutoConst.XLPATH,"Domain_Add",1,1);
		
		
		DomainValues d=new DomainValues(driver);
		 driver.manage().window().maximize();
		Thread.sleep(2000);
		
		 
	  
	  d.clicksettings();
	  
	 
	 
     d.clickDomain();
     
     //wait = new WebDriverWait(driver,10);
   

     d.clickReplayIcon();
  
     //wait = new WebDriverWait(driver,10);
	  d.clickAdjustmentCode();
	  
	
	 
	 d.clickplusicon();
	

	d.setValue(v1);
	
	WebElement CS = driver.findElement(By.name("codeSystem"));
  	Select select1=new Select(CS);
    select1.selectByIndex(1);
    

  	 d.setCode(C1);
  	
     d.clicksave();
 
// String message=driver.findElement(By.xpath(".//*[@id='toast-container']/div/div/div")).getText();
 //System.out.println(message);
 
}

	@Test(priority=2)
	public void testDomain_Edit() throws InterruptedException{
		String v1=Lib.getCellValue(IAutoConst.XLPATH,"Domain_Edit",1,0);
		String C1=Lib.getCellValue(IAutoConst.XLPATH,"Domain_Edit",1,1);
		
		DomainValues d=new DomainValues(driver);
		
		Thread.sleep(3000);
	
	d.clickEdit();
	
	driver.findElement(By.xpath("//input[@name='domainValue']")).clear(); 
	
	d.setValue(v1);
	WebElement CS = driver.findElement(By.name("codeSystem"));
  	Select select1=new Select(CS);
    select1.selectByIndex(2);
    
    driver.findElement(By.xpath("//input[@name='code']")).clear(); 
  	d.setCode(C1);
  	Thread.sleep(3000);
  	driver.findElement(By.xpath("(//div[@class='md-bar'])[2]")).click();
  	driver.findElement(By.xpath("//span[text()='Ok']")).click();
	Thread.sleep(3000);
   d.clicksave();
   String message=driver.findElement(By.xpath(".//*[@id='toast-container']/div/div/div")).getText();
   System.out.println(message);
 
}
	
	
	
}