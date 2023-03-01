Feature:Kullanici arama sayfasina bilgilerini girer ve ana sayfaya gecis yapar



  @TelerikTest

  #Asagidaki sekilde kullanıcının davranışlarını tanımlayan geliştirmeye DDT yani Data Driven Testing denir.
  Scenario Outline: Kullanici  search box yazılan kelimede  istediği ürünü bulmalıdır.

    Given Kullanici giris ana sayfasina gider
    When Kullanici Cookies secenegini Accept and Close a tiklar
    And Kullanici ust menu bar dan arama simgesine tiklar
    And Kullanici search box kutusuna "<kadi>" yazar
    And Kullanici arama butonuna tiklar
    Then Arama sonucu cikan ilk secenegin ilgili kelimeleri barindirdigi Assert edilir
    And Kullanici sayfayi kapatmalidir
    Examples:
      |kadi            |
      |keywordtest     |
      |datatesting     |

