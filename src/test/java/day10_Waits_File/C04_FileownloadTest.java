package day10_Waits_File;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import utilities.ReusableMethods;
import utilities.TestBase;

import java.nio.file.Files;
import java.nio.file.Paths;

public class C04_FileownloadTest extends TestBase {

    @Test

    public void test01(){
        //1. Tests packagenin altina bir class oluşturalim : C04_FileDownload
        //2. https://the-internet.herokuapp.com/download adresine gidelim.
        //3. logo.png dosyasını indirelim
        //4. Dosyanın başarıyla indirilip indirilmediğini test edelim


        //2. https://the-internet.herokuapp.com/download adresine gidelim.
        driver.get("https://the-internet.herokuapp.com/download");

        //3. logo.png dosyasını indirelim
        driver.findElement(By.xpath("//a[text()='luminoslogo.png']")).click();
        ReusableMethods.waitFor(5);

        //4. Dosyanın başarıyla indirilip indirilmediğini test edelim
        //test için öncelikle dosyanın indirildiğinde dosyaYolu 'nu oluşturmak gerekir
        String dinamikDosyaYolu=System.getProperty("user.home")+"/Downloads/luminoslogo.png";

        //Bir dosyanın bilgisayarda VAR OLUP OLMADIĞINI(exists) test etmek için "Files" CLASS'ından yardım alıyoruz
        //Files.exists(Paths.get(bilgisayardakiDosya)

        Assert.assertTrue(Files.exists(Paths.get(dinamikDosyaYolu)));

    }
    @Test
    public void test02(){

        //Masa üstünde HelloJava.docx dosyası olduğunu test edelim

        String dosyaYolu=System.getProperty("user.home")+"/Desktop/HelloJava.docx";
        Assert.assertTrue(Files.exists(Paths.get(dosyaYolu)));
    }
}
