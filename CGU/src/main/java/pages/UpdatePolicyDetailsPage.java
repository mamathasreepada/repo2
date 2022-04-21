package pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;



public class UpdatePolicyDetailsPage extends HomePage{
	
	public static By Updatepolicydetailsxpath  = By.xpath("//h1[@itemprop='name']");
	public static By TypeofinsuranceDropdownXpath  = By.xpath("//select[@id='edit-submitted-type-of-insurance']");
	
	public static void getheadertext()
	{
		String HeaderText =driver.findElement(Updatepolicydetailsxpath).getText();
		System.out.println(HeaderText);
	}
	
	public static void  TypeofinsuranceDropdown()
	{
		Actions Act = new Actions(driver);
		Act.sendKeys(Keys.DOWN).build().perform();
		WebDriverWait wait = new WebDriverWait(driver, 10);
		
		WebElement dropdown = driver.findElement(TypeofinsuranceDropdownXpath);
		wait.until(ExpectedConditions.elementToBeClickable(dropdown));
		Act.moveToElement(dropdown).build().perform();
		Select obj = new Select(dropdown);
		obj.selectByValue("Commercial");
		
	}
	
	public static void TypeofinsuranceDropdown(String value )
	
	{
		Actions Act = new Actions(driver);
		Act.sendKeys(Keys.DOWN).build().perform();
		WebDriverWait wait = new WebDriverWait(driver, 10);
		
		WebElement ele = driver.findElement(TypeofinsuranceDropdownXpath);
		Act.moveToElement(ele).build().perform();
		wait.until(ExpectedConditions.elementToBeClickable(ele));
		Select dropdown = new Select(ele);
		List<WebElement> alloptions = dropdown.getOptions();
		 for(WebElement option : alloptions)
		 {
			 if (option.getText().equals(value))
			 {
				 option.click();
			 }
		 }
	}
		
	
		
	

}
