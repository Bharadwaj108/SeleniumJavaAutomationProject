package com.sample.framework.base;
import org.openqa.selenium.support.PageFactory;

public class Base
{
    public static BasePage CurrentPage;
    public <TPage extends BasePage>TPage GetPageInstance(Class<TPage> page)
    {
        Object pageInstance = PageFactory.initElements(DriverContext.Driver,page);
        return page.cast(pageInstance);
    }
}
