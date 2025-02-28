package MouseAction;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class RightClick {
	public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        
        // Set an implicit wait (shorter duration)
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        // Open the website
        driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
        driver.manage().window().maximize();

        // Use explicit wait for the button
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement desktop = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[@class='context-menu-one btn btn-neutral']")));

        // Perform right-click action
        Actions act = new Actions(driver);
        act.contextClick(desktop).perform();

        // Wait and click Copy from the context menu
        WebElement copyOption = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[normalize-space()='Copy']")));
        copyOption.click();

        // Handle the alert
        wait.until(ExpectedConditions.alertIsPresent()).accept();
        Thread.sleep(3000);
        // Close the browser
        driver.quit();
    }
}
