package day13_excel_ScreenShoot_JsExecuter;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.junit.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class C03_WriteExcel {

    @Test
    public void test01() throws IOException {

        //dosyayla çalışacağım için class'ı extend etmeme gerek yok
        /*
        If you want to write something to an excel file, be sure that it is CLOSED, otherwise process may damage your
        excel file
         */
        // to write something to an excel file first we need to create a workbook
        //Workbook class'ı office dosyaları üzerinde çalışma yapabilmek için
        //Kullanacağımız dosya eğer proje içerisine koymuşsak dosya yolununu "copy path content root" ile yapabiliriz.
        //Eğer dosya bilgisayarımızdaysa
        // String dinamikDosyaYolu=System.getProperty("user.home")+"/Desktop/HelloJava.docx"; ==> şeklinde tanımlıyoruz.

        String filePath = "src/test/java/day12_Table_Excel/countries.xlsx";
        FileInputStream fis = new FileInputStream(filePath);

        //yazdırmak için create() ve setCellValue() methodlarını kullanıyoruz.

        Workbook workbook = WorkbookFactory.create(fis);
        // created a copy of the excel file-->SADECE COPY ÜZERİNDE
        workbook.getSheet("Sayfa1").getRow(0).createCell(3).setCellValue("Products");

        // when we make a change in workbook, actually we are changing something in the copy of the original file
        workbook.getSheet("Sayfa1").getRow(4).createCell(4).setCellValue("Apple");
        workbook.getSheet("Sayfa1").getRow(5).createCell(4).setCellValue("Windows");
        workbook.getSheet("Sayfa1").getRow(7).createCell(4).setCellValue("Java");
        workbook.getSheet("Sayfa1").getRow(7).createCell(4).removeCellComment();
        // changed a lot of cells in this copy
        // to save the copy file to ORIGINAL one
        // now we will take something out of the project so we will use FileOutputStream
        FileOutputStream fos = new FileOutputStream(filePath);
        // to write all changes to the original file, workbook.write
        // so we will save this copy to the original file.
        workbook.write(fos);
    }
}
