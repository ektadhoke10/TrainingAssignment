package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;

import facebookPage.BaseTest;


public class LocatorsEx extends BaseTest {


	public void setFirstNameUsingXpath() {
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("vstl");
	}

	public void setLastNameUsingName()  {
		driver.findElement(By.name("lastname")).sendKeys("Technologies");
	}

	public void setEmailUsingCssSelector()  {
		driver.findElement(By.cssSelector("input[name='reg_email__']")).sendKeys("vstl@gmail.com");
	}

	public void setPasswordUsingId() {
		driver.findElement(By.id("password_step_input")).sendKeys("vstl@123");
	}

	public void getTextUsingClassName() {
		String displayText= driver.findElement(By.className("_9bq5")).getText();
		System.out.println("getTextUsingClassName: "+ displayText );

	}
	public void getSizeOfTagUsingTagName() {
		Dimension size= driver.findElement(By.tagName("a")).getSize();
		System.out.println(size);
	}

	public void clickOnTermsUsingLinkText() {
		driver.findElement(By.linkText("Cookie Policy")).click();
		//driver.findElement(By.partialLinkText ("Cookie")).click();

	}





}
