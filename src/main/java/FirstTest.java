import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstTest {

    public static void main(String[] args) {

        // Create the WebDriver instance
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        // Navigate to website
        driver.get("https://www.saucedemo.com/");

        // Locating the username field and store into WebElement variable
        WebElement input_username = driver.findElement(By.id("user-name"));

        // Enter the username using sendKeys action.
        input_username.sendKeys("standard_user");

        // Locating the password field and store into WebElement variable
        WebElement input_password = driver.findElement(By.id("password"));

        // Enter the password using sendKeys action.
        input_password.sendKeys("secret_sauce");

        // Locating the login button and store into WebElement variable
        WebElement button_login = driver.findElement(By.id("login-button"));

        // Click the login button using click action.
        button_login.click();

        // Close the driver instance
        driver.close();
    }
}


