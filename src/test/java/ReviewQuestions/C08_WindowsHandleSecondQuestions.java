package ReviewQuestions;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import utilities.ReusableMethods;
import utilities.TestBase;

public class C08_WindowsHandleSecondQuestions extends TestBase {

    @Test
    public void windowHandle2(){

        //● Tests package’inda yeni bir class olusturun: WindowHandle2 ●
        // https://the-internet.herokuapp.com/windows adresine gidin.
        driver.get("https://the-internet.herokuapp.com/windows");

        //● Sayfadaki textin “Opening a new window” olduğunu doğrulayın.
        WebElement pageText= driver.findElement(By.xpath("//h3[text()='Opening a new window']"));
        Assert.assertTrue(pageText.isDisplayed());

        //● Sayfa başlığının(title) “The Internet” olduğunu doğrulayın.
        String expectedTitle="The Internet";
        String theInternetTitle=driver.getTitle();
        Assert.assertEquals(expectedTitle,theInternetTitle);

        //● Click Here butonuna basın.
        String theInterWindowHandleValue=driver.getWindowHandle();
        WebElement clickHereButton=driver.findElement(By.xpath("//a[text()='Click Here']"));
        clickHereButton.click();

        ReusableMethods.waitFor(5);
        //● Açılan yeni penceredeki Sayfa textinin “New Window” olarak görüldüğünü doğrulayın.

        WebElement newWindowPageTitleText=driver.findElement(By.tagName("h3"));
        Assert.assertTrue(newWindowPageTitleText.isDisplayed());
        String actualTitle=driver.getTitle();
        System.out.println(actualTitle);

        //● Bir önceki pencereye geri döndükten sonra URL'in “Internet” içerdiğini test edin

        driver.switchTo().window(theInterWindowHandleValue);
        String expectedTitleUrl="internet";
        String actualUrl=driver.getCurrentUrl();
        System.out.println(actualUrl);
       Assert.assertTrue(actualUrl.contains(expectedTitleUrl));
        ReusableMethods.waitFor(2);

    }

}
