package testrkgrp.testrkaid.pages;

import junit.framework.Assert;
import testrkgrp.testrkaid.common.CommonLibrary;
import testrkgrp.testrkaid.util.MysqlUtil;


public class ProductDetailPage extends CommonLibrary {
    String priceXpath="//span[@id='our_price_display']";
    public ProductDetailPage verifyPrice(String productName)
    {
        try{Thread.sleep(3000);}catch(Exception e){}
        String priceFromApp = getText(priceXpath);
        String priceFromDB = MysqlUtil.getPriceFromDB(productName);
        printLog("Price from APP "+priceFromApp);
        printLog("Price from DB "+priceFromDB);
        Assert.assertEquals(priceFromApp.contains(priceFromDB),true);
        return  this;
    }

}
