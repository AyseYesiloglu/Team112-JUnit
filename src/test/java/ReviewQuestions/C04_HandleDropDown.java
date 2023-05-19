package ReviewQuestions;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import utilities.ReusableMethods;
import utilities.TestBase;

public class C04_HandleDropDown extends TestBase {

    @Test
    public void test01() throws InterruptedException {

//1. http://zero.webappsecurity.com/ Adresine gidin

        driver.get("http://zero.webappsecurity.com/");

//2. Sign in butonuna basin

        WebElement signInButton=driver.findElement(By.xpath("//button[@id='signin_button']"));
        signInButton.click();

//3.Login kutusuna “username” yazin
        WebElement logInBox=driver.findElement((By.xpath("//input[@id='user_login']")));
        logInBox.sendKeys("username");

//4. Password kutusuna “password.” yazin

        WebElement passwordBox= driver.findElement(By.xpath("//input[@id='user_password']"));
        passwordBox.sendKeys("password");

//    5. Sign in tusuna basin
        driver.findElement(By.xpath("//input[@name='submit']")).click();

        ReusableMethods.waitFor(2);

        driver.navigate().back();
        ReusableMethods.waitFor(2);


        //6. Pay Bills sayfasina gidin
     WebElement onlineBankMenu=driver.findElement(By.xpath("//strong[normalize-space()='Online Banking']"));
     onlineBankMenu.click();
        Thread.sleep(2000);

        WebElement payBillsMenu=driver.findElement(By.xpath("//span[@id='pay_bills_link']"));
        payBillsMenu.click();

        //7. “Purchase Foreign Currency” tusuna basin

        WebElement purchaseForeignCurrencyButton=driver.findElement(By.xpath("//a[normalize-space()='Purchase Foreign Currency']"));
        purchaseForeignCurrencyButton.click();

        //8. “Currency” drop down menusunden Eurozone’u secin



        //9. “amount” kutusuna bir sayi girin
        //10. “US Dollars” in secilmedigini test edin
        //11. “Selected currency” butonunu secin
        //12. “Calculate Costs” butonuna basin sonra “purchase” butonuna basin
        //13. “Foreign currency cash was successfully purchased.” yazisinin ciktigini
        //    kontrol edin.

    }


}
