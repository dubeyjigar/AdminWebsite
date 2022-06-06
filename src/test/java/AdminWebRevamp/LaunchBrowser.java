package AdminWebRevamp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class LaunchBrowser {
	
	static WebDriver driver;
	
	/*
	 * */
	@BeforeMethod
	public void Launch_Browser() throws Exception {
		System.setProperty("webdriver.chrome.driver","E:\\Automation Software\\chromedriver_win32\\chromedriver.exe");  	
		driver = new ChromeDriver();
		driver.get("https://qcadmin.playerzpot.com/v5/Login");
		System.out.println(driver.manage().window().getSize());
		driver.manage().window().maximize();
		Thread.sleep(10000);
		
	}

	@AfterMethod
	public static void close_browser() throws InterruptedException{
		driver.close();
	}
}
