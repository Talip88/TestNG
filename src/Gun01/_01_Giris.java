package Gun01;

import org.testng.annotations.Test;

public class _01_Giris {

//    public static void main(String[] args) {
//        webSitesiniAc();
//        LoginIsleminiYap();
//        driveriKapat();
//    }
//
//    @Test Junit
//    public void Test1()
//    {
//        webSitesiniAc();
//        LoginIsleminiYap();
//        driveriKapat();
//    }

    // Eğer herhangi bir sıralama verilmezse metod isimlerinin alfabetik çalışıyor

    @Test(priority = 1)
    void webSitesiniAc(){
        System.out.println("driver tanımlandı ve web sitesi açıldı.");
    }

    @Test(priority = 2)
    void loginIsleminiYap(){
        System.out.println("login test işlemleri yapıldı");
    }

    @Test(priority = 3)
    void driveriKapat(){
        System.out.println("driver kapatıldı ve çıkıldı");
    }

}
