package CarClaimsTests;

import org.testng.Assert;
import org.testng.annotations.Test;

import Base.SetUp;
import pages.CarClaimsPage;
import pages.HomePage;
import pages.MakeaClaimPGE;

public class CarClaimTest extends SetUp {
	@Test
	public void carClaimsForm() throws InterruptedException
	{
		extentTest = extentreports.startTest("carClaimsForm");
		HomePage.MakeClaimClick();
		MakeaClaimPGE.SubmitCarClaimClick();
		CarClaimsPage.firstnametextbox("mamatha");
		CarClaimsPage.Surnametextbox("");
		CarClaimsPage.submitbutton();
		String FirstNameData = CarClaimsPage.GetFirstNameData();
		if(FirstNameData.isEmpty())
		{
			String Firstactual =CarClaimsPage.geterrormessageoffirstname();
			String Surnameexpected ="Some fields require your attention";
			Assert.assertEquals(Firstactual, Surnameexpected);
			
		}
		String SurNameData = CarClaimsPage.GetFirstNameData();
		if(SurNameData.isEmpty())
		{
			String surnameactual =CarClaimsPage.geterrormessageofsurname();
			String surnameexpected ="Some fields require your attention";
			Assert.assertEquals(surnameactual, surnameexpected);
		}	
	
	}

}
