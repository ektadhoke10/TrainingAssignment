package facebookPage;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

public class SignUpPage extends BaseTest{

	BaseTest objBaseTest =new BaseTest();


	public void setFirstNameOnFacebookSignupPage() {
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys(getFirstNameOnFacebookSignupPage());
	}

	public void setLastNameOnFacebookSignupPage() {
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys(getLastNameOnFacebookSignupPage());
	}

	public void setMobileNumberForFacebookSignupPage() {
		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys(getMobileNumberForFacebookSignupPage());
	}

	public void setPasswordForFacebookSignupPage() {
		driver.findElement(By.xpath("//input[@name='reg_passwd__']")).sendKeys("vstl@123");
	}

	public void setDateForFacebookSignupPage() {
		Select date = new Select(driver.findElement(By.xpath("//select[@id='day']")));
		date.selectByVisibleText(getDate());
	}
	
	public void setMonthForFacebookSignupPage() {
		Select month = new Select(driver.findElement(By.xpath("//select[@id='month']")));
		month.selectByValue(getMonth());
	}
	
	public void setYearForFacebookSignupPage() {
		Select year = new Select(driver.findElement(By.xpath("//select[@id='year']")));
		year.selectByValue(getYear());
	}
	
	public void setGenderForFacebookSignupPage(int intNum) {
		if (intNum==1) {
			driver.findElement(By.xpath("//*[contains(text(),'Female')]")).click();
		} else  if (intNum==2) {
			driver.findElement(By.xpath("//*[contains(text(),'Male')]")).click();
		}else {
			driver.findElement(By.xpath("//*[contains(text(),'Custom')]")).click();
		}
	} 
	
	public void clickOnTerms() {
		
		driver.findElement(By.xpath("//*[@id=\"terms-link\"]")).click();
		String parentTab = driver.getWindowHandle();
		for(String childTab: driver.getWindowHandles())
		{
		driver.switchTo().window(childTab);
		}
		if (driver.getTitle().equals("Facebook")) {
			System.out.println("Title is correct: " + driver.getTitle());
		}else {
			System.out.println("Title is not correct: "+driver.getTitle());
		}
		driver.close();
		driver.switchTo().window(parentTab);
	}
	
	
	public void clickOnCookiePolicy() {
		driver.findElement(By.xpath("//*[@id=\"cookie-use-link\"]")).click();
		
		String parentTab = driver.getWindowHandle();
		for(String childTab: driver.getWindowHandles())
		{
		driver.switchTo().window(childTab);
		}
		if (driver.getTitle().equals("Cookie Policy")) {
			System.out.println("Title is correct: " + driver.getTitle());
		}else {
			System.out.println("Title is not correct: "+driver.getTitle());
		}
		driver.close();
		driver.switchTo().window(parentTab);
	}
}

