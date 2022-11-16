package Gun05;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class _01_DataProvider {


    @Test (dataProvider = "getData") //benim data sağlayıcım get data fonksyonudur.
    void searchTest1(String searchText)
    {
        System.out.println("searchText="+searchText);

    }

    @DataProvider //bir teste sürekli veri gönderme testi oluyor...bu metoda teste data provide ediyor

    public Object[] getData(){ //void yazamayız dönüş tipi olacak çünkü public yazsan da olur yazmasan da o erişimle ilgili...

       Object[] data={"Mac", "Samsung", "Huawei", "Iphone", "pc", "Xaomi"};

       return data;

    }




//**************2.YONTEM*** DATAPROVİDERA İSİM VERİP, AYNI İSMİ TEST YANINA YAZARAK EŞLEME*********************************************************************************************


    @Test (dataProvider = "aranacaklar")
    void searchTest2(String searchText)
    {
        System.out.println("searchText="+searchText);

    }

    @DataProvider (name = "aranacaklar")  //dataprovidera isim verilip Test içindekine de aynı isimle aratabiliriz.

    public Object[] getData2(){ //void yazamayız dönüş tipi olacak çünkü public yazsan da olur yazmasan da o erişimle ilgili...

        Object[] data={"Mac", "Samsung", "Huawei", "Iphone", "pc", "Xaomi"};

        return data;


        }
}




