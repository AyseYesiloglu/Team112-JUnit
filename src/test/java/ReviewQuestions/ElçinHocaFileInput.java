package ReviewQuestions;

import org.junit.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ElçinHocaFileInput {
    @Test
    public void test01() throws FileNotFoundException {
        String filePath = "\"C:\\Users\\serka\\Desktop\\JAVA Doc\\Arayde en uzun ve kisa kelimeyi bulma.rtf\"";  // the path is not dynamic and it will only work in this computer
        // because as you can see, user name is maden and it comes from my computer.
        FileInputStream fis = new FileInputStream(filePath);
        // to create a dynamic path :
        System.out.println(System.getProperty("user.dir"));
        //C:\Users\Maden\IdeaProjects\com.Team112JUnit
        // if we want to use full project path
        System.out.println(System.getProperty("user.home"));
        // C:\Users\Maden
        // to create a dynamic path we can getProperty from the system. By using this changing part, I will create a dynamic
        // path which will work in all computers
        // C:\Users\Maden
        String dynamicPath = System.getProperty("user.home")+"\\Desktop\\JAVA Doc\\Arayde en uzun ve kisa kelimeyi bulma.rtf\"";
        FileInputStream fis2 = new FileInputStream(dynamicPath);
    }
}
