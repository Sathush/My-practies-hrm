package tests.shopTes;

import controllers.TestBase;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pageObjects.shop.LoginPage;
import pageObjects.shop.Register;

public class RegisterTest extends TestBase {


        @Test
        public void testRegister( ) {
            SoftAssert softAssert = new SoftAssert();
            softAssert.assertTrue(Register.isPageDisplayed(), "Shop Page is not Displayed");
            Register.clickregister();
            softAssert.assertTrue(Register.isRegisterPageDisplayed(), "Shop Page is not Displayed");
            Register.setFirstName("Sathurya");
            Register.setLastName("SAthusrya");
            Register.setPhone("077542682");
            Register.setEmail("sathu@gmail.com");
            Register.setAddress1("Nakkeeran road");
            Register.setAddress2("Point pedro");
            Register.setCity("Jaffna");
            Register.setCode("2456");
            Register.setState("sdghj");
            Register.setUsername("sathu");
            Register.setPassword("sathu");
            Register.setConfirmPassword("sathu");
            Register.clickSubmit();
           // LOGGER.info("successful Register");
         //   softAssert.assertTrue(Register.isRegisterPageDisplayed(),"Account Page is not displayed");
           softAssert.assertAll();

          //

    }
}
