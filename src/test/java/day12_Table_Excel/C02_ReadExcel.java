package day12_Table_Excel;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.*;
import org.junit.Test;
import utilities.TestBase;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class C02_ReadExcel {
    @Test
    public void test01() throws IOException {
        /*
        Java excel dosyanın aslını değil de kopyasını kullanılır.
         */

        String filePath="src/test/java/day12_Table_Excel/countries.xlsx";
        FileInputStream fis=new FileInputStream(filePath);

        //we will create a copy of the file to work on

        Workbook workbook= WorkbookFactory.create(fis);

        //now
        Sheet sheet= workbook.getSheet("Sayfa1");

        Row row=sheet.getRow(5);
        //excell'de index kullanıldığı için 0'dan başladığına dikkat et

        Cell cell=row.getCell(2);
        System.out.println(cell);


    }

}
