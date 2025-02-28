package Simple_program;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Navigation {

//	public static void main(String[] args) throws InterruptedException {
//		WebDriver driver =new ChromeDriver();
//		
//		driver.get("https://demo.opencart.com/");
//		driver.manage().window().maximize();
//		
//		
//		 driver.findElement(By.linkText("MacBook")).click();
//		// driver.findElement(By.linkText("iPhone")).click();	
//	}
	
	public static void main(String[] args) throws InterruptedException {
        // Initialize WebDriver
        WebDriver driver = new ChromeDriver();

        // Open the web site
        driver.get("https://demo.opencart.com/");
        driver.manage().window().maximize();

        // Wait for the page to load
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        // Scroll to the element before clicking (if necessary)
        WebElement macbookLink = wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("MacBook")));
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", macbookLink);
        
        Thread.sleep(1000);  
        // Ensure element is click able
        wait.until(ExpectedConditions.elementToBeClickable(macbookLink)).click();


        // Close the browser
        Thread.sleep(3000);  // Wait before closing
        driver.quit();
    }
}
