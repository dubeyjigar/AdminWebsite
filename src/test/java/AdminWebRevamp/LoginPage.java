package AdminWebRevamp;

import org.openqa.selenium.By;

public class LoginPage extends LaunchBrowser{
	
	static By Emailpath = By.xpath("//input[@name='email']");
	 static By Passwordxpath = By.xpath("//input[@name='password']");
	 static By Loginxpath = By.xpath("//input[@value='login']");
	
	
	public static void LoginMethod() throws InterruptedException{
		Thread.sleep(10000);
		driver.findElement(Emailpath).sendKeys("admin@playerzpot.com");
		driver.findElement(Passwordxpath).sendKeys("admin123");
		driver.findElement(Loginxpath).click();
		Thread.sleep(5000);
	}
	
	
	

}
