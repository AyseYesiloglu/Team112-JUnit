package day13_repeat;

import org.junit.Test;
import utilities.ReusableMethods;

public class C02_WriteDeleteDataInExcel {

    @Test

    public void test01(){

        ReusableMethods.deleteCellDataInExcel("Sayfa1",1,4);
    }
}
