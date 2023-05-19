package day06_annotation_assertions;

import org.junit.Assert;
import org.junit.Test;

public class C03_Assertion {


    //test retirement
    int p1Age=66;
    int p2Age=70;
    int p3Age=77;

    //retirement age is 70;
    @Test
    public void test01(){
        //retirement age is 70;
        //test that third person retire

       // if(p3Age>70){
       //     System.out.println("Test PASSED");
       // }else {
       //     System.out.println("Test FAİLED");
        // }
        Assert.assertTrue(p3Age>70);


    }
    @Test
    public void test02(){
        //retirement age is 70;
        //test that first person can retire

        Assert.assertFalse(p1Age>70);

    }
    @Test
    public void test03(){

        Assert.assertEquals(14,14);
        Assert.assertNotEquals(14,5);
    }
}
