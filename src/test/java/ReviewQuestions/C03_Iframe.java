package ReviewQuestions;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class C03_Iframe {


    WebDriver driver;
    @Before
    public void setUp(){
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));


    }
    @After
    public void tearDown() throws InterruptedException {
        Thread.sleep(1000);
        driver.close();
    }

    @Test
    public void test01(){
        //1) http://demo.guru99.com/test/guru99home/ sitesine gidiniz
        driver.get("http://demo.guru99.com/test/guru99home/");

        //2) sayfadaki iframe sayısını bulunuz.
        List<WebElement>iframeList=driver.findElements(By.tagName("iframe"));
        System.out.println(iframeList.size());

        //3) ilk iframe'deki (Youtube) play butonuna tıklayınız.
        WebElement youtubeIframeElement=driver.findElement(By.xpath("//iframe[@wmode='transparent']"));
        driver.switchTo().frame(youtubeIframeElement);

        WebElement playButton=driver.findElement(By.xpath("//div[@id='movie_player']"));
        playButton.click();

        //4) ilk iframe'den çıkıp ana sayfaya dönünüz
       driver.switchTo().defaultContent();

        //5) ikinci iframe'deki (Jmeter Made Easy) linke
        WebElement secondIframeElement=driver.findElement(By.xpath("//iframe[@id='a077aa5e']"));
        driver.switchTo().frame(secondIframeElement);

        WebElement jmeterMadeEasyLink=driver.findElement(By.xpath("//img[@src='Jmeter720.png']"));
        jmeterMadeEasyLink.click();

        //(https://www.guru99.com/live-selenium-project.html) tıklayınız

    }
}
