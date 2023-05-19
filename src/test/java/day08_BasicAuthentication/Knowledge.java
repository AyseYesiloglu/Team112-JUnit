package day08_BasicAuthentication;

public class Knowledge {



    /*
    Basic Authentication: Test etmek için gidilmesi gereken sayfada
    Örn:username:---->Bilgilerin girilmesi gerekir
        pasword:--->Bilgilerin girilmesi gerekir
        O sebeple bilgi girmek için username ve password box'larının locate edilmesi gerekiyor ama edilemiyorsa
        hangi firma ise aranır ve size bilgi verilir
        Örneğin ---->https://admin:admin@the-internet.herokuapp.com/basic_auth gibi her firmanın kendine özeldir
        hepsi böyle olacak diye bir şart yok.

        İframe: Web elementini locate ettik (kodun doğruluğundan da eminiz)
        ve istenilen işlemi yapmaya çalıştık intellije bize NosuchElement exception'u verdi
        O zaman acaba locate ettiğimiz webelement iframe'in içinde mi diye kontrol ediyoruz ve
        iframe'in içinde olduğunu görüyoruz

        Bu durumda ilk olarak iframe elementini locate edilir.
        ve frame'e aşağıdaki yapı ile geçiş yaparım
        driver.switchTo().frame("aşağıdaki 3 maddeden biri ")
            1)locate ettiğim web element
            2)birden fazla frame var ve index'ini biliyorsanız index'i
            3)String olarak ismini ya da id'sini yazabilirsiniz

        Bulunduğumuz iframe'in içinden direkt olarak ana sayfaya dönmek için
         driver.switchTo().defaultContent();
         Bulunduğumuz iframe'in içinden bir üst iframe'e çıkmak için
         driver.switchTo().parentFrame();

         ==============WİNDOW HANDLE==================

    getWindowHandle()	Şu anki açık pencerenin window handle döndürür.
    getWindowHandles()	Açık olan tüm pencerelerin Window Handleların(benzersiz tanımlayıcılarının) bir listesini döndürür.
    switchTo().window(istenenSayfanınWindowHandleDeğeri)	Parametre olarak verilen benzersiz tanımlayıcıya sahip penceyeye geçiş yapar.

    Şu anda açık olan pencerenin window handle’ını almak için getWindowHandle() metodu kullanılır:
    String currentWindow = driver.getWindowHandle();
    Selenyum 4 ile Windows konusunda yeni bir özellik geldi.
    İstersek kontrollü olarak Driver için yeni bir window veya tap oluşturabiliriz bu durumda driver'ımız da otomatik olarak yeni sayfaya geçmiş olur. Testin ilerleyen aşamalarında yeniden eski sayfalara dönüş görevi varsa o sayfada iken O sayfanın window handle değeri alınıp kaydedilir ve o sayfaya geçmek istendiğinde
    driver.switchTo().window(istenenSayfanınWindowHandleDeğeri) kodu ile o sayfaya geçiş yapılır


    Kontrolsüz açılan tab’a geçiş yapmak için
      1)İlk sayfada iken o sayfanın WHD alıp kaydedin
      2)İkinci sayfa açıldıktan sonra getWindowHandles() kullanarak acık olan tüm olan tüm sayfaların WH değerlerini bir Set olarak kaydedin
    Set<String> allWindows = driver.getWindowHandles();
      3)Su anda elimizde 2 elementli bir Set var,
    elementlerden bir tanesi 1.sayfanın WHD
    1.sayfanın WHD’ine eşit olmayan ise 2. sayfanın WHD olur.
      4)Bu şekilde 2.sayfanın WHD elde ettikten sonra WHD’leri kullanılarak sayfalar arası geçiş yapılabilir.








     */
}
