package practisetests;

//import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.UnreachableBrowserException;
import org.testng.annotations.AfterTest;
import utlities.*;

public class BaseTest {

	WebDriver driver;

	@BeforeTest
	public void beforeTest() {
		try {
			startTest();
		} catch (UnreachableBrowserException e) {
			// TODO Auto-generated catch block
			startTest();
		}
	}

	public void startTest() {
		driver = BrowserSetup.setupBrowser();

	}

	@Test
	public void test() {
		//driver = BrowserSetup.setupBrowser();
		driver.get("https://www.facebook.com");
		driver.findElement(By.id("email")).sendKeys("riyazulla.shaik@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("Khurshid");
		driver.findElement(By.id("u_0_y")).submit();

	}

	@AfterTest
	public void afterTest() {
		driver.close();
		driver.quit();
	}

}
