package utility;

import org.openqa.selenium.Alert;

import basePackage.BaseInit;

public class MyLibrary extends BaseInit{
	
	public static void signIN(String uname,String pwd) throws InterruptedException
	{
		
		//isElementPresent("ip_emailadd_swaglabs_id").click();
		isElementPresent("ip_emailadd_swaglabs_id").sendKeys("Uname");
		isElementPresent("ip_pwd_swageslabs_id").sendKeys("pwd");
		Thread.sleep(3000);
		Alert a= driver.switchTo().alert();
		String msg =a.getText();
		System.out.println( msg);
		a.accept();
	}
	
	public static void signOUT()
	{
		
		isElementPresent("Main_menue").click();
		isElementPresent("div_logout").click();
	}

}
