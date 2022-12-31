package Gun06;

import Utils.BaseDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class _01_PlaceOrder extends BaseDriver {


    /*
   Senaryo :
   1- Siteyi açınız.
   2- Sitede "ipod" kelimesini aratınız
   3- Çıkan sonuçlardan ilkini sepete atınız.
   4- Shopping Chart a tıklatınız.
   5- Checkout yapınız.
   6- Continue butonalarına tıklatıp bilgileri giriniz.
   7- En confirm ile siparişi verdiğinizi doğrulayınız.
      doğrulamayı çıkan sayfadaki "Your order has been placed" yazısı ile yapınız.
*/

    @Test
    void Search() {
        WebElement searchBox = driver.findElement(By.name("search"));

        searchBox.sendKeys("ipod");

        WebElement searchButton = driver.findElement(By.cssSelector("button[class='btn btn-default btn-lg']"));
        searchButton.click();

        WebElement AddToCart = driver.findElement(By.xpath("//span[text()='Add to Cart']"));
        AddToCart.click();

        WebElement shoppingCart = driver.findElement(By.linkText("Shopping Cart"));
        shoppingCart.click();

        WebElement checkOut = driver.findElement(By.linkText("Checkout"));
        checkOut.click();

        //Burada sayfa geçişlerinden kaynaklı bekletme yapmamız gerekir. Biraz beklememiz lazım. clickable olana kadar beklememiz lazım

        WebElement cont1=wait.until(ExpectedConditions.elementToBeClickable(By.id("button-payment-address")));
        cont1.click();

        WebElement cont2=wait.until(ExpectedConditions.elementToBeClickable(By.id("button-shipping-address")));
        cont2.click();

        WebElement cont3=wait.until(ExpectedConditions.elementToBeClickable(By.id("button-shipping-method")));
        cont3.click();

        WebElement agree=driver.findElement(By.name("agree"));
        agree.click();

        WebElement cont4=wait.until(ExpectedConditions.elementToBeClickable(By.id("button-payment-method")));
        cont4.click();

        WebElement confirm=driver.findElement(By.id("button-confirm"));
        confirm.click();

        wait.until(ExpectedConditions.urlContains("success")); // url yi bekletmeden sadece elementin görünmesini bekle dersen farklı url leri verebilir...
                                                                        // sayfa da değiştiği için hata verir. Bunu kontrol etmek önemli
            //GENEL KRİTER İLK ÖNCE URL YE BAK SONRA ELEMENTİN DURUMUNU KONTROL ET

        WebElement h1=driver.findElement(By.cssSelector("[id='content']>h1"));
        //text to be de yapılabilir. işi sağlama almak için.....her siteye özel durumlar oluşabilir.... locatorun değişmesi en sağlam durum
        Assert.assertEquals(h1.getText(),"Your order has been placed!","Onay texti bulunamadı");


    }
}
