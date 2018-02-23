package pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DomainValues extends ServiceManager {
	@FindBy(xpath="//span[text()='Settings']")
	 public WebElement settingstab1;
	 
	 @FindBy(xpath="//a[contains(text(),'Domain')]")
	 public WebElement DomainTab;
	 
	 @FindBy(xpath="//i[text()='replay']")
	 public WebElement ReplayIcon;
	 
	 @FindBy(xpath="//a[contains(text(),'Adjustment Code')]")
	 public WebElement AdjustmentCode;

	 @FindBy(xpath="//i[contains(@class,'plus')]")
	 public WebElement plusicon;
	 
	 @FindBy(xpath="//input[@name='domainValue']")
	 public WebElement value;
	 
	 
	@FindBy(xpath="//input[@name='code']")
	 public WebElement Code;
	 
	 @FindBy(xpath="//i[text()='save']")
	 public WebElement save;
	 
	 
	 @FindBy(xpath="//i[text()='edit']")
	 public WebElement Edit;
	 
	 public DomainValues(WebDriver driver)
	 {
		super(driver); 
	  PageFactory.initElements(driver,this);
	 }
	 
	 public void clicksettings(){
	  settingstab1.click();

	 }
	 
	public void clickDomain()
	 {
		DomainTab.click();
	 }

	public void clickAdjustmentCode()
	 {

		AdjustmentCode.click();
	 }

	public void clickplusicon()
	 {

		plusicon.click();
	 }

	public void setValue(String v1){
		value.sendKeys(v1);
	 }
	public void setCode(String C1){
		 Code.sendKeys(C1);
		}

	public void clicksave()
	 {

		save.click();
	 }

	public void clickEdit()
	 {

		Edit.click();
	 }
	
	public void clickReplayIcon()
	 {

		ReplayIcon.click();
	 }
	
}