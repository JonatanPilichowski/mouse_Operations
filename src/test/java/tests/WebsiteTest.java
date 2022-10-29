package tests;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import testconfiguration.TestBase;

import static org.assertj.core.api.Assertions.assertThat;

public class WebsiteTest extends TestBase {
    private static final Logger logger = LoggerFactory.getLogger(WebsiteTest.class);

    @Test
    void checkTitle() {
        String actualTitle = driver.getTitle();
        assertThat(actualTitle).isEqualTo(System.getProperty("title"));
    }

}
