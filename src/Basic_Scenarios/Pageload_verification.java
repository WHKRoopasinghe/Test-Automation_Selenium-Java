package Basic_Scenarios;

// Import Selenium classes
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Pageload_verification {


    public static void main (String[] args) {


 // Set system property to point to your local ChromeDriver executable
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\hasha\\OneDrive\\Documents\\Automation\\Selenium_With_Java\\src\\drivers\\chromedriver.exe");

        // Create a new instance of the Chrome browser
        WebDriver driver = new ChromeDriver();

        // Open the test website
        driver.get("https://www.reddit.com/r/QualityAssurance/");

        // Get the current page title
        String title = driver.getTitle();

        // Check if the title contains the expected keyword and print result
        if (title.contains("Example Domain")) {
            System.out.println("Page loaded successfully with correct title.");
        } else {
            System.out.println("Page did not load correctly.");
        }

        // Close the browser
        driver.quit();

    }
    
}

    

