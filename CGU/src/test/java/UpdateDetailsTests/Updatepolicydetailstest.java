package UpdateDetailsTests;

import org.openqa.selenium.By;

import org.testng.annotations.Test;
import Base.SetUp;
import pages.BaseactionsPage;
import pages.HomePage;
import pages.UpdatepolicydetailsNew;

public class Updatepolicydetailstest extends SetUp{ 
	public static By UpdatepolicydetailHeadersxpath  = By.xpath("//h1[@itemprop='name']");
	
	@Test
	public void Updatedetails() throws InterruptedException
	{
		extentTest = extentreports.startTest("Updatedetails");
		
		HomePage.UpdatemydetailsClick();
		BaseactionsPage.getheadertext(UpdatepolicydetailHeadersxpath);
		UpdatepolicydetailsNew.insuranceDropdown();
		UpdatepolicydetailsNew.policytypeDropdown();
		UpdatepolicydetailsNew.PolicynumradiobuttonYes("1578914");
		UpdatepolicydetailsNew.purchaseinsuranceDropDown();
		UpdatepolicydetailsNew.Firstname("Mamatha");
		UpdatepolicydetailsNew.Lastname("Sreepada");
		UpdatepolicydetailsNew.Mailingaddress("12 waterview walk , Docklands");
		UpdatepolicydetailsNew.Phonenumber("5795641235");
		UpdatepolicydetailsNew.Emailaddress("Sreepada.xxxxxx@gmail.com");
		UpdatepolicydetailsNew.ChangeofDetails("mamatha sss,warangal, telanaga", "Something");
		UpdatepolicydetailsNew.Iagreecheckbox();
		UpdatepolicydetailsNew.Submitbutton();
		
		
	}
	

}
