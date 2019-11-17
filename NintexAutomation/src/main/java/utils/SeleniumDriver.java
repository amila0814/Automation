package utils;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SeleniumDriver {

	private static SeleniumDriver seleniumDriver;
	private static WebDriver driver;
	private static WebDriverWait waitDriver;

	public final static int TIMEOUT = 30;
	public final static int PAGE_LOAD_TIMEOUT = 50;
	public static Logger log = Logger.getLogger(SeleniumDriver.class);

	private SeleniumDriver() {

		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\src\\test\\resources\\drivers\\chromedriver\\chromedriver.exe");
		driver = new ChromeDriver();
		log.debug("Launching Chrome");
		driver.manage().window().maximize();

		waitDriver = new WebDriverWait(driver,TIMEOUT);
		driver.manage().timeouts().implicitlyWait(TIMEOUT, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);


	}

	public static void openPage(String url) {

		driver.get(url);
		log.debug("Navigate To URL");

	}

	public static WebDriver getDriver() {

		return driver;
		
	}

	public static void setUpDriver() {

		if(seleniumDriver == null) {

			seleniumDriver = new SeleniumDriver();
			log.debug("Driver Started");

		}
	}


	public static void tearDown() {

		if(driver != null) {

			driver.close();
			driver.quit();
			log.debug("Driver Closed and Quit");
		}

		seleniumDriver = null;

	}



}
