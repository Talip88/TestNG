package Gun05;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class _06_SoftAssertVSHardAssert {
    @Test
    void hardAssert()
    {
        String s1="Merhaba";

        System.out.println("Hard Assert Kontrol Öncesi");

        Assert.assertEquals("Merhaba123",s1,"HardAssert Sonucu");

        System.out.println("Hard Assert Kontrol Sonrası");
    }

    @Test
    void softAssert(){
        String strHomePage="www.facebook.com/homepage";
        String strCartPage="www.facebook.com/cartpage";
        String strEditAccount="www.facebook.com/editaccountpage";

        SoftAssert _softAssert=new SoftAssert();
        _softAssert.assertEquals("www.facebook.com/homepage",strHomePage);  //true
        System.out.println("assert 1");


        _softAssert.assertEquals("www.facebook.com/profile",strCartPage); // false
        System.out.println("assert 2");

        _softAssert.assertEquals("www.facebook.com/settings",strEditAccount); //false
        System.out.println("assert 3");

        //Hata oldu program kesilmedi ama hataları da görmek istiyorsam şunu derim

        _softAssert.assertAll(); //bütün assert sonuçlarını işleme koy demek.... Hata olduğunda işlemi kesmez ama all ile en sonda hepsini verir.

        System.out.println("Aktiflik Sonrası");// bu bölüm assertALl sonrası olduğu için yazılamadı


    }

}
