package curogram.pages;

import curogram.dataproviders.LocatorUtility;
import curogram.utils.ElementUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    private WebDriver driver;
    private ElementUtil eleUtil;

    public HomePage(WebDriver driver) {
        this.driver=driver;
        eleUtil = new ElementUtil(driver);
    }

    private By settings = By.xpath(LocatorUtility.getValue("Settings_XPATH"));
    private By patientReg = By.xpath(LocatorUtility.getValue("PatientReg_XPATH"));



    public void goToSettings(){
        eleUtil.doClick(settings);
    }
    public void goToPatientRegistration(){
        eleUtil.clickElementWhenReady(patientReg,20);
    }

}
