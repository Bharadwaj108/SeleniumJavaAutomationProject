package pages;

import com.sample.framework.base.BasePage;
import com.sample.framework.base.DriverContext;
import com.sample.framework.config.Settings;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import utils.TestException;

public class GoogleHomePage extends BasePage
{
    @FindBy(how= How.XPATH,using = "*//input[@type='text' and contains(@title, 'Search')]")
    private WebElement txtSearch;

    public boolean SearchGoogle(String searchString)
    {
        boolean flag = false;
        try
        {
            //Navigate to Google web page
            DriverContext.WebBrowser.GoToURL(Settings.SearchEngineUrl);

            //Search the website
            txtSearch.sendKeys(searchString);
            txtSearch.sendKeys(Keys.ENTER);

            Thread.sleep(5000);
        }
        catch (Exception ex)
        {
            //ToDo:Develop error logging utility and log
            return false;
        }
        return flag;
    }

    public SecurePayHomePage ClickSearchResult(String searchResultsLink)
    {
        try
        {
            WebElement linkSecurePay = DriverContext.Driver.findElement(By.xpath("*//a[@href='"+ searchResultsLink + "']"));

        }
        catch (Exception ex)
        {
            return  null;
        }
        return GetPageInstance(SecurePayHomePage.class);
    }

}
