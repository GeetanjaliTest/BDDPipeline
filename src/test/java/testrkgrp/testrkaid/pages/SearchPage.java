package testrkgrp.testrkaid.pages;

import junit.framework.Assert;
import testrkgrp.testrkaid.common.CommonLibrary;


public class SearchPage extends CommonLibrary {
    String productResultXpath = "//div[@class='product-image-container']//a[@class='product_img_link']";
    String moreXpath = "//*[@id=\"center_column\"]//span[text()='More']//parent::a";

    public SearchPage verifyResultPresent(String productName)
    {
        String productNameFromApp = getTitle(productResultXpath);
        System.out.println("From App "+productNameFromApp);

        Assert.assertEquals(productName, productNameFromApp);
        return this;
    }

    public ProductDetailPage navigateToProductDetail()
    {

        hover(productResultXpath);
        click(moreXpath);
        return new ProductDetailPage();
    }


}
