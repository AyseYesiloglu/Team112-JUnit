package ReviewQuestions;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.Arrays;

public class C01_GoogleAmazonTest {

    //1- C01_TekrarTesti isimli bir class olusturun
    //2- https://www.google.com/ adresine gidin
    //3- cookies uyarisini kabul ederek kapatin
    //4- Sayfa basliginin “Google” ifadesi icerdigini test edin
    //5- Arama cubuguna “Nutella” yazip aratin
    //6- Bulunan sonuc sayisini yazdirin
    //7- sonuc sayisinin 10 milyon’dan fazla oldugunu test edin
    //8- Sayfayi kapatin
    static WebDriver driver;

    @BeforeClass
    public static void setUp(){

        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

    }
    @AfterClass
    public static void tearDown() throws InterruptedException {
        Thread.sleep(1000);
        driver.close();
    }

    @Test
    public void test01(){
        //2- https://www.google.com/ adresine gidin
        //3- cookies uyarisini kabul ederek kapatin
        //4- Sayfa basliginin “Google” ifadesi icerdigini test edin

        driver.get("https://www.google.com/");
        String expectedUrl="Google";
        String actualUrl=driver.getTitle();

        Assert.assertTrue(actualUrl.contains(expectedUrl));

    }
    @Test
    public void test02(){
        //5- Arama cubuguna “Nutella” yazip aratin
        //6- Bulunan sonuc sayisini yazdirin
        //7- sonuc sayisinin 10 milyon’dan fazla oldugunu test edin
        //8- Sayfayi kapatin

        WebElement googleSearchBox=driver.findElement(By.name("q"));


      googleSearchBox.sendKeys("Nutella"+Keys.ENTER);
      WebElement numberOfResult=driver.findElement(By.xpath("//div[@id='result-stats']"));

     String numberOfResultText=numberOfResult.getText();
     String[]result=numberOfResultText.split(" ");
     System.out.println(Arrays.toString(result));
     String numberOfRes=result[1].replace(".","");
     System.out.println(numberOfRes);
     int numberOfResultInt=Integer.parseInt(numberOfRes);
     int expectedNum=10000000;
     Assert.assertTrue(numberOfResultInt>expectedNum);


    }
}
