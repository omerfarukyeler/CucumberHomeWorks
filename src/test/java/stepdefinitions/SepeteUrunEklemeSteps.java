package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.UrunEklemePages;
import utilities.ConfigReader;
import utilities.Driver;

public class SepeteUrunEklemeSteps {

    UrunEklemePages urunEklemePages=new UrunEklemePages();
   // SoftAssert softAssert=new SoftAssert();
    @Given("Kullanici ana sayfaya gider")
    public void kullaniciAnaSayfayaGider() throws InterruptedException {
        Driver.getDriver().get(ConfigReader.getProperty("url"));
        Driver.wait(1);

    }

    @When("Kullanici Cookies ile ilgili onayi kabul eder")
    public void kullaniciCookiesIleIlgiliOnayiKabulEder() {
        urunEklemePages.cookies.click();
    }

    @And("Kullanici ust menu bardan Pricing linkine tiklar")
    public void kullaniciUstMenuBardanPricingLinkineTiklar() {

        urunEklemePages.pricingButton.click();
    }

    @And("Kullanici bir paketi buy now butonu ile sepete ekler")
    public void kullaniciBirPaketiBuyNowButonuIleSepeteEkler() throws InterruptedException {
        urunEklemePages.buyNow.click();
        Driver.wait(2);


    }
    @And("Kullanici ikincicookiesi kabul eder")
    public void kullaniciIkincicookiesiKabulEder() {
        urunEklemePages.secondcookies.click();
    }

    @And("Kullanici ana sayfaya tekrar geri gider")
    public void kullaniciAnaSayfayaTekrarGeriGider() {
        Driver.getDriver().navigate().back();

    }

    @Then("Kullanici sepet simgesi uzerindeki rakami dogrular")
    public void kullaniciSepetSimgesiUzerindekiRakamiDogrular() {

        Assert.assertTrue(urunEklemePages.ActualData.isDisplayed());

    }


}
