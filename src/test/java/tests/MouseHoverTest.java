package tests;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import testconfiguration.Pages;

import static org.assertj.core.api.Assertions.assertThat;

public class MouseHoverTest extends Pages {

    @Test
    @DisplayName("Hover men sub-category and open")
    public void menSubCategoryClick() {
        topMenuPage.moveMouseToClothesCategory()
                .moveMouseToMenSubCategory()
                .openMenSubCategory();
        assertThat(categoryPage.getCategoryName()).isEqualTo(System.getProperty("menSubCategoryText"));
    }

    @Test
    @DisplayName("Hover stationery sub-category and open")
    public void stationerySubCategoryClick() {
        topMenuPage.moveMouseToAccessoriesCategory()
                .moveMouseToStationerySubCategory()
                .openStationerySubCategory();
        assertThat(categoryPage.getCategoryName()).isEqualTo(System.getProperty("stationerySubCategoryText"));
    }

    @Test
    @DisplayName("Hover art category and open")
    public void artCategoryClick() {
        topMenuPage.moveMouseToArtCategory()
                .openArtCategory();
        assertThat(categoryPage.getCategoryName()).isEqualTo(System.getProperty("artCategoryText"));
    }
}
