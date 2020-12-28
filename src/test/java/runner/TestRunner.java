package runner;

import utilities.PropertiesReader;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features",
        glue = "stepdefinitions",
        tags = "@test",
        plugin = {
                "pretty",
                "html:target/cucumber-reports/cucumber-pretty",
                "json:target/cucumber-reports/CucumberTestReport.json",
                "junit:target/cucumber-reports/CucumberTestReport.xml"
        }
)
public class TestRunner {

        public static WebDriver driver;
        @BeforeClass
        public static void setUp() throws Exception {

                WebDriverManager.chromedriver().setup();
                driver = new ChromeDriver();
                PropertiesReader propertiesReader = new PropertiesReader();
                driver.manage().timeouts().implicitlyWait(propertiesReader.getTimeout(), TimeUnit.SECONDS);
                driver.manage().timeouts().setScriptTimeout(propertiesReader.getTimeout(), TimeUnit.SECONDS);
                driver.manage().window().maximize();
        }

        @AfterClass
        public static void tearDown() throws InterruptedException {
                driver.quit();

        }

}