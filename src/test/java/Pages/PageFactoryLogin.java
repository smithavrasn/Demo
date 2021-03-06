package Pages;

import WDFactory.SingletonWD;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.*;

import javax.xml.xpath.XPath;
import java.io.IOException;

import static org.testng.Assert.assertTrue;

/**
 * Created by pavlo.balyuk on 12/2/2017.
 */
public class PageFactoryLogin {

    static WebDriver driver;

    @FindBy(how = How.CSS, using = "#identifierId")
    @CacheLookup
    public static WebElement inpt_userName;

    @FindBy(how = How.XPATH, using = "//div[@id=\"password\"]//input")
    public static WebElement inpt_passWord;

    @FindBy(how = How.CSS, using = "#identifierNext")
    @CacheLookup
    public static WebElement btn_nextToUserName;

    @FindBy(how = How.CSS, using = "#passwordNext")
    public static WebElement btn_nextToPass;

    @FindBy(how = How.XPATH, using = "//a[contains(@title, 'Google Account')]")
    @CacheLookup
    public static WebElement dropdn_account;

    @FindBy(how = How.LINK_TEXT, using = "Sign out")
    @CacheLookup
    public static WebElement btn_logOut;

    @FindBy(xpath = "//*[contains(concat( ' ', @class, ' ' ), concat( ' ', 'RxsGPe', ' ' ))]")
    public static WebElement err_container;

    public void clickLogout() throws IOException {
       dropdn_account.click();
       btn_logOut.click();
    }
}
