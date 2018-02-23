package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class ChargeMaster extends LoginPage {
	@FindBy(xpath="//span[text()='Settings']")
	 private WebElement settingstab;
	 
	 @FindBy(xpath="//a[contains(text(),'Service')]")
	 private WebElement servicetab;
	 
	 @FindBy(xpath="//a[contains(text(),'CPT/HCPCS')]")
	 private WebElement CTP;

	 @FindBy(xpath="(//i[contains(@class,'plus')])[1]")
	 private WebElement plusicon;
	 
	 @FindBy(xpath="//input[@name='code']")
	 private WebElement code;
	 
	 @FindBy(xpath="//input[@name='serviceManagerValue']")
	 private WebElement description;
	 
	 @FindBy(xpath="//input[@name='DefaultCharge']")
	 private WebElement DefaultCharge;
	 
	 
	 
	 @FindBy(xpath="//i[text()='save']")
	 private WebElement save;
	 
	 @FindBy(xpath="//a[contains(text(),'Charge Masters')]")
	 private WebElement ChargeMaster;
	 
	 @FindBy(xpath="(//i[contains(@class,'plus')])[1]")
	 private WebElement ChargeMasterPlusIcon;
	 
	 
     @FindBy(xpath="//i[text()='save']")
	 private WebElement saveChargeMaster;
	 
	 
	 @FindBy(xpath="(//span[contains(@class,'overclick ')])[1]")
	 private WebElement ChargeMasterclick;
	 
	 @FindBy(xpath="(//span[@class='add'])[2]")
	 private WebElement Payerplusicon;
	 
	 
	 @FindBy(xpath="//input[@name='policyType']")
	 private WebElement PlanName;
	 
	 @FindBy(xpath="//input[@name='amount']")
	 private WebElement Amount;
	 
	 @FindBy(xpath="//i[text()='save']")
	 private WebElement SavePayer;
	 
	 @FindBy(xpath="//i[text()='edit']")
	 private WebElement EditIcon;
	 
	 public ChargeMaster(WebDriver driver)
	 {
		super(driver); 
	 }
	 
	 public void clicksettings(){
	  settingstab.click();

	 }
	 
	 
	 public void clickservicetab(){
		 servicetab.click();

		 }
		 
	public void clickCPT()
	 {
		CTP.click();
	 }


	public void clickplusicon()
	 {

		plusicon.click();
	 }

	public void setcode(String c1){
	  code.sendKeys(c1);
	 }
	
	public void setdescription(String d1){
		  description.sendKeys(d1);
		 }

	public void setDefaultCharge(String DC){
		DefaultCharge.sendKeys(DC);
		 }
	
	
	public void clicksave()
	 {

		save.click();
	 }
	
	
	
	

	public void clickChargeMaster()
	 {

		ChargeMaster.click();
	 }
	

	public void clickChargeMasterPlusIcon()
	 {

		ChargeMasterPlusIcon.click();
	 }
	
	
	
	public void clickChargeMasterclick()
	 {

		ChargeMasterclick.click();
		

	 }
	
	public void clicksaveChargeMaster()
	 {

		saveChargeMaster.click();
		

	 }
	
	public void clickPayerplusicon()
	 {

		Payerplusicon.click();
		}
	
	public void setPlanName(String P1){
		PlanName.sendKeys(P1);
		 }
	
	public void setAmount(String A1){
		Amount.sendKeys(A1);
		 }
	
	
	
	public void clickSavePayer()
	 {

		 SavePayer.click();
	 }
	
	public void clickEditIcon()
	 {

		EditIcon.click();
	 }
	
	
}
