package DatePicker;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsingFunctionInDatePicker {
	
	static void monthAndYear(WebDriver driver,String year,String month)
	{
		while(true)
		{
		String cyear=driver.findElement(By.xpath("//*[@class='ui-datepicker-year']")).getText();
		String cmonth=driver.findElement(By.xpath("//*[@class='ui-datepicker-month']")).getText();
		if(cyear.equals(year)&&cmonth.equals(month))
		{
			break;
		}
		driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click();
		}
	}
	
	static void dates(WebDriver driver,String date)
	{
        List<WebElement> ls=driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//tbody//tr//td//a"));
		
		for(WebElement a:ls)
		{
			if(a.getText().equals(date))
			{
				a.click();
			break;
			}
		}
	}
	public static void main(String args[])
	{
		WebDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://jqueryui.com/datepicker/");
		driver.manage().window().maximize();
		
		driver.switchTo().frame(0);
		
		String year="2027";
		String month="April";
		String date="10";
		
		driver.findElement(By.xpath("//input[@id='datepicker']")).click();
		
		monthAndYear(driver,year,month);
		
		dates(driver,date);
		
	}
}
