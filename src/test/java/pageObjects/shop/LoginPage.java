package pageObjects.shop;

import controllers.PageBase;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;

public class LoginPage extends PageBase {
    private static final Logger LOGGER = Logger.getLogger(LoginPage.class);

    private static By mecury_tour  = By.xpath("/html/body/div/table/tbody/tr/td[1]/table/tbody/tr/td/table/tbody/tr/td/p[1]/img");
    private static By btnSignOn = By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[2]/td/table/tbody/tr/td[1]/a");
    private static By SignOn = By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[1]/td/img");

    private static By Username =By.name("userName");
    private static By Password=By.name( "password");
    private static By btnSubmit = By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[4]/td/input");
    private static By flightFinder = By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[1]/td/img");

    public static boolean isPageDisplayed() {
        return getDriver().findElement(mecury_tour).isDisplayed();
    }
    public static void clickSignOn() {
        getDriver().findElement(btnSignOn).click();
    }
    public static boolean isSignOnPageDisplayed() {
        return getDriver().findElement(SignOn).isDisplayed();
    }

    public static void setUserName(String username) {
        getDriver().findElement(Username).sendKeys(username);
    }

    public static void setPassword(String password) {
        getDriver().findElement(Password).sendKeys(password);
    }

    public static void clickSubmit() {
        getDriver().findElement(btnSubmit).click();
    }
    public static boolean isflightFinderDisplayed() {
        return getDriver().findElement(flightFinder).isDisplayed();
    }



}
