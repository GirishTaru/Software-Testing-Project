package Launch_;





import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class launch1 {
    public static void main(String[] args) {
        // Set the path to the ChromeDriver executable
        System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\Admin\\\\Desktop\\\\selenium3\\\\chromedriver-win64\\\\chromedriver-win64\\\\chromedriver.exe");

        // Instantiate a ChromeDriver class
        WebDriver driver = new ChromeDriver();

        // Launch Google
        driver.get("https://www.google.com/");

        // Close the browser
        driver.quit();
    }
}









