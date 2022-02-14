package curogram.testcases;

import curogram.base.BaseClass;
import curogram.pages.LoginPage;
import curogram.dataproviders.ConfigUtility;
import org.testng.annotations.Test;

public class LoginPageTest extends BaseClass {
    @Test(priority = 1)
    public void loginTest()
    {
        LoginPage login = new LoginPage(driver);
        login.doLogin(ConfigUtility.getValue("email"),ConfigUtility.getValue("password"));
    }
}
