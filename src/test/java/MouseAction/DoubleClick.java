package MouseAction;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClick {
    public static void main(String[] args)  {
        WebDriver driver = new ChromeDriver();
        
        // Implicit wait
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        // Open the website
        driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml5_ev_ondblclick3");
        driver.manage().window().maximize();

        // Switch to the iframe
        driver.switchTo().frame("iframeResult");

        // Locate input fields
        WebElement input1 = driver.findElement(By.id("field1"));
        WebElement input2 = driver.findElement(By.id("field2"));
        
        input1.clear();
        input1.sendKeys("RenukaDevaraju");

        // Locate the button
        WebElement button = driver.findElement(By.xpath("//button[text()='Copy Text']"));

        // Perform double-click action
        Actions act = new Actions(driver);
        act.doubleClick(button).perform();

        // Verify if text is copied
        String copiedText = input2.getAttribute("value");
        if (copiedText.equals("RenukaDevaraju")) {
            System.out.println("Double click action successful: Text copied!");
        } else {
            System.out.println("Double click action failed.");
        }

    }
}
