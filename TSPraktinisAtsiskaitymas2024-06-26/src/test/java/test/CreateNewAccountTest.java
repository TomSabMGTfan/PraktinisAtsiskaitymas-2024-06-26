package test;

import org.junit.jupiter.api.*;
import pageObjects.CalculatorPage;
import pageObjects.CreateNewAccountPage;
import pageObjects.LoginPage;
import utils.RandomGenerator;

import java.util.concurrent.TimeUnit;

public class CreateNewAccountTest extends BaseTest{

    LoginPage loginPage;
    CreateNewAccountPage createNewAccountPage;
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
    @Tag("negativeTest")
    @Tag("one")
    void CcreateNewAccountManualStyleNegativeTestOne(){

        loginPage = new LoginPage(driver);
        createNewAccountPage = new CreateNewAccountPage(driver);
        calculatorPage = new CalculatorPage(driver);

        //base page
        loginPage.setCreateNewAccountButtont();
        //create new account page
        createNewAccountPage.setEnterUsernameField(""); //Admin
        createNewAccountPage.setEnterPasswordField("Root1234@."); //Admin1234@.
        createNewAccountPage.setEnterpasswordConfirmField("Root1234@."); //Admin1234@.
        createNewAccountPage.setPushConfirmCreateUserButton();


        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        //Assertion
        String expectedMessage = "Šį laukelį būtina užpildyti\n" +
                "Privaloma įvesti nuo 3 iki 32 simbolių";
        String actualMessage = createNewAccountPage.getCreateUserNameErrors();
        Assertions.assertEquals(expectedMessage, actualMessage, "Nepavyko");

        System.out.println("Negative test 1!!!");

    }
    @Test
    @Tag("negativeTest")
    @Tag("two")
    void CcreateNewAccountManualStyleNegativeTesttwo(){

        loginPage = new LoginPage(driver);
        createNewAccountPage = new CreateNewAccountPage(driver);
        calculatorPage = new CalculatorPage(driver);

        //base page
        loginPage.setCreateNewAccountButtont();
        //create new account page
        createNewAccountPage.setEnterUsernameField("Mantas"); //Admin
        createNewAccountPage.setEnterPasswordField(""); //Admin1234@.
        createNewAccountPage.setEnterpasswordConfirmField("Root1234@."); //Admin1234@.
        createNewAccountPage.setPushConfirmCreateUserButton();


        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        //Assertion
        String expectedMessage = "Šį laukelį būtina užpildyti\n" +
                "Privaloma įvesti bent 3 simbolius";
        String actualMessage = createNewAccountPage.getCreateUserPasswordErrors();
        Assertions.assertEquals(expectedMessage, actualMessage, "Nepavyko");

        System.out.println("Negative test 2!!!");

    }
    @Test
    @Tag("negativeTest")
    @Tag("three")
    void CcreateNewAccountManualStyleNegativeTestthree(){

        loginPage = new LoginPage(driver);
        createNewAccountPage = new CreateNewAccountPage(driver);
        calculatorPage = new CalculatorPage(driver);

        //base page
        loginPage.setCreateNewAccountButtont();
        //create new account page
        createNewAccountPage.setEnterUsernameField("Mantas"); //Admin
        createNewAccountPage.setEnterPasswordField("Root1234@."); //Admin1234@.
        createNewAccountPage.setEnterpasswordConfirmField(""); //Admin1234@.
        createNewAccountPage.setPushConfirmCreateUserButton();


        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        //Assertion
        String expectedMessage = "Įvesti slaptažodžiai nesutampa";
        String actualMessage = createNewAccountPage.getCrateUserPassworsConfirmErrors();
        Assertions.assertEquals(expectedMessage, actualMessage, "Nepavyko");

        System.out.println("Negative test 3!!!");

    }

    @Test
    @Tag("positiveTest")
    @Tag("four")
    void CcreateNewAccountAutomaticStylePositiveTestFour(){

        loginPage = new LoginPage(driver);
        createNewAccountPage = new CreateNewAccountPage(driver);
        calculatorPage = new CalculatorPage(driver);

        //base page
        loginPage.setCreateNewAccountButtont();
        //create new account page
        //createNewAccountPage.setEnterUsernameField("Tom");
        String NameInputFieldRandom = RandomGenerator.generateRandomName();
        createNewAccountPage.setNameInputFieldRandom(NameInputFieldRandom);

        createNewAccountPage.setEnterPasswordField("Root1234@.");
//        String PasswordInputFieldRandom = RandomGenerator.generateRandomPasswordV2();
//        createNewAccountPage.setPasswordInputFieldRandom(PasswordInputFieldRandom);
        createNewAccountPage.setEnterpasswordConfirmField("Root1234@.");


        createNewAccountPage.setPushConfirmCreateUserButton();


        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        //Assertion
        String expectedMessage = "Skaičiuotuvas jautrus neigiamiems skaičiams ;)";
        String actualMessage = calculatorPage.getAfterCreatedUserGettedTextInManualStyle();
        Assertions.assertEquals(expectedMessage, actualMessage, "Nepavyko");

        System.out.println("Succesfuly Created New Account in Automatic style!!!");

    }



}
