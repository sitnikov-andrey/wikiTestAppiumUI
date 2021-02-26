package pages;

import io.appium.java_client.MobileElement;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import io.qameta.allure.Step;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.support.PageFactory;

public class MainPage {

    public MainPage(){

    }

    public MainPage(IOSDriver<IOSElement> driver){
        this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    private IOSDriver<IOSElement> driver;

    @iOSXCUITFindBy(accessibility = "wikipedia")
    private MobileElement labelWikipedia;
    @iOSXCUITFindBy(accessibility = "Search Wikipedia")
    private MobileElement searchInWikipedia;

    @Step("Click on field 'Search' in main page")
    public void clickOnSearchWikipedia(){
        System.out.println("Click on field 'Search Wikipedia'");
        if(!new BasePage(driver).existsElement(searchInWikipedia)){
            throw new NoSuchElementException("Element 'Search Wikipedia' not found on Main Page!");
        }
        searchInWikipedia.click();
    }

    @Step("Checking that the 'Label Wikipedia' exists")
    public void chekLabelWikipediaExist(){
        System.out.println("Checking that the 'Label Wikipedia' exists");
        if(!new BasePage(driver).existsElement(labelWikipedia)){
            throw new NoSuchElementException("Element 'Label Wikipedia' not found on Main Page!");
        }
    }
}
