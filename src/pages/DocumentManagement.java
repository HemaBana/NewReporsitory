package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DocumentManagement extends LoginPage {
	@FindBy(xpath="(//a[@class='highlightTag'])[1]")
	 private WebElement Workplacetab;
	 
	 @FindBy(xpath="(//a[contains(text(),'Management')])[1]")
	 private WebElement DocumentManagementTab;
	 
	 @FindBy(xpath=".//*[@id='mainView']/section[1]/div[2]/ul/li/img")
	 private WebElement UploadIcon;

	 @FindBy(id="input-60")
	 private WebElement Patient;
	 
	 @FindBy(xpath="//span[text()='Lin']")
	 private WebElement PatientName;
	 
	 @FindBy(xpath="//input[@name='fileName']")
	 private WebElement FileName;
	 
	 @FindBy(xpath="//textarea[@name='description']")
	 private WebElement FileDescription;
	 
	 
	 @FindBy(xpath="//button[text()='Upload']")
	 private WebElement UploadButton;
	 
	 
	 @FindBy(xpath="(//i[text()='edit'])[1]")
	 private WebElement EditIcon;
	 
	 @FindBy(xpath="(//i[text()='delete'])[2]")
	 private WebElement DeleteIcon;
	 
	 @FindBy(xpath="//button[text()='Save']")
	 private WebElement SaveButton;
	 
	 
	 
	 public DocumentManagement(WebDriver driver)
	 {
		super(driver); 
	  PageFactory.initElements(driver,this);
	 }
	 
	 public void clickWorkplacetab(){
		 Workplacetab.click();

	 }
	 
	public void clickDocumentManagementTab()
	 {
		DocumentManagementTab.click();
	 }

	public void clickUploadIcon()
	 {

		UploadIcon.click();
	 }

	public void clickPatient()
	 {

		 Patient.click();
	 }


	public void clickPatientName()
	 {

		PatientName.click();
	 }

	public void setFileName(String F1){
		FileName.sendKeys(F1);
	 }
	
	public void setFileDescription(String D1){
		FileDescription.sendKeys(D1);
	 }
	
	public void clickUploadButton()
	 {

		UploadButton.click();
	 }
	public void clickEditIcon()
	 {

		EditIcon.click();
	 }
	
	public void clickDeleteIcon()
	 {

		DeleteIcon.click();
	 }
	
	public void clickSaveButton()
	 {

		SaveButton.click();
	 }
	
}