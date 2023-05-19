package day13_repeat;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.junit.Test;
import utilities.ReusableMethods;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class C01_WriteExcel {



    @Test
    public void WriteExcel()  {


        ReusableMethods.setStrValueOfExcelFile("Sayfa1",1,4,"Population");
        ReusableMethods.setIntValueOfExcelFile("Sayfa1",2,4,150000);
        ReusableMethods.setIntValueOfExcelFile("Sayfa1",3,4,100000);
        ReusableMethods.setIntValueOfExcelFile("Sayfa1",4,4,500000);
        ReusableMethods.setIntValueOfExcelFile("Sayfa1",5,4,200000);



    }
}
