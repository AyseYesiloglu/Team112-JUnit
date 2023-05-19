package day10_Waits_File;

import org.junit.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class C03_FileInputStream {
    @Test
    public void test01() throws FileNotFoundException {

        String dosyaYolu="/Users/ayseyesiloglu/Desktop/HelloJava.docx";
        FileInputStream fis=new FileInputStream(dosyaYolu);

        //Intellije'nin bilgisayardaki dosyaya ulaşabilmesi için o dosyanın dosya yoluna ihtiyacı var.
        //FileInputStream fis=new FileInputStream(BURA DOSYA YOLU YAZMAMIZ LAZIM);
        //Mac bilgisayarda -->dosyanın üzerindeki get info Yer(Where) git seç kopyala
        //Intelije'ye gel String olarak dosya yolu oluştur ve atama yap ama
        // sadece Desktop'a kadar dosya yolu kopyalanıyor o zaman "/" yazıp dosya adını ve uzantısını yazıyoruz--> (/HelloJava.docx)
        //new FileInputStream(dosyaYolu);-->burda FileInputStream altını kırmızı çizer ya yapamazsam diye throws fırlatıyoruz
        //Windows-->özellikler menüsünden-->// kullanılacak

        System.out.println(System.getProperty("user.dir"));
        ///Users/ayseyesiloglu/IdeaProjects/WisequarterProject/com.Team112JUnit
        //Şu anda çalışan class'ın (C03_FileInputStream) benim bilgisayarımda nerde olduğunu gösteriyor

        System.out.println(System.getProperty("user.home"));
        //- /Users/ayseyesiloglu -->kullanıcının temel path'ini verir

        /*
        user.home -->bizi temel path'e götürür
        sonra da nereye gitmek istersem user.home'un bize verdiği bilgiye "/" ile gitmek istediğim yeri birlikte yazıyoruz
        ÖRN:
        -->desktop'a gitmek istersem --> /Users/ayseyesiloglu/Desktop
        -->Downloads'a gitmek istersem -->/Users/ayseyesiloglu/Downloads
        -->"HelloJava" dosyasına gitmek istiyorum --> /Users/ayseyesiloglu/Desktop/HelloJava.docx

        O sebeple dosya yolunu string olarak kaydetmek yerine dinamik bir şekilde yapmak için
         String dinamikDosyaYolu=System.getProperty("user.home")  +     "/Desktop/HelloJava.docx";       -->Bu kod herkesin bilgisayarında aynıdır
                                     bilgisayarın temel path'i          bilgisayardaki dosyanın yolu

         */

        String dinamikDosyaYolu=System.getProperty("user.home")+"/Desktop/HelloJava.docx";



    }
}
