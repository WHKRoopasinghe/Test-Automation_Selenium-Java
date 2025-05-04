package Basic_Scenarios;

// Import Selenium classes
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts_Handling_Test {

    public static void main(String[] args) {

        // Set ChromeDriver location
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\hasha\\OneDrive\\Documents\\Automation\\Selenium_With_Java\\src\\drivers\\chromedriver.exe");

        // Launch Chrome browser
        WebDriver driver = new ChromeDriver();

        // Navigate to the JavaScript alert demo page
        driver.get("https://the-internet.herokuapp.com/javascript_alerts");


        // Wait for 4 seconds after the click action
        try {
            Thread.sleep(4000);  // Sleep for 4 seconds
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


        // Click the button to trigger a JavaScript alert
        driver.findElement(By.xpath("//button[text()='Click for JS Alert']")).click();

        // Wait for 4 seconds after the click action
        try {
            Thread.sleep(4000);  // Sleep for 4 seconds
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Switch to the alert and accept it (click OK)
        Alert alert = driver.switchTo().alert();
        alert.accept();

        // Optionally, confirm alert was handled successfully
        System.out.println("Alert accepted!");

        // Close the browser
        driver.quit();
    }
}




