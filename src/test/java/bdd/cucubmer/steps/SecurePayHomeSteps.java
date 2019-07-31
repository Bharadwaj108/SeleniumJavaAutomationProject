package bdd.cucubmer.steps;

import cucumber.api.PendingException;
import cucumber.api.java.en.When;
import org.testng.Assert;
import pages.SecurePayHomePage;

import static com.sample.framework.base.Base.CurrentPage;

public class SecurePayHomeSteps
{
    @When("^Navigate to \"([^\"]*)\" page in the SecurePay website$")
    public void NavigateSecurePayWebsite(String navigateMenuItem) throws Throwable
    {
        CurrentPage = CurrentPage.As(SecurePayHomePage.class).NavigateSecurePay(navigateMenuItem);
        Assert.assertNotNull(CurrentPage, "Unable to click on the link " + navigateMenuItem + " in the Secure Pay menu items");
    }
}
