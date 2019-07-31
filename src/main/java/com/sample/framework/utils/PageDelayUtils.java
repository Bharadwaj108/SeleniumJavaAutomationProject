package com.sample.framework.utils;

import com.sample.framework.base.DriverContext;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import java.time.Duration;
import java.util.function.Function;

public class PageDelayUtils {

    public static boolean WaitObjectExists(int maxWaitTimeInSeconds, By byOperator)
    {
        boolean elementExists = false;
        WebElement webElement = null;
        Wait<WebDriver> wait = new FluentWait<WebDriver>(DriverContext.Driver)
                .withTimeout(Duration.ofSeconds(maxWaitTimeInSeconds))
                .pollingEvery(Duration.ofSeconds(5))
                .ignoring(NoSuchElementException.class);
        Function<WebDriver,Boolean> function = new Function<WebDriver, Boolean>() {
            public Boolean apply(WebDriver driver) {
                System.out.println("Checking for the element!!");
                WebElement ele =  driver.findElement(byOperator);
                if(ele != null)
                {
                    System.out.println("Target element found");
                    return true;
                }
                return false;
            }
        };
        elementExists = wait.until(function);
        return  elementExists;
    }

    //FluentWait for the element until its found returns null
    public static WebElement GetWebElement(int maxWaitTimeInSeconds,By byOperator) {
        WebElement webElement = null;
        if(PageDelayUtils.WaitObjectExists(maxWaitTimeInSeconds,byOperator))
            return DriverContext.Driver.findElement(byOperator);
        return webElement;
    }

}
