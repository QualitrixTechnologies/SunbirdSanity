package com.qualitrix.pageObjects;

import cucumber.api.java.en.And;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidBy;
import io.appium.java_client.pagefactory.AndroidFindAll;
import io.appium.java_client.pagefactory.AndroidFindBy;

/**
 * This Class has all the Objects related to Profile Page.
 *
 * @author Gurukiran H N
 * @version 1.0
 * @since 19/March/2020
 */
public class ProfilePageObjects {

    @AndroidFindAll({
            @AndroidBy(xpath = "//android.widget.Button[@text='LOGIN']"),
            @AndroidBy(xpath = "//android.widget.Button[@text='LOGIN ']")
    })
    public MobileElement loginBtn;

    @AndroidFindBy(xpath = "//*[contains(@text,'Training(s) Attended')]")
    public MobileElement trainingAttendedSec;

    @AndroidFindBy(xpath = "//*[contains(@text,'Small AutomationCourseContent')]")
    public MobileElement courseObj;
    
    @AndroidFindAll({
        @AndroidBy(xpath = "//android.widget.Button[@text='google-logo Sign in with Google']"),
})
public MobileElement signInwithGoogle;
  
    
    
    @AndroidFindAll({
        @AndroidBy(xpath = "//android.view.View[@text='Use another account']"),
})
public MobileElement clkUseAnotherAccount;
    
    @AndroidFindAll({
        @AndroidBy(xpath = "//android.widget.Button[@text='ntp.net.in']//following::android.view.View[3]"),
})
public MobileElement emailEnter;
  
    @AndroidFindAll({
        @AndroidBy(xpath = "//android.widget.Button[@text='Next']"),
})
public MobileElement clkEmailNext;
    
    @AndroidFindAll({
        @AndroidBy(xpath = "//android.view.View[@text='dikshatest13@gmail.com']//following::android.view.View[5]"),
})
public MobileElement emailPasswordEnter;
  
    @AndroidFindAll({
        @AndroidBy(xpath = "//android.view.View[@text='Diksha R']"),
})
public MobileElement verifyUsrnameGmailInProfSec;

    @AndroidFindAll({
            @AndroidBy(xpath = "//android.view.View[@text='Diksha r']"),
            @AndroidBy(xpath = "//android.view.View[@text='Diksha R']")
    })
    public MobileElement verifyUsrnameGmailInMenuSec;

    @AndroidFindAll({
            @AndroidBy(xpath = "//android.view.View[@text='logout Log out']"),
            @AndroidBy(xpath = "//android.widget.TextView[@text='Log out']"),
            @AndroidBy(xpath = "//android.view.View[@text='Log out']"),
            @AndroidBy(xpath = "//android.widget.Button[@text='Log out']"),
    })
    public MobileElement verifyLogOutForeGmailInMenuSec;
  
    @AndroidFindAll({
        @AndroidBy(xpath = "//android.widget.Button[@text='Login']"),
})
public MobileElement loginBtnInTraningTab;
    
    @AndroidFindAll({
        @AndroidBy(xpath = "//android.widget.ListView[@index='0']"),
})
public MobileElement clkRoleDropdown;
    
    @AndroidFindAll({
        @AndroidBy(xpath = "//android.view.View[@text='Head Teacher & Officials']"),
})
public MobileElement sltHeadTeachersAndOfficials;
    
    @AndroidFindAll({
        @AndroidBy(xpath = "//android.view.View[@text='Student']"),
})
public MobileElement sltStudent;
    
    @AndroidFindAll({
        @AndroidBy(xpath = "//android.view.View[@text='Parent']"),
})
public MobileElement sltParent;
    
    @AndroidFindAll({
        @AndroidBy(xpath = "//android.widget.Button[@text='SUBMIT']"),
})
public MobileElement clkSubmit;

    
    @AndroidFindAll({
        @AndroidBy(xpath = "//android.view.View[@text='Select Subrole']"),
})
public MobileElement clkSubRoleDropdown;

    @AndroidFindAll({
        @AndroidBy(xpath = "//android.view.View[@text='Select Subrole']//following::android.view.View[@text='Headmaster']"),
})
public MobileElement sltSubRoleDropdown;
    
    @AndroidFindAll({
        @AndroidBy(xpath = "//android.widget.Button[@text='Submit']"),
})
public MobileElement clkSubmitEditProfile;


    @AndroidFindBy(xpath = "//android.widget.Button[@text='app-logo Login with DIKSHA']")
    public MobileElement clkLoginWithDikshaBtn;


    @AndroidFindAll({
        @AndroidBy(xpath = "//android.widget.Button[@text='google-logo Sign in with Google']"),
})
public MobileElement SignWithGoogle;
  
    
    @AndroidFindBy(xpath = "//android.view.View[@text='Discover content as a']")
    public MobileElement assertDiscoverContentLabel;
    
    @AndroidFindBy(xpath = "//android.view.View[@text='Content preference']")
    public MobileElement assertContentPreferenceLabelProfile;
    
    @AndroidFindBy(xpath = "//android.view.View[@text='ROLE']")
    public MobileElement assertRoleContentPreferenceLabelProfile;
    
    @AndroidFindBy(xpath = "//android.view.View[@text='BOARD']")
    public MobileElement assertBoardContentPreferenceLabelProfile;
    
    @AndroidFindBy(xpath = "//android.view.View[@text='MEDIUM']")
    public MobileElement assertMediumContentPreferenceLabelProfile;
    
    @AndroidFindBy(xpath = "//android.view.View[@text='CLASS']")
    public MobileElement assertClassContentPreferenceLabelProfile;
    
    @AndroidFindBy(xpath = "//android.view.View[@text='SUBJECTS']")
    public MobileElement assertSubjectContentPreferenceLabelProfile;
    
    @AndroidFindBy(xpath = "//android.view.View[@text='DISTRICT']")
    public MobileElement assertDistrictContentPreferenceLabelProfile;
    
    @AndroidFindBy(xpath = "//android.view.View[@text='STATE']")
    public MobileElement assertStateContentPreferenceLabelProfile;
    
    @AndroidFindAll({
        @AndroidBy(xpath = "//android.view.View[@text='DISTRICT']//following::android.widget.Image"),
            @AndroidBy(xpath = "//android.view.View[@text='DISTRICT']//following::android.widget.Button[1]"),
})
public MobileElement clkEditLocation;

    @AndroidFindBy(xpath = "//android.view.View[@text='Choose content preferences']")
    public MobileElement assertChooseContentPreferenceLabelLocationEdit;


    @AndroidFindAll({
            @AndroidBy(xpath = "//android.widget.TextView[@text='dikshatest13@gmail.com']"),
            @AndroidBy(xpath = "//android.widget.TextView[@text='dikshatest15@gmail.com']"),
    })
    public MobileElement clkExistingGmailId;
    
    
    @AndroidFindAll({
       @AndroidBy(xpath = "//android.widget.Button[@text='Update']")})
   public MobileElement clkonprofilepageupdatebutton;
    
    
   @AndroidFindBy(xpath = "//android.view.View[@text='ID as requested by your State, Board or Org']//following::android.widget.EditText[1]")
   public MobileElement enteridasrequestedbyyourStateBoardOrg;
   
   @AndroidFindBy(xpath = "//android.view.View[@text='Your ID from State/Board/Org:']")
   public MobileElement youridfromstatetext;
   
   @AndroidFindBy(xpath = "//android.view.View[@text='Your ID from State/Board/Org:']//following::android.view.View[1]")
   public MobileElement resulttextofyourid;

   @AndroidFindBy(xpath = "//android.view.View[@text='Register here']")
   public MobileElement clkRegisterHere;

   @AndroidFindAll({
           @AndroidBy(xpath = "//android.view.View[@text='Register on DIKSHA']"),
           @AndroidBy(xpath = "//android.view.View[@text='Register on SUNBIRD']")
   })
   public MobileElement assertRegisterPage;

  @AndroidFindBy(xpath = "//android.view.View[@text='Select year of birth']")
   public MobileElement selectYearOfBirth;
  @AndroidFindBy(xpath = "//android.view.View[@text='2021']")
   public MobileElement selectYear;
  @AndroidFindBy(xpath = "//android.view.View[contains(@text,'Name')]//following::android.widget.EditText[1]")
   public MobileElement nameEditTextField;
  @AndroidFindBy(xpath = "//android.view.View[@text='Email address']")
   public MobileElement clkOnEmailAddress;
  @AndroidFindBy(xpath = "//android.view.View[contains(@text,'Name')]//following::android.widget.EditText[2]")
   public MobileElement emailEditTextField;
  @AndroidFindBy(xpath = "//android.view.View[contains(@text,'Name')]//following::android.widget.EditText[3]")
  public MobileElement passwordEditTextField1;
  @AndroidFindBy(xpath = "//android.view.View[@text='Your email address is already registered']")
   public MobileElement alreadyRegisteredEmailMessage;

  @AndroidFindBy(xpath = "//android.widget.TextView[@text='Login to DIKSHA']")
  public MobileElement assertLoginPageText;
 @AndroidFindBy(xpath = "//android.widget.Button[@text='app-logo Login with DIKSHA']")
  public MobileElement assertLoginWithDikshaOption;
 @AndroidFindBy(xpath = "//android.widget.Button[@text='Login with state system']")
  public MobileElement assertLoginWithStateSystemOption;
 @AndroidFindBy(xpath = "//android.widget.Button[@text='google-logo Sign in with Google']")
  public MobileElement assertSignInwithGoogleOption;


    @AndroidFindBy(xpath = "//android.view.View[contains(@text,'Name')]")
    public MobileElement assertNameField;



    @AndroidFindBy(xpath = "//android.view.View[@text='Mobile Number']")
    public MobileElement assertMobileNumber;


    @AndroidFindBy(xpath = "//android.view.View[@text='Email address']")
    public MobileElement assertEmailAddress;


    @AndroidFindBy(xpath = "//android.view.View[@text='You will receive an OTP to verify your mobile number or email address']")
    public MobileElement assertOtpMessage;


    @AndroidFindBy(xpath = "//android.view.View[@text='Password*']")
    public MobileElement assertPasswordField;


    @AndroidFindBy(xpath = "//android.view.View[contains(@text,'Your password must contain a minimum of 8 ')]")
    public MobileElement assertPasswordLimitationsMsg;


    @AndroidFindBy(xpath = "//android.view.View[contains(@text,'Confirm Password')]")
    public MobileElement assertConfirmPasswordField;


    @AndroidFindBy(xpath = "//android.view.View[contains(@text,'Fields marked with an asterisk (*) are mandatory')]")
    public MobileElement assertMandatoryField;


    @AndroidFindAll({
            @AndroidBy(xpath = "//android.widget.CheckBox[contains(@text,'I understand and accept the DIKSHA Terms of Use')]"),
            @AndroidBy(xpath = "//android.widget.CheckBox[contains(@text,'I understand and accept the SUNBIRD Terms of Use')]"),
    })

    public MobileElement assertTCcheckBox;


    @AndroidFindBy(xpath = "//android.view.View[@text='Enter a valid email address']")
    public MobileElement validateErrorMsgForInvalidEntry;


    @AndroidFindBy(xpath = "//android.widget.Button[@text='add Subjects']")
    public MobileElement clkAdd;


    @AndroidFindBy(xpath = "//android.view.View[contains(@text,'Subrole')]")
    public MobileElement assertSubPersona;


    @AndroidFindBy(xpath = "//android.widget.Button[@text='edit District']")
    public MobileElement clkOnLocationEditImage;


    @AndroidFindBy(xpath = "//android.view.View[@text='Choose content preferences']")
    public MobileElement assertChooseContentPreferencesLabel;



    @AndroidFindBy(xpath = "//android.view.View[@text='Profile details']")
    public MobileElement assertProfileDetailsLabel;


    @AndroidFindBy(xpath = "//android.view.View[@text='Device location']")
    public MobileElement assertDeviceLocationLabel;






    
}




