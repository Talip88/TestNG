package Gun07;

import Gun06._02_PlaceOrderElements;
import Utils.BaseDriver;
import Utils.Tools;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class _03_WishListPOM extends BaseDriver {

    @Test
    @Parameters("itemName")
    void addToWishList (String arananKelime)
    {
        _02_PlaceOrderElements poe=new _02_PlaceOrderElements();
        poe.searchBox.sendKeys(arananKelime);
        poe.searchButton.click();

        _02_WishListElements wle=new _02_WishListElements();

        int rndNumber= Tools.randomGenerator(wle.searchResults.size());
        //sonuçların listesinden bir eleman seçtim

        String wishItemName=wle.searchResults.get(rndNumber).getText();
        //ürünün textini aldım
        wle.wishList.get(rndNumber).click();
        wle.btnWishList.click();
        //wish listine tıklattım





    }

}
