package testconfiguration;

import configuration.factory.BrowserFactory;
import configuration.properties.AllProperties;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TestBase {
    public static WebDriver driver;
    private static final Logger logger = LoggerFactory.getLogger(TestBase.class);
    private static AllProperties allProperties;
    private static BrowserFactory browserFactory;
    @BeforeAll
    static void setupDriver() {
        allProperties = AllProperties.getInstance();
        browserFactory = new BrowserFactory();
        logger.info("Webdriver started successfully");
    }

    public WebDriver getDriver() {
        return driver;
    }

    @BeforeEach
    void setupStart() {
        driver = browserFactory.getDriver();
    }

    @AfterEach
    void tearDown() {
        driver.quit();
        logger.info("Webdriver closed");
    }
}
