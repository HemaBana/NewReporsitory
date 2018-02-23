package script.ServiceManager;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import generic.BaseTest;
import generic.IAutoConst;
import generic.Lib;
import pages.ServiceManager;

public class ServiceManager_Scenarios extends BaseTest{

	@Test(priority=1)
	public void testService_Add() throws InterruptedException{
		String code=Lib.getCellValue(IAutoConst.XLPATH,"Service_Addon",1,0);
		String descirtion=Lib.getCellValue(IAutoConst.XLPATH,"Service_Addon",1,1);
		
		ServiceManager s=new ServiceManager(driver);
		 driver.manage().window().maximize();
		Thread.sleep(5000);
       s.clicksettings();
	
	 Thread.sleep(5000);	
	
	 s.clickservice();
	Thread.sleep(5000);
	
	s.clickAddons();
	Thread.sleep(5000);
	
	s.clickplusicon();
	Thread.sleep(5000);
	
	s.setcode(code);
	s.setdescription(descirtion);
 s.clicksave();
 String message=driver.findElement(By.xpath(".//*[@id='toast-container']/div/div/div")).getText();
 System.out.println(message);
 
}
	@Test(priority=3)
	public void testService_Edit() throws InterruptedException{
		
		String descirtion=Lib.getCellValue(IAutoConst.XLPATH,"Service_Edit",1,0);
		
		ServiceManager s=new ServiceManager(driver);
		 
		Thread.sleep(3000);
        s.clickEdit();
       
	driver.findElement(By.xpath("//input[@name='serviceManagerValue']")).clear(); 
	s.setdescription(descirtion);
	
	/*driver.findElement(By.xpath(".//*[@id='serviceManager-value-table']/tbody/tr[1]/td[4]/md-switch/div[1]/div[1]")).click();
  	driver.findElement(By.xpath("//span[text()='Ok']")).click();*/
	
	 s.clicksave();
   String message=driver.findElement(By.xpath(".//*[@id='toast-container']/div/div/div")).getText();
   System.out.println(message);
 

}
}

