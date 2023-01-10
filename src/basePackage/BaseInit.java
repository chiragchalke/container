package basePackage;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseInit {

	public static Properties sitedata=null;
	public static WebDriver driver=null;
	public static Logger logs=null;

	public void startup() throws IOException {

		/*
		 * i wan to load browser so i have to first load properties file for get browser
		 * key value
		 */
		sitedata = new Properties();
		FileInputStream fi = new FileInputStream(".\\src\\propertiesData\\ SiteData.properties");
		sitedata.load(fi);

		String browserVal = sitedata.getProperty("browser");
		if (browserVal.equalsIgnoreCase("Chrome")) {
			System.setProperty("WebDriver.chrome.driver", "C:\\Users\\chirag.chalke\\Downloads\\chromedriver_win32.exe");
			driver = new ChromeDriver();
			System.out.println("Browser open");
		} else if (browserVal.equalsIgnoreCase("firefox"))
			;
		{
			System.setProperty("webdriver.firefox.driver", "C:\\Users\\chirag.chalke\\Downloads\\chromedriver_win32");
			System.out.println("FireFox open");
		}

		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	}

	public static WebElement isElementPresent(String propkey) {
		if (propkey.equalsIgnoreCase("xpath")) {
			return driver.findElement(By.xpath(sitedata.getProperty(propkey)));
		} else if (propkey.equalsIgnoreCase("linkText")) {
			return driver.findElement(By.linkText(sitedata.getProperty(propkey)));
		} else if (propkey.equalsIgnoreCase("id")) {
			return driver.findElement(By.id(sitedata.getProperty(propkey)));
		} else if (propkey.equalsIgnoreCase("name")) {
			return driver.findElement(By.name(sitedata.getProperty(propkey)));
		} else {
			return null;
		}

	}

}
