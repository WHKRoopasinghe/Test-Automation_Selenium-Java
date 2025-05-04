package Basic_Scenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;
import java.time.Duration;
//import java.util.List;

public class DropDown_And_Searchmenu_Test {


    public static void main(String[] args) {
        // Set the path to your ChromeDriver executable
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\hasha\\OneDrive\\Documents\\Automation\\Selenium_With_Java\\src\\drivers\\chromedriver.exe");

        // Initialize WebDriver
        WebDriver driver = new ChromeDriver();

        try {
            // Navigate to the test page
            driver.get("https://demoqa.com/select-menu");
            driver.manage().window().maximize();

            // Initialize WebDriverWait
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

            // Wait for the dropdown to be clickable
            WebElement oldStyleDropdown = wait.until(
                ExpectedConditions.elementToBeClickable(By.id("oldSelectMenu"))
            );

            // Wait for 2 seconds after the click action
        try {
            Thread.sleep(2000);  // Sleep for 2 seconds
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

            // Interact with the dropdown
            oldStyleDropdown.click();
            // Additional interactions...


            // Wait for 2 seconds after the click action
        try {
            Thread.sleep(2000);  // Sleep for 2 seconds
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // Close the browser after a short delay
            try {
                Thread.sleep(3000); // Wait for 3 seconds to observe the selected options
            } catch (InterruptedException ie) {
                ie.printStackTrace();
            }
            driver.quit();
        }
    }
}