package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class TelerikPages {

    public TelerikPages() {
        PageFactory.initElements(Driver.getDriver(), this);
    }


    @FindBy (css = "button[id='onetrust-accept-btn-handler']")
    public WebElement cookies;

    @FindBy (css = "#js-tlrk-nav-search-wrapper")
    public WebElement searchbox1;

    @FindBy (xpath = "(//button[@type='button'])[4]")
    public WebElement searchbutton1;

    @FindBy(xpath = "//*[@id='ContentPlaceholder1_C006_Col00']/section[1]/div/div/div/tk-site-search/div/div/input")
    public WebElement searchspace1;

    @FindBy (xpath= "/html/body/div[2]/div/section[2]/div/div/div[1]/div/b")
    public WebElement ActualData;

}
