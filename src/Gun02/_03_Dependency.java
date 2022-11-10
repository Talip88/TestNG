package Gun02;

import org.testng.annotations.Test;

public class _03_Dependency {

    //arabanın hareketleri: start, drive, park,stop hareket sırası--SMOKE TEST
    // start hatasız çalışırsa çalış diyeceğim diger adımlara, ilk adım hatalı olsa da.
    // diğer testler çalışıyor bunun anlamı yok bağlı işlemlerde
    //@Test(dependsOnMethods = {"startCar"}) / şeklinde yazıyoruz

    // tek testi çalışıtracağımız zaman ise kendisinden önceki 2 taneye kadar da çalıştırır. Ancak 3 ten fazlasını çalıştırmaz.
    // aynı seviyedeki testleri için priority verilebilir.
    // bağımlı testler, direk metodundan çalıştırdığınızda bağımlı olduğu metod zincirinde 2 üste kadar ototmatik çağırıp çalışabilir.


    @Test
    void startCar()
    {
        System.out.println("startCar");
        //Assert.fail();
    }

    @Test(dependsOnMethods = {"startCar"}) //bu testin çalışması startCar'ın hatasız çalışmasına bağlıdır.
    void driveCar()

    {
        System.out.println("driveCar");
    }
    @Test(dependsOnMethods = {"startCar", "driveCar"})
    void parkCar()
    {
        System.out.println("parkCar");
    }

    @Test(dependsOnMethods = {"parkCar"}, alwaysRun = true) //bağımlılıkları var ama hata çıksa da çalışsın demek.....

    void stopCar()

    {
        System.out.println("stopCar");
    }


}
