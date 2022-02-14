package curogram.testcases;

import curogram.base.BaseClass;
import curogram.dataproviders.ConfigUtility;
import curogram.pages.RegistrationPage;
import org.testng.annotations.Test;

public class RegistrationPageTest extends BaseClass {
    RegistrationPage rp;

        @Test(priority = 7)
        public void registration(){
        rp = new RegistrationPage(driver);
        rp.selectLanguage();
        rp.selectLocation();
        rp.selectTime();
        rp.enterPhoneNumber(ConfigUtility.getValue("valid.phone.number"));
        rp.selectPatient();
        rp.addNewPatient(ConfigUtility.getValue("valid.first.name"),ConfigUtility.getValue("valid.last.name"));
        rp.enterPatientAddress();
        rp.selectReferral();
        rp.selectScreening();
        rp.selectSymptoms();
        rp.selectGuardian();
        rp.selectDisability();
        rp.enterEmergencyContact();
        rp.selectInsuranceInfo();
        rp.selectIdentification();
        rp.enterDocumentSubmission();
        rp.enterPayment();
        rp.selectConsent();
        rp.enterMRRAuthorization(ConfigUtility.getValue("valid.first.name"),ConfigUtility.getValue("valid.last.name"));
        rp.enterSignature();
    }
}
