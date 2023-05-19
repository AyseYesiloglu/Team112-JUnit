package day11_cookies_tables_repeat;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utilities.TestBase;

import java.util.List;

public class C02_webTablesQuestions extends TestBase {

    @Test
    public void test01(){

        //1."https://www.amazon.com" adresine gidin
        //2.Sayfanin en altina inin
        //3.Web table tum body’sini yazdirin
        //4.Web table’daki satir sayisinin 9 oldugunu test edin
        //5.Tum satirlari yazdirin
        //6. Web table’daki sutun sayisinin 13 olduğunu test edin
        //7. 5.sutunu yazdirin
        //8.Satir ve sutun sayisini parametre olarak alip, hucredeki bilgiyi
        //döndüren bir method olusturun

        //1."https://www.amazon.com" adresine gidin
        driver.get("https://www.amazon.com");

        //2.Sayfanin en altina inin
        Actions actions=new Actions(driver);
        actions.sendKeys(Keys.END).perform();

        //3.Web table tum body’sini yazdirin
        WebElement allBody=driver.findElement(By.tagName("table"));
        System.out.println(allBody.getText());

        //4.Web table’daki satir sayisinin 10 oldugunu test edin
        List<WebElement>tabloRows=driver.findElements(By.tagName("tr"));
        System.out.println(tabloRows.size());
        int expectedNumberOfTableRows=10;
        Assert.assertEquals(expectedNumberOfTableRows,tabloRows.size());

        //5.Tum satirlari yazdirin
        int index=1;
        for ( WebElement eachTabloRows:tabloRows
             ) {
            System.out.println(index+".row = "+eachTabloRows.getText());
            index++;
        }
        //6. Web table’daki sutun sayisinin 14 olduğunu test edin
        System.out.println("===================");
        List<WebElement>tableColumnList=driver.findElements(By.xpath("//tr[1]/td"));
        int expectedNumberOfTabloColumn=14;
        Assert.assertEquals(expectedNumberOfTabloColumn,tableColumnList.size());


        //7.satır 5.sutunu yazdirin
        System.out.println("===================");
        WebElement istenenCell=driver.findElement(By.xpath("//tbody/tr[7]/td[5]"));
        System.out.println(istenenCell.getText());

        //8.Satir ve sutun sayisini parametre olarak alip, hucredeki bilgiyi
        //döndüren bir method olusturun
        System.out.println("===================");

       System.out.println(elementOfCell(5, 7).getText());


    }
     public  WebElement elementOfCell(int numberOfRow ,int numberOfColumn){

         String xpath="//tbody/tr["+ numberOfRow+"]/td["+numberOfColumn+"]";
         WebElement istenenElement=driver.findElement(By.xpath(xpath));
         return istenenElement;
     }
}
