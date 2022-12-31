package Utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.List;
import java.util.Random;

public class Tools {

    public static void Bekle(int saniye){
        try {
            Thread.sleep(saniye*1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public static void successMessageValidation()

    {

        WebElement msgLabel=BaseDriver.driver.findElement(By.cssSelector("div[class='alert alert-success alert-dismissible'"));

        Assert.assertTrue(msgLabel.getText().toLowerCase().contains("success"));
    }


    public static int randomGenerator(int max)

    {
       return (int) (Math.random()*max);

    }




    public static void listContainsString(List<WebElement> list, String aranacakKelime)

    {
        boolean bulundu=false;

        for (WebElement e: list)

        {
            if (e.getText().equalsIgnoreCase(aranacakKelime)){
                bulundu=true;
                break;
            }
        }
            if(!bulundu)
            Assert.fail("Aranan text bulunamadı");

    }


}
