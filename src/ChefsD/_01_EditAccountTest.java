package ChefsD;

import Utils.BaseDriverChef;
import Utils.Tools;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class _01_EditAccountTest extends BaseDriverChef {

    By editAccount=By.xpath("//b[normalize-space()='My Account']");


    @Test
    void editAccountTest(String ad, String soyad)
    {
        WebElement edit=driver.findElement(editAccount);
        edit.click();




    }

}
