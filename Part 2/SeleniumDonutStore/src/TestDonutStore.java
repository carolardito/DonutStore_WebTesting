import static org.junit.jupiter.api.Assertions.*;

import java.util.concurrent.TimeUnit;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

class TestDonutStore {

	protected final static String CHROME_DRIVER_PATH = "/Users/carolini/Desktop/chromedriver";
	protected static WebDriver driver;
	
		/*// Start Chrome
		System.setProperty("webdriver.chrome.driver", CHROME_DRIVER_PATH);
		driver = new ChromeDriver();
		
		// Set the "waiting period" between each command
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
		
	
		//System.setProperty("webdriver.chrome.driver", CHROME_DRIVER_PATH);
		//driver = new ChromeDriver();
		// 2. Enter the website you want to go to
				String baseUrl = "https://www.facebook.com/login/";
				System.out.println(driver);
		// 3. Open Chrome and go to the base url;
				driver.get(baseUrl);
				
				// 4. Enter a username
				// ---------------------
				// 4a. Find the box
				WebElement usernameBox = driver.findElement(By.id("email"));
				// 4b. Put the user name in there
				usernameBox.sendKeys("jenelle@gmail.com");

				// 5. Enter a password
				// ---------------------
				// 5a. Find the password box
				WebElement passwordBox = driver.findElement(By.id("pass"));
				// 5b. Put the password in there
				passwordBox.sendKeys("fakepassword123!!!!@");
				
				
				//Thread.sleep(1000);
				
				// 6. Press the login button
				// ---------------------
				// 6a. Find the login button
				WebElement loginButton = driver.findElement(By.id("loginbutton"));
				// 6b. Click the button
				loginButton.click();
	
				driver.quit();*/
	
}
