Feature:practice form
  @TC01
  Scenario: practice_form
    Given kullanici anasayfaya gider
    When  kullanici forms alanina tiklar
    Then  kullanici practiceforms alanina tiklar
    Then  kullanici "name" alanina valid deger girer
    Then  kullanici "lastname" alanina valid deger girer
    Then  kullanici "email" alanina valid deger girer
    Then  kullanici gender alaninda male buttona tiklar
    Then  kullanici "mobileNumber" alanina valid deger girer
    #Then  kullanici "dateOfBirth" alanina valid deger girer
    #Then  kullanici "subject" alanina valid deger girer
    Then  kullanici hobbies alaninda sports ve music buttonlarina tiklar
    And   kullanici picture bolumunde dosya sec alanina tiklar ve masaustunden fotograf secer
    And   kullanici "adress" alanina valid deger girer
    And   kullanici state alaninda ulke secer
    And   kullanici city alaninda city secer
    And   Kullanici submit butonuna tiklar




