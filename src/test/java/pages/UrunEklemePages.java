package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class UrunEklemePages {
    public UrunEklemePages(){PageFactory.initElements(Driver.getDriver(), this);}


    @FindBy (css = "button[id='onetrust-accept-btn-handler']")
    public WebElement cookies;

    @FindBy(xpath = "(//a[@class='TK-Menu-Item-Link'])[5]")
    public WebElement pricingButton;

    @FindBy (xpath ="(//a[@class='Btn Btn--prim4 u-db'])[2]")
    public WebElement buyNow;

    @FindBy( id="onetrust-accept-btn-handler")
    public WebElement secondcookies;

    @FindBy( xpath = "//span[@class='TK-Counter TK-Counter--SC TK-Counter--Visible']")
    public  WebElement ActualData;



}
