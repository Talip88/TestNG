package Gun03;

import Utils.BaseDriver;
import Utils.Tools;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import java.util.List;
   /*Senaryo;
           1- Siteyi açınız.
           2- Adress Ekleyiniz.
           3- En son adresi edit yaparak ad ve soyadı değiştirip kaydediniz.
           4- En son adresi siliniz.*/
//NOT
//ANİMASYON CLİCK E ENGEL OLDUĞU ZAMAN JAVASCRİPT CLİCK İLE CLİCK YAPABİLİRSİN.....

public class _0_AdressFunctionality extends BaseDriver {

    @Test ()
    void AddAdress()
    {
        WebElement adressBook=driver.findElement(By.linkText("Address Book"));
        adressBook.click();

        WebElement newAdress=driver.findElement(By.linkText("New Address"));
        newAdress.click();

        WebElement firstName=driver.findElement(By.id("input-firstname"));
        firstName.sendKeys("Talip");

        WebElement lastName=driver.findElement(By.id("input-lastname"));
        lastName.sendKeys("Çolak");

        WebElement company=driver.findElement(By.id("input-company"));
        company.sendKeys("Techno Study");

        WebElement address1=driver.findElement(By.id("input-address-1"));
        address1.sendKeys("Çarşamba");

        WebElement address2=driver.findElement(By.id("input-address-2"));
        address2.sendKeys("Kayseri");

        WebElement city=driver.findElement(By.id("input-city"));
        city.sendKeys("Samsun");

        WebElement postCode=driver.findElement(By.id("input-postcode"));
        postCode.sendKeys("12345");

        WebElement country=driver.findElement(By.id("input-country"));
        Select countrySelect= new Select(country);
        countrySelect.selectByVisibleText("Turkey");

        //selectByVisibleText ve selectValue implicitly wait ile ortak çalıştı görünene kadar bekletti//implicitly waiti kapatınca bulamadı.
        //Ancak selectByIndex implicitly wait ortak çalışmaz. index değişiyor stale oluyor yani bayatlıyor çünkü..

        WebElement option=driver.findElement(By.cssSelector("select[id='input-zone']>option"));
        wait.until(ExpectedConditions.stalenessOf(option));

        //BAYATLIK GİDENE KADAR BEKLE CONDİTİONU...stale element durumu düzelene kadar bekle..

        WebElement State=driver.findElement(By.id("input-zone"));
        Select StateSelect= new Select(State);

      // System.out.println(StateSelect.getOptions().size());
      // for (WebElement e:StateSelect.getOptions())
      //     System.out.println("e.getText()="+e.getText());
      //
      // StateSelect.selectByVisibleText("Adana");

        //YUKARIDA INCELEME YAPTIK...OPTIONLARIN DEĞİŞKENLİĞİNİ GÖRDÜK... NEDEN BEKLEME KOYMAMIZ LAZIM VE NEDEN INDEX İLE BULAMIYORUZU TEST ETTİK

        StateSelect.selectByIndex(6);

        //selectByVisibleText ve selectValue implicitly wait ile ortak çalıştı görünene kadar bekletti//implicitly waiti kapatınca bulamadı.
        //Ancak selectByIndex implicitly wait ortak çalışmaz. index değişiyor stale oluyor yani bayatlıyor çünkü..

        WebElement defadres=driver.findElement(By.cssSelector("label [name='default'][value='1']"));
        defadres.click();

        WebElement ctn=driver.findElement(By.cssSelector("input[type='submit']"));
        ctn.click();

        Tools.successMessageValidation();
    }


    @Test (dependsOnMethods = {"addAddress"})
    void editAddress()
    {
        WebElement addressBook=driver.findElement(By.linkText("Address Book"));
        addressBook.click();

        List<WebElement> editAll=driver.findElements(By.linkText("Edit"));
        WebElement sonEdit= editAll.get(editAll.size()-1); // son edit
        sonEdit.click();

        WebElement firsName=driver.findElement(By.id("input-firstname"));
        firsName.clear();
        firsName.sendKeys("Mehmet");

        WebElement lastname=driver.findElement(By.id("input-lastname"));
        lastname.clear();
        lastname.sendKeys("Yılmaz");

        WebElement ctn=driver.findElement(By.cssSelector("input[type='submit']"));
        ctn.click();

        Tools.successMessageValidation();
    }

    @Test(dependsOnMethods = {"editAddress"})
    void deleteAddress()
    {
        WebElement addressBook=driver.findElement(By.linkText("Address Book"));
        addressBook.click();

        List<WebElement> deleteAll=driver.findElements(By.linkText("Delete"));
        WebElement silinebilirAdres= deleteAll.get(deleteAll.size()-2); // son edit

        silinebilirAdres.click();
        Tools.successMessageValidation();
    }

}
