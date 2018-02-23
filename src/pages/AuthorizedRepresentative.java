package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AuthorizedRepresentative extends LoginPage  {
	@FindBy(xpath=".//*[@id='tab-content-2']/div/md-content/div/div[1]/h3/span/a/i")
	 private WebElement PlusIcon;
	
	@FindBy(xpath="//button[text()='Save']")
	 private WebElement SaveButton;

	@FindBy(xpath="(//i[text()='edit'])[2]")
	 private WebElement EditButton;
	
	@FindBy(xpath="(//i[text()='delete'])[1]")
	 private WebElement DeleteButton;
	
	@FindBy(xpath="//span[text()='Ok']")
	 private WebElement OkButton;
	
	@FindBy(xpath="//div[@class='toast-message']")
	 private WebElement Message;
	

public AuthorizedRepresentative(WebDriver driver)
{
	super(driver); 
 PageFactory.initElements(driver,this);
}

public void clickPlusIcon(){
	PlusIcon.click();

	
}
	 public void clickSaveButton(){
		 SaveButton.click(); 

		 }
	 public void clickEditButton(){
		 EditButton.click(); 

		 }
	 public void clickDeleteButton(){
		 DeleteButton.click(); 

		 }
	 public void clickOkButton(){
		 OkButton.click(); 

		 }
	 public String message(){
		 return Message.getText();

		 }
	 
	 
}