package Gun04;

import Utils.BaseDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class _02_ContactUs  extends BaseDriver{
/*
  1- ContactUs a tıklayınız
  2- Mesaj kutusuna en az 10 karakterlik bir mesaj yazınız.
  3- Submit ettikten sonra Contact US yazısını doğrulayınız.
 */




    @Test()
    @Parameters("mesaj") //XML deki parametre ile bağlantısı kuruluyor.
    void contactUs(String gelenMesaj){  // xml deki parametreyi tanıması için

        //bunun amacı aynı yere ayrı ayrı mesajları gönderebilmek

        WebElement contacUs=driver.findElement(By.linkText("Contact Us"));
        contacUs.click();

        WebElement enquiryArea=driver.findElement(By.id("input-enquiry"));
        enquiryArea.sendKeys(gelenMesaj);
        // xml deki parametre ile buraya veri giriliyor


        WebElement submitButton=driver.findElement(By.cssSelector("[type='submit']"));
        submitButton.click();

        Assert.assertTrue(driver.getCurrentUrl().contains("success"));
        // ya da ContactUs yazısını da get text ile alabilirsin


    }
}
