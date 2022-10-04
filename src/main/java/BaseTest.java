import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseTest {

    static WebDriver driver;

    public void setupBrowser(String browserName) {
        switch (browserName) {
            case "chrome":
                System.setProperty("webdriver.chrome.driver","src\\main\\resources\\browserDrivers\\chromedriver.exe");
                driver = new ChromeDriver();
            case "firefox":
                System.setProperty("webdriver.gecko.driver","src\\main\\resources\\browserDrivers\\geckodriver.exe");
                driver = new FirefoxDriver();

            driver.manage().window().maximize();
        }

    }
}
