package Alert;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AuthenticatedPopUp 
{
	public static void main(String args[])
	{
		//The basic authentication popUp
	WebDriver driver=new ChromeDriver();

	driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
	driver.manage().window().maximize();
	
	//To accept alert
	driver.switchTo().alert().accept();
       
	//To reject alert
	driver.switchTo().alert().dismiss();
}
}
