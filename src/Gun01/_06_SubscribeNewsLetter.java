package Gun01;

/*
  Senaryo
  1- Siteyi açınız.
  2- Newsletter  Subscribe işlemini abone olunuz(YES)
  3-Abonelikten çıkınız
  4-Subscribe (Abonelik durumunu kontrol ediniz. YES ise NO , No ise YES yapınız.
 */


import Utils.BaseDriver;
import Utils.Tools;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class _06_SubscribeNewsLetter extends BaseDriver {

    //LOCATORLARA DEĞER ATAYARAK CLEAN CODE YAZIYORUZ.

    // LOCATORLAR İLERİDE DEĞİŞTİĞİNDE SADECE BURASI DEĞİŞECEK... TEK TEK DEĞİŞTİRMEKLE UGRASMICAKSIN...................


    By link=By.linkText("Newsletter");

    By yes=By.cssSelector("[type='radio'][value='1']");

    By no=By.cssSelector("[type='radio'][value='0']");

    By cont=By.cssSelector("[value='Continue']");



    @Test(priority =1 )
    void subscribeFunctionYes()
    {
        WebElement newsLetterLink=driver.findElement(link);
        newsLetterLink.click();

        WebElement subscribeYes=driver.findElement(yes);
        subscribeYes.click();

        WebElement subscribeNo=driver.findElement(no);
        subscribeNo.click();

        WebElement continueButton=driver.findElement(cont);
        continueButton.click();

        Tools.successMessageValidation();

    }

    @Test(priority = 2)
    void subscribeFunctionNo()

    {

        WebElement newsLetterLink=driver.findElement(By.linkText("Newsletter"));
        newsLetterLink.click();

        WebElement subscribeNo=driver.findElement(By.cssSelector("[type='radio'][value='0']"));
        subscribeNo.click();

        WebElement continueButton=driver.findElement(By.cssSelector("[value='Continue']"));
        continueButton.click();

        Tools.successMessageValidation();

      // WebElement msgLabel=driver.findElement(By.cssSelector("div[class='alert alert-success alert-dismissible'"));
      // Assert.assertTrue(msgLabel.getText().toLowerCase().contains("success"));

    }

    @Test(priority = 3)
    void subscribeFunctionForBoth()
    {

        WebElement newsLetterLink=driver.findElement(link);
        newsLetterLink.click();

        WebElement subscribeYes=driver.findElement(yes);
        WebElement subscribeNo=driver.findElement(no);

        if(subscribeYes.isSelected())
            subscribeYes.click();
        else subscribeNo.click();

        WebElement continueButton=driver.findElement(cont);
        continueButton.click();

        Tools.successMessageValidation();

        // WebElement msgLabel=driver.findElement(By.cssSelector("div[class='alert alert-success alert-dismissible'"));
        // Assert.assertTrue(msgLabel.getText().toLowerCase().contains("success"));




    }

}
