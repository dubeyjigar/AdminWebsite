package AdminWebRevamp;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class UserPage extends LaunchBrowser {
	
	 
	 
	 //static By subUserxpath = By.xpath("//a[text()='Users']");
	 static By UserTypexpath = By.xpath("//select[@id='column']");
	 static By UserSearchxpath = By.xpath("(//input[@type='text'])[3]");
	 static By Gobuttonxpath = By.xpath("//button[text()='GO']");
	
	
public static void User_Email() throws IOException, InterruptedException{
	
	WebElement Userxpath = driver.findElement(By.xpath("//span[text()='Users']"));
	  JavascriptExecutor js = (JavascriptExecutor) driver;
	  js.executeScript("arguments[0].scrollIntoView(true);", Userxpath);
	  Thread.sleep(5000);
	  Userxpath.click();
	  System.out.println("User field found");
	  Thread.sleep(5000);
	  WebElement subUserxpath = driver.findElement(By.xpath("//a[text()='Users']"));
	  ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", subUserxpath);
	  subUserxpath.click();
	  Thread.sleep(5000);
	  System.out.println("Sub User found");
	  
	  WebElement SubUserWeb = driver.findElement(UserTypexpath);
	  ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", SubUserWeb);
	  Thread.sleep(10000);
	  Select fruits = new Select(driver.findElement(UserTypexpath));
		fruits.selectByVisibleText("Email");
		driver.findElement(UserSearchxpath).sendKeys("jigar.dubey@playerzpot.com");
		driver.findElement(Gobuttonxpath).click();
		Thread.sleep(10000);
		List<WebElement> UsersData = driver.findElements(By.xpath("(//th[text()='ID']/../../..//tbody/tr/td)"));
		for(int i=0; i< UsersData.size()-1; i++) {
			System.out.println(UsersData.get(i).getText());
			if(UsersData.get(i).getText().equals("233184") ||
					UsersData.get(i).getText().equals("7208470045") || 
					UsersData.get(i).getText().equals("Verified") ||
					UsersData.get(i).getText().equals("Not Verified") ||
					UsersData.get(i).getText().equals("Automate - Not Uploaded") ||
					UsersData.get(i).getText().equals("2020-12-24 15:52:56") ||
					UsersData.get(i).getText().equals("J61FC05D") ||
					UsersData.get(i).getText().equals("ravi1234") ||
					UsersData.get(i).getText().equals("jigar.dubey@playerzpot.com") ||
					UsersData.get(i).getText().equals("Verified")) {
				System.out.println("Pass");
			} else {
				System.out.println("Fail");
			}
			
		}

}
}
