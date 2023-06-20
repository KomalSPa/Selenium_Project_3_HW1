import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class herokuapp_Chrome_HW {
    /**
     * 1. Setup chrome browser
     * 2. Open URL
     * 3. Print the title of the page
     * 4. Print the current url
     * 5. Print the page source
     * 6. Enter the email to email field
     * 7. Enter the password to password field
     * 8. Close the browser
     */
    public static void main(String[] args) {
        // 1. Setup chrome browser
        String baseURL = "http://the-internet.herokuapp.com/login";
        WebDriver driver = new ChromeDriver();

        // For Enter Login detals need to Maximize the Page
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        // 2. Open URL
        driver.get(baseURL);

        // 3. Print the title of the page
        String title = driver.getTitle();
        System.out.println("Page Title is " + title);

        // 4. Print the current url
        System.out.println("Current URL : " + driver.getCurrentUrl());

        // 5. Print the page source
        System.out.println("Page source : " + driver.getPageSource());

        // 6.2 Enter the email to email field (need to find "Where to login") Step 1.
        WebElement usernameField = driver.findElement(By.name("username"));
        usernameField.sendKeys("komalspatel@prime.com");

        // 7. Enter the password to password field
        WebElement password = driver.findElement(By.id("password"));
        password.sendKeys("LalaHula@.com");

        // 8. Close the browser
        driver.close();


    }
}
