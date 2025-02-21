package Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserMethods {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        Thread.sleep(10000);
		driver.findElement(By.linkText("OrangeHRM, Inc")).click();
		
		Thread.sleep(2000);
		
		//the browser methods are driver.close() and driver.quit()
        //driver.close() - close single browser
		driver.close();
		
		//driver.quit()- close multiple browser
        driver.quit();
	}

}
