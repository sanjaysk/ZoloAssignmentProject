package BusinessScenarios_Component;

import java.io.IOException;
import java.util.Map;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import Generic_Component.BaseClass;
import PageFactory_Component.zoloAssignmentPart1;
import PageFactory_Component.zoloAssignmentPart2;

public class zoloPart2Test extends BaseClass {
	
	SoftAssert sassert = new SoftAssert();
	
	@Test(dataProvider = "dp_zolopart2test", dataProviderClass = DataProvider_Component.Dataprovider_testdata.class)
	public void test4(Map<String,String> dm) throws IOException
	{
		String loginname = dm.get("username");
		String passwrd = dm.get("password");
		String bookdate = dm.get("booking_date");
		String selectdePg = dm.get("selected_PG");
		String nameonPaymentpage = dm.get("Name");
		String phoneonpaymentpage = dm.get("Phone");
		
		setup();
		
		zoloAssignmentPart1 zl = new zoloAssignmentPart1(driver);
		
		zl.clickLoginButton();
		zl.setUsername(loginname);
		zl.setPassword(passwrd);
		zl.clickSigninButton();
		
		zoloAssignmentPart2 zl2 = new zoloAssignmentPart2(driver);
		
		zl2.clickOnTestAccount();
		zl2.clickOnFavorites();
		zl2.clickShortlistedPG();
		
		zl2.clickRequestBedButton();
		zl2.enterBookingDate(bookdate);
		zl2.clickOnTwoSharinglink();
		zl2.clickProceedToPayButton();
		
		String userNameOnPaymentPage = zl2.getUserNameOnPaymentPage();
		String phoneofUserOnPaymentPage = zl2.getPhoneofUserOnPaymentPage();
		if(userNameOnPaymentPage.equals(nameonPaymentpage) && phoneofUserOnPaymentPage.equals(phoneonpaymentpage))
		{
			sassert.assertEquals(userNameOnPaymentPage, nameonPaymentpage);
		}
		else
		{
			sassert.fail("Wrong User detials");
		}
		
		
		
		
	}
	public void test5(Map<String,String> dm) throws IOException
	{
		String promocode = dm.get("promo_code");
		setup();
		
		zoloAssignmentPart2 zl2 = new zoloAssignmentPart2(driver);
		
		if(!(zl2.promoCheckBox).isEnabled())
		{
			zl2.clickonPromoCheckBox();
		}
		zl2.enterPromoCode(promocode);
		zl2.clickOnApplyPromoCodeButton();
		zl2.clickOnMakePaymentButton();
		
	}

}
