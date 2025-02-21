package BasicLocators;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ValidationOfGetTitle {
	public static void main(String args[])
	{
	WebDriver driver=new ChromeDriver();
	driver.get("https://demo.opencart.com/");
	String title=driver.getTitle();
	
	//validation of Get Title
	if(title.equals("Your Store"))
			{
		System.out.println("Tst pass");
			}
	else
	{
		System.out.println("Tst pass");
	}
	driver.close();
	}
}
