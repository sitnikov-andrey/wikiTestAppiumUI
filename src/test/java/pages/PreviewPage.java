package pages;

import io.appium.java_client.ios.IOSElement;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;

import io.qameta.allure.Step;
import org.openqa.selenium.support.PageFactory;

public class PreviewPage{

    public PreviewPage(){

    }

    public PreviewPage(IOSDriver<IOSElement> driver){
        this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    private IOSDriver<IOSElement> driver;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name='Next']")
    private IOSElement buttonNext;
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name='Get started']")
    private IOSElement blueButtonGetStarted;

    @Step("Skip tutorial")
    public void skipTutorial(){
        if(new BasePage(driver).existsElement(buttonNext)){
            for(int i = 0; i < 3; i++){
                buttonNext.click();
            }
            blueButtonGetStarted.click();
        }
    }
}
