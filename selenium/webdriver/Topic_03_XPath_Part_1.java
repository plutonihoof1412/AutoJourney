package webdriver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Topic_03_XPath_Part_1 {
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
	
	}

	@Test
	public void TC_01_() {
//		driver.get("http://live.techpanda.org/index.php/customer/account/login/");
//		// Click vao link My Account o duoi Footer
//		driver.findElement(By.xpath("//div[@class='footer']//a[@title='My Account']")).click();
		driver.get("https://automationfc.github.io/basic-form/");
		System.out.println("Text cua the H5: " + driver.findElement(By.xpath("//h5[@id='nested']")).getText()); // lay infor cua the con
		
	}
	
	
	
	

	@AfterClass
	public void afterClass() {
		driver.quit();
	}
}
