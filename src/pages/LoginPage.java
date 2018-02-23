package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import generic.BasePage;

public class LoginPage  extends BasePage {
 @FindBy(id="i0116")
 private WebElement unTB;
 
 @FindBy(id="idSIButton9")
 public WebElement nextBTN;
 
 @FindBy(id="i0118")
 public WebElement pwTB;
 
 @FindBy(id="idSIButton9")
 public WebElement loginBTN;
 
 @FindBy(id="idSIButton9")
 private WebElement signBTN;

 
 public LoginPage(WebDriver driver)
 {
	super(driver); 
  PageFactory.initElements(driver,this);
 }
 
 public void setUserName(String un){
  unTB.sendKeys(un);

 }
 
public void clickNext()
 {

	 nextBTN.click();
 }



public void setPassword(String pw){
  pwTB.sendKeys(pw);
 }
 
 public void clickLogin(){
  loginBTN.click();
 }

 public void clickSign(){
	  signBTN.click();
	 }


 /*public void verifyErrMsgIsDisplayed(WebDriver driver){
   WebDriverWait wait=new WebDriverWait(driver,10);
   try{
   wait.until(ExpectedConditions.visibilityOf(errMsg));
   Reporter.log("PASS: Error Msg Is Displayed",true);
    }
   catch(Exception e){
   Reporter.log("FAIL: Error Msg Is NOT Displayed",true);
   Assert.fail();
   }*/
 }







