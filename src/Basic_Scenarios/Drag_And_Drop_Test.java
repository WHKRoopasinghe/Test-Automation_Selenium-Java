package Basic_Scenarios;

// Import Selenium classes
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.WebElement;

public class Drag_And_Drop_Test {

    public static void main(String[] args) {

        // Set ChromeDriver location
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\hasha\\OneDrive\\Documents\\Automation\\Selenium_With_Java\\src\\drivers\\chromedriver.exe");

        // Launch Chrome browser
        WebDriver driver = new ChromeDriver();

        // Navigate to the Drag and Drop demo page
        driver.get("https://jqueryui.com/droppable");

        // Switch to the iframe that contains the draggable elements
        driver.switchTo().frame(0);

        // Wait for 4 seconds after the click action
        try {
            Thread.sleep(4000);  // Sleep for 4 seconds
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


        // Identify the source element (drag source) and target element (drop target)
        WebElement source = driver.findElement(By.id("draggable"));
        WebElement target = driver.findElement(By.id("droppable"));

        // Wait for 4 seconds after the click action
        try {
            Thread.sleep(4000);  // Sleep for 4 seconds
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


        // Perform the drag-and-drop action using the Actions class
        Actions actions = new Actions(driver);
        actions.dragAndDrop(source, target).perform();

        // Wait for 4 seconds after the click action
        try {
            Thread.sleep(4000);  // Sleep for 4 seconds
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


        // Optional: Confirm if the drag and drop was successful
        System.out.println("Drag and Drop action performed successfully!");

        // Close the browser after the test
        driver.quit();
    }
}