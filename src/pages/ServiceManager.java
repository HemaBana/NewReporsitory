package pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ServiceManager extends LoginPage {
	@FindBy(xpath="//span[text()='Settings']")
	 private WebElement settingstab;
	 
	 @FindBy(xpath="//a[contains(text(),'Service')]")
	 private WebElement servicetab;
	 
	 @FindBy(xpath="//a[contains(text(),'Addon')]")
	 private WebElement Addons;

	 @FindBy(xpath="//i[contains(@class,'plus')]")
	 private WebElement plusicon;
	 
	 @FindBy(xpath="//input[@name='code']")
	 private WebElement code;
	 
	 @FindBy(xpath="//input[@name='serviceManagerValue']")
	 private WebElement description;
	 
	 @FindBy(xpath="//i[text()='save']")
	 private WebElement save;
	 
	 @FindBy(xpath="//i[text()='edit']")
	 private WebElement Edit;
	 
	 public ServiceManager(WebDriver driver)
	 {
		super(driver); 
	  PageFactory.initElements(driver,this);
	 }
	 
	 public void clicksettings(){
	  settingstab.click();

	 }
	 
	public void clickservice()
	 {
		servicetab.click();
	 }

	public void clickAddons()
	 {

		Addons.click();
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

	public void clicksave()
	 {

		save.click();
	 }
	public void clickEdit()
	 {

		Edit.click();
	 }
	
	
}
