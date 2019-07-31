package com.sample.framework.base;

import com.sample.framework.config.Settings;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class FrameworkInitialize extends Base {
    WebDriver _driver = null;

    public void InitBrowser(BrowserType type)
    {
        switch (type) {
            case ie:
                break;
            case Chrome:
                ChromeOptions options = new ChromeOptions();
                options.addArguments("start-maximized");
                System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir").toString()+ Settings.WebDriverPath+"chromedriver.exe");
                _driver = new ChromeDriver(options);
                break;
            case firefox:
                break;
        }
        DriverContext.setDriver(_driver);
        DriverContext.WebBrowser = new Browser(_driver);
    }
}
