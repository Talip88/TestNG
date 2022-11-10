package Gun02;

import Utils.BaseDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class _02_ValidateMenu extends BaseDriver {


    @Test
    void menuValidation()

    {
        List<WebElement> menuActualList=driver.findElements(By.cssSelector("ul[class='nav navbar-nav']>li"));

       // for(WebElement e:menuActualList)
       //     System.out.println(e.getText());

        List<String>menuExpextedList=new ArrayList<>();

        menuExpextedList.add("Desktops");
        menuExpextedList.add("Laptops & Notebooks");
        menuExpextedList.add("Components");
        menuExpextedList.add("Tablets");
        menuExpextedList.add("Software");
        menuExpextedList.add("Phones & PDAs");
        menuExpextedList.add("Cameras");
        menuExpextedList.add("MP3 Players");

        for(int i=0; i<menuExpextedList.size();i++){
            Assert.assertEquals(menuExpextedList.get(i),menuActualList.get(i).getText(),"Menuler uyuşmadı");
        }

    }




}
