package bdd.cucubmer.steps;

import context.ContactUs;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.testng.Assert;
import pages.SecurePayContactUsPage;

import static com.sample.framework.base.Base.CurrentPage;

public class SecurePayContactUsSteps
{
    ContactUs contactUs = null;

    @Then("^Contact Us Page is loaded$")
    public void ContactUsPageIsLoaded()
    {
        Assert.assertTrue(CurrentPage.As(SecurePayContactUsPage.class).ISContactUsPageLoaded(),"Failed to load the Contact Us Page");
    }

    @Given("^I generate random Contact test data$")
    public void GivenIGenerateRandomContactTestData()
    {
        contactUs = CurrentPage.As(SecurePayContactUsPage.class).PrepareRandomTestData();
        Assert.assertNotNull(contactUs,"Failed to generate random test data");
    }

    @And("^Fill the Contact Details in the Contact Us form$")
    public void FillContactUsForm()
    {
        Assert.assertTrue(CurrentPage.As(SecurePayContactUsPage.class).FillContactDetails(contactUs));
    }
}
