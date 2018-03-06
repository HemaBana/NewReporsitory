package script.PayerSettings;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import generic.BaseTest;
import generic.IAutoConst;
import generic.Lib;
import pages.PayerSettings;


public class Payer_Scenarios extends BaseTest{
	

	@Test(priority=1)
	public void testPayer_Add() throws InterruptedException, IOException{
		String P1=Lib.getCellValue(IAutoConst.XLPATH,"Payer_Add",1,0);
		String Ph1=Lib.getCellValue(IAutoConst.XLPATH,"Payer_Add",1,1);
		String Add1=Lib.getCellValue(IAutoConst.XLPATH,"Payer_Add",1,2);
		String Add2=Lib.getCellValue(IAutoConst.XLPATH,"Payer_Add",1,3);
		String C1=Lib.getCellValue(IAutoConst.XLPATH,"Payer_Add",1,4);
		String zip=Lib.getCellValue(IAutoConst.XLPATH,"Payer_Add",1,5);
		String PId=Lib.getCellValue(IAutoConst.XLPATH,"Payer_Add",1,6);
		
	   PayerSettings p = new PayerSettings(driver);
	    driver.manage().window().maximize();
		
	
	      Thread.sleep(5000);
	    
         p.clicksettings();
         p.clickPayersTab();
        
         Thread.sleep(8000);
         p.clickAddpayerIcon();
         Thread.sleep(8000);
         p.setPayerName(P1);
         p.setPhoneNumber(Ph1);
         p.setAddress1(Add1);
         p.setAddress2(Add2);
         p.setCity(C1);
     	WebElement stateDrop = driver.findElement(By.name("state"));
    	Select select=new Select(stateDrop);
    	select.selectByIndex(1);
        p.setCity(C1);
        p.setZipcode(zip);
        Thread.sleep(2000);
        WebElement PayerType = driver.findElement(By.name("payertype"));
    	Select select1=new Select(PayerType);
    	select1.selectByIndex(1);
        
        p.setPayerId(PId);
        

         
        driver.findElement(By.xpath("//input[@type='search']")).sendKeys("Hou");

		/*String xp="//div[contains(text(),'Hou')]";
		
		List<WebElement> a = driver.findElements(By.xpath(xp));
		
		int count=a.size();
		System.out.println(count);
		
		for(int i=0;i<count;i++)
		{
			String text=a.get(i).getText();
			System.out.println(text);
		}
		
		a.get(count-1).click();*/
        //driver.findElement(By.xpath("//li[contains(text(),'not found')]")).click();
        
        Thread.sleep(2000);
        driver.findElement(By.xpath("//span[@class='highlight']")).click();
      
        Thread.sleep(2000);
       p.clicksave();
       //String message=driver.findElement(By.xpath(".//*[@id='toast-container']/div/div/div")).getText();
	   //System.out.println(message);
       Lib.getSnapShot(driver, "./Snap","Payer"  );
	   
}

	@Test(priority=2)
	public void testPayer_Edit() throws InterruptedException{
		String P1=Lib.getCellValue(IAutoConst.XLPATH,"Payer_Edit",1,0);
		String Ph1=Lib.getCellValue(IAutoConst.XLPATH,"Payer_Edit",1,1);
		String Add1=Lib.getCellValue(IAutoConst.XLPATH,"Payer_Edit",1,2);
		String Add2=Lib.getCellValue(IAutoConst.XLPATH,"Payer_Edit",1,3);
		String C1=Lib.getCellValue(IAutoConst.XLPATH,"Payer_Edit",1,4);
		String zip=Lib.getCellValue(IAutoConst.XLPATH,"Payer_Edit",1,5);
		String PId=Lib.getCellValue(IAutoConst.XLPATH,"Payer_Edit",1,6);
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    PayerSettings p = new PayerSettings(driver);
	     
		 p.clickEditIcon();
		 driver.findElement(By.xpath("//input[@name='payerName']")).clear(); 
         p.setPayerName(P1);
         driver.findElement(By.xpath("//input[@name='phoneNumber']")).clear(); 
         p.setPhoneNumber(Ph1);
         driver.findElement(By.xpath("//input[@name='addL1']")).clear(); 
         p.setAddress1(Add1);
         driver.findElement(By.xpath("//input[@name='addl2']")).clear(); 
         p.setAddress2(Add2);
         driver.findElement(By.xpath("//input[@name='city']")).clear(); 
         p.setCity(C1);
         
     	WebElement stateDrop = driver.findElement(By.name("state"));
    	Select select=new Select(stateDrop);
    	select.selectByIndex(1);
    	 driver.findElement(By.xpath("//input[@name='zip']")).clear(); 
        p.setZipcode(zip);
        driver.findElement(By.xpath("//input[@name='payerIdentifier']")).clear(); 
        p.setPayerId(PId);
        
        Thread.sleep(5000);
        driver.findElement(By.xpath("//input[@type='search']")).clear(); 
        driver.findElement(By.xpath("//input[@type='search']")).sendKeys("Hou");

		/*String xp="//div[contains(text(),'Hou')]";
		
		List<WebElement> a = driver.findElements(By.xpath(xp));
		
		int count=a.size();
		System.out.println(count);
		
		for(int i=0;i<count;i++)
		{
			String text=a.get(i).getText();
			System.out.println(text);
		}
		
		a.get(count-1).click();*/
        //driver.findElement(By.xpath("//li[contains(text(),'not found')]")).click();
        
        Thread.sleep(2000);
        driver.findElement(By.xpath("//span[@class='highlight']")).click();
      
        Thread.sleep(2000);
         p.clicksave();
         String message=driver.findElement(By.xpath(".//*[@id='toast-container']/div/div/div")).getText();
  	     System.out.println(message);
         
       
	
}
	
	
	
}