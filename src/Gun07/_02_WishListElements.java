package Gun07;

import Utils.BaseDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class _02_WishListElements {

    public _02_WishListElements() {

        PageFactory.initElements(BaseDriver.driver,this);

    }

    @FindBy(xpath="//div[@id='content']/div/div//h4")
    List<WebElement> searchResults;

    @FindBy(xpath="//button[@data-original-title='Add to Wish List']")
    List<WebElement> wishList;

    @FindBy(id="wishlist-total")
    WebElement btnWishList;

    @FindBy(css="td[class='text-left']>a")
    List<WebElement> wishTableNames;

}


//(//a[@class='nav-link active']//p)[1]

//p[text()=' Customers']

////div[text()='Search']

//[id='SearchEmail']


////table[@id='customers-grid']/tbody[1]/tr[1]/td[3]


//(//a[@class='btn btn-default'])[1]

// [id='Email']

//(//button[@class='btn btn-primary'])[1]

////input[@type='email']