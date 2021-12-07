package com.qualitrix.pageActions;


import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.qualitrix.client.QXClient;
import com.qualitrix.pageObjects.DikshaMainPageObjects;
import com.qualitrix.pageObjects.LoginPageObjects;
import com.qualitrix.pageObjects.ProfilePageObjects;

import java.util.Properties;

/**
 * This Class has all the methods related to Profile Page.
 *
 * @author : Gurukiran H N
 * @since : 19/March/2020
 */
public class LoginPageActions {

   
    LoginPageObjects loginPageObjects = new LoginPageObjects();
    ProfilePageObjects profilePageObjects = new ProfilePageObjects();

    public LoginPageActions() {
    //    this.driver = ContextManager.getDriver();

       PageFactory.initElements(new AppiumFieldDecorator(QXClient.get().driver()), this);
        PageFactory.initElements(new AppiumFieldDecorator(QXClient.get().driver()), loginPageObjects);
        PageFactory.initElements(new AppiumFieldDecorator(QXClient.get().driver()), profilePageObjects);

    	//PageFactory.initElements(driver,DikshaMainPageObjects.class);

    }
    
    public void loginToTheUser(String username, String password) throws Exception {
    	//QXClient.get().gestures().wait(5);

        
       // 	QXClient.get().gestures().wait(3);
    	
    
    	Thread.sleep(2000);
            QXClient.get().gestures().waitAndClickElementisVisible(profilePageObjects.loginBtn);

            
            
            Thread.sleep(2000);
            QXClient.get().gestures().waitAndClickElementisVisible(profilePageObjects.clkLoginWithDikshaBtn);
            Thread.sleep(2000);

            QXClient.get().gestures().waitForElementToAppear(loginPageObjects.usernameObj);
            loginPageObjects.usernameObj.sendKeys(username);
            QXClient.get().report().info("Enter the username");
            
            QXClient.get().gestures().waitForElementToAppear(loginPageObjects.pwdEditbx);
            loginPageObjects.pwdEditbx.sendKeys(password);
            QXClient.get().report().info("Enter the password");
            Thread.sleep(2000);
            QXClient.get().gestures().waitAndClickElementisVisible(profilePageObjects.loginBtn);
            QXClient.get().report().info("Tap on login button");
            Thread.sleep(8000);
            Thread.sleep(8000);
   
           
            //QXClient.get().gestures().wait(15);
    	
    }

   

    public void tapOnLoginBtn() {
        QXClient.get().gestures().waitAndClickElementisVisible(profilePageObjects.loginBtn);
        QXClient.get().report().info("Tap on login button");
    }

    public void tapOnEyeBtn() {
        QXClient.get().gestures().waitAndClickElementisVisible(loginPageObjects.eyeBtn);
        QXClient.get().report().info("Tap on eye button");
    }

    public void tapOnLoginWithGoogle() throws Exception {
        QXClient.get().gestures().waitAndClickElementisVisible(loginPageObjects.loginWithGoogleBtn);
        QXClient.get().gestures().wait(8);
        QXClient.get().report().info("Tap on login with google");
    }

    public void tapOnGmailAccount() throws Exception {
        QXClient.get().gestures().waitAndClickElementisVisible(loginPageObjects.gmailAccount);
        QXClient.get().gestures().wait(8);
        QXClient.get().report().info("Tap on login with google");
    }

    public void selectTermsChkBxClickContinueBtn() {
        if (QXClient.get().gestures().isElementPresent(loginPageObjects.termsOfUse)) {
            QXClient.get().gestures().waitAndClickElementisVisible(loginPageObjects.gmailTermsChkbx);
            QXClient.get().gestures().waitAndClickElementisVisible(loginPageObjects.termsContinueBtn);
            QXClient.get().report().info("Select checkbox and tap on terms and condition continue button");
        }
    }

    public void tapOnTermsAndConChkBx() {
        QXClient.get().gestures().waitAndClickElementisVisible(loginPageObjects.termsCondChkBx);
        QXClient.get().report().info("Tap on terms and condition check box");
    }

    public void tapOnSignUpBtn() throws Exception {
    	QXClient.get().gestures().wait(3);
        QXClient.get().gestures().waitAndClickElementisVisible(loginPageObjects.signUpBtn);
        QXClient.get().gestures().wait(12);
        QXClient.get().report().info("Tap on signup button");
    }

 
    public void tapOnSubmitPopUpBtn() {
        if(QXClient.get().gestures().isElementPresent(loginPageObjects.submitBtn)) {
            loginPageObjects.submitBtn.click();
            QXClient.get().report().info("Tap on submit button");
        }
    }

    public void enterFullName(String fullname) {
        QXClient.get().gestures().waitAndClickElementisVisible(loginPageObjects.fullName);
        loginPageObjects.fullName.sendKeys(fullname);
        QXClient.get().report().info("Enter the full name");
    }

    public void enterMobileNum(String num) {
    	QXClient.get().gestures().waitForElementToAppear(loginPageObjects.mblNum);
        loginPageObjects.mblNum.sendKeys(num);
        QXClient.get().report().info("Enter the mobile number");
    }

    public void enterPwdFieldInRegPage(String pwd) {
    	QXClient.get().gestures().waitForElementToAppear(loginPageObjects.pwdEditbx);
        loginPageObjects.pwdEditbx.sendKeys(pwd);
        QXClient.get().report().info("Enter the password");
    }

	/*
	 * public void verifyPasswordErrorMsg(String msg) {
	 * QXClient.get().gestures().waitForElementToAppear(loginPageObjects.pwdErrorMsg
	 * ); Assert.assertTrue(QXClient.get().gestures().getText(loginPageObjects.
	 * pwdErrorMsg).equalsIgnoreCase(msg));
	 * QXClient.get().report().info("Verifying the password error message"); }
	 * 
	 * public void verifyReEnteredPasswordErrorMsg(String msg) {
	 * QXClient.get().gestures().waitForElementToAppear(loginPageObjects.
	 * pwdDoNotMatchMsg);
	 * Assert.assertTrue(QXClient.get().gestures().getText(loginPageObjects.
	 * pwdDoNotMatchMsg).equalsIgnoreCase(msg)); QXClient.get().report().
	 * info("Verifying the re-entered password error message"); }
	 */
    public void enterUserName(String username) {
    	QXClient.get().gestures().waitForElementToAppear(loginPageObjects.usernameObj);
        loginPageObjects.usernameObj.sendKeys(username);
        QXClient.get().report().info("Enter the username");
    }

    public void enterPassword(String pwd) {
    	QXClient.get().gestures().waitForElementToAppear(loginPageObjects.pwdEditbx);
        loginPageObjects.pwdEditbx.sendKeys(pwd);
        QXClient.get().report().info("Enter the password");
    }

    public void reEnterPwd(String pwd) {
    	QXClient.get().gestures().waitForElementToAppear(loginPageObjects.reEnterPwd);
        loginPageObjects.reEnterPwd.sendKeys(pwd);
        QXClient.get().report().info("Re-Enter the password");
    }

	/*
	 * public void verifyErrorMsg(String msg) {
	 * QXClient.get().gestures().waitForElementToAppear(loginPageObjects.
	 * errorSummary);
	 * Assert.assertTrue(QXClient.get().gestures().getText(loginPageObjects.
	 * errorSummary).equalsIgnoreCase(msg),"Error message is displayed");
	 * QXClient.get().report().info("Verifying the error message"); }
	 */
    
    
    
    public void loginToTheUserForLeader(String username, String password) throws Exception {
    	DikshaMainPageActions cl=new DikshaMainPageActions();
    	Thread.sleep(2000);

        QXClient.get().gestures().waitAndClickElementisVisible(profilePageObjects.clkLoginWithDikshaBtn);

            
            QXClient.get().gestures().waitForElementToAppear(loginPageObjects.usernameObj);
            loginPageObjects.usernameObj.sendKeys(username);
            QXClient.get().report().info("Enter the username");
            
            QXClient.get().gestures().waitForElementToAppear(loginPageObjects.pwdEditbx);
            loginPageObjects.pwdEditbx.sendKeys(password);
            QXClient.get().report().info("Enter the password");
            Thread.sleep(2000);
            QXClient.get().gestures().waitAndClickElementisVisible(profilePageObjects.loginBtn);
            QXClient.get().report().info("Tap on login button");
            Thread.sleep(8000);
          //  cl.clkCloseIcon();

            //QXClient.get().gestures().wait(15);
    	
    }
    public void tapOnLoginBtnInTrainingTab() {
        QXClient.get().gestures().waitAndClickElementisVisible(profilePageObjects.loginBtnInTraningTab);
        QXClient.get().report().info("Tap on login button in Training Tab");
    }
    
    public void tapOnLoginBtnInCourseTab(String username, String password) throws Exception {
    	//QXClient.get().gestures().wait(5);

        
       // 	QXClient.get().gestures().wait(3);
    	
    
    	Thread.sleep(2000);

            
            
            Thread.sleep(2000);
            QXClient.get().gestures().waitAndClickElementisVisible(profilePageObjects.clkLoginWithDikshaBtn);
            Thread.sleep(2000);

            QXClient.get().gestures().waitForElementToAppear(loginPageObjects.usernameObj);
            loginPageObjects.usernameObj.sendKeys(username);
            QXClient.get().report().info("Enter the username");
            
            QXClient.get().gestures().waitForElementToAppear(loginPageObjects.pwdEditbx);
            loginPageObjects.pwdEditbx.sendKeys(password);
            QXClient.get().report().info("Enter the password");
            Thread.sleep(2000);
            QXClient.get().gestures().waitAndClickElementisVisible(profilePageObjects.loginBtn);
            QXClient.get().report().info("Tap on login button");
            Thread.sleep(8000);
            Thread.sleep(8000);
   
           
            //QXClient.get().gestures().wait(15);
    	
    }
    
    public void verifyRegisteredEmailMessageWhileRegistering() throws Exception {
        QXClient.get().gestures().BlindWait(3000);

        QXClient.get().gestures().waitAndClickElementisVisible(profilePageObjects.loginBtn);
        QXClient.get().report().info("Clicked on Login Button");
        QXClient.get().gestures().BlindWait(3000);

        Assert.assertTrue(QXClient.get().gestures().isElementPresent(profilePageObjects.clkRegisterHere),"Register here link is not visible");
        QXClient.get().report().info("Register here link is displayed");
        QXClient.get().gestures().waitAndClickElementisVisible(profilePageObjects.clkRegisterHere);
        QXClient.get().report().info("Clicked on Register here link");
        QXClient.get().gestures().BlindWait(7000);

        QXClient.get().gestures().BlindWait(5000);
        Assert.assertTrue(QXClient.get().gestures().isElementPresent(profilePageObjects.assertRegisterPage),"Register page is not displayed");
        QXClient.get().report().info("Regsiter page is displayed");

        QXClient.get().gestures().waitAndClickElementisVisible(profilePageObjects.selectYearOfBirth);
        QXClient.get().report().info("Clicked on select year of birth");
        QXClient.get().gestures().BlindWait(5000);

        QXClient.get().gestures().waitAndClickElementisVisible(profilePageObjects.selectYear);
        QXClient.get().report().info("Clicked on select year ");
        QXClient.get().gestures().BlindWait(5000);

        QXClient.get().gestures().waitAndClickElementisVisible(profilePageObjects.nameEditTextField);
        QXClient.get().report().info("Clicked on Name edit field");
        profilePageObjects.nameEditTextField.sendKeys("Test");
        QXClient.get().gestures().BlindWait(5000);
        QXClient.get().gestures().clkBackButton();

        QXClient.get().gestures().waitAndClickElementisVisible(profilePageObjects.clkOnEmailAddress);
        QXClient.get().report().info("Clicked on Email Address ");
        QXClient.get().gestures().BlindWait(5000);

        QXClient.get().gestures().waitAndClickElementisVisible(profilePageObjects.emailEditTextField);
        QXClient.get().report().info("Clicked on email edit text field");
        QXClient.get().gestures().BlindWait(5000);
        profilePageObjects.emailEditTextField.sendKeys("dikshatest15@gmail.com");
        QXClient.get().report().info("Entered already registered email address");
        QXClient.get().gestures().clkBackButton();
        QXClient.get().gestures().BlindWait(6000);

        QXClient.get().gestures().waitAndClickElementisVisible(profilePageObjects.passwordEditTextField1);
        QXClient.get().report().info("Clicked on password edit text filed");
       // profilePageObjects.passwordEditTextField1.sendKeys("Test@123");
        QXClient.get().gestures().BlindWait(6000);
        QXClient.get().gestures().clkBackButton();


        Assert.assertTrue(QXClient.get().gestures().isElementPresent(profilePageObjects.alreadyRegisteredEmailMessage),"Already registered email address is not displayed");
        QXClient.get().report().info("Already registered email address message is displayed");
        QXClient.get().gestures().BlindWait(3000);



    }
    
    
    public void verifyDifferentLoginOptions() throws Exception {

        QXClient.get().gestures().BlindWait(3000);
        QXClient.get().gestures().waitAndClickElementisVisible(profilePageObjects.loginBtn);


        QXClient.get().gestures().BlindWait(2000);

        Assert.assertTrue(QXClient.get().gestures().isElementPresent(profilePageObjects.assertLoginPageText),"Login page is not displayed");
        QXClient.get().report().info("Login page text is displayed");

        Assert.assertTrue(QXClient.get().gestures().isElementPresent(profilePageObjects.assertLoginWithDikshaOption),"Login with Diksha option is not displayed");
        QXClient.get().report().info("Login with DIKSHA is displayed in login page");

        Assert.assertTrue(QXClient.get().gestures().isElementPresent(profilePageObjects.assertLoginWithStateSystemOption),"Login with state system is not displayed");
        QXClient.get().report().info("Login with state system is displayed in login page");

        Assert.assertTrue(QXClient.get().gestures().isElementPresent(profilePageObjects.assertSignInwithGoogleOption),"Signin with google is not displayed");
        QXClient.get().report().info("Sign with Google option is displayed in login page");
        QXClient.get().gestures().BlindWait(3000);


    }

    public void verifyRegisterHerePage() throws Exception {
        QXClient.get().gestures().BlindWait(3000);

        QXClient.get().gestures().waitAndClickElementisVisible(profilePageObjects.loginBtn);
        QXClient.get().report().info("Clicked on Login Button");
        QXClient.get().gestures().BlindWait(2000);

        Assert.assertTrue(QXClient.get().gestures().isElementPresent(profilePageObjects.clkRegisterHere),"Register here link is not visible");
        QXClient.get().report().info("Register here link is displayed");
        QXClient.get().gestures().waitAndClickElementisVisible(profilePageObjects.clkRegisterHere);
        QXClient.get().report().info("Clicked on Register here link");
        QXClient.get().gestures().BlindWait(5000);

        QXClient.get().gestures().BlindWait(5000);
        Assert.assertTrue(QXClient.get().gestures().isElementPresent(profilePageObjects.assertRegisterPage),"Register page is not displayed");
        QXClient.get().report().info("Regsiter page is displayed");

        QXClient.get().gestures().waitAndClickElementisVisible(profilePageObjects.selectYearOfBirth);
        QXClient.get().report().info("Clicked on select year of birth");
        QXClient.get().gestures().BlindWait(3000);

        QXClient.get().gestures().waitAndClickElementisVisible(profilePageObjects.selectYear);
        QXClient.get().report().info("Clicked on select year ");
        QXClient.get().gestures().BlindWait(3000);

        Assert.assertTrue(QXClient.get().gestures().isElementPresent(profilePageObjects.assertNameField),"Name field is not displayed");
        Assert.assertTrue(QXClient.get().gestures().isElementPresent(profilePageObjects.assertMobileNumber),"Mobile number field is not displayed");
        Assert.assertTrue(QXClient.get().gestures().isElementPresent(profilePageObjects.assertEmailAddress),"Email address field is not displayed");
        Assert.assertTrue(QXClient.get().gestures().isElementPresent(profilePageObjects.assertOtpMessage),"Otp message is not displayed");
        Assert.assertTrue(QXClient.get().gestures().isElementPresent(profilePageObjects.assertPasswordField),"Password field is not displayed");
        Assert.assertTrue(QXClient.get().gestures().isElementPresent(profilePageObjects.assertPasswordLimitationsMsg),"Password limitation message is not displayed");
        Assert.assertTrue(QXClient.get().gestures().isElementPresent(profilePageObjects.assertConfirmPasswordField),"Confirm Password field is not displayed");

        QXClient.get().gestures().swipeUp();
        QXClient.get().gestures().BlindWait(2000);

        Assert.assertTrue(QXClient.get().gestures().isElementPresent(profilePageObjects.assertMandatoryField),"Mandatory fields message is not displayed");
        Assert.assertTrue(QXClient.get().gestures().isElementPresent(profilePageObjects.assertTCcheckBox),"Terms and conditions checkbox is not displayed");

        QXClient.get().gestures().BlindWait(3000);

        QXClient.get().gestures().waitAndClickElementisVisible(profilePageObjects.nameEditTextField);
        QXClient.get().report().info("Clicked on Name edit field");
        profilePageObjects.nameEditTextField.sendKeys("Test");
        QXClient.get().gestures().BlindWait(3000);
        QXClient.get().gestures().clkBackButton();

        QXClient.get().gestures().waitAndClickElementisVisible(profilePageObjects.clkOnEmailAddress);
        QXClient.get().report().info("Clicked on Email Address ");
        QXClient.get().gestures().BlindWait(2000);

        QXClient.get().gestures().waitAndClickElementisVisible(profilePageObjects.emailEditTextField);
        QXClient.get().report().info("Clicked on email edit text field");
        QXClient.get().gestures().BlindWait(2000);
        profilePageObjects.emailEditTextField.sendKeys("sunbird");
        QXClient.get().report().info("Entered already registered email address");
        QXClient.get().gestures().clkBackButton();
        QXClient.get().gestures().BlindWait(3000);

        QXClient.get().gestures().waitAndClickElementisVisible(profilePageObjects.passwordEditTextField1);
        QXClient.get().report().info("Clicked on password edit text filed");
        QXClient.get().gestures().BlindWait(3000);
        QXClient.get().gestures().clkBackButton();

        Assert.assertTrue(QXClient.get().gestures().isElementPresent(profilePageObjects.validateErrorMsgForInvalidEntry),"Error message for invalid entry is not displayed");
        QXClient.get().report().info("Error message is displayed for Invalid entry");
        QXClient.get().gestures().BlindWait(3000);





    }

    public void verifySubPersonaInGuestUser() throws Exception {
        QXClient.get().gestures().BlindWait(3000);

        QXClient.get().gestures().waitAndClickElementisVisible(profilePageObjects.clkAdd);
        QXClient.get().report().info("Clicked on Add in profile page");
        QXClient.get().gestures().BlindWait(3000);
        QXClient.get().gestures().swipeUp();

        Assert.assertTrue(!QXClient.get().gestures().isElementPresent(profilePageObjects.assertSubPersona),"Sub persona is present for guest role");
        QXClient.get().report().info("Sub persona is not displayed for Guest User");
        QXClient.get().gestures().BlindWait(2000);
    }


}


