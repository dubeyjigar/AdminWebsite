package AdminWebRevamp;

import java.io.IOException;

import org.testng.annotations.Test;

public class TestCasesPage extends LaunchBrowser {
	
	@Test
	public void User_Email_TC() throws InterruptedException, IOException{
		LoginPage.LoginMethod();
		UserPage.User_Email();
	}

	@Test
	public void User_Email_TC1() throws InterruptedException, IOException{
		LoginPage.LoginMethod();
		UserPage.User_Email();
	}
}
