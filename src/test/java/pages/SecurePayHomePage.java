package pages;

import com.sample.framework.base.BasePage;
import com.sample.framework.base.DriverContext;
import context.SecurePayNavigation;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class SecurePayHomePage extends BasePage
{
    public BasePage NavigateSecurePay(String navigateToMenuItem)
    {
        WebElement lnkMenu = null;
        BasePage page = null;
        try
        {
            SecurePayNavigation menuItem = SecurePayNavigation.valueOf(navigateToMenuItem);
            switch (menuItem)
            {
                case ContactUs:
                    List<WebElement> liMenuLinks = DriverContext.Driver.findElements(By.xpath("*//ul/li/a"));
                    lnkMenu = GetMenuLink("Contact Us", liMenuLinks);
                    page = GetPageInstance(SecurePayContactUsPage.class);
                    break;
            }
            lnkMenu.click();
        }
        catch (Exception ex)
        {

        }
        return page;
    }

    private WebElement GetMenuLink(String linkText,List<WebElement> liMenuLinks)
    {
        WebElement link = null;
        try
        {
            for (WebElement lnk:liMenuLinks)
            {
                if(new String(lnk.getText()).equals(linkText))
                {
                    link = lnk;
                    break;
                }
            }
        }
        catch (Exception ex)
        {
            return null;
        }
        return link;
    }
}
