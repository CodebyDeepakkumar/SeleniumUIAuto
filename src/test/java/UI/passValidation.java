package UI;

import org.openqa.selenium.By;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
@Test(groups="UI Test")

public class passValidation {
    public static String browser = "chrome"; // External Config - XLS, CSV
    public WebDriver driver;

    @BeforeMethod(description = "Setting up the browser")
    public void setUp() {
        if (browser.equals("chrome")) {
            driver = new ChromeDriver();
        } else if (browser.equals("edge")) {
            driver = new EdgeDriver();
        } else if (browser.equals("firefox")) {
            driver = new FirefoxDriver();
        }
        driver.manage().window().maximize();
        driver.get("https://www.saucedemo.com/v1/");
    }

    
    @Test(priority = 1, description = "Performing the login operation")
    public void performLogin() {
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        driver.findElement(By.cssSelector("#login-button")).click();
    }
    @Test(priority = 2, description = "Validating username input field exists")
    public void validateUsernameInputExists() {
        assert driver.findElement(By.id("user-name")) != null : "Username input field is missing";
    }
    @Test(priority = 3, description = "Validating password input field exists")
    public void validatePasswordInputExists() {
        assert driver.findElement(By.id("password")) != null : "Password input field is missing";
    }
        @AfterMethod(description = "Exit the browser")
        public void closeDown() {
            driver.close();
        }
}