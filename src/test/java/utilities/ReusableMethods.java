package utilities;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.*;

import java.io.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

import static utilities.TestBase.driver;

public class ReusableMethods {
    /*
    driver için WebDriver driver diye class içinde diğer methodların dışında oluşturduğum zaman driver null oluyor
    ama class'a import ettiğim zaman çalışıyor
     */

    public static void waitFor(int second) {

        try {
            Thread.sleep(second * 1000);
        } catch (InterruptedException e) {

        }
    }

    public static void getValueOfExcelFileUsingRowAndCell(int row, int cell) {

        String filePath = "src/test/java/day12_Table_Excel/countries.xlsx";
        Workbook workbook = null;
        try {//exception yerine try/cath() metodu kullandık
            FileInputStream fis = new FileInputStream(filePath);
            workbook = WorkbookFactory.create(fis);
        } catch (IOException e) {

        }
        System.out.println(workbook.getSheet("Sayfa1").getRow(row).getCell(cell));

    }

    public static void fullPageScreenShot(WebDriver driver) {

        TakesScreenshot tss = (TakesScreenshot) driver;
        LocalDateTime ldt = LocalDateTime.now();
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyyMMddHHmmss");
        String date = ldt.format(dtf);

        String filePath = "target/ScreenShouts/FullPageSS" + date + ".jpeg";
        File FullPageSS = new File(filePath);

        //"target/ScreenShouts/FullPageSS.jpeg"
        // target'ın altında ScreenShouts Page'inde FullPageSS.jpeg class adıyla kaydediyorum

        File temFile = tss.getScreenshotAs(OutputType.FILE);//screenshot'ı burda dosyaya cevirdim

        try {
            FileUtils.copyFile(temFile, FullPageSS);
        } catch (IOException e) {

        }

    }

    public static void getSSofElement(WebElement result) {

        LocalDateTime ldt = LocalDateTime.now();
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyyMMddHHmmss");
        String date = ldt.format(dtf);

        String filePath = "target/SSofDesired Element/SsDesiredElement" + date + ".jpeg";
        File elementSS = new File(filePath);
        File tempFile = result.getScreenshotAs(OutputType.FILE);
        try {
            FileUtils.copyFile(tempFile, elementSS);
        } catch (IOException e) {

        }

    }

    public static void setStrValueOfExcelFile(String SayfaNo, int row, int column, String str) {

        String filePath = "src/test/java/day12_Table_Excel/countries.xlsx";
        Workbook workbook = null;
        try {
            FileInputStream fis = new FileInputStream(filePath);
            workbook = WorkbookFactory.create(fis);
        } catch (IOException e) {

        }
        workbook.getSheet(SayfaNo).getRow(row).createCell(column).setCellValue(str);
        try {
            FileOutputStream fos = new FileOutputStream(filePath);
            workbook.write(fos);
        } catch (IOException e) {

        }

    }

    public static void deleteCellDataInExcel(String sayfaNo, int row, int column) {

        String filePath = "src/test/java/day12_Table_Excel/countries.xlsx";
        Workbook workbook = null;
        try {
            FileInputStream fis = new FileInputStream(filePath);
            workbook = WorkbookFactory.create(fis);
        } catch (IOException e) {

        }
        workbook.getSheet(sayfaNo).getRow(row).createCell(column).removeCellComment();
        try {
            FileOutputStream fos = new FileOutputStream(filePath);
            workbook.write(fos);
        } catch (IOException e) {

        }

    }

    public static void setIntValueOfExcelFile(String SayfaNo, int row, int column, int number) {

        String filePath = "src/test/java/day12_Table_Excel/countries.xlsx";
        Workbook workbook = null;
        try {
            FileInputStream fis = new FileInputStream(filePath);
            workbook = WorkbookFactory.create(fis);
        } catch (IOException e) {

        }
        workbook.getSheet(SayfaNo).getRow(row).createCell(column).setCellValue(number);
        try {
            FileOutputStream fos = new FileOutputStream(filePath);
            workbook.write(fos);
        } catch (IOException e) {

        }
    }
    public static Object getHeaderText(int index){//Object dememizin sebebi string int hepsini kapsadığı için
        List<WebElement> headTextList=driver.findElements(By.xpath("//div[@class='rt-resizable-header-content']"));
        return headTextList.get(index).getText();
    }


}