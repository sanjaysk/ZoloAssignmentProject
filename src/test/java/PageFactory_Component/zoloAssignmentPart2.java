package PageFactory_Component;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class zoloAssignmentPart2 {
	
	@FindBy(xpath=".//span[contains(text(),'Favorites')]")
	public WebElement favorites;
	
	@FindBy(xpath=".//a[contains(text(),'Test \' s Account')]")
	public WebElement testAccountlink;
	
	@FindBy(xpath=".//*[@id='57177df96318775b7ce071e4']/a/div[2]/div[1]/h2")
	public WebElement shortlistedPG;
	
	@FindBy(xpath=".//a[contains(text(),'Request a Bed')]")
	public WebElement requestBedButton;
	
	@FindBy(xpath=".//strong[contains(text(),'2 Sharing')]")
	public WebElement twoSharinglink;
	
	@FindBy(xpath=".//input[@type='date']")
	public WebElement bookingDate;
	
	@FindBy(xpath=".//button[contains(text(),'Proceed to Pay')][@class='btn btn-success btn-block center-block']")
	public WebElement proceedToPayButton;
	
	@FindBy(xpath=".//input[@name='fullname']")
	public WebElement nameOfuser;
	
	@FindBy(xpath=".//input[@name='name']")
	public WebElement phone;
	
	@FindBy(xpath=".//input[@type='checkbox']")
	public WebElement promoCheckBox;
	
	@FindBy(xpath=".//input[@name='promoCode']")
	public WebElement promoCodeTextBox;
	
	@FindBy(xpath=".//button[contains(text(),'Apply Code')]")
	public WebElement applyPromoCodeButton;
	
	@FindBy(xpath=".//div[contains(text(),'Make Payment')]")
	public WebElement makePaymentButton;
	
	public zoloAssignmentPart2(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	
	
	
	public void clickOnTestAccount()
	{
		testAccountlink.click();
	}
	
	public void clickOnFavorites()
	{
		favorites.click();
	}
	
	public void clickShortlistedPG()
	{
		shortlistedPG.click();
	}
	public String getShortListedPGName()
	{
		return shortlistedPG.getText();
	}
	public void clickRequestBedButton()
	{
		requestBedButton.click();
	}
	
	public void clickOnTwoSharinglink()
	{
		twoSharinglink.click();
	}
	
	public void enterBookingDate(String bookingdate)
	{
		bookingDate.sendKeys(bookingdate);
	}
	
	public void clickProceedToPayButton()
	{
		proceedToPayButton.click();
	}
	
	public String getUserNameOnPaymentPage()
	{
		return nameOfuser.getText();
	}
	
	public String getPhoneofUserOnPaymentPage()
	{
		return phone.getText();
	}
	
	public void clickonPromoCheckBox()
	{
			promoCheckBox.click();
	}
	
	public void enterPromoCode(String promocode)
	{
		promoCodeTextBox.clear();
		promoCodeTextBox.sendKeys(promocode);
		
	}
	
	public void clickOnApplyPromoCodeButton()
	{
		applyPromoCodeButton.click();
	}
	
	public void clickOnMakePaymentButton()
	{
		makePaymentButton.click();
	}

}
