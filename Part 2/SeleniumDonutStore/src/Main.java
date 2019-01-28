import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		// 1. Configure Selenium to talk to Chrome
		System.setProperty("webdriver.chrome.driver","/Users/carolini/Desktop/chromedriver");
		WebDriver driver = new ChromeDriver();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		/*
		 * PUBLIC
		 */
		//Starting from home page
		String baseUrl = "http://localhost/DonutStore_WebTesting/Part%201/public/index.php";
		driver.get(baseUrl);
		Thread.sleep(2500);
		
		//showing public menu before test
		//baseUrl = "http://localhost/DonutStore_WebTesting/Part%201/public/menu.php";
		//driver.get(baseUrl);
		WebElement menu_btn = driver.findElement(By.id("menu_btn"));
		menu_btn.click();
		Thread.sleep(2500);
		
		
		/*
		 * ADMIN
		 */
		//entered admin menu
		baseUrl = "http://localhost/DonutStore_WebTesting/Part%201/admin/";
		driver.get(baseUrl);
		Thread.sleep(2500);
		WebElement admPages_btn = driver.findElement(By.id("admPages_btn"));
		admPages_btn.click();
		Thread.sleep(2500);
		
		//showing admin products before test
		//baseUrl = "http://localhost/DonutStore_WebTesting/Part%201/admin/show-products.php";
		//driver.get(baseUrl);
		WebElement addProduct_btn = driver.findElement(By.id("addProduct_btn"));
		addProduct_btn.click();
		//Thread.sleep(5000);
		//js.executeScript("window.scrollBy(0,1000)");
		Thread.sleep(2500);
		
		// 2. Enter the website you want to go to
		//baseUrl = "http://localhost/DonutStore_WebTesting/Part%201/admin/add-product.php";

		// 3. Open Chrome and go to the base url;
		//driver.get(baseUrl);
		
		// 4. Enter a product
		// ---------------------
		// 4a. Find the box name and set product name
		WebElement productName = driver.findElement(By.id("productName"));
		productName.sendKeys("Chocolate Donut");
		// 4b. Find box desc and set desc
		WebElement productDesc = driver.findElement(By.id("productDesc"));
		productDesc.sendKeys("Delicious plain donut covered by chocolate ganache");
		// 4c. Find box price and set nbo
		WebElement productPrice = driver.findElement(By.id("productPrice"));
		productPrice.sendKeys("5.99");
		
		Thread.sleep(5000);
		
		// 6. Press the add product button
		// ---------------------
		// 6a. Find the login button
		WebElement addProductBtn = driver.findElement(By.id("addProductBtn"));
		// 6b. Click the button
		addProductBtn.click();
		Thread.sleep(2500);
		
		//Show all the products updated in the DB
		//baseUrl = "http://localhost/DonutStore_WebTesting/Part%201/admin/show-products.php";
		//driver.get(baseUrl);
		WebElement goBack_btn = driver.findElement(By.id("goBack_btn"));
		goBack_btn.click();
		Thread.sleep(2500);
		
		/*
		 * public
		 */
		
		//Starting from home page
		baseUrl = "http://localhost/DonutStore_WebTesting/Part%201/public/index.php";
		driver.get(baseUrl);
		Thread.sleep(2500);
		
		//Show all the products that already exists in the DB - public side
		//baseUrl = "http://localhost/DonutStore_WebTesting/Part%201/public/menu.php";
		//driver.get(baseUrl);
		WebElement menu_btn2 = driver.findElement(By.id("menu_btn"));
		menu_btn2.click();
		Thread.sleep(2500);
		js.executeScript("window.scrollBy(0,1000)");
		
		// 7. Close the browser
		Thread.sleep(6000);  //pause for 1 second before closing the browser
		driver.close();
	}

}
