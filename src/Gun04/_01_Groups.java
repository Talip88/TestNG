package Gun04;

import org.testng.annotations.Test;

public class _01_Groups {

    @Test(groups="SmokeTest") // //@Test(groups="SmokeTest", "Regression") diye yazılır

        // hem smoke da hem regression da olması gerekseydı nasıl yazılır? sorusunun cevabı yukarıda

    void Test1(){System.out.println("Test1 SmokeTest");}

    @Test(groups = "Regression")
    void Test3(){
        System.out.println("Test3 Regression");
    }

    @Test(groups = "Regression")
        void Test5(){System.out.println("Test5 Regression");
    }
    @Test(groups="Regression")
        void Test2(){
        System.out.println("Test2 Regression");
    }
    @Test(groups="SmokeTest")
    void Test4(){
        System.out.println("Test4 SmokeTest");
    }

    @Test(groups="SmokeTest")
    void Test6(){
        System.out.println("Test6 SmokeTest");
    }

    @Test
    void Test7(){
        System.out.println("Test7 ");
    }








}
