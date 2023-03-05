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

    @FindBy( xpath="(//button[@id='onetrust-accept-btn-handler']")
    public WebElement secondcookies;

    @FindBy( xpath = "//span[@class='TK-Counter TK-Counter--SC TK-Counter--Visible']")
    public  WebElement ActualData;

    @FindBy(xpath = "(//a[@class='Btn Btn--prim4 u-db'])[3]")
    public WebElement secondBuyNow;

    @FindBy(xpath="//a[@class='TK-TLRK-Logo']")
    public WebElement mainPageReturn;

    @FindBy(css = "span[class='TK-Counter TK-Counter--SC TK-Counter--Visible']")
    public WebElement productkontrol;

    @FindBy(xpath ="//a[@title='Shopping cart']")
    public WebElement shoppingcart;

    @FindBy(xpath="(//a[@class='e2e-delete-item btn-delete-item ng-star-inserted'])[1]")
    public WebElement deleteItems;



}
