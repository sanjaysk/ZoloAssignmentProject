package BusinessScenarios_Component;

import java.io.IOException;
import java.util.Map;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import Generic_Component.BaseClass;
import PageFactory_Component.zoloAssignmentPart1;

public class zoloPart1Test extends BaseClass{
	
	SoftAssert sassert =new SoftAssert();
	
	@Test(dataProvider = "dp_zolopart1test1", dataProviderClass = DataProvider_Component.Dataprovider_testdata.class)
	public void test1(Map<String,String> dm) throws IOException
	{
		String loginname = dm.get("username");
		String passwrd = dm.get("password");
		String searchtiem = dm.get("searchitem");
		
		//Create webdriver instance and launch the url
		setup();
		
		//create pagefactory object to access objects and methods for part1 tests
		zoloAssignmentPart1 zl = new zoloAssignmentPart1(driver);
		
		//login into the application
		zl.clickLoginButton();
		Explicit_Wait(zl.username,35);
		zl.setUsername(loginname);
		zl.setPassword(passwrd);
		zl.clickSigninButton();
		
		//enter the search item and select from dropdown
		Explicit_Wait(zl.searchBar,35);
		zl.enterSearchitem(searchtiem);
		Explicit_Wait(zl.finalItem,35);
		zl.selectFinalItem();
		
	}
	
	@Test(dataProvider = "dp_zolopart1test", dataProviderClass = DataProvider_Component.Dataprovider_testdata.class)
	public void test2(Map<String,String> dm) throws IOException
	{
		
		String budgetrange = dm.get("budgetrange");
		String selectedpg = dm.get("pgselected");
		setup();
		
		zoloAssignmentPart1 zl = new zoloAssignmentPart1(driver);
		
		zl.selectBudgetRange(budgetrange);
		Explicit_Wait(zl.chosePG,35);
		zl.chosingPG();
		String actualResult = zl.getSelectedPG();
		
		if(actualResult.equals(selectedpg))
		{
			sassert.assertEquals(actualResult, selectedpg);
		}
		else
		{
			sassert.fail("Test case failed");
		}
	}
	
	@Test(dataProvider = "dp_zolopart1test", dataProviderClass = DataProvider_Component.Dataprovider_testdata.class)
	public void test3(Map<String,String> dm) throws IOException
	{
		String visitdate = dm.get("visitdate");
		String visittime = dm.get("visittime");
		String statuscode = dm.get("status_code");
		
		setup();
		
		zoloAssignmentPart1 zl = new zoloAssignmentPart1(driver);
		
		zl.clickschedulevisitbutton();
		zl.selectVisitingDate(visitdate);
		zl.selectVisitingTime(visittime);
		zl.clickschedulevisitbutton();
		
		String actualstatusCode = zl.getStatusCode();
		
		if(actualstatusCode.equals(statuscode))
		{
			sassert.assertEquals(actualstatusCode, statuscode);
		}
		else
		{
			sassert.fail("Test case failed");
		}
	}

}
