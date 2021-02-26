package steps;

import io.appium.java_client.ios.IOSDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class DriverDealer {
    private static final String APPIUM_URL = "http://127.0.0.1:4723/wd/hub";

    private static DriverDealer instance;

    private DriverDealer() {}

    public static DriverDealer getInstance()
    {
        if (instance == null) {
            instance = new DriverDealer();
        }
        return instance;
    }

    public IOSDriver getDriver()
    {
        URL URL = null;
        try {
            URL = new URL(APPIUM_URL);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        return new IOSDriver(URL, this.getIOSDesiredCapabilities());
    }
    //TODO сделать проперти в виде json
    private DesiredCapabilities getIOSDesiredCapabilities()
    {
        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
        desiredCapabilities.setCapability("deviceName", "iPhone 11");
        desiredCapabilities.setCapability("platformName", "iOS");
        desiredCapabilities.setCapability("platformVersion", "13.5");
        desiredCapabilities.setCapability("app", "org.wikimedia.wikipedia");
        desiredCapabilities.setCapability("noReset", true);
        desiredCapabilities.setCapability("automationName", "XCUITest");
        return desiredCapabilities;
    }
}