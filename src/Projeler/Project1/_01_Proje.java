package Projeler.Project1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class _01_Proje extends BaseDriverProje {



    @Test(enabled = false)
    void Register() {
        Pom elements = new Pom();
        driver.get("https://demo.nopcommerce.com/register?returnUrl=%2F");

        elements.sex.click();
        elements.name.sendKeys("Group2");
        elements.lastName.sendKeys("TestingP4");
        Select dd = new Select(elements.day);
        dd.selectByValue("3");
        Select dd1 = new Select(elements.month);
        dd1.selectByValue("2");
        Select dd2 = new Select(elements.year);
        dd2.selectByValue("1942");
        elements.email.sendKeys("group2_3@technoStudy.com");
        elements.password.sendKeys("TestingProject4");
        elements.confirmPassword.sendKeys("TestingProject4");
        elements.register.click();

        //REGISTER DOĞRULAMA EKSİK




    }

    @Test(dataProvider = "getData",priority = 1)
    void LoginTest(String email, String password) {
        Pom elements = new Pom();
        driver.get("https://demo.nopcommerce.com/login?returnUrl=%2F");
        elements.email.sendKeys(email);
        elements.password.sendKeys(password);
        elements.logInButton.click();
        elements.logOut.click();

        //LOGIN DOĞRULAMA  EKSİK


    }

    @DataProvider
    public Object[][] getData() {
        Object[][] login = {

                {"group2_3@technoStudy.com", "TestingProject4"}};
        return login;
    }




    @Test(dataProvider = "getData2",priority = 2)
    void LoginTestValidInValid(String email, String password) {
        Pom elements = new Pom();
        driver.get("https://demo.nopcommerce.com/login?returnUrl=%2F");
        elements.email.sendKeys(email);
        elements.password.sendKeys(password);



        //Dogruluma yaparken positif negatif nasil ayrim yapariz ?
        //  Assert.assertTrue(elements.inValidMessage.getText().contains("unsuccessful"));

    }

    @DataProvider
    public Object[][] getData2() {
        Object[][] login = {

                {"group2_3@technoStudy.com", "TestingProject4"},
                {"group2@technoStudy.co", "TestingProject2"}};
        return login;
    }


    @Test(priority = 3)
    void Case4() {
        Pom elements = new Pom();
        List<WebElement> tabs = driver.findElements(By.cssSelector("[class='top-menu notmobile']>li>a"));



        List<String> tabsStr = new ArrayList<>();
        tabsStr.add("Computers");
        tabsStr.add("Electronics");
        tabsStr.add("Apparel");
        tabsStr.add("Digital downloads");
        tabsStr.add("Books");
        tabsStr.add("Jewelry");
        tabsStr.add("Gift Cards");

        for (int i = 0; i < tabsStr.size(); i++) {
            Assert.assertEquals(tabsStr.get(i), tabs.get(i).getText(), "Veriler uyusmadi");
        }
        elements.logOut.click();
    }

    @Test(priority = 4)
    void Case5() {
        Pom elements = new Pom();
        driver.manage().deleteAllCookies();
        wait.until(ExpectedConditions.elementToBeClickable(elements.giftCards));
        elements.giftCards.click();
        List<WebElement> menuActualList = driver.findElements(By.xpath("//*[contains(text(),'Ph')]"));
        int a=(int)(Math.random()*2);
        menuActualList.get(a).click();
        elements.recipientName.sendKeys("Group0");
        elements.senderName.sendKeys("Group2");
        elements.giftMessage.sendKeys("Sevgilerle");
        elements.addToCart.click();
        wait.until(ExpectedConditions.visibilityOf(elements.successText));
        Assert.assertTrue(elements.successText.getText().contains("added"));





    }

    @Test(priority = 5)
    void Case6(){
        Pom elements=new Pom();
        driver.manage().deleteAllCookies();
        Actions actions=new Actions(driver);
        actions.moveToElement(elements.Computer).build().perform();
        wait.until(ExpectedConditions.elementToBeClickable(elements.Desktop));
        elements.Desktop.click();
        elements.OwnComputer.click();
        Select _select=new Select(elements.SelectRam);
        _select.selectByValue("3");
        elements.HDD.click();
        elements.AddToCart2.click();
        Assert.assertTrue(elements.successText.getText().contains("added"));




    }

    @Test(priority = 6)
    void Case7(){
        Pom elements=new Pom();
        elements.SearchButton.sendKeys("Adobe Photoshop CS4"+ Keys.ENTER);
        wait.until(ExpectedConditions.visibilityOf(elements.ProductTitle));
        Assert.assertEquals(elements.ProductTitle.getText(),"Adobe Photoshop CS4");

    }


}
