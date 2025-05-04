package Basic_Scenarios;

// Import Selenium classes
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Login_Test {

    public static void main(String[] args) {

        // Set the path to the ChromeDriver executable
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\hasha\\OneDrive\\Documents\\Automation\\Selenium_With_Java\\src\\drivers\\chromedriver.exe");

        // Launch a new Chrome browser window
        WebDriver driver = new ChromeDriver();

        // Navigate to the login page of the test website
        driver.get("https://the-internet.herokuapp.com/login");

        // Find the username input field using its HTML 'id' and enter a valid username
        WebElement username = driver.findElement(By.id("username"));
        username.sendKeys("tomsmith");

        // Find the password input field using its 'id' and enter a valid password
        WebElement password = driver.findElement(By.id("password"));
        password.sendKeys("SuperSecretPassword!");

        // Find the login button using a CSS selector and click it to submit the form
        WebElement loginButton = driver.findElement(By.cssSelector("button[type='submit']"));
        loginButton.click();

        // Optional: print the page title or confirmation message to verify success
        System.out.println("Page title after login: " + driver.getTitle());

        // Close the browser window after test is complete
        driver.quit();
    }
    
}
