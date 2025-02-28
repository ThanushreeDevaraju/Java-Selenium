package DatePicker;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AssignmentDemo {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://dummy-tickets.com/buyticket");
		driver.manage().window().maximize();
		
		 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		
		driver.findElement(By.xpath("//a[contains(text(),'Both')]")).click();
		
		
		WebElement departureField = driver.findElement(By.xpath("//input[contains(@class,'departure')]"));
		departureField.click();  // Click to activate the input field
		departureField.sendKeys("BenBenbecula Airport, Balivanich - BEB");

		
		 WebElement destinationField = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[contains(@class,'suggestion-input')]")));
		 destinationField.click();  
		 destinationField.sendKeys("Mala Mala, Mala Mala - AAM");
		
		
		WebElement sel=driver.findElement(By.xpath("//select[@class='ui-datepicker-month']"));
		Select list=new Select(sel);
		String month="Apr";
		list.selectByVisibleText(month);
		
		
		WebElement sel2=driver.findElement(By.xpath("//select[@class='ui-datepicker-year']"));
		Select list2=new Select(sel2);
		String year="2009";
		list2.selectByVisibleText(year);
		
		List<WebElement> result=driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//tbody//tr//td//a"));
		
		for(WebElement re:result)
		{
			if(re.getText().equals("24"))
			{
				re.click();
				break;
			}
		}
		
		driver.findElement(By.xpath("//input[@type='submit']")).click();

	}

}
