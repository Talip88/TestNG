package Gun05;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class _02_DataProviderMultiDimension {

    @Test(dataProvider = "getData")
    void LoginTest(String userName, String password)
    {
        System.out.println("userName= "+userName+", Password= "+password);
    }
   @DataProvider

    public Object[][] getData()

   {

       Object[][] login={

               {"Hasan", "12121212"},
               {"Birkan", "1212121212"},
               {"Metin", "12121212"}

       };

       return login;

    }

}




