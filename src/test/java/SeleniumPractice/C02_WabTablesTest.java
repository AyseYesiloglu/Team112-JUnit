package SeleniumPractice;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.TestBase;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static utilities.ReusableMethods.waitFor;

public class C02_WabTablesTest extends TestBase {
    @Test
    public void headerTextVerificationTest(){
        // Step 1 : Navigate to the URL "https://demoqa.com/webtables".
        driver.get("https://demoqa.com/webtables");
        // Step 2 : Wait for the page to load.
        waitFor(2);
        // Step 3 : Assert that the header text at index 0 is equal to "First Name".
   //    Assert.assertEquals("First Name", getHeadersText(0));
   //    // Step 4 : Assert that the header text at index 1 is equal to "Last Name".
   //    Assert.assertEquals("Last Name", getHeadersText(1));
   //    // Step 5 : Assert that the header text at index 2 is equal to "Age".
   //    Assert.assertEquals("Age", getHeadersText(2));
   //    // Step 6 : Assert that the header text at index 3 is equal to "Email".
   //    Assert.assertEquals("Email", getHeadersText(3));
   //    // Step 7 : Assert that the header text at index 4 is equal to "Salary".
   //    Assert.assertEquals("Salary", getHeadersText(4));
   //    // Step 8 : Assert that the header text at index 5 is equal to "Department".
   //    Assert.assertEquals("Department", getHeadersText(5));
   //    // Step 9 : Assert that the header text at index 6 is equal to "Action".
   //    Assert.assertEquals("Action", getHeadersText(6));

    }



        /*
        TC02: Verify data
        Step 1 : Navigate to the URL "https://demoqa.com/webtables".
        Step 2: Verify data for Cierra Vega
        Step 3: Verify data for Alden Cantrell
        Step 4: Verify data for Kierra Gentry
         */


    @Test
    public void verifyEmployeeFirstRowData(){
        // Step 1 : Navigate to the URL "https://demoqa.com/webtables".
        driver.get("https://demoqa.com/webtables");
        //  Step 2: Verify data for Cierra Vega
        verifyEmployeeDataText("Alden","Cantrell","45","alden@example.com","12000","Compliance");
//Expected :Alden
//Actual   :Cierra

        //  Step 3: Verify data for Alden Cantrell
        //  verifyEmployeeDataText("Alden","Cantrell","45","alden@example.com","12000","Compliance") ;

        //  Step 4: Verify data for Kierra Gentry
        //  verifyEmployeeDataText("Kierra","Gentry","29","kierra@example.com","2000","Legal") ;

    }
    @Test
    public void verifyEmployeeDataSecondRow(){
        // Step 1 : Navigate to the URL "https://demoqa.com/webtables".
        driver.get("https://demoqa.com/webtables");
        //  Step 3: Verify data for Alden Cantrell
        verifyEmployeeDataText("Cierra","Vega","39","cierra@example.com","10000","Insurance") ;

        //  Step 4: Verify data for Kierra Gentry
        //  verifyEmployeeDataText("Kierra","Gentry","29","kierra@example.com","2000","Legal") ;

    }




    public static void verifyEmployeeDataText(String firstName, String lastName, String age, String email, String salary,
                                              String department) {


        WebElement tableBody = driver.findElement(By.xpath("//div[@class='rt-tbody']"));
        List<WebElement> actualRows = tableBody.findElements(By.xpath("//div[@class='rt-tr-group']"));
        for (int i = 0; i < actualRows.size(); i++) {

            for (int j = 0; j <6 ; j++) {

                List<WebElement> actualCell = actualRows.get(j).findElements(By.xpath("//div[@class='rt-td']"));

                String cellFirstName = actualCell.get(0).getText();
                String cellLastName = actualCell.get(1).getText();
                String cellAge = actualCell.get(2).getText();
                String cellEmail = actualCell.get(3).getText();
                String cellSalary = actualCell.get(4).getText();
                String cellDepartment = actualCell.get(5).getText();

                List<String>expectedCell=new ArrayList<>();
                expectedCell.add(firstName);
                expectedCell.add(lastName);
                expectedCell.add(age);
                expectedCell.add(email);
                expectedCell.add(salary);
                expectedCell.add(department);
                Assert.assertEquals(expectedCell.get(0), cellFirstName);
                Assert.assertEquals(expectedCell.get(1), cellLastName);
                Assert.assertEquals(expectedCell.get(2), cellAge);
                Assert.assertEquals(expectedCell.get(3), cellEmail);
                Assert.assertEquals(expectedCell.get(4), cellSalary);
                Assert.assertEquals(expectedCell.get(5), cellDepartment);


                List<List<String>> actualDatasInTable = new ArrayList<>();
                // 1. satır verileri
                actualDatasInTable.add(Arrays.asList("Input Data 1","Input Data 2" ,"Input Data 3" ,"Input Data 4" ,"Input Data 5" ,"Input Data 6" ));
                // 2. satır verileri
                actualDatasInTable.add(Arrays.asList("Input Data 7", "Input Data 8", "Input Data 9", "Input Data 10", "Input Data 11", "Input Data 12"));
                // 3. satır verileri
                actualDatasInTable.add(Arrays.asList("Input Data 13", "Input Data 14", "Input Data 15", "Input Data 16", "Input Data 17", "Input Data 18"));




            }
        }




    }
}




