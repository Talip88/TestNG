package Projeler.Proje1.Case7;

import Projeler.Project1.BaseDriverProje;
import Projeler.Project1.Pom;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Case7 extends BaseDriverProje {

    @Test
    @Parameters("aracanakKelime")
    void Case7(String aracanakKelime) {
        Pom elements = new Pom();
        elements.SearchButton.sendKeys(aracanakKelime + Keys.ENTER);
        Actions action=new Actions(driver);
        action.scrollByAmount(0,500).perform();  //JAVA ILE SCROLL
        wait.until(ExpectedConditions.visibilityOf(elements.Adobe));
        Assert.assertEquals(elements.ProductTitle.getText(), aracanakKelime);


    }
}
