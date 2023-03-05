package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.poi.ss.formula.functions.T;
import org.junit.Assert;
import org.testng.asserts.SoftAssert;
import pages.UrunEklemePages;
import utilities.CommenSteps;
import utilities.ConfigReader;
import utilities.Driver;

public class SepettenUrunSilmeSteps {
    UrunEklemePages urunEklemePages=new UrunEklemePages();
    SoftAssert softAssert=new SoftAssert();
    CommenSteps commenSteps =new CommenSteps();
    Hooks hooks = new Hooks();



    public String number2;

    @Given("Given kullanici  web sayfasina gider")
    public void givenKullaniciWebSayfasinaGider() {

        Driver.getDriver().get(ConfigReader.getProperty("url"));
        }
    @When("kullanici cookiesi kabul eder")
    public void kullaniciCookiesiKabulEder() {
        try {
            CommenSteps.waitForClickablility(urunEklemePages.cookies,10);
            urunEklemePages.cookies.click();
        }
        catch (Exception a){
            a.getStackTrace();
        }
    }

    @And("kullanici Pricing linkine tiklar")
    public void kullaniciPricingLinkineTiklar() throws InterruptedException {
        urunEklemePages.pricingButton.click();



    }


    @And("kullanici BuyNow butonu ile sepete bir urun ekler")
    public void kullaniciBuyNowButonuIleSepeteBirUrunEkler() throws InterruptedException {
        //CommenSteps.waitForClickablility(urunEklemePages.buyNow,10);
        //urunEklemePages.buyNow.click();

        urunEklemePages.buyNow.click();
        //Thread.sleep(2000);
       // Driver.wait(3);






    }

    @And("kullanici Pricing sayfasina geri doner")
    public void kullaniciPricingSayfasinaGeriDoner() throws InterruptedException {

        urunEklemePages.mainPageReturn.click();







    }

    @And("kullanici Buynow butonu ile bir urun daha ekler")
    public void kullaniciBuynowButonuIleBirUrunDahaEkler() throws InterruptedException {
        urunEklemePages.pricingButton.click();
        urunEklemePages.secondBuyNow.click();
        ///Thread.sleep(3000);




    }

    @And("kullanici ana sayfaya geri doner")
    public void kullaniciAnaSayfayaGeriDoner() throws InterruptedException {

         urunEklemePages.mainPageReturn.click();



    }

    @And("kullanici sepete uzerindeki mevcut sayiyi alir")
    public void kullaniciSepeteUzerindekiMevcutSayiyiAlir() throws InterruptedException {

        number2 = urunEklemePages.productkontrol.getText();
        System.out.println(number2);
        ///Thread.sleep(3000);

    }

    @And("kullanici sepete tekrar gider")
    public void kullaniciSepeteTekrarGider() throws InterruptedException {
        urunEklemePages.shoppingcart.click();



    }

    @And("kullanici sepetteki urunlerden bir tanesini Delete linki ile siler")
    public void kullaniciSepettekiUrunlerdenBirTanesiniDeleteLinkiIleSiler() throws InterruptedException {
        urunEklemePages.deleteItems.click();
        ///Thread.sleep(1000);
        urunEklemePages.mainPageReturn.click();


    }

    @Then("kullanici sepet simgesi uzerindeki sayinin bir eksildigini kontrol eder")
    public void kullaniciSepetSimgesiUzerindekiSayininBirEksildiginiKontrolEder() {
        String number1 =urunEklemePages.productkontrol.getText();
        System.out.println(number1);
        Integer as =Integer.valueOf(number1)-1;
        Integer lasd=Integer.valueOf(number2);
        softAssert.assertEquals(as,lasd,"hataverdi");
    }



}
