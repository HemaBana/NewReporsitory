package script.DocumentManagement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import generic.BaseTest;
import generic.IAutoConst;
import generic.Lib;
import pages.DocumentManagement;


public class DocumentManagement_Scenarios extends BaseTest {
	@Test(priority=1)
	public void testDocument_Add() throws InterruptedException{
		String F1=Lib.getCellValue(IAutoConst.XLPATH,"Document_Upload",1,0);
		String D1=Lib.getCellValue(IAutoConst.XLPATH,"Document_Upload",1,1);
		
		DocumentManagement d =new DocumentManagement(driver);
		 driver.manage().window().maximize();
		Thread.sleep(5000);
        d.clickWorkplacetab();
        d.clickDocumentManagementTab();
        Thread.sleep(7000);
        d.clickUploadIcon();
        Thread.sleep(7000);
        driver.findElement(By.xpath("//input[@name='dmPatient']")).sendKeys("Lin");
        Thread.sleep(7000);
        driver.findElement(By.xpath("//span[@class='highlight']")).click();
        WebElement ele=driver.findElement(By.name("file"));
    	ele.sendKeys("E:\\Authorized.png");
         Thread.sleep(2000);
        d.setFileName(F1);
        Thread.sleep(2000);
        d.setFileDescription(D1);
        Thread.sleep(2000);
	    d.clickUploadButton();
	    Thread.sleep(7000);
	   /* String message=driver.findElement(By.xpath("//div[@class='toast-message']")).getText();
	    System.out.println(message);*/
	    Thread.sleep(3000);
	    driver.findElement(By.xpath("(//a[contains(@class,'pointer ')])[1]")).click();
	    
	
}	
	
	@Test(priority=2)

	public void testDocument_Edit() throws InterruptedException{
		
		DocumentManagement d =new DocumentManagement(driver);
		Thread.sleep(7000);
        d.clickEditIcon();
		Thread.sleep(7000);
        driver.findElement(By.xpath("//input[@name='fileName']")).clear();
        
        driver.findElement(By.xpath("//input[@name='fileName']")).sendKeys("Filenew2");
        Thread.sleep(5000);
        driver.findElement(By.xpath("//textarea[@name='description']")).clear();
        driver.findElement(By.xpath("//textarea[@name='description']")).sendKeys("FileDescription1");
        Thread.sleep(5000);
        d.clickSaveButton();
        String message=driver.findElement(By.xpath("//div[@class='toast-message']")).getText();
	    System.out.println(message);
		
	}
	
	@Test(priority=3)
	public void testDocument_Delete() throws InterruptedException{
		
        DocumentManagement d =new DocumentManagement(driver);
		 
		Thread.sleep(5000);
        d.clickDeleteIcon();
    	Thread.sleep(3000);
        driver.findElement(By.xpath("//span[text()='Ok']")).click();
        String message=driver.findElement(By.xpath("//div[@class='toast-message']")).getText();
	    System.out.println(message);
	
	
}
	
	@Test(priority=4)
	public void testDocument_Patient() throws InterruptedException{
		
			
			
			Thread.sleep(7000);
	       
			WebElement a =driver.findElement(By.xpath(".//*[@id='container']/header/div[2]/div[2]/div/input"));
	        a.sendKeys("Lin");
	        Thread.sleep(7000);
	        driver.findElement(By.xpath("//a[contains(text(),'Linda Mark')]")).click();
	        Thread.sleep(7000);
	        WebElement PatListBox = driver.findElement(By.xpath(".//*[@id='statusIndicator']/select"));
	    	Select select=new Select(PatListBox);
	    	select.selectByValue("6");
	    	Thread.sleep(7000);
	    	
	    	String aFileName=driver.findElement(By.xpath("(//a[contains(@class,'pointer ')])[1]")).getText();
	  	    String eFileName="Filenew2";
	  	  
	  	  Assert.assertEquals(aFileName, eFileName);

		}
}