package ReviewQuestions;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.TestBase;

import java.util.List;

public class C06_HandleIframe extends TestBase {

    @Test
    public void iframeTest(){

        //1) http://demo.guru99.com/test/guru99home/ sitesine gidiniz
        driver.get("http://demo.guru99.com/test/guru99home/");

        //2) sayfadaki iframe sayısını bulunuz.

        List<WebElement>iframeList=driver.findElements(By.tagName("iframe"));
        System.out.println(iframeList.size());

        //3) ilk iframe'deki (Youtube) play butonuna tıklayınız.

        WebElement iframeElement=driver.findElement(By.xpath("//iframe[@wmode='transparent'][1]"));
        driver.switchTo().frame(iframeElement);
        WebElement youtubePlayButton=driver.findElement(By.xpath("//a[@class='ytp-impression-link']"));
        youtubePlayButton.click();

        //4) ilk iframe'den çıkıp ana sayfaya dönünüz
        driver.switchTo().defaultContent();

        //5) ikinci iframe'deki (Jmeter Made Easy) linke (https://www.guru99.com/live-selenium-project.html) tıklayınız

        WebElement secondIframeElement=driver.findElement(By.xpath("//iframe[@id='a077aa5e']"));
        driver.switchTo().frame(secondIframeElement);
        WebElement jmeterMadeEasyText= driver.findElement(By.xpath("//img[@src='Jmeter720.png']"));
        jmeterMadeEasyText.click();

        /*
        Day08 Class02
        Web elementini locate ettik (kodun doğruluğundan da eminiz)
        ve istenilen işlemi yapmaya çalıştık intellije bize NosuchElement exception'u verdi
        O zaman acaba locate ettiğimiz webelement iframe2in içinde mi diye kontrol ediyoruz ve
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

         */


    }
}
