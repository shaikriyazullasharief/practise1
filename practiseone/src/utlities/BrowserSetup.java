package utlities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserSetup {
	private static String chromeDriver = System.getProperty("user.dir") + "\\common\\resources\\chrome\\chromedriver.exe";
  
	public static WebDriver setupBrowser()
	{
		System.out.println();
		System.setProperty("webdriver.chrome.driver", chromeDriver);
		WebDriver driver = new ChromeDriver();
		return driver;
	}

}
