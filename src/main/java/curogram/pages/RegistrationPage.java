package curogram.pages;

import curogram.dataproviders.LocatorUtility;
import curogram.utils.ElementUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegistrationPage {
    private WebDriver driver;
    private ElementUtil eleUtil;

    public RegistrationPage(WebDriver driver) {
        this.driver=driver;
        eleUtil = new ElementUtil(driver);
    }

    private By languageSelection = By.xpath(LocatorUtility.getValue("EnglishLanguageSelection_XPATH"));
    private By locationSelection = By.xpath(LocatorUtility.getValue("LocationSelection_XPATH"));
    private By TimeSelection = By.xpath(LocatorUtility.getValue("TimeSelection_PATH"));
    private By PhoneNumber = By.xpath(LocatorUtility.getValue("PhoneNumber_XPATH"));
    private By NextButton = By.xpath(LocatorUtility.getValue("NextButton_XPATH"));
    private By SkipButton = By.xpath(LocatorUtility.getValue("SkipButton_XPATH"));
    private By ReferralSource = By.xpath(LocatorUtility.getValue("ReferralSource_XPATH"));
    private By AddNewFamilyMember = By.xpath(LocatorUtility.getValue("AddNewFamilyMember_XPATH"));
    private By FirstNameInput = By.xpath(LocatorUtility.getValue("FirstNameInput_XPATH"));
    private By LastNameInput = By.xpath(LocatorUtility.getValue("LastNameInput_XPATH"));
    private By NoHealthInsurance = By.xpath(LocatorUtility.getValue("NoHealthInsurance_XPATH"));
    private By IdentificationDropDown = By.xpath(LocatorUtility.getValue("IdentificationDropDown_XPATH"));
    private By NoID = By.xpath(LocatorUtility.getValue("NoID_XPATH"));
    private By MRRFirstNameInput = By.xpath(LocatorUtility.getValue("MRRFirstNameInput_XPATH"));
    private By MRRLastNameInput = By.xpath(LocatorUtility.getValue("MRRLastNameInput_XPATH"));
    private By MRRRelationDropDown = By.xpath(LocatorUtility.getValue("MRRRelationDropDown_XPATH"));
    private By MRRRelationValue = By.xpath(LocatorUtility.getValue("MRRRelationValue_XPATH"));
    private By AgreeButton = By.xpath(LocatorUtility.getValue("AgreeButton_XPATH"));
    private By Signature = By.xpath(LocatorUtility.getValue("Signature_XPATH"));
    private By AgreeAndSignButton = By.xpath(LocatorUtility.getValue("AgreeAndSignButton_XPATH"));


    public void selectLanguage(){
        eleUtil.switchesNewTab();
        eleUtil.waitForElementToBeClickable(languageSelection,20);
        eleUtil.doClick(languageSelection);
    }

    public void selectLocation(){
        eleUtil.waitForElementToBeClickable(locationSelection,20);
        eleUtil.doClick(locationSelection);
    }

    public void selectTime(){
        eleUtil.waitForElementToBeClickable(TimeSelection,20);
        eleUtil.doClick(TimeSelection);
    }

    public void enterPhoneNumber(String phoneNumber){
        eleUtil.waitForElementToBeClickable(PhoneNumber,20);
        eleUtil.doSendKeys(PhoneNumber,phoneNumber);
        eleUtil.doClick(NextButton);
    }

    public void selectPatient(){
        eleUtil.waitForElementToBeClickable(AddNewFamilyMember,20);
        eleUtil.doClick(AddNewFamilyMember);
    }

    public void addNewPatient(String fname, String lname){
        eleUtil.waitForElementToBeClickable(FirstNameInput,20);
        eleUtil.doSendKeys(FirstNameInput, fname);
        eleUtil.doSendKeys(LastNameInput, lname);
        eleUtil.doClick(NextButton);
    }

    public void enterPatientAddress(){
        eleUtil.waitForElementToBeClickable(SkipButton,20);
        eleUtil.doClick(SkipButton);
    }

    public void selectReferral(){
        eleUtil.waitForElementToBeClickable(NextButton,20);
        eleUtil.doClick(ReferralSource);
        eleUtil.doClick(NextButton);
    }

    public void selectScreening(){
        eleUtil.waitForElementToBeClickable(SkipButton,20);
        eleUtil.doClick(SkipButton);
    }

    public void selectSymptoms(){
        eleUtil.waitForElementToBeClickable(SkipButton,20);
        eleUtil.doClick(SkipButton);
    }

    public void selectGuardian(){
        eleUtil.waitForElementToBeClickable(SkipButton,20);
        eleUtil.doClick(SkipButton);
    }

    public void selectDisability(){
        eleUtil.waitForElementToBeClickable(SkipButton,20);
        eleUtil.doClick(SkipButton);
    }

    public void enterEmergencyContact(){
        eleUtil.waitForElementToBeClickable(MRRLastNameInput,20);
        eleUtil.doClick(SkipButton);
    }

    public void selectInsuranceInfo(){
        eleUtil.waitForElementToBeClickable(NextButton,20);
        eleUtil.doClick(NoHealthInsurance);
        eleUtil.doClick(NextButton);
    }

    public void selectIdentification(){
        eleUtil.waitForElementToBeClickable(NextButton,20);
        eleUtil.doClick(IdentificationDropDown);
        eleUtil.doClick(NoID);
        eleUtil.doClick(NextButton);
    }

    public void enterDocumentSubmission(){
        eleUtil.waitForElementToBeClickable(SkipButton,20);
        eleUtil.doClick(SkipButton);
    }

    public void enterPayment(){
        eleUtil.waitForElementToBeClickable(SkipButton,20);
        eleUtil.doClick(SkipButton);
    }

    public void selectConsent(){
        eleUtil.waitForElementToBeClickable(SkipButton,20);
        eleUtil.doClick(SkipButton);
    }

    public void enterMRRAuthorization(String fname, String lname){
        eleUtil.waitForElementToBeClickable(MRRFirstNameInput,20);
        eleUtil.doSendKeys(MRRFirstNameInput, fname);
        eleUtil.doSendKeys(MRRLastNameInput, lname);
        eleUtil.doClick(MRRRelationDropDown);
        eleUtil.doClick(MRRRelationValue);
        eleUtil.doClick(AgreeButton);
    }

    public void enterSignature(){
        eleUtil.waitForElementToBeClickable(AgreeAndSignButton,20);
        eleUtil.doActionAndMove(Signature,135,15,100,60,200,70);
        eleUtil.doClick(AgreeAndSignButton);
    }
}
