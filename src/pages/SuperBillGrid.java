package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SuperBillGrid extends LoginPage {
	@FindBy(xpath="(//i[contains(@class,'plus')])[1]")
	 private WebElement ServicePlusIcon;
	 
	 @FindBy(xpath="(//button[contains(@class,'datepicker')])[1]")
	 private WebElement StartDate;
	 

	 @FindBy(xpath="(//span[text()='23'])[1]")
	 private WebElement SelectStartDate;
	 
	 @FindBy(xpath="(//button[contains(@class,'datepicker')])[3]")
	 private WebElement EndDate;
	 
	 
	 @FindBy(xpath="(//span[text()='23'])[2]")
	 private WebElement SelectEndDate;
	 
	 @FindBy(xpath="//input[@name='serviceUnits']")
	 private WebElement Units;
	 
	 @FindBy(xpath="//input[@name='serviceCharge']")
	 private WebElement Charge;
	 
	 @FindBy(xpath="//input[@name='serviceTax']")
	 private WebElement Tax;
	 
	 @FindBy(xpath="//button[text()='Add']")
	 private WebElement Addbutton;
	 
		@FindBy(xpath="(//i[contains(@class,'plus')])[2]")
		 private WebElement PaymentsPlusIcon;
		
		@FindBy(xpath="(//input[@name='paymentSource'])[2]")
		 private WebElement PatientSourceRadio;
		
		 @FindBy(xpath="(//button[contains(@class,'datepicker')])[1]")
		 private WebElement PaymentDate;
	 
		 @FindBy(xpath="(//span[text()='23'])[1]")
		 private WebElement SelectPaymentDate;
		 
		 @FindBy(xpath="//input[@value='Copay']")
		 private WebElement PaymentType;
		
		 @FindBy(xpath="//button[text()='Add']")
		 private WebElement AddPaymentbutton;
	 
		 @FindBy(xpath="//button[text()='Save']")
		 private WebElement SaveSuperbillbutton;
		 
		
		 
		 @FindBy(xpath="//span[contains(@class,'highlight')]")
		 private WebElement ICDClick;
		 
		 @FindBy(xpath="//img[contains(@title,'Create Super Bill')]")
		 private WebElement ManualSuperBillIcon;
		 
		 
		 @FindBy(id="input-5")
		 private WebElement Provider; 
		 
		 
		 @FindBy(xpath="//button[text()='Save']")
		 private WebElement SaveButton; 
		 
	 public  SuperBillGrid(WebDriver driver)
	 {
		super(driver); 
	  PageFactory.initElements(driver,this);
	 }
	 
	 public void clickServicePlusIcon(){
		 ServicePlusIcon.click();

	 }
	 
	public void clickStartDate()
	 {
		StartDate.click();
	 }

	public void clickSelectStartDate()
	 {

		SelectStartDate.click();
	 }

	

	public void clickEndDate()
	 {

		EndDate.click();
	 }

	
	
	public void clickSelectEndDate()
	 {

		SelectEndDate.click();
	 }

	public void setUnits(String U1){
		Units.sendKeys(U1);
	 }
	
	public void setCharge(String C1){
		Charge.sendKeys(C1);
	 }
	
	
	public void setTax(String T1){
		Tax.sendKeys(T1);
	 }
	
	public void clickAddbutton()
	 {

		Addbutton.click();
	 }
	
	public void clickPaymentsPlusIcon()
	 {

		PaymentsPlusIcon.click();
	 }
	
	public void clickPatientSourceRadio()
	 {

		PatientSourceRadio.click();
	 }
	
	public void clickPaymentDate()
	 {

		PaymentDate.click();
	 }
	
	public void clickSelectPaymentDate()
	 {

		SelectPaymentDate.click();
	 }
	
	public void clickPaymentType()
	 {

	PaymentType.click();
	 }
	
	public void clickAddPaymentbutton()
	 {

		AddPaymentbutton.click();
	 }
	
	public void clickSaveSuperbillbutton()
	 {

		SaveSuperbillbutton.click();
	 }
	public void clickICDClick()
	 {

		ICDClick.click();
	 }
	
	public void clickIManualSuperBillIcon()
	 {

		ManualSuperBillIcon.click();
	 }
	
	public void clickProvider()
	 {

		Provider.click();
	 }
	
	public void clickSaveButton()
	 {

		SaveButton.click();
	 }
	
}

