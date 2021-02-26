package utils;

import io.appium.java_client.ios.IOSDriver;
import pages.MainPage;
import pages.PreviewPage;
import steps.DriverDealer;

public class PageFactory {
    protected IOSDriver driver = DriverDealer.getInstance().getDriver();

    protected PreviewPage previewPage = new PreviewPage(driver);
    protected MainPage mainPage = new MainPage(driver);
}
