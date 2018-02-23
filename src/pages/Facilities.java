package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Facilities extends LoginPage {
	@FindBy(xpath="//span[text()='Settings']")
	 private WebElement settingstab1;
	 
	 @FindBy(xpath="//a[text()='Security']")
	 private WebElement SecurityTab;
	 
	 @FindBy(xpath="//a[text()='Facilities']")
	 private WebElement FacilityTab;
	 
	 @FindBy(xpath="//i[contains(@class,'hospital')]")
	 private WebElement AddFacIcon;

	 @FindBy(xpath="//input[@name='name']")
	 private WebElement Name;
	 
	 @FindBy(xpath="//input[@name='phone']")
	 private WebElement Phone;
	 
	 
	 
	 @FindBy(xpath="//input[@name='email']")
	 private WebElement email;
	 
	 
	 @FindBy(xpath=".//*[@id='tab-content-0']/div/md-content/div[1]/div/div[7]/div/div[2]/md-checkbox/div[1]")
	 private WebElement PracticeCheckbox;
	 
	 
	 @FindBy(xpath="//select[@name='pos']")
	 private WebElement Pos;
	 
	 
	 @FindBy(xpath="//option[text()='Pharmacy']")
	 private WebElement Posselect;
	 
	 
	 @FindBy(xpath="//i[contains(@class,'plus')]")
	 private WebElement Addressplus;
	 
	 @FindBy(xpath="//select[@name='addressType']")
	 private WebElement AddressType;
	 
	 @FindBy(xpath="//option[text()='Home']")
	 private WebElement AddressTypeSelect;
	 
	 @FindBy(xpath=".//*[@id='tab-content-0']/div/md-content/div[4]/table/tbody/tr/td[2]/div/input")
	 private WebElement Address1;
	 
	 @FindBy(xpath="//input[@name='city']")
	 private WebElement city;
	 
	 
	 @FindBy(xpath="//select[@name='state']")
	 private WebElement state;
	 
	 @FindBy(xpath="//option[text()='AK']")
	 private WebElement stateselect;
	 
	 @FindBy(xpath="//input[@name='zip']")
	 private WebElement Zipcode;
	 
	 @FindBy(xpath=".//*[@id='mainView']/section[2]/div/div/div/span/button")
	 private WebElement Save;
	 
	 @FindBy(xpath="//button[text()='Cancel']")
	 private WebElement Cancel;
	 
	 
	 @FindBy(xpath="//span[contains(text(),'Working')]")
	 private WebElement WorkHrstab;
	 

	 @FindBy(xpath="(//div[contains(@class,'container')])[4]")
	 private WebElement Checkboxdays;
	 
	 @FindBy(xpath="//a[@class='adlink']")
	 private WebElement ApplyBreaklink;
	 
	 @FindBy(xpath="//i[contains(@class,'plus')]")
	 private WebElement AddBreak;
	 
	 @FindBy(xpath="//input[@name='description']")
	 private WebElement Description;
	 

	 @FindBy(xpath="//button[text()='Save']")
	 private WebElement SaveBreak;
	 
	 @FindBy(xpath="//button[text()='Apply']")
	 private WebElement ApplyButton;
	 
	 @FindBy(xpath="(//i[contains(@class,'plus')])[4]")
	 private WebElement plusHoliday;
	 
	 @FindBy(xpath="(//button[contains(@class,'datepicker')])[1]")
	 private WebElement calendericon;
	 
	 @FindBy(xpath=".//*[@id='md-0-month-2018-0-12']/span")
	 private WebElement selectDate;
	 
	 @FindBy(xpath="//input[@name='description']")
	 private WebElement EnterHoliday;
	 
	 @FindBy(xpath="//button[text()='Save']")
	 private WebElement SaveButton;
	 
	 @FindBy(xpath="(//button[text()='Cancel'])[2]")
	 private WebElement CancelButton;
	 
	 @FindBy(xpath="(//i[text()='edit'])[1]")
	 private WebElement Edit;
	 
	 @FindBy(xpath="//i[contains(@title,'Edit Holiday')]")
	 private WebElement EditHoliday;
	 
	 
	 public Facilities(WebDriver driver)
	 {
		super(driver); 
	  PageFactory.initElements(driver,this);
	 }
	 
	 public void clicksettings(){
	  settingstab1.click();

	 }
	 
	public void clicksecurity()
	 {
		SecurityTab.click();
	 }

	public void clickFacilityTab()
	 {

		FacilityTab.click();
	 }

	public void clickAddFacIcon()
	 {

		AddFacIcon.click();
	 }

	public void setName(String N1){
		Name.sendKeys(N1);
	 }
	
	public void setPhone(String P1){
		Phone.sendKeys(P1);
	 }
	
	
	public void setEmail(String E1){
		email.sendKeys(E1);
	 }
	
	public void clickPracticeCheckbox()
	 {

		PracticeCheckbox.click();
	 }
	

	public void clickPos()
	 {

		Pos.click();
	 }
	
	
	
	public void clickPosselect()
	 {

		Posselect.click();
	 }
	
	public void clickAddressplus()
	 {

		Addressplus.click();
	 }
	
	
	public void clickAddressType()
	 {

		AddressType.click();
	 }
	
	
	public void clickAddressTypeSelect()
	 {

		AddressTypeSelect.click();
	 }
	
	
	public void setAddress1(String Add1){
		Address1.sendKeys(Add1);
	 }
	
	
	public void setcity (String City){
		city.sendKeys(City);
	 }
	

	public void clickstate()
	 {

		state.click();
	 }
	
	public void stateselect()
	 {

		stateselect.click();
	 }
	
	
	public void setZipcode (String Zip){
		Zipcode.sendKeys(Zip);
	 }
	
	
	public void clicksave()
	 {

		Save.click();
	
	}
	


	
	public void clickWorkHours()
	 {

		WorkHrstab.click();
	
	}
	

	public void clickCheckboxdays()
	 {

		Checkboxdays.click();
	
	}
	

	public void clickApplyBreaklink()
	 {

		ApplyBreaklink.click();
	
	}
	

	public void clickAddBreak()
	 {

		AddBreak.click();
	
	}
	
	public void setDescription (String Des){
		Description.sendKeys(Des);
	 }
	

	public void clickSaveBreak()
	 {

		SaveBreak.click();
	
	}
		
	public void clickApplyButton()
	 {

		ApplyButton.click();
	
	}
	
	public void clickplusHoliday()
	 {

		plusHoliday.click();
	
	}
	
	public void clickcalendericon()
	 {

		 calendericon.click();
	
	}
	
	public void clickselectDate()
	 {

		selectDate.click();
	
	}
	
	
	public void setEnterHoliday(String Hol){
		EnterHoliday.sendKeys(Hol);
	 }
	public void clickSaveButton()
	 {

		SaveButton.click();
	
	}
	
	public void clickCancelButton()
	 {

		CancelButton.click();
	
	}
	
	public void clickEdit()
	 {

	Edit.click();
	
	}
	
	public void clickEditHoliday()
	 {

		EditHoliday.click();
	
	}
	
}
