package Basic_Scenarios;

// Import Selenium classes
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Page_Navigation_Test {


    public static void main(String[] args) {

        // Set ChromeDriver location
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\hasha\\OneDrive\\Documents\\Automation\\Selenium_With_Java\\src\\drivers\\chromedriver.exe");

        // Launch Chrome browser
        WebDriver driver = new ChromeDriver();

        // Open the HerokuApp demo website
        driver.get("https://the-internet.herokuapp.com");

        // Wait for 4 seconds before performing the next action
        try {
            Thread.sleep(4000);  // Sleep for 4 seconds
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Click on a link to navigate to a new page (Checkboxes in this case)
        driver.findElement(By.linkText("Checkboxes")).click();

         // Wait for 4 seconds after the click action
         try {
            Thread.sleep(4000);  // Sleep for 4 seconds
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

         // Print the current URL to confirm navigation
         System.out.println("Navigated to: " + driver.getCurrentUrl());

         // Click the browser's "Back" button to go back to the previous page
         driver.navigate().back();  // Navigate back to the previous page

         // Wait for 4 seconds after the click action
         try {
            Thread.sleep(4000);  // Sleep for 4 seconds
        } catch (InterruptedException e) {
            e.printStackTrace();
        }



        // Close the browser after the test
        driver.quit();
    }

}

    

