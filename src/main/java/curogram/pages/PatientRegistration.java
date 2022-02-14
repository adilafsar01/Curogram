package curogram.pages;

import curogram.dataproviders.LocatorUtility;
import curogram.utils.ElementUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PatientRegistration {
    private WebDriver driver;
    private ElementUtil eleUtil;

    public PatientRegistration(WebDriver driver) {
        this.driver=driver;
        eleUtil = new ElementUtil(driver);
    }
    private By defaultTab = By.xpath(LocatorUtility.getValue("DefaultTab_XPATH"));
    private By verificationDropDown = By.xpath(LocatorUtility.getValue("VerificationDropDown_XPATH"));
    private By verificationValue = By.xpath(LocatorUtility.getValue("VerificationValue_XPATH"));
    private By authenticationDropDown = By.xpath(LocatorUtility.getValue("AuthenticationDropDown_XPATH"));
    private By authenticationValue = By.xpath(LocatorUtility.getValue("AuthenticationValue_XPATH"));
    private By registrationDropDown = By.xpath(LocatorUtility.getValue("RegistrationDropDown_XPATH"));
    private By registrationValue = By.xpath(LocatorUtility.getValue("RegistrationValue_XPATH"));
    private By languageSelection = By.xpath(LocatorUtility.getValue("LanguageSelectionToggle_XPATH"));
    private By IntroductionButton = By.xpath(LocatorUtility.getValue("IntroductionToggle_XPATH"));
    private By IdentificationButton = By.xpath(LocatorUtility.getValue("IdentificationToggle_XPATH"));
    private By PublicURL = By.xpath(LocatorUtility.getValue("PublicURL_XPATH"));




    public void goToDefaultTab(){
        eleUtil.clickElementWhenReady(defaultTab,20);
    }

    public void validateVerificationDropDownValue(String expectedValue){
        String actualValue;
        actualValue = eleUtil.doGetText(verificationDropDown);
        if (actualValue.contains(expectedValue)) {
            System.out.println("Verified Expected Value as " + actualValue);
        }
        else {
            eleUtil.waitForElementToBeClickable(verificationDropDown,10);
            eleUtil.doClick(verificationDropDown);
            eleUtil.clickElementWhenReady(verificationValue,20);
            System.out.println("Expected value wasn't found changing value to expected");
        }
    }

    public void validateAuthenticationMethodDropDownValue(String expectedValue){
        String actualValue;
        actualValue = eleUtil.doGetText(authenticationDropDown);
        if (actualValue.contains(expectedValue)) {
            System.out.println("Verified Expected Value as " + actualValue);
        }
        else {
            eleUtil.waitForElementToBeClickable(authenticationDropDown,10);
            eleUtil.doClick(authenticationDropDown);
            eleUtil.clickElementWhenReady(authenticationValue,20);
            System.out.println("Expected value wasn't found changing value to expected");
        }
    }

    public void validateRegistrationTypeDropDownValue(String expectedValue){
        String actualValue;

        actualValue = eleUtil.doGetText(registrationDropDown);
        if (actualValue.contains(expectedValue)) {
            System.out.println("Verified Expected Value as " + actualValue);
        }
        else {
            eleUtil.waitForElementToBeClickable(registrationDropDown,10);
            eleUtil.doClick(registrationDropDown);
            eleUtil.clickElementWhenReady(registrationValue,20);
            System.out.println("Expected value wasn't found changing value to expected");
        }
    }

    public void validateLanguageSelectionToggle(String expectedSelection){
        String actualSelection;
        actualSelection = eleUtil.getElement(languageSelection).getAttribute("aria-checked");
        if (actualSelection.equals(expectedSelection)) {
            System.out.println("Verified Expected Value as " + actualSelection);
        }
        else {
            eleUtil.doClick(languageSelection);
            System.out.println("Expected value wasn't found changing value to expected");
        }
    }

    public void validateIntroductionToggle(String expectedSelection){
        String actualSelection;
        actualSelection = eleUtil.getElement(IntroductionButton).getAttribute("aria-checked");
        if (actualSelection.equals(expectedSelection)) {
            System.out.println("Verified Expected Value as " + actualSelection);
        }
        else {
            eleUtil.doClick(IntroductionButton);
            System.out.println("Expected value wasn't found changing value to expected");
        }
    }

    public void validateReferralSource(String ComponentValue, String expectedValue){
      String actualLocator = LocatorUtility.getValue("RegistrationToggleActual_XPATHStart") + ComponentValue + LocatorUtility.getValue("RegistrationToggleActual_XPATHEnd");
      String expectedLocator = LocatorUtility.getValue("RegistrationToggleExpected_XPATHStart") + ComponentValue + LocatorUtility.getValue("RegistrationToggleExpected_XPATHEnd");
      String actualValue;
      actualValue = eleUtil.doGetText(By.xpath(actualLocator));
        if (actualValue.equals(expectedValue)) {
            System.out.println("Verified Expected Value As "+ actualValue);
        }
        else {
            eleUtil.doClick(By.xpath(expectedLocator));
            System.out.println("Expected value wasn't found changing value to expected");
        }
    }

    public void validateScreening(String ComponentValue, String expectedValue){
        String actualLocator = LocatorUtility.getValue("RegistrationToggleActual_XPATHStart") + ComponentValue + LocatorUtility.getValue("RegistrationToggleActual_XPATHEnd");
        String expectedLocator = LocatorUtility.getValue("RegistrationToggleExpected_XPATHStart") + ComponentValue + LocatorUtility.getValue("RegistrationToggleExpected_XPATHEnd");
        String actualValue;
        actualValue = eleUtil.doGetText(By.xpath(actualLocator));
        if (actualValue.equals(expectedValue)) {
            System.out.println("Verified Expected Value As "+ actualValue);
        }
        else {
            eleUtil.doClick(By.xpath(expectedLocator));
            System.out.println("Expected value wasn't found changing value to expected");
        }
    }

    public void validateSymptoms(String ComponentValue, String expectedValue){
        String actualLocator = LocatorUtility.getValue("RegistrationToggleActual_XPATHStart") + ComponentValue + LocatorUtility.getValue("RegistrationToggleActual_XPATHEnd");
        String expectedLocator = LocatorUtility.getValue("RegistrationToggleExpected_XPATHStart") + ComponentValue + LocatorUtility.getValue("RegistrationToggleExpected_XPATHEnd");
        String actualValue;
        actualValue = eleUtil.doGetText(By.xpath(actualLocator));
        if (actualValue.equals(expectedValue)) {
            System.out.println("Verified Expected Value As "+ actualValue);
        }
        else {
            eleUtil.doClick(By.xpath(expectedLocator));
            System.out.println("Expected value wasn't found changing value to expected");
        }
    }

    public void validateScheduling(String ComponentValue, String expectedValue){
        String actualLocator = LocatorUtility.getValue("RegistrationToggleActual_XPATHStart") + ComponentValue + LocatorUtility.getValue("RegistrationToggleActual_XPATHEnd");
        String expectedLocator = LocatorUtility.getValue("RegistrationToggleExpected_XPATHStart") + ComponentValue + LocatorUtility.getValue("RegistrationToggleExpected_XPATHEnd");
        String actualValue;
        actualValue = eleUtil.doGetText(By.xpath(actualLocator));
        if (actualValue.equals(expectedValue)) {
            System.out.println("Verified Expected Value As "+ actualValue);
        }
        else {
            eleUtil.doClick(By.xpath(expectedLocator));
            System.out.println("Expected value wasn't found changing value to expected");
        }
    }

    public void validatePatientAddress(String ComponentValue, String expectedValue){
        String actualLocator = LocatorUtility.getValue("RegistrationToggleActual_XPATHStart") + ComponentValue + LocatorUtility.getValue("RegistrationToggleActual_XPATHEnd");
        String expectedLocator = LocatorUtility.getValue("RegistrationToggleExpected_XPATHStart") + ComponentValue + LocatorUtility.getValue("RegistrationToggleExpected_XPATHEnd");
        String actualValue;
        actualValue = eleUtil.doGetText(By.xpath(actualLocator));
        if (actualValue.equals(expectedValue)) {
            System.out.println("Verified Expected Value As "+ actualValue);
        }
        else {
            eleUtil.doClick(By.xpath(expectedLocator));
            System.out.println("Expected value wasn't found changing value to expected");
        }
    }

    public void validateDisabilities(String ComponentValue, String expectedValue){
        String actualLocator = LocatorUtility.getValue("RegistrationToggleActual_XPATHStart") + ComponentValue + LocatorUtility.getValue("RegistrationToggleActual_XPATHEnd");
        String expectedLocator = LocatorUtility.getValue("RegistrationToggleExpected_XPATHStart") + ComponentValue + LocatorUtility.getValue("RegistrationToggleExpected_XPATHEnd");
        String actualValue;
        actualValue = eleUtil.doGetText(By.xpath(actualLocator));
        if (actualValue.equals(expectedValue)) {
            System.out.println("Verified Expected Value As "+ actualValue);
        }
        else {
            eleUtil.doClick(By.xpath(expectedLocator));
            System.out.println("Expected value wasn't found changing value to expected");
        }
    }

    public void validateGuardian(String ComponentValue, String expectedValue){
        String actualLocator = LocatorUtility.getValue("RegistrationToggleActual_XPATHStart") + ComponentValue + LocatorUtility.getValue("RegistrationToggleActual_XPATHEnd");
        String expectedLocator = LocatorUtility.getValue("RegistrationToggleExpected_XPATHStart") + ComponentValue + LocatorUtility.getValue("RegistrationToggleExpected_XPATHEnd");
        String actualValue;
        actualValue = eleUtil.doGetText(By.xpath(actualLocator));
        if (actualValue.equals(expectedValue)) {
            System.out.println("Verified Expected Value As "+ actualValue);
        }
        else {
            eleUtil.doClick(By.xpath(expectedLocator));
            System.out.println("Expected value wasn't found changing value to expected");
        }
    }

    public void validateEmergencyContact(String ComponentValue, String expectedValue){
        String actualLocator = LocatorUtility.getValue("RegistrationToggleActual_XPATHStart") + ComponentValue + LocatorUtility.getValue("RegistrationToggleActual_XPATHEnd");
        String expectedLocator = LocatorUtility.getValue("RegistrationToggleExpected_XPATHStart") + ComponentValue + LocatorUtility.getValue("RegistrationToggleExpected_XPATHEnd");
        String actualValue;
        actualValue = eleUtil.doGetText(By.xpath(actualLocator));
        if (actualValue.equals(expectedValue)) {
            System.out.println("Verified Expected Value As "+ actualValue);
        }
        else {
            eleUtil.doClick(By.xpath(expectedLocator));
            System.out.println("Expected value wasn't found changing value to expected");
        }
    }

    public void validateIdentificationToggle(String expectedSelection){
        String actualSelection;
        actualSelection = eleUtil.getElement(IdentificationButton).getAttribute("aria-checked");
        if (actualSelection.equals(expectedSelection)) {
            System.out.println("Verified Expected Value as " + actualSelection);
        }
        else {
            eleUtil.doClick(IdentificationButton);
            System.out.println("Expected value wasn't found changing value to expected");
        }
    }

    public void validateDocumentSubmission(String ComponentValue, String expectedValue){
        String actualLocator = LocatorUtility.getValue("RegistrationToggleActual_XPATHStart") + ComponentValue + LocatorUtility.getValue("RegistrationToggleActual_XPATHEnd");
        String expectedLocator = LocatorUtility.getValue("RegistrationToggleExpected_XPATHStart") + ComponentValue + LocatorUtility.getValue("RegistrationToggleExpected_XPATHEnd");
        String actualValue;
        actualValue = eleUtil.doGetText(By.xpath(actualLocator));
        if (actualValue.equals(expectedValue)) {
            System.out.println("Verified Expected Value As "+ actualValue);
        }
        else {
            eleUtil.doClick(By.xpath(expectedLocator));
            System.out.println("Expected value wasn't found changing value to expected");
        }
    }

    public void validateConsent(String ComponentValue, String expectedValue){
        String actualLocator = LocatorUtility.getValue("RegistrationToggleActual_XPATHStart") + ComponentValue + LocatorUtility.getValue("RegistrationToggleActual_XPATHEnd");
        String expectedLocator = LocatorUtility.getValue("RegistrationToggleExpected_XPATHStart") + ComponentValue + LocatorUtility.getValue("RegistrationToggleExpected_XPATHEnd");
        String actualValue;
        actualValue = eleUtil.doGetText(By.xpath(actualLocator));
        if (actualValue.equals(expectedValue)) {
            System.out.println("Verified Expected Value As "+ actualValue);
        }
        else {
            eleUtil.doClick(By.xpath(expectedLocator));
            System.out.println("Expected value wasn't found changing value to expected");
        }
    }

    public void validateMedicalRecord(String ComponentValue, String expectedValue){
        String actualLocator = LocatorUtility.getValue("RegistrationToggleActual_XPATHStart") + ComponentValue + LocatorUtility.getValue("RegistrationToggleActual_XPATHEnd");
        String expectedLocator = LocatorUtility.getValue("RegistrationToggleExpected_XPATHStart") + ComponentValue + LocatorUtility.getValue("RegistrationToggleExpected_XPATHEnd");
        String actualValue;
        actualValue = eleUtil.doGetText(By.xpath(actualLocator));
        if (actualValue.equals(expectedValue)) {
            System.out.println("Verified Expected Value As "+ actualValue);
        }
        else {
            eleUtil.doClick(By.xpath(expectedLocator));
            System.out.println("Expected value wasn't found changing value to expected");
        }
    }

    public void validatePayment(String ComponentValue, String expectedValue){
        String actualLocator = LocatorUtility.getValue("RegistrationToggleActual_XPATHStart") + ComponentValue + LocatorUtility.getValue("RegistrationToggleActual_XPATHEnd");
        String expectedLocator = LocatorUtility.getValue("RegistrationToggleExpected_XPATHStart") + ComponentValue + LocatorUtility.getValue("RegistrationToggleExpected_XPATHEnd");
        String actualValue;
        actualValue = eleUtil.doGetText(By.xpath(actualLocator));
        if (actualValue.equals(expectedValue)) {
            System.out.println("Verified Expected Value As "+ actualValue);
        }
        else {
            eleUtil.doClick(By.xpath(expectedLocator));
            System.out.println("Expected value wasn't found changing value to expected");
        }
    }

    public void clickOnPublicURL(){
        eleUtil.scrollByPixels(250,100);
        eleUtil.doClick(PublicURL);
    }


}
