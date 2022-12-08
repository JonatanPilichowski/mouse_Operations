package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CategoryPage extends BasePage {
    @FindBy(css = "#js-product-list-header h1")
    WebElement categoryName;

    public CategoryPage(WebDriver driver) {
        super(driver);
    }

    public String getCategoryName() {
        return categoryName.getText();
    }

}
