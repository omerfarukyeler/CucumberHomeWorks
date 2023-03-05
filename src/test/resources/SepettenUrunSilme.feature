Feature: : Kullanıcının sepete ürün eklemesi ve silmesi sonucu sepet simgesi üzerindeki ürün sayısının değişmesini görmeli

  Background:
    Given Given kullanici  web sayfasina gider

  @sepeturunsilme
  Scenario:: Kullanici sepetteki iki urunden bir tanesini siler ve sepet simgesi uzerindeki sayinin bir eksildigini gorur

    When kullanici cookiesi kabul eder
    And kullanici Pricing linkine tiklar
    And kullanici BuyNow butonu ile sepete bir urun ekler
    And kullanici Pricing sayfasina geri doner
    And kullanici Buynow butonu ile bir urun daha ekler
    And kullanici ana sayfaya geri doner
    And kullanici sepete uzerindeki mevcut sayiyi alir
    And kullanici sepete tekrar gider
    And kullanici sepetteki urunlerden bir tanesini Delete linki ile siler
    And kullanici ana sayfaya geri doner
    Then kullanici sepet simgesi uzerindeki sayinin bir eksildigini kontrol eder

