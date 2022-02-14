package curogram.testcases;

import curogram.base.BaseClass;
import curogram.pages.HomePage;
import org.testng.annotations.Test;

public class HomePageTest extends BaseClass {
    HomePage home;
    @Test(priority = 2)
    public void goToSettings(){
        home = new HomePage(driver);
        home.goToSettings();
    }

    @Test(priority = 3)
    public void goToPatientReg(){
        home.goToPatientRegistration();}
}
