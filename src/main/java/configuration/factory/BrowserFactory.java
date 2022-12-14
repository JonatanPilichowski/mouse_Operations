package configuration.factory;

import configuration.models.Browser;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.ie.InternetExplorerOptions;

public class BrowserFactory extends Browser {

    public WebDriver getDriver() {
        String browserName = System.getProperty("browserName");
        WebDriver driver;
        switch ( browserName ) {
            case "chrome" -> {
                ChromeOptions optionsChrome = new ChromeOptions();
                WebDriverManager.chromedriver().setup();
                optionsChrome.addArguments("start-maximized");
                driver = new ChromeDriver(optionsChrome);
                driver.get(System.getProperty("appUrl"));
            }
            case "firefox" -> {
                FirefoxOptions optionsFirefox = new FirefoxOptions();
                WebDriverManager.firefoxdriver().setup();
                optionsFirefox.addArguments("start-maximized");
                driver = new FirefoxDriver(optionsFirefox);
                driver.get(System.getProperty("appUrl"));
            }
            case "edge" -> {
                EdgeOptions optionsEdge = new EdgeOptions();
                WebDriverManager.firefoxdriver().setup();
                optionsEdge.addArguments("start-maximized");
                driver = new EdgeDriver(optionsEdge);
                driver.get(System.getProperty("appUrl"));
            }
            default -> {
                InternetExplorerOptions optionsDefault = new InternetExplorerOptions();
                WebDriverManager.iedriver().setup();
                driver = new InternetExplorerDriver(optionsDefault);
                driver.get(System.getProperty("appUrl"));
            }
        }
        return driver;
    }
}

