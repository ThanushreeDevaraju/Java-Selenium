package DropDown;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AutoSuggested 
{
public static void main(String args[]) 
{
	WebDriver driver=new ChromeDriver();
	
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("https://www.bjs.com/");
	driver.manage().window().maximize();
	
	driver.findElement(By.xpath("//input[@type='search']")).sendKeys("apple");
	
    List<WebElement> suggestions = driver.findElements(By.xpath("//div[@class='list list-group']//a[contains(@auto-data, 'searchRedirectedPage')]"));
//    for (WebElement suggestion : suggestions) {
//        System.out.println(suggestion.getText());
//    }
//    System.out.println(suggestions.size());
    
    for (WebElement suggestion : suggestions) {
        if(suggestion.getText().equals("apples"));
        suggestion.click();
        break;
    }
}
}
