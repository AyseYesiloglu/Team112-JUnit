package day05_JUnitFrameWork;

import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

public class C01_ByeByeMainMethod {
    @Before
    public void setUp(){
        System.out.println("SetUp method is executed");
    }
    @After
    public  void tearDown(){
        System.out.println("TearDown method is executed");
    }

    @Test
    public void test01(){
        //Thanks to the @Test annotation a method can be executed
        //if there is no assert (if we haven't test anything) it will always pass
        //
        System.out.println("Test01 is executed");
    }
    @Test @Ignore
    public void test02(){
        System.out.println("Test02 is executed");
    }
    @Test
    public void test03(){
        System.out.println("Test03 is executed");
    }
}
