package day12_Table_Excel;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.TestBase;

import java.util.ArrayList;
import java.util.List;

import static utilities.ReusableMethods.waitFor;

public class C01_Table extends TestBase {

    @Test
    public void test01(){

        //Create a Class D19_WebtablesHomework
        //Go to “https://demoqa.com/webtables” page
        //Print the headers found in Headers
        //Print the title of the 3rd column
        //Print all the data in the table
        //Print how many non-empty cells (data) are in the table
        //Print the number of rows in the table
        //Print the number of columns in the table
        //Print the 3rd column in the table
        //Print the Salary of the person whose "First Name" is Kierra in the table
        //Create a method on the Page page, it will print the data for me
          // when I enter the number of rows and columns from the Test page.

        //Create a Class D19_WebtablesHomework
        //Go to “https://demoqa.com/webtables” page
        driver.get("https://demoqa.com/webtables");

        //Print the headers found in Headers
        WebElement headersTable=driver.findElement(By.xpath("//div[@class='rt-thead -header']"));
        System.out.println(headersTable.getText());

        //Print the title of the 3rd column
        List<WebElement>columnsOfTable=driver.findElements(By.xpath("//div[@class='rt-th rt-resizable-header -cursor-pointer']"));
        System.out.println("3.Column is= "+columnsOfTable.get(2).getText());


        //Print all the data in the table
        System.out.println("=================");
        WebElement allDataOfTable=driver.findElement(By.xpath("//div[@class='rt-tbody']"));
        System.out.println(allDataOfTable.getText());

        //Print how many non-empty cells (data) are in the table
        List<WebElement>allDataOfTables=driver.findElements(By.xpath("//div[@class='rt-td']"));
        List<WebElement>allDataOfTableWithoutSpace=new ArrayList<>();

        for (WebElement eachDataOfTable:allDataOfTables
             ) {
            if (!(eachDataOfTable.getText().equals("") || (eachDataOfTable.getText().equals(" ")))){
                allDataOfTableWithoutSpace.add(eachDataOfTable);
            }
        }
        System.out.println(allDataOfTableWithoutSpace.size());

        //Print the number of rows in the table
        List<WebElement>rowsOfDataList=driver.findElements(By.xpath("//div[@class='rt-tr-group']"));
        System.out.println("number of rows: "+rowsOfDataList.size());


        //Print the number of columns in the table
        System.out.println(columnsOfTable.size());

        //Print the 3rd column in the table
      List<WebElement>thirdColumnDatas =driver.findElements(By.xpath("(//div[@class='rt-tr-group'])//div[3]"));

        for (WebElement eachThirdColumnData:thirdColumnDatas
             ) {
            System.out.println(eachThirdColumnData.getText());
        }


        //Print the Salary of the person whose "First Name" is Kierra in the table
        WebElement salaryOfKierra=driver.findElement(By.xpath("(//div[@class='rt-tr-group'])[3]//div[5]"));
        System.out.println("Kierra's salary is: "+salaryOfKierra.getText());


        //Create a method on the Page page, it will print the data for me
           // when I enter the number of rows and columns from the Test page.

        WebElementOfDataInTable(3,5);
        waitFor(1);

        ///Users/ayseyesiloglu/Desktop

    }

    public void WebElementOfDataInTable(int row, int column){

        String dinamikXpath="(//div[@class='rt-tr-group'])["+row+"]//div["+column+"]";
        System.out.println(dinamikXpath);
        WebElement istenenData= driver.findElement(By.xpath(dinamikXpath));
        System.out.println(istenenData.getText());

    }
}
