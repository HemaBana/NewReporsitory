package script.Eligibility;



import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import generic.BaseTest;
import generic.IAutoConst;
import generic.Lib;
import pages.Eligibility;


public class Eligibility_Raise extends BaseTest{
	@Test(priority=2)
	public void testEligibility_Raise() throws InterruptedException{
		String R1=Lib.getCellValue(IAutoConst.XLPATH,"Eligibility",1,0);
		
		
		Eligibility e =new Eligibility (driver);
		driver.manage().window().maximize();
		Thread.sleep(5000);
        e.clickScheduleTab();
        Thread.sleep(5000);
        e.clickCalenderTab();
        Thread.sleep(7000);
      
       
        Actions act = new Actions(driver);
        act.doubleClick(driver.findElement(By.xpath("(//div[contains(@class,'dayview')])[51]"))).build().perform();
        Thread.sleep(7000);
       driver.findElement(By.xpath(".//*[@id='input-21']")).sendKeys("Jam");
       Thread.sleep(7000);
       driver.findElement(By.xpath("(//span[@class='highlight'])[2]")).click();
        WebElement Room = driver.findElement(By.name("room"));
       	Select select1=new Select(Room);
       	select1.selectByIndex(1);
        
        WebElement Payer= driver.findElement(By.name("primaryPayer"));
       	Select select2=new Select(Payer);
       	select2.selectByVisibleText("Payer");
       	
        WebElement SecondayPayer= driver.findElement(By.name("SecondaryPayer"));
       	Select selectA=new Select(SecondayPayer);
       	selectA.selectByVisibleText("HealthCare");
       	
       	
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
        driver.findElement(By.xpath("(//p[contains(text(),'James Smith')])[8]")).click();
       	Thread.sleep(5000) ;
    
        
        e.clickEligibilityTab() ;
     	Thread.sleep(5000);
        e.clickRaiseER();
     	Thread.sleep(5000);
        e.clickPayerPopUp();
     	Thread.sleep(5000);
        e.clickSend();
        
       	
       		
}


}