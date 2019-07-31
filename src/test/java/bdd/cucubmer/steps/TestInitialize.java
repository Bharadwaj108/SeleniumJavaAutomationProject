package bdd.cucubmer.steps;

import com.sample.framework.base.DriverContext;
import com.sample.framework.base.FrameworkInitialize;
import com.sample.framework.config.ConfigReader;
import com.sample.framework.config.Settings;
import com.sample.framework.utils.PageDelayUtils;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.By;

import java.io.IOException;

public class TestInitialize extends FrameworkInitialize {

    public void InitializeTests() throws IOException {
        ConfigReader.PopulateProjectSettings();
        InitBrowser(Settings.getWebBrowser());
        DriverContext.WebBrowser.GoToURL(Settings.getAuthUrl());
        //PageDelayUtils.WaitObjectExists(10, By.xpath("/html/body/div[1]/form[1]/button"));
    }

    @Before
    public void InitBDDTest() throws IOException{
        ConfigReader.PopulateProjectSettings();
        InitBrowser(Settings.getWebBrowser());
        //DriverContext.WebBrowser.GoToURL(Settings.getAuthUrl());
        PageDelayUtils.WaitObjectExists(10, By.xpath("/html/body/div[1]/form[1]/button"));
    }

    @After
    public void TearDown()
    {
        DriverContext.Driver.close();
    }
}
