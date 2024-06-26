package test;

import org.junit.jupiter.api.*;
import pageObjects.CalculatorPage;
import pageObjects.LoginPage;
import pageObjects.LogoutPage;

import java.util.concurrent.TimeUnit;

public class CalculatorTest extends BaseTest{


    LoginPage loginPage;
    LogoutPage logoutPage;
    CalculatorPage calculatorPage;


    TestInfo testInfo;
    TestReporter testReporter;


    @BeforeEach
    void init(TestInfo testInfo, TestReporter testReporter){
        this.testInfo = testInfo;
        this.testReporter = testReporter;
        testReporter.publishEntry("Running " + testInfo.getDisplayName() + " with tags " + testInfo.getTags());
    }

    @Test
    @Tag("positiveTest")
    @Tag("one")
    void multiplyTheNumberByTheNumberPositiveTestOne(){


        loginPage = new LoginPage(driver);
        logoutPage = new LogoutPage(driver);
        calculatorPage = new CalculatorPage(driver);

        //login
        loginPage.setEnterUserNameToLogin("Tomas");
        loginPage.setEnterUserPasswordToLogin("Root1234@.");
        loginPage.setPushButtonToLogin();

        //calculator multiply
        calculatorPage.setFirtNumberInputSelectMultiply();
        calculatorPage.setFirtNumberInputClearMultiply();
        calculatorPage.setFirtNumberInputEnterNumberMultiply("3");

        calculatorPage.setSecondNumberInputSelectMultiply();
        calculatorPage.setSecondNumberInputClearMultiply();
        calculatorPage.setSecondNumberInputEnterNumberMultiply("4");

        //multiplication by number
        calculatorPage.setSelectOperationSign();
        calculatorPage.setMultiplicationOperationSign("Daugyba");
        calculatorPage.setMultiplicationOperationSign();
        //calculate arithmetics with numbers button
        calculatorPage.setCalculateArithmeticsWithNumbersButton();

        //possitive assertion

        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        // assertion
        String expectedMessage = "3 * 4 = 12";
        String actualMessage = calculatorPage.getVisibleTextAfterPositiveTestInMultiplication();
        Assertions.assertEquals(expectedMessage, actualMessage, "Nepavyko");

        System.out.println("Succesfuly Positive test one!!!");

        //logout
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        logoutPage.setPushButtonToLogout();

        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        //logout assertion
        String expectedMessage1 = "Prisijungimas";
        String actualMessage1 = logoutPage.getVisibleTextAfterLogout();
        Assertions.assertEquals(expectedMessage, actualMessage, "Nepavyko");


        System.out.println("Succesfuly Logout!!!");

    }

    @Test
    @Tag("positiveTest")
    @Tag("two")
    void substractTheNumberByTheNumberPositiveTestTwo() {


        loginPage = new LoginPage(driver);
        logoutPage = new LogoutPage(driver);
        calculatorPage = new CalculatorPage(driver);

        //login
        loginPage.setEnterUserNameToLogin("Tomas");
        loginPage.setEnterUserPasswordToLogin("Root1234@.");
        loginPage.setPushButtonToLogin();

        //calculator multiply
        calculatorPage.setFirtNumberInputSelectMultiply();
        calculatorPage.setFirtNumberInputClearMultiply();
        calculatorPage.setFirtNumberInputEnterNumberMultiply("100");

        calculatorPage.setSecondNumberInputSelectMultiply();
        calculatorPage.setSecondNumberInputClearMultiply();
        calculatorPage.setSecondNumberInputEnterNumberMultiply("33");

        //substract by number
        calculatorPage.setSelectOperationSign();
        calculatorPage.setMultiplicationOperationSign("Atimtis");
        calculatorPage.setMultiplicationOperationSign();
        //calculate arithmetics with numbers button
        calculatorPage.setCalculateArithmeticsWithNumbersButton();

        //possitive assertion

        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        // assertion
        String expectedMessage = "100 - 33 = 67";
        String actualMessage = calculatorPage.getVisibleTextAfterPositiveTestInSubstract();
        Assertions.assertEquals(expectedMessage, actualMessage, "Nepavyko");

        System.out.println("Succesfuly Positive test two!!!");

        //logout
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        logoutPage.setPushButtonToLogout();

        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        //logout assertion
        String expectedMessage1 = "Prisijungimas";
        String actualMessage1 = logoutPage.getVisibleTextAfterLogout();
        Assertions.assertEquals(expectedMessage, actualMessage, "Nepavyko");


        System.out.println("Succesfuly Logout!!!");

    }

    @Test
    @Tag("negativeTest")
    @Tag("three")
    void sumTheNumberByTheNumberInNegativeTestThree() {


        loginPage = new LoginPage(driver);
        logoutPage = new LogoutPage(driver);
        calculatorPage = new CalculatorPage(driver);

        //login
        loginPage.setEnterUserNameToLogin("Tomas");
        loginPage.setEnterUserPasswordToLogin("Root1234@.");
        loginPage.setPushButtonToLogin();

        //calculator multiply
        calculatorPage.setFirtNumberInputSelectMultiply();
        calculatorPage.setFirtNumberInputClearMultiply();
        calculatorPage.setFirtNumberInputEnterNumberMultiply("2");

        calculatorPage.setSecondNumberInputSelectMultiply();
        calculatorPage.setSecondNumberInputClearMultiply();
        calculatorPage.setSecondNumberInputEnterNumberMultiply("!");

        //calculate arithmetics with numbers button
        calculatorPage.setCalculateArithmeticsWithNumbersButton();

        //negative assertion

        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        // assertion
        String expectedMessage = "Failed to convert property value of type java.lang.String to required type int for property sk2; nested exception is java.lang.NumberFormatException: For input string: \"\"";
        String actualMessage = calculatorPage.getVisibleTextAfterNegativeTestInSum();
        Assertions.assertEquals(expectedMessage, actualMessage, "Nepavyko");

        System.out.println("Succesfuly Negative test three!!!");

        //logout
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        logoutPage.setPushButtonToLogout();

        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        //logout assertion
        String expectedMessage1 = "Prisijungimas";
        String actualMessage1 = logoutPage.getVisibleTextAfterLogout();
        Assertions.assertEquals(expectedMessage, actualMessage, "Nepavyko");


        System.out.println("Succesfuly Logout!!!");



    }




    }
