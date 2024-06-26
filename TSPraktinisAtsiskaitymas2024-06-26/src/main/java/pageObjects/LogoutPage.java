package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LogoutPage extends BasePage{

//    @FindBy(xpath = "//a[normalize-space()='Logout, Tomas']")
////    private WebElement pushButtonToLogout;
    @FindBy(css = "a[onclick=\"document.forms['logoutForm'].submit()\"]")
    private WebElement pushButtonToLogout;

    //logout assertion
    @FindBy(xpath = "//h3[normalize-space()='Prisijungimas']")
    private static WebElement visibleTextAfterLogout;



    public LogoutPage(WebDriver driver) {
        super(driver);
    }

    public void  setPushButtonToLogout(){
        pushButtonToLogout.click();
    }

    //logout assertion
    public static String getVisibleTextAfterLogout(){
        return visibleTextAfterLogout.getText();
    }






}
