package test;

import org.junit.jupiter.api.*;
import pageObjects.BasePage;
import pageObjects.CalculatorPage;
import pageObjects.LoginPage;
import pageObjects.LogoutPage;

import java.util.concurrent.TimeUnit;

public class LoginLogoutTest extends BaseTest {


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
    void loginWithExistingUserInPositiveTestOne(){

        loginPage = new LoginPage(driver);
        logoutPage = new LogoutPage(driver);
        calculatorPage = new CalculatorPage(driver);

        //login
        loginPage.setEnterUserNameToLogin("Tomas");
        loginPage.setEnterUserPasswordToLogin("Root1234@.");
        loginPage.setPushButtonToLogin();

        //login assertion
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        //login assertion
        String expectedMessage = "Logout, Tomas";
        String actualMessage = loginPage.getVisibleTextAfterLogin();
        Assertions.assertEquals(expectedMessage, actualMessage, "Nepavyko");

        System.out.println("Succesfuly Login!!!");

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
    @Tag("two")
    void loginUserInNegativeTesttwo(){

        loginPage = new LoginPage(driver);
        logoutPage = new LogoutPage(driver);
        calculatorPage = new CalculatorPage(driver);

        //login
        loginPage.setEnterUserNameToLogin("Tadas"); //bad
        loginPage.setEnterUserPasswordToLogin("Root1234@.");
        loginPage.setPushButtonToLogin();

        //login assertion
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        //login assertion
        String expectedMessageTwo = "Įvestas prisijungimo vardas ir/ arba slaptažodis yra neteisingi";
        String actualMessageTwo = loginPage.getVisibleBadNameErrorMessage();
        Assertions.assertEquals(expectedMessageTwo, actualMessageTwo, "Nepavyko");
//
//        System.out.println("Succesfuly Login!!!");
//
//        //logout
//        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
//        logoutPage.setPushButtonToLogout();
//
//        System.out.println("Succesfuly Logout!!!");

    }
    @Test
    @Tag("negativeTest")
    @Tag("three")
    void loginUserInNegativeTestthree(){

        loginPage = new LoginPage(driver);
        logoutPage = new LogoutPage(driver);
        calculatorPage = new CalculatorPage(driver);

        //login
        loginPage.setEnterUserNameToLogin("Tomas");
        loginPage.setEnterUserPasswordToLogin("Root1234@.Admin"); //bad
        loginPage.setPushButtonToLogin();

        //login assertion
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        //login assertion
        String expectedMessageThree = "Įvestas prisijungimo vardas ir/ arba slaptažodis yra neteisingi";
        String actualMessageThree = loginPage.getVisibleBadNameErrorMessage();
        Assertions.assertEquals(expectedMessageThree, actualMessageThree, "Nepavyko");
//
//        System.out.println("Succesfuly Login!!!");
//
//        //logout
//        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
//        logoutPage.setPushButtonToLogout();
//
//        System.out.println("Succesfuly Logout!!!");

    }







}
