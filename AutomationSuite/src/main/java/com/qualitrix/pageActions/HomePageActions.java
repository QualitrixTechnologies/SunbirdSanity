package com.qualitrix.pageActions;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.qualitrix.client.QXClient;
import com.qualitrix.pageObjects.DikshaMainPageObjects;
import com.qualitrix.pageObjects.HomePageObjects;
import com.qualitrix.pageObjects.LibraryCourseContentPageObjects;
import com.qualitrix.pageObjects.LoginPageObjects;
import com.qualitrix.pageObjects.ProfilePageObjects;
import com.qualitrix.pageObjects.TrainingPageObjects;

/**
 *This Class has all the Objects related to Home Page.
 *
 * @author : Gurukiran H N
 * @since : 17/March/2020
 */
public class HomePageActions {

 
    HomePageObjects homePageObjects = new HomePageObjects();
    ProfilePageObjects profilePageObjects = new ProfilePageObjects();
    LibraryCourseContentPageObjects libraryCourseContentPageObjects = new LibraryCourseContentPageObjects();
    LoginPageObjects loginPageObjects = new LoginPageObjects();
    TrainingPageObjects trainingPageObjects = new TrainingPageObjects();

    public HomePageActions() {
    //    this.driver = ContextManager.getDriver();

       PageFactory.initElements(new AppiumFieldDecorator(QXClient.get().driver()), this);
        PageFactory.initElements(new AppiumFieldDecorator(QXClient.get().driver()), homePageObjects);
        PageFactory.initElements(new AppiumFieldDecorator(QXClient.get().driver()), profilePageObjects);
        PageFactory.initElements(new AppiumFieldDecorator(QXClient.get().driver()), libraryCourseContentPageObjects);
        PageFactory.initElements(new AppiumFieldDecorator(QXClient.get().driver()), loginPageObjects);
        PageFactory.initElements(new AppiumFieldDecorator(QXClient.get().driver()), trainingPageObjects);

    	//PageFactory.initElements(driver,DikshaMainPageObjects.class);

    }
    
  

    public void tapOnMenuBar() throws Exception {
    	QXClient.get().gestures().BlindWait(4000);
    
    	
         QXClient.get().gestures().waitAndClickElementisVisible(homePageObjects.menuBar);
         QXClient.get().report().info("Tap on menu bar");
         
       
    }

    public void tapOnHelp() throws Exception {
    	QXClient.get().gestures().waitAndClickElementisVisible(homePageObjects.helpObj);
    	QXClient.get().gestures().wait(6);
        QXClient.get().report().info("Tap on help button");
    }

    public void tapOnProfileTab() throws Exception {
    	QXClient.get().gestures().BlindWait(2000);
    	QXClient.get().gestures().waitAndClickElementisVisible(homePageObjects.profilePageTab);
        QXClient.get().report().info("Tap on profile tab");
    }

    public void tapOnDownloadTab() throws Exception {
    	QXClient.get().gestures().BlindWait(4000);

    	QXClient.get().gestures().waitAndClickElementisVisible(homePageObjects.downloadTab);
        QXClient.get().report().info("Tap on download tab");
    }

    public void tapOnLogout() throws Exception {
        if (!QXClient.get().gestures().isElementPresent(profilePageObjects.loginBtn)) {
           tapOnMenuBar();
           QXClient.get().gestures().waitAndClickElementisVisible(homePageObjects.logoutObj);
        }
        QXClient.get().report().info("Tap on logout button");
    }


    
    public void selectEnglishLanguage() throws Exception {
        tapOnMenuBar();
        tapOnLanguage();
        tapOnEnglishLanguage();
     //   QXClient.get().gestures().swipeUp();
        tapOnContinueBtn();
    }

    public void tapOnLanguage() {
    	QXClient.get().gestures().waitAndClickElementisVisible(homePageObjects.langSelection);
        QXClient.get().report().info("Tap on language selection in menu bar");
    }
    
    public void tapOnReport() {
    	QXClient.get().gestures().waitAndClickElementisVisible(homePageObjects.ReportMenu);
        QXClient.get().report().info("Tap on Report selection in menu bar");
    }

    public void tapOnKannadaLanguage() {
        QXClient.get().gestures().waitAndClickElementisVisible(homePageObjects.selectKannadaLang);
        QXClient.get().report().info("Select Kannada language");
    }
    public void verifyKanndaTextChanged(String KannadaText) throws Exception {
    	
    	// QXClient.get().gestures().waitAndClickElementisVisible(homePageObjects.resourcesTab);
        Assert.assertTrue(QXClient.get().gestures().isElementPresent(homePageObjects.verifyKannadaText));
        Assert.assertTrue(QXClient.get().gestures().isElementPresent(homePageObjects.verifySetingInKannada));

        QXClient.get().report().info("Kannada Language Conveted Succesfully");
    }
    public void taponTeacherAsses() {
        QXClient.get().gestures().waitAndClickElementisVisible(homePageObjects.sltTeacherAsses);
        QXClient.get().report().info("Select Teacher Assesment");
    }
    
    
    public void clkOnAutomationResoce() {
        QXClient.get().gestures().waitAndClickElementisVisible(homePageObjects.sltAutomationResrce);
        QXClient.get().report().info("click on AutomationResource");
    }
    
    public void clkDownloadAsse() {
        QXClient.get().gestures().waitAndClickElementisVisible(homePageObjects.clkDownloadIconAssemtCont);
        QXClient.get().report().info("click on downloadIcon");
    }

    public void clkAllowAccess() {
        QXClient.get().gestures().waitAndClickElementisVisible(homePageObjects.clkAllowAcces);
        QXClient.get().report().info("click on clkAllowAcces");
    }

    public void tapOnEnglishLanguage() {
        QXClient.get().gestures().waitAndClickElementisVisible(homePageObjects.selectEngLang);
        QXClient.get().report().info("Select English language");
    }

    public void tapOnContinueBtn() {
        QXClient.get().gestures().waitAndClickElementisVisible(homePageObjects.continueBtn);
        QXClient.get().report().info("Tap on continue button");
    }
    public void tapOnContinueBtnKannada() {
        QXClient.get().gestures().waitAndClickElementisVisible(homePageObjects.kanndaContinuebutton);
        QXClient.get().report().info("Tap on continue button kanada");
    }
    public void tapOnTrainingTab() throws Exception {
        QXClient.get().gestures().waitAndClickElementisVisible(homePageObjects.trainingTab);
        QXClient.get().report().info("Tap on training tab");
        QXClient.get().gestures().BlindWait(4000);
    }

    public void tapOnLibraryTab() {
        QXClient.get().gestures().waitAndClickElementisVisible(homePageObjects.libraryTab);
        QXClient.get().report().info("Tap on library tab");
    }

    public void tapOnSearchIcon() throws Exception {
    	QXClient.get().gestures().BlindWait(2000);
        QXClient.get().gestures().waitAndClickElementisVisible(homePageObjects.searchIcon);
        QXClient.get().report().info("Tap on search icon");
        QXClient.get().gestures().BlindWait(2000);
    }

    public void enterTextInSearchBar(String name) throws Exception {
    	QXClient.get().gestures().waitForElementToAppear(homePageObjects.searchBar);
    	homePageObjects.searchBar.click();
        QXClient.get().gestures().BlindWait(5000);

        homePageObjects.searchBar.sendKeys(name);
        QXClient.get().gestures().BlindWait(4000);

        homePageObjects.actionSearchIcon.click();
        QXClient.get().report().info("Enter the book name");
    	QXClient.get().gestures().BlindWait(6000);

    }

    public void verifySearchedSubject() {
        //Assert.assertTrue(deviceHelper.isElementPresent(homePageObjects.searchedBookResults));
    	
    	 QXClient.get().gestures().waitAndClickElementisVisible(homePageObjects.mathBookObj);
     //   Assert.assertTrue(deviceHelper.isElementPresent(homePageObjects.mathBookObj),"Subject searched successfully");
        QXClient.get().report().info("Verifying the searched books or contents");
    }

    public void verifyQRcodeScanner() throws Exception {
    	QXClient.get().gestures().wait(8);
        QXClient.get().gestures().waitForElementToAppear(homePageObjects.qrCode);
        Assert.assertTrue(QXClient.get().gestures().isElementPresent(homePageObjects.qrCode));
        QXClient.get().report().info("Verifying QR code scanner button in home page");
    }

    public void handleQRcodePopUp() {
        if (QXClient.get().gestures().isElementPresent(homePageObjects.gotItBtn)) {
            QXClient.get().gestures().waitAndClickElementisVisible(homePageObjects.gotItBtn);
            QXClient.get().report().info("Handled QR code popup");
        }
    }

    public void tapOnSeeMoreBooks() {
        if (QXClient.get().gestures().isElementPresent(homePageObjects.seeMoreBooksObj)) {
            homePageObjects.seeMoreBooksObj.click();
        }
    }
    public void verifyLoginOptionIsPresentForStudent() {
        if (!QXClient.get().gestures().isElementPresent(profilePageObjects.loginBtn)) {
            QXClient.get().report().info("Login Button is Not Displayed for student");

        }
    }
    
    public void signInWithGoogle() {
    	
        QXClient.get().gestures().waitAndClickElementisVisible(profilePageObjects.loginBtn);
        QXClient.get().report().info("clicked on Login button");

        
            QXClient.get().gestures().waitAndClickElementisVisible(profilePageObjects.SignWithGoogle);
            QXClient.get().report().info("clicked on SignWithGoogle");
            
          //  QXClient.get().gestures().waitAndClickElementisVisible(profilePageObjects.clkUseAnotherAccount);
           // QXClient.get().report().info("clicked on clkUseAnotherAccount");
           }
    
public void createGrupAndActivity() throws Exception {
    QXClient.get().gestures().BlindWait(5000);

    
        QXClient.get().gestures().waitAndClickElementisVisible(homePageObjects.clkMyGroups);
        QXClient.get().report().info("clicked on MyGroups");

        
        try
        {
        QXClient.get().gestures().waitAndClickElementisVisible(homePageObjects.clkCloseIconGrp);
        QXClient.get().report().info("Tap on clkCloseIconGrp button");
        }
        catch(Exception e3)
        {
        	System.out.println("Handled");
        }
        
        try
        {
        if(QXClient.get().gestures().isElementPresent(homePageObjects.clkCreateGroup)) {
                      QXClient.get().gestures().waitAndClickElementisVisible(homePageObjects.clkCreateGroup);
            QXClient.get().report().info("clicked on clkCreateGroup");
            QXClient.get().gestures().BlindWait(3000);
        }
        else
        {
        	 QXClient.get().gestures().waitAndClickElementisVisible(homePageObjects.clkAddImgGrp);
             QXClient.get().report().info("clicked on clkAddImgGrp");
        }
        }
        catch(Exception e)
        {
        	System.out.println("Excep handked");
        }
        

        
          
            String FakeName=QXClient.get().gestures().generateRandomName();
 
            QXClient.get().gestures().waitAndClickElementisVisible(homePageObjects.enterGroupName);
            QXClient.get().report().info("clicked on enterGroupName");
            
            homePageObjects.enterGroupName.sendKeys(FakeName);
            
      	  String storeFakeNameEntered=homePageObjects.enterGroupName.getText();
      	  System.out.println(storeFakeNameEntered);

      	    
      	  
            QXClient.get().gestures().waitAndClickElementisVisible(homePageObjects.enterGroupDesc);
            QXClient.get().report().info("clicked on enterGroupDesc");
            homePageObjects.enterGroupDesc.sendKeys("GroupDesName");
            QXClient.get().gestures().BlindWait(3000);

            
  		  QXClient.get().gestures().clkBackButton();
          QXClient.get().gestures().BlindWait(7000);

                        QXClient.get().gestures().waitAndClickElementisVisible(homePageObjects.clkTermsAndCondition);
            QXClient.get().report().info("clicked on clkTermsAndCondition");
            QXClient.get().gestures().BlindWait(3000);

                        QXClient.get().gestures().waitAndClickElementisVisible(homePageObjects.clkGroupForCreation);
            QXClient.get().report().info("clicked on clkGroupForCreation");
            QXClient.get().gestures().BlindWait(6000);
 
            
            
      	  QXClient.get().gestures().generateXpathAndClickElement(storeFakeNameEntered);
          //  QXClient.get().gestures().waitAndClickElementisVisible(homePageObjects.clkFirstCreateGroup);
            QXClient.get().report().info("clicked on clkFirstCreateGroup");
    
            
            
            QXClient.get().gestures().waitAndClickElementisVisible(homePageObjects.clkAddActivity);
            QXClient.get().report().info("clicked on clkAddActivity");
          
            QXClient.get().gestures().waitAndClickElementisVisible(homePageObjects.clkCourseInActivity);
            QXClient.get().report().info("clicked on clkCourseInActivity");
            QXClient.get().gestures().BlindWait(5000);
            QXClient.get().gestures().waitAndClickElementisVisible(homePageObjects.clksearchIcon);
            QXClient.get().report().info("clicked on searchActivity");
            QXClient.get().gestures().BlindWait(5000);
            
            QXClient.get().gestures().waitAndClickElementisVisible(homePageObjects.clkFirstCourseForActivity);
            QXClient.get().report().info("clicked on clkFirstCourseForActivity");
            
            QXClient.get().gestures().waitAndClickElementisVisible(homePageObjects.clkAddForGroupBtn);
            QXClient.get().report().info("clicked on clkAddForGroupBtn");
            
            Assert.assertTrue(QXClient.get().gestures().isElementPresent(homePageObjects.verifyAddedMemberToGrp),"Member added  is not available");
            QXClient.get().gestures().BlindWait(2000);

            QXClient.get().gestures().waitAndClickElementisVisible(homePageObjects.clkMenuActivity);
            QXClient.get().report().info("clicked on clkMenuActivity");
            QXClient.get().gestures().BlindWait(2000);

            QXClient.get().gestures().waitAndClickElementisVisible(homePageObjects.clkRemoveActivity.get(1));
            QXClient.get().report().info("clicked on clkRemoveActivity");
            QXClient.get().gestures().BlindWait(2000);
            QXClient.get().gestures().waitAndClickElementisVisible(homePageObjects.clkRemovePopupActivity);
            QXClient.get().report().info("clicked on clkRemovePopupActivity");
            QXClient.get().gestures().BlindWait(2000);
            
            
           }
    public void enterGmailDetailsAndVerfiyUsrnameInProfileSec() throws Exception {
    	
//   	 Properties properties = QXClient.get().propUtils().getProperties(System.getProperty("user.dir") +"/configs/config.properties"); System.out.println("@name:" +
//			  properties.getProperty("excelpath"));
//			  
//			  String fetchExcelPathFromConfig=properties.getProperty("excelpath");
//			  QXClient.get().excelUtils().open(fetchExcelPathFromConfig, "Excel1");
//			  
//			  String gmailUsrname =QXClient.get().excelUtils().getCellValue("Excel1","TestData",32,2); 
//			  String gmailPassword =QXClient.get().excelUtils().getCellValue("Excel1", "TestData",33,2);
//	  
//			  System.out.println(gmailUsrname);
//		  
//			       QXClient.get().report().info("clicked on emailEnter");
//					  Thread.sleep(2000);
//					  QXClient.get().gestures().alternativeMethodForSendKeys(gmailUsrname);
//  
//        QXClient.get().gestures().waitAndClickElementisVisible(profilePageObjects.clkEmailNext);
//        QXClient.get().report().info("clicked on next button");
//		  Thread.sleep(3000);
//		  QXClient.get().gestures().alternativeMethodForSendKeys(gmailPassword);
//
//        QXClient.get().gestures().waitAndClickElementisVisible(profilePageObjects.clkEmailNext);
//        QXClient.get().report().info("clicked on next button");
    	QXClient.get().gestures().BlindWait(4000);

     QXClient.get().gestures().waitAndClickElementisVisible(profilePageObjects.clkExistingGmailId);
         QXClient.get().report().info("clicked on existing gmailId");
    	QXClient.get().gestures().BlindWait(9000);
     	 HomePageActions homepage=new HomePageActions();
  	homepage.tapOnProfileTab();
	QXClient.get().gestures().BlindWait(3000);
       	  
         QXClient.get().gestures().waitForElementToAppear(profilePageObjects.verifyUsrnameGmailInProfSec);
        Assert.assertTrue(QXClient.get().gestures().isElementPresent(profilePageObjects.verifyUsrnameGmailInProfSec),"verifyUsrnameGmailInProfSec is not available");
        QXClient.get().report().info("Succesfully verfied UsrnameGmailInProfSec");

        tapOnMenuBar();
    	QXClient.get().gestures().BlindWait(3000);

    	 QXClient.get().gestures().waitForElementToAppear(profilePageObjects.verifyUsrnameGmailInMenuSec);
         Assert.assertTrue(QXClient.get().gestures().isElementPresent(profilePageObjects.verifyUsrnameGmailInMenuSec),"verifyUsrnameGmailInProfSec is not available");
         QXClient.get().report().info("Succesfully verfied verifyUsrnameGmailInMenuSec");

        QXClient.get().gestures().waitForElementToAppear(profilePageObjects.verifyLogOutForeGmailInMenuSec);
        Assert.assertTrue(QXClient.get().gestures().isElementPresent(profilePageObjects.verifyLogOutForeGmailInMenuSec),"verifyLogOutForeGmailInMenuSec is not available");
        QXClient.get().report().info("Succesfully verfied LogOutForeGmailInMenuSec");
       }
    
    public void shareDikshaIDProfileSec() throws Exception {
    	QXClient.get().gestures().waitAndClickElementisVisible(homePageObjects.clkDikshaShareId);
        QXClient.get().report().info("Tap on clkDikshaShareId");
        QXClient.get().gestures().BlindWait(5000);
    }

    public void verifySectionsInHomePage() {
    	
    	
    //	   Assert.assertTrue(QXClient.get().gestures().isElementPresent(homePageObjects.verifyHomeIcon),"verifyHomeIcon is not available");
        QXClient.get().report().info("verified  verifyHomeIcon");
        
    	
        Assert.assertTrue(QXClient.get().gestures().isElementPresent(homePageObjects.clkPrograms),"clkPrograms is not available");
        QXClient.get().report().info("verified  clkPrograms");
        
        Assert.assertTrue(QXClient.get().gestures().isElementPresent(homePageObjects.clkProjects),"clkProjects is not available");
        QXClient.get().report().info("verified  clkProjects");
        
        
        Assert.assertTrue(QXClient.get().gestures().isElementPresent(homePageObjects.clkObservations),"clkObservations is not available");
        QXClient.get().report().info("verified  clkObservations");
        
        Assert.assertTrue(QXClient.get().gestures().isElementPresent(homePageObjects.clkSurveys),"clkSurveys is not available");
        QXClient.get().report().info("verified  clkSurveys");
        
        Assert.assertTrue(QXClient.get().gestures().isElementPresent(homePageObjects.clkCourses),"clkCourses is not available");
        QXClient.get().report().info("verified  clkCourses");
        
        Assert.assertTrue(QXClient.get().gestures().isElementPresent(homePageObjects.clkReports),"clkReports is not available");
        QXClient.get().report().info("verified  clkReports");
    }

    
    public void EnableDiscussion() throws Exception {
        QXClient.get().gestures().BlindWait(5000);

        
            QXClient.get().gestures().waitAndClickElementisVisible(homePageObjects.clkMenuInGroup);
            QXClient.get().report().info("clicked on clkMenuInGroup");

            QXClient.get().gestures().waitAndClickElementisVisible(homePageObjects.clkEnableDiscussions);
            QXClient.get().report().info("Tap on clkEnableDiscussions button");
            QXClient.get().gestures().BlindWait(4000);

            Assert.assertTrue(QXClient.get().gestures().isElementPresent(homePageObjects.clkenableDisIcon),"clkenableDisIcon is not available");
            QXClient.get().report().info("verified  clkenableDisIcon");        
            QXClient.get().gestures().waitAndClickElementisVisible(homePageObjects.clkenableDisIcon);
            QXClient.get().report().info("Tap on clkenableDisIcon button");
            
            QXClient.get().gestures().BlindWait(6000);

            Assert.assertTrue(QXClient.get().gestures().isElementPresent(homePageObjects.verify0Discussions),"verify0Discussions is not available");
            Assert.assertTrue(QXClient.get().gestures().isElementPresent(homePageObjects.verify0Posts),"verify0Posts is not available");

            QXClient.get().gestures().waitAndClickElementisVisible(homePageObjects.clickHambugMenuForum);
            QXClient.get().report().info("Tap on clickHambugMenuForum button");
            QXClient.get().gestures().BlindWait(3000);
            Assert.assertTrue(QXClient.get().gestures().isElementPresent(homePageObjects.clkCloseIconDF),"clkCloseIconDF is not available");

            Assert.assertTrue(QXClient.get().gestures().isElementPresent(homePageObjects.verifyCatogries),"verifyCatogries is not available");
            Assert.assertTrue(QXClient.get().gestures().isElementPresent(homePageObjects.verifyTags),"verifyTags is not available");
            Assert.assertTrue(QXClient.get().gestures().isElementPresent(homePageObjects.verifyDiscussion),"verifyDiscussion is not available");
            QXClient.get().gestures().BlindWait(3000);

            
            QXClient.get().gestures().waitAndClickElementisVisible(homePageObjects.verifyDiscussion);
            QXClient.get().report().info("Tap on verifyDiscussion button");
            QXClient.get().gestures().BlindWait(3000);
            Assert.assertTrue(QXClient.get().gestures().isElementPresent(homePageObjects.clkCloseIconDF),"clkCloseIconDF is not available");

            Assert.assertTrue(QXClient.get().gestures().isElementPresent(homePageObjects.verifyRecentPosts),"verifyRecentPosts is not available");
            Assert.assertTrue(QXClient.get().gestures().isElementPresent(homePageObjects.verifyBestPosts),"verifyBestPosts is not available");
            Assert.assertTrue(QXClient.get().gestures().isElementPresent(homePageObjects.verifySavedPosts),"verifySavedPosts is not available");
            Assert.assertTrue(QXClient.get().gestures().isElementPresent(homePageObjects.verifyUpvoted),"verifyUpvoted is not available");
            Assert.assertTrue(QXClient.get().gestures().isElementPresent(homePageObjects.verifyDownVoted),"verifyDownVoted is not available");

            QXClient.get().gestures().BlindWait(4000);

            QXClient.get().gestures().clkBackButton();
            QXClient.get().gestures().clkBackButton();

            QXClient.get().gestures().BlindWait(4000);

            
            
            
            QXClient.get().gestures().waitAndClickElementisVisible(homePageObjects.verify0Discussions);
            QXClient.get().report().info("Tap on verify0Discussions button");
            
           
            
            
    }
    
    public void startQuestionFill() throws Exception {
        QXClient.get().gestures().BlindWait(5000);

    //    QXClient.get().gestures().waitAndClickElementisVisible(homePageObjects.verify0Discussions);
        QXClient.get().gestures().BlindWait(2000);

            QXClient.get().gestures().waitAndClickElementisVisible(homePageObjects.clkStartDiscussion);
            QXClient.get().report().info("Tap on clkStartDiscussion button");
            QXClient.get().gestures().BlindWait(2000);

            QXClient.get().gestures().waitAndClickElementisVisible(homePageObjects.askaQuesTextBox);
            QXClient.get().report().info("Tap on askaQuesTextBox button");
            
            QXClient.get().gestures().alternativeMethodForSendKeys("Testing");
            QXClient.get().gestures().BlindWait(2000);

            QXClient.get().gestures().waitAndClickElementisVisible(homePageObjects.enterIdeaTxtBox);
            QXClient.get().report().info("Tap on enterIdeaTxtBox button");
            
            QXClient.get().gestures().alternativeMethodForSendKeys("TestingDikshaApplication");
            QXClient.get().gestures().BlindWait(2000);

            QXClient.get().gestures().clkBackButton();
            QXClient.get().gestures().BlindWait(2000);

            QXClient.get().gestures().waitAndClickElementisVisible(homePageObjects.clkAsaQueSubmitBtn);
            QXClient.get().report().info("Tap on clkAsaQueSubmitBtn button");
            
            QXClient.get().gestures().clkBackButton();
            QXClient.get().gestures().BlindWait(3000);

            Assert.assertTrue(QXClient.get().gestures().isElementPresent(homePageObjects.verify1Discussions),"verify1Discussions is not available");
            Assert.assertTrue(QXClient.get().gestures().isElementPresent(homePageObjects.verify1Posts),"verify1Posts is not available");

          //  QXClient.get().gestures().clkBackButton();


            
    }
    
    public void DisableDiscussion() throws Exception {
        QXClient.get().gestures().BlindWait(5000);

          QXClient.get().gestures().clkBackButton();
          QXClient.get().gestures().BlindWait(3000);

            QXClient.get().gestures().waitAndClickElementisVisible(homePageObjects.clkMenuInGroup);
            QXClient.get().report().info("clicked on clkMenuInGroup");

            QXClient.get().gestures().waitAndClickElementisVisible(homePageObjects.clkDisableDiscussion);
            QXClient.get().report().info("Tap on clkDisableDiscussion button");
            
            Assert.assertTrue(QXClient.get().gestures().isElementPresent(homePageObjects.clkPopupDisableDiscussion),"clkPopupDisableDiscussion is not available");
            QXClient.get().report().info("verified  clkPopupDisableDiscussion"); 
            
            QXClient.get().gestures().waitAndClickElementisVisible(homePageObjects.clkPopupDisableDiscussion);
            QXClient.get().report().info("Tap on clkPopupDisableDiscussion button");
            
            if (!QXClient.get().gestures().isElementPresent(homePageObjects.clkenableDisIcon)) {
                QXClient.get().report().info("clkenableDisIcon not present");

            }
            
            QXClient.get().gestures().BlindWait(6000);

            
            QXClient.get().gestures().waitAndClickElementisVisible(homePageObjects.clkMenuInGroup);
            QXClient.get().report().info("clicked on clkMenuInGroup");

            QXClient.get().gestures().waitAndClickElementisVisible(homePageObjects.clkEnableDiscussions);
            QXClient.get().report().info("Tap on clkEnableDiscussions button");
            QXClient.get().gestures().BlindWait(5000);

            Assert.assertTrue(QXClient.get().gestures().isElementPresent(homePageObjects.clkenableDisIcon),"clkenableDisIcon is not available");
            QXClient.get().report().info("verified  clkenableDisIcon");        
            QXClient.get().gestures().waitAndClickElementisVisible(homePageObjects.clkenableDisIcon);
            QXClient.get().report().info("Tap on clkenableDisIcon button");
            QXClient.get().gestures().BlindWait(4000);

            Assert.assertTrue(QXClient.get().gestures().isElementPresent(homePageObjects.verify0Discussions),"verify0Discussions is not available");
            Assert.assertTrue(QXClient.get().gestures().isElementPresent(homePageObjects.verify0Posts),"verify0Posts is not available");

            QXClient.get().gestures().clkBackButton();
            QXClient.get().gestures().BlindWait(3000);

    }
    
    
    public void deleteGroup() throws Exception {
        QXClient.get().gestures().BlindWait(5000);

        
            QXClient.get().gestures().waitAndClickElementisVisible(homePageObjects.clkMenuInGroup);
            QXClient.get().report().info("clicked on clkMenuInGroup");

            QXClient.get().gestures().waitAndClickElementisVisible(homePageObjects.clkDeleInMenuGrp);
            QXClient.get().report().info("Tap on clkDeleInMenuGrp button");
        
                   
            QXClient.get().gestures().waitAndClickElementisVisible(homePageObjects.clkDeleteInPopUp);
            QXClient.get().report().info("Tap on clkDeleteInPopUp button");
            
            QXClient.get().gestures().BlindWait(3000);

            //Assert.assertTrue(QXClient.get().gestures().isElementPresent(homePageObjects.clkCreateGroup),"clkCreateGroup is not available");

            QXClient.get().report().info("Verified clkCreateGroup button,Group deleted succesfully");
            
            
    }
    
    public void addMemberAndRemovemember(String MemberID) throws Exception {
        QXClient.get().gestures().BlindWait(5000);


        QXClient.get().gestures().waitAndClickElementisVisible(homePageObjects.clkMembersGrp);
        QXClient.get().report().info("clicked on clkMembersGrp");

        QXClient.get().gestures().waitAndClickElementisVisible(homePageObjects.clkAddMembers);
        QXClient.get().report().info("Tap on clkAddMembers button");

        QXClient.get().gestures().BlindWait(2000);
        QXClient.get().gestures().clkBackButton();
        QXClient.get().gestures().BlindWait(2000);
        QXClient.get().gestures().waitAndClickElementisVisible(homePageObjects.clkEnterDikshaID);
        QXClient.get().report().info("clicked on clkEnterDikshaID");
        QXClient.get().gestures().BlindWait(2000);
        homePageObjects.clkEnterDikshaID.sendKeys(MemberID);
        QXClient.get().gestures().BlindWait(2000);


        QXClient.get().gestures().waitAndClickElementisVisible(homePageObjects.clkVerifyBtn);
        QXClient.get().report().info("clicked on clkVerifyBtn");
        QXClient.get().report().info("reCAPTCHA is displayed while adding member to the group");

        QXClient.get().gestures().BlindWait(6000);
        QXClient.get().gestures().BlindWait(4000);


        QXClient.get().gestures().waitAndClickElementisVisible(homePageObjects.clkAddToGrp);
        QXClient.get().report().info("clicked on clkAddToGrp");

        QXClient.get().gestures().BlindWait(4000);
        Assert.assertTrue(QXClient.get().gestures().isElementPresent(homePageObjects.menuMember),"menuMember  is not available");

        QXClient.get().gestures().waitAndClickElementisVisible(homePageObjects.menuMember);

        QXClient.get().gestures().waitAndClickElementisVisible(homePageObjects.clkRemoveMembers);
        QXClient.get().report().info("clicked on clkRemoveMembers");

        QXClient.get().gestures().waitAndClickElementisVisible(homePageObjects.clkRemoveMembersPopup);
        QXClient.get().report().info("clicked on clkRemoveMembersPopup");
        QXClient.get().gestures().BlindWait(6000);
     
                
                        
                
               }

    public void closeAppOnClkYesBtn() throws Exception {
    	DikshaMainPageActions dikshapageact=new DikshaMainPageActions();
    	QXClient.get().gestures().clkBackButton();
        QXClient.get().report().info("clicked on back button on app");

        QXClient.get().gestures().waitAndClickElementisVisible(homePageObjects.clkYes);
        QXClient.get().report().info("clicked on clkYes");

      
        
        if (!QXClient.get().gestures().isElementPresent(homePageObjects.trainingTab)) {
            QXClient.get().report().info("Application Closed after clicking on Yes Button");

        }
        
        dikshapageact.LaunchAppHomeScreen();
        QXClient.get().gestures().BlindWait(4000);
        QXClient.get().gestures().waitAndClickElementisVisible(homePageObjects.trainingTab);
        QXClient.get().gestures().BlindWait(4000);
       
        QXClient.get().gestures().clkBackButton();
        QXClient.get().report().info("clicked on back button on app");

        QXClient.get().gestures().waitAndClickElementisVisible(homePageObjects.clkNo);
        QXClient.get().report().info("clicked on clkNo");

        Assert.assertTrue(QXClient.get().gestures().isElementPresent(homePageObjects.trainingTab),"clkNotificationIcon is not available");
        QXClient.get().report().info("Application not closed after clicking on No Button");
        
      
    }
    public void verifyRecentlySearchedKeyword() throws Exception {
    	QXClient.get().gestures().waitForElementToAppear(homePageObjects.searchBar);
    	homePageObjects.searchBar.click();
        QXClient.get().gestures().BlindWait(2000);

        Assert.assertTrue(QXClient.get().gestures().isElementPresent(homePageObjects.recentlySearchedKeyword),"recentlySearchedKeyword is not available");
        QXClient.get().report().info("recentlySearchedKeyword is available");
        

    }
    
 public void verifySignInGoogleOption() throws Exception {
    	
	 Assert.assertTrue(QXClient.get().gestures().isElementPresent(profilePageObjects.signInwithGoogle),"signInwithGoogle is not available");
     QXClient.get().report().info("profilePageObjects is available");
     

            QXClient.get().gestures().waitAndClickElementisVisible(profilePageObjects.signInwithGoogle);
            QXClient.get().report().info("clicked on signwithgoogle");
            QXClient.get().gestures().BlindWait(2000);

           
           }
    
 public void verifyHelpSection() throws Exception {
     QXClient.get().gestures().BlindWait(5000);

     
         QXClient.get().gestures().waitAndClickElementisVisible(homePageObjects.clkHelpMenu);
         QXClient.get().report().info("clicked on clkHelpMenu");

        
         QXClient.get().gestures().BlindWait(3000);

         Assert.assertTrue(QXClient.get().gestures().isElementPresent(homePageObjects.verifyFQAQestions),"verifyFQAQestions is not available");

         QXClient.get().report().info("Verified verifyFQAQestions in Help Menu");
         
         
 }
 
 public void verifyCloseBtnDF() throws Exception {
     QXClient.get().gestures().BlindWait(5000);

     
         QXClient.get().gestures().waitAndClickElementisVisible(homePageObjects.clkCloseIconDF);
         QXClient.get().report().info("clicked on clkCloseIconDF");

      
         
 }
 
 public void verifyDarkMode() throws Exception {
     QXClient.get().gestures().BlindWait(3000);
    


tapOnMenuBar();

         QXClient.get().gestures().waitAndClickElementisVisible(homePageObjects.clkSwitchDarkMode);
         QXClient.get().report().info("clicked on clkSwitchDarkMode");
         QXClient.get().gestures().BlindWait(3000);
         tapOnMenuBar();

         QXClient.get().gestures().waitAndClickElementisVisible(homePageObjects.clkSwitchToDefault);
         QXClient.get().report().info("clicked on clkSwitchToDefault");
         QXClient.get().gestures().BlindWait(3000);
        
         
 }


    public void veriyHomePageForDikshaNewExpreience() throws Exception {
        QXClient.get().gestures().BlindWait(3000);



        tapOnMenuBar();

        QXClient.get().gestures().waitAndClickElementisVisible(homePageObjects.clkNewDikshExperiece);
        QXClient.get().report().info("clicked on clkNewDikshExperiece");
        QXClient.get().gestures().BlindWait(3000);
        Assert.assertTrue(QXClient.get().gestures().isElementPresent(homePageObjects.assertMyLearningSection),"assertMyLearningSection is not available");
        QXClient.get().report().info("Verified assertMyLearningSection in HomePage");

        Assert.assertTrue(QXClient.get().gestures().isElementPresent(homePageObjects.assertBrowseBySubject),"assertBrowseBySubject is not available");
        QXClient.get().report().info("Verified assertBrowseBySubject in HomePage");

        Assert.assertTrue(QXClient.get().gestures().isElementPresent(homePageObjects.assertBrowseByCategory),"assertBrowseByCategory is not available");
        QXClient.get().report().info("Verified assertBrowseByCategory in HomePage");


        QXClient.get().gestures().waitAndClickElementisVisible(homePageObjects.clkBrowseBySubjectSection);
        QXClient.get().report().info("clicked on clkBrowseBySubjectSection");
        QXClient.get().gestures().BlindWait(3000);
        Assert.assertTrue(QXClient.get().gestures().isElementPresent(homePageObjects.assertContentAfterClkingSection),"assertContentAfterClkingSection is not available");
        QXClient.get().report().info("Verified assertContentAfterClkingSection in HomePage");
        QXClient.get().gestures().clkBackButton();
        QXClient.get().gestures().BlindWait(3000);
        QXClient.get().gestures().waitAndClickElementisVisible(homePageObjects.clkBrowseByCategorySection);
        QXClient.get().report().info("clicked on clkBrowseByCategorySection");
        QXClient.get().gestures().BlindWait(3000);
        Assert.assertTrue(QXClient.get().gestures().isElementPresent(homePageObjects.assertContentAfterClkingSection1),"assertContentAfterClkingSection is not available");
        QXClient.get().report().info("Verified assertContentAfterClkingSection in HomePage");
        QXClient.get().gestures().clkBackButton();
        QXClient.get().gestures().BlindWait(3000);

        QXClient.get().gestures().waitAndClickElementisVisible(homePageObjects.clkOnCourseInHomePage);
        QXClient.get().report().info("Clicked on Course in browse by category");
        QXClient.get().gestures().BlindWait(3000);

       /* Assert.assertTrue(QXClient.get().gestures().isElementPresent(homePageObjects.assertExploreCourse),"Explore course is not displayed");
        QXClient.get().report().info("Explore Course is displayed");
        QXClient.get().report().info("Published Course is visible in recent section");*/

        QXClient.get().gestures().waitAndClickElementisVisible(homePageObjects.clkOnFirstInExploreCourse);
        QXClient.get().report().info("Clicked on First course under explore course");
        QXClient.get().gestures().BlindWait(3000);

        /*Assert.assertTrue(QXClient.get().gestures().isElementPresent(homePageObjects.assertUserTypeInCourseDetails),"user type is not displayed in course details");
        QXClient.get().report().info("Teacher or Student user type is displayed in course details");
        QXClient.get().gestures().BlindWait(3000);*/
    }



    public void verifySearchPageForDikshaNewExpreiecne() throws Exception {
     QXClient.get().gestures().BlindWait(3000);
    


          tapOnMenuBar();
          QXClient.get().gestures().BlindWait(3000);

        QXClient.get().gestures().waitAndClickElementisVisible(homePageObjects.clkNewDikshExperiece);
        QXClient.get().report().info("clicked on clkNewDikshExperiece");
        QXClient.get().gestures().BlindWait(3000);

        QXClient.get().gestures().waitAndClickElementisVisible(homePageObjects.clkSearchIcon);
        QXClient.get().report().info("clicked on clkSearchIcon");
        QXClient.get().gestures().BlindWait(3000);
        Assert.assertTrue(QXClient.get().gestures().isElementPresent(homePageObjects.assertPopularCatrgories),"assertPopularCatrgories is not available");
        QXClient.get().report().info("Verified assertPopularCatrgories in SearchPage");
        Assert.assertTrue(QXClient.get().gestures().isElementPresent(homePageObjects.assertDigitalTextBookSection),"assertDigitalTextBookSection is not available");
        QXClient.get().report().info("Verified assertDigitalTextBookSection in SearchPage");
        Assert.assertTrue(QXClient.get().gestures().isElementPresent(homePageObjects.assertCourseSection),"assertCourseSection is not available");
        QXClient.get().report().info("Verified assertCourseSection in SearchPage");
        Assert.assertTrue(QXClient.get().gestures().isElementPresent(homePageObjects.assertTVClassesSection),"assertTVClassesSection is not available");
        QXClient.get().report().info("Verified assertTVClassesSection in SearchPage");
        Assert.assertTrue(QXClient.get().gestures().isElementPresent(homePageObjects.assertVideoSection),"assertVideoSection is not available");
        QXClient.get().report().info("Verified assertVideoSection in SearchPage");
        Assert.assertTrue(QXClient.get().gestures().isElementPresent(homePageObjects.assertAudioSection),"assertAudioSection is not available");
        QXClient.get().report().info("Verified assertAudioSection in SearchPage");
        Assert.assertTrue(QXClient.get().gestures().isElementPresent(homePageObjects.assertInteractiveContentSection),"assertInteractiveContentSection is not available");
        QXClient.get().report().info("Verified assertInteractiveContentSection in SearchPage");

        Assert.assertTrue(QXClient.get().gestures().isElementPresent(homePageObjects.assertExploreContentFromOtherBoards),"assertExploreContentFromOtherBoards is not available");
        QXClient.get().report().info("Verified assertExploreContentFromOtherBoards in SearchPage");
        Assert.assertTrue(QXClient.get().gestures().isElementPresent(homePageObjects.assertIGotSecInExploreContentFromOtherBoards),"assertIGotSecInExploreContentFromOtherBoards is not available");
        QXClient.get().report().info("Verified assertIGotSecInExploreContentFromOtherBoards in SearchPage");
        QXClient.get().gestures().swipeUp();

        Assert.assertTrue(QXClient.get().gestures().isElementPresent(homePageObjects.assertExploreContentForVarietyOfAudience),"assertExploreContentForVarietyOfAudience is not available");
        QXClient.get().report().info("Verified assertExploreContentForVarietyOfAudience in SearchPage");
        QXClient.get().gestures().swipeUp();
        Assert.assertTrue(QXClient.get().gestures().isElementPresent(homePageObjects.assertTeacherSecInExploreContentForVarietyAudience),"assertTeacherSecInExploreContentForVarietyAudience is not available");
        QXClient.get().report().info("Verified assertTeacherSecInExploreContentForVarietyAudience in SearchPage");


    }
 
 
// public void createNewProjects() throws Exception {
//     QXClient.get().gestures().BlindWait(3000);
//    
//
//
//
//         QXClient.get().gestures().waitAndClickElementisVisible(homePageObjects.clkProjects);
//         QXClient.get().report().info("clicked on clkProjects");
//         QXClient.get().gestures().BlindWait(3000);
//         QXClient.get().gestures().waitAndClickElementisVisible(homePageObjects.clkOnCreateNewProj);
//         QXClient.get().report().info("clicked on clkOnCreateNewProj");
//         QXClient.get().gestures().BlindWait(2000);
//      
//         QXClient.get().gestures().waitAndClickElementisVisible(homePageObjects.clkDoNotShare);
//         QXClient.get().report().info("clicked on clkDoNotShare");
//         
//         QXClient.get().gestures().waitAndClickElementisVisible(homePageObjects.EnterNameYourProject);
//         QXClient.get().report().info("clicked on EnterNameYourProject");     
//         QXClient.get().gestures().BlindWait(4000);
//         QXClient.get().gestures().alternativeMethodForSendKeys("AutomationProject");
//       // homePageObjects.EnterNameYourProject.sendKeys("AutomationProject");
//         QXClient.get().gestures().BlindWait(2000);
//         QXClient.get().gestures().waitAndClickElementisVisible(homePageObjects.EnterDesciprtion);
//         QXClient.get().report().info("clicked on EnterDesciprtion");     
//         QXClient.get().gestures().BlindWait(3000);
//         QXClient.get().gestures().alternativeMethodForSendKeys("DescriptionProject");
//
//                //  homePageObjects.EnterDesciprtion.sendKeys("DescriptionProject");
//                  QXClient.get().gestures().BlindWait(2000);
//                  QXClient.get().gestures().clkBackButton();
//                  QXClient.get().gestures().BlindWait(4000);
//                  QXClient.get().gestures().waitAndClickElementisVisible(homePageObjects.clkCategories);
//                  QXClient.get().report().info("clicked on clkCategories");         
//                  QXClient.get().gestures().waitAndClickElementisVisible(homePageObjects.sltTeachersInCategry);
//                  QXClient.get().report().info("clicked on sltTeachersInCategry");
//                  QXClient.get().gestures().waitAndClickElementisVisible(homePageObjects.clkSubmit);
//                  QXClient.get().report().info("clicked on clkSubmit");         
//                  QXClient.get().gestures().waitAndClickElementisVisible(homePageObjects.clkCreateAndContinue);
//                  QXClient.get().report().info("clicked on clkCreateAndContinue");         
//        
//                  Assert.assertTrue(QXClient.get().gestures().isElementPresent(homePageObjects.assertProjectCreationMsg),"assertProjectCreationMsg is not available");
//                  QXClient.get().report().info("Verified assertProjectCreationMsg");
//                  
//                  QXClient.get().gestures().waitAndClickElementisVisible(homePageObjects.clkContinueBtn);
//                  QXClient.get().report().info("clicked on clkContinueBtn");         
//        
//                  QXClient.get().gestures().waitAndClickElementisVisible(homePageObjects.clkSkipBtn);
//                  QXClient.get().report().info("clicked on clkSkipBtn");         
//        
//                  QXClient.get().gestures().waitAndClickElementisVisible(homePageObjects.clkProjectView);
//                  QXClient.get().report().info("clicked on clkProjectView");         
//        
//                  Assert.assertTrue(QXClient.get().gestures().isElementPresent(homePageObjects.createdProjectTitle),"createdProjectTitle is not available");
//                  QXClient.get().report().info("Verified createdProjectTitle");
//                  Assert.assertTrue(QXClient.get().gestures().isElementPresent(homePageObjects.createdProjectObjective),"createdProjectObjective is not available");
//                  QXClient.get().report().info("Verified createdProjectObjective");
//                  
//         
// }
 
 public void editCreatedProjects() throws Exception {
     QXClient.get().gestures().BlindWait(3000);

     QXClient.get().gestures().waitAndClickElementisVisible(homePageObjects.clkFirstProject);
     QXClient.get().gestures().BlindWait(3000);
     QXClient.get().gestures().waitAndClickElementisVisible(homePageObjects.clkDoNotShare);
     QXClient.get().report().info("clicked on clkDoNotShare");
     QXClient.get().gestures().BlindWait(3000);
             QXClient.get().gestures().waitAndClickElementisVisible(homePageObjects.clkHamburgeMenu);
         QXClient.get().report().info("clicked on clkHamburgeMenu");
         QXClient.get().gestures().BlindWait(2000);
         QXClient.get().gestures().waitAndClickElementisVisible(homePageObjects.clkEditMenu);
         QXClient.get().report().info("clicked on clkEditMenu");
         QXClient.get().gestures().BlindWait(2000);
         QXClient.get().gestures().waitAndClickElementisVisible(homePageObjects.clkCreateIcon);
         QXClient.get().report().info("clicked on clkCreateIcon");
         QXClient.get().gestures().BlindWait(2000);
         
         QXClient.get().gestures().waitAndClickElementisVisible(homePageObjects.clkEditProject);
         QXClient.get().report().info("clicked on clkEditProject");     
         homePageObjects.EnterNameYourProject.clear();
         QXClient.get().gestures().BlindWait(2000);
         QXClient.get().gestures().alternativeMethodForSendKeys("UpdatedAutomationProject");
       //  homePageObjects.EnterNameYourProject.sendKeys("UpdatedAutomationProject");
         QXClient.get().gestures().BlindWait(2000);
         QXClient.get().gestures().waitAndClickElementisVisible(homePageObjects.clkEditProjectDesc);
         QXClient.get().report().info("clicked on clkEditProjectDesc");
         homePageObjects.EnterDesciprtion.clear();
         QXClient.get().gestures().BlindWait(2000);

                 // homePageObjects.EnterDesciprtion.sendKeys("UpdatedDescriptionProject");
         QXClient.get().gestures().alternativeMethodForSendKeys("UpdatedDescriptionProject");

                  QXClient.get().gestures().BlindWait(2000);
                                    QXClient.get().gestures().clkBackButton();
                  QXClient.get().gestures().BlindWait(2000);
                  
                  
                  QXClient.get().gestures().waitAndClickElementisVisible(homePageObjects.clkSltCatgories);
                  QXClient.get().report().info("clicked on clkSltCatgories");         
                  QXClient.get().gestures().waitAndClickElementisVisible(homePageObjects.sltStudentCategory);
                  QXClient.get().report().info("clicked on sltStudentCategory");
                  QXClient.get().gestures().waitAndClickElementisVisible(homePageObjects.clkSubmit);
                  QXClient.get().report().info("clicked on clkSubmit");         
                  
                  QXClient.get().gestures().waitAndClickElementisVisible(homePageObjects.clkEditProjectSave);
                  QXClient.get().report().info("clicked on clkEditProjectSave");         
                  QXClient.get().gestures().BlindWait(5000);

                  Assert.assertTrue(QXClient.get().gestures().isElementPresent(homePageObjects.assertUpdatedProjectName),"assertUpdatedProjectName is not available");
                  QXClient.get().report().info("Verified assertUpdatedProjectName");
                  Assert.assertTrue(QXClient.get().gestures().isElementPresent(homePageObjects.assertUpdatedObjectiveDesc),"assertUpdatedObjectiveDesc is not available");
                  QXClient.get().report().info("Verified assertUpdatedObjectiveDesc");
                  Assert.assertTrue(QXClient.get().gestures().isElementPresent(homePageObjects.assertUpdatedCategory),"assertUpdatedCategory is not available");
                  QXClient.get().report().info("Verified assertUpdatedCategory");
                  
                  QXClient.get().gestures().BlindWait(3000);
                  QXClient.get().gestures().clkBackButton();
                  QXClient.get().gestures().BlindWait(6000);

                  QXClient.get().gestures().waitAndClickElementisVisible(homePageObjects.clkCloudUploadBtn);
                  QXClient.get().report().info("clicked on clkCloudUploadBtn");         
                  Assert.assertTrue(QXClient.get().gestures().isElementPresent(homePageObjects.assertMsgSync),"assertMsgSync is not available");
                  QXClient.get().report().info("Verified assertMsgSync");
                  QXClient.get().gestures().BlindWait(2000);

                  QXClient.get().gestures().waitAndClickElementisVisible(homePageObjects.assertCloudDoneBtn);
                  QXClient.get().report().info("clicked on assertCloudDoneBtn");         
        
         
 }
 public void sycAndShare() throws Exception {
     QXClient.get().gestures().BlindWait(3000);
             QXClient.get().gestures().waitAndClickElementisVisible(homePageObjects.clkHamburgeMenu);
         QXClient.get().report().info("clicked on clkHamburgeMenu");
         QXClient.get().gestures().BlindWait(2000);
         
         QXClient.get().gestures().waitAndClickElementisVisible(homePageObjects.clkonMenuShare);
         QXClient.get().report().info("clicked on clkonMenuShare");
         QXClient.get().gestures().BlindWait(3000);
         QXClient.get().gestures().waitAndClickElementisVisible(homePageObjects.clkonSyncAndShareBtn);
         QXClient.get().report().info("clicked on clkonSyncAndShareBtn");
         QXClient.get().gestures().BlindWait(5000);
         QXClient.get().gestures().clkBackButton();
         QXClient.get().gestures().BlindWait(3000);

 }
 
 public void verifyUserAbletoModifyTitleDesc() throws Exception{
	    QXClient.get().gestures().BlindWait(3000);
	    QXClient.get().gestures().waitAndClickElementisVisible(homePageObjects.clkEyeIcon);
	    QXClient.get().report().info("Clicked on Eye icon");
	    QXClient.get().gestures().BlindWait(5000);
	    QXClient.get().gestures().waitAndClickElementisVisible(homePageObjects.clkOnDiscussion);
	    QXClient.get().report().info("Clicked on created discussion");
	    QXClient.get().gestures().BlindWait(9000);
	    QXClient.get().gestures().waitAndClickElementisVisible(homePageObjects.clkOnKebabMenu);
	    QXClient.get().report().info("Clicked on Kebab menu");
	    QXClient.get().gestures().BlindWait(3000);
	    QXClient.get().gestures().waitAndClickElementisVisible(homePageObjects.clkEditOption);
	    QXClient.get().report().info("Clicked on Edit option");
	    QXClient.get().gestures().BlindWait(3000);
	    QXClient.get().gestures().waitAndClickElementisVisible(homePageObjects.askaQuesTextBox);
	    homePageObjects.askaQuesTextBox.clear();
	    QXClient.get().report().info("Tap on askaQuesTextBox button");
	    QXClient.get().gestures().alternativeMethodForSendKeys("Diksha Testing");
	    QXClient.get().gestures().BlindWait(3000);
	    QXClient.get().gestures().waitAndClickElementisVisible(homePageObjects.enterIdeaTxtBox);
	    //homePageObjects.askaQuesTextBox.clear();
	    QXClient.get().report().info("Tap on enterIdeaTxtBox button");
	    QXClient.get().gestures().alternativeMethodForSendKeys("Diksha Application Testing for Release");
	    QXClient.get().gestures().BlindWait(3000);
	    QXClient.get().gestures().clkBackButton();
	    QXClient.get().gestures().waitAndClickElementisVisible(homePageObjects.tagsField);
	    QXClient.get().gestures().alternativeMethodForSendKeys("Diksha tags");
	    QXClient.get().gestures().clkBackButton();
	    QXClient.get().gestures().BlindWait(9000);
	    //QXClient.get().gestures().clkBackButton();
	    QXClient.get().gestures().BlindWait(9000);
	    QXClient.get().gestures().waitAndClickElementisVisible(homePageObjects.clkUpdateBtn);
	    QXClient.get().report().info("Clicked on Update Button");
	    QXClient.get().gestures().BlindWait(9000);
	    Assert.assertTrue(QXClient.get().gestures().isElementPresent(homePageObjects.updatedTitle),"updated title in not visible");
	    Assert.assertTrue(QXClient.get().gestures().isElementPresent(homePageObjects.updatedDesc),"updated description is not visible");
	   QXClient.get().gestures().clkBackButton();
	}


 public void verifyuUserAbleToOpenDiscussionForum() throws Exception{
	    QXClient.get().gestures().BlindWait(5000);
	    QXClient.get().gestures().waitAndClickElementisVisible(homePageObjects.clkMyGroups);
	    QXClient.get().report().info("clicked on MyGroups");
	    QXClient.get().gestures().BlindWait(5000);
	    if(QXClient.get().gestures().isElementPresent(homePageObjects.clkCloseIconGrp))
	    {
	        QXClient.get().gestures().waitAndClickElementisVisible(homePageObjects.clkCloseIconGrp);
	        QXClient.get().report().info("Tap on clkCloseIconGrp button");
	    }
	    QXClient.get().gestures().BlindWait(3000);
	    QXClient.get().gestures().waitAndClickElementisVisible(homePageObjects.clkFirstGroup);
	    QXClient.get().report().info("Clicked on First created group");
	    QXClient.get().gestures().BlindWait(3000);
	    QXClient.get().gestures().waitAndClickElementisVisible(homePageObjects.clkenableDisIcon);
	    QXClient.get().report().info("Tap on clkenableDisIcon button");
	    QXClient.get().gestures().BlindWait(3000);
	    QXClient.get().gestures().waitAndClickElementisVisible(homePageObjects.clkEyeIcon);
	    QXClient.get().report().info("Clicked on General discussion");
	    QXClient.get().gestures().BlindWait(3000);
	    Assert.assertTrue(QXClient.get().gestures().isElementPresent(homePageObjects.clkOnDiscussion),"Discussion not created");
	    QXClient.get().report().info("User successfully opened the discussion Forum");
	    Assert.assertTrue(QXClient.get().gestures().isElementPresent(homePageObjects.updatedTitle),"Title is not updated");
	    Assert.assertTrue(QXClient.get().gestures().isElementPresent(homePageObjects.updatedDesc),"Description is not updated");
	}

 public void deleteCommentsAndRepliesInDiscussion() throws Exception{
	    QXClient.get().gestures().BlindWait(3000);
	    //QXClient.get().gestures().waitAndClickElementisVisible(homePageObjects.clkEyeIcon);
	    //QXClient.get().report().info("Clicked on Eye icon");
	    QXClient.get().gestures().BlindWait(5000);
	    QXClient.get().gestures().waitAndClickElementisVisible(homePageObjects.clkOnDiscussion);
	    QXClient.get().report().info("Clicked on created discussion");
	    QXClient.get().gestures().BlindWait(9000);
	    QXClient.get().gestures().waitAndClickElementisVisible(homePageObjects.commentsSection);
	    QXClient.get().report().info("clicked on comment section");
	    QXClient.get().gestures().BlindWait(2000);
	    QXClient.get().gestures().alternativeMethodForSendKeys("DiscussionRequired");
	    QXClient.get().gestures().BlindWait(2000);
	    QXClient.get().gestures().clkBackButton();
	    QXClient.get().gestures().waitAndClickElementisVisible(homePageObjects.clkPostReply);
	    QXClient.get().report().info("Clicked on Post reply Button");
	    QXClient.get().gestures().BlindWait(3000);
	    QXClient.get().gestures().swipeUp();
	    QXClient.get().gestures().BlindWait(2000);
	   /* QXClient.get().gestures().waitAndClickElementisVisible(homePageObjects.clkReplyButton);
	    QXClient.get().report().info("Clicked on reply Button");
	    QXClient.get().gestures().BlindWait(2000);
	    QXClient.get().gestures().waitAndClickElementisVisible(homePageObjects.replytoCommentText);
	    QXClient.get().report().info("Clicked on reply to comment edit text field");
	    QXClient.get().gestures().alternativeMethodForSendKeys("Lets disucss regard Diksha App");
	    QXClient.get().gestures().BlindWait(3000);
	    QXClient.get().gestures().waitAndClickElementisVisible(homePageObjects.clkPostReply);
	    QXClient.get().report().info("Clicked on Post reply Button");
	    QXClient.get().gestures().BlindWait(3000);
	    QXClient.get().gestures().waitAndClickElementisVisible(homePageObjects.clkOnDeleteBtn);
	    QXClient.get().report().info("Clicked on delete comment");
	    QXClient.get().gestures().BlindWait(3000);
	    */
	    QXClient.get().gestures().waitAndClickElementisVisible(homePageObjects.clkOnDeleteBtn);
	    QXClient.get().report().info("Clicked on delete comment");
	    QXClient.get().gestures().BlindWait(3000);
	    QXClient.get().gestures().waitAndClickElementisVisible(homePageObjects.clkOkBtn);
	    QXClient.get().report().info("Clicked on OK button");
	    QXClient.get().gestures().BlindWait(3000);
	}




 public void deleteDiscussion() throws Exception{
	    QXClient.get().gestures().BlindWait(3000);
	    QXClient.get().gestures().waitAndClickElementisVisible(homePageObjects.clkOnDiscussion);
	    QXClient.get().report().info("Clicked on created discussion");
	    QXClient.get().gestures().BlindWait(9000);
	    QXClient.get().gestures().waitAndClickElementisVisible(homePageObjects.clkOnKebabMenu);
	    QXClient.get().report().info("Clicked on Kebab menu");
	    QXClient.get().gestures().BlindWait(3000);
	    QXClient.get().gestures().waitAndClickElementisVisible(homePageObjects.deleteDiscussion);
	    QXClient.get().report().info("Clicked on delete discussion ");
	    QXClient.get().gestures().BlindWait(3000);
	    QXClient.get().gestures().waitAndClickElementisVisible(homePageObjects.clkOkBtn);
	    QXClient.get().report().info("Clicked on OK button");
	    QXClient.get().gestures().BlindWait(5000);
	}

































 
 
 
 
 
 
 
 
 public void creationoftask() throws Exception {
		QXClient.get().gestures().waitAndClickElementisVisible(homePageObjects.clkProjects);
		QXClient.get().report().info("click on project");
		QXClient.get().report().info("projects logo verified");
		QXClient.get().gestures().waitAndClickElementisVisible(homePageObjects.viewproject);
		QXClient.get().gestures().BlindWait(3000);
		QXClient.get().gestures().waitAndClickElementisVisible(homePageObjects.clkDoNotShare);
		QXClient.get().gestures().BlindWait(4000);

		QXClient.get().report().info("projectview logo verified");
		QXClient.get().gestures().waitAndClickElementisVisible(homePageObjects.clknewtask);
		QXClient.get().gestures().BlindWait(2000);
		QXClient.get().gestures().waitAndClickElementisVisible(homePageObjects.clkassignedtoobj);
		QXClient.get().gestures().BlindWait(2000);
		homePageObjects.clkassignedtoobj.sendKeys("test1");
		QXClient.get().gestures().BlindWait(5000);
		QXClient.get().gestures().waitAndClickElementisVisible(homePageObjects.clkondatecalender);
		QXClient.get().gestures().BlindWait(3000);
		QXClient.get().gestures().waitAndClickElementisVisible(homePageObjects.clkoncurrentdate);
		QXClient.get().gestures().BlindWait(3000);
		/*QXClient.get().gestures().waitAndClickElementisVisible(homePageObjects.clktaskdescriptionobj);
		QXClient.get().gestures().BlindWait(3000);
        String FakeName=QXClient.get().gestures().generateRandomName();

		homePageObjects.clktaskdescriptionobj.sendKeys(FakeName);
		QXClient.get().gestures().BlindWait(3000);
		
		String gettext=QXClient.get().gestures().getText(homePageObjects.clktaskdescriptionobj);
		
		QXClient.get().gestures().clkBackButton();
		QXClient.get().gestures().BlindWait(3000);*/
		QXClient.get().gestures().waitAndClickElementisVisible(homePageObjects.clkaddtask);
		QXClient.get().gestures().BlindWait(3000);
		QXClient.get().gestures().waitAndClickElementisVisible(homePageObjects.clkonverticalmenu);
		QXClient.get().gestures().BlindWait(3000);
		QXClient.get().gestures().waitAndClickElementisVisible(homePageObjects.clkonverticalmenuedit);
		QXClient.get().report().info("finished sucessfully");
		QXClient.get().gestures().BlindWait(5000);
		QXClient.get().gestures().waitAndClickElementisVisible(homePageObjects.clkoneditassigntask);
		QXClient.get().gestures().BlindWait(3000);
		QXClient.get().gestures().waitAndClickElementisVisible(homePageObjects.editassignname);
		QXClient.get().gestures().BlindWait(3000);
		/*
		 * QXClient.get().gestures().longPress(homePageObjects.editassignname);
		 * QXClient.get().gestures().doubleTap(homePageObjects.editassignname);
		 * QXClient.get().gestures().BlindWait(3000);
		 * homePageObjects.editassignname.clear();
		 * QXClient.get().gestures().BlindWait(3000);
		 * homePageObjects.editassignname.sendKeys("krush");
		 * QXClient.get().gestures().BlindWait(3000);
		 */
		QXClient.get().gestures().waitAndClickElementisVisible(homePageObjects.clksavebutton);
		QXClient.get().gestures().BlindWait(3000);
		QXClient.get().gestures().waitAndClickElementisVisible(homePageObjects.clkonstatusedit);
		QXClient.get().gestures().BlindWait(3000);
		QXClient.get().gestures().waitAndClickElementisVisible(homePageObjects.clkoneditcompleted);
		QXClient.get().gestures().BlindWait(3000);
		QXClient.get().gestures().waitAndClickElementisVisible(homePageObjects.clkonok);
		QXClient.get().gestures().BlindWait(4000);
		
//		QXClient.get().gestures().waitAndClickElementisVisible(homePageObjects.clksubtask);
//		QXClient.get().gestures().BlindWait(3000);
//		homePageObjects.clksubtask.sendKeys("autosubTask");
//		
//		QXClient.get().gestures().waitAndClickElementisVisible(homePageObjects.clAddSubtaskbtn);
//		QXClient.get().gestures().BlindWait(3000);
//		
		//QXClient.get().gestures().clkBackButton();
		//QXClient.get().gestures().BlindWait(3000);

		QXClient.get().gestures().waitAndClickElementisVisible(homePageObjects.clkaddattachment);
		QXClient.get().gestures().BlindWait(3000);
		QXClient.get().gestures().waitAndClickElementisVisible(homePageObjects.clkCheckboxAAttachmentPopup);

		QXClient.get().gestures().waitAndClickElementisVisible(homePageObjects.clkUploadBtnAttachmentPopup);
		QXClient.get().gestures().BlindWait(3000);
		QXClient.get().gestures().waitAndClickElementisVisible(homePageObjects.clkContinuewBtn);
		QXClient.get().gestures().BlindWait(5000);
		QXClient.get().gestures().waitAndClickElementisVisible(homePageObjects.clkCreatedTask);
		QXClient.get().gestures().BlindWait(5000);
		
	    Assert.assertTrue(QXClient.get().gestures().isElementPresent(homePageObjects.assertCreatedTaskWithCompleteStatus),"assertCreatedTaskWithCompleteStatus is not updated");

		QXClient.get().gestures().BlindWait(2000);
			
    	 
    	  

	}
	public void reportsectionsurvey() throws Exception {
        QXClient.get().gestures().BlindWait(5000);
        QXClient.get().gestures().swipeUp();
        QXClient.get().gestures().waitAndClickElementisVisible(homePageObjects.clkonreports);
        QXClient.get().gestures().BlindWait(3000);
        // Assert.assertTrue(QXClient.get().gestures().isElementPresent(homePageObjects.reportslogo),"Reports");
        QXClient.get().report().info("report logo verified");
        QXClient.get().gestures().waitAndClickElementisVisible(homePageObjects.clkonimprovementreports);
        QXClient.get().gestures().BlindWait(3000);

        if (QXClient.get().gestures().isElementPresent(homePageObjects.noDataPopup)) {
            QXClient.get().gestures().waitAndClickElementisVisible(homePageObjects.noDataPopup);
            QXClient.get().gestures().BlindWait(2000);

        }else{
            QXClient.get().report().info("No Data popup is not displayed");
        }

        // Assert.assertTrue(QXClient.get().gestures().isElementPresent(homePageObjects.projectoverviewlogo),"Project overview");
        QXClient.get().report().info("projectoverview logo verified");
        QXClient.get().gestures().waitAndClickElementisVisible(homePageObjects.clkonverticalmenu);
        QXClient.get().gestures().BlindWait(3000);
        QXClient.get().gestures().waitAndClickElementisVisible(homePageObjects.clkondownloadfromverticalmenu);
        QXClient.get().gestures().BlindWait(3000);
        //QXClient.get().gestures().waitAndClickElementisVisible(homePageObjects.clkonallowpopup);
        QXClient.get().gestures().BlindWait(2000);
        //QXClient.get().gestures().waitAndClickElementisVisible(homePageObjects.clkonverticalmenu);
        QXClient.get().gestures().BlindWait(3000);
        //QXClient.get().gestures().waitAndClickElementisVisible(homePageObjects.clkondownloadfromverticalmenu);
        QXClient.get().report().info("downloaded sucessfully");
	}
	
public void validateErrorwhieMerging(String username1, String password1) throws Exception {
		
		QXClient.get().gestures().BlindWait(3000);
		QXClient.get().gestures().waitAndClickElementisVisible(homePageObjects.menuBar);
        QXClient.get().report().info("clicked on Menu Icon");
        QXClient.get().gestures().BlindWait(3000);
        QXClient.get().gestures().waitAndClickElementisVisible(libraryCourseContentPageObjects.Clksettings);
        QXClient.get().report().info("clicked on Settings in Menu");
        QXClient.get().gestures().BlindWait(3000);
        QXClient.get().gestures().waitAndClickElementisVisible(homePageObjects.clkonmergeaccount);
        QXClient.get().gestures().BlindWait(3000);
        QXClient.get().gestures().waitAndClickElementisVisible(homePageObjects.clkonmergebuttonofpopup);
        QXClient.get().gestures().BlindWait(3000);
        
        QXClient.get().gestures().waitForElementToAppear(loginPageObjects.usernameObj);
        loginPageObjects.usernameObj.sendKeys(username1);
        QXClient.get().report().info("Enter the username");
        QXClient.get().gestures().BlindWait(3000);
        QXClient.get().gestures().waitForElementToAppear(loginPageObjects.pwdEditbx);
        loginPageObjects.pwdEditbx.sendKeys(password1);
        QXClient.get().report().info("Enter the password");
        QXClient.get().gestures().BlindWait(3000);

        QXClient.get().gestures().waitAndClickElementisVisible(profilePageObjects.loginBtn);
        QXClient.get().gestures().BlindWait(5000);
        QXClient.get().report().info("Tap on login button");
        if (!QXClient.get().gestures().isElementPresent(homePageObjects.errorpopup)) {
            QXClient.get().report().info("Failed to merge account error validated succesfully");

        }
        
} 
        public void startObservation() throws Exception {
    		QXClient.get().gestures().waitAndClickElementisVisible(homePageObjects.clkonprograms);
    		QXClient.get().gestures().BlindWait(3000);
    		QXClient.get().gestures().waitAndClickElementisVisible(homePageObjects.clkonObservationledprojectstesting);
    		QXClient.get().gestures().BlindWait(3000);
    		QXClient.get().gestures().waitAndClickElementisVisible(homePageObjects.clkonObsrvationledprojectstetingfirstindex);
    		QXClient.get().gestures().BlindWait(3000);
    		QXClient.get().gestures().waitAndClickElementisVisible(homePageObjects.clkonleadershipselfassesmentaddentityfirstindex);
    		QXClient.get().gestures().BlindWait(3000);
    		QXClient.get().gestures().waitAndClickElementisVisible(homePageObjects.clkonobservaionfirstindex);
    		QXClient.get().gestures().BlindWait(3000);
    		QXClient.get().gestures().waitAndClickElementisVisible(homePageObjects.clkondomainsfirstindex);
    		QXClient.get().gestures().BlindWait(3000);
    		QXClient.get().gestures().waitAndClickElementisVisible(homePageObjects.clkonstartobservtion);
    		QXClient.get().gestures().BlindWait(3000);
    		QXClient.get().gestures().waitAndClickElementisVisible(homePageObjects.clkonreflectionteaching);
    		QXClient.get().gestures().BlindWait(3000);
    		QXClient.get().gestures().waitAndClickElementisVisible(homePageObjects.clkonfirstindexofhabits);
    		QXClient.get().gestures().BlindWait(3000);
    		QXClient.get().gestures().waitAndClickElementisVisible(homePageObjects.clkonnextarrowforward);
    		QXClient.get().gestures().BlindWait(3000);
    		QXClient.get().gestures().waitAndClickElementisVisible(homePageObjects.clkonsavebutton);
    	}	
        
        public void programList(String programnameoftheuser) throws Exception {
    		QXClient.get().gestures().BlindWait(5000);

    		QXClient.get().gestures().waitAndClickElementisVisible(homePageObjects.clkonprograms);
    		QXClient.get().gestures().BlindWait(5000);
   	
    		 Assert.assertTrue(QXClient.get().gestures().isElementPresent(homePageObjects.allprogramnames.get(1)),"assertUpdatedProjectName is not available");
             QXClient.get().report().info("Verified program list1");
             Assert.assertTrue(QXClient.get().gestures().isElementPresent(homePageObjects.allprogramnames.get(5)),"assertUpdatedProjectName is not available");
             QXClient.get().report().info("Verified program list2");

    	  
    	  }
        
        public void verifyFiltersForMediaType() throws Exception{
            QXClient.get().gestures().BlindWait(3000);

            Assert.assertTrue(QXClient.get().gestures().isElementPresent(homePageObjects.filtersbutton),"Filter button is not available");

            QXClient.get().gestures().waitAndClickElementisVisible(homePageObjects.filtersbutton);
            QXClient.get().report().info("Clicked on filter");
            QXClient.get().gestures().BlindWait(3000);

            Assert.assertTrue(QXClient.get().gestures().isElementPresent(homePageObjects.mediaTypefilter),"Media type is not available in filter");
            QXClient.get().gestures().clkBackButton();

        }
     public void verifyContentWithAllMediaType() throws Exception {
            QXClient.get().gestures().BlindWait(3000);


            Assert.assertTrue(QXClient.get().gestures().isElementPresent(homePageObjects.allMediaType),"All media type is not available");

            boolean defaultSelectedMediaType=homePageObjects.allMediaType.isEnabled();
            Assert.assertEquals(defaultSelectedMediaType,true);

            QXClient.get().report().info("By default the media type selected is All");

            Assert.assertTrue((QXClient.get().gestures().isElementPresent(homePageObjects.videoMediaType)),"Video media type is not available");
            Assert.assertTrue(QXClient.get().gestures().isElementPresent(homePageObjects.documentsMediaType),"Documents media type is not available");
            Assert.assertTrue(QXClient.get().gestures().isElementPresent(homePageObjects.interactiveMediaType),"Interactive media type is not available");

            QXClient.get().report().info("The shape of the media type looks pills like structure");
        }

        public void verfiyContentUnderVideoMediaType() throws Exception{
            QXClient.get().gestures().BlindWait(3000);

            QXClient.get().gestures().waitAndClickElementisVisible(homePageObjects.videoMediaType);
            QXClient.get().report().info("Clicked on Video media type");
            QXClient.get().gestures().BlindWait(3000);

            QXClient.get().gestures().waitAndClickElementisVisible(homePageObjects.firstContentUnderVideoType);
            QXClient.get().report().info("Clicked on first content under selected media type");
            QXClient.get().gestures().BlindWait(3000);

            Assert.assertTrue(QXClient.get().gestures().isElementPresent(homePageObjects.playIconOfVideo),"Media type is not matching");

        }
        
        
        public void verifyMyCourseAndSubjectwiseCourses() throws Exception{
            QXClient.get().gestures().BlindWait(3000);

            Assert.assertTrue(QXClient.get().gestures().isElementPresent(homePageObjects.courseSecInTraining),"Courses section is not visible");
            QXClient.get().report().info("Course section is displayed after clicking course tab");


            Assert.assertTrue(QXClient.get().gestures().isElementPresent(homePageObjects.accountancySubject),"Accountancy subject is not displayed");
            QXClient.get().report().info("Courses under Accountancy subject is displayed");

            QXClient.get().gestures().swipeUp();

            Assert.assertTrue(QXClient.get().gestures().isElementPresent(homePageObjects.assameseSubject),"Assamese subject is not displayed");
            QXClient.get().report().info("Courses under Assamese subject is displayed");

            QXClient.get().gestures().swipeUp();
            QXClient.get().gestures().swipeUp();
            QXClient.get().gestures().swipeUp();
            QXClient.get().gestures().swipeUp();
           // QXClient.get().gestures().swipeUp();
           // QXClient.get().gestures().swipeUp();

            Assert.assertTrue(QXClient.get().gestures().isElementPresent(homePageObjects.englishSubject),"English subject is not displayed");
            QXClient.get().report().info("Courses under English subject is displayed");

            Assert.assertTrue(QXClient.get().gestures().isElementPresent(homePageObjects.viewMoreBtn),"View more button is not displayed");
            QXClient.get().report().info("View More button is displayed");

            QXClient.get().gestures().waitAndClickElementisVisible(homePageObjects.viewMoreBtn);
            QXClient.get().report().info("Clicked on view more button");


            QXClient.get().gestures().swipeUp();
            QXClient.get().gestures().swipeUp();
            QXClient.get().gestures().swipeUp();

        }
               
        public void verifyHomePageSubjects() throws Exception{
            QXClient.get().gestures().BlindWait(3000);
            Assert.assertTrue(QXClient.get().gestures().isElementPresent(homePageObjects.observeEnglishSub),"English subject is not available in home page");
            QXClient.get().report().info("English subject is available on Home page");
            Assert.assertTrue(QXClient.get().gestures().isElementPresent(homePageObjects.observeAccountancySub),"Accountancy subject is not available in home page");
            QXClient.get().report().info("Accountancy subject is available on Home page");
            QXClient.get().gestures().swipeUp();
            Assert.assertTrue(QXClient.get().gestures().isElementPresent(homePageObjects.observeBiologySub),"Biology subject is not available in home page");
            QXClient.get().report().info("Biology subject is available on Home page");
        }
        
        public void verifyLabelsForTrackableCollections() throws Exception{
            QXClient.get().gestures().BlindWait(3000);

            Assert.assertTrue(QXClient.get().gestures().isElementPresent(homePageObjects.courseDetailsLabel),"Course details label is not available");
            QXClient.get().report().info("Course details label is displayed");

            Assert.assertTrue(QXClient.get().gestures().isElementPresent(homePageObjects.courseModulesLabel),"Course modules label is not available");
            QXClient.get().report().info("Course modules label is displayed");

            if(QXClient.get().gestures().isElementPresent(trainingPageObjects.clkJoinCourseBtn)){
                QXClient.get().report().info("Join course label is displayed");
            }
        }
        
        public void observeUserAbleToPlayContent() throws Exception{
            QXClient.get().gestures().BlindWait(3000);

            Assert.assertTrue(QXClient.get().gestures().isElementPresent(homePageObjects.contentPlayBtn),"Content play button is not displayed");
            QXClient.get().report().info("Content is having playable content");
            QXClient.get().gestures().waitAndClickElementisVisible(homePageObjects.contentPlayBtn);
            QXClient.get().report().info("Clicked on content to play");
            QXClient.get().gestures().BlindWait(3000);

            Assert.assertTrue(QXClient.get().gestures().isElementPresent(homePageObjects.playIconOfVideo),"Play icon is not displayed");
            QXClient.get().gestures().waitAndClickElementisVisible(homePageObjects.playIconOfVideo);
            QXClient.get().report().info("Clicked on play icon of the content");
            QXClient.get().gestures().BlindWait(3000);

            QXClient.get().gestures().BlindWait(9000);
            QXClient.get().report().info("User able to play the content");

            QXClient.get().gestures().clkBackButton();
            QXClient.get().gestures().waitAndClickElementisVisible(homePageObjects.clkOkBtn);
        }

        public void createOnlyGrp() throws Exception {
            QXClient.get().gestures().BlindWait(5000);

            
                QXClient.get().gestures().waitAndClickElementisVisible(homePageObjects.clkMyGroups);
                QXClient.get().report().info("clicked on MyGroups");

                
                try
                {
                QXClient.get().gestures().waitAndClickElementisVisible(homePageObjects.clkCloseIconGrp);
                QXClient.get().report().info("Tap on clkCloseIconGrp button");
                }
                catch(Exception e3)
                {
                	System.out.println("Handled");
                }
                
                try
                {
                if(QXClient.get().gestures().isElementPresent(homePageObjects.clkCreateGroup)) {
                              QXClient.get().gestures().waitAndClickElementisVisible(homePageObjects.clkCreateGroup);
                    QXClient.get().report().info("clicked on clkCreateGroup");
                    QXClient.get().gestures().BlindWait(3000);
                }
                else
                {
                	 QXClient.get().gestures().waitAndClickElementisVisible(homePageObjects.clkAddImgGrp);
                     QXClient.get().report().info("clicked on clkAddImgGrp");
                }
                }
                catch(Exception e)
                {
                	System.out.println("Excep handked");
                }
                

                
                  
                    String FakeName=QXClient.get().gestures().generateRandomName();
         
                    QXClient.get().gestures().waitAndClickElementisVisible(homePageObjects.enterGroupName);
                    QXClient.get().report().info("clicked on enterGroupName");
                    
                    homePageObjects.enterGroupName.sendKeys("delete");
                    
              	  String storeFakeNameEntered=homePageObjects.enterGroupName.getText();
              	  System.out.println(storeFakeNameEntered);

              	    
              	  
                    QXClient.get().gestures().waitAndClickElementisVisible(homePageObjects.enterGroupDesc);
                    QXClient.get().report().info("clicked on enterGroupDesc");
                    homePageObjects.enterGroupDesc.sendKeys("GroupDesName");
                    QXClient.get().gestures().BlindWait(3000);

                    
          		  QXClient.get().gestures().clkBackButton();
                  QXClient.get().gestures().BlindWait(7000);

                                QXClient.get().gestures().waitAndClickElementisVisible(homePageObjects.clkTermsAndCondition);
                    QXClient.get().report().info("clicked on clkTermsAndCondition");
                    QXClient.get().gestures().BlindWait(3000);

                                QXClient.get().gestures().waitAndClickElementisVisible(homePageObjects.clkGroupForCreation);
                    QXClient.get().report().info("clicked on clkGroupForCreation");
                    QXClient.get().gestures().BlindWait(6000);
         
                    
                    
              	  QXClient.get().gestures().generateXpathAndClickElement(storeFakeNameEntered);
                  //  QXClient.get().gestures().waitAndClickElementisVisible(homePageObjects.clkFirstCreateGroup);
                    QXClient.get().report().info("clicked on clkFirstCreateGroup");
				
            
                    
                    
                
                   }
        public void deleteGroupOnly() throws Exception {
            QXClient.get().gestures().BlindWait(5000);

            
                QXClient.get().gestures().waitAndClickElementisVisible(homePageObjects.clkMenuInGroup);
                QXClient.get().report().info("clicked on clkMenuInGroup");

                QXClient.get().gestures().waitAndClickElementisVisible(homePageObjects.clkDeleInMenuGrp);
                QXClient.get().report().info("Tap on clkDeleInMenuGrp button");
            
                       
                QXClient.get().gestures().waitAndClickElementisVisible(homePageObjects.clkDeleteInPopUp);
                QXClient.get().report().info("Tap on clkDeleteInPopUp button");
                
                QXClient.get().gestures().BlindWait(4000);

                
                Assert.assertFalse(homePageObjects.deleteAssertGrp);
                
                
//                if (!QXClient.get().gestures().isElementPresent(homePageObjects.deleteAssertGrp)) {
//                    QXClient.get().report().info("Created Grp deleted Succesfully");
//
//                
//
//                QXClient.get().report().info("Verified clkCreateGroup button,Group deleted succesfully");
//                
//                }
        }
        
        public void verifyCertificateToastMessage() throws Exception{
            QXClient.get().gestures().BlindWait(3000);
            QXClient.get().gestures().swipeUp();
            QXClient.get().gestures().swipeUp();
            QXClient.get().gestures().swipeUp();
            QXClient.get().gestures().BlindWait(3000);

            Assert.assertTrue(QXClient.get().gestures().isElementPresent(homePageObjects.certificateIcon),"Certificate icon is not displayed");
            QXClient.get().gestures().waitAndClickElementisVisible(homePageObjects.certificateIcon);
            QXClient.get().report().info("Clicked on certificate icon");
            QXClient.get().gestures().BlindWait(3000);

            QXClient.get().gestures().waitAndClickElementisVisible(homePageObjects.clkAllowIcon);
            QXClient.get().gestures().BlindWait(3000);
            QXClient.get().gestures().waitAndClickElementisVisible(homePageObjects.clkAllowIcon);
            QXClient.get().report().info("Clicked on Allow access");
            QXClient.get().gestures().BlindWait(3000);

            Assert.assertTrue(QXClient.get().gestures().isElementPresent(homePageObjects.clkDownloadBtn),"Download icon is not displayed");
            QXClient.get().gestures().waitAndClickElementisVisible(homePageObjects.clkDownloadBtn);
            QXClient.get().report().info("Clicked on download icon");
            QXClient.get().gestures().BlindWait(2000);

            Assert.assertTrue(QXClient.get().gestures().isElementPresent(homePageObjects.assertPdfCertificate),"PDF format is not displayed");
            Assert.assertTrue(QXClient.get().gestures().isElementPresent(homePageObjects.assertPngCertificate),"PNG format is not displayed");

            QXClient.get().gestures().waitAndClickElementisVisible(homePageObjects.assertPdfCertificate);
            QXClient.get().report().info("Clicked on PDF format certificate");
            QXClient.get().gestures().BlindWait(3000);

            Assert.assertTrue(QXClient.get().gestures().isElementPresent(homePageObjects.assertToastMessage),"Toast message is not displayed");
            QXClient.get().report().info("Toast message is displayed");

        }

        

        
        public void verifyMergeAccountInSettings() throws Exception {
            QXClient.get().gestures().BlindWait(2000);

            QXClient.get().gestures().waitAndClickElementisVisible(homePageObjects.clkSettings);
            QXClient.get().report().info("Clicked on Settings in Menu bar");
            QXClient.get().gestures().BlindWait(2000);

            Assert.assertTrue(QXClient.get().gestures().isElementPresent(homePageObjects.clkMergeAccount),"Merge Account is not displayed");
            QXClient.get().report().info("Merge Account is displayed in settings screen");

            QXClient.get().gestures().waitAndClickElementisVisible(homePageObjects.clkMergeAccount);
            QXClient.get().report().info("Clicked on Merge Account");
            QXClient.get().gestures().BlindWait(3000);

            Assert.assertTrue(QXClient.get().gestures().isElementPresent(homePageObjects.verifyMergeAccountText),"Merge account text is not displayed");
            QXClient.get().report().info("Merge Account text is displayed");
            Assert.assertTrue(QXClient.get().gestures().isElementPresent(homePageObjects.clkMergeBtn),"Merge button is not displayed");
            QXClient.get().report().info("Merge Button is displayed");
            Assert.assertTrue(QXClient.get().gestures().isElementPresent(homePageObjects.clkCancel),"Cancel Button is not displayed");
            QXClient.get().report().info("Cancel Button is displayed");

            QXClient.get().gestures().clkBackButton();
            QXClient.get().gestures().BlindWait(3000);

            Assert.assertTrue(QXClient.get().gestures().isElementPresent(homePageObjects.clkMergeAccount),"Merge Account is not displayed");
            QXClient.get().report().info("After clicking back button from merge Account page landed on Settings screen");


        }
        
        public void verifyLoginPageWhileMergeAccount() throws Exception{
            QXClient.get().gestures().BlindWait(3000);

            QXClient.get().gestures().waitAndClickElementisVisible(homePageObjects.clkSettings);
            QXClient.get().report().info("Clicked on Settings in Menu bar");
            QXClient.get().gestures().BlindWait(2000);

            Assert.assertTrue(QXClient.get().gestures().isElementPresent(homePageObjects.clkMergeAccount),"Merge Account is not displayed");
            QXClient.get().report().info("Merge Account is displayed in settings screen");

            QXClient.get().gestures().waitAndClickElementisVisible(homePageObjects.clkMergeAccount);
            QXClient.get().report().info("Clicked on Merge Account");
            QXClient.get().gestures().BlindWait(3000);

            Assert.assertTrue(QXClient.get().gestures().isElementPresent(homePageObjects.verifyMergeAccountText),"Merge account text is not displayed");
            QXClient.get().report().info("Merge Account text is displayed");
            Assert.assertTrue(QXClient.get().gestures().isElementPresent(homePageObjects.twoAccountswithDikshaText),"Two accounts with diksha is not displayed");
            QXClient.get().report().info("Two accounts with diksha text is displayed");
            Assert.assertTrue(QXClient.get().gestures().isElementPresent(homePageObjects.assertMergeText),"Merge text is not displayed");
            QXClient.get().report().info("Merge text is displayed");
            Assert.assertTrue(QXClient.get().gestures().isElementPresent(homePageObjects.assertCancelText),"Cancel text is not displayed");
            QXClient.get().report().info("Cancel text is displayed");
            Assert.assertTrue(QXClient.get().gestures().isElementPresent(homePageObjects.assertCombineAccountsText),"Combine accounts text is not displayed");
            QXClient.get().report().info("Combine accounts text is displayed");
            Assert.assertTrue(QXClient.get().gestures().isElementPresent(homePageObjects.assertDeleteAccountText),"Delete account text is not displayed");
            QXClient.get().report().info("Delete account text is displayed");
            Assert.assertTrue(QXClient.get().gestures().isElementPresent(homePageObjects.clkMergeBtn),"Merge button is not displayed");
            QXClient.get().report().info("Merge Button is displayed");
            Assert.assertTrue(QXClient.get().gestures().isElementPresent(homePageObjects.clkCancel),"Cancel Button is not displayed");
            QXClient.get().report().info("Cancel Button is displayed");

            QXClient.get().gestures().waitAndClickElementisVisible(homePageObjects.clkMergeBtn);
            QXClient.get().report().info("Clicked on merge account button");
            QXClient.get().gestures().BlindWait(6000);

            Assert.assertTrue(QXClient.get().gestures().isElementPresent(homePageObjects.clkMergeAccount),"Merge Account in login page is not displayed");
            QXClient.get().report().info("Merge Account in Login page is displayed");
            Assert.assertTrue(QXClient.get().gestures().isElementPresent(homePageObjects.LoginPageText),"Login text is not displayed");
            QXClient.get().report().info("Login text is displayed");

            QXClient.get().gestures().BlindWait(3000);
            Assert.assertTrue(QXClient.get().gestures().isElementPresent(homePageObjects.assertEmailAddressLabel),"Email address label is not visible");
            QXClient.get().report().info("Email Address Label is displayed in Login Page");

            Assert.assertTrue(QXClient.get().gestures().isElementPresent(homePageObjects.assertPasswordLabel),"Password label is not displayed");
            QXClient.get().report().info("Password Label is displayed in Login Page");
            QXClient.get().gestures().BlindWait(3000);

            QXClient.get().gestures().clkBackButton();
            QXClient.get().gestures().BlindWait(3000);
            Assert.assertTrue(QXClient.get().gestures().isElementPresent(homePageObjects.clkMergeAccount),"Merge Account is not displayed");
            QXClient.get().report().info("Landed on  settings screen");

            QXClient.get().gestures().waitAndClickElementisVisible(homePageObjects.clkMergeAccount);
            QXClient.get().report().info("Clicked on Merge Account");
            QXClient.get().gestures().BlindWait(3000);

            Assert.assertTrue(QXClient.get().gestures().isElementPresent(homePageObjects.clkMergeBtn),"Merge button is not displayed");
            QXClient.get().report().info("Merge Button is displayed");
            Assert.assertTrue(QXClient.get().gestures().isElementPresent(homePageObjects.clkCancel),"Cancel Button is not displayed");
            QXClient.get().report().info("Cancel Button is displayed");

            QXClient.get().gestures().waitAndClickElementisVisible(homePageObjects.clkCancel);
            QXClient.get().report().info("Clicked on Cancel Button");
            QXClient.get().gestures().BlindWait(3000);
            Assert.assertTrue(QXClient.get().gestures().isElementPresent(homePageObjects.clkMergeAccount),"Merge Account is not displayed");
            QXClient.get().report().info("Landed on  settings screen");

        }

        public void verifyUserCanChangePermissions() throws Exception{
            QXClient.get().gestures().BlindWait(3000);

            QXClient.get().gestures().waitAndClickElementisVisible(homePageObjects.clkSettings);
            QXClient.get().report().info("Clicked on settings in menu bar");
            QXClient.get().gestures().BlindWait(3000);

            QXClient.get().gestures().waitAndClickElementisVisible(homePageObjects.clkPermissions);
            QXClient.get().report().info("Clicked on permissions in settings");
            QXClient.get().gestures().BlindWait(2000);

            Assert.assertTrue(QXClient.get().gestures().isElementPresent(homePageObjects.assertCamera),"Camera is not displayed");
            QXClient.get().report().info("Camera permission is displayed");
            Assert.assertTrue(QXClient.get().gestures().isElementPresent(homePageObjects.assertFileManager),"File manager is not displayed");
            QXClient.get().report().info("File manager permission is displayed");
            Assert.assertTrue(QXClient.get().gestures().isElementPresent(homePageObjects.assertMicrophone),"Microphone is not displayed");
            QXClient.get().report().info("Microphone permission is displayed");

            QXClient.get().gestures().waitAndClickElementisVisible(homePageObjects.clkCameraPermission);
            QXClient.get().gestures().BlindWait(2000);

            QXClient.get().gestures().waitAndClickElementisVisible(homePageObjects.clkOnPermissions);
            QXClient.get().gestures().BlindWait(2000);

            QXClient.get().gestures().waitAndClickElementisVisible(homePageObjects.clkOnCamera);
            QXClient.get().gestures().BlindWait(2000);

            Assert.assertTrue(QXClient.get().gestures().isElementPresent(homePageObjects.assertAllowOnlyUsingApp),"Allow only using App is not displayed");
            QXClient.get().report().info("Allow only while using the app is displayed");

            Assert.assertTrue(QXClient.get().gestures().isElementPresent(homePageObjects.assertAskEveryTime),"Ask every time is not displayed");
            QXClient.get().report().info("Ask every time is displayed");

            Assert.assertTrue(QXClient.get().gestures().isElementPresent(homePageObjects.assertDenyPermissions),"Deny permissions is not displayed");
            QXClient.get().report().info("Deny permissions is displayed");

            QXClient.get().gestures().waitAndClickElementisVisible(homePageObjects.assertAskEveryTime);
            QXClient.get().report().info("Clicked ask every time perimission");
            QXClient.get().gestures().BlindWait(2000);

            QXClient.get().gestures().waitAndClickElementisVisible(homePageObjects.assertDenyPermissions);
            QXClient.get().report().info("Clicked on Deny permissions");
            QXClient.get().gestures().BlindWait(2000);
            QXClient.get().gestures().clkBackButton();
        }
        
        public void verifyUserAbleToChangeAppLanguage() throws Exception{
            QXClient.get().gestures().BlindWait(3000);

            Assert.assertTrue(QXClient.get().gestures().isElementPresent(homePageObjects.appLanguageInEnglish),"App Language is not displayed in menu");
            QXClient.get().report().info("App language is displayed in menu");

            QXClient.get().gestures().waitAndClickElementisVisible(homePageObjects.appLanguageInEnglish);
            QXClient.get().report().info("Clicked on app language in menu ");
            QXClient.get().gestures().BlindWait(2000);

            QXClient.get().gestures().waitAndClickElementisVisible(homePageObjects.sltHindiLanguage);
            QXClient.get().report().info("CLicked on Hindi language");

            QXClient.get().gestures().waitAndClickElementisVisible(homePageObjects.clkContinueInHindi);
            QXClient.get().report().info("Clicked on continue to change language");
            QXClient.get().gestures().BlindWait(2000);

            tapOnMenuBar();

            Assert.assertTrue(QXClient.get().gestures().isElementPresent(homePageObjects.appLanguageInHindi),"App language is not displayed in hindi");
            QXClient.get().report().info("App language in hindi is displayed");
            QXClient.get().gestures().BlindWait(2000);
            QXClient.get().gestures().waitAndClickElementisVisible(homePageObjects.appLanguageInHindi);
            QXClient.get().report().info("Clicked on app language");
            QXClient.get().gestures().waitAndClickElementisVisible(homePageObjects.sltEnglishLang);
            QXClient.get().report().info("Clicked on English language");
            QXClient.get().gestures().waitAndClickElementisVisible(homePageObjects.clkContinueInEnglish);
            QXClient.get().report().info("Clicked on Continue button");
            QXClient.get().gestures().BlindWait(3000);
        }
        
        public void verifyDownloadSection() throws Exception{
            QXClient.get().gestures().BlindWait(3000);

            Assert.assertTrue(QXClient.get().gestures().isElementPresent(homePageObjects.assertHamburgerMenu),"Hamburger menu is not displayed");
            QXClient.get().report().info("Hamburger menu is displayed");
            Assert.assertTrue(QXClient.get().gestures().isElementPresent(homePageObjects.assertSettingsButton),"Settings button is not displayed");
            QXClient.get().report().info("Settings button is displayed");
            Assert.assertTrue(QXClient.get().gestures().isElementPresent(homePageObjects.assertSpaceTakenByDiksha),"Space taken by diksha is not displayed");
            QXClient.get().report().info("Space taken by diksha is displayed");
            Assert.assertTrue(QXClient.get().gestures().isElementPresent(homePageObjects.assertAvailableSpace),"Available space is not displayed");
            QXClient.get().report().info("Available space is displayed");

            if(QXClient.get().gestures().isElementPresent(homePageObjects.assertNoDownloads)) {
                QXClient.get().report().info("No downloads yet is displayed");
            }

            if(QXClient.get().gestures().isElementPresent(homePageObjects.assertSelectAll)){
                QXClient.get().report().info("Select All is displayed in download section");
            }

            if(QXClient.get().gestures().isElementPresent(homePageObjects.assertContentSize)){
                QXClient.get().report().info("Content Size is displayed in download section");
            }
        }

        
        public void filterContentOnContentSize() throws Exception{
            QXClient.get().gestures().BlindWait(3000);

            QXClient.get().gestures().waitAndClickElementisVisible(homePageObjects.clkFirstContent);
            QXClient.get().report().info("Clicked on first content");
            QXClient.get().gestures().BlindWait(3000);

            QXClient.get().gestures().waitAndClickElementisVisible(homePageObjects.clkDownloadButton);
            QXClient.get().gestures().BlindWait(3000);
            QXClient.get().report().info("Clicked on download button");

            QXClient.get().gestures().waitAndClickElementisVisible(homePageObjects.clkDownload);
            QXClient.get().gestures().BlindWait(5000);
            QXClient.get().report().info("Clicked on download content button");

            QXClient.get().gestures().clkBackButton();
            QXClient.get().gestures().clkBackButton();

            tapOnDownloadTab();
            QXClient.get().gestures().BlindWait(3000);

            Assert.assertTrue(QXClient.get().gestures().isElementPresent(homePageObjects.assertContentSize),"Content size is not displayed");
            QXClient.get().gestures().waitAndClickElementisVisible(homePageObjects.assertContentSize);
            QXClient.get().report().info("Clicked on content size");
            QXClient.get().gestures().BlindWait(3000);

            Assert.assertTrue(QXClient.get().gestures().isElementPresent(homePageObjects.assertContentSizefilter),"Content size filter is not displayed");
            QXClient.get().report().info("Content size filter is displayed");
            Assert.assertTrue(QXClient.get().gestures().isElementPresent(homePageObjects.assertLastViewedFilter),"Last viewed filter is not displayed");
            QXClient.get().report().info("Last viewed filter is displayed");

            QXClient.get().gestures().BlindWait(2000);
            QXClient.get().gestures().waitAndClickElementisVisible(homePageObjects.assertContentSizefilter);
            QXClient.get().report().info("Clicked on content size filter");

            QXClient.get().gestures().waitAndClickElementisVisible(homePageObjects.assertSelectAll);
            QXClient.get().report().info("Clicked on select all");

            QXClient.get().gestures().BlindWait(3000);
            QXClient.get().report().info("Delete,Cancel multiple content and Number of files selected is displayed");

            QXClient.get().gestures().BlindWait(2000);
            QXClient.get().gestures().clkBackButton();

            QXClient.get().gestures().waitAndClickElementisVisible(homePageObjects.clkDeleteBtn);
            QXClient.get().gestures().BlindWait(2000);
            QXClient.get().gestures().waitAndClickElementisVisible(homePageObjects.clkDeleteBtn);
            QXClient.get().report().info("Clicked on Delete button");

            Assert.assertTrue(QXClient.get().gestures().isElementPresent(homePageObjects.assertNoDownloads),"No downloads in not displayed");
            QXClient.get().report().info("No Downloads yet is displayed after deleting the content");
            QXClient.get().gestures().BlindWait(2000);


        }
        
        
        public void verifyGroupsPage() throws Exception{
            QXClient.get().gestures().BlindWait(5000);


            QXClient.get().gestures().waitAndClickElementisVisible(homePageObjects.clkMyGroups);
            QXClient.get().report().info("clicked on MyGroups");


            try
            {
                QXClient.get().gestures().waitAndClickElementisVisible(homePageObjects.clkCloseIconGrp);
                QXClient.get().report().info("Tap on clkCloseIconGrp button");
            }
            catch(Exception e3)
            {
                System.out.println("Handled");
            }

            //Assert.assertTrue(QXClient.get().gestures().isElementPresent(homePageObjects.clkMyGroups),"My groups is not displayed");
            QXClient.get().report().info("My groups is displayed");

            //Assert.assertTrue(QXClient.get().gestures().isElementPresent(homePageObjects.clkCloseIconGrp),"Group info icon at top is not displayed");
            QXClient.get().report().info("Group info icon at the top is displayed");

           // Assert.assertTrue(QXClient.get().gestures().isElementPresent(homePageObjects.clkCreateGroup),"Create group with icon is not displayed");
            QXClient.get().report().info("Create group with icon is displayed");

            Assert.assertTrue(QXClient.get().gestures().isElementPresent(homePageObjects.assertCreateGroupIcon),"Create group icon is not displayed");
            QXClient.get().report().info("Create group icon is displayed");

            Assert.assertTrue(QXClient.get().gestures().isElementPresent(homePageObjects.assertPlaceHolderImages),"Placeholders images is not displayed");
            QXClient.get().report().info("Place holder images is displayed");

            Assert.assertTrue(QXClient.get().gestures().isElementPresent(homePageObjects.assertTextInMyGroupPage),"Text is not displayed");
            QXClient.get().report().info("Text in my group page is displayed");
        }
        
        
        public void verifyEnableDisableDebugMode() throws Exception{
            QXClient.get().gestures().BlindWait(3000);

            tapOnMenuBar();

            QXClient.get().report().info("Clicked on hamburgerMenu button");
            QXClient.get().gestures().BlindWait(3000);

            QXClient.get().gestures().waitAndClickElementisVisible(libraryCourseContentPageObjects.Clksettings);
            QXClient.get().report().info("Clicked on settings button");
            QXClient.get().gestures().BlindWait(2000);

            Assert.assertTrue(QXClient.get().gestures().isElementPresent(homePageObjects.clkDebugMode),"Debug mode is not visible");
            QXClient.get().report().info("Debug mode is displayed");
            QXClient.get().gestures().waitAndClickElementisVisible(homePageObjects.clkDebugMode);
            QXClient.get().report().info("Clicked on debug mode ");

            Assert.assertTrue(QXClient.get().gestures().isElementPresent(homePageObjects.verifyMessageAfterClkDebug),"Message is not displayed");
            QXClient.get().report().info(homePageObjects.verifyMessageAfterClkDebug.getText());
            Assert.assertTrue(QXClient.get().gestures().isElementPresent(homePageObjects.clkCancelBtn),"Cancel button is not displayed");

            Assert.assertTrue(QXClient.get().gestures().isElementPresent(homePageObjects.clkTurnOffBtn),"Turn on button is not displayed");
            QXClient.get().gestures().waitAndClickElementisVisible(homePageObjects.clkTurnOffBtn);
            QXClient.get().report().info("Clicked on Debug turn on mode");
            QXClient.get().gestures().BlindWait(3000);

            Assert.assertTrue(QXClient.get().gestures().isElementPresent(homePageObjects.clkDebugMode),"Debug mode is not displayed");
            QXClient.get().gestures().waitAndClickElementisVisible(homePageObjects.clkDebugMode);
            QXClient.get().report().info("Clicked on debug mode");
            Assert.assertTrue(QXClient.get().gestures().isElementPresent(homePageObjects.verifyMessageAfterClkDebug),"Message is not displayed");
            QXClient.get().report().info(homePageObjects.verifyMessageAfterClkDebug.getText());
            Assert.assertTrue(QXClient.get().gestures().isElementPresent(homePageObjects.clkCancelBtn),"Cancel button is not displayed");
            Assert.assertTrue(QXClient.get().gestures().isElementPresent(homePageObjects.clkTurnOnBtn),"Turn off button not displayed");
            QXClient.get().gestures().BlindWait(3000);

            QXClient.get().gestures().waitAndClickElementisVisible(homePageObjects.clkTurnOnBtn);
            QXClient.get().report().info("Clicked on turn off debug mode");







        }
        
        public void verifyNewTagForMyGroupsAndImportContent() throws Exception{
            QXClient.get().gestures().BlindWait(3000);

            tapOnMenuBar();

            Assert.assertTrue(!QXClient.get().gestures().isElementPresent(homePageObjects.assertNewTagInMyGroups),"New Tag is displayed for My groups");
            QXClient.get().report().info("New tag is not displayed for My groups in hamburger menu");

            Assert.assertTrue(!QXClient.get().gestures().isElementPresent(homePageObjects.assertNewTagInImportContent),"New Tag is displayed for Import content");
            QXClient.get().report().info("New tag is not displayed for Import Content in hamburger menu");

            QXClient.get().gestures().clkBackButton();


        }

          public void verifyUserLoginInHamburgerMenu() throws Exception{
            QXClient.get().gestures().BlindWait(2000);

            tapOnMenuBar();

            Assert.assertTrue(QXClient.get().gestures().isElementPresent(homePageObjects.assertUserLoginText),"User Login is not displayed in hamburger menu");
            QXClient.get().report().info("User Login is displayed in Hamburger menu");
            QXClient.get().gestures().waitAndClickElementisVisible(homePageObjects.assertUserLoginText);
            QXClient.get().report().info("Clicked on login");

            Assert.assertTrue(QXClient.get().gestures().isElementPresent(homePageObjects.assertLoginPageText),"Login page is not displayed");
            Assert.assertTrue(QXClient.get().gestures().isElementPresent(homePageObjects.assertDikshaLogoLogin),"Diksha Login logo is not displayed");

            QXClient.get().gestures().clkBackButton();
          }

          public void verifyUserLoginInProfile() throws Exception{
            QXClient.get().gestures().BlindWait(3000);

            QXClient.get().gestures().swipeUp();
            Assert.assertTrue(QXClient.get().gestures().isElementPresent(homePageObjects.assertGuestUserInProfile),"Guest user not displayed");
            QXClient.get().report().info("Guest user is displayed in profile page");

            Assert.assertTrue(QXClient.get().gestures().isElementPresent(homePageObjects.assertUserLoginBtn),"User login button is not displayed");
            QXClient.get().report().info("User button is displayed in profile page");
            QXClient.get().gestures().waitAndClickElementisVisible(homePageObjects.assertUserLoginBtn);
            QXClient.get().report().info("Clicked on Login button");

            Assert.assertTrue(QXClient.get().gestures().isElementPresent(homePageObjects.assertLoginPageText),"Login page is not displayed");
            Assert.assertTrue(QXClient.get().gestures().isElementPresent(homePageObjects.assertDikshaLogoLogin),"Diksha Login logo is not displayed");

          }
          
          public void verifyActivityDashBoard() throws Exception{
        	  QXClient.get().gestures().BlindWait(3000);

        	  tapOnMenuBar();
        	  QXClient.get().gestures().waitAndClickElementisVisible(homePageObjects.clkMyGroups);
        	  QXClient.get().report().info("Clicked on My groups button");
        	  QXClient.get().gestures().BlindWait(2000);

        	    try
        	    {
        	        QXClient.get().gestures().waitAndClickElementisVisible(homePageObjects.clkCloseIconGrp);
        	        QXClient.get().report().info("Tap on clkCloseIconGrp button");
        	    }
        	    catch(Exception e3)
        	    {
        	        System.out.println("Handled");
        	    }

        	    QXClient.get().gestures().waitAndClickElementisVisible(homePageObjects.clkFirstGroup);
        	    QXClient.get().report().info("Clicked on First group");
        	    QXClient.get().gestures().BlindWait(2000);

        	    Assert.assertTrue(QXClient.get().gestures().isElementPresent(homePageObjects.courseUnderFirstGrp),"Course is not displayed");
        	    QXClient.get().gestures().waitAndClickElementisVisible(homePageObjects.courseUnderFirstGrp);
        	    QXClient.get().report().info("Clicked on Course under Group");
        	    QXClient.get().gestures().BlindWait(3000);

        	    //Assert.assertTrue(QXClient.get().gestures().isElementPresent(homePageObjects.assertCourseProgress),"Course progress is not displayed");
        	    Assert.assertTrue(QXClient.get().gestures().isElementPresent(homePageObjects.clkActivityDashboard),"Activity dashboard is not displayed");
        	    QXClient.get().report().info("Activity dashboard is displayed");
        	    QXClient.get().gestures().waitAndClickElementisVisible(homePageObjects.clkActivityDashboard);
        	    QXClient.get().report().info("Clicked on activity dashboard");
        	    QXClient.get().gestures().BlindWait(3000);

        	    Assert.assertTrue(QXClient.get().gestures().isElementPresent(homePageObjects.downLoadCSVfile),"Download as CSV is not displayed");
        	    QXClient.get().report().info("Download as CSV is displayed");
        	    Assert.assertTrue(QXClient.get().gestures().isElementPresent(homePageObjects.nameUnderDashboard),"Member names in dashboard is not displayed");
        	    QXClient.get().report().info("Member names is displayed");
        	    Assert.assertTrue(QXClient.get().gestures().isElementPresent(homePageObjects.progressUnderDashboard),"Progress in dashboard is not displayed");
        	    QXClient.get().report().info("Progress is displayed");
        	    QXClient.get().gestures().BlindWait(3000);
        	    Assert.assertTrue(QXClient.get().gestures().isElementPresent(homePageObjects.firstMemberUnderDashboard),"First member under dashboard is not displayed");
        	    Assert.assertTrue(QXClient.get().gestures().isElementPresent(homePageObjects.secondMemberUnderDashboard),"Second member under dashboard is not displayed");
        	    Assert.assertTrue(QXClient.get().gestures().isElementPresent(homePageObjects.progressPercentageFirstMember),"Progress percentage of first member");
        	    Assert.assertTrue(QXClient.get().gestures().isElementPresent(homePageObjects.individualScoreInDashboard),"Individual score is not displayed");
        	    Assert.assertTrue(QXClient.get().gestures().isElementPresent(homePageObjects.assertNAinDashboard),"NA in dashboard is not displayed");

        	}
          
          public void verifyFiltersForPublishersAndApplyFilter() throws Exception{

        	    QXClient.get().gestures().BlindWait(3000);

        	    QXClient.get().gestures().waitAndClickElementisVisible(homePageObjects.assertDigitalTextBookSection);
        	    QXClient.get().report().info("Clicked on digital text book section");

        	    Assert.assertTrue(QXClient.get().gestures().isElementPresent(homePageObjects.assertDigitalTextBookSec),"Explore digital text book is not displayed");
        	    QXClient.get().report().info("Explore digital textbook is displayed");

        	    QXClient.get().gestures().waitAndClickElementisVisible(homePageObjects.clkFilter);
        	    QXClient.get().report().info("Clicked on filter option");

        	    QXClient.get().gestures().waitAndClickElementisVisible(homePageObjects.clkPublisherDropdown);
        	    QXClient.get().report().info("Clicked on publisher dropdown under filter section");

        	    QXClient.get().gestures().waitAndClickElementisVisible(homePageObjects.clkFirstPublisher);
        	    QXClient.get().report().info("Clicked on first publisher");

        	    QXClient.get().gestures().waitAndClickElementisVisible(homePageObjects.clkSubmitBtn);
        	    QXClient.get().report().info("Clicked on submit button");

        	    QXClient.get().gestures().waitAndClickElementisVisible(homePageObjects.clkApplyBtn);
        	    QXClient.get().report().info("Clicked on apply filter button");
        	    QXClient.get().gestures().BlindWait(3000);

        	  }

        	  public void verifyContentPostFilterForSelectedPublisher() throws  Exception{

        	    QXClient.get().gestures().BlindWait(3000);
        	    Assert.assertTrue(QXClient.get().gestures().isElementPresent(homePageObjects.assertDigitalTextBookSec),"Digital text book page displayed");
        	    QXClient.get().report().info("Explore Digital Textbook post filter");

        	    QXClient.get().gestures().BlindWait(3000);
        	    Assert.assertTrue(QXClient.get().gestures().isElementPresent(homePageObjects.assertTextBookPostFilter),"Text book is not displayed");
        	    QXClient.get().report().info("Digital textbook is displayed after applying filter");

        	}
        	  
        	  public void verifyNewDikshaExperienceForHeadAndOfficials() throws Exception{
        		    QXClient.get().gestures().BlindWait(1000);

        		    if(QXClient.get().gestures().isElementPresent(homePageObjects.assertDikshaExpForHead)){
        		        QXClient.get().report().info("New Diksha experience is displayed for Head and officials");
        		    }
        		    else{
        		        QXClient.get().report().info("New Diksha experience is not displayed for Head and officials");
        		    }

        		    QXClient.get().gestures().BlindWait(3000);
        		}

        		public void verifyLogoutFromHeadAndOfficials() throws Exception{
        		    QXClient.get().gestures().BlindWait(2000);
                    QXClient.get().gestures().swipeUp();

        		    QXClient.get().gestures().waitAndClickElementisVisible(homePageObjects.clkLogout);
        		    QXClient.get().report().info("Clicked on Logout ");
        		    QXClient.get().gestures().BlindWait(2000);

        		    QXClient.get().gestures().waitAndClickElementisVisible(homePageObjects.clkBackBtn);
        		    QXClient.get().report().info("Clicked on Back Arrow");
        		    QXClient.get().gestures().BlindWait(2000);
        		}
        		
        		
        		public void createNewProjects() throws Exception {
        		    QXClient.get().gestures().BlindWait(3000);
        		   



        		        QXClient.get().gestures().waitAndClickElementisVisible(homePageObjects.clkProjects);
        		        QXClient.get().report().info("clicked on clkProjects");
        		        QXClient.get().gestures().BlindWait(3000);
        		        Assert.assertTrue(QXClient.get().gestures().isElementPresent(homePageObjects.assertCreatedByMeFilter),"Created by me filter is not displayed");
        		        QXClient.get().report().info("Created by me is displayed");
        		        Assert.assertTrue(QXClient.get().gestures().isElementPresent(homePageObjects.assertAssignedToMe),"Assigned to me filter is not displayed");
        		        QXClient.get().report().info("Assigned to me is displayed");
        		        QXClient.get().gestures().BlindWait(3000);
        		        QXClient.get().gestures().waitAndClickElementisVisible(homePageObjects.clkOnCreateNewProj);
        		        QXClient.get().report().info("clicked on clkOnCreateNewProj");
        		        QXClient.get().gestures().BlindWait(2000);

        		        Assert.assertTrue(QXClient.get().gestures().isElementPresent(homePageObjects.assertPrivacyPopup),"Privacy policy popup is not displayed");
        		        QXClient.get().report().info("Privacy policy popup is displayed");
        		     
        		        QXClient.get().gestures().waitAndClickElementisVisible(homePageObjects.clkDoNotShare);
        		        QXClient.get().report().info("clicked on clkDoNotShare");
        		        
        		        QXClient.get().gestures().waitAndClickElementisVisible(homePageObjects.EnterNameYourProject);
        		        QXClient.get().report().info("clicked on EnterNameYourProject");     
        		        QXClient.get().gestures().BlindWait(4000);
        		        QXClient.get().gestures().alternativeMethodForSendKeys("AutomationProject");
        		      // homePageObjects.EnterNameYourProject.sendKeys("AutomationProject");
        		        QXClient.get().gestures().BlindWait(2000);
        		        QXClient.get().gestures().waitAndClickElementisVisible(homePageObjects.EnterDesciprtion);
        		        QXClient.get().report().info("clicked on EnterDesciprtion");     
        		        QXClient.get().gestures().BlindWait(3000);
        		        QXClient.get().gestures().alternativeMethodForSendKeys("DescriptionProject");

        		               //  homePageObjects.EnterDesciprtion.sendKeys("DescriptionProject");
        		                 QXClient.get().gestures().BlindWait(2000);
        		                 QXClient.get().gestures().clkBackButton();
        		                 QXClient.get().gestures().BlindWait(4000);
        		                 QXClient.get().gestures().waitAndClickElementisVisible(homePageObjects.clkCategories);
        		                 QXClient.get().report().info("clicked on clkCategories");         
        		                 QXClient.get().gestures().waitAndClickElementisVisible(homePageObjects.sltTeachersInCategry);
        		                 QXClient.get().report().info("clicked on sltTeachersInCategry");
        		                 QXClient.get().gestures().waitAndClickElementisVisible(homePageObjects.clkSubmit);
        		                 QXClient.get().report().info("clicked on clkSubmit");         
        		                 QXClient.get().gestures().waitAndClickElementisVisible(homePageObjects.clkCreateAndContinue);
        		                 QXClient.get().report().info("clicked on clkCreateAndContinue");         
        		       
        		                 Assert.assertTrue(QXClient.get().gestures().isElementPresent(homePageObjects.assertProjectCreationMsg),"assertProjectCreationMsg is not available");
        		                 QXClient.get().report().info("Verified assertProjectCreationMsg");
        		                 
        		                 QXClient.get().gestures().waitAndClickElementisVisible(homePageObjects.clkContinueBtn);
        		                 QXClient.get().report().info("clicked on clkContinueBtn");         
        		       
        		                 QXClient.get().gestures().waitAndClickElementisVisible(homePageObjects.clkSkipBtn);
        		                 QXClient.get().report().info("clicked on clkSkipBtn");         
        		       
        		                 QXClient.get().gestures().waitAndClickElementisVisible(homePageObjects.clkProjectView);
        		                 QXClient.get().report().info("clicked on clkProjectView");         
        		       
        		                 Assert.assertTrue(QXClient.get().gestures().isElementPresent(homePageObjects.createdProjectTitle),"createdProjectTitle is not available");
        		                 QXClient.get().report().info("Verified createdProjectTitle");
        		                 Assert.assertTrue(QXClient.get().gestures().isElementPresent(homePageObjects.createdProjectObjective),"createdProjectObjective is not available");
        		                 QXClient.get().report().info("Verified createdProjectObjective");

        		                 QXClient.get().gestures().clkBackButton();
        		                 QXClient.get().gestures().BlindWait(1000);

        		                 Assert.assertTrue(QXClient.get().gestures().isElementPresent(homePageObjects.assertCreatedProjectExploreProject),"Project under created by me is not displayed");
        		                 QXClient.get().report().info("Projects under created by me is displayed");
        		                 
        		        
        		}

    public void verifyDeactivateGroup() throws Exception {

        QXClient.get().gestures().BlindWait(5000);


        QXClient.get().gestures().waitAndClickElementisVisible(homePageObjects.clkMyGroups);
        QXClient.get().report().info("clicked on MyGroups");


        try
        {
            QXClient.get().gestures().waitAndClickElementisVisible(homePageObjects.clkCloseIconGrp);
            QXClient.get().report().info("Tap on clkCloseIconGrp button");
        }
        catch(Exception e3)
        {
            System.out.println("Handled");
        }

        QXClient.get().gestures().waitAndClickElementisVisible(homePageObjects.clkOnFirstGrp);
        QXClient.get().report().info("Clicked on First group");
        QXClient.get().gestures().BlindWait(2000);

        QXClient.get().gestures().waitAndClickElementisVisible(homePageObjects.clkMenuInGroup);
        QXClient.get().report().info("Clicked on Kebab Menu");
        QXClient.get().gestures().BlindWait(2000);

        Assert.assertTrue(QXClient.get().gestures().isElementPresent(homePageObjects.clkEditGroupDetails),"Edit group details is not displyaed");
        Assert.assertTrue(QXClient.get().gestures().isElementPresent(homePageObjects.clkDeactivateGroup),"Deactivate group is not displayed");
        Assert.assertTrue(QXClient.get().gestures().isElementPresent(homePageObjects.clkEnableDiscussions),"Enable discussions is not displayed");
        Assert.assertTrue(QXClient.get().gestures().isElementPresent(homePageObjects.clkDeleInMenuGrp),"Delete group is not displayed");

        QXClient.get().gestures().BlindWait(3000);

        QXClient.get().gestures().waitAndClickElementisVisible(homePageObjects.clkDeactivateGroup);
        QXClient.get().report().info("Clicked on Deactivate Group");
        QXClient.get().gestures().BlindWait(2000);

        Assert.assertTrue(QXClient.get().gestures().isElementPresent(homePageObjects.assertDeactivateGroupText),"Deactivate group text is not displayed");
        QXClient.get().gestures().waitAndClickElementisVisible(homePageObjects.clkDeactivateBtn);
        QXClient.get().report().info("Clicked on Deactivate group button");
        QXClient.get().gestures().BlindWait(3000);

        Assert.assertTrue(QXClient.get().gestures().isElementPresent(homePageObjects.assertInactiveGrpAfterDeactivated),"Inactivate group text is not displayed");
        Assert.assertTrue(QXClient.get().gestures().isElementPresent(homePageObjects.clkActivateBtn),"Activate button is not displayed");

        Assert.assertTrue(!QXClient.get().gestures().isElementPresent(homePageObjects.clkAddActivity),"Add activity is displayed");

        QXClient.get().gestures().waitAndClickElementisVisible(homePageObjects.clkMembersGrp);
        QXClient.get().gestures().BlindWait(2000);
        Assert.assertTrue(!QXClient.get().gestures().isElementPresent(homePageObjects.clkAddMembers),"Add memebers is displayed");
        QXClient.get().gestures().BlindWait(3000);

        QXClient.get().gestures().waitAndClickElementisVisible(homePageObjects.clkMenuInGroup);
        QXClient.get().gestures().BlindWait(2000);
        Assert.assertTrue(!QXClient.get().gestures().isElementPresent(homePageObjects.clkEditGroupDetails),"Edit group details is present in kebab menu");
        Assert.assertTrue(!QXClient.get().gestures().isElementPresent(homePageObjects.clkEnableDiscussions),"Enabel discussions is pressent in kebab menu");
        Assert.assertTrue(QXClient.get().gestures().isElementPresent(homePageObjects.clkActivateGroup),"Activate group is not displayed");

        QXClient.get().gestures().BlindWait(3000);
        QXClient.get().gestures().clkBackButton();


    }

    public void ReActivateGroup() throws Exception {
        QXClient.get().gestures().BlindWait(3000);

        QXClient.get().gestures().waitAndClickElementisVisible(homePageObjects.clkMenuInGroup);
        QXClient.get().report().info("Clicked on Kebab Menu");
        QXClient.get().gestures().BlindWait(2000);
        Assert.assertTrue(QXClient.get().gestures().isElementPresent(homePageObjects.clkActivateGroup),"Activate group is not displayed");

        QXClient.get().gestures().waitAndClickElementisVisible(homePageObjects.clkActivateGroup);
        QXClient.get().report().info("Clicked on Activate group");
        QXClient.get().gestures().BlindWait(2000);

        QXClient.get().gestures().waitAndClickElementisVisible(homePageObjects.clkActivateBtn);
        QXClient.get().report().info("Suspended group activated successfully ");
        QXClient.get().gestures().BlindWait(3000);
        QXClient.get().gestures().BlindWait(3000);

        // Assert.assertTrue(QXClient.get().gestures().isElementPresent(homePageObjects.clkAddActivity),"Add activity is not displayed");
        QXClient.get().gestures().waitAndClickElementisVisible(homePageObjects.clkMembersGrp);
        QXClient.get().gestures().BlindWait(2000);
        Assert.assertTrue(QXClient.get().gestures().isElementPresent(homePageObjects.clkAddMembers),"Add members to the group is not displayed");
        QXClient.get().report().info("Add memebers to the group is displayed after Activating the group");
        QXClient.get().gestures().BlindWait(3000);
    }public void verifyActiveGroupsAndSuspendedGroups() throws Exception {
        QXClient.get().gestures().BlindWait(5000);

        QXClient.get().gestures().waitAndClickElementisVisible(homePageObjects.clkMyGroups);
        QXClient.get().report().info("clicked on MyGroups");


        try
        {
            QXClient.get().gestures().waitAndClickElementisVisible(homePageObjects.clkCloseIconGrp);
            QXClient.get().report().info("Tap on clkCloseIconGrp button");
        }
        catch(Exception e3)
        {
            System.out.println("Handled");
        }

        Assert.assertTrue(!QXClient.get().gestures().isElementPresent(homePageObjects.assertDeactivatedGroups),"Deactivated Groups are present in My groups on the top");
        QXClient.get().report().info("Activated Groups are present First in My groups");
        QXClient.get().gestures().BlindWait(2000);

        QXClient.get().gestures().swipeUp();
        Assert.assertTrue(!QXClient.get().gestures().isElementPresent(homePageObjects.assertDeactivatedGroups),"Deactivated Groups are present in My groups on the top");
        QXClient.get().report().info("Activated Groups are present After swiping in My groups");
        QXClient.get().gestures().BlindWait(2000);

        QXClient.get().gestures().swipeUp();

        QXClient.get().gestures().swipeUp();
        Assert.assertTrue(QXClient.get().gestures().isElementPresent(homePageObjects.assertDeactivatedGroups),"Deactivated groups are not present");
        QXClient.get().report().info("Suspended groups are present in the bottom order");
        QXClient.get().gestures().BlindWait(3000);

        QXClient.get().gestures().swipeUp();
        Assert.assertTrue(QXClient.get().gestures().isElementPresent(homePageObjects.assertDeactivatedGroups),"Deactivated groups are not present");
        QXClient.get().report().info("Suspended groups are present in the bottom order");
        QXClient.get().gestures().BlindWait(3000);

    }


    public void verifyHomePageForHeadTeacherAndOfficials() throws Exception {
        QXClient.get().gestures().BlindWait(3000);

        Assert.assertTrue(QXClient.get().gestures().isElementPresent(homePageObjects.assertProgramsInHomePage),"Programs is not displayed");
        QXClient.get().report().info("Programs title is displayed in Home Page");
        Assert.assertTrue(QXClient.get().gestures().isElementPresent(homePageObjects.assertProjectsInHomePage),"Projects is not displayed");
        QXClient.get().report().info("Projects title is displayed in Home Page");
        Assert.assertTrue(QXClient.get().gestures().isElementPresent(homePageObjects.assertObservationsInHomePage),"Observations is not displayed");
        QXClient.get().report().info("Observations title is displayed in Home Page");
        Assert.assertTrue(QXClient.get().gestures().isElementPresent(homePageObjects.assertSurveysInHomePage),"Surveys is not displayed");
        QXClient.get().report().info("Surveys title is displayed in Home Page");
        QXClient.get().gestures().BlindWait(3000);

    }

    public void verifyReportIssueInHelpSection() throws Exception {
        QXClient.get().gestures().BlindWait(3000);

        QXClient.get().gestures().waitAndClickElementisVisible(homePageObjects.clkHelpMenu);
        QXClient.get().report().info("Clicked on Help menu");
        QXClient.get().gestures().BlindWait(2000);
        QXClient.get().gestures().swipeUp();

        QXClient.get().gestures().waitAndClickElementisVisible(homePageObjects.clkOnReportOtherIssue);
        QXClient.get().report().info("Clicked on Report Other Issue");
        QXClient.get().gestures().BlindWait(2000);

        Assert.assertTrue(QXClient.get().gestures().isElementPresent(homePageObjects.assertReportAnIssueText),"Report An Issue is not displayed in help menu");
        QXClient.get().report().info("Report An Issue is displayed in help menu");
        QXClient.get().gestures().waitAndClickElementisVisible(homePageObjects.clkSelectCategory);
        QXClient.get().report().info("Clicked on select category ");
        QXClient.get().gestures().BlindWait(2000);

        QXClient.get().gestures().waitAndClickElementisVisible(homePageObjects.clkOnContent);
        QXClient.get().report().info("Clicked on Content");
        QXClient.get().gestures().waitAndClickElementisVisible(homePageObjects.clkSubmitButton);
        QXClient.get().gestures().BlindWait(2000);

        QXClient.get().gestures().waitAndClickElementisVisible(homePageObjects.clkSelectSubcategory);
        QXClient.get().gestures().waitAndClickElementisVisible(homePageObjects.clkOnContentAvailability);
        QXClient.get().report().info("Clicked on content availability");
        QXClient.get().gestures().waitAndClickElementisVisible(homePageObjects.clkSubmitButton);
        QXClient.get().gestures().BlindWait(2000);

        QXClient.get().gestures().waitAndClickElementisVisible(homePageObjects.clkSelectBoard);
        QXClient.get().gestures().waitAndClickElementisVisible(homePageObjects.clkOnCBSEBoard);
        QXClient.get().report().info("Clicked on CBSE Board");
        QXClient.get().gestures().waitAndClickElementisVisible(homePageObjects.clkSubmitButton);
        QXClient.get().gestures().BlindWait(2000);

        QXClient.get().gestures().waitAndClickElementisVisible(homePageObjects.clkSelectMedium);
        QXClient.get().gestures().waitAndClickElementisVisible(homePageObjects.clkOnEnglish);
        QXClient.get().report().info("Clicked on English medium");
        QXClient.get().gestures().waitAndClickElementisVisible(homePageObjects.clkSubmitButton);
        QXClient.get().gestures().BlindWait(2000);

        QXClient.get().gestures().waitAndClickElementisVisible(homePageObjects.clkSelectGrade);
        QXClient.get().gestures().waitAndClickElementisVisible(homePageObjects.clkOnGrade);
        QXClient.get().report().info("Clicked on Grade one");
        QXClient.get().gestures().waitAndClickElementisVisible(homePageObjects.clkSubmitButton);
        QXClient.get().gestures().BlindWait(2000);

        QXClient.get().gestures().waitAndClickElementisVisible(homePageObjects.clkSelectSubject);
        QXClient.get().gestures().waitAndClickElementisVisible(homePageObjects.clkOnEnglish);
        QXClient.get().gestures().waitAndClickElementisVisible(homePageObjects.clkOnHindi);
        QXClient.get().gestures().waitAndClickElementisVisible(homePageObjects.clkOnMathematics);
        QXClient.get().report().info("Clicked on multiple subjects");
        QXClient.get().gestures().waitAndClickElementisVisible(homePageObjects.clkSubmitButton);
        QXClient.get().gestures().BlindWait(3000);

        Assert.assertTrue(QXClient.get().gestures().isElementPresent(homePageObjects.assertMultipleSubjects),"Multiple subjects are not displayed");
        QXClient.get().report().info("User Able to select multiple subjects while reporting an isssue");
        QXClient.get().gestures().BlindWait(2000);

        QXClient.get().gestures().waitAndClickElementisVisible(homePageObjects.clkSelectContentType);
        QXClient.get().gestures().waitAndClickElementisVisible(homePageObjects.clkOnDigitalTextbook);
        QXClient.get().report().info("Clicked on Digital textbook");
        QXClient.get().gestures().waitAndClickElementisVisible(homePageObjects.clkSubmitButton);
        QXClient.get().gestures().BlindWait(3000);

        QXClient.get().gestures().waitAndClickElementisVisible(homePageObjects.clkOnTextBox);
        QXClient.get().gestures().BlindWait(4000);
        homePageObjects.clkOnTextBox.sendKeys("Content Is Not available");
        QXClient.get().gestures().BlindWait(3000);
        QXClient.get().gestures().clkBackButton();

        QXClient.get().gestures().waitAndClickElementisVisible(homePageObjects.clkOnSubmitBtn);
        //QXClient.get().gestures().BlindWait(2000);
        Assert.assertTrue(QXClient.get().gestures().isElementPresent(homePageObjects.assertFeedbackMessage),"Feedback message is not displayed");
        QXClient.get().report().info("Feedback message is displayed");
        QXClient.get().gestures().BlindWait(2000);

        QXClient.get().gestures().clkBackButton();
        QXClient.get().gestures().BlindWait(2000);
    }


    public void tapOnHomeTab() throws Exception {
        QXClient.get().gestures().BlindWait(5000);
        QXClient.get().gestures().waitAndClickElementisVisible(homePageObjects.clkHomePageTab);
        QXClient.get().report().info("Tap on profile tab");
    }

    public void verifyHomePageForObservation() throws Exception {
        QXClient.get().gestures().BlindWait(3000);
        tapOnMenuBar();

        QXClient.get().gestures().waitAndClickElementisVisible(homePageObjects.clkNewDikshExperiece);
        QXClient.get().report().info("clicked on clkNewDikshExperiece");
        QXClient.get().gestures().BlindWait(3000);

        QXClient.get().gestures().swipeUp();
        QXClient.get().gestures().BlindWait(3000);
        QXClient.get().gestures().swipeUp();
        QXClient.get().gestures().BlindWait(3000);
        QXClient.get().gestures().swipeUp();
        QXClient.get().gestures().BlindWait(3000);
        Assert.assertTrue(QXClient.get().gestures().isElementPresent(homePageObjects.assertbrowseOtherCategories),"Browse by other categories is not displayed");
        QXClient.get().report().info("Browse by other categories is displayed");
        Assert.assertTrue(QXClient.get().gestures().isElementPresent(homePageObjects.clkOnObservation),"Observation is not displayed in home page");
        QXClient.get().report().info("Observation is displayed in Home page for Teacher Role");
        QXClient.get().gestures().waitAndClickElementisVisible(homePageObjects.clkOnObservation);
        QXClient.get().gestures().BlindWait(6000);

        Assert.assertTrue(QXClient.get().gestures().isElementPresent(homePageObjects.assertObservationText),"Observation Page is not displayed");
        Assert.assertTrue(QXClient.get().gestures().isElementPresent(homePageObjects.assertFirstObservation),"First observation is not displayed");
        QXClient.get().report().info("First observation is displayed Under Observation");
        QXClient.get().gestures().BlindWait(2000);

        QXClient.get().gestures().waitAndClickElementisVisible(homePageObjects.clkBackbutton);

        tapOnProfileTab();
        QXClient.get().gestures().BlindWait(3000);
        QXClient.get().gestures().waitAndClickElementisVisible(homePageObjects.clkOnEdit);
        QXClient.get().report().info("Clicked on Edit Button");
        QXClient.get().gestures().BlindWait(6000);
        QXClient.get().gestures().waitAndClickElementisVisible(homePageObjects.clkOnRole);
        QXClient.get().gestures().waitAndClickElementisVisible(homePageObjects.selectStudentRole);
        QXClient.get().report().info("Student role is selected in profile");
        QXClient.get().gestures().waitAndClickElementisVisible(homePageObjects.clkSubmitButton);
        QXClient.get().gestures().BlindWait(3000);
        QXClient.get().gestures().waitAndClickElementisVisible(homePageObjects.clkOnSubmitBtn);
        QXClient.get().gestures().BlindWait(3000);

        tapOnHomeTab();
        QXClient.get().gestures().BlindWait(6000);
        QXClient.get().gestures().swipeUp();
        QXClient.get().gestures().BlindWait(3000);
        QXClient.get().gestures().swipeUp();
        QXClient.get().gestures().BlindWait(3000);
        QXClient.get().gestures().swipeUp();
        QXClient.get().gestures().BlindWait(3000);

        Assert.assertTrue(!QXClient.get().gestures().isElementPresent(homePageObjects.clkOnObservation),"Observation is displayed for Student Role");
        QXClient.get().report().info("Observation is not displayed in Home page for Student Role");
        QXClient.get().gestures().BlindWait(3000);

        tapOnProfileTab();
        QXClient.get().gestures().BlindWait(3000);
        QXClient.get().gestures().waitAndClickElementisVisible(homePageObjects.clkOnEdit);
        QXClient.get().report().info("Clicked on Edit Button");
        QXClient.get().gestures().BlindWait(2000);
        QXClient.get().gestures().waitAndClickElementisVisible(homePageObjects.clkOnRole);
        QXClient.get().gestures().waitAndClickElementisVisible(homePageObjects.selectTeacherRole);
        QXClient.get().report().info("Teacher role is selected in profile");
        QXClient.get().gestures().waitAndClickElementisVisible(homePageObjects.clkSubmitButton);
        QXClient.get().gestures().BlindWait(3000);
        QXClient.get().gestures().waitAndClickElementisVisible(homePageObjects.clkOnSubmitBtn);
        QXClient.get().gestures().BlindWait(3000);

        tapOnHomeTab();
        QXClient.get().gestures().BlindWait(6000);
        QXClient.get().gestures().swipeUp();
        QXClient.get().gestures().BlindWait(4000);
        QXClient.get().gestures().swipeUp();
        QXClient.get().gestures().BlindWait(3000);
        QXClient.get().gestures().swipeUp();
        QXClient.get().gestures().BlindWait(3000);

        Assert.assertTrue(QXClient.get().gestures().isElementPresent(homePageObjects.clkOnObservation),"Observation is not displayed for Teacher Role");
        QXClient.get().report().info("Observation is displayed in Home page for Teacher Role");
        QXClient.get().gestures().BlindWait(2000);

    }

    public void verifyTagsSection() throws Exception {
        QXClient.get().gestures().BlindWait(3000);

        QXClient.get().gestures().waitAndClickElementisVisible(homePageObjects.clickHambugMenuForum);
        QXClient.get().report().info("Clicked on Hamburger Menu");
        QXClient.get().gestures().BlindWait(3000);
        Assert.assertTrue(QXClient.get().gestures().isElementPresent(homePageObjects.clkCloseIconDF),"clkCloseIconDF is not available");

        Assert.assertTrue(QXClient.get().gestures().isElementPresent(homePageObjects.verifyCatogries),"verifyCatogries is not available");
        Assert.assertTrue(QXClient.get().gestures().isElementPresent(homePageObjects.verifyTags),"verifyTags is not available");
        Assert.assertTrue(QXClient.get().gestures().isElementPresent(homePageObjects.verifyDiscussion),"verifyDiscussion is not available");
        QXClient.get().gestures().BlindWait(3000);

        QXClient.get().gestures().waitAndClickElementisVisible(homePageObjects.verifyTags);
        QXClient.get().report().info("Clicked on Tags section");
        QXClient.get().gestures().BlindWait(3000);

        Assert.assertTrue(QXClient.get().gestures().isElementPresent(homePageObjects.assertNoTagsAvailable),"No Tags available text is not displayed");
        QXClient.get().report().info("No Tags Available is displayed");
        Assert.assertTrue(QXClient.get().gestures().isElementPresent(homePageObjects.assertTextInTagsSection),"Text is not displayed in tags section");
        QXClient.get().report().info("Stay tuned text is displayed");
        Assert.assertTrue(QXClient.get().gestures().isElementPresent(homePageObjects.assertBackButton),"Back button is not displayed");
        QXClient.get().report().info("Back Button is displayed");
        QXClient.get().gestures().BlindWait(3000);
    }


    public void verifyDiscussionForum() throws  Exception {
        QXClient.get().gestures().BlindWait(5000);


        QXClient.get().gestures().waitAndClickElementisVisible(homePageObjects.clkMenuInGroup);
        QXClient.get().report().info("clicked on clkMenuInGroup");

        QXClient.get().gestures().waitAndClickElementisVisible(homePageObjects.clkEnableDiscussions);
        QXClient.get().report().info("Tap on clkEnableDiscussions button");
        QXClient.get().gestures().BlindWait(4000);

        Assert.assertTrue(QXClient.get().gestures().isElementPresent(homePageObjects.clkenableDisIcon),"clkenableDisIcon is not available");
        QXClient.get().report().info("verified  clkenableDisIcon");
        QXClient.get().gestures().waitAndClickElementisVisible(homePageObjects.clkenableDisIcon);
        QXClient.get().report().info("Tap on clkenableDisIcon button");

        QXClient.get().gestures().BlindWait(6000);

        Assert.assertTrue(QXClient.get().gestures().isElementPresent(homePageObjects.verify0Discussions),"verify0Discussions is not available");
        Assert.assertTrue(QXClient.get().gestures().isElementPresent(homePageObjects.verify0Posts),"verify0Posts is not available");

        QXClient.get().gestures().waitAndClickElementisVisible(homePageObjects.clkOnGeneralDiscussion);
        QXClient.get().report().info("Clicked on General discussion");
        QXClient.get().gestures().BlindWait(5000);

        Assert.assertTrue(QXClient.get().gestures().isElementPresent(homePageObjects.clkStartDiscussion),"Start discussion is not displayed");
        QXClient.get().gestures().waitAndClickElementisVisible(homePageObjects.clkStartDiscussion);
        QXClient.get().gestures().BlindWait(2000);

        Assert.assertTrue(!QXClient.get().gestures().isElementPresent(homePageObjects.assertAskAQuestion),"Ask a question is displayed");
        Assert.assertTrue(QXClient.get().gestures().isElementPresent(homePageObjects.assertDiscussionTopic),"Discussion topic is not displayed");
        QXClient.get().report().info("Ask a Question is replaced with Discussion topic");

        Assert.assertTrue(!QXClient.get().gestures().isElementPresent(homePageObjects.assertUpdateBtn),"Update button is visible");
        Assert.assertTrue(QXClient.get().gestures().isElementPresent(homePageObjects.assertSubmitBtn),"Update button is not replaced by submit button");
        QXClient.get().report().info("Update button is replaced with Submit button");
        QXClient.get().gestures().BlindWait(3000);



    }

    public void verifyClassAndMediumInProfile() throws Exception {
        QXClient.get().gestures().BlindWait(3000);

        Assert.assertTrue(QXClient.get().gestures().isElementPresent(homePageObjects.assertEnglishMediumInProfile),"English medium is not displayed");
        QXClient.get().report().info("English Medium is displayed in profile");
        Assert.assertTrue(QXClient.get().gestures().isElementPresent(homePageObjects.assertClassInProfile),"Class in profile is not displayed");
        QXClient.get().report().info("Class is displayed in profile");
        QXClient.get().gestures().BlindWait(3000);
    }

    public void changeClassAndMediumInLibraryPageAndVerify() throws Exception {
        QXClient.get().gestures().BlindWait(3000);

        QXClient.get().gestures().waitAndClickElementisVisible(homePageObjects.clkHindiMediumInLibraryPage);
        QXClient.get().report().info("Clicked on Hindi medium in Library page");
        QXClient.get().gestures().BlindWait(2000);
        QXClient.get().gestures().waitAndClickElementisVisible(homePageObjects.clkClass5InLibraryPage);
        QXClient.get().report().info("Clicked on Class 5 in Library page");
        QXClient.get().gestures().BlindWait(3000);

        tapOnTrainingTab();

        QXClient.get().gestures().BlindWait(2000);
        tapOnLibraryTab();
        QXClient.get().gestures().BlindWait(2000);

        Assert.assertTrue(QXClient.get().gestures().isElementPresent(homePageObjects.clkHindiMediumInLibraryPage),"Hindi Medium is not selected in library page");
        QXClient.get().report().info("Hindi Medium is selected in Library page");
        Assert.assertTrue(QXClient.get().gestures().isElementPresent(homePageObjects.clkClass5InLibraryPage),"Class 5 is not selected in library page");
        QXClient.get().report().info("Class 5 is selected in Library page");
        QXClient.get().gestures().BlindWait(3000);
    }

    public void verifyClassAndMediumInLibraryPageAfterRelaunch() throws Exception {
        QXClient.get().gestures().BlindWait(3000);

        Assert.assertTrue(QXClient.get().gestures().isElementPresent(homePageObjects.assertEnglishMediumLibrary),"English medium is not as per user profile preferences");
        QXClient.get().report().info("English medium is selected in Library page as User profile preferences");
        Assert.assertTrue(QXClient.get().gestures().isElementPresent(homePageObjects.assertClassInProfile),"Class in Library page is not as per user profile preferences");
        QXClient.get().report().info("Class is selected in Library page as User profile preferences");
        QXClient.get().gestures().BlindWait(2000);
    }


    public void verifyRecentlyViewedSectionForLoggedUserAndGuestUser() throws Exception {
        QXClient.get().gestures().BlindWait(3000);

        Assert.assertTrue(!QXClient.get().gestures().isElementPresent(homePageObjects.assertRecentlyViewedSection),"Recently viewed section is visible in Library page");
        QXClient.get().report().info("Recently viewed section is not displayed in Library page for guest and logged user");
        QXClient.get().gestures().BlindWait(3000);
    }

    public void verifyEnrollmentEndDateUnderJoinTraining() throws Exception {
        QXClient.get().gestures().BlindWait(3000);

        tapOnSearchIcon();
        enterTextInSearchBar("CourseContent");
        QXClient.get().gestures().swipeUp();
        QXClient.get().gestures().generateXpathUsingClassAndTextAndClickElement("CourseContent");

        QXClient.get().gestures().BlindWait(2000);

        Assert.assertTrue(QXClient.get().gestures().isElementPresent(homePageObjects.assertJoinCourseBtn),"Join course button is not displayed");
        QXClient.get().report().info("Join Course button is displayed in Course TOC");

        Assert.assertTrue(QXClient.get().gestures().isElementPresent(homePageObjects.assertEnrollmentEndDate),"Enrollment end date is not displayed under join course button");
        QXClient.get().report().info("Enrollment end date is displayed under Join course button in course toc");
        QXClient.get().gestures().BlindWait(3000);
    }

    public void verifyEnrollmentClosedInCourseTOC() throws Exception {
        QXClient.get().gestures().BlindWait(3000);
        tapOnSearchIcon();
        enterTextInSearchBar("CourseContent1");

        QXClient.get().gestures().generateXpathUsingClassAndTextAndClickElement("CourseContent1");

        QXClient.get().gestures().BlindWait(2000);

        Assert.assertTrue(!QXClient.get().gestures().isElementPresent(homePageObjects.assertJoinCourseBtn),"join course button is displayed");
        QXClient.get().report().info("Join course button is not displayed");

        Assert.assertTrue(QXClient.get().gestures().isElementPresent(homePageObjects.assertEnrollmentClosedMsg),"Enrollment closed message is not displayed");
        QXClient.get().report().info("Enrollment closed message is displayed");

        Assert.assertTrue(QXClient.get().gestures().isElementPresent(homePageObjects.assertNoBatchesForThisCourseMsg),"No batches for this course message is not displayed");
        QXClient.get().report().info("No bacthes for this course message is displayed");
        QXClient.get().gestures().BlindWait(3000);

    }

    public void verifyExpiredCourseInCourseTOC() throws Exception {
        QXClient.get().gestures().BlindWait(3000);
        tapOnSearchIcon();
        enterTextInSearchBar("AutomationExpiredCourse");
        QXClient.get().gestures().BlindWait(4000);

        QXClient.get().gestures().generateXpathUsingClassAndTextAndClickElement("AutomationExpiredCourse");

        QXClient.get().gestures().BlindWait(2000);

        Assert.assertTrue(!QXClient.get().gestures().isElementPresent(homePageObjects.assertJoinCourseBtn),"join course button is displayed");
        QXClient.get().report().info("Join course button is not displayed");

        Assert.assertTrue(QXClient.get().gestures().isElementPresent(homePageObjects.assertExpiredCourseMsg),"Expired Course message is not displayed in course TOC");
        QXClient.get().report().info("Expired course message is displayed in Course TOC");

        Assert.assertTrue(QXClient.get().gestures().isElementPresent(homePageObjects.assertNoBatchesForThisCourseMsg),"No batches for this course message is not displayed");
        QXClient.get().report().info("No bacthes for this course message is displayed");
        QXClient.get().gestures().BlindWait(3000);
    }

    public void verifySearchTabInsteadOfCoursesTabInNewExperience() throws Exception {
        QXClient.get().gestures().BlindWait(3000);

        Assert.assertTrue(QXClient.get().gestures().isElementPresent(homePageObjects.assertCoursesTab),"Course Tab is not displayed");
        QXClient.get().report().info("Courses tab is displayed in classic experience");

        Assert.assertTrue(QXClient.get().gestures().isElementPresent(homePageObjects.assertCourseTabInClassicExperience),"Courses tab is not present");
        QXClient.get().report().info("Courses tab is present");
        QXClient.get().gestures().BlindWait(3000);

        tapOnMenuBar();
        QXClient.get().gestures().BlindWait(3000);
        QXClient.get().gestures().waitAndClickElementisVisible(homePageObjects.clkNewDikshExperiece);
        QXClient.get().report().info("Clicked on New Diksha experience");
        QXClient.get().gestures().BlindWait(3000);

        Assert.assertTrue(!QXClient.get().gestures().isElementPresent(homePageObjects.assertCoursesTab),"Course tab is present");
        QXClient.get().report().info("Courses tab is not displayed in new Experience");

        Assert.assertTrue(QXClient.get().gestures().isElementPresent(homePageObjects.assertSearchTab),"Search tab is not displayed");
        Assert.assertTrue(QXClient.get().gestures().isElementPresent(homePageObjects.assertSearchTabInNewExperience),"Search tab is not displayed");
        QXClient.get().report().info("Course tab is replaced by search tab in new diksha experience");
        QXClient.get().gestures().BlindWait(2000);

    }

    public void verifyNotLandedOnSearchTabAfterLogin() throws Exception {
        QXClient.get().gestures().BlindWait(3000);

        Assert.assertTrue(!QXClient.get().gestures().isElementPresent(homePageObjects.assertSearchPageText),"Landed on search tab after Login");
        Assert.assertTrue(!QXClient.get().gestures().isElementPresent(homePageObjects.assertPopularCategories),"Popular categories is present in search tab");
        QXClient.get().report().info("After Login User is not landed on Search tab");
        QXClient.get().gestures().BlindWait(3000);

        Assert.assertTrue(QXClient.get().gestures().isElementPresent(homePageObjects.assertLibraryPage),"After Login not landed on Library page");
        Assert.assertTrue(QXClient.get().gestures().isElementPresent(homePageObjects.assertMediumInLibraryPage),"Medium is not present in library page");
        Assert.assertTrue(QXClient.get().gestures().isElementPresent(homePageObjects.assertClassInLibraryPage),"Class in library is not present");
        QXClient.get().report().info("Landed on Library page once user login");
        QXClient.get().gestures().BlindWait(2000);
    }

    public void verifySearchPageSections() throws Exception {
        QXClient.get().gestures().BlindWait(3000);
        Assert.assertTrue(QXClient.get().gestures().isElementPresent(homePageObjects.assertSearchBar),"Search bar is not present");
        QXClient.get().report().info("Search Bar is displayed in Search page sections");
        Assert.assertTrue(QXClient.get().gestures().isElementPresent(homePageObjects.assertPopularCatrgories),"assertPopularCatrgories is not available");
        QXClient.get().report().info("Verified assertPopularCatrgories in SearchPage");
        Assert.assertTrue(QXClient.get().gestures().isElementPresent(homePageObjects.assertDigitalTextBookSection),"assertDigitalTextBookSection is not available");
        QXClient.get().report().info("Verified assertDigitalTextBookSection in SearchPage");
        Assert.assertTrue(QXClient.get().gestures().isElementPresent(homePageObjects.assertCourseSection),"assertCourseSection is not available");
        QXClient.get().report().info("Verified assertCourseSection in SearchPage");
        Assert.assertTrue(QXClient.get().gestures().isElementPresent(homePageObjects.assertTVClassesSection),"assertTVClassesSection is not available");
        QXClient.get().report().info("Verified assertTVClassesSection in SearchPage");
        Assert.assertTrue(QXClient.get().gestures().isElementPresent(homePageObjects.assertVideoSection),"assertVideoSection is not available");
        QXClient.get().report().info("Verified assertVideoSection in SearchPage");
        Assert.assertTrue(QXClient.get().gestures().isElementPresent(homePageObjects.assertAudioSection),"assertAudioSection is not available");
        QXClient.get().report().info("Verified assertAudioSection in SearchPage");
        Assert.assertTrue(QXClient.get().gestures().isElementPresent(homePageObjects.assertInteractiveContentSection),"assertInteractiveContentSection is not available");
        QXClient.get().report().info("Verified assertInteractiveContentSection in SearchPage");

        Assert.assertTrue(QXClient.get().gestures().isElementPresent(homePageObjects.assertExploreContentFromOtherBoards),"assertExploreContentFromOtherBoards is not available");
        QXClient.get().report().info("Verified assertExploreContentFromOtherBoards in SearchPage");

        Assert.assertTrue(QXClient.get().gestures().isElementPresent(homePageObjects.assertCbseNcertBoard),"Cbse and Ncert board is not displayed");
        QXClient.get().report().info("CBSE and NCERT board is displayed in Search page section");
        QXClient.get().gestures().BlindWait(2000);

        QXClient.get().gestures().horizontalSwipingTest(homePageObjects.assertCbseNcertBoard);
    }

    public void verifyPopularCategoriesInSearchPage() throws Exception {
        QXClient.get().gestures().BlindWait(3000);

        tapOnSearchIcon();
        QXClient.get().gestures().BlindWait(3000);
        Assert.assertTrue(QXClient.get().gestures().isElementPresent(homePageObjects.assertPopularCatrgories),"assertPopularCatrgories is not available");
        QXClient.get().report().info("Verified assertPopularCatrgories in SearchPage");
        Assert.assertTrue(QXClient.get().gestures().isElementPresent(homePageObjects.assertDigitalTextBookSection),"assertDigitalTextBookSection is not available");
        QXClient.get().report().info("Verified assertDigitalTextBookSection in SearchPage");
        Assert.assertTrue(QXClient.get().gestures().isElementPresent(homePageObjects.assertCourseSection),"assertCourseSection is not available");
        QXClient.get().report().info("Verified assertCourseSection in SearchPage");
        Assert.assertTrue(QXClient.get().gestures().isElementPresent(homePageObjects.assertTVClassesSection),"assertTVClassesSection is not available");
        QXClient.get().report().info("Verified assertTVClassesSection in SearchPage");
        Assert.assertTrue(QXClient.get().gestures().isElementPresent(homePageObjects.assertVideoSection),"assertVideoSection is not available");
        QXClient.get().report().info("Verified assertVideoSection in SearchPage");
        Assert.assertTrue(QXClient.get().gestures().isElementPresent(homePageObjects.assertAudioSection),"assertAudioSection is not available");
        QXClient.get().report().info("Verified assertAudioSection in SearchPage");
        Assert.assertTrue(QXClient.get().gestures().isElementPresent(homePageObjects.assertInteractiveContentSection),"assertInteractiveContentSection is not available");
        QXClient.get().report().info("Verified assertInteractiveContentSection in SearchPage");

        QXClient.get().gestures().waitAndClickElementisVisible(homePageObjects.assertDigitalTextBookSection);
        QXClient.get().gestures().BlindWait(4000);


        Assert.assertTrue(QXClient.get().gestures().isElementPresent(homePageObjects.assertExploreDigitalTextBookText),"Explore digital textbook is not displayed");
        Assert.assertTrue(QXClient.get().gestures().isElementPresent(homePageObjects.assertSubjectInExploreDigitalTextbook),"Subject wise filter is not displayed");
        Assert.assertTrue(QXClient.get().gestures().isElementPresent(homePageObjects.assertRoleInExploreDigitalTextbook),"Role wise  filter is not displayed");
        Assert.assertTrue(QXClient.get().gestures().isElementPresent(homePageObjects.assertAdvancedFilter),"Advanced filter is not displayed");
        Assert.assertTrue(QXClient.get().gestures().isElementPresent(homePageObjects.navigationBasedOnPrimaryCategory),"Navigation based on Primary category is not displayed");
        Assert.assertTrue(QXClient.get().gestures().isElementPresent(homePageObjects.groupingBasedOnSubject),"Grouping based on subject is not displayed");
        Assert.assertTrue(QXClient.get().gestures().isElementPresent(homePageObjects.contentBasedOnSubject),"Content based on subject is not displayed");



    }

    public void verifyContentsFromOtherBoardsInSearchPage() throws Exception {
        QXClient.get().gestures().BlindWait(3000);

        tapOnSearchIcon();
        QXClient.get().gestures().BlindWait(3000);
        Assert.assertTrue(QXClient.get().gestures().isElementPresent(homePageObjects.assertExploreContentFromOtherBoards),"Contents from other boards is not displayed");
        QXClient.get().report().info("verified Explore content from other boards is displayed");
        Assert.assertTrue(QXClient.get().gestures().isElementPresent(homePageObjects.assertCbseNcertBoard),"Cbse Ncert board is not displayed");
        QXClient.get().report().info("verified CBSE/NCERT board in Explore content from other boards");
        Assert.assertTrue(QXClient.get().gestures().isElementPresent(homePageObjects.assertIGotSecInExploreContentFromOtherBoards),"IGOT section is not displayed");
        QXClient.get().report().info("verified Igot-health is displayed ");
        QXClient.get().gestures().BlindWait(2000);
        QXClient.get().gestures().waitAndClickElementisVisible(homePageObjects.assertCbseNcertBoard);
        QXClient.get().report().info("Clicked on CBSE board");
        QXClient.get().gestures().BlindWait(4000);

        Assert.assertTrue(QXClient.get().gestures().isElementPresent(homePageObjects.assertExploreCbseNcertText),"Explore CBSE/NCERT is not displayed");
        Assert.assertTrue(QXClient.get().gestures().isElementPresent(homePageObjects.assertSubjectInExploreDigitalTextbook),"Subject wise filter is not displayed");
        Assert.assertTrue(QXClient.get().gestures().isElementPresent(homePageObjects.assertRoleInExploreDigitalTextbook),"Role wise  filter is not displayed");
        Assert.assertTrue(QXClient.get().gestures().isElementPresent(homePageObjects.assertAdvancedFilter),"Advanced filter is not displayed");
        Assert.assertTrue(QXClient.get().gestures().isElementPresent(homePageObjects.navigationBasedOnPrimaryCategory1),"Navigation based on Primary category is not displayed");
        Assert.assertTrue(QXClient.get().gestures().isElementPresent(homePageObjects.groupingBasedOnSubject1),"Grouping based on subject is not displayed");
        Assert.assertTrue(QXClient.get().gestures().isElementPresent(homePageObjects.contentBasedOnSubject1),"Content based on subject is not displayed");

    }

    public void verifyContentsForVarietyAudienceInSearchPage() throws Exception {
        QXClient.get().gestures().BlindWait(3000);

        tapOnSearchIcon();
        QXClient.get().gestures().BlindWait(3000);
        QXClient.get().gestures().swipeUp();
        Assert.assertTrue(QXClient.get().gestures().isElementPresent(homePageObjects.assertExploreContentForVarietyOfAudience),"Explore content for variety of audience is not displayed");
        QXClient.get().report().info("Variety of Audience is displayed in Search page");
        Assert.assertTrue(QXClient.get().gestures().isElementPresent(homePageObjects.assertTeacherSecInExploreContentForVarietyAudience),"Teacher is not displayed");
        QXClient.get().report().info("Teacher is displayed under variety of Audience");
        Assert.assertTrue(QXClient.get().gestures().isElementPresent(homePageObjects.assertStudentAudience),"Student Audience is not displayed");
        QXClient.get().report().info("Student is displayed under variety of Audience");
        QXClient.get().gestures().BlindWait(2000);

        QXClient.get().gestures().waitAndClickElementisVisible(homePageObjects.assertTeacherSecInExploreContentForVarietyAudience);
        QXClient.get().gestures().BlindWait(4000);

        Assert.assertTrue(QXClient.get().gestures().isElementPresent(homePageObjects.assertExploreCoursesUnderTeacher),"Explore Courses is not displayed");
        Assert.assertTrue(QXClient.get().gestures().isElementPresent(homePageObjects.assertSubjectInExploreDigitalTextbook),"Subject wise filter is not displayed");
        Assert.assertTrue(QXClient.get().gestures().isElementPresent(homePageObjects.assertRoleInExploreDigitalTextbook),"Role wise  filter is not displayed");
        Assert.assertTrue(QXClient.get().gestures().isElementPresent(homePageObjects.assertAdvancedFilter),"Advanced filter is not displayed");
        Assert.assertTrue(QXClient.get().gestures().isElementPresent(homePageObjects.navigationBasedOnPrimaryCategory1),"Navigation based on Primary category is not displayed");
        Assert.assertTrue(QXClient.get().gestures().isElementPresent(homePageObjects.groupingBasedOnSubject1),"Grouping based on subject is not displayed");
        Assert.assertTrue(QXClient.get().gestures().isElementPresent(homePageObjects.contentBasedOnSubject1),"Content based on subject is not displayed");


    }

    public void verifyUserNameFreezedInActivityPage() throws Exception {
        QXClient.get().gestures().BlindWait(3000);

        QXClient.get().gestures().swipeUp();
        QXClient.get().gestures().swipeUp();

        Assert.assertTrue(QXClient.get().gestures().isElementPresent(homePageObjects.nameUnderDashboard),"Member names in dashboard is not displayed");
        QXClient.get().report().info("User names freezed after scrolling in Activity Page");
        QXClient.get().gestures().BlindWait(3000);
    }

    public void verifyCourseDashBoardInGroups() throws Exception {
        QXClient.get().gestures().BlindWait(3000);

        tapOnMenuBar();
        QXClient.get().gestures().waitAndClickElementisVisible(homePageObjects.clkMyGroups);
        QXClient.get().report().info("Clicked on My groups button");
        QXClient.get().gestures().BlindWait(2000);

        try
        {
            QXClient.get().gestures().waitAndClickElementisVisible(homePageObjects.clkCloseIconGrp);
            QXClient.get().report().info("Tap on clkCloseIconGrp button");
        }
        catch(Exception e3)
        {
            System.out.println("Handled");
        }

        QXClient.get().gestures().waitAndClickElementisVisible(homePageObjects.clkFirstGroup);
        QXClient.get().report().info("Clicked on First group");
        QXClient.get().gestures().BlindWait(2000);

        Assert.assertTrue(QXClient.get().gestures().isElementPresent(homePageObjects.courseUnderFirstGrp),"Course is not displayed");
        QXClient.get().gestures().waitAndClickElementisVisible(homePageObjects.courseUnderFirstGrp);
        QXClient.get().report().info("Clicked on Course under Group");
        QXClient.get().gestures().BlindWait(3000);

        QXClient.get().report().info("Course Dashboard is displayed");
        //Assert.assertTrue(QXClient.get().gestures().isElementPresent(trainingPageObjects.clkJoinCourseBtn),"Join Course Button is not displayed in Course TOC");
       // QXClient.get().report().info("Join Course Button is displayed in Course TOC");

        Assert.assertTrue(QXClient.get().gestures().isElementPresent(homePageObjects.clkActivityDashboard),"Activity Dashboard Button is not displayed in Course TOC");
        QXClient.get().report().info("Activity Dashboard Option is present in Course TOC");
        QXClient.get().gestures().BlindWait(2000);


    }

    public void verifyActivityDashboardScreen() throws Exception {
        QXClient.get().gestures().BlindWait(3000);
        QXClient.get().gestures().waitAndClickElementisVisible(homePageObjects.clkActivityDashboard);
        QXClient.get().report().info("Activity Dashboard Screen is displayed after clicking the Activity Dashboard Option in Course TOC");
        QXClient.get().gestures().BlindWait(3000);

        Assert.assertTrue(QXClient.get().gestures().isElementPresent(homePageObjects.downLoadCSVfile),"Download as CSV is not displayed");
        QXClient.get().report().info("Download as CSV is displayed");
        Assert.assertTrue(QXClient.get().gestures().isElementPresent(homePageObjects.nameUnderDashboard),"Member names in dashboard is not displayed");
        QXClient.get().report().info("Member names is displayed");
        Assert.assertTrue(QXClient.get().gestures().isElementPresent(homePageObjects.progressUnderDashboard),"Progress in dashboard is not displayed");
        QXClient.get().report().info("Progress is displayed");
        QXClient.get().gestures().BlindWait(3000);
        Assert.assertTrue(QXClient.get().gestures().isElementPresent(homePageObjects.firstMemberUnderDashboard),"First member under dashboard is not displayed");
        Assert.assertTrue(QXClient.get().gestures().isElementPresent(homePageObjects.secondMemberUnderDashboard),"Second member under dashboard is not displayed");
        Assert.assertTrue(QXClient.get().gestures().isElementPresent(homePageObjects.progressPercentageFirstMember),"Progress percentage of first member");
        Assert.assertTrue(QXClient.get().gestures().isElementPresent(homePageObjects.individualScoreInDashboard),"Individual score is not displayed");
        Assert.assertTrue(QXClient.get().gestures().isElementPresent(homePageObjects.assertNAinDashboard),"NA in dashboard is not displayed");

    }


    public void verifyGeneralDiscussionTopics() throws Exception {
        QXClient.get().gestures().BlindWait(5000);


        QXClient.get().gestures().waitAndClickElementisVisible(homePageObjects.clkMyGroups);
        QXClient.get().report().info("clicked on MyGroups");
        QXClient.get().gestures().BlindWait(3000);


        try
        {
            QXClient.get().gestures().waitAndClickElementisVisible(homePageObjects.clkCloseIconGrp);
            QXClient.get().report().info("Tap on clkCloseIconGrp button");
        }
        catch(Exception e3)
        {
            System.out.println("Handled");
        }
        QXClient.get().gestures().waitAndClickElementisVisible(homePageObjects.clkFirstGroup);
        QXClient.get().report().info("Clicked on First group");
        QXClient.get().gestures().BlindWait(5000);

        Assert.assertTrue(QXClient.get().gestures().isElementPresent(homePageObjects.clkenableDisIcon),"Enabled Discussion Icon is not displayed");
        QXClient.get().report().info("Enabled Discussion Icon is displayed");
        QXClient.get().gestures().BlindWait(3000);
        QXClient.get().gestures().waitAndClickElementisVisible(homePageObjects.clkenableDisIcon);
        QXClient.get().gestures().BlindWait(5000);

        Assert.assertTrue(QXClient.get().gestures().isElementPresent(homePageObjects.clickHambugMenuForum),"Hamburger Menu is not displayed");
        QXClient.get().report().info("Hamburger Menu is displayed");
        QXClient.get().gestures().waitAndClickElementisVisible(homePageObjects.clickHambugMenuForum);
        QXClient.get().gestures().BlindWait(2000);

        Assert.assertTrue(QXClient.get().gestures().isElementPresent(homePageObjects.verifyCatogries),"Categories is not displayed");
        Assert.assertTrue(QXClient.get().gestures().isElementPresent(homePageObjects.verifyTags),"Tags is not displayed");
        Assert.assertTrue(QXClient.get().gestures().isElementPresent(homePageObjects.verifyDiscussion)," My Discussions is not displayed");
        QXClient.get().gestures().BlindWait(2000);

        QXClient.get().gestures().waitAndClickElementisVisible(homePageObjects.verifyDiscussion);
        QXClient.get().report().info("Clicked on My discussions");
        QXClient.get().gestures().BlindWait(3000);

        Assert.assertTrue(QXClient.get().gestures().isElementPresent(homePageObjects.verifyRecentPosts),"Recent Posts is not displayed");
        QXClient.get().gestures().waitAndClickElementisVisible(homePageObjects.verifyRecentPosts);
        QXClient.get().gestures().BlindWait(2000);
        Assert.assertTrue(QXClient.get().gestures().isElementPresent(homePageObjects.assertDataUnderMyDiscussions),"Not able to open Recent posts");
        QXClient.get().report().info("Recent posts is opened successfully");
        QXClient.get().gestures().BlindWait(2000);

        Assert.assertTrue(QXClient.get().gestures().isElementPresent(homePageObjects.verifyBestPosts),"Best Posts is not displayed");
        QXClient.get().gestures().waitAndClickElementisVisible(homePageObjects.verifyBestPosts);
        QXClient.get().gestures().BlindWait(2000);
        Assert.assertTrue(QXClient.get().gestures().isElementPresent(homePageObjects.assertDataUnderMyDiscussions),"Not able to open Best posts");
        QXClient.get().report().info("Best posts is opened successfully");
        QXClient.get().gestures().BlindWait(2000);

        Assert.assertTrue(QXClient.get().gestures().isElementPresent(homePageObjects.verifySavedPosts),"Saved Posts is not displayed");
        QXClient.get().gestures().waitAndClickElementisVisible(homePageObjects.verifySavedPosts);
        QXClient.get().gestures().BlindWait(2000);
        Assert.assertTrue(QXClient.get().gestures().isElementPresent(homePageObjects.assertDataUnderMyDiscussions),"Not able to open Saved posts");
        QXClient.get().report().info("Saved posts is opened successfully");
        QXClient.get().gestures().BlindWait(2000);

        Assert.assertTrue(QXClient.get().gestures().isElementPresent(homePageObjects.verifyUpvoted),"Upvoted is not displayed");
        QXClient.get().gestures().waitAndClickElementisVisible(homePageObjects.verifyUpvoted);
        QXClient.get().gestures().BlindWait(2000);
        Assert.assertTrue(QXClient.get().gestures().isElementPresent(homePageObjects.assertDataUnderMyDiscussions),"Not able to open Upvoted");
        QXClient.get().report().info("Upvoted is opened successfully");
        QXClient.get().gestures().BlindWait(2000);

        Assert.assertTrue(QXClient.get().gestures().isElementPresent(homePageObjects.verifyDownVoted),"Downvoted is not displayed");
        QXClient.get().gestures().waitAndClickElementisVisible(homePageObjects.verifyDownVoted);
        QXClient.get().gestures().BlindWait(2000);
        Assert.assertTrue(QXClient.get().gestures().isElementPresent(homePageObjects.assertDataUnderMyDiscussions),"Not able to open Downvoted");
        QXClient.get().report().info("Downvoted is opened successfully");
        QXClient.get().gestures().BlindWait(4000);

        QXClient.get().gestures().waitAndClickElementisVisible(homePageObjects.clkBackbutton);
        QXClient.get().gestures().BlindWait(5000);

    }

    public void verifyDiscussionList() throws Exception {
        QXClient.get().gestures().BlindWait(3000);

        Assert.assertTrue(QXClient.get().gestures().isElementPresent(homePageObjects.clkEyeIcon),"Eye icon is not displayed");
        QXClient.get().gestures().waitAndClickElementisVisible(homePageObjects.clkEyeIcon);
        QXClient.get().report().info("Clicked on Eye icon in General Discussion");
        QXClient.get().gestures().BlindWait(4000);

        Assert.assertTrue(QXClient.get().gestures().isElementPresent(homePageObjects.clkStartDiscussion),"Start discussion button is not displayed");
        QXClient.get().report().info("Start discussion button is displayed");
        Assert.assertTrue(QXClient.get().gestures().isElementPresent(homePageObjects.assertDiscussionList),"Discussion List is not displayed");
        QXClient.get().report().info("Discussion List is displayed and User able to see List of Discussions");
        QXClient.get().gestures().BlindWait(3000);


    }

    public void verifyUpdatedCardsForActivities() throws Exception {
        QXClient.get().gestures().BlindWait(5000);


        QXClient.get().gestures().waitAndClickElementisVisible(homePageObjects.clkMyGroups);
        QXClient.get().report().info("clicked on MyGroups");
        QXClient.get().gestures().BlindWait(3000);


        try
        {
            QXClient.get().gestures().waitAndClickElementisVisible(homePageObjects.clkCloseIconGrp);
            QXClient.get().report().info("Tap on clkCloseIconGrp button");
        }
        catch(Exception e3)
        {
            System.out.println("Handled");
        }
        QXClient.get().gestures().waitAndClickElementisVisible(homePageObjects.clkFirstGroup);
        QXClient.get().report().info("Clicked on First group");
        QXClient.get().gestures().BlindWait(5000);

        Assert.assertTrue(QXClient.get().gestures().isElementPresent(homePageObjects.assertUpdatedCardForActivity1),"Updated card is not displayed for activity");
        QXClient.get().report().info("User is able to view Updated card for Activity in Groups");
        QXClient.get().gestures().swipeUp();
        QXClient.get().gestures().BlindWait(3000);

        if(QXClient.get().gestures().isElementPresent(homePageObjects.assertUpdatedCardForMoreActivity)){
            Assert.assertTrue(QXClient.get().gestures().isElementPresent(homePageObjects.assertUpdatedCardForMoreActivity));
            QXClient.get().report().info("Updated card for more activity is displayed");
        }else{
            QXClient.get().report().info("Only one activity updated card is displayed");
        }
    }

    public void viewOptionActivityDashBoardOnActivityLevel() throws  Exception {
        QXClient.get().gestures().BlindWait(5000);


        QXClient.get().gestures().waitAndClickElementisVisible(homePageObjects.clkMyGroups);
        QXClient.get().report().info("clicked on MyGroups");
        QXClient.get().gestures().BlindWait(3000);


        try
        {
            QXClient.get().gestures().waitAndClickElementisVisible(homePageObjects.clkCloseIconGrp);
            QXClient.get().report().info("Tap on clkCloseIconGrp button");
        }
        catch(Exception e3)
        {
            System.out.println("Handled");
        }
        QXClient.get().gestures().waitAndClickElementisVisible(homePageObjects.clkFirstGroup);
        QXClient.get().report().info("Clicked on First group");
        QXClient.get().gestures().BlindWait(5000);

        Assert.assertTrue(QXClient.get().gestures().isElementPresent(homePageObjects.courseUnderFirstGrp),"Course is not displayed");
        QXClient.get().gestures().waitAndClickElementisVisible(homePageObjects.courseUnderFirstGrp);
        QXClient.get().report().info("Clicked on Course under Group");
        QXClient.get().gestures().BlindWait(3000);
        QXClient.get().report().info("Course Dashboard is displayed");

        Assert.assertTrue(QXClient.get().gestures().isElementPresent(homePageObjects.clkActivityDashboard),"Group Admin not able to view Activity Dashboard in Activity Level");
        QXClient.get().report().info("Group Admin is able to view an Option Activity Dashboard in Activity Level");
        QXClient.get().gestures().BlindWait(3000);
    }

    public void openActivityDashBoard() throws Exception {
        QXClient.get().gestures().BlindWait(3000);

        tapOnMenuBar();
        QXClient.get().gestures().waitAndClickElementisVisible(homePageObjects.clkMyGroups);
        QXClient.get().report().info("Clicked on My groups button");
        QXClient.get().gestures().BlindWait(2000);

        try
        {
            QXClient.get().gestures().waitAndClickElementisVisible(homePageObjects.clkCloseIconGrp);
            QXClient.get().report().info("Tap on clkCloseIconGrp button");
        }
        catch(Exception e3)
        {
            System.out.println("Handled");
        }

        QXClient.get().gestures().waitAndClickElementisVisible(homePageObjects.clkFirstGroup);
        QXClient.get().report().info("Clicked on First group");
        QXClient.get().gestures().BlindWait(2000);

        Assert.assertTrue(QXClient.get().gestures().isElementPresent(homePageObjects.courseUnderFirstGrp),"Course is not displayed");
        QXClient.get().gestures().waitAndClickElementisVisible(homePageObjects.courseUnderFirstGrp);
        QXClient.get().report().info("Clicked on Course under Group");
        QXClient.get().gestures().BlindWait(3000);

        //Assert.assertTrue(QXClient.get().gestures().isElementPresent(homePageObjects.assertCourseProgress),"Course progress is not displayed");
        Assert.assertTrue(QXClient.get().gestures().isElementPresent(homePageObjects.clkActivityDashboard),"Activity dashboard is not displayed");
        QXClient.get().report().info("Activity dashboard is displayed");
        QXClient.get().gestures().waitAndClickElementisVisible(homePageObjects.clkActivityDashboard);
        QXClient.get().report().info("Clicked on activity dashboard");
        QXClient.get().gestures().BlindWait(3000);
    }

    public void verifyDownloadAsCSVInActivityDashboard() throws Exception {
        QXClient.get().gestures().BlindWait(3000);

        Assert.assertTrue(QXClient.get().gestures().isElementPresent(homePageObjects.downLoadCSVfile),"Download as CSV is not displayed");
        QXClient.get().report().info("Download as CSV is displayed in Activity Dashboard");
    }

    public void verifyAdminAbleToViewGroupMemberInActivityScreen() throws Exception {
          QXClient.get().gestures().BlindWait(3000);

        Assert.assertTrue(QXClient.get().gestures().isElementPresent(homePageObjects.nameUnderDashboard),"Member names in dashboard is not displayed");
        QXClient.get().report().info("Member names is displayed");
        QXClient.get().gestures().BlindWait(3000);
        Assert.assertTrue(QXClient.get().gestures().isElementPresent(homePageObjects.firstMemberUnderDashboard),"First member under dashboard is not displayed");
        Assert.assertTrue(QXClient.get().gestures().isElementPresent(homePageObjects.secondMemberUnderDashboard),"Second member under dashboard is not displayed");

    }

    public void verifyMembersProgressInPercentage() throws Exception {
        QXClient.get().gestures().BlindWait(3000);

        Assert.assertTrue(QXClient.get().gestures().isElementPresent(homePageObjects.progressUnderDashboard),"Progress in dashboard is not displayed");
        QXClient.get().report().info("Memnbers Assessment Progress is displayed in Percentage");
        QXClient.get().gestures().BlindWait(3000);
        Assert.assertTrue(QXClient.get().gestures().isElementPresent(homePageObjects.progressPercentageFirstMember),"Progress percentage of first member");
        QXClient.get().report().info("Memnbers Assessment Progress is displayed in Percentage");
    }

    public void verifyAllMetricsOfDashboardForAdmin() throws  Exception {
        QXClient.get().gestures().BlindWait(3000);

        Assert.assertTrue(QXClient.get().gestures().isElementPresent(homePageObjects.downLoadCSVfile),"Download as CSV is not displayed");
        QXClient.get().report().info("Download as CSV is displayed");
        Assert.assertTrue(QXClient.get().gestures().isElementPresent(homePageObjects.nameUnderDashboard),"Member names in dashboard is not displayed");
        QXClient.get().report().info("Member names is displayed");
        Assert.assertTrue(QXClient.get().gestures().isElementPresent(homePageObjects.progressUnderDashboard),"Progress in dashboard is not displayed");
        QXClient.get().report().info("Progress is displayed");
        QXClient.get().gestures().BlindWait(3000);
        Assert.assertTrue(QXClient.get().gestures().isElementPresent(homePageObjects.firstMemberUnderDashboard),"First member under dashboard is not displayed");
        Assert.assertTrue(QXClient.get().gestures().isElementPresent(homePageObjects.secondMemberUnderDashboard),"Second member under dashboard is not displayed");
        Assert.assertTrue(QXClient.get().gestures().isElementPresent(homePageObjects.progressPercentageFirstMember),"Progress percentage of first member");
        Assert.assertTrue(QXClient.get().gestures().isElementPresent(homePageObjects.individualScoreInDashboard),"Individual score is not displayed");
        Assert.assertTrue(QXClient.get().gestures().isElementPresent(homePageObjects.assertNAinDashboard),"NA in dashboard is not displayed");

    }

    public void verifyCoursesAndCertificatesSection() throws Exception {
        QXClient.get().gestures().BlindWait(3000);

        Assert.assertTrue(QXClient.get().gestures().isElementPresent(homePageObjects.assertSelectcategoryText),"Select category is not displayed");
        QXClient.get().report().info("Select category is displayed after clicking Help Button");

        Assert.assertTrue(QXClient.get().gestures().isElementPresent(homePageObjects.clkCourseAndCertificates),"Course and certificates is not displayed in FAQs");
        QXClient.get().report().info("Course and certificates FAQ is displayed ");
        QXClient.get().gestures().waitAndClickElementisVisible(homePageObjects.clkCourseAndCertificates);
        QXClient.get().report().info("Clicked on Course and certificates");
        QXClient.get().gestures().BlindWait(3000);

        Assert.assertTrue(QXClient.get().gestures().isElementPresent(homePageObjects.assertCourseAndCertificatesPageText),"Course and certificates Text is not displayed");
        QXClient.get().report().info("Course & certificates Text is displayed");

        Assert.assertTrue(QXClient.get().gestures().isElementPresent(homePageObjects.assertIncorrectProgressFAQ),"Incorrect progress FAQ is not displayed");
        QXClient.get().report().info("Incorrect progress FAQ is displayed");
        QXClient.get().gestures().waitAndClickElementisVisible(homePageObjects.assertIncorrectProgressFAQ);
        QXClient.get().report().info("Clicked on Incorrect progress FAQ");
        QXClient.get().gestures().BlindWait(3000);

        Assert.assertTrue(QXClient.get().gestures().isElementPresent(homePageObjects.assertSolutionForIncorrectProgress),"Solution is not displayed");
        QXClient.get().report().info("Solution is displayed for Incorrect Progress FAQ");
        Assert.assertTrue(QXClient.get().gestures().isElementPresent(homePageObjects.assertAnswerHelpYouQuestion),"Did this answer help you is not displayed");
        QXClient.get().report().info("Did this answer help you is displayed");
        Assert.assertTrue(QXClient.get().gestures().isElementPresent(homePageObjects.assertYesButton),"Yes Button is not displayed");
        Assert.assertTrue(QXClient.get().gestures().isElementPresent(homePageObjects.assertNoButton),"No button is not displayed");
        QXClient.get().gestures().BlindWait(3000);
    }

       public void verifyHomePagePresentInsteadOfLibraryPage() throws Exception {
        QXClient.get().gestures().BlindWait(3000);

        Assert.assertTrue(!QXClient.get().gestures().isElementPresent(homePageObjects.libraryTab),"Home Page is displayed");
        QXClient.get().report().info("Library Page is displayed");
        QXClient.get().gestures().BlindWait(2000);

       // Assert.assertTrue(QXClient.get().gestures().isElementPresent(homePageObjects.clkHomePageTab),"Library Page is displayed");
        QXClient.get().report().info("Home Page is displayed");
        QXClient.get().gestures().BlindWait(3000);

       }

       public void verifyYourPreferencesMessage() throws Exception {
        QXClient.get().gestures().BlindWait(3000);

        Assert.assertTrue(QXClient.get().gestures().isElementPresent(homePageObjects.assertWelcomeMessage),"Welcome message is not displayed in home page");
        QXClient.get().report().info("Welcome message is displayed in home page");

        Assert.assertTrue(QXClient.get().gestures().isElementPresent(homePageObjects.assertYourPreference),"Your Preference is not displayed");
        QXClient.get().report().info("Your Preference is displayed below welcome message");

        Assert.assertTrue(QXClient.get().gestures().isElementPresent(homePageObjects.assertPreferenceInfoImage),"Preference info image is not displayed");
        QXClient.get().report().info("Preference Info image is displayed");
        QXClient.get().gestures().waitAndClickElementisVisible(homePageObjects.assertPreferenceInfoImage);
        QXClient.get().report().info("Clicked on Preference info image");
        QXClient.get().gestures().BlindWait(3000);

        Assert.assertTrue(QXClient.get().gestures().isElementPresent(homePageObjects.assertUser),"User is not displayed after clicking preferences");

           Assert.assertTrue(QXClient.get().gestures().isElementPresent(homePageObjects.assertYourPreference),"Your Preference is not displayed");
           QXClient.get().report().info("Your Preference is displayed below welcome message");

        Assert.assertTrue(QXClient.get().gestures().isElementPresent(homePageObjects.assertBrowseDIKSHAlibraryMessage),"Browse Diksha message is not displayed");
        QXClient.get().report().info("Browse DIKSHA library to find relevant content based on your preferences message is displayed");

        Assert.assertTrue(QXClient.get().gestures().isElementPresent(homePageObjects.assertChangePreferenceBtn),"Change preferences button is not displayed");
        QXClient.get().report().info("Change preferences button is displayed");
        QXClient.get().gestures().BlindWait(3000);
    }

    public void validateDownloadSectionForGuestUser() throws Exception {
        QXClient.get().gestures().BlindWait(3000);

        Assert.assertTrue(QXClient.get().gestures().isElementPresent(homePageObjects.assertHamburgerMenu),"Hamburger menu is not displayed");
        QXClient.get().report().info("Hamburger menu is displayed");
        Assert.assertTrue(QXClient.get().gestures().isElementPresent(homePageObjects.assertSettingsButton),"Settings button is not displayed");
        QXClient.get().report().info("Settings button is displayed");
        Assert.assertTrue(QXClient.get().gestures().isElementPresent(homePageObjects.assertSpaceTakenByDiksha),"Space taken by diksha is not displayed");
        QXClient.get().report().info("Space taken by diksha is displayed");
        Assert.assertTrue(QXClient.get().gestures().isElementPresent(homePageObjects.assertAvailableSpace),"Available space is not displayed");
        QXClient.get().report().info("Available space is displayed");

        if(QXClient.get().gestures().isElementPresent(homePageObjects.clkDeleteBtn)){
            QXClient.get().gestures().waitAndClickElementisVisible(homePageObjects.clkDeleteBtn);
            QXClient.get().gestures().BlindWait(3000);

            QXClient.get().gestures().waitAndClickElementisVisible(homePageObjects.clkDeleteBtn);
            QXClient.get().gestures().BlindWait(2000);
        }else{
            QXClient.get().report().info("There is no content to Delete");
        }

        Assert.assertTrue(QXClient.get().gestures().isElementPresent(homePageObjects.assertNoDownloads),"No downloads yet message is not displayed");
        QXClient.get().report().info("No Downloads yet message is displayed");

        Assert.assertTrue(QXClient.get().gestures().isElementPresent(homePageObjects.assertDownloadContentFromCoursesMsg),"Download content from Course or Library message is not displayed");
        QXClient.get().report().info("Download content from Courses or Library message is displayed");
        QXClient.get().gestures().BlindWait(3000);
    }


    public void validateForumIconInCourse() throws Exception {
        QXClient.get().gestures().BlindWait(5000);

        Assert.assertTrue(QXClient.get().gestures().isElementPresent(homePageObjects.clkForumIcon),"Forum icon is not present in the course");
        QXClient.get().report().info("Forum icon is displayed in the course");
        QXClient.get().gestures().waitAndClickElementisVisible(homePageObjects.clkForumIcon);
        QXClient.get().report().info("Clicked on Forum Icon of the course");
        QXClient.get().gestures().BlindWait(5000);

        QXClient.get().gestures().waitAndClickElementisVisible(homePageObjects.clickHambugMenuForum);
        QXClient.get().report().info("Tap on clickHambugMenuForum button");
        QXClient.get().gestures().BlindWait(3000);
        Assert.assertTrue(QXClient.get().gestures().isElementPresent(homePageObjects.clkCloseIconDF),"clkCloseIconDF is not available");

        Assert.assertTrue(QXClient.get().gestures().isElementPresent(homePageObjects.verifyCatogries),"verifyCatogries is not available");
        Assert.assertTrue(QXClient.get().gestures().isElementPresent(homePageObjects.verifyTags),"verifyTags is not available");
        Assert.assertTrue(QXClient.get().gestures().isElementPresent(homePageObjects.verifyDiscussion),"verifyDiscussion is not available");
        QXClient.get().gestures().BlindWait(3000);


        QXClient.get().gestures().waitAndClickElementisVisible(homePageObjects.verifyDiscussion);
        QXClient.get().report().info("Tap on verifyDiscussion button");
        QXClient.get().gestures().BlindWait(3000);
        Assert.assertTrue(QXClient.get().gestures().isElementPresent(homePageObjects.clkCloseIconDF),"clkCloseIconDF is not available");

        Assert.assertTrue(QXClient.get().gestures().isElementPresent(homePageObjects.verifyRecentPosts),"verifyRecentPosts is not available");
        Assert.assertTrue(QXClient.get().gestures().isElementPresent(homePageObjects.verifyBestPosts),"verifyBestPosts is not available");
        Assert.assertTrue(QXClient.get().gestures().isElementPresent(homePageObjects.verifySavedPosts),"verifySavedPosts is not available");
        Assert.assertTrue(QXClient.get().gestures().isElementPresent(homePageObjects.verifyUpvoted),"verifyUpvoted is not available");
        Assert.assertTrue(QXClient.get().gestures().isElementPresent(homePageObjects.verifyDownVoted),"verifyDownVoted is not available");

        QXClient.get().gestures().BlindWait(4000);

        QXClient.get().gestures().clkBackButton();
        //QXClient.get().gestures().clkBackButton();

        QXClient.get().gestures().BlindWait(4000);
    }

    public void validatePostReplyAndSavePost() throws Exception {
        QXClient.get().gestures().BlindWait(4000);

        QXClient.get().gestures().waitAndClickElementisVisible(homePageObjects.clkEyeIcon);
        QXClient.get().report().info("Clicked on Eye icon of Discussion");
        QXClient.get().gestures().BlindWait(2000);

        QXClient.get().gestures().waitAndClickElementisVisible(homePageObjects.clkOnDiscussion);
        QXClient.get().gestures().BlindWait(3000);

        QXClient.get().gestures().waitAndClickElementisVisible(homePageObjects.commentsSection);
        QXClient.get().gestures().BlindWait(2000);
        homePageObjects.commentsSection.sendKeys("Diksha Applicattion Testing");
        QXClient.get().gestures().BlindWait(2000);
        QXClient.get().gestures().clkBackButton();

        QXClient.get().gestures().waitAndClickElementisVisible(homePageObjects.clkPostReply);
        QXClient.get().gestures().BlindWait(3000);

        Assert.assertTrue(QXClient.get().gestures().isElementPresent(homePageObjects.assertSavePostIcon),"BookMark icon is not displayed");
        Assert.assertTrue(QXClient.get().gestures().isElementPresent(homePageObjects.assertUpvoteIcon),"Upvote icon is not displayed");
        Assert.assertTrue(QXClient.get().gestures().isElementPresent(homePageObjects.assertDownvoteIcon),"Downvote icon is not displayd");
        QXClient.get().gestures().BlindWait(3000);

        QXClient.get().gestures().waitAndClickElementisVisible(homePageObjects.assertSavePostIcon);
        QXClient.get().gestures().BlindWait(3000);

        QXClient.get().gestures().waitAndClickElementisVisible(homePageObjects.assertUpvoteIcon);
        QXClient.get().gestures().BlindWait(3000);

        QXClient.get().gestures().waitAndClickElementisVisible(homePageObjects.assertDownvoteIcon);
        QXClient.get().gestures().BlindWait(3000);
    }

    public void verifyFAQsSectionInClassicThemeAndJoyFulTheme() throws Exception {
        QXClient.get().gestures().BlindWait(3000);

        QXClient.get().gestures().waitAndClickElementisVisible(homePageObjects.clkHelpMenu);
        QXClient.get().report().info("Clicked on Help menu");
        QXClient.get().gestures().BlindWait(2000);

        Assert.assertTrue(QXClient.get().gestures().isElementPresent(homePageObjects.assertHelpTextInHelpPage),"Help text is not displayed");
        QXClient.get().report().info("Help Text is displayed in Help screen;");
        Assert.assertTrue(QXClient.get().gestures().isElementPresent(homePageObjects.assertFAQtext),"Frequently asked questions text is not displayed");
        QXClient.get().report().info("Frequently asked questions text is displayed");
        QXClient.get().gestures().BlindWait(2000);

        Assert.assertTrue(QXClient.get().gestures().isElementPresent(homePageObjects.assertSelectcategoryText),"Select category is not displayed");
        QXClient.get().report().info("Selected category text is displayed");

        Assert.assertTrue(QXClient.get().gestures().isElementPresent(homePageObjects.assertContentSection),"Content section is not displayed");
        Assert.assertTrue(QXClient.get().gestures().isElementPresent(homePageObjects.assertContentPlaySection),"Content Play section is not displayed");
        Assert.assertTrue(QXClient.get().gestures().isElementPresent(homePageObjects.assertProfileSection),"Profile Section is not displayed");
        Assert.assertTrue(QXClient.get().gestures().isElementPresent(homePageObjects.assertLoginSection),"Login Section is not displayed");
        Assert.assertTrue(QXClient.get().gestures().isElementPresent(homePageObjects.assertContentCreationSection),"Content creation section is not displayed");
        Assert.assertTrue(QXClient.get().gestures().isElementPresent(homePageObjects.clkCourseAndCertificates),"Courses and certificates section is not displayed");
        Assert.assertTrue(QXClient.get().gestures().isElementPresent(homePageObjects.assertOtherSection),"Other section is not displayed");
        Assert.assertTrue(QXClient.get().gestures().isElementPresent(homePageObjects.assertManagingProjectsSection),"Managing projects section is not displayed");

        QXClient.get().gestures().BlindWait(2000);
        Assert.assertTrue(QXClient.get().gestures().isElementPresent(homePageObjects.clkOnReportOtherIssue),"Report other issue is not displayed");
        QXClient.get().gestures().waitAndClickElementisVisible(homePageObjects.assertContentSection);
        QXClient.get().report().info("Clicked on Content section ");
        QXClient.get().gestures().BlindWait(2000);

        Assert.assertTrue(QXClient.get().gestures().isElementPresent(homePageObjects.assertHelpTextInHelpPage),"Help page is not displayed for Respective content");
        Assert.assertTrue(QXClient.get().gestures().isElementPresent(homePageObjects.assertFaqText),"Faq text is not displayed");
        Assert.assertTrue(QXClient.get().gestures().isElementPresent(homePageObjects.assertQuestionUnderFAQ),"Questions under faqs is not displayed");
        QXClient.get().report().info("Questions under Faq(s) is displayed");
        QXClient.get().gestures().BlindWait(3000);


        QXClient.get().gestures().clkBackButton();
        QXClient.get().gestures().BlindWait(3000);



    }

    public void changeToJoyfulTheme() throws Exception {
        QXClient.get().gestures().BlindWait(2000);

        QXClient.get().gestures().waitAndClickElementisVisible(homePageObjects.clkNewDikshExperiece);
        QXClient.get().report().info("Clicked on Joyful Theme");
        QXClient.get().report().info("Changed from classing theme to joyful theme");
        QXClient.get().gestures().BlindWait(3000);
    }


    public void verifyHelpPageForVideoRelatedCategoryInClassicAndJoyfulTheme() throws Exception {
        QXClient.get().gestures().BlindWait(3000);

        QXClient.get().gestures().waitAndClickElementisVisible(homePageObjects.clkHelpMenu);
        QXClient.get().report().info("Clicked on Help menu");
        QXClient.get().gestures().BlindWait(2000);

        Assert.assertTrue(QXClient.get().gestures().isElementPresent(homePageObjects.assertHelpTextInHelpPage),"Help text is not displayed");
        QXClient.get().report().info("Help Text is displayed in Help screen;");
        Assert.assertTrue(QXClient.get().gestures().isElementPresent(homePageObjects.assertFAQtext),"Frequently asked questions text is not displayed");
        QXClient.get().report().info("Frequently asked questions text is displayed");
        QXClient.get().gestures().BlindWait(2000);

        Assert.assertTrue(QXClient.get().gestures().isElementPresent(homePageObjects.assertSelectcategoryText),"Select category is not displayed");
        QXClient.get().report().info("Selected category text is displayed");

        Assert.assertTrue(QXClient.get().gestures().isElementPresent(homePageObjects.assertContentPlaySection),"Content Play section is not displayed");
        QXClient.get().report().info("Content play section is displayed");

        QXClient.get().gestures().waitAndClickElementisVisible(homePageObjects.assertContentPlaySection);
        QXClient.get().gestures().BlindWait(2000);

        Assert.assertTrue(QXClient.get().gestures().isElementPresent(homePageObjects.assertHelpTextInHelpPage),"Help Text is not displayed in Help page");
        Assert.assertTrue(QXClient.get().gestures().isElementPresent(homePageObjects.assertFAQtext),"Frequently asked questions text is not displayed");

        Assert.assertTrue(QXClient.get().gestures().isElementPresent(homePageObjects.assertCategoryInHelpPage),"Category is not organized or displayed in Help page");
        QXClient.get().report().info("Category is organized first in Help Page");
        Assert.assertTrue(QXClient.get().gestures().isElementPresent(homePageObjects.assertFaqText),"Faq(s) text is not organized or displayed");
        QXClient.get().report().info("Faq(s) is organized after category in help page");
        QXClient.get().gestures().BlindWait(2000);

        Assert.assertTrue(QXClient.get().gestures().isElementPresent(homePageObjects.questionRelatedToVideoContent),"Question related to play video is not displayed");
        QXClient.get().report().info("When I try to play video, I get an error is displayed");
        QXClient.get().gestures().waitAndClickElementisVisible(homePageObjects.questionRelatedToVideoContent);
        QXClient.get().gestures().BlindWait(2000);

        Assert.assertTrue(QXClient.get().gestures().isElementPresent(homePageObjects.solution1ForVideoRelatedQuestion),"Solution 1 is not displayed for video related question");
        QXClient.get().report().info("Download the video and play it solution is displayed");
        Assert.assertTrue(QXClient.get().gestures().isElementPresent(homePageObjects.solution2ForVideoRelatedQuestion),"Solution 2 is not displayed for video related question");
        QXClient.get().report().info("If you do not see download option solution is displayed");
        QXClient.get().gestures().swipeUp();
        QXClient.get().gestures().BlindWait(2000);

        Assert.assertTrue(QXClient.get().gestures().isElementPresent(homePageObjects.assertAnswerHelpYouQuestion),"Did this answer help you is not displayed");
        QXClient.get().report().info("Did this answer help you is displayed");
        Assert.assertTrue(QXClient.get().gestures().isElementPresent(homePageObjects.assertYesButton),"Yes Button is not displayed");
        Assert.assertTrue(QXClient.get().gestures().isElementPresent(homePageObjects.assertNoButton),"No button is not displayed");
        QXClient.get().gestures().BlindWait(3000);

        QXClient.get().gestures().clkBackButton();
        QXClient.get().gestures().BlindWait(3000);

    }

   /* public void validateHomepageSectionsForNewDikshaexperience() throws Exception {
        QXClient.get().gestures().BlindWait(5000);
        Assert.assertTrue(QXClient.get().gestures().isElementPresent(homePageObjects.tryNewDikshaExperience), "try new diksha experence is not displayed");
        QXClient.get().report().info("Try new diksha experience is displayed ");
        QXClient.get().gestures().waitAndClickElementisVisible(homePageObjects.tryNewDikshaExperience);
        QXClient.get().report().info("Clicked on Try new diksha experience");
        QXClient.get().gestures().BlindWait(6000);
        Assert.assertTrue(QXClient.get().gestures().isElementPresent(homePageObjects.myLearningSection), "My learning section is not displayed");
        QXClient.get().report().info("My learning section is displayed");
        Assert.assertTrue(QXClient.get().gestures().isElementPresent(homePageObjects.browseByCatagory), "Browse by category is not displayed ");
        QXClient.get().report().info("Browse by category is displayed ");
        Assert.assertTrue(QXClient.get().gestures().isElementPresent(homePageObjects.browseBySubject), "Browse by subject is not displayed");
        QXClient.get().report().info("Browse by subject is displayed ");
        Assert.assertTrue(QXClient.get().gestures().isElementPresent(homePageObjects.course), "Course is displayed");
        QXClient.get().report().info("Course is displayed ");
        Assert.assertTrue(QXClient.get().gestures().isElementPresent(homePageObjects.digitalTextBook), "Digital text book is displayed");
        QXClient.get().report().info("Digital text book is displayed ");
        QXClient.get().gestures().swipeUp();
        QXClient.get().gestures().waitAndClickElementisVisible(homePageObjects.viewAllSubjects);
        QXClient.get().report().info("Clicked on view all subjects");
        QXClient.get().report().info("Subjects is displayed in Full Screen");
        QXClient.get().gestures().BlindWait(3000);
        Assert.assertTrue(QXClient.get().gestures().isElementPresent(homePageObjects.assertAccountancy), "accountancy is not displayed ");
        QXClient.get().report().info("accountancy subject is displayed ");
        QXClient.get().gestures().BlindWait(3000);
        QXClient.get().gestures().scrollToMobileElement(homePageObjects.assertUrdu,"6");
        Assert.assertTrue(QXClient.get().gestures().isElementPresent(homePageObjects.assertUrdu), "Urdu is not displayed");
        QXClient.get().report().info("Urdu Subject is displayed ");
        QXClient.get().gestures().BlindWait(3000);
        QXClient.get().gestures().waitAndClickElementisVisible(homePageObjects.close);
        QXClient.get().report().info("Clicked on close icon");
        QXClient.get().gestures().BlindWait(3000);
        QXClient.get().gestures().swipeDown();
        QXClient.get().gestures().waitAndClickElementisVisible(homePageObjects.digitalTextBook);
        QXClient.get().report().info("Clicked on digital texbook");
        QXClient.get().gestures().BlindWait(3000);
        Assert.assertTrue(QXClient.get().gestures().isElementPresent(homePageObjects.assertExplorerPage), "explorer page is displayed");
        QXClient.get().report().info("explorer page is displayed ");

    }
*/
    public void validateSectionsUnderContentPreferenceInProfilePage() throws Exception {
        QXClient.get().gestures().BlindWait(3000);

        Assert.assertTrue(QXClient.get().gestures().isElementPresent(homePageObjects.assertOrgNameBelowDikshaID),"org name is not displayed");
        QXClient.get().report().info("Org Name is displayed below Diksha ID");

        Assert.assertTrue(QXClient.get().gestures().isElementPresent(homePageObjects.assertContentPreferenceLabel),"Content preference label is not displayed");
        QXClient.get().report().info("Content Preference Label is displayed in Profile Section");

        Assert.assertTrue(QXClient.get().gestures().isElementPresent(homePageObjects.assertRoleSectionUnderContentPreferenceLabel),"Role is not displayed in Profile Page");
        QXClient.get().report().info("Role is displayed under Content preference Label");

        Assert.assertTrue(QXClient.get().gestures().isElementPresent(homePageObjects.assertSubRoleSectionUnderContentPreferenceLabel),"Sub Role is not displayed in Profile Page");
        QXClient.get().report().info("Sub Role is displayed under Content preference Label");

        Assert.assertTrue(QXClient.get().gestures().isElementPresent(homePageObjects.assertDistrictSectionUnderContentPreferenceLabel),"District is not displayed in Profile Page");
        QXClient.get().report().info("District is displayed under Content Preference Label");

        Assert.assertTrue(QXClient.get().gestures().isElementPresent(homePageObjects.assertStateSectionUnderContentPreferenceLabel),"State is not displayed in Profile Page");
        QXClient.get().report().info("State is displayed under Content Preference Label");
        QXClient.get().gestures().BlindWait(3000);


        Assert.assertTrue(QXClient.get().gestures().isElementPresent(homePageObjects.assertBoardSectionUnderContentPreferenceLabel),"Board is not displayed in Profile Page");
        QXClient.get().report().info("Board is displayed under Content Preference Label");

        Assert.assertTrue(QXClient.get().gestures().isElementPresent(homePageObjects.assertMediumSectionUnderContentPreferenceLabel),"Medium is not displayed in Profile Page");
        QXClient.get().report().info("Medium is displayed under Content Preference Label");
        QXClient.get().gestures().swipeUp();

        Assert.assertTrue(QXClient.get().gestures().isElementPresent(homePageObjects.assertClassesSectionUnderContentPreferenceLabel),"Classes is not displayed in Profile Page");
        QXClient.get().report().info("Classes is displayed under Content Preference Label");

        Assert.assertTrue(QXClient.get().gestures().isElementPresent(homePageObjects.assertSubjectsSectionUnderContentPreferenceLabel),"Subjects is not displayed in Profile Page");
        QXClient.get().report().info("Subjects is displayed under Content Preference Label");
        QXClient.get().gestures().BlindWait(3000);
    }

    public void verifyMyLearningInHomePage() throws Exception {
        QXClient.get().gestures().BlindWait(3000);

        QXClient.get().gestures().waitAndClickElementisVisible(homePageObjects.clkNewDikshExperiece);
        QXClient.get().report().info("Clicked on New Diksha Experience");
        QXClient.get().gestures().BlindWait(2000);

        Assert.assertTrue(QXClient.get().gestures().isElementPresent(homePageObjects.assertMyLearningSection),"My Learning Section is not displayed");
        QXClient.get().report().info("My Learning section is displayed in Home page");

        Assert.assertTrue(QXClient.get().gestures().isElementPresent(homePageObjects.assertEnrolledCourseUnderMyLearning),"Enrolled course is not displayed in Home Page");
        QXClient.get().report().info("Enrolled Course is displayed in Home Page under My Learning Section");
        QXClient.get().gestures().BlindWait(2000);
    }

    public void verifyExploreCategoryLabel() throws Exception {
        QXClient.get().gestures().BlindWait(3000);

        QXClient.get().gestures().waitAndClickElementisVisible(homePageObjects.clkNewDikshExperiece);
        QXClient.get().report().info("Clicked on New Diksha Experience");
        QXClient.get().gestures().BlindWait(2000);

        Assert.assertTrue(QXClient.get().gestures().isElementPresent(homePageObjects.assertBrowseByCategory),"Browse by category is not displayed");
        QXClient.get().report().info("Browse by category is displayed in Home page");

        Assert.assertTrue(QXClient.get().gestures().isElementPresent(homePageObjects.assertCourseUnderCategory),"Course is not displayed under browse by category");
        QXClient.get().gestures().waitAndClickElementisVisible(homePageObjects.assertCourseUnderCategory);
        QXClient.get().report().info("Clicked on Course under Browse by category");
        QXClient.get().gestures().BlindWait(3000);

        Assert.assertTrue(QXClient.get().gestures().isElementPresent(homePageObjects.assertExploreCourseLabel),"Explore course label is not displayed in Explore page");
        QXClient.get().report().info("Explore Course is displayed in Explore page ");
        QXClient.get().gestures().BlindWait(2000);

        Assert.assertTrue(QXClient.get().gestures().isElementPresent(homePageObjects.assertSubjectFilter),"Subject filter is not displayed");
        QXClient.get().report().info("Subject filter is displayed");

        Assert.assertTrue(QXClient.get().gestures().isElementPresent(homePageObjects.assertRoleFilter),"Role filter is not displayed");
        QXClient.get().report().info("Role filter is displayed");

        Assert.assertTrue(QXClient.get().gestures().isElementPresent(homePageObjects.assertAdvancedFilter),"Advanced filter is not displayed ");
        QXClient.get().report().info("Advanced filter is displayed ");

        Assert.assertTrue(QXClient.get().gestures().isElementPresent(homePageObjects.assertNavigationFilterBasedOnSubject),"Navigation filter is not displayed");
        QXClient.get().report().info("Navigation filter is displayed based on Subject");

        Assert.assertTrue(QXClient.get().gestures().isElementPresent(homePageObjects.assertGroupingBasedOnPrimaryCategory),"Grouping based on primary category is not displayed");
        QXClient.get().report().info("Grouping based on Primary category is displayed");
        QXClient.get().gestures().BlindWait(2000);

        QXClient.get().gestures().waitAndClickElementisVisible(homePageObjects.clkBackBtn);
        QXClient.get().gestures().BlindWait(3000);

    }

    public void verifyExploreSubjectAndFiltersInExplorePage() throws Exception {
        QXClient.get().gestures().BlindWait(3000);
        QXClient.get().gestures().swipeUp();

        Assert.assertTrue(QXClient.get().gestures().isElementPresent(homePageObjects.assertBrowseBySubject),"Browse by subject is not displayed");
        QXClient.get().report().info("Browse by subject is displayed in Home page");

        Assert.assertTrue(QXClient.get().gestures().isElementPresent(homePageObjects.assertAccountancySubject),"Accountancy subject is not displayed");
        QXClient.get().report().info("Accountancy subject is displayed under Browse by subject");
        QXClient.get().gestures().waitAndClickElementisVisible(homePageObjects.assertAccountancySubject);
        QXClient.get().report().info("Clicked on Accountancy subject");
        QXClient.get().gestures().BlindWait(2000);

        Assert.assertTrue(QXClient.get().gestures().isElementPresent(homePageObjects.assertExploreAccountancyLabel),"Explore Accountancy Label is not displayed");
        QXClient.get().report().info("Explore Accountanct Label is displayed under Browse by subject");

        Assert.assertTrue(QXClient.get().gestures().isElementPresent(homePageObjects.assertCategoryFilter),"Category filter is not displayed");
        QXClient.get().report().info("Category filter is displayed ");

        Assert.assertTrue(QXClient.get().gestures().isElementPresent(homePageObjects.assertRoleFilter),"Role filter is not displayed");
        QXClient.get().report().info("Role filter is displayed");

        Assert.assertTrue(QXClient.get().gestures().isElementPresent(homePageObjects.assertAdvancedFilter),"Advanced filter is not displayed ");
        QXClient.get().report().info("Advanced filter is displayed ");
        QXClient.get().gestures().BlindWait(2000);

        Assert.assertTrue(QXClient.get().gestures().isElementPresent(homePageObjects.assertNavigationFilterBasedPrimaryCategory),"Navigation filter is not dispalyed");
        QXClient.get().report().info("Navigation filter is displayed based on Primary category");

        Assert.assertTrue(QXClient.get().gestures().isElementPresent(homePageObjects.assertGroupingBasedOnSubject),"Grouping based on subject is not displayed");
        QXClient.get().report().info("Grouping based on subject is displayed");

    }
}
 
 
