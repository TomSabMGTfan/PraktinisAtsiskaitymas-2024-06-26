package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage{

    //base page create user
    @FindBy(xpath = "//a[contains(text(),'Sukurti naują paskyrą')]")
    private WebElement createNewAccountButtont;

    //login
    @FindBy(xpath = "//input[@placeholder='Prisijungimo vardas']")
    private WebElement enterUserNameToLogin;
    @FindBy(xpath = "//input[@placeholder='Slaptažodis']")
    private WebElement enterUserPasswordToLogin;
    @FindBy(xpath = "//button[normalize-space()='Prisijungti']")
    private WebElement pushButtonToLogin;

    //login assertion positive
    @FindBy(xpath = "//a[normalize-space()='Logout, Tomas']")
    private static WebElement visibleTextAfterLogin;

    //login assertion negative
    @FindBy(xpath = "//span[contains(text(),'Įvestas prisijungimo vardas ir/ arba slaptažodis y')]")
    private static WebElement visibleBadNameErrorMessage;
    @FindBy(xpath = "//span[contains(text(),'Įvestas prisijungimo vardas ir/ arba slaptažodis y')]")
    private static WebElement visibleBadPasswordErrorMessage;






    public LoginPage(WebDriver driver) {
        super(driver);
    }

    //base page create user
    public void setCreateNewAccountButtont(){
        createNewAccountButtont.click();
    }
    //LOGIN
    public void setEnterUserNameToLogin(String txt){
        enterUserNameToLogin.sendKeys(txt);
    }
    public void setEnterUserPasswordToLogin(String txt){
        enterUserPasswordToLogin.sendKeys(txt);
    }
    public void  setPushButtonToLogin(){
        pushButtonToLogin.click();
    }
    //login assertion positive
    public static String getVisibleTextAfterLogin(){
        return visibleTextAfterLogin.getText();
    }
    //login assertion negative
    public static String getVisibleBadNameErrorMessage(){
        return visibleBadNameErrorMessage.getText();
    }
    public static String getVisibleBadPasswordErrorMessage(){
        return visibleBadPasswordErrorMessage.getText();
    }





}
