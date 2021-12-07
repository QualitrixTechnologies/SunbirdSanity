

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

public class UOScenario {

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
	 // DikshaMainPageActions d=new DikshaMainPageActions();

	 
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

 
	
	@Test(enabled = true, groups = {"SanityTest", "FunctionalTest"}, alwaysRun = true,
          description = "verifyUserAbleToFillFrameworkAndLocationDetails")
  public void verifyUserAbleToFillFrameworkAndLocationDetails() throws Exception {
	  
	  QXClient.get().driver();
	  getDikshaMainPageActions().performUserOnBoarding();
	  Properties properties = QXClient.get().propUtils().getProperties(System.getProperty("user.dir") +"/configs/config.properties"); System.out.println("@name:" +
			  properties.getProperty("excelpath"));
			  
			  String fetchExcelPathFromConfig=properties.getProperty("excelpath");
			  QXClient.get().excelUtils().open(fetchExcelPathFromConfig, "Excel1");
			  
			  String BookName =QXClient.get().excelUtils().getCellValue("Excel1","TestData",26,2); 
			  
      getHomePageActions().tapOnSearchIcon();
      getHomePageActions().enterTextInSearchBar(BookName);
	       QXClient.get().gestures().generateXpathUsingClassAndTextAndClickElement(BookName);

    //  getTrainingPageActions().tapOnSearchedBook();
  }

	@Test(enabled = true, groups = {"SanityTest", "FunctionalTest"}, alwaysRun = true,
	          description = "verifyUserAbleToFillFrameworkAndLocationDetails")
	  public void verifyUserIsAbleToSignInToTheApp() throws Exception {
		  
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
  	
	  }
	
    @Author(name="Raju")
    
	    @Test(enabled = true, groups = {"SanityTest", "FunctionalTest"}, alwaysRun = true,description = "Verify updateProfileDetails")
	  public void verifyCustodianUserIsAbleToUpdateTheProfile() throws Exception {
	    
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

	  		  
	 		  getHomePageActions().tapOnProfileTab();
	 		  QXClient.get().gestures().swipeUp();
			  QXClient.get().gestures().swipeUp();

			  getCoursePageActions().updateProfileDetails();
	  	
	  	  
	 }
	
    @Author(name="Raju")
    
    @Test(enabled = true, groups = {"SanityTest", "FunctionalTest"}, alwaysRun = true,description = "Verify updateUserOnBoardingValues")
  public void updateUserOnBoardingValues() throws Exception {
    
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

  		  
 		  getHomePageActions().tapOnProfileTab();
			  QXClient.get().gestures().swipeUp();
			  QXClient.get().gestures().swipeUp();

 		  
  	  
  		getCoursePageActions().updateProfileDetails();
  	
  	  
 }
    @Test(enabled = true, groups = {"SanityTest", "FunctionalTest"}, alwaysRun = true,
            description = "Login with Gamil verification")
    public void verifyUserAbleToLoginWithGmail() throws Exception {
		  
		  QXClient.get().driver();
		  getDikshaMainPageActions().performUserOnBoarding();
		  
	        getHomePageActions().tapOnProfileTab();
	        QXClient.get().gestures().swipeUp();
	        QXClient.get().gestures().swipeUp();

  getHomePageActions().signInWithGoogle();
  getHomePageActions().enterGmailDetailsAndVerfiyUsrnameInProfileSec();

    }

    @Test(enabled = true, groups = {"SanityTest", "FunctionalTest"}, alwaysRun =
			  true, description = "Verify user is able to add the recover id sucessfully ")
			  public void verifyUserAbleToAddRecoverId() throws Exception {
				  QXClient.get().driver();
				  getDikshaMainPageActions().performUserOnBoarding();
				  getHomePageActions().tapOnProfileTab();
				  
				  
				  Properties properties = QXClient.get().propUtils().getProperties(System.getProperty("user.dir") +"/configs/config.properties"); System.out.println("@name:" +
				  properties.getProperty("excelpath"));
				  
				  String fetchExcelPathFromConfig=properties.getProperty("excelpath");
				  QXClient.get().excelUtils().open(fetchExcelPathFromConfig, "Excel1");
				  
				  String Username =QXClient.get().excelUtils().getCellValue("Excel1","TestData",2,2); 
				  String Password =QXClient.get().excelUtils().getCellValue("Excel1", "TestData",3,2);
				  String recoveryID =QXClient.get().excelUtils().getCellValue("Excel1", "TestData",18,2);
				  QXClient.get().gestures().swipeUp();
			        QXClient.get().gestures().swipeUp();
			  
			  getLoginPageActions().loginToTheUser(Username,Password);
			  
			  DikshaMainPageActions d=new DikshaMainPageActions();
			  QXClient.get().gestures().closeApp();  
			    d.LaunchAppHomeScreen();
				  getHomePageActions().tapOnDownloadTab();
				  
			  getHomePageActions().tapOnProfileTab();
			  getProfileEditPageActions().editRecoveryId(recoveryID);
			  }	  


			  /*
		 * @Author(name="Raju")
		 * 
		 * @Test() public void VerifyAddUser() throws Exception {
		 * 
		 * QXClient.get().driver(); getDikshaMainPageActions().performUserOnBoarding();
		 * getHomePageActions().tapOnProfileTab();
		 * 
		 * 
		 * Properties properties =
		 * QXClient.get().propUtils().getProperties(System.getProperty("user.dir")
		 * +"/configs/config.properties"); System.out.println("@name:" +
		 * properties.getProperty("excelpath"));
		 * 
		 * String fetchExcelPathFromConfig=properties.getProperty("excelpath");
		 * QXClient.get().excelUtils().open(fetchExcelPathFromConfig, "Excel1");
		 * 
		 * String Username
		 * =QXClient.get().excelUtils().getCellValue("Excel1","TestData",2,2); String
		 * Password =QXClient.get().excelUtils().getCellValue("Excel1", "TestData",3,2);
		 * QXClient.get().gestures().swipeUp(); QXClient.get().gestures().swipeUp();
		 * getLoginPageActions().loginToTheUser(Username,Password);
		 * 
		 * getHomePageActions().tapOnMenuBar();
		 * getCoursePageActions().tapOnAddAnotherUser();
		 * 
		 * String FakeName=QXClient.get().gestures().generateRandomName(); String
		 * storeFakeNameEntered= getCoursePageActions().enterName(FakeName);
		 * System.out.println(storeFakeNameEntered);
		 * getCoursePageActions().tapOnAddUserBtn();
		 * getHomePageActions().tapOnMenuBar();
		 * 
		 * getCoursePageActions().tapOnMoreOption();
		 * QXClient.get().gestures().generateXpathAndClickElement(storeFakeNameEntered);
		 * 
		 * 
		 * getCoursePageActions().tapOnChangeUser();
		 * 
		 * getCoursePageActions().tapOnTermsAndCondition();
		 * 
		 * getCoursePageActions().tapOnContinueForSwicthUser();
		 * 
		 * getHomePageActions().tapOnProfileTab();
		 * getHomePageActions().tapOnProfileTab();
		 * 
		 * 
		 * getCoursePageActions().verifyDistricAndState();
		 * 
		 * getCoursePageActions().verifyBMCValuesAfterAddingUser();
		 * getCoursePageActions().updateStateAndDistrictValues();
		 * 
		 * getCoursePageActions().updateProfileDetails();
		 * 
		 * 
		 * }
		 */

	   
		  @Author(name="Raju")
		  
		  @Test() public void AddUsers() throws Exception {
	    	
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
		  
		  
		  QXClient.get().gestures().closeApp();  
		    d.LaunchAppHomeScreen();
			  getHomePageActions().tapOnDownloadTab();

		  getHomePageActions().tapOnProfileTab();
		  getHomePageActions().tapOnProfileTab();

		  
		  getCoursePageActions().verifyDistricAndState();
		  
		  getCoursePageActions().verifyBMCValuesAfterAddingUser();
			getCoursePageActions().updateStateAndDistrictValues();

			getCoursePageActions().updateProfileDetails();

		  
		  }


	  
	 
	   
		 @Test(enabled = true, groups = {"SanityTest", "FunctionalTest"}, alwaysRun =
				  true, description = "Switch User In Menu")
				  public void SwitchUser() throws Exception {
				  
					  QXClient.get().driver();
					  getDikshaMainPageActions().performUserOnBoarding();
					  getHomePageActions().tapOnProfileTab();
					  QXClient.get().gestures().swipeUp();
			          QXClient.get().gestures().swipeUp();
					  
					  Properties properties = QXClient.get().propUtils().getProperties(System.getProperty("user.dir") +"/configs/config.properties"); System.out.println("@name:" +
					  properties.getProperty("excelpath"));
					  
					  String fetchExcelPathFromConfig=properties.getProperty("excelpath");
					  QXClient.get().excelUtils().open(fetchExcelPathFromConfig, "Excel1");
					  
					  String Username =QXClient.get().excelUtils().getCellValue("Excel1","TestData",2,2); 
					  String Password =QXClient.get().excelUtils().getCellValue("Excel1", "TestData",3,2);
					  
				  getLoginPageActions().loginToTheUser(Username,Password);
				  DikshaMainPageActions d=new DikshaMainPageActions();
				  QXClient.get().gestures().closeApp();  
				    d.LaunchAppHomeScreen();
					  getHomePageActions().tapOnDownloadTab();

				  
				  getHomePageActions().tapOnMenuBar();
				  getCoursePageActions().tapOnMoreOption();
				  getCoursePageActions().clickFirstUser();
				  getCoursePageActions().tapOnChangeUser();
				  getCoursePageActions().CheckTermsCheckBoxORClickProfile();
				  getCoursePageActions().verifyDistricAndState();
				  
				  }
		    
		    
				  @Author(name="Raju")
			  
			  @Test() public void SwitchUserLIUAAndMUA() throws Exception {
		    	
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
			  
			  
			  QXClient.get().gestures().closeApp();  
			    d.LaunchAppHomeScreen();
				  getHomePageActions().tapOnDownloadTab();

			  getHomePageActions().tapOnProfileTab();
			  getHomePageActions().tapOnProfileTab();

			  
			  getCoursePageActions().verifyDistricAndState();
			  
			  getCoursePageActions().verifyBMCValuesAfterAddingUser();
				getCoursePageActions().updateStateAndDistrictValues();

				getCoursePageActions().updateProfileDetails();

			  
			  }
		 
		
				
				  @Test()
					public void verifyUserAbleToViewFAQquestions() throws Exception {
					  
						  QXClient.get().driver();
						  getDikshaMainPageActions().performUserOnBoarding();
						  getHomePageActions().tapOnProfileTab();
						 
					  getHomePageActions().tapOnMenuBar();
					  getHomePageActions().verifyHelpSection();
					  
					}

				// WithOut login Scenrio
				@Test(enabled = true, groups = { "SanityTest", "FunctionalTest" }, alwaysRun = true, description = "verifyDataSync")
				public void VerifyNotficationBellIcon() throws Exception {
					QXClient.get().driver();
					getDikshaMainPageActions().performUserOnBoarding();

					getLibraryPageActions().verifyDataSyncs();

				}

      
				@Test()
				public void verifySwitchToNewExperiencePostOnboarding() throws Exception{
				   QXClient.get().driver();

				   getDikshaMainPageActions().performUserOnBoardingForExistingUser();

				   getHomePageActions().tapOnProfileTab();
				}
				@Test()
				public void verifyMergeAccountInSettingScreen() throws Exception {
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

				   getHomePageActions().tapOnMenuBar();

				   getHomePageActions().verifyMergeAccountInSettings();
				}
				
				
				@Test()
				public void verifyAlreadyRegisteredEmailMessage() throws Exception {

				   QXClient.get().driver();
				   getDikshaMainPageActions().performUserOnBoarding();
				   getHomePageActions().tapOnProfileTab();

				   QXClient.get().gestures().swipeUp();
				   QXClient.get().gestures().swipeUp();

				   getLoginPageActions().verifyRegisteredEmailMessageWhileRegistering();

				   
				   }
				
				
				@Test()
				public void verifyLoginPageAndSettingsScreenWhileMergeAccounts() throws Exception {
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

				   getHomePageActions().tapOnMenuBar();

				   getHomePageActions().verifyLoginPageWhileMergeAccount();
				}
				
				@Test()
				public void verifyLoginOptionsWhileLogin() throws Exception {
				   QXClient.get().driver();
				   getDikshaMainPageActions().performUserOnBoarding();
				   getHomePageActions().tapOnProfileTab();

				   QXClient.get().gestures().swipeUp();
				   QXClient.get().gestures().swipeUp();

				   getLoginPageActions().verifyDifferentLoginOptions();


				}
				
				@Test()
				public void verifyUserAbleToChangePermissions() throws Exception {
				   QXClient.get().driver();
				   getDikshaMainPageActions().performUserOnBoarding();
				   getHomePageActions().tapOnProfileTab();

				   getHomePageActions().tapOnMenuBar();

				   getHomePageActions().verifyUserCanChangePermissions();

				   QXClient.get().gestures().clkBackButton();

				   QXClient.get().gestures().clkBackButton();

				   
				}
				
				@Test()
				public void verifyUserAbleToChangeAppLanguageInMenu() throws Exception {
				   QXClient.get().driver();
				   getDikshaMainPageActions().performUserOnBoarding();
				   getHomePageActions().tapOnProfileTab();

				   getHomePageActions().tapOnMenuBar();

				   getHomePageActions().verifyUserAbleToChangeAppLanguage();

				}

	@Test()
	public void validateErrorMessageInRegisterHerePage() throws Exception {

		QXClient.get().driver();
		getDikshaMainPageActions().performUserOnBoarding();
		getHomePageActions().tapOnProfileTab();

		QXClient.get().gestures().swipeUp();
		QXClient.get().gestures().swipeUp();

		getLoginPageActions().verifyRegisterHerePage();


	}

	@Test()
	public void verifyNoSubPersonaForGuestUser() throws Exception {

		QXClient.get().driver();
		getDikshaMainPageActions().performUserOnBoarding();
		getHomePageActions().tapOnProfileTab();

		QXClient.get().gestures().swipeUp();

		getLoginPageActions().verifySubPersonaInGuestUser();

	}

	@Test()
	public void validateErrorMessageWhileUpdatingRecoveryId() throws Exception {
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
		QXClient.get().gestures().BlindWait(4000);
		DikshaMainPageActions d=new DikshaMainPageActions();
		QXClient.get().gestures().closeApp();
		d.LaunchAppHomeScreen();
		getHomePageActions().tapOnDownloadTab();

		getHomePageActions().tapOnProfileTab();
		getProfileEditPageActions().errorMessageWhileEditRecoveryID(Username);
	}



	@Test()
	public void verfiyUserAbleToSelectMultipleSubjectsWhileReportAnIssue() throws Exception {

		QXClient.get().driver();
		getDikshaMainPageActions().performUserOnBoarding();
		getHomePageActions().tapOnProfileTab();

		getHomePageActions().tapOnMenuBar();

		getHomePageActions().verifyReportIssueInHelpSection();


	}

	@Test()
	public void verifyConsentFormInSubmitDetails() throws Exception {
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

		QXClient.get().gestures().BlindWait(4000);
		DikshaMainPageActions d=new DikshaMainPageActions();
		QXClient.get().gestures().closeApp();
		d.LaunchAppHomeScreen();
		getHomePageActions().tapOnDownloadTab();

		getHomePageActions().tapOnProfileTab();

		getCoursePageActions().VerifySubmitDetailsForm();
	}

	@Test()
	public void verifyOngoingAndCompletedCourseInProfilesection() throws Exception {

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


		QXClient.get().gestures().swipeUp();

		getCoursePageActions().tapOnOngoingCourse();
		Thread.sleep(5000);
		QXClient.get().gestures().closeApp();
		d.LaunchAppHomeScreen();
		getHomePageActions().tapOnDownloadTab();

		getHomePageActions().tapOnProfileTab();



		getCoursePageActions().tapOnCompletedCourse();
		Thread.sleep(2000);

		  }

	@Test()
	public void verifyAll5LocationFieldsAreEditable() throws Exception {
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

		getHomePageActions().tapOnProfileTab();

		getProfileEditPageActions().verifyEditAll5LocationFields();

		getHomePageActions().tapOnProfileTab();

		getProfileEditPageActions().verifyProfileAfterEditing();

		getProfileEditPageActions().recheckLocationDetailsEditableInProfile();

		getHomePageActions().tapOnProfileTab();

		getProfileEditPageActions().recheckProfileAfterEditing();
	}

	@Test()
	public void verifyMandatorySubPersonaForHeadTeacherRole() throws Exception {
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

		getHomePageActions().tapOnProfileTab();

		getProfileEditPageActions().verifyMandatorySubpersona();

	}

	@Test()
	public void verifyChangeRoleAndSubRole() throws Exception {
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

		getHomePageActions().tapOnProfileTab();

		getProfileEditPageActions().changeRoleAndValidateHeadTeachersAndOfficials();

		getProfileEditPageActions().recheckLocationDetailsEditableInProfile();
	}


	@Test()
	public void updateBCSValuesInProfile() throws Exception {
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

		getHomePageActions().tapOnProfileTab();

		getProfileEditPageActions().verifyEditAll5LocationFields();
	}

	@Test(enabled = true,  alwaysRun = true,
			description = "Landed on Home page after changing Subrole in profile  ")
	public void verifyLandingOnHomePagePostChangeOfSubroleInProfile() throws Exception {
		QXClient.get().driver();
		getDikshaMainPageActions().performUserOnBoarding();
		getHomePageActions().tapOnProfileTab();
		Properties properties = QXClient.get().propUtils().getProperties(System.getProperty("user.dir") + "/configs/config.properties");
		System.out.println("@name:" +
				properties.getProperty("excelpath"));

		String fetchExcelPathFromConfig = properties.getProperty("excelpath");
		QXClient.get().excelUtils().open(fetchExcelPathFromConfig, "Excel1");

		String Username = QXClient.get().excelUtils().getCellValue("Excel1", "TestData", 43, 2);
		String Password = QXClient.get().excelUtils().getCellValue("Excel1", "TestData", 44, 2);

		QXClient.get().gestures().swipeUp();
		QXClient.get().gestures().swipeUp();

		getLoginPageActions().loginToTheUser(Username, Password);

		getHomePageActions().tapOnProfileTab();

		getProfileEditPageActions().changeSubRoleAndLandsOnHomePage();

		getHomePageActions().verifySectionsInHomePage();


	}

	@Test()
	public void validateSolutionForIncorrectProgressFAQ() throws Exception {

		QXClient.get().driver();
		getDikshaMainPageActions().performUserOnBoarding();
		getHomePageActions().tapOnProfileTab();

		getHomePageActions().tapOnMenuBar();
		getHomePageActions().verifyHelpSection();

		getHomePageActions().verifyCoursesAndCertificatesSection();

	}

	@Test()
	public void verifyBrowseDIKSHAMsgAndWelcomeMsgInNewExperience() throws Exception {

		QXClient.get().driver();

		getDikshaMainPageActions().performUserOnBoardingAndClickSwitchNewExperiecnceBtn();

		getHomePageActions().verifyHomePagePresentInsteadOfLibraryPage();

		getHomePageActions().verifyYourPreferencesMessage();

	}


	@Test()
	public void validateThreeSectionsOfSearchPage() throws Exception {
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

		getHomePageActions().verifySearchPageForDikshaNewExpreiecne();

	}

	@Test()
	public void validateMergeAccountOptionInSettingsScreenPostClickBackBtn() throws Exception {
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

		getHomePageActions().tapOnMenuBar();

		getHomePageActions().verifyMergeAccountInSettings();
	}


	@Test()
	public void verifyFAQSectionsInClassicAndJoyfulTheme() throws Exception {

		QXClient.get().driver();
		getDikshaMainPageActions().performUserOnBoarding();
		getHomePageActions().tapOnProfileTab();

		getHomePageActions().tapOnMenuBar();

		getHomePageActions().verifyFAQsSectionInClassicThemeAndJoyFulTheme();

		QXClient.get().gestures().clkBackButton();

		getHomePageActions().tapOnMenuBar();
		getHomePageActions().changeToJoyfulTheme();

		getHomePageActions().tapOnMenuBar();
		getHomePageActions().verifyFAQsSectionInClassicThemeAndJoyFulTheme();

	}

	@Test()
	public void verifyReportOtherIssueInClassicAndJoyfulTheme() throws Exception {

		QXClient.get().driver();
		getDikshaMainPageActions().performUserOnBoarding();
		getHomePageActions().tapOnProfileTab();

		getHomePageActions().tapOnMenuBar();

		getHomePageActions().verifyReportIssueInHelpSection();

		getHomePageActions().tapOnMenuBar();
		getHomePageActions().changeToJoyfulTheme();

		getHomePageActions().tapOnMenuBar();
		getHomePageActions().verifyReportIssueInHelpSection();

	}

	@Test()
	public void verifyVideoCategoryInHelpSectionForClassicAndJoyfulTheme() throws Exception {

		QXClient.get().driver();
		getDikshaMainPageActions().performUserOnBoarding();
		getHomePageActions().tapOnProfileTab();

		getHomePageActions().tapOnMenuBar();

		getHomePageActions().verifyHelpPageForVideoRelatedCategoryInClassicAndJoyfulTheme();

		QXClient.get().gestures().clkBackButton();

		getHomePageActions().tapOnMenuBar();
		getHomePageActions().changeToJoyfulTheme();

		getHomePageActions().tapOnMenuBar();
		getHomePageActions().verifyHelpPageForVideoRelatedCategoryInClassicAndJoyfulTheme();

	}


	@Test()
	public void verifyTextInRoleConfirmationAndLabelInEditLocationPage() throws Exception {

		QXClient.get().driver();
		getDikshaMainPageActions().performUserOnBoarding();
		getHomePageActions().tapOnProfileTab();

		getProfileEditPageActions().validateChooseContentPreferenceLabelInLocation();


	}

	@Test()
	public void verifyNoProfileDetailsLabelAndNoDeviceLocationForGuestUserInProfile() throws Exception {

		QXClient.get().driver();
		getDikshaMainPageActions().performUserOnBoarding();
		getHomePageActions().tapOnProfileTab();

		getProfileEditPageActions().verifyGuestUserProfilePageLabels();

	}


	@Test()
	public void verifySectionsUnderContentPreferenceLabelInProfile () throws Exception {
		QXClient.get().driver();
		DikshaMainPageActions d = new DikshaMainPageActions();
		getDikshaMainPageActions().performUserOnBoarding();
		getHomePageActions().tapOnProfileTab();


		Properties properties = QXClient.get().propUtils().getProperties(System.getProperty("user.dir") + "/configs/config.properties");
		System.out.println("@name:" +
				properties.getProperty("excelpath"));

		String fetchExcelPathFromConfig = properties.getProperty("excelpath");
		QXClient.get().excelUtils().open(fetchExcelPathFromConfig, "Excel1");

		String Username = QXClient.get().excelUtils().getCellValue("Excel1", "TestData", 36, 2);
		String Password = QXClient.get().excelUtils().getCellValue("Excel1", "TestData", 37, 2);
		QXClient.get().gestures().swipeUp();
		QXClient.get().gestures().swipeUp();

		getLoginPageActions().loginToTheUser(Username, Password);

		getHomePageActions().tapOnProfileTab();

		getHomePageActions().validateSectionsUnderContentPreferenceInProfilePage();
	}



}

    
    
    

