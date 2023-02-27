package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class EbayPages {
    public EbayPages() {

        PageFactory.initElements(Driver.getDriver(), this);
    }
    @FindBy(xpath="//button[@id='gdpr-banner-accept']")
    public WebElement cookies;

    @FindBy (id="gh-ac")
    public WebElement searchBox;

    @FindBy(id="gh-btn")
    public  WebElement searchButton;

    @FindBy(xpath="(//div[text()='Windows 10'])[1]")
    public WebElement Windows10button;

    @FindBy(xpath = "//span[text()='HP 800 G1 Computer SFF PC Intel 4.Gen 4-32GB 250-1000GB SSD&HDD Windows 10 PRO']")
    public WebElement ActualData;

}
