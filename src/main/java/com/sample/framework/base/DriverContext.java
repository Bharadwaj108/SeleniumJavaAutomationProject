package com.sample.framework.base;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DriverContext
{
    public static WebDriver Driver;
    public static Browser WebBrowser;
    public static void setDriver(WebDriver driver) {
        Driver = driver;
    }
}
