package pageObjects.shop;

import controllers.PageBase;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;

public class Register extends PageBase {
    private static final Logger LOGGER = Logger.getLogger(LoginPage.class);

    private static By mecury_tour  = By.xpath("/html/body/div/table/tbody/tr/td[1]/table/tbody/tr/td/table/tbody/tr/td/p[1]/img");
    private static By btnregister = By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[2]/td/table/tbody/tr/td[2]/a");
    private static By RegisterPage =  By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[1]/td/img");
    private static By txtfirstname =By.name("firstName");
    private static By txtlastname=By.name("lastName");
    private static By txtphone = By.name("phone");
    private static By txtemail = By.id("userName");
    private static By txtaddress1 = By.name("address1");
    private static By txtaddress2 = By.name("address2");
    private static By txtcity = By.name("city");
    private static By txtstate = By.name("state");
    private static By txtpostalCode = By.name("postalCode");
    private static By txtusername = By.name("email");
    private static By txtpassword = By.name("password");
    private static By txtconfirmPassword = By.name("confirmPassword");
    private static By btnsubmit = By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[18]/td/input");

    public static boolean isPageDisplayed() {
        return getDriver().findElement(mecury_tour).isDisplayed();
    }
    public static void clickregister() {
        getDriver().findElement(btnregister).click();
    }
    public static void setFirstName(String firstname) {
        getDriver().findElement(txtfirstname).sendKeys(firstname);
    }
    public static void setLastName(String lastname) {
        getDriver().findElement(txtlastname).sendKeys(lastname);
    }
    public static void setPhone(String phone) {
        getDriver().findElement(txtphone).sendKeys(phone);
    }
    public static void setEmail(String email) {
        getDriver().findElement(txtemail).sendKeys(email);
    }
    public static void setAddress1(String address1) {
        getDriver().findElement(txtaddress1).sendKeys(address1);
    }
    public static void setAddress2(String address2) {
        getDriver().findElement(txtaddress2).sendKeys(address2);
    }
    public static void setCity(String city) {
        getDriver().findElement(txtcity).sendKeys(city);
    }
    public static void setState(String state) {
        getDriver().findElement(txtstate).sendKeys(state);
    }
    public static void setCode(String code) {
        getDriver().findElement(txtpostalCode).sendKeys(code);
    }
    public static void setUsername(String email) {
        getDriver().findElement(txtusername).sendKeys(email);
    }
    public static void setPassword(String password) {
        getDriver().findElement(txtpassword).sendKeys(password);
    }
    public static void setConfirmPassword(String ConfirmPassword) {getDriver().findElement(txtconfirmPassword).sendKeys(ConfirmPassword); }
    public static void clickSubmit() { getDriver().findElement(btnsubmit).click(); }


    public static boolean isRegisterPageDisplayed() {
        return getDriver().findElement(RegisterPage).isDisplayed();

    }
}


