package testconfiguration;

import org.junit.jupiter.api.BeforeEach;
import pages.BasePage;
import pages.CategoryPage;
import pages.TopMenuPage;

public class Pages extends TestBase {
    public BasePage basePage;
    public TopMenuPage topMenuPage;
    public CategoryPage categoryPage;

    @BeforeEach
    public void setupPages() {
        basePage = new BasePage(driver);
        topMenuPage = new TopMenuPage(driver);
        categoryPage = new CategoryPage(driver);
    }
}
