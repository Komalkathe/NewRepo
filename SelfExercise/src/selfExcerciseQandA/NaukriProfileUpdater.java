package selfExcerciseQandA;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NaukriProfileUpdater {
    public static void main(String[] args) {
        // Set the path to your ChromeDriver executable
        System.setProperty("webdriver.chrome.driver", "C:\\AutomationPractice\\Driver\\chromedriver-win64//chromedriver.exe");

        // Initialize WebDriver
        WebDriver driver = new ChromeDriver();

        try {
            // Navigate to Naukri login page
            driver.get("https://www.naukri.com/nlogin/login");
            driver.manage().window().maximize();

            // Enter username
            driver.findElement(By.id("usernameField")).sendKeys("komalkathe30@gmail.com");

            // Enter password
            driver.findElement(By.id("passwordField")).sendKeys("Komal@30");

            // Click on the login button
            driver.findElement(By.xpath("//button[text()='Login']")).click();

            // Wait for the profile page to load
            Thread.sleep(5000); // Adjust the sleep time as needed

            // Navigate to 'View Profile' page
            driver.findElement(By.xpath("//div[@class='view-profile-wrapper']//a")).click();
            Thread.sleep(5000); // Adjust the sleep time as needed

            // Click on 'Resume Headline'
            driver.findElement(By.xpath("//div[@class='widgetHead']//span[@class='edit icon']")).click();

            // Wait for the profile update page to load
            Thread.sleep(5000); // Adjust the sleep time as needed

            // Update the resume headline
            driver.findElement(By.id("resumeHeadlineTxt")).clear();
            driver.findElement(By.id("resumeHeadlineTxt")).sendKeys("Software Test Engineer with overall 3 years of"
            		+ " experience in the US Banking domain at Zentest Softwar Pvt. Ltd. Startup|"
            		+ " Skilled in Software Testing, Manual, Automation Testing, Core Java, Selenium, Eclipse,"
            		+ " Test Cases, Testing Tools, Functional, etc");

            // Save the updated headline
            driver.findElement(By.xpath("//button[text()='Save']")).click();

            // Optionally, upload a new resume
            // driver.findElement(By.id("attachCV")).sendKeys("path/to/your_resume.docx");

            // Save the profile updates
            // driver.findElement(By.xpath("//button[text()='Save']")).click();

            System.out.println("Profile updated successfully.");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // Close the browser
          //  driver.quit();
        }
    }
}

