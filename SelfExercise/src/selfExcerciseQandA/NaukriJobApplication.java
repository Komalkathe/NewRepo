/*
 * package selfExcerciseQandA;
 
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;
import java.util.List;

public class NaukriJobApplication {
    public static void main(String[] args) {
        // Set the path to your ChromeDriver executable
        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");

        // Initialize WebDriver
        WebDriver driver = new ChromeDriver();

        try {
            // Navigate to Naukri login page
            driver.get("https://www.naukri.com/nlogin/login");

            // Enter username
            driver.findElement(By.id("usernameField")).sendKeys("your_email@example.com");

            // Enter password
            driver.findElement(By.id("passwordField")).sendKeys("your_password");

            // Click on the login button
            driver.findElement(By.xpath("//button[text()='Login']")).click();

            // Wait for the home page to load
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("qsb-keyskill-sugg")));

            // Navigate to the job search page
            driver.get("https://www.naukri.com/");

            // Enter job role
            driver.findElement(By.id("qsb-keyskill-sugg")).sendKeys("Manual Tester, QA Test Engineer, Automation Test Engineer");

            // Enter location
            driver.findElement(By.id("qsb-location-sugg")).sendKeys("Pune");

            // Click on the search button
            driver.findElement(By.xpath("//button[text()='Search']")).click();

            // Wait for the search results to load
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Experience']")));

            // Apply Experience filter (above 2 years)
            driver.findElement(By.xpath("//span[text()='Experience']")).click();
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//label[contains(text(),'2-5 Years')]")));
            driver.findElement(By.xpath("//label[contains(text(),'2-5 Years')]")).click();

            // Apply Work Mode filter (select all options)
            driver.findElement(By.xpath("//span[text()='Work Mode']")).click();
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//label[contains(text(),'Work From Home')]")));
            driver.findElement(By.xpath("//label[contains(text(),'Work From Home')]")).click();
            driver.findElement(By.xpath("//label[contains(text(),'Hybrid')]")).click();
            driver.findElement(By.xpath("//label[contains(text(),'On-Site')]")).click();

            // Apply Department filter
            driver.findElement(By.xpath("//span[text()='Department']")).click();
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//label[contains(text(),'Engineering - Software & QA')]")));
            driver.findElement(By.xpath("//label[contains(text(),'Engineering - Software & QA')]")).click();
            driver.findElement(By.xpath("//label[contains(text(),'Quality Assurance')]")).click();
            driver.findElement(By.xpath("//label[contains(text(),'BFSI, Investments & Trading')]")).click();

            // Apply Education filter
        
::contentReference[oaicite:0]{index=0}
}
        catch(Exception e) {e.printStackTrace();}}}
*/
 
