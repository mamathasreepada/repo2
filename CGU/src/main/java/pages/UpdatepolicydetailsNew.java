package pages;

import org.openqa.selenium.By;

public class UpdatepolicydetailsNew {
	
	
	public static By insurancetypexpath = By.xpath("//span[normalize-space()='Please Choose']");
	public static By RuralXpath = By.xpath("//li[@class='active-result'][3]");
	
	public static By Policytypexpath  = By.xpath("//div[starts-with(@class,'chosen-container chosen-container')]//span[contains(text(),'Please choose')]");
	public static By Farmxpath = By.xpath("//li[@class='active-result'][2]");
	
	public static By PolicynumRadioButtonYesXpath = By.xpath("//label[@for='edit-submitted-do-you-have-your-policy-number-1']");
	public static By PolicynumTextboxXpath = By.xpath("//input[@id='edit-submitted-policy-number']");
	
	public static By PurcahseUnsurancexpath = By.xpath("//div[starts-with(@id,'edit_submitted_where')]//span[contains(text(),'Please choose')]");
	public static By CGUxpath = By.xpath("//li[@class='active-result'][3]");
	
	public static By Firstnamexpath = By.xpath("//input[@id='edit-submitted-first-name']");
	public static By Lastnamexpath = By.xpath("//input[@id='edit-submitted-last-name']");
	public static By Mailingaddressxpath = By.xpath("//input[@id='edit-submitted-mailing-address']");
	public static By Phonenumberxpath = By.xpath("//input[@id='edit-submitted-phone-number']");
	public static By Emailaddressxpath = By.xpath("//input[@id='edit-submitted-email-address']");
	
	public static By ChangeofpersonalcontactdetailsXpath = By.xpath("//label[@for='edit-submitted-change-of-personal-contact-details-1']");
	public static By ChangeofpersonalcontactdetailstextboxXpath = By.xpath("//textarea[@id='edit-submitted-change-of-personal-contact-details-text']");
	public static By Changetolevelofcoverxpath = By.xpath("//label[@for='edit-submitted-change-to-level-of-cover-1']");
	public static By Changetolevelofcovertextboxxpath = By.xpath("//textarea[@id='edit-submitted-change-to-level-of-cover-text']");
	
	public static By IagreeXpath = By.xpath("//label[@for='edit-submitted-i-agree-1']");
	
	public static By Submitxpath = By.xpath("//input[@value='Submit']");
	
	public static void insuranceDropdown() throws InterruptedException
	 {
		BaseactionsPage.click(insurancetypexpath);
		BaseactionsPage.click(RuralXpath);
	 }
	
	 public static void policytypeDropdown() throws InterruptedException
	 {
		BaseactionsPage.click(Policytypexpath);
		BaseactionsPage.click(Farmxpath);
		 
	 }
	 
	 public static void PolicynumradiobuttonYes(String Policynum) throws InterruptedException
	 {
		 BaseactionsPage.scrolldown();
		 BaseactionsPage.explicitwait(PolicynumRadioButtonYesXpath);
		 BaseactionsPage.click(PolicynumRadioButtonYesXpath);
		if(PolicynumRadioButtonYesXpath.equals(PolicynumRadioButtonYesXpath))
		{
			BaseactionsPage.EnterText(PolicynumTextboxXpath, Policynum);
		}
		Thread.sleep(3000);
	 }
	 
	 public static void purchaseinsuranceDropDown() throws InterruptedException
	 {
		 BaseactionsPage.scrolldown();
		 BaseactionsPage.click(PurcahseUnsurancexpath);
		 BaseactionsPage.click(CGUxpath);
		 
	 }
	 
	 public static void Firstname(String firstname)
	 {
		 BaseactionsPage.scrolldown();
		 BaseactionsPage.EnterText(Firstnamexpath,firstname);
	 }
	
	 public static void Lastname(String Lastname)
	 {
		BaseactionsPage.EnterText(Lastnamexpath,Lastname);
	 }
	 
	 public static void Mailingaddress(String Mailingaddress)
	 {
		 BaseactionsPage.EnterText(Mailingaddressxpath,Mailingaddress);
	 }
	 
	 public static void Phonenumber(String Phonenumber)
	 {
		BaseactionsPage.EnterText(Phonenumberxpath, Phonenumber);
	 }
	 
	 public static void Emailaddress(String Emailaddress) throws InterruptedException
	 {
		 BaseactionsPage.scrolldown();
		 BaseactionsPage.EnterText(Emailaddressxpath, Emailaddress);
	 }
	 
	 public static void ChangeofDetails(String ptext, String ltext) throws InterruptedException
	 {
		 BaseactionsPage.scrolldown();
		 BaseactionsPage.explicitwait(ChangeofpersonalcontactdetailsXpath);
		 BaseactionsPage.click(ChangeofpersonalcontactdetailsXpath);
		 if(ChangeofpersonalcontactdetailsXpath.equals(ChangeofpersonalcontactdetailsXpath))
		 {
		 BaseactionsPage.EnterText(ChangeofpersonalcontactdetailstextboxXpath, ptext);
		 }
		 BaseactionsPage.click(Changetolevelofcoverxpath);
		 if(Changetolevelofcoverxpath.equals(Changetolevelofcoverxpath))
		 {
		 BaseactionsPage.EnterText(Changetolevelofcovertextboxxpath, ltext);
		 }
	 }
	 
	 public static void Iagreecheckbox() throws InterruptedException
	 {
		BaseactionsPage.scrolldown();
		BaseactionsPage.explicitwait(IagreeXpath);
		BaseactionsPage.click(IagreeXpath);
		Thread.sleep(3000);
	 }
	
	 public static void Submitbutton()
	 {
		BaseactionsPage.scrolldown();
		BaseactionsPage.click(Submitxpath);
	 }
}
