package com.sample.framework.config;

import com.sample.framework.base.BrowserType;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class ConfigReader
{
    /*
        Reads the properties set in the GlobalConfig.properties file
     */
    private void ReadProperty() throws IOException {
        Properties properties = new Properties();
        InputStream inputStream = new FileInputStream("src/main/java/com/sample/framework/config/GlobalConfig.properties");
        properties.load(inputStream);
        Settings.AuthUrl = properties.getProperty("AutUrl");
        Settings.setWebBrowser(BrowserType.valueOf(properties.getProperty("WebBrowser")));
        Settings.WebDriverPath = properties.getProperty("WebDriverPath");
        Settings.SearchEngineUrl = properties.getProperty("SearchEngineUrl");
    }

    /*
     * Populate project settings
     * */
    public static void PopulateProjectSettings() throws IOException {
        ConfigReader reader = new ConfigReader();
        reader.ReadProperty();
    }
}