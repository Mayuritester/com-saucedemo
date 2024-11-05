import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class FireFox {

    public static void main(String[] args) {
//  1. Set up Chrome browser.
        String baseURL = "https://www.saucedemo.com/";
        // Launch Chrome Browser
        WebDriver driver = new FirefoxDriver();
        //open URL in Browser
        driver.get(baseURL);

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

//  3. Print the title of the page.
        System.out.println(driver.getTitle());
//  4. Print the current URL.
        System.out.println(driver.getCurrentUrl());
//  5. Print the page source.
        System.out.println(driver.getPageSource());
//  6. Enter the email in the email field.
        WebElement emailInput = driver.findElement(By.id("user-name"));
        emailInput.sendKeys("tester@gmail.com");
//7. Enter the password in the password field.
        WebElement passwordInput = driver.findElement(By.id("password"));
        passwordInput.sendKeys("tester12345");
//8. Click on the Login Button
        WebElement loginLink = driver.findElement(By.id("login-button"));
        loginLink.click();
//9. Print the current URL.
        System.out.println(driver.getCurrentUrl());
// 10. Navigate to baseUrl
        driver.navigate().back();
//11. Refresh the page.
        driver.navigate().refresh();
//12. Close the browser.
        driver.close();
    }
}
