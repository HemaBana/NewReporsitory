package script.Scheduling;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import generic.IAutoConst;
import generic.Lib;
import pages.SuperBill;
import pages.SuperBillGrid;
import script.Eligibility.Eligibility_Raise;



public class DefaultView extends Eligibility_Raise{
	@Test(priority=1)


	public void testDefaultView() throws InterruptedException{
		String U1=Lib.getCellValue(IAutoConst.XLPATH,"SuperBillGrid",1,0);
		String T1=Lib.getCellValue(IAutoConst.XLPATH,"SuperBillGrid",1,1);

	  
		SuperBill s =new SuperBill(driver);
		SuperBillGrid su =new SuperBillGrid(driver);
		Thread.sleep(5000);
        s.clickDetailsTab();
        Thread.sleep(5000);
        s.clickCheckInTab();
        Thread.sleep(5000);
        
        driver.findElement(By.xpath("(//input[@name='time_HH'])[3]")).clear();
        driver.findElement(By.xpath("(//input[@name='time_HH'])[3]")).sendKeys("7");
        
        Thread.sleep(5000);
        WebElement Encounter = driver.findElement(By.xpath("(//select[@name='template'])[2]"));
       	Select select=new Select(Encounter);
       	select.selectByVisibleText("Clinical Template");
       	Thread.sleep(5000);
       	s.clickCheckInButton();
       	Thread.sleep(5000);
       	s.clickCheckOutTab();
        driver.findElement(By.xpath("(//input[@name='time_HH'])[3]")).clear();
        driver.findElement(By.xpath("(//input[@name='time_HH'])[3]")).sendKeys("8");

        Thread.sleep(5000);
        s.clickSaveCheckOut();
        driver.findElement(By.xpath("//span[text()='Yes']")).click();
        
        su.clickServicePlusIcon();
	    Thread.sleep(5000);
        WebElement Pos = driver.findElement(By.xpath("//select[@name='servicePOS']"));
       	Select select1=new Select(Pos);
       	select1.selectByVisibleText("Homeless Shelter");
       	Thread.sleep(5000);
        driver.findElement(By.xpath("(//input[@type='search'])[1]")).sendKeys("1111");
        driver.findElement(By.xpath("//span[@class='highlight']")).click();
       	
        WebElement Payer = driver.findElement(By.xpath("//select[@name='servicePayer']"));
       	Select select2=new Select(Payer);
       	select2.selectByIndex(1);
       	
       	su.clickStartDate();
    	Thread.sleep(3000);
       	su.clickSelectStartDate();
    	Thread.sleep(3000);
       	su.clickEndDate();
    	Thread.sleep(3000);
       	su.clickSelectEndDate();
    	Thread.sleep(3000);
       	
        WebElement ICD = driver.findElement(By.xpath("//select[@name='icdtype']"));
       	Select select3=new Select(ICD);
       	select3.selectByIndex(1);
    	Thread.sleep(3000);
       	driver.findElement(By.xpath(".//*[@id='tab-content-5']/div/md-content/div/div[10]/div[4]/div/div[1]/input")).sendKeys("B35.1");
    	Thread.sleep(3000);
        su.clickICDClick();
    	Thread.sleep(3000);
    	driver.findElement(By.xpath("(//input[@type='search'])[3]")).sendKeys("Q7");
    	Thread.sleep(5000);
        driver.findElement(By.xpath("//span[text()='Q7']")).click();
    	Thread.sleep(3000);
        su.setUnits(U1);
    	Thread.sleep(3000);
        su.setTax(T1);
    	Thread.sleep(3000);
        su.clickAddbutton();
        Thread.sleep(3000);
        su.clickPaymentsPlusIcon();
        Thread.sleep(3000);
        su.clickPatientSourceRadio();
        Thread.sleep(3000);
        su.clickPaymentDate();
        Thread.sleep(3000);
        su.clickSelectPaymentDate();
        Thread.sleep(3000);
        WebElement CPT = driver.findElement(By.xpath("//select[@name='paymentCpt']"));
       	Select select4=new Select(CPT);
       	select4.selectByIndex(1);
       	Thread.sleep(3000);
        WebElement PM = driver.findElement(By.xpath("//select[@name='paymentMethod']"));
       	Select select5=new Select(PM);
       	select5.selectByIndex(2);
       	Thread.sleep(3000);
       	su.clickPaymentType();
       	driver.findElement(By.xpath("//input[@name='paymentAmount']")).clear();
       	driver.findElement(By.xpath("//input[@name='paymentAmount']")).sendKeys("3");
       	su.clickAddPaymentbutton();
       	
       	Thread.sleep(3000);
}


        
       	
       	
        
}