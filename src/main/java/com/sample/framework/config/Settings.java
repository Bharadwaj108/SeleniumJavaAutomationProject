package com.sample.framework.config;

import com.sample.framework.base.BrowserType;

public class Settings {
    public static BrowserType WebBrowser;
    public static String AuthUrl;
    public static String WebDriverPath;
    public static  String SearchEngineUrl;

    public static BrowserType getWebBrowser() {
        return WebBrowser;
    }

    public static void setWebBrowser(BrowserType webBrowser) {
        WebBrowser = webBrowser;
    }

    public static String getAuthUrl() {
        return AuthUrl;
    }

    public static void setAuthUrl(String authUrl) {
        AuthUrl = authUrl;
    }

    public static String getWebDriverPath() {
        return WebDriverPath;
    }

    public static void setWebDriverPath(String webDriverPath) {
        WebDriverPath = webDriverPath;
    }

    public  static String getSearchEngineUrl()
    {
        return  SearchEngineUrl;
    }

    public static void setSearchEngineUrl(String searchEngineUrl)
    {
        SearchEngineUrl = searchEngineUrl;
    }
}
