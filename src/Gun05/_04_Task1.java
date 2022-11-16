package Gun05;

import Utils.BaseDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.v105.database.Database;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.List;

public class _04_Task1 extends BaseDriver {

    /*Daha önceki derslerde yaptığımız Search fonksyonunu mac,ipod, samsung için DataProvider ile yapınız

     */


    @Test(dataProvider = "getData")
    void Search(String aranacakKelime)
    {
        WebElement searchBox=driver.findElement(By.name("search"));

        searchBox.clear();

        searchBox.sendKeys(aranacakKelime);

        WebElement searchButton=driver.findElement(By.cssSelector("button[class='btn btn-default btn-lg']"));
        searchButton.click();

        List<WebElement> captions=driver.findElements(By.cssSelector("div[class='caption']>h4"));

        for (WebElement e :captions)
            Assert.assertTrue(e.getText().toLowerCase().contains(aranacakKelime));

        }

    @DataProvider

    public Object[] getData() {

        Object[] data={"mac", "ipod", "samsung"};

        return data;
    }
}


