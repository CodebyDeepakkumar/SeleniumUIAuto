package UI;

import org.openqa.selenium.By;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
@Test(groups = "regression")

public class TestZNGImp {
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

 
    @Test(priority = 2, description = "Validating username input field exists")
    public void validateUsernameInputExists() {
        assert driver.findElement(By.id("user-name")) != null : "Username input field is missing";
    }

    @Test(priority = 3, description = "Validating password input field exists")
    public void validatePasswordInputExists() {
        assert driver.findElement(By.id("password")) != null : "Password input field is missing";
    }

    @Test(priority = 4, description = "Validating login button exists")
    public void validateLoginButtonExists() {
        assert driver.findElement(By.id("login-button")) != null : "Login button is missing";
    }

    @Test(priority = 5, description = "Validating placeholders are correct")
    public void validatePlaceholders() {
        String usernamePlaceholder = driver.findElement(By.id("user-name")).getAttribute("placeholder");
        assert "Username".equals(usernamePlaceholder) : "Username placeholder is incorrect";
        String passwordPlaceholder = driver.findElement(By.id("password")).getAttribute("placeholder");
        assert "Password".equals(passwordPlaceholder) : "Password placeholder is incorrect";
    }

    @Test(priority = 6, description = "Validating login button value")
    public void validateLoginButtonValue() {
        String loginButtonValue = driver.findElement(By.id("login-button")).getAttribute("value");
        assert "LOGIN".equals(loginButtonValue) : "Login button value is incorrect";
    }


    @AfterMethod(description = "Exit the browser")
    public void closeDown() {
        driver.close();
    }
}
