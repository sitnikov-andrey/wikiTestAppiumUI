package tests;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import utils.PageFactory;

public class TestsStarter extends PageFactory {

    @AfterEach
    public void endTest(){
        driver.quit();
    }

    @Test
    @DisplayName("Open Main page and checking that the 'Label Wikipedia' exists")
    public void openMainPageAndCheckLabelWikiExist() {
        previewPage.skipTutorial();
        mainPage.chekLabelWikipediaExist();
    }
}
