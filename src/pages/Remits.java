package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Remits extends LoginPage  {
	@FindBy(xpath="//span[text()='Billings']")
	 private WebElement Billing;
	
	
	@FindBy(xpath="//a[contains(text(),'Claim Remits')]")
	 private WebElement ClaimRemits;
	

	@FindBy(xpath="//span[contains(@class,'fa fa-filter')]")
	 private WebElement Filter;
	
	@FindBy(xpath="//button[text()='Search']")
	 private WebElement SearchIcon;
	
	@FindBy(xpath="//i[text()='edit']")
	 private WebElement EditIcon;
	
	@FindBy(xpath="(//span[contains(text(),'Encounter Details')])[1]")
	 private WebElement EncounterTab;
	
	@FindBy(xpath="(//button[contains(text(),'Apply Action')])[2]")
	 private WebElement ApplyActionButton;
	
public Remits(WebDriver driver)
{
	super(driver); 
 PageFactory.initElements(driver,this);
}

public void clickBilling(){
	Billing.click();

	
}

public void clickClaimRemits(){
	ClaimRemits.click();

	
}

	 public void clickFilter(){
		 Filter.click(); 

		 }
	 public void clickSearchIcon(){
		 SearchIcon.click(); 

		 }
	
	 public void clickEditIcon(){
		 EditIcon.click(); 

		 }
	 public void clickEncounterTab(){
		 EncounterTab.click(); 

		 }
	 public void clickApplyActionButton(){
		 ApplyActionButton.click(); 

		 }
	 
}