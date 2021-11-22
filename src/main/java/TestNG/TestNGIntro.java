package TestNG;

import org.testng.annotations.Test;

public class TestNGIntro {

    @Test(priority = 3)
    public void test1() {
        System.out.println("test1");
    }
 // you can use priority to prioritize order
    @Test(priority = 2)
    public void test2(){
        System.out.println("test2");
    }
  // acsending order, and it is not affect to each other
    @Test(priority = 1)
    public void test3(){
        System.out.println("test3");
    }


}
