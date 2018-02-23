package pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PayerSettings extends LoginPage {
	@FindBy(xpath="//span[text()='Settings']")
	 private WebElement settingstab1;
	 
	 @FindBy(xpath="//a[contains(text(),'Payers')]")
	 private WebElement PayersTab;
	 
	 @FindBy(xpath="//i[text()='person_add']")
	 private WebElement AddpayerIcon;

	 @FindBy(xpath="//input[@name='payerName']")
	 private WebElement PayerName;
	 
	 @FindBy(xpath="//input[@name='phoneNumber']")
	 private WebElement PhoneNumber;
	 
	  @FindBy(xpath="//input[@name='addL1']")
	 private WebElement Address1;
	 
	  
	  @FindBy(xpath="//input[@name='addl2']")
	 private WebElement Address2; 
	  
	  @FindBy(xpath="//input[@name='city']")
		 private WebElement City; 
		  
	  @FindBy(xpath="//input[@name='zip']")
		 private WebElement Zipcode;
	  
	  
	  @FindBy(xpath="//input[@name='payerIdentifier']")
		 private WebElement PayerId;
	  
	  @FindBy(xpath="//button[text()='Save']")
		 private WebElement Save;
	  
	  
	  @FindBy(xpath="(//i[text()='edit'])[1]")
		 private WebElement EditIcon;
	  
	  
	  
	 public PayerSettings(WebDriver driver)
	 {
		super(driver); 
	  PageFactory.initElements(driver,this);
	 }
	 
	 public void clicksettings(){
	  settingstab1.click();

	 }
	 
	public void clickPayersTab()
	 {
		PayersTab.click();
	 }

	public void clickAddpayerIcon()
	 {

		AddpayerIcon.click();
	 }

public void setPayerName(String P1){
	PayerName.sendKeys(P1);
		 }



	public void setPhoneNumber(String Ph1){
		PhoneNumber.sendKeys(Ph1);
	 }
	

	public void setAddress1(String Add1){
		Address1.sendKeys(Add1);
	 }
	
	public void setAddress2(String Add2){
		Address2.sendKeys(Add2);
	 }
	
	
	public void setCity(String C1){
		City.sendKeys(C1);
	 }
	
	public void setZipcode(String zip){
		Zipcode.sendKeys(zip);
	 }
	
	public void setPayerId(String PId){
		PayerId.sendKeys(PId);
	 }
	
	public void clicksave()
	 {

		Save.click();
	 }
	
	public void clickEditIcon()
	 {

		EditIcon.click();
	 }
}