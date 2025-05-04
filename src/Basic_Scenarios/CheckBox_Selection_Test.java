package Basic_Scenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBox_Selection_Test {
    
    public static void main(String[] args) {

        // Set path to ChromeDriver executable
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\hasha\\OneDrive\\Documents\\Automation\\Selenium_With_Java\\src\\drivers\\chromedriver.exe");

        // Launch the Chrome browser
        WebDriver driver = new ChromeDriver();


        // Navigate to the checkboxes test page
        driver.get("https://the-internet.herokuapp.com/checkboxes");

        // Wait for 4 seconds after the click action
        try {
            Thread.sleep(4000);  // Sleep for 4 seconds
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


        // Locate the first checkbox (index 1) on the page
        WebElement checkbox1 = driver.findElement(By.xpath("//form[@id='checkboxes']/input[1]"));


        // Locate the second checkbox (index 2)
        WebElement checkbox2 = driver.findElement(By.xpath("//form[@id='checkboxes']/input[2]"));

        // Wait for 4 seconds after the click action
        try {
            Thread.sleep(4000);  // Sleep for 4 seconds
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


        // If checkbox1 is not selected, click to select it
        if (!checkbox1.isSelected()) {
            checkbox1.click();
        }

        // If checkbox2 is selected, click to unselect it
        if (checkbox2.isSelected()) {
            checkbox2.click();
        }

         // Wait for 4 seconds after the click action
         try {
            Thread.sleep(4000);  // Sleep for 4 seconds
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        
        // Print confirmation message
        System.out.println("Checkboxes updated!");

        // Close the browser
        driver.quit();
    }
}


