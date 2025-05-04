package Basic_Scenarios;

// Import Selenium classes
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButton_Selection_Test {


    public static void main(String[] args) {

        // Set system property for ChromeDriver location
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\hasha\\OneDrive\\Documents\\Automation\\Selenium_With_Java\\src\\drivers\\chromedriver.exe");

        // Launch Chrome browser
        WebDriver driver = new ChromeDriver();

        // Open the ToolsQA radio button demo page
        driver.get("https://demoqa.com/radio-button");

        // Wait for 4 seconds after the click action
        try {
            Thread.sleep(4000);  // Sleep for 4 seconds
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


        // Maximize the browser window
        driver.manage().window().maximize();

        // Wait for 4 seconds after the click action
        try {
            Thread.sleep(4000);  // Sleep for 4 seconds
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


        // Locate the "Yes" radio button using its label
        WebElement yesRadio = driver.findElement(By.xpath("//label[@for='yesRadio']"));

        // Wait for 4 seconds after the click action
        try {
            Thread.sleep(4000);  // Sleep for 4 seconds
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


        // Click the "Yes" radio button
        yesRadio.click();

        // Wait for 2 seconds after the click action
        try {
            Thread.sleep(2000);  // Sleep for 2 seconds
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Wait 2 seconds to see the result (optional)
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Locate and print the confirmation text shown after selecting
        WebElement resultText = driver.findElement(By.className("text-success"));
        System.out.println("Radio button selected: " + resultText.getText());

        // Close the browser
        driver.quit();
    }
}

