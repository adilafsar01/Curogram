package curogram.testcases;

import curogram.base.BaseClass;
import curogram.dataproviders.ConfigUtility;
import curogram.pages.PatientRegistration;
import org.testng.annotations.Test;

public class PatientRegistrationTest extends BaseClass {
    PatientRegistration pr;

    @Test(priority = 4)
    public void selectDefault(){
        pr = new PatientRegistration(driver);
        pr.goToDefaultTab();
    }

    @Test(priority = 5)
    public void validateGeneralSettings(){
        pr.validateVerificationDropDownValue(ConfigUtility.getValue("Verification_DropDown_Value"));
        pr.validateAuthenticationMethodDropDownValue(ConfigUtility.getValue("Authentication_DropDown_Value"));
        pr.validateRegistrationTypeDropDownValue(ConfigUtility.getValue("Registration_DropDown_Value"));
    }

    @Test(priority = 6)
    public void validateRegistrationComponent(){
        pr.validateLanguageSelectionToggle("true");
        pr.validateIntroductionToggle("false");
        pr.validateReferralSource(ConfigUtility.getValue("Referral"),ConfigUtility.getValue("ToggleSwitchOption"));
        pr.validateScreening(ConfigUtility.getValue("Screening"),ConfigUtility.getValue("ToggleSwitchOption"));
        pr.validateSymptoms(ConfigUtility.getValue("Symptoms"),ConfigUtility.getValue("ToggleSwitchOption"));
        pr.validateScheduling(ConfigUtility.getValue("Scheduling"),ConfigUtility.getValue("ToggleSwitchOption"));
        pr.validatePatientAddress(ConfigUtility.getValue("Patient.Address"),ConfigUtility.getValue("ToggleSwitchOption"));
        pr.validateDisabilities(ConfigUtility.getValue("Disabilities"),ConfigUtility.getValue("ToggleSwitchOption"));
        pr.validateGuardian(ConfigUtility.getValue("Guardian"),ConfigUtility.getValue("ToggleSwitchOption"));
        pr.validateEmergencyContact(ConfigUtility.getValue("Emergency.Contact"),ConfigUtility.getValue("ToggleSwitchOption"));
        pr.validateIdentificationToggle("true");
        pr.validateDocumentSubmission(ConfigUtility.getValue("Document.Submission"),ConfigUtility.getValue("ToggleSwitchOption"));
        pr.validateConsent(ConfigUtility.getValue("Consent"),ConfigUtility.getValue("ToggleSwitchOption"));
        pr.validateMedicalRecord(ConfigUtility.getValue("Medical.Record"),ConfigUtility.getValue("ToggleSwitchOption"));
        pr.validatePayment(ConfigUtility.getValue("Payment"),ConfigUtility.getValue("ToggleSwitchOption"));
        pr.clickOnPublicURL();
    }


}
