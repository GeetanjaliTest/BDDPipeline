package testrkgrp.testrkaid.common;

import testrkgrp.testrkaid.pages.WebHomePage;
import testrkgrp.testrkaid.util.CSVUtils;
import testrkgrp.testrkaid.util.PropertyReaderUtil;
import org.apache.log4j.PropertyConfigurator;

import java.lang.reflect.Method;

import static testrkgrp.testrkaid.common.WebDriverInstance.driver;
import static testrkgrp.testrkaid.util.PropertyReaderUtil.auto;
import io.cucumber.java.After;
import io.cucumber.java.Before;
public class BaseTest {

    @Before
    public void setup()
    {
    	PropertyReaderUtil.readProperties();
        driver = WebDriverInstance.getDriver(auto.getProperty("browser"));
        driver.get(auto.getProperty("baseurl"));
    }
    @After
    public void tearUp()
    {
    	try{Thread.sleep(3000);}catch (Exception e){}
        driver.quit();
    }

  
    public void readProperty()
    {
        PropertyReaderUtil.readProperties();
        System.out.println(System.getProperty("user.dir")+"/log4j.properties");
        PropertyConfigurator.configure(System.getProperty("user.dir")+"/log4j.properties");
    }

    public WebHomePage navigateToHome()
    {
        driver.get(auto.getProperty("baseurl"));
        return  new WebHomePage();
    }


}
