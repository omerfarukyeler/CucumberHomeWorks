package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.EbayPages;
import utilities.ConfigReader;
import utilities.Driver;

import static utilities.Driver.driver;

public class EbayTestHw1 {

    EbayPages ebayPages =new EbayPages();
    @Given("Kullanici giris sayfasina gider")
    public void kullaniciGirisSayfasinaGider() {

        Driver.getDriver().get(ConfigReader.getProperty("url"));
    }

    @When("Kullanici Cookies secenegini Accept All secenegi ile kabul eder")
    public void kullaniciCookiesSeceneginiAcceptAllSecenegiIleKabulEder() {

        ebayPages.cookies.click();

    }

    @And("Kullanici SearchBox kutusuna “computer” kelimesini yazar")
    public void kullaniciSearchBoxKutusunaComputerKelimesiniYazar() {

        ebayPages.searchBox.sendKeys("computer");
    }

    @And("Kullanici arama butonuna basar")
    public void kullaniciAramaButonunaBasar() {

        ebayPages.searchButton.click();
    }
    @And("Kullanici asagidaki resimde bulunan filtre bolmesinden Windows secenegine tiklar")
    public void kullaniciAsagidakiResimdeBulunanFiltreBolmesindenWindowsSecenegineTiklar() {
        ebayPages.Windows10button.click();
    }
    @And("Cikan seceneklerden en usteki urun assert edilir")
    public void cikanSeceneklerdenEnUstekiUrunAssertEdilir() {

        Assert.assertTrue(ebayPages.ActualData.getText().contains("Windows 10"));
    }

    @Then("Kullanici sayfayi kapatir")
    public void kullaniciSayfayiKapatir() {

        Driver.closeDriver();
    }



}
