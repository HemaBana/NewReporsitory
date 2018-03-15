package script.Remits;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import generic.BaseTest;

import pages.Remits;

public class RemitGrid extends BaseTest
{
	

	@Test(priority=1)
	public void testRemitGrid() throws InterruptedException, IOException{
		
		
	   Remits r = new Remits(driver);
	    driver.manage().window().maximize();
		
	
	     Thread.sleep(5000);
         r.clickBilling();
         r.clickClaimRemits();
         r.clickFilter();
         driver.findElement(By.name("claimNo")).sendKeys("1223Policy0012217201");
         r.clickSearchIcon();
	      
	      
	}
	
	
}