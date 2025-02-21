package Navigation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Nav_to {
	public static void main(String args[])
	{
		WebDriver driver=new ChromeDriver();
		
		//navigate().to()
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.navigate().to("https://demo.opencart.com/");
		
		//navigate.back() -- navigate in backward direction.
		driver.navigate().back();
		System.out.println(driver.getCurrentUrl());
		
		//navigate.forward() -- navigate in forward direction.
		driver.navigate().forward();
		System.out.println(driver.getCurrentUrl());
		
		//for page refresh
		driver.navigate().refresh();
	}

}
