package script.EncounterGrid;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import generic.BaseTest;
import generic.IAutoConst;
import generic.Lib;
import pages.Eligibility;

import pages.SuperBill;
import pages.SuperBillGrid;

public class Encounter_Grid extends BaseTest
{
	@Test(priority=1)
	public void testEncounter_Grid() throws InterruptedException{
		String R1=Lib.getCellValue(IAutoConst.XLPATH,"Eligibility",1,0);
		
		RemoteWebDriver r=(RemoteWebDriver)driver;
		
		Eligibility e =new Eligibility (driver);
		driver.manage().window().maximize();
		Thread.sleep(5000);
        e.clickScheduleTab();
        Thread.sleep(5000);
        e.clickCalenderTab();
        Thread.sleep(7000);
      
       
        Actions act = new Actions(driver);
        Thread.sleep(3000);
        act.doubleClick(driver.findElement(By.xpath("(//div[contains(@class,'dayview')])[76]"))).build().perform();
        Thread.sleep(9000);
        driver.findElement(By.xpath(".//*[@id='input-21']")).sendKeys("Jam");
        Thread.sleep(9000);
        driver.findElement(By.xpath("(//span[@class='highlight'])[1]")).click();
        Thread.sleep(5000);
        WebElement Room = driver.findElement(By.name("room"));
       	Select select1=new Select(Room);
       	select1.selectByIndex(1);
        
        WebElement Payer= driver.findElement(By.name("primaryPayer"));
       	Select select2=new Select(Payer);
       	Thread.sleep(3000);
       	select2.selectByVisibleText("Payer233");
       	
        /*WebElement SecondayPayer= driver.findElement(By.name("SecondaryPayer"));
       	Select selectA=new Select(SecondayPayer);
      	Thread.sleep(3000);
       	selectA.selectByVisibleText("HealthCare");*/
       	
       	
        WebElement duration= driver.findElement(By.name("duration"));
       	Select select3=new Select(duration);
       	select3.selectByIndex(1);
       	
       	WebElement AT= driver.findElement(By.name("appointmentType"));
       	Select select4=new Select(AT);
       	select4.selectByIndex(1);
       	
       	
      	WebElement RF= driver.findElement(By.name("frequecy"));
       	Select select5=new Select(RF);
       	select5.selectByIndex(1);
       	
       	e.setReason(R1);
       	e.clickRadioButton();
       	

      	WebElement AS= driver.findElement(By.name("source"));
       	Select select6=new Select(AS);
       	select6.selectByIndex(1);
       	e.clickSave();
       	
       	Thread.sleep(5000);
        /*WebElement scroll = driver.findElement(By.xpath("//div[contains(@class,'appointmentGrid')]"));
        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("window.scrollBy(250,0)", "");*/
        
    	Thread.sleep(7000);
        driver.findElement(By.xpath("(//p[contains(text(),'James Bob')])[4]")).click();
       	Thread.sleep(5000) ;
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
        driver.findElement(By.xpath("(//input[@name='time_HH'])[3]")).sendKeys("9");
        
        Thread.sleep(5000);
        WebElement Encounter = driver.findElement(By.xpath("(//select[@name='template'])[2]"));
       	Select select=new Select(Encounter);
       	select.selectByVisibleText("Clinical Template");
       	Thread.sleep(5000);
       	s.clickCheckInButton();
       	Thread.sleep(5000);
       	s.clickCheckOutTab();
       	Thread.sleep(5000);
        
        driver.findElement(By.xpath("(//input[@name='time_HH'])[3]")).clear();
        driver.findElement(By.xpath("(//input[@name='time_HH'])[3]")).sendKeys("10");

        Thread.sleep(5000);
        s.clickSaveCheckOut();
        Thread.sleep(5000);
        driver.findElement(By.xpath("//span[text()='No']")).click();
        Thread.sleep(5000);
        
        String  AppointmentSD=driver.findElement(By.xpath("//input[contains(@placeholder,'Actual Start Time')]")).getAttribute("value");
       
        AppointmentSD=AppointmentSD.replaceAll(",", "");
        String  AppointmentED=driver.findElement(By.xpath("//input[contains(@placeholder,'Actual End Time')]")).getAttribute("value");
        AppointmentED=AppointmentED.replaceAll(",", "");
        
        System.out.println("AppointmentST:" +AppointmentSD);
        
        Thread.sleep(3000);
        System.out.println("AppointmentET:" +AppointmentED);
        
        Thread.sleep(5000);
        
        WebElement a =driver.findElement(By.xpath("(//input[@type='text'])[1]"));
        a.sendKeys("Jam");
        Thread.sleep(5000);
        driver.findElement(By.xpath("//a[contains(text(),'James Bob')]")).click();
        Thread.sleep(3000);
        WebElement PatListBox = driver.findElement(By.xpath(".//*[@id='statusIndicator']/select"));
    	Select selectA1=new Select(PatListBox);
    	selectA1.selectByValue("3");
    	Thread.sleep(5000);
    	
    	driver.findElement(By.xpath("//span[contains(text(),'Encounter ID')]")).click();
    	Thread.sleep(5000);
    	
    	String EncounterSD=driver.findElement(By.xpath("(//td[contains(@class,'ng-binding')])[4]")).getText();
    	
    	String EncounterED=driver.findElement(By.xpath("(//td[contains(@class,'ng-binding')])[5]")).getText();
    	
    	 System.out.println("EncounterST:" +EncounterSD);
         
         Thread.sleep(3000);
         System.out.println("EncounterET:" +EncounterED);
    	
    	Assert.assertEquals(AppointmentSD,EncounterSD);
        Assert.assertEquals(AppointmentED,EncounterED);
        
    	System.out.println("Appointment is created in Encounter Grid");
    	
}
	@Test(priority=2)
	public void testManualEncounter() throws InterruptedException
	{
		Thread.sleep(5000);
		
	    	
	    	Thread.sleep(5000);
		
	   driver.findElement(By.xpath("//img[contains(@title,'Create Encounter')]")).click();
	    Thread.sleep(5000);
	    driver.findElement(By.xpath("//input[@name='provider']")).sendKeys("Jam");
    	Thread.sleep(5000);
    	driver.findElement(By.xpath("//span[contains(text(),'Mark')]")).click();
    	
     	
       	WebElement ET= driver.findElement(By.name("template"));
       	Select selectB=new Select(ET);
       	selectB.selectByIndex(1);
       	Thread.sleep(5000);
       	WebElement Fac= driver.findElement(By.name("facility"));
       	Select selectC=new Select(Fac);
       	selectC.selectByIndex(1);
       	Thread.sleep(7000);
    	WebElement RN= driver.findElement(By.name("room"));
       	Select selectD=new Select(RN);
       	selectD.selectByIndex(1);
       	Thread.sleep(5000);
    	WebElement PP= driver.findElement(By.name("primaryPayer"));
       	Select selectE=new Select(PP);
       	selectE.selectByIndex(1);
		
       	Thread.sleep(5000);
        driver.findElement(By.xpath("(//input[@name='time_HH'])[4]")).clear();
        
        driver.findElement(By.xpath("(//input[@name='time_HH'])[4]")).sendKeys("1");
        
       	
        Thread.sleep(5000);
        driver.findElement(By.xpath("//textarea[@name='reason']")).sendKeys("Visit");
        Thread.sleep(5000);
       
        driver.findElement(By.xpath("(//button[text()='Save'])[2]")).click();
        String Message1=driver.findElement(By.xpath("//div[@class='toast-message']")).getText();
        System.out.println(Message1);
        Lib.getSnapShot(driver, "./Snap"," ManualEncounter");
        
	}
}