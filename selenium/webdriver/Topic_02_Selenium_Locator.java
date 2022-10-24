package webdriver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Topic_02_Selenium_Locator {
	WebDriver driver;
	String projectPath = System.getProperty("user.dir");
	String osName = System.getProperty("os.name");
	
	@BeforeClass
	public void beforeClass() {
		if  (osName.contains("Mac OS")) {
			System.setProperty("webdriver.gecko.driver", projectPath + "/browserDrivers/geckodriver");
		} else {
			System.setProperty("webdriver.gecko.driver", projectPath + "\\browserDrivers\\geckodriver.exe");
		}
		
		driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		// Mở trang Register ra
		driver.get("https://demo.nopcommerce.com/register");
	}
		// HTMl for FirstName textbox
		// <input type="text" data-val="true" data-val-required="First name is required." id="FirstName" name="FirstName">
		// Tên thẻ của element: TagName 
		// Tên thuộc tinh: Attribute Name (type, data-val, data-val-required, id, name)
		// Giá trị của thuộc tính: Attribute value
	@Test
	public void TC_01_ID() {
		driver.findElement(By.id("FirstName")).sendKeys("Automation");;
	}

	@Test
	public void TC_02_Class() {
		
	}

	@Test
	public void TC_03_Name() {
		
	}
	@Test
	public void TC_04_TagName() {
		
	}

	@Test
	public void TC_05_LinkText() {
		
	}
	
	@Test
	public void TC_06_PartialLinkText() {
		
	}
	
	@Test
	public void TC_07_CSS() {
		
	}
	
	@Test
	public void TC_08_Xpath() {
		
	}

	@AfterClass
	public void afterClass() {
		//driver.quit();
	}
}
