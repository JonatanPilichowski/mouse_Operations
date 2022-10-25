package testconfiguration;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import configuration.factory.propertiespart.BrowserEnvironment;
import configuration.factory.propertiespart.EnvironmentProperty;

public class TestBase {
    private static Logger logger= LoggerFactory.getLogger(TestBase.class);
    public static WebDriver driver;

    private static BrowserEnvironment browserEnvironment;
    private static EnvironmentProperty environmentProperty;
    @BeforeAll
    static void setupDriver() {
        environmentProperty=EnvironmentProperty.getInstance();
        browserEnvironment = new BrowserEnvironment();
        driver = browserEnvironment.getDriver();
        logger.info("Webdriver started successfully");
    }

    public WebDriver getDriver() {
        return driver;
    }

    @BeforeEach
    void setupStart() {
//        driver = new ChromeDriver();
//        logger.info("Open browser");
//        driver.manage().window().maximize();
//        logger.info("Window maximized");
    }

    @AfterEach
    void tearDown() {
        driver.quit();
        logger.info("Webdriver closed");
    }
}
