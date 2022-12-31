package Gun06;

import Utils.BaseDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class _02_PlaceOrderElements {
    public _02_PlaceOrderElements() {
        PageFactory.initElements(BaseDriver.driver,this);
        // Bu sayfadaki bütün elemenalrın driverlar bağlantısı gerekiyor
        // bunun için aşağıdaki consructor eklendi ve için PageFatory ile
        // driver üzerinden bu (this) sayfadaki bütün elemnalar ilşkilendirildi.
        // Böylece Sayfada dan nesne türetildiği zaman değil, kullanıldığı
        // anda elemanların bulunması aktif oluyor.Bu yöntemle bütün sayfalarda
        // aynı isimde elemanlar var ise buradaki tanımlama hepsi için geçerli hale
        // gelmiş oluyor. buna yapıya Page Object Model (POM) adı veriliyor.



    }

    @FindBy(name="search")
    public WebElement searchBox;

    @FindBy(css="button[class='btn btn-default btn-lg']")
    public WebElement searchButton;

    @FindBy(xpath="//span[text()='Add to Cart']")
    public WebElement AddToCart;

    @FindBy(linkText="Shopping Cart")
    public WebElement shoppingCart;

    @FindBy(linkText="Checkout")
    public WebElement checkOut;

    @FindBy(id="button-payment-address")
    public WebElement cont1;

    @FindBy(id="button-shipping-address")
    public WebElement cont2;

    @FindBy(id="button-shipping-method")
    public WebElement cont3;

    @FindBy(name="agree")
    public WebElement agree;

    @FindBy(id="button-payment-method")
    public WebElement cont4;

    @FindBy(id="button-confirm")
    public WebElement confirm;

    @FindBy(css="[id='content']>h1")
    public WebElement h1;




}
