package Gun01;

import org.testng.Assert;
import org.testng.annotations.Test;

public class _05_Assertions {

    // Yeşil tik : test de hata yok
    // Sarı çarpi : test de hata var
    // Beyaz  : test çalıştırılmadı.skip

    @Test
    void EqualOrnek()
    {
        String s1="Merhaba";
        String s2="Merhaba1";
                        //Actual(oluşan), Expected(beklenen) , Mesaj(opsiyonel)
        Assert.assertEquals(s1,s2,"Karşılaştırma sonucu"); //hard assertion (testi kestiği için), soft assertion (test bitince hataları soyler)
        //Actual - Expected - Message ( A E M) sırasını alfabetik sıraya göre hatırlayabiliriz
    }

    @Test
    void NotEqualOrnek() {
        String s1="Merhaba";
        String s2="Merhaba1";

        Assert.assertNotEquals(s1,s2, "Karşılaştırma sonucu");
    }

    @Test
    void TrueOrnek() {
        int s1=55;
        int s2=66;

        Assert.assertTrue(s1==s2, "Karşılaştırma sonucu");
    }

    @Test
    void nullOrnek() {
        String s1=null;  // null

        Assert.assertNull(s1, "işlem sonucu");
    }

    @Test
    void direktFail() {
        int a=55;

        if (a==55)
           Assert.fail();
    }
}
