package com.qualitrrix.test.regression;

import java.util.Properties;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qualitrix.annotation.values.Author;
import com.qualitrix.client.QXClient;
import com.qualitrix.pageActions.CoursePageActions;
import com.qualitrix.pageActions.DikshaMainPageActions;
import com.qualitrix.pageActions.DownloadPageActions;
import com.qualitrix.pageActions.HomePageActions;
import com.qualitrix.pageActions.LibraryCourseContentPageActions;
import com.qualitrix.pageActions.LoginPageActions;
import com.qualitrix.pageActions.ProfileEditPageActions;
import com.qualitrix.pageActions.TrainingPageActions;

public class TPDScenario {

	public DikshaMainPageActions getDikshaMainPageActions() {
		return new DikshaMainPageActions();
	}

	public LoginPageActions getLoginPageActions() {
		return new LoginPageActions();
	}

	public CoursePageActions getCoursePageActions() {

		return new CoursePageActions();
	}

	public LibraryCourseContentPageActions getLibraryPageActions() {
		return new LibraryCourseContentPageActions();
	}

	public HomePageActions getHomePageActions() {
		return new HomePageActions();
	}
	 public TrainingPageActions getTrainingPageActions() {
	        return new TrainingPageActions();
	    }
	 public DownloadPageActions getDownloadPageActions() {
	        return new DownloadPageActions();
	    }
	 public ProfileEditPageActions getProfileEditPageActions() {
	        return new ProfileEditPageActions();
	    }
	 
	@BeforeClass
	public void BeforeClass() {
		System.out.println("@BeforeClass");
		// QXClient.get().driver();

	}

	@BeforeMethod
	public void beforeMethod() {
		System.out.println("@BeforeMethod");
		// QXClient.get().driver();

	}
  @Author(name="Raju")
	  
	  @Test(enabled = true, groups = {"SanityTest", "FunctionalTest"}, alwaysRun = true)
	public void verifyUserAbleToEnrollConsumeCourseContent() throws Exception {
	  
		  QXClient.get().driver();
		  getDikshaMainPageActions().performUserOnBoarding();
		  getHomePageActions().tapOnProfileTab();
		  
		  
		  Properties properties = QXClient.get().propUtils().getProperties(System.getProperty("user.dir") +"/configs/config.properties"); System.out.println("@name:" +
		  properties.getProperty("excelpath"));
		  
		  String fetchExcelPathFromConfig=properties.getProperty("excelpath");
		  QXClient.get().excelUtils().open(fetchExcelPathFromConfig, "Excel1");
		  
		  String Username =QXClient.get().excelUtils().getCellValue("Excel1","TestData",2,2); 
		  String Password =QXClient.get().excelUtils().getCellValue("Excel1", "TestData",3,2);	
		  String coursefetch =QXClient.get().excelUtils().getCellValue("Excel1", "TestData",25,2);	  

		  QXClient.get().gestures().swipeUp();
	        QXClient.get().gestures().swipeUp();
	  getLoginPageActions().loginToTheUser(Username,Password);
	  
	  
	  DikshaMainPageActions d=new DikshaMainPageActions();
	  QXClient.get().gestures().closeApp();  
	    d.LaunchAppHomeScreen();
		  getHomePageActions().tapOnDownloadTab();

	  getHomePageActions().tapOnMenuBar();
	 	  	  getCoursePageActions().tapOnAddAnotherUser();
	  
	  String FakeName=QXClient.get().gestures().generateRandomName();
	  String storeFakeNameEntered= getCoursePageActions().enterName(FakeName);
	  System.out.println(storeFakeNameEntered);
	  getCoursePageActions().tapOnAddUserBtn();
	  
	  
	  getHomePageActions().tapOnMenuBar();
	  
	  getCoursePageActions().tapOnMoreOption();
	  QXClient.get().gestures().generateXpathAndClickElement(storeFakeNameEntered);
	  
	  
	  getCoursePageActions().tapOnChangeUser(); 
	  
	  getCoursePageActions().tapOnTermsAndCondition();
	  
	  getCoursePageActions().tapOnContinueForSwicthUser();
	  
	  
	  DikshaMainPageActions d2=new DikshaMainPageActions();
	  QXClient.get().gestures().closeApp();  
	    d2.LaunchAppHomeScreen();
		  getHomePageActions().tapOnDownloadTab();
	  
	  
	  
	  getHomePageActions().tapOnProfileTab();
	//  getHomePageActions().tapOnProfileTab();

	  getHomePageActions().tapOnTrainingTab();



	  
		  
		       getHomePageActions().tapOnSearchIcon();
		       getHomePageActions().enterTextInSearchBar(coursefetch);

		       QXClient.get().gestures().generateXpathUsingClassAndTextAndClickElement(coursefetch);
		 	 getTrainingPageActions().consumCourseContent();
		 	
		  

	}
  
  
  @Test(enabled = true, groups = { "SanityTest",
	"FunctionalTest" }, alwaysRun = true, description = "Course Share.")
public void verifyCourseSharing() throws Exception {

QXClient.get().driver();
getDikshaMainPageActions().performUserOnBoarding();
getHomePageActions().tapOnProfileTab();		  
	 Properties properties = QXClient.get().propUtils().getProperties(System.getProperty("user.dir") +"/configs/config.properties"); System.out.println("@name:" +
			  properties.getProperty("excelpath"));
			  
			  String fetchExcelPathFromConfig=properties.getProperty("excelpath");
			  QXClient.get().excelUtils().open(fetchExcelPathFromConfig, "Excel1");
			  
			  String Username =QXClient.get().excelUtils().getCellValue("Excel1","TestData",2,2); 
			  String Password =QXClient.get().excelUtils().getCellValue("Excel1", "TestData",3,2);
			  String LeaveCourse =QXClient.get().excelUtils().getCellValue("Excel1", "TestData",30,2);
			  String coursefetch =QXClient.get().excelUtils().getCellValue("Excel1", "TestData",25,2);	  


			  QXClient.get().gestures().swipeUp();
	        QXClient.get().gestures().swipeUp();
			  getLoginPageActions().loginToTheUser(Username,Password);
			  
			  DikshaMainPageActions d=new DikshaMainPageActions();
			  QXClient.get().gestures().closeApp();  
			    d.LaunchAppHomeScreen();
				  getHomePageActions().tapOnDownloadTab();

			  	 getHomePageActions().tapOnTrainingTab();

     getHomePageActions().tapOnSearchIcon();
     getHomePageActions().enterTextInSearchBar(coursefetch);
     QXClient.get().gestures().generateXpathUsingClassAndTextAndClickElement(coursefetch);

   //  getTrainingPageActions().tapOnSearchedCourse();
       getTrainingPageActions().tapOnJoinTraining2();





getLibraryPageActions().tapOnShareBtn();
getLibraryPageActions().verifySharePopUI();
getLibraryPageActions().tapOnShareBtnFrmSharePop();
getLibraryPageActions().tapOnShareToWhatsApp();
getLibraryPageActions().verifyWhatsAppHomePage();


}

  @Test(enabled = true, groups = {"SanityTest", "FunctionalTest"}, alwaysRun =
		  true, description = "courseNameInProfileTab")
		  public void courseNameInProfileTab() throws Exception { 
			  QXClient.get().driver();
		  getDikshaMainPageActions().performUserOnBoarding();
		  getHomePageActions().tapOnProfileTab();
		  
		  
		  Properties properties = QXClient.get().propUtils().getProperties(System.getProperty("user.dir") +"/configs/config.properties"); System.out.println("@name:" +
		  properties.getProperty("excelpath"));
		  
		  String fetchExcelPathFromConfig=properties.getProperty("excelpath");
		  QXClient.get().excelUtils().open(fetchExcelPathFromConfig, "Excel1");
		  
		  String Username =QXClient.get().excelUtils().getCellValue("Excel1","TestData",36,2); 
		  String Password =QXClient.get().excelUtils().getCellValue("Excel1", "TestData",37,2);

		  QXClient.get().gestures().swipeUp();
        QXClient.get().gestures().swipeUp();
		  getLoginPageActions().loginToTheUser(Username,Password);
		  DikshaMainPageActions d=new DikshaMainPageActions();
		  QXClient.get().gestures().closeApp();  
		    d.LaunchAppHomeScreen();
			  getHomePageActions().tapOnDownloadTab();

			  
		  getHomePageActions().tapOnProfileTab();
		  getCoursePageActions().verifyCoursesSectionInProfile();
		  
		  
		  }

 	  
@Author(name="Raju")
  
  @Test()
public void AddActivitsInGroup() throws Exception {
  
	  QXClient.get().driver();
	  getDikshaMainPageActions().performUserOnBoarding();
	  getHomePageActions().tapOnProfileTab();
	  
	  
	  Properties properties = QXClient.get().propUtils().getProperties(System.getProperty("user.dir") +"/configs/config.properties"); System.out.println("@name:" +
	  properties.getProperty("excelpath"));
	  
	  String fetchExcelPathFromConfig=properties.getProperty("excelpath");
	  QXClient.get().excelUtils().open(fetchExcelPathFromConfig, "Excel1");
	  
	  String Username =QXClient.get().excelUtils().getCellValue("Excel1","TestData",2,2); 
	  String Password =QXClient.get().excelUtils().getCellValue("Excel1", "TestData",3,2);	  
	  QXClient.get().gestures().swipeUp();
	  QXClient.get().gestures().swipeUp();

  getLoginPageActions().loginToTheUser(Username,Password);
  DikshaMainPageActions d=new DikshaMainPageActions();
  QXClient.get().gestures().closeApp();  
    d.LaunchAppHomeScreen();
	  getHomePageActions().tapOnDownloadTab();

  getHomePageActions().tapOnMenuBar();
  getHomePageActions().createGrupAndActivity();
  
}
@Test()
public void VerifyEnableDiscussionGroup() throws Exception {
	  
		  QXClient.get().driver();
		  DikshaMainPageActions d=new DikshaMainPageActions();
		  getDikshaMainPageActions().performUserOnBoarding();
		  getHomePageActions().tapOnProfileTab();
		  
		  
		  Properties properties = QXClient.get().propUtils().getProperties(System.getProperty("user.dir") +"/configs/config.properties"); System.out.println("@name:" +
		  properties.getProperty("excelpath"));
		  
		  String fetchExcelPathFromConfig=properties.getProperty("excelpath");
		  QXClient.get().excelUtils().open(fetchExcelPathFromConfig, "Excel1");
		  
		  String Username =QXClient.get().excelUtils().getCellValue("Excel1","TestData",2,2); 
		  String Password =QXClient.get().excelUtils().getCellValue("Excel1", "TestData",3,2);	  
		  QXClient.get().gestures().swipeUp();
		  QXClient.get().gestures().swipeUp();

	  getLoginPageActions().loginToTheUser(Username,Password);
	
	  QXClient.get().gestures().closeApp();  
      d.LaunchAppHomeScreen();
	  getHomePageActions().tapOnDownloadTab();

	  getHomePageActions().tapOnMenuBar();
	  getHomePageActions().createGrupAndActivity();
	  getHomePageActions().EnableDiscussion();
	  getHomePageActions().startQuestionFill();
	  getHomePageActions().DisableDiscussion();
	  getHomePageActions().deleteGroup();

	  
	  
	  
}
	 


@Test()
public void CreateGroup() throws Exception {
	  
		  QXClient.get().driver();
		  getDikshaMainPageActions().performUserOnBoarding();
		  getHomePageActions().tapOnProfileTab();
		  
		  
		  Properties properties = QXClient.get().propUtils().getProperties(System.getProperty("user.dir") +"/configs/config.properties"); System.out.println("@name:" +
		  properties.getProperty("excelpath"));
		  
		  String fetchExcelPathFromConfig=properties.getProperty("excelpath");
		  QXClient.get().excelUtils().open(fetchExcelPathFromConfig, "Excel1");
		  
		  String Username =QXClient.get().excelUtils().getCellValue("Excel1","TestData",2,2); 
		  String Password =QXClient.get().excelUtils().getCellValue("Excel1", "TestData",3,2);	  
		  QXClient.get().gestures().swipeUp();
		  QXClient.get().gestures().swipeUp();

	  getLoginPageActions().loginToTheUser(Username,Password);
	  DikshaMainPageActions d=new DikshaMainPageActions();
	  QXClient.get().gestures().closeApp();  
	    d.LaunchAppHomeScreen();
		  getHomePageActions().tapOnDownloadTab();

	  getHomePageActions().tapOnMenuBar();
	  getHomePageActions().createGrupAndActivity();
	  
}
 

@Test()
public void addMemberAndRemoveMember() throws Exception {
	  
		  QXClient.get().driver();
		  getDikshaMainPageActions().performUserOnBoarding();
		  getHomePageActions().tapOnProfileTab();
		  
		  
		  Properties properties = QXClient.get().propUtils().getProperties(System.getProperty("user.dir") +"/configs/config.properties"); System.out.println("@name:" +
		  properties.getProperty("excelpath"));
		  
		  String fetchExcelPathFromConfig=properties.getProperty("excelpath");
		  QXClient.get().excelUtils().open(fetchExcelPathFromConfig, "Excel1");
		  
		  String Username =QXClient.get().excelUtils().getCellValue("Excel1","TestData",2,2); 
		  String Password =QXClient.get().excelUtils().getCellValue("Excel1", "TestData",3,2);	  
		  String MemberIDValue =QXClient.get().excelUtils().getCellValue("Excel1", "TestData",38,2);	  

		  QXClient.get().gestures().swipeUp();
		  QXClient.get().gestures().swipeUp();

	  getLoginPageActions().loginToTheUser(Username,Password);
	  DikshaMainPageActions d=new DikshaMainPageActions();
	  QXClient.get().gestures().closeApp();  
	    d.LaunchAppHomeScreen();
		  getHomePageActions().tapOnDownloadTab();

	  getHomePageActions().tapOnMenuBar();
	  getHomePageActions().createGrupAndActivity();
	  getHomePageActions().addMemberAndRemovemember(MemberIDValue);
	  getHomePageActions().deleteGroup();
}

@Test()
public void DeleteGroup() throws Exception {
	  
		  QXClient.get().driver();
		  getDikshaMainPageActions().performUserOnBoarding();
		  getHomePageActions().tapOnProfileTab();
		  
		  
		  Properties properties = QXClient.get().propUtils().getProperties(System.getProperty("user.dir") +"/configs/config.properties"); System.out.println("@name:" +
		  properties.getProperty("excelpath"));
		  
		  String fetchExcelPathFromConfig=properties.getProperty("excelpath");
		  QXClient.get().excelUtils().open(fetchExcelPathFromConfig, "Excel1");
		  
		  String Username =QXClient.get().excelUtils().getCellValue("Excel1","TestData",2,2); 
		  String Password =QXClient.get().excelUtils().getCellValue("Excel1", "TestData",3,2);	  
		  String MemberIDValue =QXClient.get().excelUtils().getCellValue("Excel1", "TestData",38,2);	  

		  QXClient.get().gestures().swipeUp();
		  QXClient.get().gestures().swipeUp();

	  getLoginPageActions().loginToTheUser(Username,Password);
	  DikshaMainPageActions d=new DikshaMainPageActions();
	  QXClient.get().gestures().closeApp();  
	    d.LaunchAppHomeScreen();
		  getHomePageActions().tapOnDownloadTab();

	  getHomePageActions().tapOnMenuBar();
	  getHomePageActions().createGrupAndActivity();
	  getHomePageActions().deleteGroup();
}

 
			
	
	  @Author(name="Raju") 
	    @Test()
	  public void verifyMediaFilterType() throws Exception {
	    
	  	  QXClient.get().driver();
	  		 getDikshaMainPageActions().performUserOnBoarding();
	  	      	getHomePageActions().tapOnSearchIcon();
	  	  	      getHomePageActions().enterTextInSearchBar("resource");
	  	          getLibraryPageActions().FilterForContentPublisherMediaType();

	  }

	  
	  @Test(enabled = true, groups = {"SanityTest", "FunctionalTest"}, alwaysRun = true,
	            description = "Verify Class And SeeMoreBooksContent in LibrarySection")
	    public void UserAbleToSeeMoreBooks() throws Exception {
	    	 QXClient.get().driver();
			  getDikshaMainPageActions().performUserOnBoarding();
			  
	    	        getLibraryPageActions().verifyClassAndSeeMoreBooks();

	    }
	       
	  @Test()
	  public void AppCloseOnClkYesButon() throws Exception {
	  	  
	  		  QXClient.get().driver();
	  		  getDikshaMainPageActions().performUserOnBoarding();
	  	  getHomePageActions().closeAppOnClkYesBtn();
	  }
	  
	  @Test(enabled = true, groups = { "SanityTest",
		"FunctionalTest" }, alwaysRun = true, description = "anonymousUserAbleToSearchCourse")
	public void anonymousUserAbleToSearchCourse() throws Exception {

	QXClient.get().driver();
	getDikshaMainPageActions().performUserOnBoarding();
	getHomePageActions().tapOnProfileTab();		  
		 Properties properties = QXClient.get().propUtils().getProperties(System.getProperty("user.dir") +"/configs/config.properties"); System.out.println("@name:" +
				  properties.getProperty("excelpath"));
				  
				  String fetchExcelPathFromConfig=properties.getProperty("excelpath");
				  QXClient.get().excelUtils().open(fetchExcelPathFromConfig, "Excel1");
				  
				  String Username =QXClient.get().excelUtils().getCellValue("Excel1","TestData",2,2); 
				  String Password =QXClient.get().excelUtils().getCellValue("Excel1", "TestData",3,2);
				  String LeaveCourse =QXClient.get().excelUtils().getCellValue("Excel1", "TestData",30,2);
				  String coursefetch =QXClient.get().excelUtils().getCellValue("Excel1", "TestData",25,2);	  


				  QXClient.get().gestures().swipeUp();
		        QXClient.get().gestures().swipeUp();
				  getLoginPageActions().loginToTheUser(Username,Password);
				  
				  DikshaMainPageActions d=new DikshaMainPageActions();
				  QXClient.get().gestures().closeApp();  
				    d.LaunchAppHomeScreen();
					  getHomePageActions().tapOnDownloadTab();

				  	 getHomePageActions().tapOnTrainingTab();

	     getHomePageActions().tapOnSearchIcon();
	     getHomePageActions().enterTextInSearchBar(coursefetch);
	     QXClient.get().gestures().generateXpathUsingClassAndTextAndClickElement(coursefetch);



	}

	  @Test(enabled = true, groups = { "SanityTest",
		"FunctionalTest" }, alwaysRun = true, description = "SngleBatchVerification")
	public void SngleBatchVerification() throws Exception {

	QXClient.get().driver();
	getDikshaMainPageActions().performUserOnBoarding();
	getHomePageActions().tapOnProfileTab();		  
		 Properties properties = QXClient.get().propUtils().getProperties(System.getProperty("user.dir") +"/configs/config.properties"); System.out.println("@name:" +
				  properties.getProperty("excelpath"));
				  
				  String fetchExcelPathFromConfig=properties.getProperty("excelpath");
				  QXClient.get().excelUtils().open(fetchExcelPathFromConfig, "Excel1");
				  
				  String Username =QXClient.get().excelUtils().getCellValue("Excel1","TestData",2,2); 
				  String Password =QXClient.get().excelUtils().getCellValue("Excel1", "TestData",3,2);
				  String LeaveCourse =QXClient.get().excelUtils().getCellValue("Excel1", "TestData",30,2);
				  String coursefetch =QXClient.get().excelUtils().getCellValue("Excel1", "TestData",25,2);	  


				  QXClient.get().gestures().swipeUp();
		        QXClient.get().gestures().swipeUp();
				  getLoginPageActions().loginToTheUser(Username,Password);
				  
				  DikshaMainPageActions d=new DikshaMainPageActions();
				  QXClient.get().gestures().closeApp();  
				    d.LaunchAppHomeScreen();
					  getHomePageActions().tapOnDownloadTab();

				  	 getHomePageActions().tapOnTrainingTab();

	     getHomePageActions().tapOnSearchIcon();
	     getHomePageActions().enterTextInSearchBar(coursefetch);
	     QXClient.get().gestures().generateXpathUsingClassAndTextAndClickElement(coursefetch);

	   //  getTrainingPageActions().tapOnSearchedCourse();
	       getTrainingPageActions().tapOnJoinTraining2();





	getLibraryPageActions().tapOnShareBtn();
	

	}

	  @Test(enabled = true, groups = { "SanityTest",
		"FunctionalTest" }, alwaysRun = true, description = "RecentlySearchedKeyWorkdVerify")
	public void RecentlySearchedKeyWorkdVerify() throws Exception {

	QXClient.get().driver();
	getDikshaMainPageActions().performUserOnBoarding();
	
				  	 getHomePageActions().tapOnTrainingTab();

	     getHomePageActions().tapOnSearchIcon();
	     getHomePageActions().enterTextInSearchBar("Course");

	     QXClient.get().gestures().clkBackButton();
	        QXClient.get().gestures().BlindWait(1000);

	 	getHomePageActions().tapOnProfileTab();	
    QXClient.get().gestures().BlindWait(1000);

	  	 getHomePageActions().tapOnTrainingTab();

	     getHomePageActions().tapOnSearchIcon();
	     getHomePageActions().verifyRecentlySearchedKeyword();

	}

	  @Test(enabled = true, groups = { "SanityTest",
			"FunctionalTest" }, alwaysRun = true, description = "CourseTOCPageVerify")
		public void CourseTOCPageVerify() throws Exception {

		QXClient.get().driver();
		getDikshaMainPageActions().performUserOnBoarding();
		
					  	 getHomePageActions().tapOnTrainingTab();

		     getHomePageActions().tapOnSearchIcon();
		     getHomePageActions().enterTextInSearchBar("Course");

		     QXClient.get().gestures().clkBackButton();
		        QXClient.get().gestures().BlindWait(1000);

		 	getHomePageActions().tapOnProfileTab();	
	    QXClient.get().gestures().BlindWait(1000);

		  	 getHomePageActions().tapOnTrainingTab();

		     getHomePageActions().tapOnSearchIcon();
		     getHomePageActions().verifyRecentlySearchedKeyword();

		}

	  @Test(enabled = true, groups = { "SanityTest",
		"FunctionalTest" }, alwaysRun = true, description = "AnonymousUserFilterApplyInTrainingTab")
	public void AnonymousUserFilterApplyInTrainingTab() throws Exception {

	QXClient.get().driver();
	getDikshaMainPageActions().performUserOnBoarding();
	
				  	 getHomePageActions().tapOnTrainingTab();

	     getHomePageActions().tapOnSearchIcon();
	     getHomePageActions().enterTextInSearchBar("Course");

	     QXClient.get().gestures().clkBackButton();
	        QXClient.get().gestures().BlindWait(1000);

	 	getHomePageActions().tapOnProfileTab();	
  QXClient.get().gestures().BlindWait(1000);

	  	 getHomePageActions().tapOnTrainingTab();

	     getHomePageActions().tapOnSearchIcon();
	     getHomePageActions().verifyRecentlySearchedKeyword();

	}

	  @Test(enabled = true, groups = { "SanityTest",
		"FunctionalTest" }, alwaysRun = true, description = "TrainingSecForGstUsrs")
	public void TrainingSecForGstUsrs() throws Exception {

	QXClient.get().driver();
	getDikshaMainPageActions().performUserOnBoarding();
	
				  	 getHomePageActions().tapOnTrainingTab();

	     getHomePageActions().tapOnSearchIcon();
	     getHomePageActions().enterTextInSearchBar("Course");

	     QXClient.get().gestures().clkBackButton();
	        QXClient.get().gestures().BlindWait(1000);

	 	getHomePageActions().tapOnProfileTab();	
  QXClient.get().gestures().BlindWait(1000);

	  	 getHomePageActions().tapOnTrainingTab();

	     getHomePageActions().tapOnSearchIcon();
	     getHomePageActions().verifyRecentlySearchedKeyword();

	}
	 	  
	  @Test(enabled = true, groups = {"SanityTest", "FunctionalTest"}, alwaysRun = true,
	            description = "JoinTrainLoginPageHasGmailLogin")
	    public void JoinTrainLoginPageHasGmailLogin() throws Exception {
			  
			  QXClient.get().driver();
			  getDikshaMainPageActions().performUserOnBoarding();
			  	 getHomePageActions().tapOnTrainingTab();     
			  	 getLoginPageActions().tapOnLoginBtnInTrainingTab();
	  getHomePageActions().verifySignInGoogleOption();

	    }
	  
@Author(name="Raju")
	  
	  @Test()
	public void HelpButtonVerify() throws Exception {
	  
		  QXClient.get().driver();
		  getDikshaMainPageActions().performUserOnBoarding();
		  getHomePageActions().tapOnProfileTab();
		 
	  getHomePageActions().tapOnMenuBar();
	  getHomePageActions().verifyHelpSection();
	  
	}
	  


@Test()
public void DeleteActivityOfGroup() throws Exception {
	  
		  QXClient.get().driver();
		  getDikshaMainPageActions().performUserOnBoarding();
		  getHomePageActions().tapOnProfileTab();
		  
		  
		  Properties properties = QXClient.get().propUtils().getProperties(System.getProperty("user.dir") +"/configs/config.properties"); System.out.println("@name:" +
		  properties.getProperty("excelpath"));
		  
		  String fetchExcelPathFromConfig=properties.getProperty("excelpath");
		  QXClient.get().excelUtils().open(fetchExcelPathFromConfig, "Excel1");
		  
		  String Username =QXClient.get().excelUtils().getCellValue("Excel1","TestData",2,2); 
		  String Password =QXClient.get().excelUtils().getCellValue("Excel1", "TestData",3,2);	  
		  String MemberIDValue =QXClient.get().excelUtils().getCellValue("Excel1", "TestData",38,2);	  

		  QXClient.get().gestures().swipeUp();
		  QXClient.get().gestures().swipeUp();

	  getLoginPageActions().loginToTheUser(Username,Password);
	  DikshaMainPageActions d=new DikshaMainPageActions();
	  QXClient.get().gestures().closeApp();  
	    d.LaunchAppHomeScreen();
		  getHomePageActions().tapOnDownloadTab();

	  getHomePageActions().tapOnMenuBar();
	  getHomePageActions().createGrupAndActivity();
	  
}

@Author(name="Raju") 
@Test()
public void MediaTypeFilterCheckBox() throws Exception {

	  QXClient.get().driver();
		 getDikshaMainPageActions().performUserOnBoarding();
	      	getHomePageActions().tapOnSearchIcon();
	  	      getHomePageActions().enterTextInSearchBar("resource");
	          getLibraryPageActions().FilterForContentPublisherMediaType();

}

@Test(enabled = true, groups = {"SanityTest", "FunctionalTest"}, alwaysRun = true,
description = "Verify UserAble to PrintPDFContent ")
public void PrintIconInPDFContent() throws Exception {
QXClient.get().driver();
getDikshaMainPageActions().performUserOnBoarding();	 
getHomePageActions().tapOnSearchIcon();
getHomePageActions().enterTextInSearchBar("PDF_13.pdf");
QXClient.get().gestures().generateXpathUsingClassAndTextAndClickElement("PDF_13.pdf");
//getTrainingPageActions().tapOnSearchedPDF();
getLibraryPageActions().tapOnPlayIcon3();
getLibraryPageActions().printPDF();
}    



@Test(enabled = true, groups = {"SanityTest", "FunctionalTest"}, alwaysRun = true,
description = "Verify UserAble to verifyIconInPDFHamburgerMenu ")
public void VerifyOptionInPDFContentInHamburgerMenu() throws Exception {
QXClient.get().driver();
getDikshaMainPageActions().performUserOnBoarding();	 
getHomePageActions().tapOnSearchIcon();
getHomePageActions().enterTextInSearchBar("PDF_13.pdf");
QXClient.get().gestures().generateXpathUsingClassAndTextAndClickElement("PDF_13.pdf");
//getTrainingPageActions().tapOnSearchedPDF();
getLibraryPageActions().tapOnPlayIcon3();
getLibraryPageActions().verifyIconInPDFHamburgerMenu();
}

@Test(enabled = true, groups = {"SanityTest", "FunctionalTest"}, alwaysRun = true,
description = "Verify verifyZoomInZoomOut ")
public void VerifyZoomOptionInPDFContent() throws Exception {
QXClient.get().driver();
getDikshaMainPageActions().performUserOnBoarding();
getHomePageActions().tapOnSearchIcon();
getHomePageActions().enterTextInSearchBar("PDF_13.pdf");
QXClient.get().gestures().generateXpathUsingClassAndTextAndClickElement("PDF_13.pdf");
//getTrainingPageActions().tapOnSearchedPDF();
getLibraryPageActions().tapOnPlayIcon3();
getLibraryPageActions().verifyZoomInZoomOut();
}

@Test(enabled = true, groups = {"SanityTest", "FunctionalTest"}, alwaysRun = true,
description = "Verify verifyNextAndPreviousBtnInPDF ")
public void VerifyNextAndPreviousPageInPDFContent() throws Exception {
QXClient.get().driver();
getDikshaMainPageActions().performUserOnBoarding();	 
getHomePageActions().tapOnSearchIcon();
getHomePageActions().enterTextInSearchBar("PDF_13.pdf");
QXClient.get().gestures().generateXpathUsingClassAndTextAndClickElement("PDF_13.pdf");
//getTrainingPageActions().tapOnSearchedPDF();
getLibraryPageActions().tapOnPlayIcon3();
getLibraryPageActions().verifyNextAndPreviousBtnInPDF();
}    



@Test()
public void VerifyEditTitleDescriptionTags() throws Exception {
   QXClient.get().driver();
   DikshaMainPageActions d = new DikshaMainPageActions();
   getDikshaMainPageActions().performUserOnBoarding();
   getHomePageActions().tapOnProfileTab();
   Properties properties = QXClient.get().propUtils().getProperties(System.getProperty("user.dir") + "/configs/config.properties");
   System.out.println("@name:" +
         properties.getProperty("excelpath"));
   String fetchExcelPathFromConfig = properties.getProperty("excelpath");
   QXClient.get().excelUtils().open(fetchExcelPathFromConfig, "Excel1");
   String Username = QXClient.get().excelUtils().getCellValue("Excel1", "TestData", 2, 2);
   String Password = QXClient.get().excelUtils().getCellValue("Excel1", "TestData", 3, 2);
   QXClient.get().gestures().swipeUp();
   QXClient.get().gestures().swipeUp();
   getLoginPageActions().loginToTheUser(Username, Password);
   QXClient.get().gestures().closeApp();
   d.LaunchAppHomeScreen();
   getHomePageActions().tapOnDownloadTab();
   getHomePageActions().tapOnMenuBar();
   getHomePageActions().createGrupAndActivity();
   getHomePageActions().EnableDiscussion();
   getHomePageActions().startQuestionFill();
   getHomePageActions().verifyUserAbletoModifyTitleDesc();
   getHomePageActions().deleteCommentsAndRepliesInDiscussion();
   d.LaunchAppHomeScreen();
   getHomePageActions().tapOnMenuBar();
       getHomePageActions().verifyuUserAbleToOpenDiscussionForum();
   getHomePageActions().deleteDiscussion();
}


@Test(enabled = true, groups = {"SanityTest", "FunctionalTest"}, alwaysRun = true,
description = "verifyUserAbleDownloadAndPlayCourseContent ",dependsOnMethods = { "verifyUserAbleToEnrollConsumeCourseContent" })
public void verifyUserAbleDownloadAndPlayCourseContent() throws Exception {
QXClient.get().driver();

 System.out.println("verify verifyUserAbleToEnrodllConsumeCourseContent");

}

@Test(enabled = true, groups = {"SanityTest", "FunctionalTest"}, alwaysRun = true,
description = "verifyUserAbleDownloadAndPlayCourseContent ",dependsOnMethods = { "verifyUserAbleToEnrollConsumeCourseContent" })
public void verifyExpiredCourses() throws Exception {
QXClient.get().driver();

 System.out.println("verify verifyUserAbleToEnrodllConsumeCourseContent");

}

@Test(enabled = true, groups = {"SanityTest", "FunctionalTest"}, alwaysRun = true,
description = "verifyUserAbleDownloadAndPlayCourseContent ",dependsOnMethods = { "verifyUserAbleToEnrollConsumeCourseContent" })
public void verifyUserAbleToSearchCoursesByTPDfilters() throws Exception {
QXClient.get().driver();


 System.out.println("verify verifyUserAbleToEnrodllConsumeCourseContent");

}






@Test(enabled = true, groups = {"SanityTest", "FunctionalTest"}, alwaysRun = true,
description = "VerifyDisableDiscussionForumGroup Menu",dependsOnMethods = { "VerifyEnableDiscussionGroup" })
public void verifyDerivedSourceInfoWhnCourseCopied() throws Exception {
QXClient.get().driver();
System.out.println("verify MUAPopupVerify");

}



@Test(enabled = true, groups = {"SanityTest", "FunctionalTest"}, alwaysRun = true,
description = "CreateGroup Menu",dependsOnMethods = { "VerifyEnableDiscussionGroup" })
public void verifyCreditLicenseInfoSecInTOCpage() throws Exception {
QXClient.get().driver();
System.out.println("verify CreateGroup");

}







 













@Test(enabled = true, groups = {"SanityTest", "FunctionalTest"}, alwaysRun = true,
    description = "ViewActivitsInGroup Menu",dependsOnMethods = { "CreateGroup" })
public void ViewActivitsInGroup() throws Exception {
 QXClient.get().driver();
	 System.out.println("verify MUAPopupVerify");

}


@Test(enabled = true, groups = {"SanityTest", "FunctionalTest"}, alwaysRun = true,
description = "StartLearningButtonOnjoinCourse",dependsOnMethods = { "verifyUserAbleToEnrollConsumeCourseContent" })
public void ExcellentTextVerify() throws Exception {
QXClient.get().driver();
	 System.out.println("verify ExcellentTextVerify");
}


@Test(enabled = true, groups = {"SanityTest", "FunctionalTest"}, alwaysRun = true,
description = "StartLearningButtonOnjoinCourse",dependsOnMethods = { "verifyUserAbleToEnrollConsumeCourseContent" })
public void StartLearningButtonOnjoinCourse() throws Exception {
QXClient.get().driver();
	 System.out.println("verify StartLearningButtonOnjoinCourse");
}


@Test()
public void verifyUserAbleToSearchContentAndDiffMediaTypes() throws Exception {
QXClient.get().driver();
getDikshaMainPageActions().performUserOnBoarding();

Properties properties = QXClient.get().propUtils().getProperties(System.getProperty("user.dir") +"/configs/config.properties"); System.out.println("@name:" +
     properties.getProperty("excelpath"));

String fetchExcelPathFromConfig=properties.getProperty("excelpath");
QXClient.get().excelUtils().open(fetchExcelPathFromConfig, "Excel1");

String BookName =QXClient.get().excelUtils().getCellValue("Excel1","TestData",26,2);

getHomePageActions().tapOnSearchIcon();
getHomePageActions().enterTextInSearchBar(BookName);

getHomePageActions().verifyFiltersForMediaType();

QXClient.get().gestures().generateXpathUsingClassAndTextAndClickElement(BookName);

getHomePageActions().verifyContentWithAllMediaType();

getHomePageActions().verfiyContentUnderVideoMediaType();


}

@Test
public void verifyUserAbleToSearchContentForAlternativeBoard() throws Exception{
   QXClient.get().driver();
   getDikshaMainPageActions().performUserOnBoarding();

   Properties properties = QXClient.get().propUtils().getProperties(System.getProperty("user.dir") +"/configs/config.properties"); System.out.println("@name:" +
         properties.getProperty("excelpath"));

   String fetchExcelPathFromConfig=properties.getProperty("excelpath");
   QXClient.get().excelUtils().open(fetchExcelPathFromConfig, "Excel1");

   String BookName =QXClient.get().excelUtils().getCellValue("Excel1","TestData",26,2);

   getHomePageActions().tapOnSearchIcon();
   getHomePageActions().enterTextInSearchBar(BookName);

      getTrainingPageActions().verifyContentForAlternativeBoard();

      QXClient.get().gestures().generateXpathUsingClassAndTextAndClickElement(BookName);

    getTrainingPageActions().verifyAlternativeBoardForTheSearchedContent();

}


@Test
public void verifyPdfContentConsumedCompletlyAndRateTheContent() throws Exception{
  QXClient.get().driver();
  getDikshaMainPageActions().performUserOnBoarding();

  Properties properties = QXClient.get().propUtils().getProperties(System.getProperty("user.dir") +"/configs/config.properties"); System.out.println("@name:" +
        properties.getProperty("excelpath"));

  String fetchExcelPathFromConfig=properties.getProperty("excelpath");
  QXClient.get().excelUtils().open(fetchExcelPathFromConfig, "Excel1");

  String ToasterMsg =QXClient.get().excelUtils().getCellValue("Excel1","TestData",8,2);

     getHomePageActions().tapOnSearchIcon();
  getHomePageActions().enterTextInSearchBar("PDF_13.pdf");

  getTrainingPageActions().verifyFunctionalityOfNexPrevWhileConsumingPdfContent();

  getTrainingPageActions().verifyHambergerMenuOptionsWhileContentConsuming();

  getTrainingPageActions().verifyContentAfterConsumingCompletely();

  getLibraryPageActions().tapOnStarIcon();

  getLibraryPageActions().giveFeedbackAndSubmit(ToasterMsg);

  getTrainingPageActions().updateRating();

  getLibraryPageActions().updateFeedbackAndSubmit(ToasterMsg);

}

@Test(enabled = true, groups = {"SanityTest", "FunctionalTest"}, alwaysRun = true,
description = "verfiyUserAbleToViewNotifications")
public void verifyUserAbleToViewNotifications() throws Exception {

QXClient.get().driver();
DikshaMainPageActions d = new DikshaMainPageActions();
getDikshaMainPageActions().performUserOnBoarding();
getHomePageActions().tapOnProfileTab();


Properties properties = QXClient.get().propUtils().getProperties(System.getProperty("user.dir") + "/configs/config.properties");
System.out.println("@name:" +
   properties.getProperty("excelpath"));

String fetchExcelPathFromConfig = properties.getProperty("excelpath");
QXClient.get().excelUtils().open(fetchExcelPathFromConfig, "Excel1");

String Username = QXClient.get().excelUtils().getCellValue("Excel1", "TestData", 2, 2);
String Password = QXClient.get().excelUtils().getCellValue("Excel1", "TestData", 3, 2);
QXClient.get().gestures().swipeUp();
QXClient.get().gestures().swipeUp();

getLoginPageActions().loginToTheUser(Username, Password);

 getLibraryPageActions().verifyNotifications();

}


@Test
public void verifyPlayContentAndDownloadContent() throws Exception {
   QXClient.get().driver();
   getDikshaMainPageActions().performUserOnBoarding();

   getHomePageActions().tapOnSearchIcon();
   getHomePageActions().enterTextInSearchBar("pdf");

   getTrainingPageActions().playContentAndDownloadContent();

   QXClient.get().gestures().clkBackButton();
   QXClient.get().gestures().clkBackButton();

   getHomePageActions().tapOnDownloadTab();

   getTrainingPageActions().verifyDownloadedContent();



}

@Test
public void verifyCourseHeaders() throws Exception {

   QXClient.get().driver();
   getDikshaMainPageActions().performUserOnBoarding();
   getHomePageActions().tapOnProfileTab();


   Properties properties = QXClient.get().propUtils().getProperties(System.getProperty("user.dir") + "/configs/config.properties");
   System.out.println("@name:" + properties.getProperty("excelpath"));

   String fetchExcelPathFromConfig = properties.getProperty("excelpath");
   QXClient.get().excelUtils().open(fetchExcelPathFromConfig, "Excel1");

   String Username = QXClient.get().excelUtils().getCellValue("Excel1", "TestData", 38, 2);
   String Password = QXClient.get().excelUtils().getCellValue("Excel1", "TestData", 39, 2);
   QXClient.get().gestures().swipeUp();
   QXClient.get().gestures().swipeUp();

   getLoginPageActions().loginToTheUser(Username, Password);

   getHomePageActions().tapOnTrainingTab();

   getHomePageActions().verifyMyCourseAndSubjectwiseCourses();



}


@Test
public void verifyConsumeAllContentsInMobileDevices() throws Exception {
QXClient.get().driver();
getDikshaMainPageActions().performUserOnBoarding();

getHomePageActions().tapOnSearchIcon();
getHomePageActions().enterTextInSearchBar("mp4");

getLibraryPageActions().verifyPlayMp4Content();

QXClient.get().gestures().closeApp();

DikshaMainPageActions d = new DikshaMainPageActions();
d.LaunchAppHomeScreen();

getHomePageActions().tapOnSearchIcon();
getHomePageActions().enterTextInSearchBar("Epub");

getLibraryPageActions().verifyPlayEpubContent();

QXClient.get().gestures().closeApp();

DikshaMainPageActions d1 = new DikshaMainPageActions();
d1.LaunchAppHomeScreen();

getHomePageActions().tapOnSearchIcon();
getHomePageActions().enterTextInSearchBar("assessment");

getLibraryPageActions().verifyAssessmentConsumption();


}

@Test
public void verifyFilterOptionsPostSearchContent() throws Exception {

   QXClient.get().driver();
   getDikshaMainPageActions().performUserOnBoarding();
   getHomePageActions().tapOnProfileTab();


   Properties properties = QXClient.get().propUtils().getProperties(System.getProperty("user.dir") + "/configs/config.properties");
   System.out.println("@name:" + properties.getProperty("excelpath"));

   String fetchExcelPathFromConfig = properties.getProperty("excelpath");
   QXClient.get().excelUtils().open(fetchExcelPathFromConfig, "Excel1");

   String Username = QXClient.get().excelUtils().getCellValue("Excel1", "TestData", 2, 2);
   String Password = QXClient.get().excelUtils().getCellValue("Excel1", "TestData", 3, 2);
   QXClient.get().gestures().swipeUp();
   QXClient.get().gestures().swipeUp();

   getLoginPageActions().loginToTheUser(Username, Password);

   //getHomePageActions().verifyHomePageSubjects();

   getHomePageActions().tapOnSearchIcon();
   getHomePageActions().enterTextInSearchBar("resource");

   getLibraryPageActions().verifyOptionsUnderFilterSection();

}

@Test
public void verifyLabelsForTrackableCollections() throws Exception {

   QXClient.get().driver();
   getDikshaMainPageActions().performUserOnBoarding();
   getHomePageActions().tapOnProfileTab();


   Properties properties = QXClient.get().propUtils().getProperties(System.getProperty("user.dir") + "/configs/config.properties");
   System.out.println("@name:" + properties.getProperty("excelpath"));

   String fetchExcelPathFromConfig = properties.getProperty("excelpath");
   QXClient.get().excelUtils().open(fetchExcelPathFromConfig, "Excel1");

   String Username = QXClient.get().excelUtils().getCellValue("Excel1", "TestData", 2, 2);
   String Password = QXClient.get().excelUtils().getCellValue("Excel1", "TestData", 3, 2);
   String coursefetch =QXClient.get().excelUtils().getCellValue("Excel1", "TestData",25,2);
   QXClient.get().gestures().swipeUp();
   QXClient.get().gestures().swipeUp();

   getLoginPageActions().loginToTheUser(Username, Password);

   getHomePageActions().tapOnSearchIcon();
   getHomePageActions().enterTextInSearchBar(coursefetch);
   QXClient.get().gestures().generateXpathUsingClassAndTextAndClickElement(coursefetch);

   getHomePageActions().verifyLabelsForTrackableCollections();

}


@Test
public void verifyUserAbleToPlayTheContent() throws Exception {

  QXClient.get().driver();
  getDikshaMainPageActions().performUserOnBoarding();
  getHomePageActions().tapOnProfileTab();


  Properties properties = QXClient.get().propUtils().getProperties(System.getProperty("user.dir") + "/configs/config.properties");
  System.out.println("@name:" + properties.getProperty("excelpath"));

  String fetchExcelPathFromConfig = properties.getProperty("excelpath");
  QXClient.get().excelUtils().open(fetchExcelPathFromConfig, "Excel1");

  String Username = QXClient.get().excelUtils().getCellValue("Excel1", "TestData", 2, 2);
  String Password = QXClient.get().excelUtils().getCellValue("Excel1", "TestData", 3, 2);
  String bookfetch = QXClient.get().excelUtils().getCellValue("Excel1", "TestData", 26, 2);
  QXClient.get().gestures().swipeUp();
  QXClient.get().gestures().swipeUp();

  getLoginPageActions().loginToTheUser(Username, Password);

  getHomePageActions().tapOnSearchIcon();
  getHomePageActions().enterTextInSearchBar(bookfetch);
  QXClient.get().gestures().generateXpathUsingClassAndTextAndClickElement(bookfetch);

  getHomePageActions().observeUserAbleToPlayContent();

  QXClient.get().gestures().clkBackButton();

}


@Test
public void verifyShareIconAndConsumeCourseAfterJoinCourse() throws Exception {

  QXClient.get().driver();
  getDikshaMainPageActions().performUserOnBoarding();
  getHomePageActions().tapOnProfileTab();


  Properties properties = QXClient.get().propUtils().getProperties(System.getProperty("user.dir") + "/configs/config.properties");
  System.out.println("@name:" + properties.getProperty("excelpath"));

  String fetchExcelPathFromConfig = properties.getProperty("excelpath");
  QXClient.get().excelUtils().open(fetchExcelPathFromConfig, "Excel1");

  String Username = QXClient.get().excelUtils().getCellValue("Excel1", "TestData", 2, 2);
  String Password = QXClient.get().excelUtils().getCellValue("Excel1", "TestData", 3, 2);
  String coursefetch = QXClient.get().excelUtils().getCellValue("Excel1", "TestData", 25, 2);
  QXClient.get().gestures().swipeUp();
  QXClient.get().gestures().swipeUp();

  getLoginPageActions().loginToTheUser(Username, Password);

  getHomePageActions().tapOnSearchIcon();
  getHomePageActions().enterTextInSearchBar(coursefetch);
  QXClient.get().gestures().generateXpathUsingClassAndTextAndClickElement(coursefetch);

  getLibraryPageActions().tapOnShareBtn();
  getLibraryPageActions().tapOnShareBtnFrmSharePop();
  getLibraryPageActions().tapOnShareToWhatsApp();
  getLibraryPageActions().verifyWhatsAppHomePage();

    getTrainingPageActions().verifyConsumeCourseAfterJoinCourse();
}

@Test(enabled = true, groups = {"SanityTest", "FunctionalTest"}, alwaysRun = true)
public void verifyCertificateDetailsPreAndPostConsumeCourse() throws Exception {

   QXClient.get().driver();
   getDikshaMainPageActions().performUserOnBoarding();
   getHomePageActions().tapOnProfileTab();


   Properties properties = QXClient.get().propUtils().getProperties(System.getProperty("user.dir") + "/configs/config.properties");
   System.out.println("@name:" +
         properties.getProperty("excelpath"));

   String fetchExcelPathFromConfig = properties.getProperty("excelpath");
   QXClient.get().excelUtils().open(fetchExcelPathFromConfig, "Excel1");

   String Username = QXClient.get().excelUtils().getCellValue("Excel1", "TestData", 2, 2);
   String Password = QXClient.get().excelUtils().getCellValue("Excel1", "TestData", 3, 2);
   String coursefetch = QXClient.get().excelUtils().getCellValue("Excel1", "TestData", 54, 2);

   QXClient.get().gestures().swipeUp();
   QXClient.get().gestures().swipeUp();
   getLoginPageActions().loginToTheUser(Username, Password);

   DikshaMainPageActions d=new DikshaMainPageActions();
   QXClient.get().gestures().closeApp();
   d.LaunchAppHomeScreen();
   getHomePageActions().tapOnDownloadTab();

   getHomePageActions().tapOnProfileTab();

   getHomePageActions().tapOnTrainingTab();

   getHomePageActions().tapOnSearchIcon();
   getHomePageActions().enterTextInSearchBar(coursefetch);

   QXClient.get().gestures().generateXpathUsingClassAndTextAndClickElement(coursefetch);
   getTrainingPageActions().verifyCertificateDetailsBeforeJoinCourse();

   getTrainingPageActions().verifyCertificateDetailsAfterJoinCourse();

   getTrainingPageActions().consumeSmallCourse();

   getTrainingPageActions().verifyCourseCompletedMsg();

}


@Test()
public void verifyCertificateDownloadingToastMessage() throws Exception {
   QXClient.get().driver();
   DikshaMainPageActions d = new DikshaMainPageActions();
   getDikshaMainPageActions().performUserOnBoarding();
   getHomePageActions().tapOnProfileTab();
   Properties properties = QXClient.get().propUtils().getProperties(System.getProperty("user.dir") + "/configs/config.properties");
   System.out.println("@name:" + properties.getProperty("excelpath"));
   String fetchExcelPathFromConfig = properties.getProperty("excelpath");
   QXClient.get().excelUtils().open(fetchExcelPathFromConfig, "Excel1");
   String Username = QXClient.get().excelUtils().getCellValue("Excel1", "TestData", 36, 2);
   String Password = QXClient.get().excelUtils().getCellValue("Excel1", "TestData", 37, 2);
   QXClient.get().gestures().swipeUp();
   QXClient.get().gestures().swipeUp();
   getLoginPageActions().loginToTheUser(Username, Password);
   QXClient.get().gestures().closeApp();
   d.LaunchAppHomeScreen();
   getHomePageActions().tapOnDownloadTab();
   getHomePageActions().tapOnProfileTab();
   QXClient.get().gestures().swipeUp();
   QXClient.get().gestures().swipeUp();
   QXClient.get().gestures().swipeUp();

   getHomePageActions().verifyCertificateToastMessage();


}

@Test()
public void verifyCourseIsNotHavingCertificateMsg() throws Exception {
        QXClient.get().driver();
        getDikshaMainPageActions().performUserOnBoarding();
        getHomePageActions().tapOnProfileTab();
        
        
        Properties properties = QXClient.get().propUtils().getProperties(System.getProperty("user.dir") +"/configs/config.properties"); System.out.println("@name:" +
        properties.getProperty("excelpath"));
        
        String fetchExcelPathFromConfig=properties.getProperty("excelpath");
        QXClient.get().excelUtils().open(fetchExcelPathFromConfig, "Excel1");
        
        String Username =QXClient.get().excelUtils().getCellValue("Excel1","TestData",2,2); 
        String Password =QXClient.get().excelUtils().getCellValue("Excel1", "TestData",3,2);
          String coursefetch =QXClient.get().excelUtils().getCellValue("Excel1", "TestData",25,2);
        QXClient.get().gestures().swipeUp();
           QXClient.get().gestures().swipeUp();
         getLoginPageActions().loginToTheUser(Username,Password);

         getHomePageActions().tapOnDownloadTab();

          getHomePageActions().tapOnTrainingTab();

          getHomePageActions().tapOnSearchIcon();
             getHomePageActions().enterTextInSearchBar(coursefetch);

          QXClient.get().gestures().generateXpathUsingClassAndTextAndClickElement(coursefetch);

          getTrainingPageActions().verifyCertificateDetailsBeforeJoinCourse();

                getTrainingPageActions().verifyCertificateDetailsAfterJoinCourse();

 }

@Test() 
public void verifyActivityDashboardAndCourseDashboardByUser() throws Exception {

   QXClient.get().driver();
   getDikshaMainPageActions().performUserOnBoarding();
   getHomePageActions().tapOnProfileTab();
   QXClient.get().gestures().swipeUp();
   QXClient.get().gestures().swipeUp();
   Properties properties = QXClient.get().propUtils().getProperties(System.getProperty("user.dir") + "/configs/config.properties");
   System.out.println("@name:" +
         properties.getProperty("excelpath"));

   String fetchExcelPathFromConfig = properties.getProperty("excelpath");
   QXClient.get().excelUtils().open(fetchExcelPathFromConfig, "Excel1");

   String Username = QXClient.get().excelUtils().getCellValue("Excel1", "TestData", 45, 2);
   String Password = QXClient.get().excelUtils().getCellValue("Excel1", "TestData", 46, 2);

   getLoginPageActions().loginToTheUser(Username, Password);

   getHomePageActions().verifyActivityDashBoard();

}

@Test()
public void verifyCompletedCourseAndNoCertificateMsg() throws Exception {
   QXClient.get().driver();
   getDikshaMainPageActions().performUserOnBoarding();
   getHomePageActions().tapOnProfileTab();


   Properties properties = QXClient.get().propUtils().getProperties(System.getProperty("user.dir") + "/configs/config.properties");
   System.out.println("@name:" +
         properties.getProperty("excelpath"));

   String fetchExcelPathFromConfig = properties.getProperty("excelpath");
   QXClient.get().excelUtils().open(fetchExcelPathFromConfig, "Excel1");

   String Username = QXClient.get().excelUtils().getCellValue("Excel1", "TestData", 2, 2);
   String Password = QXClient.get().excelUtils().getCellValue("Excel1", "TestData", 3, 2);
   QXClient.get().gestures().swipeUp();
   QXClient.get().gestures().swipeUp();
   getLoginPageActions().loginToTheUser(Username, Password);

   getHomePageActions().tapOnDownloadTab();

   getHomePageActions().tapOnMenuBar();

   getCoursePageActions().tapOnAddAnotherUser();

   String FakeName=QXClient.get().gestures().generateRandomName();
   String storeFakeNameEntered= getCoursePageActions().enterName(FakeName);
   System.out.println(storeFakeNameEntered);
   getCoursePageActions().tapOnAddUserBtn();
   getHomePageActions().tapOnMenuBar();

   getCoursePageActions().tapOnMoreOption();
   QXClient.get().gestures().generateXpathAndClickElement(storeFakeNameEntered);


   getCoursePageActions().tapOnChangeUser();

   getCoursePageActions().tapOnTermsAndCondition();

   getCoursePageActions().tapOnContinueForSwicthUser();

   getHomePageActions().tapOnTrainingTab();

   getHomePageActions().tapOnSearchIcon();
   getHomePageActions().enterTextInSearchBar("Small AutomationCourseContent");
   QXClient.get().gestures().generateXpathUsingClassAndTextAndClickElement("Small AutomationCourseContent");

   getTrainingPageActions().verifyCourseCompletedMsgWithoutCertificate();



}


@Test()
public void verifyCoursesBasedOnSubjectAndOthersGroup() throws Exception {
   QXClient.get().driver();
   getDikshaMainPageActions().performUserOnBoarding();
   getHomePageActions().tapOnProfileTab();


   Properties properties = QXClient.get().propUtils().getProperties(System.getProperty("user.dir") + "/configs/config.properties");
   System.out.println("@name:" +
         properties.getProperty("excelpath"));

   String fetchExcelPathFromConfig = properties.getProperty("excelpath");
   QXClient.get().excelUtils().open(fetchExcelPathFromConfig, "Excel1");

   String Username = QXClient.get().excelUtils().getCellValue("Excel1", "TestData", 38, 2);
   String Password = QXClient.get().excelUtils().getCellValue("Excel1", "TestData", 39, 2);
   QXClient.get().gestures().swipeUp();
   QXClient.get().gestures().swipeUp();
   getLoginPageActions().loginToTheUser(Username, Password);

   getHomePageActions().tapOnDownloadTab();

   getHomePageActions().tapOnTrainingTab();

   getTrainingPageActions().verifyCoursesBasedOnSubject();


}


@Test()
public void verifyCaptchaDisplayedwhenAddedUserToGroup() throws Exception {

   QXClient.get().driver();
   getDikshaMainPageActions().performUserOnBoarding();
   getHomePageActions().tapOnProfileTab();


   Properties properties = QXClient.get().propUtils().getProperties(System.getProperty("user.dir") +"/configs/config.properties"); System.out.println("@name:" +
         properties.getProperty("excelpath"));

   String fetchExcelPathFromConfig=properties.getProperty("excelpath");
   QXClient.get().excelUtils().open(fetchExcelPathFromConfig, "Excel1");

   String Username =QXClient.get().excelUtils().getCellValue("Excel1","TestData",2,2);
   String Password =QXClient.get().excelUtils().getCellValue("Excel1", "TestData",3,2);
   String MemberIDValue =QXClient.get().excelUtils().getCellValue("Excel1", "TestData",47,2);

   QXClient.get().gestures().swipeUp();
   QXClient.get().gestures().swipeUp();

   getLoginPageActions().loginToTheUser(Username,Password);
   DikshaMainPageActions d=new DikshaMainPageActions();
   QXClient.get().gestures().closeApp();
   d.LaunchAppHomeScreen();
   getHomePageActions().tapOnDownloadTab();

   getHomePageActions().tapOnMenuBar();
   getHomePageActions().createGrupAndActivity();
   getHomePageActions().addMemberAndRemovemember(MemberIDValue);
   getHomePageActions().deleteGroup();
}



@Test()
public void verifyContentForAllMediaType() throws Exception {
   QXClient.get().driver();
   DikshaMainPageActions d = new DikshaMainPageActions();
   getDikshaMainPageActions().performUserOnBoarding();
   getHomePageActions().tapOnProfileTab();

   getHomePageActions().tapOnTrainingTab();
   getHomePageActions().tapOnSearchIcon();
       getHomePageActions().enterTextInSearchBar("Resource");

       getTrainingPageActions().verifyContentForAllMediaTypeFilter();

}

@Test()
public void verifyDownloadSection() throws Exception {
   QXClient.get().driver();
   getDikshaMainPageActions().performUserOnBoarding();
   getHomePageActions().tapOnProfileTab();

   getHomePageActions().tapOnDownloadTab();

   getHomePageActions().verifyDownloadSection();


}

@Test()
public void verifyContentSizeAndDeleteContentFromDownloadSection() throws Exception {
   QXClient.get().driver();
   getDikshaMainPageActions().performUserOnBoarding();
   getHomePageActions().tapOnProfileTab();

   getHomePageActions().tapOnDownloadTab();

   getHomePageActions().verifyDownloadSection();

   getHomePageActions().tapOnTrainingTab();
   getHomePageActions().tapOnSearchIcon();
   getHomePageActions().enterTextInSearchBar("resource");

   getHomePageActions().filterContentOnContentSize();

    }


@Test()
public void verifyMyGroupsPage() throws Exception {
   QXClient.get().driver();
   DikshaMainPageActions d = new DikshaMainPageActions();
   getDikshaMainPageActions().performUserOnBoarding();
   getHomePageActions().tapOnProfileTab();
   Properties properties = QXClient.get().propUtils().getProperties(System.getProperty("user.dir") + "/configs/config.properties");
   System.out.println("@name:" +
         properties.getProperty("excelpath"));
   String fetchExcelPathFromConfig = properties.getProperty("excelpath");
   QXClient.get().excelUtils().open(fetchExcelPathFromConfig, "Excel1");
   String Username = QXClient.get().excelUtils().getCellValue("Excel1", "TestData", 52, 2);
   String Password = QXClient.get().excelUtils().getCellValue("Excel1", "TestData", 53, 2);
   QXClient.get().gestures().swipeUp();
   QXClient.get().gestures().swipeUp();
   getLoginPageActions().loginToTheUser(Username, Password);
   QXClient.get().gestures().closeApp();
   d.LaunchAppHomeScreen();

   getHomePageActions().tapOnMenuBar();

   getHomePageActions().verifyGroupsPage();
}

	@Test()
	public void verifyActivateAndDeactivateGroupDetails() throws Exception {

		QXClient.get().driver();
		getDikshaMainPageActions().performUserOnBoarding();
		getHomePageActions().tapOnProfileTab();


		Properties properties = QXClient.get().propUtils().getProperties(System.getProperty("user.dir") + "/configs/config.properties");
		System.out.println("@name:" +
				properties.getProperty("excelpath"));

		String fetchExcelPathFromConfig = properties.getProperty("excelpath");
		QXClient.get().excelUtils().open(fetchExcelPathFromConfig, "Excel1");

		String Username = QXClient.get().excelUtils().getCellValue("Excel1", "TestData", 2, 2);
		String Password = QXClient.get().excelUtils().getCellValue("Excel1", "TestData", 3, 2);

		QXClient.get().gestures().swipeUp();
		QXClient.get().gestures().swipeUp();

		getLoginPageActions().loginToTheUser(Username, Password);
		DikshaMainPageActions d = new DikshaMainPageActions();
		QXClient.get().gestures().closeApp();
		d.LaunchAppHomeScreen();
		getHomePageActions().tapOnDownloadTab();

		getHomePageActions().tapOnMenuBar();

		getHomePageActions().verifyDeactivateGroup();

		getHomePageActions().ReActivateGroup();

	}

	@Test()
	public void verifyActiveGroupsFirstAndSuspendedGroupsLastInMyGroups() throws Exception {

		QXClient.get().driver();
		getDikshaMainPageActions().performUserOnBoarding();
		getHomePageActions().tapOnProfileTab();


		Properties properties = QXClient.get().propUtils().getProperties(System.getProperty("user.dir") + "/configs/config.properties");
		System.out.println("@name:" +
				properties.getProperty("excelpath"));

		String fetchExcelPathFromConfig = properties.getProperty("excelpath");
		QXClient.get().excelUtils().open(fetchExcelPathFromConfig, "Excel1");

		String Username = QXClient.get().excelUtils().getCellValue("Excel1", "TestData", 45, 2);
		String Password = QXClient.get().excelUtils().getCellValue("Excel1", "TestData", 46, 2);

		QXClient.get().gestures().swipeUp();
		QXClient.get().gestures().swipeUp();

		getLoginPageActions().loginToTheUser(Username, Password);

		getHomePageActions().tapOnDownloadTab();

		getHomePageActions().tapOnMenuBar();

		getHomePageActions().verifyActiveGroupsAndSuspendedGroups();

	}


	@Test()
	public void verifyHomePageTitlesForHeadTeacherRole() throws Exception {

		QXClient.get().driver();
		getDikshaMainPageActions().performUserOnBoardingWithHeadTeacherAndOfficials();
		Properties properties = QXClient.get().propUtils()
				.getProperties(System.getProperty("user.dir") + "/configs/config.properties");
		System.out.println("@name:" + properties.getProperty("excelpath"));
		String fetchExcelPathFromConfig = properties.getProperty("excelpath");
		QXClient.get().excelUtils().open(fetchExcelPathFromConfig, "Excel1");
		String Username = QXClient.get().excelUtils().getCellValue("Excel1", "TestData",36, 2);
		String Password = QXClient.get().excelUtils().getCellValue("Excel1", "TestData",37, 2);
		getLoginPageActions().loginToTheUserForLeader(Username,Password);

		getHomePageActions().verifyHomePageForHeadTeacherAndOfficials();

	}

	@Test()
	public void verifyContentForRegionalLanguages() throws Exception {
		QXClient.get().driver();
		DikshaMainPageActions d = new DikshaMainPageActions();
		getDikshaMainPageActions().performUserOnBoarding();
		getHomePageActions().tapOnProfileTab();

		getHomePageActions().tapOnTrainingTab();
		getHomePageActions().tapOnSearchIcon();
		getHomePageActions().enterTextInSearchBar("Resource");

		getTrainingPageActions().verifyContentOfRegionallanguage();

	}

	@Test()
	public void verifyContentDetails() throws Exception {

		QXClient.get().driver();
		getDikshaMainPageActions().performUserOnBoarding();

		getHomePageActions().tapOnDownloadTab();
		Properties properties = QXClient.get().propUtils().getProperties(System.getProperty("user.dir") +"/configs/config.properties"); System.out.println("@name:" +
				properties.getProperty("excelpath"));

		String fetchExcelPathFromConfig=properties.getProperty("excelpath");
		QXClient.get().excelUtils().open(fetchExcelPathFromConfig, "Excel1");

		String BookName =QXClient.get().excelUtils().getCellValue("Excel1","TestData",26,2);
		getHomePageActions().tapOnTrainingTab();

		getHomePageActions().tapOnSearchIcon();
		getHomePageActions().enterTextInSearchBar(BookName);
		QXClient.get().gestures().generateXpathUsingClassAndTextAndClickElement(BookName);

		getTrainingPageActions().verifyContentDetailsInContentsPage();

	}

	@Test()
	public void verifyDownloadPopUpInHamburgerMenuOfContent() throws Exception {

		QXClient.get().driver();
		getDikshaMainPageActions().performUserOnBoarding();
		getHomePageActions().tapOnProfileTab();


		Properties properties = QXClient.get().propUtils().getProperties(System.getProperty("user.dir") + "/configs/config.properties");
		System.out.println("@name:" +
				properties.getProperty("excelpath"));

		String fetchExcelPathFromConfig = properties.getProperty("excelpath");
		QXClient.get().excelUtils().open(fetchExcelPathFromConfig, "Excel1");

		String Username = QXClient.get().excelUtils().getCellValue("Excel1", "TestData", 2, 2);
		String Password = QXClient.get().excelUtils().getCellValue("Excel1", "TestData", 3, 2);

		QXClient.get().gestures().swipeUp();
		QXClient.get().gestures().swipeUp();

		getLoginPageActions().loginToTheUser(Username, Password);

		getHomePageActions().tapOnTrainingTab();

		getHomePageActions().tapOnSearchIcon();
		getHomePageActions().enterTextInSearchBar("PDF_13.pdf");
		QXClient.get().gestures().generateXpathUsingClassAndTextAndClickElement("PDF_13.pdf");

		getTrainingPageActions().verifyDownloadPopupOfContent();


	}

	@Test()
	public void validateNoTagsAvailableMessage() throws Exception {

		QXClient.get().driver();
		DikshaMainPageActions d=new DikshaMainPageActions();
		getDikshaMainPageActions().performUserOnBoarding();
		getHomePageActions().tapOnProfileTab();


		Properties properties = QXClient.get().propUtils().getProperties(System.getProperty("user.dir") +"/configs/config.properties"); System.out.println("@name:" +
				properties.getProperty("excelpath"));

		String fetchExcelPathFromConfig=properties.getProperty("excelpath");
		QXClient.get().excelUtils().open(fetchExcelPathFromConfig, "Excel1");

		String Username =QXClient.get().excelUtils().getCellValue("Excel1","TestData",2,2);
		String Password =QXClient.get().excelUtils().getCellValue("Excel1", "TestData",3,2);
		QXClient.get().gestures().swipeUp();
		QXClient.get().gestures().swipeUp();

		getLoginPageActions().loginToTheUser(Username,Password);

		QXClient.get().gestures().closeApp();
		d.LaunchAppHomeScreen();
		getHomePageActions().tapOnDownloadTab();

		getHomePageActions().tapOnMenuBar();
		getHomePageActions().createGrupAndActivity();
		getHomePageActions().EnableDiscussion();
		getHomePageActions().verifyTagsSection();


	}

	@Test()
	public void verifyStartDiscussionScreen() throws Exception {

		QXClient.get().driver();
		DikshaMainPageActions d = new DikshaMainPageActions();
		getDikshaMainPageActions().performUserOnBoarding();
		getHomePageActions().tapOnProfileTab();


		Properties properties = QXClient.get().propUtils().getProperties(System.getProperty("user.dir") + "/configs/config.properties");
		System.out.println("@name:" +
				properties.getProperty("excelpath"));

		String fetchExcelPathFromConfig = properties.getProperty("excelpath");
		QXClient.get().excelUtils().open(fetchExcelPathFromConfig, "Excel1");

		String Username = QXClient.get().excelUtils().getCellValue("Excel1", "TestData", 2, 2);
		String Password = QXClient.get().excelUtils().getCellValue("Excel1", "TestData", 3, 2);
		QXClient.get().gestures().swipeUp();
		QXClient.get().gestures().swipeUp();

		getLoginPageActions().loginToTheUser(Username, Password);

		QXClient.get().gestures().closeApp();
		d.LaunchAppHomeScreen();
		getHomePageActions().tapOnDownloadTab();

		getHomePageActions().tapOnMenuBar();
		getHomePageActions().createGrupAndActivity();
		getHomePageActions().verifyDiscussionForum();
	}

	@Test()
	public void verifyClassAndMediumInLibraryPage() throws Exception {

		QXClient.get().driver();
		DikshaMainPageActions d = new DikshaMainPageActions();
		getDikshaMainPageActions().performUserOnBoarding();
		getHomePageActions().tapOnProfileTab();

		getHomePageActions().verifyClassAndMediumInProfile();
		getHomePageActions().tapOnLibraryTab();
		getHomePageActions().changeClassAndMediumInLibraryPageAndVerify();

		QXClient.get().gestures().closeApp();
		d.LaunchAppHomeScreen();

		getHomePageActions().verifyClassAndMediumInLibraryPageAfterRelaunch();

	}

	@Test()
	public void validateUpcomingBatchMsgInCourse() throws Exception {

		QXClient.get().driver();
		getDikshaMainPageActions().performUserOnBoarding();
		getHomePageActions().tapOnProfileTab();


		Properties properties = QXClient.get().propUtils().getProperties(System.getProperty("user.dir") + "/configs/config.properties");
		System.out.println("@name:" +
				properties.getProperty("excelpath"));

		String fetchExcelPathFromConfig = properties.getProperty("excelpath");
		QXClient.get().excelUtils().open(fetchExcelPathFromConfig, "Excel1");

		String Username = QXClient.get().excelUtils().getCellValue("Excel1", "TestData", 2, 2);
		String Password = QXClient.get().excelUtils().getCellValue("Excel1", "TestData", 3, 2);

		QXClient.get().gestures().swipeUp();
		QXClient.get().gestures().swipeUp();

		getLoginPageActions().loginToTheUser(Username, Password);

		getHomePageActions().tapOnTrainingTab();

		getHomePageActions().tapOnSearchIcon();
		getHomePageActions().enterTextInSearchBar("UpcomingCourse");
		QXClient.get().gestures().generateXpathUsingClassAndTextAndClickElement("UpcomingCourse");

		getTrainingPageActions().verifyUpcomingBatchMessageWhileJoinCourse();


	}

	@Test()
	public void verifyNoRecentlyViewedSectionInLibrarypage() throws Exception {

		QXClient.get().driver();
		getDikshaMainPageActions().performUserOnBoarding();

		Properties properties = QXClient.get().propUtils().getProperties(System.getProperty("user.dir") + "/configs/config.properties");
		System.out.println("@name:" +
				properties.getProperty("excelpath"));

		String fetchExcelPathFromConfig = properties.getProperty("excelpath");
		QXClient.get().excelUtils().open(fetchExcelPathFromConfig, "Excel1");

		String Username = QXClient.get().excelUtils().getCellValue("Excel1", "TestData", 2, 2);
		String Password = QXClient.get().excelUtils().getCellValue("Excel1", "TestData", 3, 2);
		String BookName =QXClient.get().excelUtils().getCellValue("Excel1","TestData",26,2);

		getHomePageActions().tapOnSearchIcon();
		getHomePageActions().enterTextInSearchBar(BookName);
		QXClient.get().gestures().generateXpathUsingClassAndTextAndClickElement(BookName);
		QXClient.get().gestures().clkBackButton();
		QXClient.get().gestures().clkBackButton();

		getHomePageActions().verifyRecentlyViewedSectionForLoggedUserAndGuestUser();

		getHomePageActions().tapOnProfileTab();
		QXClient.get().gestures().swipeUp();
		QXClient.get().gestures().swipeUp();

		getLoginPageActions().loginToTheUser(Username, Password);

		getHomePageActions().tapOnSearchIcon();
		getHomePageActions().enterTextInSearchBar(BookName);
		QXClient.get().gestures().generateXpathUsingClassAndTextAndClickElement(BookName);
		QXClient.get().gestures().clkBackButton();
		QXClient.get().gestures().clkBackButton();

		getHomePageActions().verifyRecentlyViewedSectionForLoggedUserAndGuestUser();


	}

	@Test()
	public void verifyCourseTOCPageMessagesForExpiredAndEnrollmentEndDateCourses() throws Exception {

		QXClient.get().driver();
		getDikshaMainPageActions().performUserOnBoarding();

		getHomePageActions().verifyEnrollmentEndDateUnderJoinTraining();
		QXClient.get().gestures().clkBackButton();
		QXClient.get().gestures().clkBackButton();

		getHomePageActions().verifyEnrollmentClosedInCourseTOC();


		QXClient.get().gestures().clkBackButton();
		QXClient.get().gestures().clkBackButton();

		getHomePageActions().verifyExpiredCourseInCourseTOC();


	}


	@Test()
	public void verifyMyLearningSectionDetailsForCourses() throws Exception {

		QXClient.get().driver();
		getDikshaMainPageActions().performUserOnBoarding();


		getHomePageActions().tapOnProfileTab();
		QXClient.get().gestures().swipeUp();
		QXClient.get().gestures().swipeUp();
		Properties properties = QXClient.get().propUtils().getProperties(System.getProperty("user.dir") +"/configs/config.properties"); System.out.println("@name:" +
				properties.getProperty("excelpath"));

		String fetchExcelPathFromConfig=properties.getProperty("excelpath");
		QXClient.get().excelUtils().open(fetchExcelPathFromConfig, "Excel1");

		String Username =QXClient.get().excelUtils().getCellValue("Excel1","TestData",45,2);
		String Password =QXClient.get().excelUtils().getCellValue("Excel1", "TestData",46,2);


		getLoginPageActions().loginToTheUser(Username,Password);

		DikshaMainPageActions d=new DikshaMainPageActions();
		QXClient.get().gestures().closeApp();
		d.LaunchAppHomeScreen();
		getHomePageActions().tapOnDownloadTab();

		getHomePageActions().tapOnProfileTab();

		getCoursePageActions().verifyMyLearningSectionDetails();



	}

	@Test()
	public void verifyCourseInClassicAndSearchInNewExperience() throws Exception {

		QXClient.get().driver();
		getDikshaMainPageActions().performUserOnBoarding();

		getHomePageActions().verifySearchTabInsteadOfCoursesTabInNewExperience();


	}
	@Test()
	public void verifyNotLandingOnSearchTabForLoggedInUser() throws Exception {

		QXClient.get().driver();
		getDikshaMainPageActions().performUserOnBoarding();


		getHomePageActions().tapOnProfileTab();
		QXClient.get().gestures().swipeUp();
		QXClient.get().gestures().swipeUp();
		Properties properties = QXClient.get().propUtils().getProperties(System.getProperty("user.dir") + "/configs/config.properties");
		System.out.println("@name:" +
				properties.getProperty("excelpath"));

		String fetchExcelPathFromConfig = properties.getProperty("excelpath");
		QXClient.get().excelUtils().open(fetchExcelPathFromConfig, "Excel1");

		String Username = QXClient.get().excelUtils().getCellValue("Excel1", "TestData", 2, 2);
		String Password = QXClient.get().excelUtils().getCellValue("Excel1", "TestData", 3, 2);


		getLoginPageActions().loginToTheUser(Username, Password);

		getHomePageActions().verifyNotLandedOnSearchTabAfterLogin();

	}


	@Test()
	public void validateThreeSectionsOfSearchPage() throws Exception {
		QXClient.get().driver();
		getDikshaMainPageActions().performUserOnBoarding();
		getHomePageActions().tapOnProfileTab();
		Properties properties = QXClient.get().propUtils().getProperties(System.getProperty("user.dir") + "/configs/config.properties");
		System.out.println("@name:" +
				properties.getProperty("excelpath"));

		String fetchExcelPathFromConfig = properties.getProperty("excelpath");
		QXClient.get().excelUtils().open(fetchExcelPathFromConfig, "Excel1");

		String Username = QXClient.get().excelUtils().getCellValue("Excel1", "TestData", 2, 2);
		String Password = QXClient.get().excelUtils().getCellValue("Excel1", "TestData", 3, 2);

		QXClient.get().gestures().swipeUp();
		QXClient.get().gestures().swipeUp();

		getLoginPageActions().loginToTheUser(Username, Password);

		getHomePageActions().tapOnSearchIcon();

		getHomePageActions().verifySearchPageSections();

	}

	@Test()
	public void NoLeaveCourseForCompletedCourse() throws Exception {

		QXClient.get().driver();
		getDikshaMainPageActions().performUserOnBoarding();


		getHomePageActions().tapOnProfileTab();
		QXClient.get().gestures().swipeUp();
		QXClient.get().gestures().swipeUp();
		Properties properties = QXClient.get().propUtils().getProperties(System.getProperty("user.dir") +"/configs/config.properties"); System.out.println("@name:" +
				properties.getProperty("excelpath"));

		String fetchExcelPathFromConfig=properties.getProperty("excelpath");
		QXClient.get().excelUtils().open(fetchExcelPathFromConfig, "Excel1");

		String Username =QXClient.get().excelUtils().getCellValue("Excel1","TestData",45,2);
		String Password =QXClient.get().excelUtils().getCellValue("Excel1", "TestData",46,2);


		getLoginPageActions().loginToTheUser(Username,Password);

		DikshaMainPageActions d=new DikshaMainPageActions();
		QXClient.get().gestures().closeApp();
		d.LaunchAppHomeScreen();
		getHomePageActions().tapOnDownloadTab();

		getHomePageActions().tapOnProfileTab();

		getCoursePageActions().tapOnCompletedCourse();

		getTrainingPageActions().verifyNoLeaveCourseForCompletedCourse();


	}

	@Test()
	public void verifyNoJoinCourseButtonForExpiredCourse() throws Exception {

		QXClient.get().driver();
		getDikshaMainPageActions().performUserOnBoarding();

		Properties properties = QXClient.get().propUtils().getProperties(System.getProperty("user.dir") + "/configs/config.properties");
		System.out.println("@name:" +
				properties.getProperty("excelpath"));

		String fetchExcelPathFromConfig = properties.getProperty("excelpath");
		QXClient.get().excelUtils().open(fetchExcelPathFromConfig, "Excel1");

		String Username = QXClient.get().excelUtils().getCellValue("Excel1", "TestData", 2, 2);
		String Password = QXClient.get().excelUtils().getCellValue("Excel1", "TestData", 3, 2);

		getHomePageActions().tapOnProfileTab();
		QXClient.get().gestures().swipeUp();
		QXClient.get().gestures().swipeUp();

		getLoginPageActions().loginToTheUser(Username, Password);

		getHomePageActions().verifyExpiredCourseInCourseTOC();


	}

	@Test()
	public void validateNoCertificateMsgINCourseTOC() throws Exception {
		QXClient.get().driver();
		getDikshaMainPageActions().performUserOnBoarding();
		getHomePageActions().tapOnProfileTab();


		Properties properties = QXClient.get().propUtils().getProperties(System.getProperty("user.dir") +"/configs/config.properties"); System.out.println("@name:" +
				properties.getProperty("excelpath"));

		String fetchExcelPathFromConfig=properties.getProperty("excelpath");
		QXClient.get().excelUtils().open(fetchExcelPathFromConfig, "Excel1");

		String Username =QXClient.get().excelUtils().getCellValue("Excel1","TestData",2,2);
		String Password =QXClient.get().excelUtils().getCellValue("Excel1", "TestData",3,2);
		String coursefetch =QXClient.get().excelUtils().getCellValue("Excel1", "TestData",25,2);
		QXClient.get().gestures().swipeUp();
		QXClient.get().gestures().swipeUp();
		getLoginPageActions().loginToTheUser(Username,Password);

		getHomePageActions().tapOnDownloadTab();

		getHomePageActions().tapOnTrainingTab();

		getHomePageActions().tapOnSearchIcon();
		getHomePageActions().enterTextInSearchBar(coursefetch);

		QXClient.get().gestures().generateXpathUsingClassAndTextAndClickElement(coursefetch);

		getTrainingPageActions().verifyCertificateDetailsAfterJoinCourse();

	}

	@Test()
	public void validateDownloadTabDetails() throws Exception {

		QXClient.get().driver();
		getDikshaMainPageActions().performUserOnBoarding();

		Properties properties = QXClient.get().propUtils().getProperties(System.getProperty("user.dir") +"/configs/config.properties"); System.out.println("@name:" +
				properties.getProperty("excelpath"));

		String fetchExcelPathFromConfig=properties.getProperty("excelpath");
		QXClient.get().excelUtils().open(fetchExcelPathFromConfig, "Excel1");

		String book=QXClient.get().excelUtils().getCellValue("Excel1","TestData",26,2);
		String course=QXClient.get().excelUtils().getCellValue("Excel1","TestData",25,2);


		getHomePageActions().tapOnTrainingTab();

		getHomePageActions().tapOnSearchIcon();
		getHomePageActions().enterTextInSearchBar(book);
		QXClient.get().gestures().generateXpathUsingClassAndTextAndClickElement(book);
		QXClient.get().gestures().clkBackButton();
		QXClient.get().gestures().clkBackButton();

		getHomePageActions().tapOnSearchIcon();
		getHomePageActions().enterTextInSearchBar(course);
		QXClient.get().gestures().generateXpathUsingClassAndTextAndClickElement(course);

		DikshaMainPageActions d=new DikshaMainPageActions();
		QXClient.get().gestures().closeApp();
		d.LaunchAppHomeScreen();

		getHomePageActions().tapOnDownloadTab();

		getDownloadPageActions().verifyDownloadPage();

		getDownloadPageActions().deleteDownloadedContent();

	}

	@Test()
	public void verifyContentForMultipleFilterOptions() throws Exception {

		QXClient.get().driver();
		getDikshaMainPageActions().performUserOnBoarding();
		getHomePageActions().tapOnSearchIcon();
		getHomePageActions().enterTextInSearchBar("Resource");
		getLibraryPageActions().verifyFilterOptions();

	}

	@Test()
	public void verifyCourseLastUpdatedMessageInCourseTOC() throws Exception {

		QXClient.get().driver();
		getDikshaMainPageActions().performUserOnBoarding();

		getHomePageActions().tapOnDownloadTab();
		getHomePageActions().tapOnProfileTab();
		Properties properties = QXClient.get().propUtils().getProperties(System.getProperty("user.dir") +"/configs/config.properties"); System.out.println("@name:" +
				properties.getProperty("excelpath"));

		String fetchExcelPathFromConfig=properties.getProperty("excelpath");
		QXClient.get().excelUtils().open(fetchExcelPathFromConfig, "Excel1");

		String Username =QXClient.get().excelUtils().getCellValue("Excel1","TestData",2,2);
		String Password =QXClient.get().excelUtils().getCellValue("Excel1", "TestData",3,2);
		String  CourseName=QXClient.get().excelUtils().getCellValue("Excel1", "TestData",51,2);

		QXClient.get().gestures().swipeUp();
		QXClient.get().gestures().swipeUp();
		getLoginPageActions().loginToTheUser(Username,Password);

		getHomePageActions().tapOnTrainingTab();

		getHomePageActions().tapOnSearchIcon();
		getHomePageActions().enterTextInSearchBar(CourseName);
		QXClient.get().gestures().generateXpathUsingClassAndTextAndClickElement(CourseName);

		getTrainingPageActions().verifyCourseUpdatedMessageWithDate();

	}
	@Test()
	public void validatePopularCategoriesSectionInSearchPage() throws Exception {

		QXClient.get().driver();
		getDikshaMainPageActions().performUserOnBoarding();

		getHomePageActions().tapOnLibraryTab();

		getHomePageActions().verifyPopularCategoriesInSearchPage();
	}


	@Test()
	public void validateExploreContentsFromOtherBoardsInSearchPage() throws Exception {

		QXClient.get().driver();
		getDikshaMainPageActions().performUserOnBoarding();

		getHomePageActions().tapOnLibraryTab();

		getHomePageActions().verifyContentsFromOtherBoardsInSearchPage();
	}


	@Test()
	public void validateExploreContentsForVarietyAudienceInSearchPage() throws Exception {

		QXClient.get().driver();
		getDikshaMainPageActions().performUserOnBoarding();

		getHomePageActions().tapOnLibraryTab();

		getHomePageActions().verifyContentsForVarietyAudienceInSearchPage();
	}

	@Test()
	public void validateActivityPageInActivityDashboard() throws Exception {

		QXClient.get().driver();
		getDikshaMainPageActions().performUserOnBoarding();
		getHomePageActions().tapOnProfileTab();
		QXClient.get().gestures().swipeUp();
		QXClient.get().gestures().swipeUp();
		Properties properties = QXClient.get().propUtils().getProperties(System.getProperty("user.dir") + "/configs/config.properties");
		System.out.println("@name:" +
				properties.getProperty("excelpath"));

		String fetchExcelPathFromConfig = properties.getProperty("excelpath");
		QXClient.get().excelUtils().open(fetchExcelPathFromConfig, "Excel1");

		String Username = QXClient.get().excelUtils().getCellValue("Excel1", "TestData", 45, 2);
		String Password = QXClient.get().excelUtils().getCellValue("Excel1", "TestData", 46, 2);

		getLoginPageActions().loginToTheUser(Username, Password);

		getHomePageActions().verifyActivityDashBoard();

		getHomePageActions().verifyUserNameFreezedInActivityPage();

	}

	@Test()
	public void verifyCourseDashBoardAndActivityDashboardInGroups() throws Exception {

		QXClient.get().driver();
		getDikshaMainPageActions().performUserOnBoarding();
		getHomePageActions().tapOnProfileTab();
		QXClient.get().gestures().swipeUp();
		QXClient.get().gestures().swipeUp();
		Properties properties = QXClient.get().propUtils().getProperties(System.getProperty("user.dir") + "/configs/config.properties");
		System.out.println("@name:" +
				properties.getProperty("excelpath"));

		String fetchExcelPathFromConfig = properties.getProperty("excelpath");
		QXClient.get().excelUtils().open(fetchExcelPathFromConfig, "Excel1");

		String Username = QXClient.get().excelUtils().getCellValue("Excel1", "TestData", 45, 2);
		String Password = QXClient.get().excelUtils().getCellValue("Excel1", "TestData", 46, 2);

		getLoginPageActions().loginToTheUser(Username, Password);

		getHomePageActions().verifyCourseDashBoardInGroups();

		getHomePageActions().verifyActivityDashboardScreen();

	}

	@Test()
	public void verifyGeneralDiscussionsTopics() throws Exception {

		QXClient.get().driver();
		DikshaMainPageActions d=new DikshaMainPageActions();
		getDikshaMainPageActions().performUserOnBoarding();
		getHomePageActions().tapOnProfileTab();


		Properties properties = QXClient.get().propUtils().getProperties(System.getProperty("user.dir") +"/configs/config.properties"); System.out.println("@name:" +
				properties.getProperty("excelpath"));

		String fetchExcelPathFromConfig=properties.getProperty("excelpath");
		QXClient.get().excelUtils().open(fetchExcelPathFromConfig, "Excel1");

		String Username =QXClient.get().excelUtils().getCellValue("Excel1","TestData",55,2);
		String Password =QXClient.get().excelUtils().getCellValue("Excel1", "TestData",56,2);
		QXClient.get().gestures().swipeUp();
		QXClient.get().gestures().swipeUp();

		getLoginPageActions().loginToTheUser(Username,Password);

		getHomePageActions().tapOnMenuBar();
		getHomePageActions().verifyGeneralDiscussionTopics();

		getHomePageActions().verifyDiscussionList();

	}

	@Test()
	public void verifyUpdatedCardsofActivityInGroups() throws Exception {

		QXClient.get().driver();
		DikshaMainPageActions d=new DikshaMainPageActions();
		getDikshaMainPageActions().performUserOnBoarding();
		getHomePageActions().tapOnProfileTab();


		Properties properties = QXClient.get().propUtils().getProperties(System.getProperty("user.dir") +"/configs/config.properties"); System.out.println("@name:" +
				properties.getProperty("excelpath"));

		String fetchExcelPathFromConfig=properties.getProperty("excelpath");
		QXClient.get().excelUtils().open(fetchExcelPathFromConfig, "Excel1");

		String Username =QXClient.get().excelUtils().getCellValue("Excel1","TestData",55,2);
		String Password =QXClient.get().excelUtils().getCellValue("Excel1", "TestData",56,2);
		QXClient.get().gestures().swipeUp();
		QXClient.get().gestures().swipeUp();

		getLoginPageActions().loginToTheUser(Username,Password);

		getHomePageActions().tapOnMenuBar();
		getHomePageActions().verifyUpdatedCardsForActivities();


	}

	@Test()
	public void verifyAdminAbleToViewAllMetricsOfDashboard() throws Exception {

		QXClient.get().driver();
		getDikshaMainPageActions().performUserOnBoarding();
		getHomePageActions().tapOnProfileTab();
		QXClient.get().gestures().swipeUp();
		QXClient.get().gestures().swipeUp();
		Properties properties = QXClient.get().propUtils().getProperties(System.getProperty("user.dir") + "/configs/config.properties");
		System.out.println("@name:" +
				properties.getProperty("excelpath"));

		String fetchExcelPathFromConfig = properties.getProperty("excelpath");
		QXClient.get().excelUtils().open(fetchExcelPathFromConfig, "Excel1");

		String Username = QXClient.get().excelUtils().getCellValue("Excel1", "TestData", 45, 2);
		String Password = QXClient.get().excelUtils().getCellValue("Excel1", "TestData", 46, 2);

		getLoginPageActions().loginToTheUser(Username, Password);

		getHomePageActions().openActivityDashBoard();

		getHomePageActions().verifyDownloadAsCSVInActivityDashboard();

		getHomePageActions().verifyAdminAbleToViewGroupMemberInActivityScreen();

		getHomePageActions().verifyMembersProgressInPercentage();

		getHomePageActions().verifyAllMetricsOfDashboardForAdmin();

	}


	@Test()
	public void verifyGroupAdminAbleToViewActivityDashBoardOption() throws Exception {

		QXClient.get().driver();
		getDikshaMainPageActions().performUserOnBoarding();
		getHomePageActions().tapOnProfileTab();
		QXClient.get().gestures().swipeUp();
		QXClient.get().gestures().swipeUp();
		Properties properties = QXClient.get().propUtils().getProperties(System.getProperty("user.dir") + "/configs/config.properties");
		System.out.println("@name:" +
				properties.getProperty("excelpath"));

		String fetchExcelPathFromConfig = properties.getProperty("excelpath");
		QXClient.get().excelUtils().open(fetchExcelPathFromConfig, "Excel1");

		String Username = QXClient.get().excelUtils().getCellValue("Excel1", "TestData", 45, 2);
		String Password = QXClient.get().excelUtils().getCellValue("Excel1", "TestData", 46, 2);

		getLoginPageActions().loginToTheUser(Username, Password);
		getHomePageActions().tapOnMenuBar();

		getHomePageActions().viewOptionActivityDashBoardOnActivityLevel();

	}


	@Test()
	public void validateDownloadContentfromCoursesorLibraryMsgInDownloadSection() throws Exception {
		QXClient.get().driver();

		getDikshaMainPageActions().performUserOnBoarding();

		getHomePageActions().tapOnProfileTab();

		getHomePageActions().tapOnDownloadTab();

		getHomePageActions().validateDownloadSectionForGuestUser();

	}


	@Test()
	public void verifyUpcomingBatchDetailsMessageInCourse() throws Exception {

		QXClient.get().driver();
		getDikshaMainPageActions().performUserOnBoarding();
		getHomePageActions().tapOnProfileTab();


		Properties properties = QXClient.get().propUtils().getProperties(System.getProperty("user.dir") + "/configs/config.properties");
		System.out.println("@name:" +
				properties.getProperty("excelpath"));

		String fetchExcelPathFromConfig = properties.getProperty("excelpath");
		QXClient.get().excelUtils().open(fetchExcelPathFromConfig, "Excel1");

		String Username = QXClient.get().excelUtils().getCellValue("Excel1", "TestData", 2, 2);
		String Password = QXClient.get().excelUtils().getCellValue("Excel1", "TestData", 3, 2);

		QXClient.get().gestures().swipeUp();
		QXClient.get().gestures().swipeUp();

		getLoginPageActions().loginToTheUser(Username, Password);

		getHomePageActions().tapOnTrainingTab();

		getHomePageActions().tapOnSearchIcon();
		getHomePageActions().enterTextInSearchBar("UpcomingCourse");
		QXClient.get().gestures().generateXpathUsingClassAndTextAndClickElement("UpcomingCourse");

		getTrainingPageActions().verifyUpcomingBatchMessageWhileJoinCourse();


	}


	@Test()
	public void validateTimerDisplayedInCourseExpireInTwoDays() throws Exception {

		QXClient.get().driver();
		getDikshaMainPageActions().performUserOnBoarding();
		getHomePageActions().tapOnProfileTab();


		Properties properties = QXClient.get().propUtils().getProperties(System.getProperty("user.dir") + "/configs/config.properties");
		System.out.println("@name:" +
				properties.getProperty("excelpath"));

		String fetchExcelPathFromConfig = properties.getProperty("excelpath");
		QXClient.get().excelUtils().open(fetchExcelPathFromConfig, "Excel1");

		String Username = QXClient.get().excelUtils().getCellValue("Excel1", "TestData", 2, 2);
		String Password = QXClient.get().excelUtils().getCellValue("Excel1", "TestData", 3, 2);

		QXClient.get().gestures().swipeUp();
		QXClient.get().gestures().swipeUp();

		getLoginPageActions().loginToTheUser(Username, Password);

		getHomePageActions().tapOnTrainingTab();

		getHomePageActions().tapOnSearchIcon();
		getHomePageActions().enterTextInSearchBar("CourseExpireInTwoDays");
		QXClient.get().gestures().generateXpathUsingClassAndTextAndClickElement("CourseExpireInTwoDays");

		getTrainingPageActions().verifyTimerIsDisplayedInCourseTOC();

		getTrainingPageActions().leaveCourse();

		getTrainingPageActions().verifyTimerAfterUnenrollFromCourse();

	}

	@Test()
	public void validateTimerNotDisplayedInCourseWithNoEndDate() throws Exception {

		QXClient.get().driver();
		getDikshaMainPageActions().performUserOnBoarding();
		getHomePageActions().tapOnProfileTab();


		Properties properties = QXClient.get().propUtils().getProperties(System.getProperty("user.dir") + "/configs/config.properties");
		System.out.println("@name:" +
				properties.getProperty("excelpath"));

		String fetchExcelPathFromConfig = properties.getProperty("excelpath");
		QXClient.get().excelUtils().open(fetchExcelPathFromConfig, "Excel1");

		String Username = QXClient.get().excelUtils().getCellValue("Excel1", "TestData", 2, 2);
		String Password = QXClient.get().excelUtils().getCellValue("Excel1", "TestData", 3, 2);

		QXClient.get().gestures().swipeUp();
		QXClient.get().gestures().swipeUp();

		getLoginPageActions().loginToTheUser(Username, Password);

		getHomePageActions().tapOnTrainingTab();

		getHomePageActions().tapOnSearchIcon();
		getHomePageActions().enterTextInSearchBar("CourseWithNoEndDate");
		QXClient.get().gestures().generateXpathUsingClassAndTextAndClickElement("CourseWithNoEndDate");

		getTrainingPageActions().verifyTimerIsNotDisplayedInCourseTOC();

		getTrainingPageActions().leaveCourse();

		getTrainingPageActions().verifyTimerAfterUnenrollFromCourse();

	}


	@Test()
	public void verifyCreatorIsNotAbleToEnrollCourse() throws Exception {

		QXClient.get().driver();
		getDikshaMainPageActions().performUserOnBoarding();


		getHomePageActions().tapOnProfileTab();
		Properties properties = QXClient.get().propUtils().getProperties(System.getProperty("user.dir") +"/configs/config.properties"); System.out.println("@name:" +
				properties.getProperty("excelpath"));

		String fetchExcelPathFromConfig=properties.getProperty("excelpath");
		QXClient.get().excelUtils().open(fetchExcelPathFromConfig, "Excel1");

		String Username =QXClient.get().excelUtils().getCellValue("Excel1","TestData",38,2);
		String Password =QXClient.get().excelUtils().getCellValue("Excel1", "TestData",39,2);
		String coursefetch=QXClient.get().excelUtils().getCellValue("Excel1","TestData",25,2);


		getHomePageActions().tapOnDownloadTab();
		getHomePageActions().tapOnTrainingTab();

		getTrainingPageActions().verifyLoginBeforeCourseFetch();

		getHomePageActions().tapOnSearchIcon();
		getHomePageActions().enterTextInSearchBar(coursefetch);
		QXClient.get().gestures().generateXpathUsingClassAndTextAndClickElement(coursefetch);

		getTrainingPageActions().verifyLoginPopUpWhileJoinCourse();

		getLoginPageActions().loginToTheUser(Username,Password);

		getTrainingPageActions().verifyCreatorNotAbleToEnrollMessage();

	}

	@Test()
	public void verifyMyLearningSectionInHomePage () throws Exception {
		QXClient.get().driver();
		DikshaMainPageActions d = new DikshaMainPageActions();
		getDikshaMainPageActions().performUserOnBoarding();
		getHomePageActions().tapOnProfileTab();


		Properties properties = QXClient.get().propUtils().getProperties(System.getProperty("user.dir") + "/configs/config.properties");
		System.out.println("@name:" +
				properties.getProperty("excelpath"));

		String fetchExcelPathFromConfig = properties.getProperty("excelpath");
		QXClient.get().excelUtils().open(fetchExcelPathFromConfig, "Excel1");

		String Username = QXClient.get().excelUtils().getCellValue("Excel1", "TestData", 38, 2);
		String Password = QXClient.get().excelUtils().getCellValue("Excel1", "TestData", 39, 2);
		QXClient.get().gestures().swipeUp();
		QXClient.get().gestures().swipeUp();

		getLoginPageActions().loginToTheUser(Username, Password);

		getHomePageActions().tapOnMenuBar();

		getHomePageActions().verifyMyLearningInHomePage();
	}

	@Test()
	public void verifyExplorePageLabelAndFiltersInExploreSubjectPage () throws Exception {
		QXClient.get().driver();
		DikshaMainPageActions d = new DikshaMainPageActions();
		getDikshaMainPageActions().performUserOnBoarding();
		getHomePageActions().tapOnProfileTab();


		Properties properties = QXClient.get().propUtils().getProperties(System.getProperty("user.dir") + "/configs/config.properties");
		System.out.println("@name:" +
				properties.getProperty("excelpath"));

		String fetchExcelPathFromConfig = properties.getProperty("excelpath");
		QXClient.get().excelUtils().open(fetchExcelPathFromConfig, "Excel1");

		String Username = QXClient.get().excelUtils().getCellValue("Excel1", "TestData", 38, 2);
		String Password = QXClient.get().excelUtils().getCellValue("Excel1", "TestData", 39, 2);
		QXClient.get().gestures().swipeUp();
		QXClient.get().gestures().swipeUp();

		getLoginPageActions().loginToTheUser(Username, Password);

		getHomePageActions().tapOnMenuBar();

		getHomePageActions().verifyExploreCategoryLabel();

		getHomePageActions().verifyExploreSubjectAndFiltersInExplorePage();
	}



}
	  