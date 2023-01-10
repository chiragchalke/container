package utility;

import basePackage.BaseInit;

public class MyLibrary extends BaseInit{
	
	public static void signIN(String uname,String pwd) throws InterruptedException
	{
		isElementPresent("ip_emailAddress").sendKeys("Uname");
		isElementPresent("ip_password").sendKeys("pwd");
		isElementPresent("btn_signin_id").click();
		
	}
	
	public static void signOUT()
	{
		
		isElementPresent("Main_menue").click();
		isElementPresent("div_logout").click();
	}

}
		//Thread.sleep(3000);
		//Alert a= driver.switchTo().alert();
		//String msg =a.getText();
		//System.out.println( msg);
		//a.accept();