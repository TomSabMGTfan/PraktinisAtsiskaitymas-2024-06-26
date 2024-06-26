package test;

import org.junit.jupiter.api.*;
import pageObjects.CalculatorPage;
import pageObjects.LoginPage;
import pageObjects.LogoutPage;
import pageObjects.SearchPage;

import java.util.concurrent.TimeUnit;

public class SearchTest extends BaseTest{

    LoginPage loginPage;
    LogoutPage logoutPage;
    CalculatorPage calculatorPage;
    SearchPage searchPage;


    TestInfo testInfo;
    TestReporter testReporter;


    @BeforeEach
    void init(TestInfo testInfo, TestReporter testReporter){
        this.testInfo = testInfo;
        this.testReporter = testReporter;
        testReporter.publishEntry("Running " + testInfo.getDisplayName() + " with tags " + testInfo.getTags());
    }

    @Test
    @Tag("PositiveTest")
    @Tag("one")
    void searchPositiveTestOne() {

        loginPage = new LoginPage(driver);
        logoutPage = new LogoutPage(driver);
        calculatorPage = new CalculatorPage(driver);
        searchPage = new SearchPage(driver);

        //login
        loginPage.setEnterUserNameToLogin("Tomas");
        loginPage.setEnterUserPasswordToLogin("Root1234@.");
        loginPage.setPushButtonToLogin();

        // search button
        searchPage.setPushExistingOperationButton();

        //find 3x4 and change
        searchPage.setChangeButtonTochangeThreeMultiplicationByFourResult();

        //change 3x4
        searchPage.setEnterFirtNumberToChangeValueSelect();
        searchPage.setEnterFirtNumberToChangeValueClear();
        searchPage.setEnterFirtNumberToChangeValueEnter("10");

        searchPage.setEnterSecondNumberToChangeValueSelect();
        searchPage.setEnterSecondNumberToChangeValueClear();
        searchPage.setEnterSecondNumberToChangeValueEnter("2");
        //refresh button
        searchPage.setRefreshResultButton();

        //possitive assertion

        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        // assertion
        String expectedMessage = "12";
        String actualMessage = searchPage.getVisibleTextAfterRefreshResult();
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

}



