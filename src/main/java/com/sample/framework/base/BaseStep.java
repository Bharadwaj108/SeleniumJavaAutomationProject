package com.sample.framework.base;

import com.sample.framework.config.Settings;

public class BaseStep extends Base
{
    public void NavigateSite()
    {
        DriverContext.WebBrowser.GoToURL(Settings.AuthUrl);
    }
}
