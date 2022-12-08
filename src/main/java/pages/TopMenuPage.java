package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TopMenuPage extends BasePage {
    @FindBy(css = "#category-3")
    private WebElement clothesCategory;
    @FindBy(css = "#category-6")
    private WebElement accessoriesCategory;
    @FindBy(css = "#category-9")
    private WebElement artCategory;
    @FindBy(css = "#category-4 a")
    private WebElement menSubCategory;
    @FindBy(css = "#category-7 a")
    private WebElement stationerySubCategory;

    public TopMenuPage(WebDriver driver) {
        super(driver);
    }

    public TopMenuPage moveMouseToClothesCategory() {
        mouseHover(clothesCategory);
        return this;
    }

    public TopMenuPage moveMouseToAccessoriesCategory() {
        mouseHover(accessoriesCategory);
        return this;
    }

    public TopMenuPage moveMouseToStationerySubCategory() {
        mouseHover(stationerySubCategory);
        return this;
    }

    public TopMenuPage openStationerySubCategory() {
        clickOn(stationerySubCategory);
        return this;
    }


    public TopMenuPage moveMouseToArtCategory() {
        mouseHover(artCategory);
        return this;
    }

    public TopMenuPage openArtCategory() {
        clickOn(artCategory);
        return this;
    }

    public TopMenuPage moveMouseToMenSubCategory() {
        mouseHover(menSubCategory);
        return this;
    }

    public TopMenuPage openMenSubCategory() {
        clickOn(menSubCategory);
        return this;
    }
}
