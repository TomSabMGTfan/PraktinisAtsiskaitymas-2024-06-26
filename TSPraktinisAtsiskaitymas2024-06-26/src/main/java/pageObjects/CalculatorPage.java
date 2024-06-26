package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CalculatorPage extends BasePage{



    //Assertion for positive test in automatic style
    @FindBy(xpath = "//h3[contains(text(),'Skaičiuotuvas jautrus neigiamiems skaičiams ;)')]")
    private WebElement afterCreatedUserGettedTextInManualStyle;

    //calculator multiply
    //first number
    @FindBy(xpath = "//input[@id='sk1']")
    private WebElement firtNumberInputSelectMultiply;
    @FindBy(xpath = "//input[@id='sk1']")
    private WebElement firtNumberInputClearMultiply;
    @FindBy(xpath = "//input[@id='sk1']")
    private WebElement firtNumberInputEnterNumberMultiply;
    //second number
    @FindBy(xpath = "//input[@id='sk2']")
    private WebElement secondNumberInputSelectMultiply;
    @FindBy(xpath = "//input[@id='sk2']")
    private WebElement secondNumberInputClearMultiply;
    @FindBy(xpath = "//input[@id='sk2']")
    private WebElement secondNumberInputEnterNumberMultiply;
    //Operation sign
    @FindBy(xpath = "//select[@name='zenklas']")
    private WebElement selectOperationSign;

    @FindBy(xpath = "//select[@name='zenklas']")
    private WebElement sumOperationSign;
    @FindBy(xpath = "//select[@name='zenklas']")
    private WebElement substractOperationSign;
    @FindBy(xpath = "//select[@name='zenklas']")
    private WebElement multiplicationOperationSign;
    @FindBy(xpath = "//select[@name='zenklas']")
    private WebElement divisionOperationSign;

    //calculate arithmetics with numbers button
    @FindBy(xpath = "//input[@value='skaičiuoti']")
    private WebElement calculateArithmeticsWithNumbersButton;

    //positive assertion one
    @FindBy(xpath = "//h4[contains(text(),'3 *')]")
    private static WebElement visibleTextAfterPositiveTestInMultiplication;

    //positive assertion two
    @FindBy(xpath = "//h4[contains(text(),'100 -')]")
    private static WebElement visibleTextAfterPositiveTestInSubstract;

    //negative assertion three
    @FindBy(css = "span[id='sk2.errors']")
    private static WebElement visibleTextAfterNegativeTestInSum;







    public CalculatorPage(WebDriver driver) {
        super(driver);
    }

    //Assertion for manual style
        public String getAfterCreatedUserGettedTextInManualStyle(){
            return afterCreatedUserGettedTextInManualStyle.getText();
        }

    //calculator multiply
    //first number
    public void setFirtNumberInputSelectMultiply(){
        firtNumberInputSelectMultiply.click();
    }
    public void setFirtNumberInputClearMultiply(){
        firtNumberInputClearMultiply.clear();
    }
    public void setFirtNumberInputEnterNumberMultiply(String txt){
        firtNumberInputEnterNumberMultiply.sendKeys(txt);
    }
    //second number
    public void setSecondNumberInputSelectMultiply(){
        secondNumberInputSelectMultiply.click();
    }
    public void setSecondNumberInputClearMultiply(){
        secondNumberInputClearMultiply.clear();
    }
    public void setSecondNumberInputEnterNumberMultiply(String txt){
        secondNumberInputEnterNumberMultiply.sendKeys(txt);
    }
    //multiplication by number 3x4
    public void setSelectOperationSign(){
        selectOperationSign.click();
    }
    public void setMultiplicationOperationSign(String txt){
        multiplicationOperationSign.sendKeys(txt);
    }
    public void setMultiplicationOperationSign(){
        multiplicationOperationSign.click();
    }
    //substract by number 100-33


    //calculate arithmetics with numbers button
    public void setCalculateArithmeticsWithNumbersButton(){
        calculateArithmeticsWithNumbersButton.click();
    }


    //positive assertion one
    public static String getVisibleTextAfterPositiveTestInMultiplication(){
        return visibleTextAfterPositiveTestInMultiplication.getText();
    }
    //positive assertion two
    public static String getVisibleTextAfterPositiveTestInSubstract(){
        return visibleTextAfterPositiveTestInSubstract.getText();
    }
    //negative assertion three
    public static String getVisibleTextAfterNegativeTestInSum(){
        return visibleTextAfterNegativeTestInSum.getText();
    }





}
