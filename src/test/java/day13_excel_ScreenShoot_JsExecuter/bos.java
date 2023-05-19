package day13_excel_ScreenShoot_JsExecuter;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.TestBase;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.*;

public class bos extends TestBase {

  @Test
    public void test01(){

      driver.get("https://demoqa.com/webtables");
      WebElement tableBody = driver.findElement(By.xpath("//div[@class='rt-tbody']"));
      List<WebElement> actualRows = tableBody.findElements(By.xpath("//div[@class='rt-tr-group']"));
      for (int i = 0; i < actualRows.size(); i++) {

          for (int j = 0; j <6 ; j++) {

              List<WebElement> actualCell = actualRows.get(j).findElements(By.xpath("//div[@class='rt-td']"));
              System.out.println(actualCell.get(j).getText());

              //   String cellFirstName = actualCell.get(0).getText();
         //   String cellLastName = actualCell.get(1).getText();
         //   String cellAge = actualCell.get(2).getText();
         //   String cellEmail = actualCell.get(3).getText();
         //   String cellSalary = actualCell.get(4).getText();
         //   String cellDepartment = actualCell.get(5).getText();

         //   System.out.println(actualCell);

           //  String firstName="";
           //  String lastName="";
           //  String age="";
           //  String email="";
           //  String salary="";
           //  String department="";

           //  List<String>expectedCell=new ArrayList<>();
           //  expectedCell.add(firstName);
           //  expectedCell.add(lastName);
           //  expectedCell.add(age);
           //  expectedCell.add(email);
           //  expectedCell.add(salary);
           //  expectedCell.add(department);
              //  System.out.println(expectedCell);
          //  Assert.assertEquals(expectedCell.get(0), cellFirstName);
          //  Assert.assertEquals(expectedCell.get(1), cellLastName);
          //  Assert.assertEquals(expectedCell.get(2), cellAge);
          //  Assert.assertEquals(expectedCell.get(3), cellEmail);
          //  Assert.assertEquals(expectedCell.get(4), cellSalary);
          //  Assert.assertEquals(expectedCell.get(5), cellDepartment);


          //  List<List<String>> actualDatasInTable = new ArrayList<>();
          //  // 1. satır verileri
          //  actualDatasInTable.add(Arrays.asList("Input Data 1","Input Data 2" ,"Input Data 3" ,"Input Data 4" ,"Input Data 5" ,"Input Data 6" ));
          //  // 2. satır verileri
          //  actualDatasInTable.add(Arrays.asList("Input Data 7", "Input Data 8", "Input Data 9", "Input Data 10", "Input Data 11", "Input Data 12"));
          //  // 3. satır verileri
          //  actualDatasInTable.add(Arrays.asList("Input Data 13", "Input Data 14", "Input Data 15", "Input Data 16", "Input Data 17", "Input Data 18"));




          }
      }
  }

}
