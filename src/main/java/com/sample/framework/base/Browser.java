package com.sample.framework.base;

import org.openqa.selenium.WebDriver;

public class Browser
{
    public BrowserType Type;
    private WebDriver _driver;

    public Browser(WebDriver driver) {
        _driver = driver;
    }

    public void GoToURL(String url)
    {
        _driver.get(url);
    }
}
