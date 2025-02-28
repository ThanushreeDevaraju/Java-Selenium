package MouseAction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {
	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		driver.manage().window().maximize();
		
		WebElement src1=driver.findElement(By.xpath("//div[@id='box1']"));
		
		WebElement des1=driver.findElement(By.xpath("//div[@id='box106']"));
		Actions act=new Actions(driver);
		act.dragAndDrop(src1, des1).perform();
		
	}
}
