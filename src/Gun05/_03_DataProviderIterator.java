package Gun05;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class _03_DataProviderIterator {

    @Test(dataProvider = "getData")
    void SearchTest(String searchTest)
    {
        System.out.println("searchTest= "+searchTest);
    }
   @DataProvider

    public Iterator<Object> getData()

   {

      List<Object> data=new ArrayList<>();
      data.add("Mac");
      data.add("Samsung");
      data.add("Huawei");

      return data.iterator();
   }
//****************************************2 BOYUTLU ITERATOR************************************************************


       @Test(dataProvider = "getData2")
       void LoginTest(String userName, String password)
       {
           System.out.println("userName= "+userName+", Password= "+password);
       }
       @DataProvider

       public Iterator<Object[]> getData2() {

           List<Object[]> logins = new ArrayList<>();
           logins.add(new Object[]{"hakan","121212"});
           logins.add(new Object[]{"mehmet","1414444"});
           logins.add(new Object[]{"ali","6666777888"});

           return logins.iterator();


       }

}




