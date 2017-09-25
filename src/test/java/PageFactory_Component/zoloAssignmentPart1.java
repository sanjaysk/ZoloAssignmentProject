package PageFactory_Component;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class zoloAssignmentPart1 {
	
	
	@FindBy(xpath=".//a[contains(text(),'LOGIN')]")
	public WebElement loginButton;
	
	@FindBy(xpath="html/body/div[3]/div[2]/div/div[2]/div[2]/form/div[1]/input")
	public WebElement username;
	
	@FindBy(xpath="html/body/div[3]/div[2]/div/div[2]/div[2]/form/div[2]/input")
	public WebElement password;
	
	@FindBy(className="btn-group-justified")
	public WebElement signinButton;
	
	//Find the search bar
	@FindBy(id="searchBar")
	public WebElement searchBar;
		
	//find the item to be selected
	@FindBy(xpath=".//*[@id='ui-id-4'][contains(text(),'Electronic City Phase II, Bengaluru, Karnataka, India')]")
	public WebElement finalItem;
	
	@FindBy(xpath=".//*[@id='content']/div/div[1]/div/form/div/div[1]/select")
	public WebElement budgetField;
	
	@FindBy(xpath=".//*[contains(text(),'Zolo Goodfellas for Men')]")
	public WebElement chosePG;
	
	@FindBy(xpath=".//h1[contains(text(),'Zolo Goodfellas for Men')]")
	public WebElement pgselected;
	
	@FindBy(xpath=".//a[contains(text(),'Schedule a Visit')]")
	public WebElement scheduleVisitButton;
	
	@FindBy(xpath=".//*[@name='visitDate']")
	public WebElement visitingDate;
	
	@FindBy(xpath=".//*[@name='visitTime']")
	public WebElement visitingTime;
	
	@FindBy(xpath=".//div[contains(text(),'Schedule aVisit')]")
	public WebElement schedulevistButton;
	
	@FindBy(xpath=".//h4[contains(text(),'NOT_VISITED')]")
	public WebElement statusCode;
	
	
	
	
	//--------Initiate Page Factory----------------------
	
	//----------------------------------------------------
	
	
	
	
	
	public zoloAssignmentPart1(WebDriver driver) {
		// TODO Auto-generated constructor stub
		PageFactory.initElements(driver, this);
	}





	public void clickLoginButton()
	{
		loginButton.click();
	}
	
	public void clickSigninButton()
	{
		signinButton.click();
	}
	
	public void setUsername(String uname)
	{
		username.clear();
		username.sendKeys(uname);
	}
	
	public void setPassword(String passwd){
		password.clear();
		password.sendKeys(passwd);
	}
	
	public void enterSearchitem(String searchItem){
		searchBar.clear();
		searchBar.sendKeys(searchItem);
	}
	
	public void selectFinalItem()
	{
		finalItem.click();
	}
	
	public void selectBudgetRange(String budgetRange)
	{
		Select select = new Select(budgetField);
		select.selectByVisibleText(budgetRange);
	}
	
	public void chosingPG()
	{
		chosePG.click();
	}
	
	public String getSelectedPG()
	{
		return pgselected.getText();
	}
	
	public void clickScheduleVisitButton()
	{
		scheduleVisitButton.click();
	}
	
	
	public void selectVisitingDate(String date)
	{
		visitingDate.sendKeys(date);
	}
	
	public void selectVisitingTime(String time)
	{
		visitingTime.sendKeys(time);
	}
	
	public void clickschedulevisitbutton()
	{
		schedulevistButton.click();
	}
	
	public String getStatusCode()
	{
		return statusCode.getText();
	}

}
