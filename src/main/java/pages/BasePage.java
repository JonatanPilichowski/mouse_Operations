package pages;

import helpers.WebListener;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.Coordinates;
import org.openqa.selenium.interactions.Locatable;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.events.internal.EventFiringMouse;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.time.Duration;

public class BasePage {
    public WebDriver driver;
    public Actions actions;
    public WebDriverWait wait;
    Logger log = LoggerFactory.getLogger(WebListener.class);
    private EventFiringMouse eventFiringMouse;
    private WebListener webListener = new WebListener();

    public BasePage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
        actions = new Actions(driver);
        wait = new WebDriverWait(driver, Duration.ofSeconds(Long.parseLong(System.getProperty("timeout"))));
    }

    protected void mouseHover(WebElement element) {
        waitForElementToBeVisible(element);
        eventFiringMouse = new EventFiringMouse(driver, webListener);
        Locatable item = (Locatable) element;
        Coordinates coordinates = item.getCoordinates();
        eventFiringMouse.mouseMove(coordinates);
        log.info(">>>>>>>>>> Mouse hover on element: " + element.getText());
    }

    protected void clickOn(WebElement element) {
        waitForElementToBeVisible(element);
        eventFiringMouse = new EventFiringMouse(driver, webListener);
        Locatable item = (Locatable) element;
        Coordinates coordinates = item.getCoordinates();
        eventFiringMouse.click(coordinates);
        log.info(">>>>>>>>>> Mouse click on element: " + element.getText());
    }

    private void waitForElementToBeVisible(WebElement element) {
        wait.until(ExpectedConditions.visibilityOf(element));
    }

}

