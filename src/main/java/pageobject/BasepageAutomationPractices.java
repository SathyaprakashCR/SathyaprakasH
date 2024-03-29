package pageobject;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class BasepageAutomationPractices {
		
	public static WebDriver driver;
	public String browser = "chrome";

	public BasepageAutomationPractices() {
		if (driver == null) {
			if (browser.equals("chrome")) {
				System.setProperty("webdriver.chrome.driver",
						"F:\\Old Documents\\softwares\\selenium\\chromedriver_win32\\chromedriver.exe");
				driver = new ChromeDriver();
			} 
				  else if (browser.equals("firefox")) {
				  System.setProperty("webdriver.gecko.driver", "Firefox Driver Server Path");
				  driver = new FirefoxDriver(); }
				
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
			driver.get("http://automationpractice.com/index.php");
		}
	}
		public boolean elementFound(WebElement element) {
			boolean res = false;
			try {
				res = element.isDisplayed();
			}catch (Exception e) {
				e.printStackTrace();
			}
			return res;
		}
		
		public void setText(WebElement element,String name) {
			if (name != null) {
				element.click();
				element.clear();
				element.sendKeys(name);
			}
		}
		
		public String getTxtAttribute(WebElement element) {
			return element.getAttribute("value");
		}
		
		public String getText(WebElement element) {
			return element.getText();
			}
	
		public String getTitle() {
			return driver.getTitle();
		}
		
		public void mousehovering (WebElement element) {
			Actions ac = new Actions(driver);
			ac.moveToElement(element).build().perform();
		}
		
		
	
		
		

	}


	

