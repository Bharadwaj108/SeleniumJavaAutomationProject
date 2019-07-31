package pages;

import com.github.javafaker.Faker;
import com.sample.framework.base.BasePage;
import com.sample.framework.base.DriverContext;
import com.sample.framework.utils.PageDelayUtils;
import context.ContactUs;
import cucumber.api.java.tr.Fakat;
import gherkin.lexer.Fa;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class SecurePayContactUsPage extends BasePage {
    public boolean ISContactUsPageLoaded() {
        return PageDelayUtils.WaitObjectExists(10000, By.name("first-name"));
    }

    public ContactUs PrepareRandomTestData()
    {
        ContactUs contactUs = new ContactUs();
        Faker dataGen = new Faker();
        contactUs.FirstName = dataGen.name().firstName();
        contactUs.LastName = dataGen.name().lastName();
        contactUs.Phone = dataGen.phoneNumber().phoneNumber();
        contactUs.Email = dataGen.internet().emailAddress();
        contactUs.WebSiteUrl = dataGen.internet().url();
        contactUs.Company = dataGen.company().name();
        contactUs.ReasonOfEnquiry = "Support";
        return contactUs;
    }

    public boolean FillContactDetails(ContactUs contactUs)
    {
        String logMessage = "The following Contact Details have been aded \n";
        try
        {
            //First Name
            WebElement txtFirstName = DriverContext.Driver.findElement(By.name("first-name"));
            txtFirstName.sendKeys(contactUs.FirstName);
            logMessage = logMessage + "First Name : " + contactUs.FirstName + "\n";

            //Last Name
            WebElement txtLastName = DriverContext.Driver.findElement(By.name("last-name"));
            txtLastName.sendKeys(contactUs.LastName);
            logMessage = logMessage + "Last Name : " + contactUs.LastName + "\n";

            //Email
            WebElement txtEmail = DriverContext.Driver.findElement(By.name("email-address"));
            txtEmail.sendKeys(contactUs.Email);
            logMessage = logMessage + "Email : " + contactUs.Email + "\n";

            //Phone
            WebElement txtPh = DriverContext.Driver.findElement(By.name("phone-number"));
            txtPh.sendKeys(contactUs.Phone);
            logMessage = logMessage + "Phone : " + contactUs.Phone + "\n";

            //Website URL
            WebElement txtUrl = DriverContext.Driver.findElement(By.name("website-url"));
            txtUrl.sendKeys(contactUs.WebSiteUrl);
            logMessage = logMessage + "Web Site URL : " + contactUs.WebSiteUrl + "\n";

            //Company
            WebElement txtCompany = DriverContext.Driver.findElement(By.name("business-name"));
            txtCompany.sendKeys(contactUs.Company);
            logMessage = logMessage + "Company : " + contactUs.Company + "\n";

            //Reason of Enquiry
            WebElement dropdownReason = DriverContext.Driver.findElement(By.name("reason-for-enquiry"));
            new Select(dropdownReason).selectByValue(contactUs.ReasonOfEnquiry);
        }
        catch (Exception ex)
        {
            return  false;
        }
        return true;
    }

}
