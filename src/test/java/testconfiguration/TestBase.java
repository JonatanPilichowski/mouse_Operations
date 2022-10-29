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

    @BeforeAll
    static void setupDriver() {
        AllProperties allProperties = AllProperties.getInstance();
        BrowserFactory browserFactory = new BrowserFactory();
        driver = browserFactory.getDriver();
        logger.info("Webdriver started successfully");
    }

    public WebDriver getDriver() {
        return driver;
    }

    @BeforeEach
    void setupStart() {

    }

    @AfterEach
    void tearDown() {
        driver.quit();
        logger.info("Webdriver closed");
    }
}
