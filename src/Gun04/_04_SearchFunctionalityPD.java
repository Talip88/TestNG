package Gun04;

import Utils.BaseDriverParameter;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.util.List;

public class _04_SearchFunctionalityPD extends BaseDriverParameter {



    @Parameters("aranacakKelime")
    @Test()
    void Search(String aranacakKelime)
    {
        WebElement searchBox=driver.findElement(By.name("search"));
        searchBox.sendKeys(aranacakKelime);

        WebElement searchButton=driver.findElement(By.cssSelector("button[class='btn btn-default btn-lg']"));
        searchButton.click();

        List<WebElement> captions=driver.findElements(By.cssSelector("div[class='caption']>h4"));

        for (WebElement e :captions) {
            Assert.assertTrue(e.getText().toLowerCase().contains(aranacakKelime));

        }

    }
}

