package script.Ledger;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import generic.BaseTest;
import generic.IAutoConst;
import generic.Lib;
import pages.AuthorizedRepresentative;
import pages.LedgerPage;
import pages.SuperBillGrid;

public class Ledger_Scenarios extends BaseTest{
	@Test(priority=1)
	public void testLedger_Add() throws InterruptedException{
		String U1=Lib.getCellValue(IAutoConst.XLPATH,"SuperBillGrid",1,0);
		String T1=Lib.getCellValue(IAutoConst.XLPATH,"SuperBillGrid",1,1);
		String S1=Lib.getCellValue(IAutoConst.XLPATH,"Ledger",1,0);
		
		
		
	    SuperBillGrid su =new SuperBillGrid(driver);
	    LedgerPage l =new  LedgerPage(driver);
		
		 driver.manage().window().maximize();
			Thread.sleep(5000);
	       
			 WebElement a11 =driver.findElement(By.xpath("(//input[@type='text'])[1]"));
		        a11.sendKeys("mad");
		        Thread.sleep(10000);
		        driver.findElement(By.xpath("//a[contains(text(),'Maddy')]")).click();
	        Thread.sleep(9000);
	        WebElement PatListBox = driver.findElement(By.xpath(".//*[@id='statusIndicator']/select"));
	    	Select select=new Select(PatListBox);
	    	select.selectByValue("5");
		Thread.sleep(5000);
		
	l.setSearch(S1);
	Thread.sleep(9000);
	l.clickExpand();
	Thread.sleep(9000);
	l.clickExpandService();
	Thread.sleep(9000);
	l.clickAddPayLink();
	Thread.sleep(9000);
		
        
        
        su.clickPatientSourceRadio();
        Thread.sleep(5000);
        su.clickPaymentDate();
        Thread.sleep(5000);
        su.clickSelectPaymentDate();
        Thread.sleep(5000);
     
       
        WebElement PM = driver.findElement(By.xpath("//select[@name='paymentMethod']"));
       	Select select5=new Select(PM);
       	select5.selectByIndex(2);
       	Thread.sleep(5000);
       	su.clickPaymentType();
       	driver.findElement(By.xpath("//input[@name='paymentAmount']")).clear();
       	driver.findElement(By.xpath("//input[@name='paymentAmount']")).sendKeys("3");
       	su.clickAddPaymentbutton();
	}
       	
    	@Test(priority=2)
    	public void testLedger_Edit() throws InterruptedException{
    		String U1=Lib.getCellValue(IAutoConst.XLPATH,"SuperBillGrid",1,0);
    		String T1=Lib.getCellValue(IAutoConst.XLPATH,"SuperBillGrid",1,1);
    		String S1=Lib.getCellValue(IAutoConst.XLPATH,"Ledger",1,0);
    		
    		
    	    SuperBillGrid su =new SuperBillGrid(driver);
    	    LedgerPage l =new  LedgerPage(driver);
    
    	    driver.findElement(By.xpath("//input[@title='Search']")).clear();
    	    Thread.sleep(5000);
    	    driver.findElement(By.xpath("//input[@title='Search']")).sendKeys("ENC-105");
    	    
    		Thread.sleep(5000);
    		l.clickExpand();
    		Thread.sleep(5000);
    		l.clickExpandService();
    		Thread.sleep(5000);
    		l.clickEditIcon();
    		Thread.sleep(5000);
    			
    	        
    	        
    	        l.clickTransAdj();
    	        Thread.sleep(5000);
    	        l.clickSourceInsurance();
    	        su.clickPaymentDate();
    	        Thread.sleep(5000);
    	        su.clickSelectPaymentDate();
    	        Thread.sleep(5000);
    	     
    	       
    	        WebElement Adj = driver.findElement(By.xpath("//select[@name='paymentAdjValue']"));
    	       	Select select5=new Select(Adj);
    	       	select5.selectByIndex(1);
    	       	Thread.sleep(9000);
    	       	
    	       	driver.findElement(By.xpath("//input[contains(@placeholder,'Select an Adjustment Type')]")).sendKeys("90");
    	       	Thread.sleep(5000);
    	        driver.findElement(By.xpath("//span[text()='90']")).click();
    	    	Thread.sleep(5000);
    	       	
    	    	WebElement Payer = driver.findElement(By.xpath("//select[@name='patientPayer']"));
    	       	Select select6=new Select(Payer);
    	       	select6.selectByIndex(1);
    	    	
    	       	WebElement RemarkCode = driver.findElement(By.xpath("//select[@name='paymentRemark']"));
    	       	Select select7=new Select(RemarkCode);
    	       	select7.selectByIndex(1);
    	       	
    	       	driver.findElement(By.xpath("//input[@name='paymentAmount']")).clear();
    	       	driver.findElement(By.xpath("//input[@name='paymentAmount']")).sendKeys("6");
    	       	su.clickAddPaymentbutton();
    	    
}
    	@Test(priority=3)
        public void testLedger_Delete() throws InterruptedException
    	  {
    		  
      	    LedgerPage l =new  LedgerPage(driver);
    		 Thread.sleep(5000);
    		driver.findElement(By.xpath("//input[@title='Search']")).clear();
      	    Thread.sleep(5000);
      	    driver.findElement(By.xpath("//input[@title='Search']")).sendKeys("ENC-105");
      	    
      		Thread.sleep(5000);
      		l.clickExpand();
      		Thread.sleep(5000);
      		l.clickExpandService();
      		Thread.sleep(5000);
    		 l.clickDeleteIcon();
    		 Thread.sleep(5000);
    	     l.clickOkButton();
    		
    		 Thread.sleep(5000);
    		 String message=driver.findElement(By.xpath("//div[@class='toast-message']")).getText();
    		 System.out.println(message);

    	  }
    	
    	
}