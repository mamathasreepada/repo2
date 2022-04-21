package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CarClaimsPage  extends MakeaClaimPGE {
	//public static WebDriver driver =MakeaClaimPGE.driver;
	
	public static By FirstNameXpath = By.xpath("//input[@id='edit-submitted-about-you-first-name']");
	public static By SurNameXpath = By.xpath("//input[@id='edit-submitted-about-you-surname']");
	public static By SubmitXpath = By.xpath("//input[@value='Submit']");
	public static By ErrorMessageXpath = By.xpath("//span[@class='ErrorLabel']");
	public static String firstnameinput;
	public static WebElement FirstNameDataField;
	public static WebElement SurNameDataField;
	public static String Error = null;
	
	//common method 
		public static  String GetTextOfField(WebElement ele ) throws InterruptedException
		{
			Thread.sleep(5000);
			WebDriverWait wait = new WebDriverWait(driver,30);
			wait.until(ExpectedConditions.stalenessOf(ele));
			String text = ele.getText();
			return  text;
		}
		
	public static String  firstnametextbox(String Firstname)
	{
		FirstNameDataField = driver.findElement(FirstNameXpath);
		FirstNameDataField.sendKeys(Firstname);
		return Firstname;
			
	}
	//Page Method 
	public static String GetFirstNameData() throws InterruptedException
	{
		String firstNameData  = GetTextOfField(FirstNameDataField);
		return firstNameData;
	}
	
	public static String geterrormessageoffirstname()
	{
			
		String ExactCurrentFieldValue = firstnametextbox("");
		
		if(ExactCurrentFieldValue=="")
		{
		Error = driver.findElement(ErrorMessageXpath).getText();
		System.out.println(Error);
				
		}
		return Error;
								
	}
	
	//************** Surname****************//
	
	public static String Surnametextbox(String Surname)
	{
		SurNameDataField =driver.findElement(SurNameXpath);
		SurNameDataField.sendKeys(Surname);
		return Surname;
	}
	//Page Method 
	public static String GetsurNameData() throws InterruptedException
	{
		String surNameData  = GetTextOfField(SurNameDataField);
		return surNameData;
	}
	
	public static String geterrormessageofsurname()
	{
			
		String ExactCurrentFieldValue = Surnametextbox("");
		
		if(ExactCurrentFieldValue=="")
		{
		Error = driver.findElement(ErrorMessageXpath).getText();
		System.out.println(Error);
		}
		return Error;
	}				
	

	public static void submitbutton() throws InterruptedException
	{
		Actions Act = new Actions(driver);
		Act.sendKeys(Keys.END).build().perform();
		WebElement SubmitButton = driver.findElement(SubmitXpath);
		Act.moveToElement(SubmitButton).build().perform();
		SubmitButton.click();
		Thread.sleep(3000);

	}
}
	
