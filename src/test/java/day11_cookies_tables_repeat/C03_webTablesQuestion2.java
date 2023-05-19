package day11_cookies_tables_repeat;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.TestBase;

import java.util.ArrayList;
import java.util.List;

public class C03_webTablesQuestion2 extends TestBase {

    @Test
    public void test01(){
        //Bir Class olusturun D19_WebtablesHomework
        //1. “https://demoqa.com/webtables” sayfasina gidin
        //2. Headers da bulunan basliklari yazdirin
        //3. 3.sutunun basligini yazdirin
        //4. Tablodaki tum datalari yazdirin
        //5. Tabloda kac tane bos olmayan cell (data) oldugunu yazdirin
        //6. Tablodaki satir sayisini yazdirin
        //7. Tablodaki sutun sayisini yazdirin
        //8. Tablodaki 3.kolonu yazdirin
        //9. Tabloda "First Name" i Kierra olan kisinin Salary'sini yazdirin
        //10. Page sayfasinda bir method olusturun, Test sayfasindan satir ve sutun
        //sayisini girdigimde bana datayi yazdirsin


        //1. “https://demoqa.com/webtables” sayfasina gidin
        driver.get("https://demoqa.com/webtables");

        //2. Headers da bulunan basliklari yazdirin
        List<WebElement>headersList=driver.findElements(By.xpath("//div[@class='rt-th rt-resizable-header -cursor-pointer']"));

        int index=1;
        for (WebElement eachHeader:headersList
             ) {
            System.out.println(index+"-"+eachHeader.getText());
            index++;

        }

        //3. 3.sutunun basligini yazdirin
        System.out.println("3.column is: " +headersList.get(2).getText());


        //4. Tablodaki tum datalari yazdirin
        WebElement allOfData=driver.findElement(By.xpath("//div[@class='rt-tbody']"));
        System.out.println(allOfData.getText());


        //5. Tabloda kac tane bos olmayan cell (data) oldugunu yazdirin
        List<WebElement>allDataOfTables=driver.findElements(By.xpath("//div[@class='rt-td']"));
        List<WebElement>withoutSpaceAllDataOfTable=new ArrayList<>();
        int index1=0;

        for (WebElement eachDataOfTables:allDataOfTables
             ) {
            if ( !(eachDataOfTables.getText().equals("")|| (eachDataOfTables.getText().equals(" ")))){
                withoutSpaceAllDataOfTable.add(eachDataOfTables);
            }
        }
        System.out.println(withoutSpaceAllDataOfTable.size());

        for (int i = 0; i <withoutSpaceAllDataOfTable.size() ; i++) {
            System.out.println(withoutSpaceAllDataOfTable.get(i).getText());

        }

        //6. Tablodaki satir sayisini yazdirin
        List<WebElement>numberOfRow=driver.findElements(By.xpath("//div[@class='rt-tr-group']"));
        System.out.println(numberOfRow.size());

        //7. Tablodaki sutun sayisini yazdirin

        //8. Tablodaki 3.kolonu yazdirin
        //9. Tabloda "First Name" i Kierra olan kisinin Salary'sini yazdirin
        //10. Page sayfasinda bir method olusturun, Test sayfasindan satir ve sutun
        //sayisini girdigimde bana datayi yazdirsin



    }
}
