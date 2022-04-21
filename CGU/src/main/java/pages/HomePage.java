package pages;

import org.openqa.selenium.By;

import Base.SetUp;

public class HomePage extends SetUp {
	//public static WebDriver driver = SetUp.BrowserStart();
	public static String MakeaClaimXpath = "//span[normalize-space()='Make a claim']";
	public static By WorkersCompensationXpath =By.xpath("//a[@data-tracking='link-click:heroWorkersCompensation']");
	public static By Updatemydetailsxpath = By.xpath("//span[normalize-space()='Update my details']");
	
	public static void MakeClaimClick()
	{
		driver.findElement(By.xpath(MakeaClaimXpath)).click();
		
	}
	public static void WorkersCompensationClick()
	{
		driver.findElement(WorkersCompensationXpath).click();
	}
	
	public static void UpdatemydetailsClick()
	{
		
		driver.findElement(Updatemydetailsxpath).click();
	}

}
