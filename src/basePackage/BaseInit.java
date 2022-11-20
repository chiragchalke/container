package basePackage;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.WebDriverEventListener;

public class BaseInit {

	public static Properties sitedata;
	public static WebDriver driver;
	public static Logger logs;

	public void startup() throws IOException {

		/*
		 * i wan to load browser so i have to first load properties file for get browser
		 * key value
		 */
		sitedata = new Properties();
		FileInputStream fi = new FileInputStream(".src\\propertiesData\\ SiteData.properties");
		sitedata.load(fi);

		String browserVal = sitedata.getProperty("browser");
		if (browserVal.equalsIgnoreCase("Chrome")) {
			System.setProperty("WebDriver.chrome.driver", "C:\\Users\\chirag.chalke\\Downloads\\chromedriver_win32");
			driver = new ChromeDriver();
			System.out.println("Browser open");
		} else if (browserVal.equalsIgnoreCase("firefox"));
		{
			System.setProperty("webdriver.firefox.driver", "C:\\Users\\chirag.chalke\\Downloads\\chromedriver_win32");
			System.out.println("FireFox open");
		}

	}
}
