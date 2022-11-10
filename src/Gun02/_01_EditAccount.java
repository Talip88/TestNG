package Gun02;

import Utils.BaseDriver;
import Utils.Tools;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
/*
  Senaryo
  1- Siteyi açınız.
  2- Edit Account sayfasına ulaşınız.
  3- Ad ve soyadı değiştirip tekrar kaydedidiniz.
 */
public class _01_EditAccount extends BaseDriver {

    By editAccount=By.linkText("Edit Account");
    By firstName=By.id("input-firstname");
    By lastName=By.id("input-lastname");

    By submitButton=By.cssSelector("input[type='submit']");


    @Test
    void editAccount()
    {
        editAccountTest("Müslüm","Gürses");
        Tools.Bekle(2);
        editAccountTest("Talip", "Çolak");

    }


    void editAccountTest(String ad, String soyad)
    {
        WebElement edit=driver.findElement(editAccount);
        edit.click();

        WebElement txtFirstName=driver.findElement(firstName);
        txtFirstName.clear();
        txtFirstName.sendKeys(ad);

        WebElement txtLastName=driver.findElement(lastName);
        txtLastName.clear();
        txtLastName.sendKeys(soyad);

        WebElement btnSubmitButton=driver.findElement(submitButton);
        btnSubmitButton.click();

        Tools.successMessageValidation();

    }

}
