package script.Remits;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import generic.BaseTest;

import pages.Remits;

public class RemitGrid extends BaseTest
{
	

	@Test(priority=1)
	public void testRemitGrid() throws InterruptedException, IOException{
		
		
	   Remits r = new Remits(driver);
	    driver.manage().window().maximize();
		
	
	     Thread.sleep(3000);
         r.clickBilling();
         Thread.sleep(3000);
         r.clickClaimRemits();
         Thread.sleep(3000);
         r.clickFilter();
         Thread.sleep(3000);
         driver.findElement(By.name("claimNo")).sendKeys("12121898772377312018");
         Thread.sleep(3000);
         r.clickSearchIcon();
         Thread.sleep(3000);
         r.clickEditIcon();
         Thread.sleep(3000);
       
         r.clickApplyActionButton();
         Thread.sleep(3000);
        String aTransactionAmt=driver.findElement(By.xpath("(//span[contains(@class,'ng-binding sort-indicator')])[23]")).getText();
     	String eTransactionAmt="50";
     	  
     	Assert.assertEquals(aTransactionAmt, eTransactionAmt);
     	
}
}