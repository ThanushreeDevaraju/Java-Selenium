package WebTables;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CountPrice {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		int row=driver.findElements(By.xpath("//table[@name='BookTable']//tr")).size();
		//int column=driver.findElements(By.xpath("//table[@name='BookTable']//th")).size();
		
		int total=0;
		for(int i=2;i<=row;i++)
		{
				String value=driver.findElement(By.xpath("//table[@name='BookTable']//tr["+i+"]//td[4]")).getText();
				total=total+Integer.parseInt(value);
		}
		System.out.println(total);
	}
}
