Feature:  Kullanici arama sayfasina bilgilerini girer ve ana sayfaya gecis yapar

  @EbayTest

  #Asagidaki sekilde kullanıcının davranışlarını tanımlayan geliştirmeye BDD yani Behavior Driven Development denir.
  Scenario: Kullanici  search box yazılan kelimede  istediği ürünü bulmalıdır.

    Given Kullanici giris sayfasina gider
    When Kullanici Cookies secenegini Accept All secenegi ile kabul eder
    And Kullanici SearchBox kutusuna “computer” kelimesini yazar
    And Kullanici arama butonuna basar
    And Kullanici asagidaki resimde bulunan filtre bolmesinden Windows secenegine tiklar
    Then Cikan seceneklerden en usteki urun assert edilir
    And Kullanici sayfayi kapatir


