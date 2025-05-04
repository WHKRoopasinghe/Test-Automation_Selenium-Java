package Basic_Scenarios;

// Import Selenium classes
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class File_Upload_Test {

    
    public static void main(String[] args) {

        // Set system property for ChromeDriver location
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\hasha\\OneDrive\\Documents\\Automation\\Selenium_With_Java\\src\\drivers\\chromedriver.exe");

        // Launch a new Chrome browser instance
        WebDriver driver = new ChromeDriver();

        // Open the file upload demo page
        driver.get("https://demo.guru99.com/test/upload/");

        // Find the file input element and send the file path to it
        WebElement fileInput = driver.findElement(By.id("uploadfile_0"));
        fileInput.sendKeys("C:\\path\\to\\your\\file.txt");  // Specify the file path

        // Find and select the 'Terms' checkbox
        WebElement termsCheckbox = driver.findElement(By.id("terms"));
        termsCheckbox.click();

        // Find and click the 'Submit' button
        WebElement submitButton = driver.findElement(By.id("submitbutton"));
        submitButton.click();

        // Optional: Confirm file upload success (could depend on the site)
        System.out.println("File uploaded successfully!");

        // Close the browser after the test
        driver.quit();
    }

}

    

