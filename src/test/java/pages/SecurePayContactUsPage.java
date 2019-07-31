package pages;

import com.sample.framework.base.BasePage;
import com.sample.framework.utils.PageDelayUtils;
import org.openqa.selenium.By;

public class SecurePayContactUsPage extends BasePage
{
    public boolean ISContactUsPageLoaded()
    {
        return PageDelayUtils.WaitObjectExists(10000, By.name("first-name"));
    }
}
