package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.TelerikPages;
import utilities.ConfigReader;
import utilities.Driver;

public class TelerikTestHw1 {
    TelerikPages telerikPages = new TelerikPages();
    @Given("Kullanici giris ana sayfasina gider")
    public void kullaniciGirisAnaSayfasinaGider() throws InterruptedException {

        Driver.getDriver().get(ConfigReader.getProperty("url"));
        Thread.sleep(2000);
    }

    @When("Kullanici Cookies secenegini Accept and Close a tiklar")
    public void kullaniciCookiesSeceneginiAcceptAndCloseATiklar() {
        telerikPages.cookies.click();

    }

    @And("Kullanici ust menu bar dan arama simgesine tiklar")
    public void kullaniciUstMenuBarDanAramaSimgesineTiklar() {
        telerikPages.searchbox1.click();
    }
    @And("Kullanici search box kutusuna {string} yazar")
    public void kullaniciSearchBoxKutusunaYazar(String aranacakkelime) {

        telerikPages.searchspace1.sendKeys(aranacakkelime);
    }



    @And("Kullanici arama butonuna tiklar")
    public void kullaniciAramaButonunaTiklar() {
        telerikPages.searchbutton1.click();
    }

    @And("Arama sonucu cikan ilk secenegin ilgili kelimeleri barindirdigi Assert edilir")
    public void aramaSonucuCikanIlkSeceneginIlgiliKelimeleriBarindirdigiAssertEdilir() {
        String Expected = "keywordtest";
        Assert.assertTrue(telerikPages.ActualData.isDisplayed());
    }





    @Then("Kullanici sayfayi kapatmalidir")
    public void kullaniciSayfayiKapatmalidir() {
        Driver.closeDriver();
    }



}
