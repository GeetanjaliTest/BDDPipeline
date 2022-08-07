package testrkgrp.testrkaid.common;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

import java.util.concurrent.TimeUnit;

import static testrkgrp.testrkaid.common.ProjectConstant.*;

public class WebDriverInstance {
    public static WebDriver driver = null;
    public static WebDriver getDriver(String browser)
    {
        if(browser.equalsIgnoreCase(BROWSER_CHROME))
        {
            WebDriverManager.chromedriver().setup();
            ChromeOptions options = new ChromeOptions();
            options.addArguments("--start-maximized");
            driver = new ChromeDriver(options);
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        }
        else if(browser.equalsIgnoreCase(BROWSER_EDGE))
        {
        	WebDriverManager.edgedriver().setup();
        	driver = new EdgeDriver();
        }
        else if(browser.equalsIgnoreCase(BROWSER_FIREFOX)|| browser.equalsIgnoreCase(BROWSER_MOZILLA))
        {
            WebDriverManager.firefoxdriver().setup();
            driver = new FirefoxDriver();
        }
        return driver;
    }
}
