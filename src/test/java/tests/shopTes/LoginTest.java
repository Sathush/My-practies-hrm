package tests.shopTes;


import controllers.TestBase;
import org.apache.log4j.Logger;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pageObjects.shop.LoginPage;
import testData.LoginData;

/*
 Create by  J.Sathurya
 2020/07/02
  Tour Login Script
   */
public class LoginTest extends TestBase {
    public SoftAssert softAssert;

    private static final Logger LOGGER = Logger.getLogger(LoginTest.class);

    @Test(dataProviderClass = LoginData.class,dataProvider = "LoginExcel")
    public void testlogin(String username, String password) {
        softAssert = new SoftAssert();
        softAssert.assertTrue(LoginPage.isPageDisplayed(), "Shop Page is not Displayed");
        LoginPage.clickSignOn();
        softAssert.assertTrue(LoginPage.isSignOnPageDisplayed(), "Shop Page is not Displayed");
        LoginPage.setUserName(username);
        LoginPage.setPassword(password);
        LoginPage.clickSubmit();
        softAssert.assertTrue(LoginPage.isflightFinderDisplayed(),"Account Page is not displayed");
        softAssert.assertAll();

        LOGGER.info("successful Login");
    }

}
