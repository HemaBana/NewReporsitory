package script.Facility;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import generic.BaseTest;
import generic.IAutoConst;
import generic.Lib;
import pages.Facilities;

public class Facility_Scenarios extends BaseTest{
	@Test(priority=1)
	public void testFacility_Add() throws InterruptedException{
	
	    String N1=Lib.getCellValue(IAutoConst.XLPATH,"Facility_Add",1,0);
		String P1=Lib.getCellValue(IAutoConst.XLPATH,"Facility_Add",1,1);
		String E1=Lib.getCellValue(IAutoConst.XLPATH,"Facility_Add",1,2);
		String Add1=Lib.getCellValue(IAutoConst.XLPATH,"Facility_Add",1,3);
		String city=Lib.getCellValue(IAutoConst.XLPATH,"Facility_Add",1,4);
		String Zip=Lib.getCellValue(IAutoConst.XLPATH,"Facility_Add",1,5);
		
		String Hol=Lib.getCellValue(IAutoConst.XLPATH,"SetWorkHours",1,0);
		   driver.manage().window().maximize();
		Facilities f=new Facilities(driver);
		Thread.sleep(5000);
	
	f.clicksettings();
    Thread.sleep(5000);	
	f.clicksecurity();
	Thread.sleep(5000);	
	f.clickFacilityTab();
	Thread.sleep(5000);
	driver.findElement(By.xpath("//i[text()='replay']")).click();
	f.clickAddFacIcon();
	Thread.sleep(5000);
	f.setName(N1);
     f.setPhone(P1);
     f.setEmail(E1);
     f.clickPracticeCheckbox();
     WebElement Pos = driver.findElement(By.name("pos"));
   	 Select select1=new Select(Pos);
     select1.selectByIndex(2);
    
    
     f.clickAddressplus();
     WebElement AddressType = driver.findElement(By.name("addressType"));
   	 Select select2=new Select(AddressType);
     select2.selectByIndex(2);
     

 	
 	 Thread.sleep(1000);
     f.setAddress1(Add1);
     f.setcity(city);
     WebElement State = driver.findElement(By.name("state"));
   	 Select select3=new Select(State);
     select3.selectByIndex(2);
     
     f.setZipcode(Zip);
   Thread.sleep(2000);

	f.clicksave();
	
	 String message=driver.findElement(By.xpath(".//*[@id='toast-container']/div/div/div")).getText();
	 System.out.println(message);

	Thread.sleep(2000);

	f.clickWorkHours();

	Thread.sleep(1000);
	f.clickCheckboxdays();
	Thread.sleep(5000);
	f.clickApplyBreaklink();
	Thread.sleep(5000);
	driver.findElement(By.xpath("(//i[contains(@class,'plus')])[5]")).click();
	
	Thread.sleep(5000);
	driver.findElement(By.xpath("//input[@name='description']")).sendKeys("Break");
	
	Thread.sleep(2000);
	driver.findElement(By.xpath("(//button[@class='primary'])[3]")).click();
	Thread.sleep(2000);
	f.clickSaveBreak();
	Thread.sleep(5000);
	f.clickApplyButton();
	Thread.sleep(2000);
	f.clickplusHoliday();
	Thread.sleep(2000);
	f.clickcalendericon();
	f.clickselectDate();
	f.setEnterHoliday(Hol);
	Thread.sleep(2000);
	f.clickSaveButton();
	Thread.sleep(2000);
	 String message1=driver.findElement(By.xpath(".//*[@id='toast-container']/div/div/div")).getText();
	 System.out.println(message1);
	Thread.sleep(2000);
	driver.findElement(By.xpath(".//*[@id='mainView']/section[2]/div/div/div/button")).click();
	
	String aFacilityName=driver.findElement(By.xpath("(//td[@class='ng-binding'])[1]")).getText();
	String eFacilityName="AppolloNew13";
	  
	Assert.assertEquals(aFacilityName, eFacilityName);
	
	System.out.println(aFacilityName);
	System.out.println(eFacilityName);
	System.out.println("New Added Facility displayed in grid");
	

	
}

	@Test(priority=2)
	public void testFacility_Edit() throws InterruptedException{
	
	    String N1=Lib.getCellValue(IAutoConst.XLPATH,"Facility_Edit",1,0);
		String P1=Lib.getCellValue(IAutoConst.XLPATH,"Facility_Edit",1,1);
		String E1=Lib.getCellValue(IAutoConst.XLPATH,"Facility_Edit",1,2);
	    String Hol=Lib.getCellValue(IAutoConst.XLPATH,"SetWorkHours_Edit",1,0);
		   
		Facilities f=new Facilities(driver);
		Thread.sleep(3000);
	
	f.clickEdit();
	driver.findElement(By.xpath("//input[@name='name']")).clear(); 
	f.setName(N1);
	driver.findElement(By.xpath("//input[@name='phone']")).clear();
     f.setPhone(P1);
     driver.findElement(By.xpath("//input[@name='email']")).clear();
     f.setEmail(E1);
    
     WebElement Pos = driver.findElement(By.name("pos"));
   	 Select select1=new Select(Pos);
     select1.selectByIndex(3);
    
 
   Thread.sleep(2000);

	f.clicksave();
	
	 String message=driver.findElement(By.xpath(".//*[@id='toast-container']/div/div/div")).getText();
	 System.out.println(message);

	Thread.sleep(2000);

	f.clickWorkHours();

	f.clickEditHoliday();
	
	Thread.sleep(2000);
	f.clickcalendericon();
	f.clickselectDate();
	f.setEnterHoliday(Hol);
	Thread.sleep(2000);
	f.clickSaveButton();
	Thread.sleep(2000);
	 String message1=driver.findElement(By.xpath(".//*[@id='toast-container']/div/div/div")).getText();
	 System.out.println(message1);
	Thread.sleep(2000);
	driver.findElement(By.xpath(".//*[@id='mainView']/section[2]/div/div/div/button")).click();
	
	String aFacilityName=driver.findElement(By.xpath("(//td[@class='ng-binding'])[1]")).getText();
	String eFacilityName="AppolloNew2";
	  
	Assert.assertEquals(aFacilityName, eFacilityName);
	System.out.println("Facility Details Edited Successfully");

	
}
	
}