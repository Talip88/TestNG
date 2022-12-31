package Projeler.Project1;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pom {

    //************************************1.CASE****************************************
    public Pom() {
        PageFactory.initElements(BaseDriverProje.driver, this);
    }

    @FindBy(id = "gender-male")
    public WebElement sex;

    @FindBy(id = "FirstName")
    public WebElement name;

    @FindBy(id = "LastName")
    public WebElement lastName;

    @FindBy(name = "DateOfBirthDay")
    public WebElement day;

    @FindBy(name = "DateOfBirthMonth")
    public WebElement month;

    @FindBy(name = "DateOfBirthYear")
    public WebElement year;

    @FindBy(id = "Email")
    public WebElement email;

    @FindBy(id = "Password")
    public WebElement password;

    @FindBy(id = "ConfirmPassword")
    public WebElement confirmPassword;

    @FindBy(id="register-button")
    public WebElement register;


    //************************************2.CASE****************************************
    @FindBy(xpath = "//button[text()='Log in']")
    public WebElement logInButton;

    @FindBy(linkText = "Log out")
    public WebElement logOut;

    @FindBy(xpath = "//*[text()='Login was unsuccessful. Please correct the errors and try again.']")
    public WebElement inValidMessage;


    //************************************5.CASE***[class='result']*************************************
    @FindBy(xpath = "(//*[text()='Gift Cards '])[1]")
    public WebElement giftCards;

    @FindBy(id = "giftcard_45_RecipientName")
    public WebElement recipientName;

    @FindBy(id = "giftcard_45_SenderName")
    public WebElement senderName;

    @FindBy(id = "giftcard_45_Message")
    public WebElement giftMessage;

    @FindBy(id = "add-to-cart-button-45")
    public WebElement addToCart;

    @FindBy(css = "[class='bar-notification success']")
    public WebElement successText;


    //************************************6.CASE**********************************

    @FindBy(xpath = "(//*[text()='Computers '])[1]")
    public WebElement Computer;

    @FindBy(xpath = "//*[text()='Desktops ']")
    public WebElement Desktop;

    @FindBy(xpath = "//*[text()='Build your own computer']")
    public WebElement OwnComputer;

    @FindBy(id = "product_attribute_2")
    public WebElement SelectRam;

    @FindBy(id="product_attribute_3_7")
    public WebElement HDD;

    @FindBy(id = "small-searchterms")
    public WebElement SearchButton;

    @FindBy(id="add-to-cart-button-1")
    public WebElement AddToCart2;

    @FindBy(linkText = "Adobe Photoshop CS4")
    public WebElement ProductTitle;

    @FindBy (linkText="Adobe Photoshop CS4")
    public WebElement Adobe;



}
