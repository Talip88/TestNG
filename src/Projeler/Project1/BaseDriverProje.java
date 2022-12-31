package Projeler.Project1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.time.Duration;
import java.util.logging.Level;
import java.util.logging.Logger;

public class BaseDriverProje {

    public static WebDriver driver;
    public static WebDriverWait wait;
    @BeforeClass
    public void start(){

        Logger logger=Logger.getLogger("");//Butun log lara ulastim ("") hepsi demek
        logger.setLevel(Level.SEVERE);//Sadece error lari goster komutu

        //ChromeService sessiz modda calisir
        System.setProperty(ChromeDriverService.CHROME_DRIVER_SILENT_OUTPUT_PROPERTY,"true");
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();

        Duration dr=Duration.ofSeconds(30);
        driver.manage().timeouts().pageLoadTimeout(dr);//Sadece tum sayfanin
        //kodlarinin pc ye inme suresiyle ilgili
        //time out eklenmezse Selenium sayfa yuklenene kadar bekler (sonsuza kadar) 30 snye suresince
        //sayfanin yuklenmesini bekler , eger yuklenmezse hata verir. koymazsan sonsuza kadar bekler
        //eger 2 saniyede yuklerse 30 saniye beklemez

        driver.manage().timeouts().implicitlyWait(dr);
        //Butun webelementlerin element bazinda ,elemente ozel islem yapilmadan once hazir hale
        //gelmesi icin verilen sure.Ayni sekilde 30 saniye beklemez verilen sure muhlettir
        //30 saniye icinde acilmazsa kapat gibi dusunebiliriz

        wait =new WebDriverWait(driver,Duration.ofSeconds(10));

        loginTest();
    }

    void loginTest(){
        Pom elements=new Pom();
        driver.get("https://demo.nopcommerce.com/login?returnUrl=%2F");
        elements.email.sendKeys("group2_3@technoStudy.com");
        elements.password.sendKeys("TestingProject4");
        elements.logInButton.click();




    }



    @AfterClass
    public  void finish(){


        driver.quit();
    }

}
