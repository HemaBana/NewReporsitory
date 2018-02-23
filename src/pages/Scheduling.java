package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Scheduling extends LoginPage {
	@FindBy(xpath=".//*[@id='sidebar']/div/ul/li[2]/a")
	 private WebElement ScheduleTab;
	 
	 @FindBy(xpath="//a[text()='Calendar']")
	 private WebElement CalenderTab;
	 
	@FindBy(xpath="//p[contains(text(),'Mark')]")
	 private WebElement SelectProvider;

	 
	 
	 @FindBy(xpath=".//*[@id='dayViewTable']/tbody/tr[4]/td[2]/table/tbody/tr[2]/td/div[2]")
	 private WebElement DayView;
	 
	 
	 
     @FindBy(xpath="(//div[contains(@class,'dayview ')])[40]")
	 private WebElement Dateselect;
	 
	 @FindBy(xpath="//textarea[@name='reason']")
	 private WebElement Reason;
	 
	 
	 @FindBy(xpath="(//input[@name='reminder'])[1]")
	 private WebElement RadioButton;
	 
	 @FindBy(xpath="//button[text()='Save']")
	 private WebElement Save;
	 
	 @FindBy(xpath="//span[text()='Eligibility']")
	 private WebElement EligibilityTab;
	 
	 @FindBy(xpath="//button[text()='RaiseER']")
	 private WebElement RaiseER;
	 
	 @FindBy(xpath="//input[@name='payer']")
	 private WebElement PayerPopUp;
	 
	 @FindBy(xpath="//button[text()='Send']")
	 private WebElement Send;
	 
	 @FindBy(xpath="(//button[contains(text(),'No Show')])[1]")
	 private WebElement NoShow;
	 
	 @FindBy(xpath="(//textarea[@name='reason'])[4]")
	 private WebElement NoShowReason;
	 
	 @FindBy(xpath="(//button[text()='Save'])[2]")
	 private WebElement NoReasonSave;
	 
	 @FindBy(xpath="//a[text()='Week']")
	 private WebElement WeekLink;
	 
	 @FindBy(xpath="(//div[contains(@class,'dayview ')])[65]")
	 private WebElement SelectWeek;
	 
	 @FindBy(xpath="(//button[text()='Cancel'])[1]")
	 private WebElement Cancel;
	 
	 
	 @FindBy(xpath="(//textarea[@name='reason'])[4]")
	 private WebElement CancelReason;
	 
	 @FindBy(xpath="(//button[text()='Save'])[2]")
	 private WebElement CancelSave;
	 
	 @FindBy(id="linkMonth")
	 private WebElement Month;
	 
	 @FindBy(xpath="(//div[text()='7'])[1]")
	 private WebElement Monthselect;
	 
	 @FindBy(xpath="//button[contains(text(),'Follow Up')]")
	 private WebElement FollowupButton;
	 
	 @FindBy(xpath="(//button[contains(text(),'Follow Up')])[2]")
	 private WebElement FollowupButtonPopup;
	 
	 @FindBy(xpath="(//button[contains(@class,'datepicker')])[4]")
	 private WebElement FollowupDate;
	 
	 @FindBy(xpath="(//span[text()='8'])[1]")
	 private WebElement selectDate;
	 
	 @FindBy(xpath="(//button[text()='Cancel'])[2]")
	 private WebElement Cancelbutton;
	 
	 
	 public  Scheduling(WebDriver driver)
	 {
		super(driver); 
	  PageFactory.initElements(driver,this);
	 }
	 
	 public void clickScheduleTab(){
		 ScheduleTab.click();

	 }
	 
	public void clickCalenderTab()
	 {
		CalenderTab.click();
	 }

	public void clickDateselect()
	 {

		Dateselect.click();
	 }

	public void setReason(String R11){
		Reason.sendKeys(R11);
	 }
	


	public void clickRadioButton()
	 {

		RadioButton.click();
	 }

	
	
	public void clickSave()
	 {

		Save.click();
	 }

	public void clickEligibilityTab()
	 {

		EligibilityTab.click();
	 }
	
	public void clickRaiseER()
	 {

		RaiseER.click();
	 }

	public void clickPayerPopUp()
	 {

		 PayerPopUp.click();
	 }

	public void clickSend()
	 {

		Send.click();
	 }
	public void clickSelectProvider()
	 {

		SelectProvider.click();
	 }
	public void clickDayView()
	 {

		DayView.click();
	 }
	
	public void clickNoShow()
	 {

		NoShow.click();
	 }
	
	public void setNoShowReason(String R2){
		 NoShowReason.sendKeys(R2);
	 }
	public void clickNoReasonSave()
	 {

		NoReasonSave.click();
	 }
	
	public void clickWeekLink()
	 {

		 WeekLink.click();
	 }
	
	public void clickSelectWeek()
	 {

		SelectWeek.click();
	 }
	
	public void clickCancel()
	 {

		Cancel.click();
	 }
	
	public void setCancelReason(String R3){
		CancelReason.sendKeys(R3);
	 }
	
	public void clickMonth()
	 {

		Month.click();
	 }
	

	public void clickFollowupButton()
	 {

		FollowupButton.click();
	 }
	public void clickFollowupButtonPopup()
	 {

		FollowupButtonPopup.click();
	 }
	
	public void clickMonthselect()
	 {

		 Monthselect.click();
	 }
	
	public void clickFollowupDate()
	 {

		FollowupDate.click();
	 }
	public void clickselectDate()
	 {

		selectDate.click();
	 }
	public void clickCancelbutton()
	 {

		Cancelbutton.click();
	 }
	
}