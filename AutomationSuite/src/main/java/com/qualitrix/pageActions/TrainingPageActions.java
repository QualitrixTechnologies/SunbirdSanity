package com.qualitrix.pageActions;


import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.touch.offset.PointOption;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.qualitrix.client.QXClient;
import com.qualitrix.pageObjects.ProfileEditPageObjects;
import com.qualitrix.pageObjects.ProfilePageObjects;
import com.qualitrix.pageObjects.TrainingPageObjects;

/**
 * This Class has all the methods related to Training Page.
 *
 * @author : Gurukiran H N
 * @since : 23/March/2020
 */
public class TrainingPageActions  {

   
    TrainingPageObjects trainingPageObjects = new TrainingPageObjects();
    LibraryCourseContentPageActions libcour=new LibraryCourseContentPageActions();
    ProfileEditPageObjects profileEditPageObjects= new ProfileEditPageObjects();


    
    public TrainingPageActions() {
        //    this.driver = ContextManager.getDriver();

           PageFactory.initElements(new AppiumFieldDecorator(QXClient.get().driver()), this);
            PageFactory.initElements(new AppiumFieldDecorator(QXClient.get().driver()), trainingPageObjects);
            PageFactory.initElements(new AppiumFieldDecorator(QXClient.get().driver()), profileEditPageObjects);

        	//PageFactory.initElements(driver,DikshaMainPageObjects.class);

        }
        
    
  

    public void tapOnFilterBtn() {
        QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.filterBtn);
        QXClient.get().report().info("Tap on filter button");
    }

    public void tapOnCancelBtn() {
        QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.cancelBtn);
        QXClient.get().report().info("Tap on search button");
    }

    public void tapOnSelectBtn() {
        QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.selectBtn);
        QXClient.get().report().info("Tap on select button");
    }

    public void tapOnEnrollmentViewAllBtn() {
        QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.selectEnrollmentViewAll);
        QXClient.get().report().info("Tap on enrollment view all button");
    }

    public void tapOnSearchedCopiedCourse() throws Exception {
        QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.copiedCourse);
        QXClient.get().gestures().BlindWait(5000);
        QXClient.get().report().info("Tap on course searched");
    }

    public void tapOnSearchedCourse() throws Exception {
        QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.CourseSearch);
        QXClient.get().gestures().BlindWait(5000);
        QXClient.get().report().info("Tap on course searched");
    }
    public void tapOnSearchedBook() throws Exception {
        QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.BookSearch);
        QXClient.get().report().info("Tap on Book searched");
    }
   
    public void tapOnLatestCourseViewAllBtn() {
    	QXClient.get().gestures().scrollToMobileElement(trainingPageObjects.latestCoursesViewAll, "2");
        QXClient.get().report().info("Tap on latest course view all button");
    }

    public void tapOnOpenBtn() throws Exception {
        QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.openBtn);
        QXClient.get().gestures().BlindWait(5000);
        QXClient.get().report().info("Tap on open button");
    }

    public void tapOnTrainingInfo() {
        QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.trainingInfoObj);
        QXClient.get().report().info("Tap on training information tab");
    }

    public void verifyFilteredCourses() throws Exception {
        QXClient.get().gestures().wait(4);
        Assert.assertTrue(QXClient.get().gestures().isElementPresent(trainingPageObjects.classInfo), "As per Selected class is filtered");
        Assert.assertTrue(QXClient.get().gestures().isElementPresent(trainingPageObjects.subjectInfo), "As per Selected subject is filtered");
        Assert.assertTrue(QXClient.get().gestures().isElementPresent(trainingPageObjects.mediumInfo), "As per Selected medium is filtered");
        QXClient.get().report().info("Verifying filtered courses");
    }

    public void verifyTermsAndCondLink() {
        Assert.assertTrue(QXClient.get().gestures().isElementPresent(trainingPageObjects.termsAndCondLink));
        QXClient.get().report().info("Verifying Terms And Condition link");
    }

    public void tapOnJoinTraining() {
        if (!QXClient.get().gestures().isElementPresent(trainingPageObjects.startNowBtn)) {
            QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.joinTrainingBtn);
           /* if (QXClient.get().gestures().isElementPresent(trainingPageObjects.joinBtn)) {
                QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.joinBtn);
            }*/
            QXClient.get().report().info("Tap on join training");
        }
    }
    public void tapOnJoinTraining2() throws Exception {
    	 QXClient.get().gestures().BlindWait(6000);

    		QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.clkJoinCourseBtn);
    	    QXClient.get().report().info("clicked on joincourse button");
    	    QXClient.get().gestures().BlindWait(2000);
    	   
    	    
    	    try
    	    {
    		if(QXClient.get().gestures().isElementPresent((trainingPageObjects.clkDontShareBtn)));
    		{
    			 QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.clkDontShareBtn);
    		        QXClient.get().report().info("clicked on clkDontShareBtn button");
    		        QXClient.get().gestures().BlindWait(2000);
    			
    		}
    	    }
    	    catch(Exception e3)
    	    {
    	    	System.out.println("handled profile share");
    	    }
    	    
    }
    
    
   
    
    public void taponContinue() {
    	
    	try
    	{
        if (!QXClient.get().gestures().isElementPresent(trainingPageObjects.startNowBtn)) {
            QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.clkContinuew);
           /* if (QXClient.get().gestures().isElementPresent(trainingPageObjects.joinBtn)) {
                QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.joinBtn);
            }*/
            QXClient.get().report().info("Tap on Continuew buttong");
        }}
    	catch(Exception e)
    	{
    		System.out.println("Issue Handled");
    	}
    }
    
    public void taponcoursePDF() {
       
            QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.clkDoneButton);
           /* if (QXClient.get().gestures().isElementPresent(trainingPageObjects.joinBtn)) {
                QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.joinBtn);
            }*/
            QXClient.get().report().info("Tap on Done button");
        }
    


    
    public void tapOnEnrollmentFeaturedViewAllBtn() {
        QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.viewAllFeaturedTraings);
        QXClient.get().report().info("Tap on enrollment Featured view all button");
    }
    
    public void tapOnEnrollmentLatestCourseViewAllBtn() {
        QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.viewAllLatestCourse);
        QXClient.get().report().info("Tap on enrollment Latest view all button");
    }
    
    public void clkFeaturedCourse() {
        QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.clkFeaturedCourse);
        QXClient.get().report().info("Clicked on Featured Course");
    }
    
    public void clkLatestCourse() {
        QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.clkLatestCourse);
        QXClient.get().report().info("Clicked on Latest Course");
    }
    
    public void tapOnBioBtn() {
        QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.bioBtn);
        QXClient.get().report().info("Tap on bio button");
    }
    

    public void clickBackBtn() {
        if (QXClient.get().gestures().isElementPresent(trainingPageObjects.backBtn)) {
            QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.backBtn);
        }
        QXClient.get().report().info("Tap on back button");
    }

    public void tapOnApplyButton() {
        for (int i = 0; i < 5; i++) {
            if (!QXClient.get().gestures().isElementPresent(trainingPageObjects.topicBtn)) {
                tapOnApplyBtn();
                break;
            }
        }
    }

    public void tapOnApplyBtn() {
        QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.applyBtn);
        trainingPageObjects.applyBtn.click();
        QXClient.get().report().info("Tap on search button");
    }

    public void tapOnDownloadBtn() {
        QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.downloadBtn);
        QXClient.get().report().info("Tap on download button");
    }

    public void tapOnDownloadBtnInDownloadPopUp() throws Exception {
        QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.downloadPopUpBtn);
        QXClient.get().report().info("Tap on download button in download popup");
        QXClient.get().gestures().BlindWait(9000);
        
       
    }

    public void verifyFileDownloadThroughNotification() throws Exception {
        QXClient.get().gestures().openNotification();
        Assert.assertTrue(QXClient.get().gestures().isElementPresent(trainingPageObjects.downloadingNotification));
        Assert.assertTrue(QXClient.get().gestures().isElementPresent(trainingPageObjects.downloadsNot));
        QXClient.get().gestures().clkBackButton();
        QXClient.get().report().info("Verifying the file downloaded successfully or not");
    }

    public void waitTillTheDownloadButtonDisappears() {
    	try
    	{
        for (int i = 0; i < 30; i++) {
            if (QXClient.get().gestures().isElementPresent(trainingPageObjects.downloadingObj)) {
                QXClient.get().gestures().wait(20);
            } else {
                Assert.assertFalse(QXClient.get().gestures().isElementPresent(trainingPageObjects.downloadingObj));
                QXClient.get().report().info("The file downloaded successfully");
                break;
            }
        }
    	}
    	catch(Exception e)
    	{
    		System.out.println("Error while downlading");
    	}
    }

    public enum FILTER {
        TOPIC,
        PURPOSE,
        MEDIUM,
        CLASS,
        SUBJECT,
        ORGANIZATION;
    }

    public enum TOPICS {
        SCIENCE,
        SOCIAL_SCIENCE;
    }

    public enum PURPOSE {
        CONCEPTS,
        TEACHING,
        ASSESSMENT,
        COMMUNICATION,
        CURRICULUM;
    }

    public enum MEDIUM {
        TELUGU,
        ENGLISH,
        ASSAMESE,
        HINDI,
        KONKANI,
        GUJARATHI;
    }

    public enum CLASS {
        CLASS_1,
        CLASS_2;
    }

    public enum SUBJECT {
        CHEMISTRY,
        PHYSICS,
        BIOLOGY;
    }

    public enum ORGANIZATION {
        KERALA_STATE,
        PUNJAB,
        RAJASTHAN;
    }

    public void tapOnFilterCategories(FILTER filter) {
        switch (filter) {
            case TOPIC:
                QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.topicBtn);
                QXClient.get().report().info("Tap on topic");
                break;
            case PURPOSE:
                QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.purposeBtn);
                QXClient.get().report().info("Tap on purpose");
                break;
            case MEDIUM:
                QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.mediumBtn);
                QXClient.get().report().info("Tap on medium");
                break;
            case CLASS:
                QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.classBtn);
                QXClient.get().report().info("Tap on class");
                break;
            case SUBJECT:
                QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.subjectBtn);
                QXClient.get().report().info("Tap on subject");
                break;
            case ORGANIZATION:
                QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.orgBtn);
                QXClient.get().report().info("Tap on organization");
                break;
        }
    }

    public void selectTopic(TOPICS topics) throws Exception {
        switch (topics) {
            case SCIENCE:
                QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.scienceBtn);
                QXClient.get().gestures().wait(2);
                QXClient.get().report().info("Tap on science");
                break;
            case SOCIAL_SCIENCE:
                QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.socialScienceBtn);
                QXClient.get().gestures().wait(2);
                QXClient.get().report().info("Tap on social science");
                break;
        }
    }

    public void selectPurpose(PURPOSE purpose) throws Exception {
        switch (purpose) {
            case CONCEPTS:
                QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.conceptsBtn);
                QXClient.get().gestures().swipeUp();
                QXClient.get().gestures().wait(2);
                QXClient.get().report().info("Tap on concepts");
                break;
            case TEACHING:
                QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.tchngBtn);
                QXClient.get().gestures().swipeUp();
                QXClient.get().gestures().wait(2);
                QXClient.get().report().info("Tap on teaching");
                break;
            case ASSESSMENT:
                QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.assessmentBtn);
                QXClient.get().gestures().swipeUp();
                QXClient.get().gestures().wait(2);
                QXClient.get().report().info("Tap on assessment");
                break;
            case COMMUNICATION:
                QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.communicationBtn);
                QXClient.get().gestures().swipeUp();
                QXClient.get().gestures().wait(2);
                QXClient.get().report().info("Tap on communication");
                break;
            case CURRICULUM:
                QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.curriculumBtn);
                QXClient.get().gestures().swipeUp();
                QXClient.get().gestures().wait(2);
                QXClient.get().report().info("Tap on curriculum");
                break;
        }
    }

    public void selectMedium(MEDIUM medium) throws Exception {
        switch (medium) {
            case TELUGU:
                QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.teluguMdmObj);
                QXClient.get().gestures().swipeUp();
                QXClient.get().gestures().wait(2);
                QXClient.get().report().info("Tap on Telugu");
                break;
            case ENGLISH:
                QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.englishMdmObj);
                QXClient.get().gestures().swipeUp();
                QXClient.get().gestures().wait(2);
                QXClient.get().report().info("Tap on English");
                break;
            case ASSAMESE:
                QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.assameseMdmObj);
                QXClient.get().gestures().swipeUp();
                QXClient.get().gestures().wait(2);
                QXClient.get().report().info("Tap on Assamese");
                break;
            case HINDI:
                QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.hindiMdmObj);
                QXClient.get().gestures().swipeUp();
                QXClient.get().gestures().wait(2);
                QXClient.get().report().info("Tap on Hindi");
                break;
            case KONKANI:
                QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.konkaniMdmObj);
                QXClient.get().gestures().swipeUp();
                QXClient.get().gestures().wait(2);
                QXClient.get().report().info("Tap on Konkani");
                break;
            case GUJARATHI:
                QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.gujaratiMdmObj);
                QXClient.get().gestures().swipeUp();
                QXClient.get().gestures().wait(2);
                QXClient.get().report().info("Tap on Gujarati");
                break;
        }
    }

    public void selectClass(CLASS cls) throws Exception {
        switch (cls) {
            case CLASS_1:
                QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.classOneObj);
                QXClient.get().gestures().swipeUp();
                QXClient.get().gestures().wait(2);
                QXClient.get().report().info("Tap on class one");
                break;
            case CLASS_2:
                QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.classTwoObj);
                QXClient.get().gestures().swipeUp();
                QXClient.get().gestures().wait(2);
                QXClient.get().report().info("Tap on class two");
                break;
        }
    }

    public void selectSubject(SUBJECT subject) throws Exception {
        switch (subject) {
            case CHEMISTRY:
                QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.chemistryObj);
                QXClient.get().gestures().swipeUp();
                QXClient.get().gestures().wait(2);
                QXClient.get().report().info("Tap on chemistry");
                break;
            case PHYSICS:
                QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.physicsObj);
                QXClient.get().gestures().swipeUp();
                QXClient.get().gestures().wait(2);
                QXClient.get().report().info("Tap on physics");
                break;
            case BIOLOGY:
                QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.biologyObj);
                QXClient.get().gestures().swipeUp();
                QXClient.get().gestures().wait(2);
                QXClient.get().report().info("Tap on biology");
                break;
        }
    }

    public void selectOrganization(ORGANIZATION organization) {
        switch (organization) {
            case KERALA_STATE:
                QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.keralaStateObj);
                QXClient.get().gestures().swipeUp();
                QXClient.get().report().info("Tap on Kerala state");
                break;
            case PUNJAB:
                QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.punjabObj);
                QXClient.get().gestures().swipeUp();
                QXClient.get().report().info("Tap on Punjab state");
                break;
            case RAJASTHAN:
                QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.rajasthanObj);
                QXClient.get().gestures().swipeUp();
                QXClient.get().report().info("Tap on Rajasthan state");
                break;
        }
    }

    public void scrollUp(int j) {
        for (int i = 1; i <= j; i++) {
        	QXClient.get().gestures().swipeUp();
        }
    }

    public void verifyCreditAndLicenseUI() {
      //  Assert.assertTrue(QXClient.get().gestures().isElementPresent(trainingPageObjects.authorObj), "Author info is displayed");
        Assert.assertTrue(QXClient.get().gestures().isElementPresent(trainingPageObjects.publishObj), "Published by info is displayed");
       // Assert.assertTrue(QXClient.get().gestures().isElementPresent(trainingPageObjects.attributionObj), "Attribution info is displayed");
        Assert.assertTrue(QXClient.get().gestures().isElementPresent(trainingPageObjects.licenseTermsObj), "License terms info is displayed");
        Assert.assertTrue(QXClient.get().gestures().isElementPresent(trainingPageObjects.copyRightObj), "Copyright info is displayed");
        QXClient.get().report().info("Verifying credit and license UI");
    }

    public void verifyCourseTOC() {
        Assert.assertTrue(QXClient.get().gestures().isElementPresent(trainingPageObjects.trashDelete), "Trash delete button is displayed");
        Assert.assertTrue(QXClient.get().gestures().isElementPresent(trainingPageObjects.shareBtn), "Share button is displayed");
        Assert.assertTrue(QXClient.get().gestures().isElementPresent(trainingPageObjects.startNowBtn), "Start now button is displayed");
        Assert.assertTrue(QXClient.get().gestures().isElementPresent(trainingPageObjects.trainingInfoObj), "Training information tab is displayed");
        Assert.assertTrue(QXClient.get().gestures().isElementPresent(trainingPageObjects.trainingModuleObj), "Training module tab is displayed");
      //  Assert.assertTrue(QXClient.get().gestures().isElementPresent(trainingPageObjects.arrowUp), "Arrow button is displayed");
        //Assert.assertTrue(QXClient.get().gestures().isElementPresent(trainingPageObjects.menuIcon), "Menu icon is displayed");
        Assert.assertTrue(QXClient.get().gestures().isElementPresent(trainingPageObjects.progressBar), "Progress bar is displayed");
        QXClient.get().report().info("Verifying course TOC, all units and content inside course");
    }

    public void verifyCourseUI() {
        Assert.assertTrue(QXClient.get().gestures().isElementPresent(trainingPageObjects.shareBtn), "Share button is displayed");
      //  Assert.assertTrue(QXClient.get().gestures().isElementPresent(trainingPageObjects.startNowBtn), "Start now button is displayed");
       
        QXClient.get().report().info("Verifying course UI");
    }

    public void clkStartNowAndPlayContent() throws Exception {
       
    	QXClient.get().gestures().wait(5);
        QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.startNowBtn);
        QXClient.get().report().info("Clicked on StartNow");
        QXClient.get().gestures().wait(5);
               
        libcour.tapOnPlayIcon();
        QXClient.get().gestures().wait(5);
        QXClient.get().gestures().clkBackButton();
        QXClient.get().report().info("Clicked on Back button");

        libcour.tapOnOKbtn();
        QXClient.get().report().info("Clicked on Ok button");

        QXClient.get().gestures().clkBackButton();
        QXClient.get().report().info("again click on Back button");

      
        
        
        
        
         }
    
    public void verifyTrainingPageContents() {
        Assert.assertTrue(QXClient.get().gestures().isElementPresent(trainingPageObjects.filterBtn), "Notification icon is displayed");
        Assert.assertTrue(QXClient.get().gestures().isElementPresent(trainingPageObjects.searchBtn), "Search icon is displayed");
        Assert.assertTrue(QXClient.get().gestures().isElementPresent(trainingPageObjects.featuredTrainingViewAll), "Featured training view all option is displayed");
        Assert.assertTrue(QXClient.get().gestures().isElementPresent(trainingPageObjects.latestCoursesViewAll), "Latest course view all option is displayed");
        QXClient.get().report().info("Verifying training page contents");
    }
    
    public void tapOnSearchedResource() throws Exception {
        QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.ResourceSearch);
      //  QXClient.get().gestures().wait(7);
        QXClient.get().report().info("Tap on searched Resource");
    }
    public void leaveCourse() throws Exception {

        QXClient.get().gestures().BlindWait(7000);
            QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.sltCourseMenuIcon);
            QXClient.get().report().info("Click on CourseMenuIcon");
            QXClient.get().gestures().BlindWait(4000);
            QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.clkLeaveCourse);
            QXClient.get().report().info("Click on Leave Course");
        	QXClient.get().gestures().BlindWait(4000);

            QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.clkConfirmButton);
            QXClient.get().report().info("Click on Confirm Button");
        	QXClient.get().gestures().BlindWait(7000);

            Assert.assertTrue(QXClient.get().gestures().isElementPresent(trainingPageObjects.joinTrainingBtn), "joinTrainingBtn icon is displayed");
            QXClient.get().report().info("Leave course done succesfuly");
       
    }
    public void tapOnSearchedPDF() throws Exception {
    	QXClient.get().gestures().BlindWait(2000);
        QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.PDFSearch);
        QXClient.get().report().info("Tap on searched PDFSearch");
    	QXClient.get().gestures().BlindWait(8000);

    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public void tapOnOngoingCourse() {
    	QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.ongoingCourse);
        QXClient.get().report().info("Tap on Ongoing course");
    }

  
    public void tapOnCompletedCourse() {
    	QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.completedCourse);
        QXClient.get().report().info("Tap on completed course");
    }

    public void viewCompleteMessage() {
    	QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.completedMessage);
        Assert.assertTrue(QXClient.get().gestures().isElementPresent(trainingPageObjects.completedMessage),"You have successfully completed this course");
        QXClient.get().report().info("Verifying completed message");
    }
    
 

    public void consumCourseContentOld() throws Exception {
    	
    	
        QXClient.get().gestures().BlindWait(6000);

    	QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.clkJoinCourseBtn);
        QXClient.get().report().info("clicked on joincourse button");
        QXClient.get().gestures().BlindWait(2000);
       
        
        try
        {
    	if(QXClient.get().gestures().isElementPresent((trainingPageObjects.clkDontShareBtn)));
    	{
    		 QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.clkDontShareBtn);
    	        QXClient.get().report().info("clicked on clkDontShareBtn button");
    	        QXClient.get().gestures().BlindWait(2000);
    		
    	}
        }
        catch(Exception e3)
        {
        	System.out.println("handled profile share");
        }
        LibraryCourseContentPageActions library=new LibraryCourseContentPageActions();
        TrainingPageActions training=new TrainingPageActions();
        
        library.tapOnDownloadBtn();
        training.tapOnDownloadBtnInDownloadPopUp();
        //getTrainingPageActions().verifyFileDownloadThroughNotification();
   //     training.waitTillTheDownloadButtonDisappears();

        
        QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.clkStartLearning);
        QXClient.get().report().info("clicked on clkStartLearning button");

      
        
        QXClient.get().gestures().BlindWait(7000);
       

        
        QXClient.get().gestures().tocuh();

        
        QXClient.get().gestures().BlindWait(5000);

        QXClient.get().gestures().clkBackButton();
        QXClient.get().gestures().BlindWait(1000);
        QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.clkOkToCancel);
        QXClient.get().report().info("clicked on OK button to cancel");
        QXClient.get().gestures().BlindWait(2000);

        
        try
        {
        libcour.tapOnStarIcon();
        libcour.giveFeedbackAndSubmit("toast");
        }
        catch(Exception e4)
        {
        	System.out.println("hanled feedback");
        }
        QXClient.get().gestures().BlindWait(3000);
        
        Assert.assertTrue(QXClient.get().gestures().isElementPresent(trainingPageObjects.verify50PercentProgress),"You have successfully verify50PercentProgress completed this course");
        QXClient.get().report().info("Verifying verify50PercentProgress message");
        
        
        QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.clkContinueLearning);
        QXClient.get().report().info("clicked on clkContinueLearning button");
        QXClient.get().gestures().BlindWait(7000);
        QXClient.get().gestures().BlindWait(3000);

        QXClient.get().gestures().clkBackButton();
        QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.clkOkToCancel);
        QXClient.get().report().info("clicked on OK button to cancel");
        QXClient.get().gestures().BlindWait(2000);

        libcour.tapOnStarIcon();
        libcour.giveFeedbackAndSubmit("toast");
        QXClient.get().gestures().BlindWait(4000);

        Assert.assertTrue(QXClient.get().gestures().isElementPresent(trainingPageObjects.verifyCompletedMsg),"You have successfully verifyCompletedMsg completed this course");
        QXClient.get().report().info("Verifying verifyCompletedMsg message");
    }
    
 
    public void taponCourseButton() {
        QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.tapCoureBtn);
        QXClient.get().report().info("Tap on tapCoureBtn button");
    }

    
    public void consumCourseContent() throws Exception {
        QXClient.get().gestures().BlindWait(6000);
       QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.clkJoinCourseBtn);
        QXClient.get().report().info("clicked on joincourse button");
        QXClient.get().gestures().BlindWait(2000);
        try
        {
       if(QXClient.get().gestures().isElementPresent((trainingPageObjects.clkDontShareBtn)));
       {
           QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.clkDontShareBtn);
               QXClient.get().report().info("clicked on clkDontShareBtn button");
               QXClient.get().gestures().BlindWait(2000);
       }
        }
        catch(Exception e3)
        {
           System.out.println("handled profile share");
        }
        LibraryCourseContentPageActions library=new LibraryCourseContentPageActions();
        TrainingPageActions training=new TrainingPageActions();
        if(QXClient.get().gestures().isElementPresent(trainingPageObjects.tenSecVideoText)){
          //library.tapOnDownloadBtn();
            QXClient.get().gestures().BlindWait(2000);
        }else{
            QXClient.get().gestures().clkBackButton();
            QXClient.get().gestures().BlindWait(3000);
            QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.courseContent2);
            QXClient.get().gestures().BlindWait(6000);
            QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.clkJoinCourseBtn);
            QXClient.get().report().info("clicked on joincourse button");
            QXClient.get().gestures().BlindWait(2000);
            try
            {
                if(QXClient.get().gestures().isElementPresent((trainingPageObjects.clkDontShareBtn)));
                {
                    QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.clkDontShareBtn);
                    QXClient.get().report().info("clicked on clkDontShareBtn button");
                    QXClient.get().gestures().BlindWait(2000);
                }
            }
            catch(Exception e3)
            {
                System.out.println("handled profile share");
            }
          //  library.tapOnDownloadBtn();
        }
        //library.tapOnDownloadBtn();
        //training.tapOnDownloadBtnInDownloadPopUp();
        //getTrainingPageActions().verifyFileDownloadThroughNotification();
        // training.waitTillTheDownloadButtonDisappears();
        QXClient.get().gestures().BlindWait(3000);
        QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.clkStartLearning);
        QXClient.get().report().info("clicked on clkStartLearning button");
        QXClient.get().gestures().BlindWait(7000);
        QXClient.get().gestures().tocuh();
        QXClient.get().gestures().BlindWait(5000);
        QXClient.get().gestures().clkBackButton();
        QXClient.get().gestures().BlindWait(1000);
        QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.clkOkToCancel);
        QXClient.get().report().info("clicked on OK button to cancel");
        QXClient.get().gestures().BlindWait(9000);
       /* try
        {
        libcour.tapOnStarIcon();
        libcour.giveFeedbackAndSubmit("toast");
        }
        catch(Exception e4)
        {
           System.out.println("hanled feedback");
        }*/
        QXClient.get().gestures().BlindWait(9000);
        Assert.assertTrue(QXClient.get().gestures().isElementPresent(trainingPageObjects.verify50PercentProgress),"You have successfully verify50PercentProgress completed this course");
        QXClient.get().report().info("Verifying verify50PercentProgress message");
       QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.clkContinueLearning);
        QXClient.get().report().info("clicked on clkContinueLearning button");
        QXClient.get().gestures().BlindWait(7000);
        QXClient.get().gestures().BlindWait(9000);
        QXClient.get().gestures().BlindWait(9000);
        QXClient.get().gestures().clkBackButton();
        QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.clkOkToCancel);
        QXClient.get().report().info("clicked on OK button to cancel");
        QXClient.get().gestures().BlindWait(2000);
        QXClient.get().gestures().BlindWait(5000);
      // libcour.tapOnStarIcon();
      // libcour.giveFeedbackAndSubmit("toast");
    }
    public void verifyCourseCompletedMsg() throws Exception{
        QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.courseContentVerification);
        QXClient.get().gestures().BlindWait(3000);
        Assert.assertTrue(QXClient.get().gestures().isElementPresent(trainingPageObjects.verifyCompletedMsg),"You have successfully verifyCompletedMsg completed this course");
        QXClient.get().report().info("Verifying verifyCompletedMsg message");
    }
    
    
    public void onGoingCourseVerification() throws Exception{
        QXClient.get().gestures().BlindWait(3000);
        Assert.assertTrue((QXClient.get().gestures().isElementPresent(profileEditPageObjects.myLearningtext)),"My learning content is not visisble");
        QXClient.get().gestures().BlindWait(3000);
        Assert.assertTrue((QXClient.get().gestures().isElementPresent(profileEditPageObjects.onGoingCourse)),"Course is not visible");
        QXClient.get().gestures().waitAndClickElementisVisible(profileEditPageObjects.onGoingCourse);
        QXClient.get().gestures().BlindWait(9000);
       // QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.clkContinueLearning);
       // QXClient.get().report().info("clicked on clkContinueLearning button");
        QXClient.get().gestures().BlindWait(7000);
        //QXClient.get().gestures().clkBackButton();
       // QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.clkOkToCancel);
       //
        // QXClient.get().report().info("clicked on OK button to cancel");
        QXClient.get().gestures().BlindWait(5000);
    }
    public void completedCourseInProfile() throws Exception{
        QXClient.get().gestures().BlindWait(3000);
       // Assert.assertTrue((QXClient.get().gestures().isElementPresent(profileEditPageObjects.myLearningtext)),"My learning content is not visisble");
        QXClient.get().gestures().waitAndClickElementisVisible(profileEditPageObjects.refreshCircle);
        QXClient.get().gestures().BlindWait(3000);
        QXClient.get().gestures().waitAndClickElementisVisible(profileEditPageObjects.refreshCircle);
        QXClient.get().gestures().BlindWait(3000);
        QXClient.get().gestures().waitAndClickElementisVisible(profileEditPageObjects.refreshCircle);
        QXClient.get().gestures().BlindWait(3000);
        Assert.assertTrue((QXClient.get().gestures().isElementPresent(profileEditPageObjects.completeCourse)),"Course still in ongoing");
    }
    
    public void verifyContentForAlternativeBoard() throws  Exception{
        QXClient.get().gestures().BlindWait(3000);

        QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.filterBtn);
        QXClient.get().report().info("Clicked on filter button");
        QXClient.get().gestures().BlindWait(5000);

        Assert.assertTrue(QXClient.get().gestures().isElementPresent(trainingPageObjects.boardFilter),"Board filter is not available");
        QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.boardFilter);
        QXClient.get().report().info("Clicked on Board filter");

        QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.cbseBoard);
        QXClient.get().report().info("Clicked on CBSE alternative board for the content");

        QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.clkConfirmButton);
        QXClient.get().report().info("Clicked on Confirm button");
        QXClient.get().gestures().BlindWait(3000);

        QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.applyFilterBtn);
        QXClient.get().report().info("Clicked on apply filter button");

    }
    public void verifyAlternativeBoardForTheSearchedContent() throws Exception{
        QXClient.get().gestures().BlindWait(3000);

        Assert.assertTrue(QXClient.get().gestures().isElementPresent(trainingPageObjects.verifyContentForAlternativeBoard),"Content for alternative board in not available");
        QXClient.get().report().info("Content searched for alternative board is matched");

    }
    
    public void verifyFunctionalityOfNexPrevWhileConsumingPdfContent() throws Exception{
        QXClient.get().gestures().BlindWait(3000);

        QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.clkPdfContent);
        QXClient.get().report().info("Clicked on pdf content");
        QXClient.get().gestures().BlindWait(3000);

        Assert.assertTrue(QXClient.get().gestures().isElementPresent(trainingPageObjects.playPdfIcon),"Play icon is not visible");
        QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.playPdfIcon);
        QXClient.get().report().info("Clicked on PDF content to play");
        QXClient.get().gestures().BlindWait(3000);

        Assert.assertTrue(QXClient.get().gestures().isElementPresent(trainingPageObjects.pdfHambergerIcon),"Hamburger icon is not present");
        Assert.assertTrue(QXClient.get().gestures().isElementPresent(trainingPageObjects.clkNextIcon),"Next icon is not visible");
        Assert.assertTrue(QXClient.get().gestures().isElementPresent(trainingPageObjects.clkPreviousIcon),"Previous icon is not visible");

        QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.clkNextIcon);
        QXClient.get().report().info("Clicked on next icon");
        QXClient.get().gestures().BlindWait(2000);

        QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.clkPreviousIcon);
        QXClient.get().report().info("Clicked on previous icon");
        QXClient.get().gestures().BlindWait(3000);

    }

    public void verifyHambergerMenuOptionsWhileContentConsuming() throws Exception{
        QXClient.get().gestures().BlindWait(3000);

        QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.pdfHambergerIcon);
        QXClient.get().report().info("Clicked on Hamberger Icon in Content");
        QXClient.get().gestures().BlindWait(2000);

        Assert.assertTrue(QXClient.get().gestures().isElementPresent(trainingPageObjects.shareButton),"Share button is not visible");
        Assert.assertTrue(QXClient.get().gestures().isElementPresent(trainingPageObjects.downloadButton),"Download button is not visible");
        Assert.assertTrue(QXClient.get().gestures().isElementPresent(trainingPageObjects.printButton),"Print Button is not visible");
        Assert.assertTrue(QXClient.get().gestures().isElementPresent(trainingPageObjects.exitButton),"Exit button is not visible");

        QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.exitButton);
        QXClient.get().report().info("Clicked on exit button");
        QXClient.get().gestures().BlindWait(3000);

        QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.closeRatingIcon);
        QXClient.get().report().info("Clicked on close Rating popup");
        QXClient.get().gestures().BlindWait(3000);

    }

    public void verifyContentAfterConsumingCompletely() throws  Exception{
        QXClient.get().gestures().BlindWait(2000);

        QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.playPdfIcon);
        QXClient.get().report().info("Clicked on pdf play");
        QXClient.get().gestures().BlindWait(3000);

        QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.clkNextIcon);
        QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.clkNextIcon);
        QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.clkNextIcon);
        QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.clkNextIcon);
        QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.clkNextIcon);
        QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.clkNextIcon);
        QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.clkNextIcon);
        QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.clkNextIcon);
        QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.clkNextIcon);

        QXClient.get().report().info("Clicked on next icon");
        QXClient.get().gestures().BlindWait(5000);

        Assert.assertTrue(QXClient.get().gestures().isElementPresent(trainingPageObjects.contentCompletedText),"You just completed messaged is not visible");
        Assert.assertTrue(QXClient.get().gestures().isElementPresent(trainingPageObjects.userName),"User is not visible");

        Assert.assertTrue(QXClient.get().gestures().isElementPresent(trainingPageObjects.contentName),"Content name is not visible");

        String contentName= trainingPageObjects.contentName.getText();
        System.out.println("Content Name is : "+ contentName);

        Assert.assertTrue(QXClient.get().gestures().isElementPresent(trainingPageObjects.timeTakenToCompleteContent),"Time taken is not visible");

        Assert.assertTrue(QXClient.get().gestures().isElementPresent(trainingPageObjects.replayButton),"Replay button is not visible");
        Assert.assertTrue(QXClient.get().gestures().isElementPresent(trainingPageObjects.exitButton2),"Exit button is not visible");

        QXClient.get().report().info("User,content,time taken,replay and exit button are displayed");

        QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.exitButton2);
        QXClient.get().report().info("Clicked on exit button");
        QXClient.get().gestures().BlindWait(3000);
    }

    public void updateRating() throws Exception{
        QXClient.get().gestures().BlindWait(3000);

       QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.updateRatingStar);
       QXClient.get().report().info("Clicked on update ratings");
       QXClient.get().gestures().BlindWait(3000);

       Assert.assertTrue(QXClient.get().gestures().isElementPresent(trainingPageObjects.veryBadRating),"Rating is not available");

    }
    
    
    public void playContentAndDownloadContent() throws Exception{
        QXClient.get().gestures().BlindWait(3000);

        QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.clkPdfContent);
        QXClient.get().report().info("Clicked on pdf content");
        QXClient.get().gestures().BlindWait(3000);

        Assert.assertTrue(QXClient.get().gestures().isElementPresent(trainingPageObjects.playPdfIcon),"Play icon is not visible");
        QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.playPdfIcon);
        QXClient.get().report().info("Clicked on PDF content to play");
        QXClient.get().gestures().BlindWait(3000);

        QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.clkNextIcon);
        QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.clkNextIcon);

        QXClient.get().gestures().clkBackButton();

        QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.clkOkToCancel);

        QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.closeRatingIcon);
        QXClient.get().report().info("Clicked on close Rating popup");
        QXClient.get().gestures().BlindWait(3000);

        QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.clkDownloadContent);
        QXClient.get().report().info("Clicked on download content");
        QXClient.get().gestures().BlindWait(2000);

        QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.clkDownloadBtn);
        QXClient.get().report().info("Clicked on download button");
        QXClient.get().gestures().BlindWait(9000);

    }
    public void verifyDownloadedContent()throws Exception{
        QXClient.get().gestures().BlindWait(3000);

        Assert.assertTrue(QXClient.get().gestures().isElementPresent(trainingPageObjects.downloadedContent),"Downloaded content is not visible");
        QXClient.get().report().info("Downloaded content is visible");
        QXClient.get().gestures().BlindWait(3000);
    }
    public void verifyForumIconAfterUserJoinTheCourse() throws Exception{
        QXClient.get().gestures().BlindWait(6000);
        QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.clkJoinCourseBtn);
        QXClient.get().report().info("clicked on joincourse button");
        QXClient.get().gestures().BlindWait(2000);
        try
        {
            if(QXClient.get().gestures().isElementPresent((trainingPageObjects.clkDontShareBtn)));
            {
                QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.clkDontShareBtn);
                QXClient.get().report().info("clicked on clkDontShareBtn button");
                QXClient.get().gestures().BlindWait(2000);
            }
        }
        catch(Exception e3)
        {
            System.out.println("handled profile share");
        }

        if(QXClient.get().gestures().isElementPresent(trainingPageObjects.hindiText)){
            QXClient.get().gestures().BlindWait(2000);
        }else{
            QXClient.get().gestures().clkBackButton();
            QXClient.get().gestures().BlindWait(3000);
            QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.courseContent2);
            QXClient.get().gestures().BlindWait(6000);
            QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.clkJoinCourseBtn);
            QXClient.get().report().info("clicked on joincourse button");
            QXClient.get().gestures().BlindWait(2000);
            try
            {
                if(QXClient.get().gestures().isElementPresent((trainingPageObjects.clkDontShareBtn)));
                {
                    QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.clkDontShareBtn);
                    QXClient.get().report().info("clicked on clkDontShareBtn button");
                    QXClient.get().gestures().BlindWait(2000);
                }
            }
            catch(Exception e3)
            {
                System.out.println("handled profile share");
            }
        }

        Assert.assertTrue(QXClient.get().gestures().isElementPresent(trainingPageObjects.forumIcon),"Forum Icon is not displayed");
        QXClient.get().report().info("Forum Icon is displayed after user joins the course");
    }
    
    
    public void verifyConsumeCourseAfterJoinCourse() throws Exception{
        QXClient.get().gestures().BlindWait(3000);

        Assert.assertTrue(QXClient.get().gestures().isElementPresent(trainingPageObjects.clkJoinCourseBtn),"Join course button is not displayed");
        QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.clkJoinCourseBtn);
        QXClient.get().report().info("Clicked on Join course button");
        QXClient.get().gestures().BlindWait(2000);

        try
        {
            if(QXClient.get().gestures().isElementPresent((trainingPageObjects.clkDontShareBtn)));
            {
                QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.clkDontShareBtn);
                QXClient.get().report().info("clicked on clkDontShareBtn button");
                QXClient.get().gestures().BlindWait(2000);
            }
        }
        catch(Exception e3)
        {
            System.out.println("handled profile share");
        }

        Assert.assertTrue(QXClient.get().gestures().isElementPresent(trainingPageObjects.clkStartLearning),"Start learning button is not displayed");
        QXClient.get().report().info("Start learning button is displayed and user able to consume the course");


    }
    
    public void verifyCertificateDetailsBeforeJoinCourse() throws Exception{
        QXClient.get().gestures().BlindWait(3000);

        Assert.assertTrue(QXClient.get().gestures().isElementPresent(trainingPageObjects.clkJoinCourseBtn),"Join course button is not displayed");
        QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.clkCourseDetails);
        QXClient.get().report().info("Clicked on course details in course page");
        QXClient.get().gestures().BlindWait(3000);

        if(QXClient.get().gestures().isElementPresent(trainingPageObjects.viewCertificateMsg)){
            QXClient.get().report().info("Certificate message is present before join the course");
        }
        else{
            QXClient.get().report().info("Certificate message is not displayed under course details");
        }
    }
    
    
    public void verifyCertificateDetailsAfterJoinCourse() throws Exception{
        QXClient.get().gestures().BlindWait(3000);

        Assert.assertTrue(QXClient.get().gestures().isElementPresent(trainingPageObjects.clkJoinCourseBtn),"Join course button is not displayed");
        QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.clkJoinCourseBtn);
        QXClient.get().report().info("Clicked on Join course button");
        QXClient.get().gestures().BlindWait(2000);

        try
        {
            if(QXClient.get().gestures().isElementPresent((trainingPageObjects.clkDontShareBtn)));
            {
                QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.clkDontShareBtn);
                QXClient.get().report().info("clicked on clkDontShareBtn button");
                QXClient.get().gestures().BlindWait(2000);
            }
        }
        catch(Exception e3)
        {
            System.out.println("handled profile share");
        }

        QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.clkCourseDetails);
        QXClient.get().report().info("Clicked on course details");
        QXClient.get().gestures().BlindWait(3000);

        Assert.assertTrue(QXClient.get().gestures().isElementPresent(trainingPageObjects.viewCertificateMsg),"Certificate message is not displayed");
        QXClient.get().report().info("Certificate message is displayed");

    }


    public void consumeSmallCourse() throws Exception{
        QXClient.get().gestures().BlindWait(3000);

        Assert.assertTrue(QXClient.get().gestures().isElementPresent(trainingPageObjects.clkStartLearning),"start learning button is not displayed");
        QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.clkStartLearning);
        QXClient.get().report().info("Clicked on start learning button");
        QXClient.get().gestures().BlindWait(3000);

        QXClient.get().gestures().BlindWait(6000);

        QXClient.get().gestures().clkBackButton();

        QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.clkOkToCancel);
        QXClient.get().report().info("Clicked on OK button to cancel");
        QXClient.get().gestures().BlindWait(3000);

    }
    public void verifyCourseCompletedMsgWithoutCertificate() throws Exception{

        QXClient.get().gestures().BlindWait(3000);
        Assert.assertTrue(QXClient.get().gestures().isElementPresent(trainingPageObjects.clkJoinCourseBtn),"Join Course Button is not visible");
        QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.clkJoinCourseBtn);
        QXClient.get().report().info("Clicked on join course");
        QXClient.get().gestures().BlindWait(3000);

        try
        {
            if(QXClient.get().gestures().isElementPresent((trainingPageObjects.clkDontShareBtn)));
            {
                QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.clkDontShareBtn);
                QXClient.get().report().info("clicked on clkDontShareBtn button");
                QXClient.get().gestures().BlindWait(2000);

            }
        }
        catch(Exception e3)
        {
            System.out.println("handled profile share");
        }

        QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.clkStartLearning);
        QXClient.get().gestures().BlindWait(2000);

        QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.playPdfIcon);
        QXClient.get().gestures().BlindWait(3000);

        QXClient.get().gestures().BlindWait(4000);
        QXClient.get().gestures().clkBackButton();

        QXClient.get().gestures().BlindWait(1000);
        QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.clkOkToCancel);

       // QXClient.get().gestures().clkBackButton();
        QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.closeRatingIcon);
        QXClient.get().gestures().BlindWait(2000);

        Assert.assertTrue(QXClient.get().gestures().isElementPresent(trainingPageObjects.congratulationsMsg),"Congratulations message is not displayed");
        Assert.assertTrue(QXClient.get().gestures().isElementPresent(trainingPageObjects.courseCompletedMsg),"Course completed message is not displayed");
        Assert.assertTrue(QXClient.get().gestures().isElementPresent(trainingPageObjects.noCertificateMsg),"Course is not attached certificate message is not displayed");
    }
 
    
    public void verifyCoursesBasedOnSubject() throws  Exception {
        QXClient.get().gestures().BlindWait(3000);

        Assert.assertTrue(QXClient.get().gestures().isElementPresent(trainingPageObjects.accountancySubject),"Accountancy subject is not displayed");
        QXClient.get().report().info("Accountancy subject is displayed in courses section");
        QXClient.get().gestures().BlindWait(2000);

        Assert.assertTrue(QXClient.get().gestures().isElementPresent(trainingPageObjects.courseUnderSubject1),"Course under the subject is not displayed");
        QXClient.get().report().info("Course Under the subject is displayed");
        QXClient.get().gestures().BlindWait(2000);

        /*Assert.assertTrue(QXClient.get().gestures().isElementPresent(trainingPageObjects.assameseSubject),"Assamese subject is not displayed");
        QXClient.get().report().info("Assamese subject is not displayed under courses section");
        QXClient.get().gestures().BlindWait(2000);

        Assert.assertTrue(QXClient.get().gestures().isElementPresent(trainingPageObjects.courseUnderSubject2),"Course is not displayed");
        QXClient.get().report().info("Course is displayed under the subject");*/
        QXClient.get().gestures().BlindWait(2000);

        QXClient.get().gestures().swipeUp();
        QXClient.get().gestures().swipeUp();
        QXClient.get().gestures().swipeUp();
        QXClient.get().gestures().swipeUp();
        QXClient.get().gestures().swipeUp();
        QXClient.get().gestures().swipeUp();
        QXClient.get().gestures().swipeUp();
        QXClient.get().gestures().swipeUp();
        QXClient.get().gestures().swipeUp();
        QXClient.get().gestures().swipeUp();
        QXClient.get().gestures().swipeUp();
        QXClient.get().gestures().swipeUp();
        QXClient.get().gestures().swipeUp();
        QXClient.get().gestures().swipeUp();
        QXClient.get().gestures().swipeUp();
        QXClient.get().gestures().swipeUp();
       // QXClient.get().gestures().scrollToMobileElement(trainingPageObjects.othersSection,"15");

        QXClient.get().gestures().BlindWait(3000);
        Assert.assertTrue(QXClient.get().gestures().isElementPresent(trainingPageObjects.othersSection),"Others section is not displayed");
        QXClient.get().report().info("Other sections is displayed");
        QXClient.get().gestures().BlindWait(2000);

        Assert.assertTrue(QXClient.get().gestures().isElementPresent(trainingPageObjects.courseUnderOthers),"Course under ohter section is not displayed");
        QXClient.get().report().info("Course is displayed under others section");
        QXClient.get().gestures().BlindWait(3000);
    }

    public void verifyContentForAllMediaTypeFilter() throws Exception{
        QXClient.get().gestures().BlindWait(3000);

        QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.filterBtn);
        QXClient.get().report().info("Clicked on filter button");
        QXClient.get().gestures().BlindWait(5000);

        Assert.assertTrue(QXClient.get().gestures().isElementPresent(trainingPageObjects.assertFilterBy),"Filter By is not available");
        Assert.assertTrue(QXClient.get().gestures().isElementPresent(trainingPageObjects.assertResetBtn),"Reset Button is not available");

        Assert.assertTrue(QXClient.get().gestures().isElementPresent(trainingPageObjects.clkMediaTypeFilter),"MediaType filter is not available");
        QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.clkMediaTypeFilter);
        QXClient.get().report().info("Clicked on Media Type filter");

        QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.clkAllMediaTypeFilter);
        QXClient.get().report().info("Clicked on All Media type filter for the content");

        QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.clkConfirmBtn);
        QXClient.get().report().info("Clicked on Confirm button");
        QXClient.get().gestures().BlindWait(3000);

        QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.clkApplyFilterBtn);
        QXClient.get().report().info("Clicked on apply filter button");
        QXClient.get().gestures().BlindWait(3000);

        Assert.assertTrue(QXClient.get().gestures().isElementPresent(trainingPageObjects.assertContentAfterFiltering),"Content for all media type is not available");
        QXClient.get().report().info("Content for all media type is displayed");
    }
    
    public void verifyLoginBeforeCourseFetch() throws  Exception{
        QXClient.get().gestures().BlindWait(3000);

        Assert.assertTrue(QXClient.get().gestures().isElementPresent(trainingPageObjects.assertCheckCourseMsg),"Want to check courses message is not displayed");
        QXClient.get().report().info("Want to check courses message is displayed");

        Assert.assertTrue(QXClient.get().gestures().isElementPresent(trainingPageObjects.loginBtnInCourseSection),"Login button in training page is not displayed");
        QXClient.get().report().info("Login button is displayed");

        QXClient.get().gestures().BlindWait(3000);

    }

    public void verifyLoginPopUpWhileJoinCourse() throws Exception{
        QXClient.get().gestures().BlindWait(3000);

        Assert.assertTrue(QXClient.get().gestures().isElementPresent(trainingPageObjects.clkJoinCourseBtn),"Join course button is not visible");
        QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.clkJoinCourseBtn);
        QXClient.get().report().info("Clicked on join course button");
        QXClient.get().gestures().BlindWait(3000);

        Assert.assertTrue(QXClient.get().gestures().isElementPresent(trainingPageObjects.loginPopUp),"Login popup is not displayed");
        QXClient.get().report().info("Login popup is displayed");

        Assert.assertTrue(QXClient.get().gestures().isElementPresent(trainingPageObjects.messageInLoginPopup),"Message in login popup is not displayed");
        QXClient.get().report().info("Message in login popup is displayed");


        Assert.assertTrue(QXClient.get().gestures().isElementPresent(trainingPageObjects.clkLoginBtn),"Login button is not displayed");
        QXClient.get().report().info("Login button is displayed");
        QXClient.get().gestures().BlindWait(3000);


    }

    public void verifyCreatorNotAbleToEnrollMessage() throws Exception{
        QXClient.get().gestures().BlindWait(1000);

        if(QXClient.get().gestures().isElementPresent(trainingPageObjects.canNotEnrollMsg)) {
            Assert.assertTrue(QXClient.get().gestures().isElementPresent(trainingPageObjects.canNotEnrollMsg), "Creator can't enroll to course message is not displayed");
            QXClient.get().report().info("Creator can't enroll to course message is displayed");
        }else{
            QXClient.get().report().info("Creator can't enroll to course message is displayed");
        }

    }
    
    
    public void verifyLastAttemptMessageWhileConsumeCourse() throws Exception{
        QXClient.get().gestures().BlindWait(3000);

        QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.clkStartLearning);
        QXClient.get().report().info("Clicked on start learning");
        QXClient.get().gestures().BlindWait(3000);

        QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.playPdfIcon);
        QXClient.get().gestures().BlindWait(2000);

        Assert.assertTrue(QXClient.get().gestures().isElementPresent(trainingPageObjects.assertLimitedCourse),"Limited course is not displayed");
        QXClient.get().report().info("Limited course is displayed");

        QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.clkLastQuestion);
        QXClient.get().gestures().BlindWait(2000);

        QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.clkNextArrowIcon);
        QXClient.get().gestures().BlindWait(2000);

        QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.clkReplayBtn);
        QXClient.get().gestures().BlindWait(2000);

        QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.clkLastQuestion);
        QXClient.get().gestures().BlindWait(2000);

        QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.clkNextArrowIcon);
        QXClient.get().gestures().BlindWait(2000);

        QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.clkReplayBtn);
        QXClient.get().gestures().BlindWait(2000);

        Assert.assertTrue(QXClient.get().gestures().isElementPresent(trainingPageObjects.assertLastAttemptMsg),"Last attempt message is not displayed");
        QXClient.get().report().info("Last attempt message is displayed");

        QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.clkContinueBtn);
        QXClient.get().gestures().BlindWait(2000);

        QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.clkLastQuestion);
        QXClient.get().gestures().BlindWait(2000);

        QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.clkNextArrowIcon);
      //  Assert.assertTrue(QXClient.get().gestures().isElementPresent(trainingPageObjects.maxAttemptsExceededMsg),"Exceeded max attempts message is not displayed");
        QXClient.get().report().info("Max attempts exceeded message is displayed");

        Assert.assertTrue(QXClient.get().gestures().isElementPresent(trainingPageObjects.assertScoreCard),"Score card is not displayed");
        QXClient.get().report().info("Score card is displayed with updated score");

        Assert.assertTrue(QXClient.get().gestures().isElementPresent(trainingPageObjects.assertExitBtn),"Exit button is not displayed");
        QXClient.get().report().info("Exit button is displayed in summary page");

    }

    public void verifyContentOfRegionallanguage() throws Exception{
        QXClient.get().gestures().BlindWait(3000);

        Assert.assertTrue(QXClient.get().gestures().isElementPresent(trainingPageObjects.assertContentAfterFiltering),"Content for all media type is not available");
        QXClient.get().report().info("Content for all media type is displayed");
    }

    public void verifyContentDetailsInContentsPage() throws Exception {
        QXClient.get().gestures().BlindWait(3000);

        Assert.assertTrue(QXClient.get().gestures().isElementPresent(trainingPageObjects.assertContentTitle),"Content title is not displayed");
        QXClient.get().report().info("Content title is displayed");
        QXClient.get().gestures().BlindWait(2000);

        Assert.assertTrue(QXClient.get().gestures().isElementPresent(trainingPageObjects.assertContentPublisher),"Content publisher is not displayed");
        QXClient.get().report().info("Content publisher is displayed");

        Assert.assertTrue(QXClient.get().gestures().isElementPresent(trainingPageObjects.assertBoardMediumClassSubject),"Board,Medium,Class,Subject is not displayed");
        QXClient.get().report().info("Board,Medium,Class and Subject is displayed under content title");

        Assert.assertTrue(QXClient.get().gestures().isElementPresent(trainingPageObjects.assertContentDetails),"Content details is displayed");
        QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.assertContentDetails);
        QXClient.get().report().info("Clicked on content details");
        QXClient.get().gestures().BlindWait(2000);
        QXClient.get().gestures().swipeUp();
        QXClient.get().gestures().BlindWait(2000);

        Assert.assertTrue(QXClient.get().gestures().isElementPresent(trainingPageObjects.assertContentRelevantFor),"Content relevant for is not displayed");
        QXClient.get().report().info("Content relevant for is displayed");
        Assert.assertTrue(QXClient.get().gestures().isElementPresent(trainingPageObjects.assertClassInContentDetails),"Class in content details is not displayed");
        QXClient.get().report().info("Class is displayed under Content details");
        Assert.assertTrue(QXClient.get().gestures().isElementPresent(trainingPageObjects.assertMediumInContentDetails),"Medium in Content details is not displayed");
        QXClient.get().report().info("Medium is displayed under Content details");
        Assert.assertTrue(QXClient.get().gestures().isElementPresent(trainingPageObjects.assertBoardInContentDetails),"Board is not displayed");
        QXClient.get().report().info("Board is displayed under Content details");
        Assert.assertTrue(QXClient.get().gestures().isElementPresent(trainingPageObjects.assertUserTypeInContentDetails),"User type is not displayed");
        QXClient.get().report().info("User type is displayed under content details");
        QXClient.get().gestures().BlindWait(3000);
    }

    public void verifyDownloadPopupOfContent() throws  Exception {
        QXClient.get().gestures().BlindWait(5000);

        QXClient.get().gestures().BlindWait(5000);

        QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.clkOnPlayIcon);
        QXClient.get().report().info("Clicked on Play icon");
        QXClient.get().gestures().BlindWait(5000);

        QXClient.get().gestures().BlindWait(4000);
        QXClient.get().gestures().BlindWait(5000);
        QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.clkOnHamburgerMenu);
        QXClient.get().report().info("Clicked on hamburger menu");
        QXClient.get().gestures().BlindWait(2000);

        Assert.assertTrue(QXClient.get().gestures().isElementPresent(trainingPageObjects.assertShareBtn),"Share button is not displayed");
        QXClient.get().report().info("Share button is displayed");
        Assert.assertTrue(QXClient.get().gestures().isElementPresent(trainingPageObjects.assertDownloadBtn),"Download button is not displayed");
        QXClient.get().report().info("Download button is displayed");
        Assert.assertTrue(QXClient.get().gestures().isElementPresent(trainingPageObjects.assertPrintBtn),"Print button is not displayed");
        QXClient.get().report().info("Print button is displayed");
        Assert.assertTrue(QXClient.get().gestures().isElementPresent(trainingPageObjects.assertExitButton),"Exit button is not displayed");
        QXClient.get().report().info("Exit button is displayed");
        QXClient.get().gestures().BlindWait(3000);

        QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.assertDownloadBtn);
        QXClient.get().report().info("Clicked on download button");
        QXClient.get().gestures().BlindWait(2000);

        Assert.assertTrue(QXClient.get().gestures().isElementPresent(trainingPageObjects.assertConfirmDownloadPopUp),"Confirm download popup message is not displayed");
        QXClient.get().report().info("Confirm download popup message is displayed");
        Assert.assertTrue(QXClient.get().gestures().isElementPresent(trainingPageObjects.assertDownloadButtonInPopup),"Download button in confirm download popup is not displayed");
        QXClient.get().report().info("Download button in confirm downlaod popup is displayed");
        Assert.assertTrue(QXClient.get().gestures().isElementPresent(trainingPageObjects.assertCancelButtonInPopup),"Cancel button in confirm download popup is not displayed");
        QXClient.get().report().info("Cancel button in confirm downlaod popup is displayed");
        QXClient.get().gestures().BlindWait(3000);



    }

    public void verifyCourseDetails() throws Exception {
        QXClient.get().gestures().BlindWait(3000);

        Assert.assertTrue(QXClient.get().gestures().isElementPresent(trainingPageObjects.assertCourse),"Searched course is not displayed");
        QXClient.get().report().info("Searched Course is displayed");

        Assert.assertTrue(QXClient.get().gestures().isElementPresent(trainingPageObjects.assertCourseDetails),"Course details is not displayed");
        QXClient.get().report().info("Course details is displayed");


        Assert.assertTrue(QXClient.get().gestures().isElementPresent(trainingPageObjects.assertEnrollmentEndDate),"Enrollment end date is not displayed below join course button");
        QXClient.get().report().info("Enrollment end date is displayed below the Join course button");
        QXClient.get().gestures().BlindWait(2000);

        QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.assertCourseDetails);
        QXClient.get().gestures().BlindWait(2000);

        Assert.assertTrue(QXClient.get().gestures().isElementPresent(trainingPageObjects.assertCourseRelevantFor),"Course relevant for is not displayed");
        QXClient.get().report().info("This Course is relevant for is displayed under course details");

        Assert.assertTrue(QXClient.get().gestures().isElementPresent(trainingPageObjects.assertClassInContentDetails),"Class details is not displayed");
        QXClient.get().report().info("Class details is displayed in course details ");

        Assert.assertTrue(QXClient.get().gestures().isElementPresent(trainingPageObjects.assertMediumInContentDetails),"Medium details is not displayed");
        QXClient.get().report().info("Medium details is displayed in course details");

        Assert.assertTrue(QXClient.get().gestures().isElementPresent(trainingPageObjects.assertBoardInContentDetails),"Board details is not displayed");
        QXClient.get().report().info("Board details is displayed in course details");

        Assert.assertTrue(QXClient.get().gestures().isElementPresent(trainingPageObjects.assertUserTypeInContentDetails),"UserType details is not displayed");
        QXClient.get().report().info("User Type details is displayed in course details");
        QXClient.get().gestures().BlindWait(2000);
    }

    public void verifyUpcomingBatchMessageWhileJoinCourse() throws Exception {
        QXClient.get().gestures().BlindWait(3000);

        Assert.assertTrue(QXClient.get().gestures().isElementPresent(trainingPageObjects.clkJoinCourseBtn),"Join Course button is not displayed");
        QXClient.get().report().info("Join Course is displayed");
        QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.clkJoinCourseBtn);
        QXClient.get().report().info("Clicked on Join Course Button");

        if(QXClient.get().gestures().isElementPresent(trainingPageObjects.assertBatchStartDateMessage)) {
            QXClient.get().report().info("Upcoming Batch start date is displayed");
            QXClient.get().gestures().BlindWait(2000);
        }else{
            QXClient.get().report().info("The course's batch is available from <batch date> message is displayed");
        }

    }

    public void verifyNoLeaveCourseForCompletedCourse() throws Exception {
        QXClient.get().gestures().BlindWait(3000);

        QXClient.get().gestures().BlindWait(5000);
        QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.sltCourseMenuIcon);
        QXClient.get().report().info("Select course menu in course toc");
        QXClient.get().gestures().BlindWait(2000);

        if (QXClient.get().gestures().isElementPresent(trainingPageObjects.clkLeaveCourse)) {
            QXClient.get().report().info("Leave Course is displayed for Completed course");
        }
        else{
            Assert.assertTrue(!QXClient.get().gestures().isElementPresent(trainingPageObjects.clkLeaveCourse),"Leave course is displayed");
            QXClient.get().report().info("Leave course is not displayed for completed course");
        }
    }

    public void verifyCourseUpdatedMessageWithDate() throws Exception {
        QXClient.get().gestures().BlindWait(6000);

      Assert.assertTrue(QXClient.get().gestures().isElementPresent(trainingPageObjects.assertCourseUpdatedMessageWithDate),"Course updated message is not displayed");
      QXClient.get().report().info("Course last updated on dd/mm/yyyy format is displayed");
      QXClient.get().gestures().BlindWait(2000);

    }


    public void verifyTimerIsDisplayedInCourseTOC() throws Exception {
        QXClient.get().gestures().BlindWait(6000);

        Assert.assertTrue(!QXClient.get().gestures().isElementPresent(trainingPageObjects.assertTimerWithXdaysYhoursZmin),"Timer is displayed Before Join the course");
        QXClient.get().report().info("Timer is not displayed Before User join the course");
        QXClient.get().gestures().BlindWait(4000);

        QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.clkJoinCourseBtn);
        QXClient.get().report().info("clicked on joincourse button");
        QXClient.get().gestures().BlindWait(2000);


        try
        {
            if(QXClient.get().gestures().isElementPresent((trainingPageObjects.clkDontShareBtn)));
            {
                QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.clkDontShareBtn);
                QXClient.get().report().info("clicked on clkDontShareBtn button");
                QXClient.get().gestures().BlindWait(2000);

            }
        }
        catch(Exception e3)
        {
            System.out.println("handled profile share");
        }

        Assert.assertTrue(QXClient.get().gestures().isElementPresent(trainingPageObjects.assertTimerWithXdaysYhoursZmin),"Timer is not displayed in course TOC");
        QXClient.get().report().info("Timer is displayed with X days, Y hours and Z minutes for an Expiring course in two days");
        QXClient.get().gestures().BlindWait(4000);

        Assert.assertTrue(QXClient.get().gestures().isElementPresent(trainingPageObjects.clkStartLearning),"Start Learning Button is not displayed");
        QXClient.get().report().info("Start learning button is displayed in course toc");
        QXClient.get().gestures().BlindWait(3000);

    }

    public void verifyTimerAfterUnenrollFromCourse() throws Exception {
        QXClient.get().gestures().BlindWait(2000);

        Assert.assertTrue(!QXClient.get().gestures().isElementPresent(trainingPageObjects.assertTimerWithXdaysYhoursZmin),"Timer is displayed after unenroll from the course");
        QXClient.get().report().info("Timer is not displayed after user unenroll from the course");
        QXClient.get().gestures().BlindWait(4000);
    }


    public void verifyTimerIsNotDisplayedInCourseTOC() throws Exception {
        QXClient.get().gestures().BlindWait(6000);

        Assert.assertTrue(!QXClient.get().gestures().isElementPresent(trainingPageObjects.assertTimerWithXdaysYhoursZmin),"Timer is displayed Before Join the course");
        QXClient.get().report().info("Timer is not displayed Before User join the course");
        QXClient.get().gestures().BlindWait(4000);

        QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.clkJoinCourseBtn);
        QXClient.get().report().info("clicked on joincourse button");
        QXClient.get().gestures().BlindWait(2000);


        try
        {
            if(QXClient.get().gestures().isElementPresent((trainingPageObjects.clkDontShareBtn)));
            {
                QXClient.get().gestures().waitAndClickElementisVisible(trainingPageObjects.clkDontShareBtn);
                QXClient.get().report().info("clicked on clkDontShareBtn button");
                QXClient.get().gestures().BlindWait(2000);

            }
        }
        catch(Exception e3)
        {
            System.out.println("handled profile share");
        }

        Assert.assertTrue(!QXClient.get().gestures().isElementPresent(trainingPageObjects.assertTimerWithXdaysYhoursZmin),"Timer is displayed in course TOC");
        QXClient.get().report().info("Timer is not displayed with X days, Y hours and Z minutes for an Expiring course in two days");
        QXClient.get().gestures().BlindWait(4000);

        Assert.assertTrue(QXClient.get().gestures().isElementPresent(trainingPageObjects.clkStartLearning),"Start Learning Button is not displayed");
        QXClient.get().report().info("Start learning button is displayed in course toc");
        QXClient.get().gestures().BlindWait(3000);
    }

}
