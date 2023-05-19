package day07_dropDown_jsAlerts;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Knowledge {
    /*
    DropDownMenu olabilmesi için select tagının olması ŞART

     ####DropDown menü####
      Select tagı ile oluşturulan açılır menüdür seçenekler de option tagı ile oluşturulur.
      Drop Down ile işlem yapabilmemiz için Selenium Select class'ı oluşturmuştur.
      Biz de bu klastan oluşturacağımız obje ile dropdown menüden istediğimiz işlemleri yapabiliriz:

    -1.adım : DropDown web elementini  locate etmek
    -2.adım: Select class’ından  bir obje oluşturmak ve parametre olarak dropdown elementini girmek
    -3.adım: Select objesi ile istediğimiz hazır metodu kullanmak
    ÖRN:
        WebElement dropDownWebElement =driver.findElement(By.id("searchDropdownBox"));

        Select select = new Select(dropDownWebElement);

        // to select an option from the drop down we can use visible text
        select.selectByVisibleText("Books");

        // getFirstSelectedOption retunrs the selected option
        String expectedSelectedObjectText = "Books";
        String actualSelectedObjectText = select.getFirstSelectedOption().getText();  // Books


        ###JSAlert###
        HTML Sayfalarda iki tur Alert ile karşılaşabiliriz:
    1-HTML Alerts:Inspect yapılabilir ve lokate edilerek kullanılabilir.
    2-JSAlerts:  inspect yapılamaz Dolayısıyla locate edip kullanılamaz
        bu tür bir Alert ile karşılaşıldığında her işlem yapmak istediğimizde
        Driver.switchTo().alert Diyerek önce alert'e geçiş yapıp sonra nokta koyup istediğimiz işlemi yapabiliriz.

        WebElement jsFirstButton=driver.findElement(By.xpath("//button[text()='Click for JS Alert']"));
        jsFirstButton.click();
        driver.switchTo().alert().accept();

     */


}

