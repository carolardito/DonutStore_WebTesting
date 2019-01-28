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
		
		//Show all the products that already exists in the DB
		String baseUrl = "http://localhost/DonutStore_WebTesting/Part%201/admin/show-products.php";
		driver.get(baseUrl);
		Thread.sleep(5000);
		
		// 2. Enter the website you want to go to
		baseUrl = "http://localhost/DonutStore_WebTesting/Part%201/admin/add-product.php";//"https://www.facebook.com/login/";
		
		// 3. Open Chrome and go to the base url;
		driver.get(baseUrl);
		
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
		
		Thread.sleep(10000);
		
		// 6. Press the add product button
		// ---------------------
		// 6a. Find the login button
		WebElement addProductBtn = driver.findElement(By.id("addProductBtn"));
		// 6b. Click the button
		addProductBtn.click();
		
		//Show all the products updated in the DB
		baseUrl = "http://localhost/DonutStore_WebTesting/Part%201/admin/show-products.php";
		driver.get(baseUrl);
		Thread.sleep(5000);
		
		//Show all the products that already exists in the DB - public side
		baseUrl = "http://localhost/DonutStore_WebTesting/Part%201/public/menu.php";
		driver.get(baseUrl);
		// scroll down
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1000)");
		
		// 7. Close the browser
		Thread.sleep(5000);  //pause for 1 second before closing the browser
		driver.close();
	}

}
