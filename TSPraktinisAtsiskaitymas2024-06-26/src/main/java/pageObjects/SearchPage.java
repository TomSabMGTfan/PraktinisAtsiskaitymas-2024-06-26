package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchPage extends BasePage{

    // search button
    @FindBy(xpath = "//a[normalize-space()='Atliktos operacijos']")
    private WebElement pushExistingOperationButton;

    //find 3x4 and change
    @FindBy(xpath = "//tbody/tr[4]/td[5]/a[1]")
    private WebElement changeButtonTochangeThreeMultiplicationByFourResult;

    //change 3x4
    @FindBy(xpath = "//input[@name='sk1']")
    private WebElement enterFirtNumbetToChangeValueSelect;

    @FindBy(xpath = "//input[@name='sk1']")
    private WebElement enterFirtNumbetToChangeValueClear;

    @FindBy(xpath = "//input[@name='sk1']")
    private WebElement enterFirtNumbetToChangeValueEnter;


    @FindBy(xpath = "//input[@name='sk2']")
    private WebElement enterSecondNumberToChangeValueSelect;

    @FindBy(xpath = "//input[@name='sk2']")
    private WebElement enterSecondNumberToChangeValueClear;

    @FindBy(xpath = "//input[@name='sk2']")
    private WebElement enterSecondNumberToChangeValueEnter;

    //refresh button
    @FindBy(xpath = "//input[@value='Atnaujinti']")
    private WebElement refreshResultButton;

    //positive assertion
    @FindBy(xpath = "//td[normalize-space()='12']")
    private static WebElement visibleTextAfterRefreshResult;







    public SearchPage(WebDriver driver) {
        super(driver);
    }
        // search button
    public void setPushExistingOperationButton(){
        pushExistingOperationButton.click();
    }

    //find 3x4 and change
    public void setChangeButtonTochangeThreeMultiplicationByFourResult(){
        changeButtonTochangeThreeMultiplicationByFourResult.click();
    }

    //change 3x4
    public void setEnterFirtNumberToChangeValueSelect(){
        enterFirtNumbetToChangeValueSelect.click();
    }
    public void setEnterFirtNumberToChangeValueClear(){
        enterFirtNumbetToChangeValueClear.clear();
    }
    public void setEnterFirtNumberToChangeValueEnter(String txt){
        enterFirtNumbetToChangeValueEnter.sendKeys(txt);
    }

    public void setEnterSecondNumberToChangeValueSelect(){
        enterSecondNumberToChangeValueSelect.click();
    }
    public void setEnterSecondNumberToChangeValueClear(){
        enterSecondNumberToChangeValueClear.clear();
    }
    public void setEnterSecondNumberToChangeValueEnter(String txt){
        enterSecondNumberToChangeValueEnter.sendKeys(txt);
    }

    //refresh button
    public void setRefreshResultButton(){
        refreshResultButton.click();
    }

//positive assertion
//positive assertion one
public static String getVisibleTextAfterRefreshResult(){
    return visibleTextAfterRefreshResult.getText();
}










}
