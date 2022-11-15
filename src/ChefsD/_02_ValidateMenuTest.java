package ChefsD;

import Utils.BaseDriverChef;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class _02_ValidateMenuTest extends BaseDriverChef {

    @Test
    void menuValidation()

    {
        List<WebElement> menuActualList=driver.findElements(By.cssSelector("ul[class='nav navbar-nav']>li"));

        // for(WebElement e:menuActualList)
        //     System.out.println(e.getText());

        List<String>menuExpextedList=new ArrayList<>();

        menuExpextedList.add("Restaurant Equipment");
        menuExpextedList.add("Commercial Refrigeration");
        menuExpextedList.add("Commercial Ice Machines");
        menuExpextedList.add("Cooking Equipment");
        menuExpextedList.add("Commercial Kitchen Hoods");
        menuExpextedList.add("Walk-in Refrigeration");
        menuExpextedList.add("Furniture");
        menuExpextedList.add("Storage & Transport");
        menuExpextedList.add("Smallwares & Janitorials");
        menuExpextedList.add("Business Types");
        menuExpextedList.add("In Stock");

        for(int i=0; i<menuExpextedList.size();i++){
            Assert.assertEquals(menuExpextedList.get(i),menuActualList.get(i).getText(),"Menuler uyuşmadı");
        }

    }




}