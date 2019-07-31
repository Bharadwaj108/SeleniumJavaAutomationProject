package bdd.cucubmer.steps;

import com.sample.framework.base.BasePage;
import com.sample.framework.base.BaseStep;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import org.testng.Assert;
import pages.GoogleHomePage;

public class GoogleHomeSteps extends BaseStep
{
    @Given("^I Search for \"([^\"]*)\" on Google$")
    public void SearchGoogle(String searchString) throws Throwable
    {
       CurrentPage = GetPageInstance(GoogleHomePage.class);
        Assert.assertTrue(CurrentPage.As(GoogleHomePage.class).SearchGoogle(searchString));
    }

    @And("^Click on the link with the search link \"([^\"]*)\" from the search results$")
    public void ClickOnSearchResultsLink(String searchResultUrl) throws Throwable
    {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }
}
