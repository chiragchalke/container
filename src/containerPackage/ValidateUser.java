package containerPackage;

import org.openqa.selenium.By;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import basePackage.BaseInit;
import utility.MyLibrary;



public class ValidateUser extends BaseInit {
	@BeforeTest
	public void setup() throws Exception
	{
		startup();
	}
	
@Test
	public void testValidateuser() throws InterruptedException {
		driver.get(sitedata.getProperty("url1"));
		MyLibrary.signIN("standard_user", "secret_sauce");
		boolean checkLogin;
		try {
			checkLogin = driver.findElement(By.linkText("PRODUCTS")).isDisplayed();

		} catch (Exception e) {
			// TODO: handle exception
			checkLogin = false;
		}
		if (checkLogin) {
			System.out.println("Login successfully");

		} else

		{
			System.out.println("you are Alredy login");
		}

	}

}
