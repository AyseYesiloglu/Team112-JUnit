package ReviewQuestions;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WindowType;
import utilities.ReusableMethods;
import utilities.TestBase;

import java.awt.*;

public class C07_WindowsHandleFirstQuestions extends TestBase {

    @Test
    public void windowsHandleTest(){

        //● Yeni bir class olusturun: WindowHandle
        //● Amazon anasayfa adresine gidin.
        driver.get("https://www.amazon.com");

        //● Sayfa’nin window handle degerini String bir degiskene atayin
        String amazonWindowHandle=driver.getWindowHandle();

        //● Sayfa title’nin “Amazon” icerdigini test edin
        String expectedText="Amazon";
        String amazonTitle=driver.getTitle();
        Assert.assertTrue(amazonTitle.contains(expectedText));

        //● Yeni bir tab olusturup, acilan tab’da wisequarter.com adresine gidin
        driver.switchTo().newWindow(WindowType.TAB);
        //-->Burda newWindow methodunda yeni bir tab oluşturduk

        driver.get("https://www.wisequarter.com");

        //● Sayfa title’nin “Wise Quarter” icerdigini test edin
        String expectedWiseText="Wise Quarter";
        String wisequarterTitle=driver.getTitle();
        System.out.println(wisequarterTitle);
        Assert.assertTrue(wisequarterTitle.contains(expectedWiseText));

        String wisequarterWindowHandle= driver.getWindowHandle();

        //● Yeni bir window olusturup, acilan sayfada walmart.com adresine gidin
        driver.switchTo().newWindow(WindowType.WINDOW);
        ////-->Burda newWindow methodunda yeni bir window oluşturduk
        driver.get("https://walmart.com");

        //● Sayfa title’nin “Walmart” icerdigini test edin
        String expectedWalmartText="Walmart";
        String walmartTitle=driver.getTitle();
        Assert.assertTrue(walmartTitle.contains(expectedWalmartText));

        //● Ilk acilan sayfaya donun ve amazon sayfasina dondugunuzu test edin

        driver.switchTo().window(amazonWindowHandle);
        ReusableMethods.waitFor(2);
        expectedText="Amazon";
        amazonTitle=driver.getTitle();
        Assert.assertTrue(amazonTitle.contains(expectedText));
    }


}
