package day10_Waits_File;

public class Knowledge {



    /*

    Bir sayfanın uygulama sunucusu veya web sunucusu çok yavaşsa veya internet ağı çok yavaşsa,
    web sayfasındaki ögelerin(webelement) yüklenmesi beklenenden uzun sürebilir.
    Bu durumda, komut dosyanız (test script) ögeyi bulmaya çalıştığında ögeler yüklenmez.-->Kod NoSuchElementException verir

    Driver ile cihaz veya internet arasında yaşanan senkronizasyon sorunlarını çözmek için driver'i belirli yöntemler
    ile bekletmek(wait) gerekir.

    1)Java Tabanlı
    --Thread.sleep-->göreve değil süreye odaklanır. kaç saniye derseniz o kadar bekletir(o sürede önce yapılmış yapılmamış bakmaz)

    2)Selenium Tabanlı(Dinamiktir görevi süreden önce tamamlarsa diğer göreve geçer.Maximum bekleme süresidir.)
    --Implicit Wait---> global wait time for all elements on the page
    sayfadaki tüm objeler için ortak bekleme süresi belirler
     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
    her bir aşamada ne kadar bekleyeceğini ifade eder
    eğer verilen süreden daha hızlı yaparsa verilen aşamayı hemen diğer eşamaya geçer

    Explicitly Wait:İstisnai durumlar.
    Spesifik bir elementin spesifik bir işlemi için tanımlanmış maksimum bekleme süresidir.
    Bir dosya indirdik ve çok uzun sürüyor(manuel olarak test ettiğimizde anlayabiliriz)
    Imlicitly wait süresinin de yetmeyeceği işlemlerde explicitlyWait kullanırız.
    --ilk olarak belirli bir miktarda bekleme süresi ile wait object create edilir.
       WebDriverWait wait=new WebDriverWait(driver,Duration.ofSecond(200));
    --Explicit wait'de hem webElement, hem de beklenecek süre kullanılır.Çünkü olmayan bir webElement'in
    locate edilmesi mümkün olmayablir.
    WebElement itsBackElementi=wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("message")));
    id'si messsage olarak locate edilen elementi görülebilinceye kadar bekle




     */
}
