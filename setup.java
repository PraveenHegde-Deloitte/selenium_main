package pages;
import freemarker.log.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import java.io.IOException;


public class setup {
    public static WebDriver dr;
    protected static Logger log = Logger.getLogger("loginTest");
    @BeforeTest
    public static WebDriver initial_set() throws IOException, InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\prhegde\\Downloads\\chromedriver.exe");
        dr = new ChromeDriver();
        dr.get("https://www.globalsqa.com/angularJs-protractor/BankingProject/#/login");
        dr.manage().window().maximize();
        return dr;
    }
    @AfterTest
    public void CloseBrowser()
    {
        dr.quit();
    }
}
