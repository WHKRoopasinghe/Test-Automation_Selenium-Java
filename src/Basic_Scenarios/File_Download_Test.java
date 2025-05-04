package Basic_Scenarios;

// Import Selenium classes
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class File_Download_Test {

    public static void main(String[] args) {

        // Set ChromeDriver path
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\hasha\\OneDrive\\Documents\\Automation\\Selenium_With_Java\\src\\drivers\\chromedriver.exe");

        // Launch Chrome browser
        WebDriver driver = new ChromeDriver();

        // Navigate to the file download page
        driver.get("https://the-internet.herokuapp.com/download");

        // Wait for 4 seconds after the click action
        try {
            Thread.sleep(4000);  // Sleep for 4 seconds
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Click the file to trigger download (example file: "some-file.txt")
        driver.findElement(By.linkText("some-file.txt")).click();

        // Wait for 4 seconds after the click action
        try {
            Thread.sleep(4000);  // Sleep for 4 seconds
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Wait for download (can add explicit wait here if needed) or check the folder manually
        System.out.println("File download triggered!");

        // Close the browser
        driver.quit();
    }
}


    

