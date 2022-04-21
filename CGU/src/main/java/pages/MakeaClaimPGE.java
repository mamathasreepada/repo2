package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MakeaClaimPGE extends HomePage  {
	
	//public static WebDriver driver =HomePage.driver;
	public static By SubmitCarClaimXpath = By.xpath("//a[@class='track_submitACarClaim']");
	
	public static void SubmitCarClaimClick()
	{
		
		driver.findElement(SubmitCarClaimXpath).click();
	}

}
