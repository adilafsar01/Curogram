package curogram.pages;

import curogram.dataproviders.LocatorUtility;
import curogram.utils.ElementUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

    private WebDriver driver;
    private ElementUtil eleUtil;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
        eleUtil = new ElementUtil(driver);
    }

    private By emailId = By.id(LocatorUtility.getValue("Email_ID"));
    private By password = By.id(LocatorUtility.getValue("Password_ID"));
    private By loginBtn = By.xpath(LocatorUtility.getValue("Login_XPATH"));


    public void doLogin(String email, String pass) {
        eleUtil.doSendKeys(emailId, email);
        eleUtil.doSendKeys(password, pass);
        eleUtil.doClick(loginBtn);
    }
}