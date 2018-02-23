package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LedgerPage extends LoginPage {
	@FindBy(xpath="//input[@title='Search']")
	 private WebElement Search;
	
	
	 @FindBy(xpath="//i[contains(@class,'plus')]")
	 private WebElement Expand;
	 

	 @FindBy(xpath="//span[contains(@class,'plus')]")
	 private WebElement ExpandService;
	 
	 @FindBy(xpath="//a[contains(text(),'Add Pay')]")
	 private WebElement AddPayLink;
	 
	 @FindBy(xpath="(//i[text()='edit'])[1]")
	 private WebElement EditIcon;
	 
	 
	 @FindBy(xpath="(//input[@name='paymentTranType'])[2]")
	 private WebElement TransAdj;
	 
	 @FindBy(xpath="(//input[@name='paymentSource'])[1]")
	 private WebElement SourceInsurance;
	 
	 @FindBy(xpath="(//i[text()='delete'])[2]")
	 private WebElement DeleteIcon;
	 
	 @FindBy(xpath="//span[text()='Ok']")
	 private WebElement OkButton;
	
	@FindBy(xpath="//div[@class='toast-message']")
	 private WebElement Message;
	 
	 
	/* @FindBy(xpath="(//span[text()='23'])[2]")
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
		 */
		 
	 public  LedgerPage(WebDriver driver)
	 {
		super(driver); 
	  PageFactory.initElements(driver,this);
	 }
	 
	 public void setSearch(String S1){
			Search.sendKeys(S1);
		 }
	 
	public void clickExpand()
	 {
		Expand.click();
	 }

	public void clickExpandService()
	 {

		ExpandService.click();
	 }

	

	public void clickAddPayLink()
	 {

		AddPayLink.click();
	 }

	public void clickEditIcon()
	 {

		EditIcon.click();
	 }

	
	/*public void clickSelectEndDate()
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
	*/
	public void clickTransAdj()
	 {

		TransAdj.click();
	 }
	
	public void clickSourceInsurance()
	 {

		SourceInsurance.click();
	 }
	public void clickDeleteIcon()
	 {

		DeleteIcon.click();
	 }

	public void clickOkButton()
	 {

		 OkButton.click();
	 }

	public void clickMessage()
	 {

		Message.click();
	 }

	
}

