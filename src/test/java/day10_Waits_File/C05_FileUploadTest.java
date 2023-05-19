package day10_Waits_File;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.ReusableMethods;
import utilities.TestBase;

public class C05_FileUploadTest extends TestBase {

    @Test
    public void test01(){


        //1. Tests packagenin altina bir class oluşturun : C05_UploadFile
        //2. https://the-internet.herokuapp.com/upload adresine gidelim
        //3. chooseFile butonuna basalim
        //4. Yuklemek istediginiz dosyayi secelim.
        //5. Upload butonuna basalim.
        //6. “File Uploaded!” textinin goruntulendigini test edelim.


        //2. https://the-internet.herokuapp.com/upload adresine gidelim
        driver.get("https://the-internet.herokuapp.com/upload");

        /*
        --Bu görevi tamamalamak için dosyaSeç(chooseFile) butonuna basıldığında açılan bilgisayarımızdaki file dosyalarını click yapabilmemiz gerekir
       ancak selenium bilgisayardaki dosyaları click yapamaz bunu için şöyle bir çözüm yolu üretilmiştir:
          1) chooseFile(dosyaSeç) butonunu locate et
          2) upload edilecek dosyanın dosya yolunu oluştur
          3)chooseFile butonuna "sendKeys(dosyaYolu)" ile dosya yolunu gönderin

         */
        //3. chooseFile butonuna basalim
        WebElement dosyaSecButton=driver.findElement(By.xpath("//input[@id='file-upload']"));


        //4. Yuklemek istediginiz dosyayi secelim.
        String dosyaYolu=System.getProperty("user.home")+"/Desktop/HelloJava.docx";
        dosyaSecButton.sendKeys(dosyaYolu);

        //5. Upload butonuna basalim.
        WebElement uploadButton=driver.findElement(By.xpath("//input[@id='file-submit']"));
        uploadButton.click();

        //6. “File Uploaded!” textinin goruntulendigini test edelim.
        WebElement fileUploadedText= driver.findElement(By.xpath("//h3[text()='File Uploaded!']"));
        Assert.assertTrue(fileUploadedText.isDisplayed());
        ReusableMethods.waitFor(3);

    }
}
