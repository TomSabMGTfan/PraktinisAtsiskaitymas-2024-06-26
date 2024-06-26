package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CreateNewAccountPage extends BasePage{

    //create new account page
    @FindBy(xpath = "//input[@id='username']")
    private WebElement enterUsernameField;
    @FindBy(xpath = "//input[@id='password']")
    private WebElement enterPasswordField;
    @FindBy(xpath = "//input[@id='passwordConfirm']")
    private WebElement enterpasswordConfirmField;
    @FindBy(xpath = "//button[normalize-space()='Sukurti']")
    private WebElement pushConfirmCreateUserButton;
    //negative tests assertions
    @FindBy(xpath = "//span[@id='username.errors']")
    private static WebElement createUserNameErrors;
    @FindBy(xpath = "//span[@id='password.errors']")
    private static WebElement createUserPasswordErrors;
    @FindBy(xpath = "//span[@id='passwordConfirm.errors']")
    private static WebElement crateUserPassworsConfirmErrors;

    //random create new account
    @FindBy(xpath = "//input[@id='username']")
    private WebElement nameInputFieldRandom;
    @FindBy(xpath = "//input[@id='password']")
    private WebElement passwordInputFieldRandom;
    @FindBy(xpath = "//input[@id='password']")
    private WebElement passwordConfirmInputFieldRandom;




    public CreateNewAccountPage(WebDriver driver) {
        super(driver);
    }

    //create new account page
    public void setEnterUsernameField(String txt){
        enterUsernameField.sendKeys(txt);
    }
    public void setEnterPasswordField(String txt){
        enterPasswordField.sendKeys(txt);
    }
    public void setEnterpasswordConfirmField(String txt){
        enterpasswordConfirmField.sendKeys(txt);
    }
    public void setPushConfirmCreateUserButton(){
        pushConfirmCreateUserButton.click();
    }
    //negative tests Assertions
    public static String getCreateUserNameErrors(){
        return createUserNameErrors.getText();
    }
    public static String getCreateUserPasswordErrors() {
        return createUserPasswordErrors.getText();
    }
    public static String getCrateUserPassworsConfirmErrors(){
        return crateUserPassworsConfirmErrors.getText();
    }

    //random create new account
    public void setNameInputFieldRandom(String txt){
        nameInputFieldRandom.sendKeys(txt);
    }
    public void setPasswordInputFieldRandom(String txt){
        passwordInputFieldRandom.sendKeys(txt);
    }
//    public static String setPasswordConfirmInputFieldRandom(){
//       return passwordConfirmInputFieldRandom.getText();
//    }






}
