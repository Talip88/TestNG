package Gun07;

import Utils.BaseDriver;
import Utils.BaseDriverParameter;
import Utils.Tools;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class _01_WishList  extends BaseDriverParameter {

    /*
    Senaryo ;
    1- Siteye gidiniz..

   1.Test;
   2- "ipod" ürününü aratınız."ipod" u xml den gönderiniz
   3- çıkan elamnlardan random bir elelamnı Add Wish butonuna tıklayınız.
   4- Daha sonra WishList e tıklatınız
   5- Burada çıkan ürünle tıklanan ürünün isminin aynı olup olmadığını doğrulayınız.

 */
        @Test
        @Parameters("searchText")
        void Search(String arananKelime) {

        WebElement searchBox = driver.findElement(By.name("search"));

        searchBox.sendKeys(arananKelime);

        WebElement searchButton = driver.findElement(By.cssSelector("button[class='btn btn-default btn-lg']"));

        searchButton.click();

        List<WebElement> searchResult=driver.findElements(By.xpath("//div[@id='content']/div/div//h4"));
        int randomSecim=Tools.randomGenerator(searchResult.size());


        String wishItemText=searchResult.get(randomSecim).getText();

        List<WebElement>wishList=driver.findElements(By.xpath("//button[@data-original-title='Add to Wish List']"));
        wishList.get(randomSecim).click();

        WebElement btnWishList=driver.findElement(By.id("wishlist-total"));
        btnWishList.click();

        List<WebElement>wishTableNames=driver.findElements(By.cssSelector("td[class='text-left']>a"));

        Tools.listContainsString(wishTableNames,wishItemText);




            }



    }