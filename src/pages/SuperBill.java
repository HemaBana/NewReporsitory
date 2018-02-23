package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SuperBill extends Eligibility {
	@FindBy(xpath="//span[text()='Details']")
	 private WebElement DetailsTab;
	 
	 @FindBy(xpath="(//button[contains(text(),'Check In')])[1]")
	 private WebElement CheckInTab;
	 

	 @FindBy(xpath="(//input[@name='time_HH'])[3]")
	 private WebElement CheckInTime;
	 
	 @FindBy(xpath="(//button[contains(text(),'Check In')])[3]")
	 private WebElement CheckInButton;
	 
	 
	 @FindBy(xpath="(//button[contains(text(),'Check Out')])[1]")
	 private WebElement CheckOutTab;
	 
	 @FindBy(xpath="(//input[@name='time_HH'])[3]")
	 private WebElement CheckOutTime;
	 
	 @FindBy(xpath="(//button[text()='Save'])[2]")
	 private WebElement SaveCheckOut;
	 
	
	 
	 public  SuperBill(WebDriver driver)
	 {
		super(driver); 
	  PageFactory.initElements(driver,this);
	 }
	 
	 public void clickDetailsTab(){
		 DetailsTab.click();

	 }
	 
	public void clickCheckInTab()
	 {
		CheckInTab.click();
	 }

	public void clickCheckInButton()
	 {

		CheckInButton.click();
	 }

	

	public void clickCheckOutTab()
	 {

		CheckOutTab.click();
	 }

	
	
	public void clickSaveCheckOut()
	 {

		SaveCheckOut.click();
	 }

	
	
	
	
}
