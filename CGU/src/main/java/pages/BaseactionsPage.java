package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Base.SetUp;
//Extra comment for github

public class BaseactionsPage extends SetUp {
	public static void scrolldown()
	{
		Actions Act = new Actions(driver);
		Act.sendKeys(Keys.DOWN).build().perform();
	}
	
	public static void explicitwait(By EWait)
	{
		WebDriverWait wait = new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.elementToBeClickable(EWait));
	}
	public static void getheadertext(By Header)
	{
		String HeaderText =driver.findElement(Header).getText();
		System.out.println(HeaderText);
	}
	public static void click(By element)
	{
		driver.findElement(element).click();
	}
	public static void EnterText(By element, String text)
	{
		driver.findElement(element).sendKeys(text);
	}
}
