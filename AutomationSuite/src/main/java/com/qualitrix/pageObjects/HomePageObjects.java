package com.qualitrix.pageObjects;

import java.util.List;

import cucumber.api.java.cs.A;
import cucumber.api.java.en.And;
import cucumber.api.java.en_scouse.An;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidBy;
import io.appium.java_client.pagefactory.AndroidFindAll;
import io.appium.java_client.pagefactory.AndroidFindBy;

/**
 * This Class has all the Objects related to Home Page.
 *
 * @author Gurukiran H N
 * @version 1.0
 * @since 17/March/2020
 */
public class HomePageObjects {

    @AndroidFindAll({
    	
    	
        @AndroidBy(xpath = "//android.widget.Button[@text='burger menu']"),
            @AndroidBy(xpath = "//android.widget.Button[@text='menu']"),
            @AndroidBy(xpath = "//android.widget.Button[@text='ic_burger_menu']"),
            @AndroidBy(xpath = "//android.widget.Button[@text='burger menu']"),
            @AndroidBy(xpath = "//android.widget.Button[@text='burger menu ']")
    })
    public MobileElement menuBar;

    @AndroidFindAll({
            @AndroidBy(xpath = "//android.view.View[@text='select app langugae Language English']"),
            @AndroidBy(xpath = "//android.view.View[@text='Language']"),
            @AndroidBy(xpath = "//android.widget.Image[@text='Language']"),
            @AndroidBy(xpath = "//android.widget.Image[@text='select app langugae']"),
            @AndroidBy(xpath = "//android.widget.Button[@text='Language']"),
    })
    public MobileElement langSelection;

    @AndroidFindAll({
        @AndroidBy(xpath = "//android.view.View[@text='Reports']"),
})
public MobileElement ReportMenu;

    
    @AndroidFindAll({
            @AndroidBy(xpath = "//android.widget.Image[@text='help']"),
    })
    public MobileElement helpObj;

    @AndroidFindAll({
            @AndroidBy(xpath = "//android.widget.Image[@text='logout']"),
    })
    public MobileElement logoutObj;


    @AndroidFindAll({
            @AndroidBy(xpath = "//android.widget.Button[@text='ಕನ್ನಡ']"),
            @AndroidBy(xpath = "//android.widget.TextView[@text='ಕನ್ನಡ']"),
            @AndroidBy(xpath = "//android.view.View[@text='Choose Your Preferred Language']//following::android.widget.Button[6]"),
    })
    public MobileElement selectKannadaLang;
    
    
    @AndroidFindAll({
    	
 	   @AndroidBy(xpath = "//android.view.View[@text='Teacher']"),
 })
 public MobileElement sltTeacherAsses;
 
    
    
    @AndroidFindAll({
    	
 	   @AndroidBy(xpath = "//android.view.View[@text='AutomationResource']"),
 })
 public MobileElement sltAutomationResrce;
 
    
    @AndroidFindAll({
    	
  	   @AndroidBy(xpath = "//android.widget.Button[@text='download']"),
  })
  public MobileElement clkDownloadIconAssemtCont; 
    
    @AndroidFindAll({
    	
   	   @AndroidBy(xpath = "//android.widget.Button[@text='Allow']"),
   })
   public MobileElement clkAllowAcces; 
  
    
    
    @AndroidFindBy(xpath = "//android.view.View[@text='English']")
    public MobileElement selectEngLang;

    @AndroidFindAll({
            @AndroidBy(xpath = "//android.view.View[@text='qrscanner']"),
            @AndroidBy(xpath = "//android.view.View[@text='qrscanner ']"),
            @AndroidBy(xpath = "//*[contains(@text,'qrscanner')]")
    })
    public MobileElement qrCode;

    @AndroidFindAll({
        @AndroidBy(xpath = "//android.view.View[@text='profile']"),
            @AndroidBy(xpath = "//android.view.View[@text='profile Profile']"),
            @AndroidBy(xpath = "//android.view.View[@text='profile Profile ']"),
            @AndroidBy(xpath = "//*[contains(@text,'profile Profile')]")
    })
    public MobileElement profilePageTab;

    @AndroidFindAll({
        @AndroidBy(xpath = "//android.view.View[@text='downloads']"),
            @AndroidBy(xpath = "//android.view.View[@text='downloads Downloads']"),
            @AndroidBy(xpath = "//android.view.View[@text='downloads Downloads ']"),
            @AndroidBy(xpath = "//*[contains(@text,'downloads Downloads')]")
    })
    public MobileElement downloadTab;

  
    @AndroidFindAll({
        @AndroidBy(xpath = "//android.view.View[@text='courses']"),
            @AndroidBy(xpath = "//android.view.View[@text='courses Trainings']"),
            @AndroidBy(xpath = "//android.view.View[@text='courses Trainings ']"),
            @AndroidBy(xpath = "//*[contains(@text,'courses Trainings')]"),
            @AndroidBy(xpath = "//android.view.View[@text='courses Courses']"),
               })
    public MobileElement trainingTab;

    @AndroidFindAll({
            @AndroidBy(xpath = "//android.view.View[@text='resources Library']"),
            @AndroidBy(xpath = "//android.view.View[@text='resources Library ']"),
            @AndroidBy(xpath = "//*[contains(@text,'resources Library')]"),
            @AndroidBy(xpath = "//android.view.View[@text='resources']")
    })
    public MobileElement libraryTab;

    @AndroidFindAll({
            @AndroidBy(xpath = "//android.view.View[@text='MathematicsClass 10']"),
            @AndroidBy(xpath = "//android.view.View[@text='MathematicsClass 6']"),
            @AndroidBy(xpath = "//android.view.View[@text='MathematicsClass 7']"),
            @AndroidBy(xpath = "//android.view.View[@index='3']")
    })
    public MobileElement mathBookObj;
  
   
   @AndroidFindBy(xpath = "//android.view.View[@text='Showing 100 results for1 'maths'']")
    
    public MobileElement searchedBookResults;

    @AndroidFindAll({
            @AndroidBy(xpath = "//android.widget.Button[@text='CONTINUE arrow round forward']")
    })
    public MobileElement continueBtn;

    
    
    @AndroidFindAll({
    	@AndroidBy(xpath = "//android.widget.Button[@text='ಮುಂದುವರೆಸಿ']"),
    	@AndroidBy(xpath = "//android.widget.Button[@text='ಮುಂದುವರೆಸಿ arrow round forward']"),
    	@AndroidBy(xpath = "//android.widget.Button[@text='CONTINUE arrow round forward']"),

    	

    	
    	 })
public MobileElement kanndaContinuebutton;
    
   
   
  
    @AndroidFindAll({
        @AndroidBy(xpath = "//android.widget.Button[@text='search']"),
            @AndroidBy(xpath = "//android.widget.Button[@text='ic_search']"),
            @AndroidBy(xpath = "//*[contains(@text,'search')]"),

            
    })
    public MobileElement searchIcon;

    @AndroidFindAll({
            @AndroidBy(xpath = "//android.widget.Button[@text='ic_action_search']"),
            @AndroidBy(xpath = "//android.widget.Button[@text='ic_action_search ']"),
            @AndroidBy(xpath = "//android.widget.Button[@text='search']"),
            @AndroidBy(xpath = "//android.widget.Button[@text='search ']")
    })
    public MobileElement actionSearchIcon;

    @AndroidFindBy(className = "android.widget.EditText")
    public MobileElement searchBar;

    @AndroidFindBy(xpath = "//android.widget.Button[@text='SEE MORE BOOKS AND CONTENT']")
    public MobileElement seeMoreBooksObj;

    @AndroidFindBy(xpath = "//*[@resource-id='tab-button-resources']")
    public MobileElement resourcesTab;

    @AndroidFindBy(xpath = "//*[@resource-id='buttonColors']")
    public MobileElement gotItBtn;
    
    
  
    
  
    
    @AndroidFindAll({
        @AndroidBy(xpath = "//android.widget.Button[@text='My groups']"),
        @AndroidBy(xpath = "//android.view.View[contains(@text,'More ')]//following::android.view.View[3]")
})
public MobileElement clkMyGroups;

    
    
    
    
    @AndroidFindAll({
        @AndroidBy(xpath = "//android.widget.Image[@text='my-group']//following::android.widget.Button"),
        @AndroidBy(xpath = "//android.view.View[@text='You are just a step away from creating a group']//following::android.widget.Button")
})
public MobileElement clkCreateGroup;

    
    @AndroidFindAll({
        @AndroidBy(xpath = "//android.view.View[@text='Group name']//following::android.widget.EditText"),
            @AndroidBy(xpath = "//android.widget.TextView[@text='Group name']//following::android.widget.EditText"),
})
public MobileElement enterGroupName;
  

    @AndroidFindAll({
        @AndroidBy(xpath = "//android.view.View[@text='Group name']//following::android.widget.EditText[2]"),
            @AndroidBy(xpath = "//android.widget.TextView[@text='Group name']//following::android.widget.EditText[2]"),
})
public MobileElement enterGroupDesc;
    
    @AndroidFindAll({
        @AndroidBy(xpath = "//android.widget.CheckBox[@index='1']"),
})
public MobileElement clkTermsAndCondition;
  
    @AndroidFindAll({
        @AndroidBy(xpath = "//android.widget.CheckBox[@index='1']//following::android.widget.Button"),
})
public MobileElement clkGroupForCreation;
    
    
    @AndroidFindAll({
        @AndroidBy(xpath = "//android.view.View[@text='My groups']//following::android.view.View"),
})
public MobileElement clkFirstCreateGroup;
  
    @AndroidFindAll({
        @AndroidBy(xpath = "//android.widget.Button[@text='+ Add activity']"),
})
public MobileElement clkAddActivity;
  
    @AndroidFindAll({
        @AndroidBy(xpath = "//android.view.View[@text='Courses']"),
        @AndroidBy(xpath = "//android.view.View[@text='Course']"),

})
public MobileElement clkCourseInActivity;
 
    
   
    @AndroidFindBy(xpath = "//android.widget.Button[@text='Next']")
    public MobileElement clkNextButtonInActivity;
    

    @FindBy(className = "android.view.View")
    public List<WebElement> closeIcon;

    
    @AndroidFindAll({
        @AndroidBy(xpath = "//android.view.View[@text='Recommendations based on your profile details']//following::android.view.View[1]"),
        @AndroidBy(xpath = "//android.widget.Image[@index='0']"),
        @AndroidBy(xpath = "//android.view.View[@text='Recommendations based on your profile details']//following::android.widget.Image[1]"),

      
})
public MobileElement clkFirstCourseForActivity;
 
    
    @AndroidFindBy(xpath = "//android.widget.Button[@text='Add for group']")
    public MobileElement clkAddForGroupBtn;
    
    @AndroidFindAll({
        @AndroidBy(xpath = "//android.view.View[@text='Course']//following::android.view.View[@text='⠇']"),
        @AndroidBy(xpath = "//android.view.View[@text='Course']"),

})
public MobileElement verifyAddedMemberToGrp;
  
    @AndroidFindBy(xpath = "//android.widget.Button[@text='close-icon']")
    public MobileElement clkCloseIconGrp;
  
    @AndroidFindBy(xpath = "//android.view.View[@text='My groups']//following::android.widget.Image")
    public MobileElement clkAddImgGrp;
  
    @AndroidFindAll({
        @AndroidBy(xpath = "//android.widget.Image[@text='share social']"),
        @AndroidBy(xpath = "//android.widget.Image[@text='share']"),
            @AndroidBy(xpath = "//android.widget.Image[@text='Share profile']"),
    })
    public MobileElement clkDikshaShareId;
    

    
  

    @AndroidFindAll({
        @AndroidBy(xpath = "//android.view.View[@text='Programs']"),
            @AndroidBy(xpath = "//android.widget.Button[@text='Programs']"),
    })
    public MobileElement clkPrograms;

    @AndroidFindAll({
        @AndroidBy(xpath = "//android.view.View[@text='Projects']"),
            @AndroidBy(xpath = "//android.widget.Button[@text='Projects']"),
    })
    public MobileElement clkProjects;


    @AndroidFindAll({
        @AndroidBy(xpath = "//android.view.View[@text='Observations']"),
            @AndroidBy(xpath = "//android.widget.Button[@text='Observations']"),
    })
    public MobileElement clkObservations;


    @AndroidFindAll({
        @AndroidBy(xpath = "//android.view.View[@text='Surveys']"),
            @AndroidBy(xpath = "//android.widget.Button[@text='Surveys']"),
    })
    public MobileElement clkSurveys;


    @AndroidFindAll({
        @AndroidBy(xpath = "//android.view.View[@text='Courses']"),
            @AndroidBy(xpath = "//android.widget.Button[@text='Courses']"),
    })
    public MobileElement clkCourses;


    @AndroidFindAll({
        @AndroidBy(xpath = "//android.view.View[@text='Reports']"),
            @AndroidBy(xpath = "//android.widget.Button[@text='Reports']"),
    })
    public MobileElement clkReports;


    
    @AndroidFindAll({
        @AndroidBy(xpath = "//android.widget.Image[@text='ellipsis vertical']"),
    })
    public MobileElement clkMenuInGroup;

    
    @AndroidFindAll({
        @AndroidBy(xpath = "//android.view.View[@text='Enable discussions']"),
    })
    public MobileElement clkEnableDiscussions;

    
    
    @AndroidFindAll({
        @AndroidBy(xpath = "//android.view.View[@text='Disable discussions']"),
    })
    public MobileElement clkDisableDiscussion;

    
    @AndroidFindAll({
        @AndroidBy(xpath = "//android.widget.Button[@text='Disable Discussions']"),
    })
    public MobileElement clkPopupDisableDiscussion;

    
    @AndroidFindAll({
            @AndroidBy(xpath = "//android.widget.Button[@text='access discussion forum']"),
            @AndroidBy(xpath = "//android.widget.Button[@text='more actions menu']//preceding::android.widget.Button[1]"),
        @AndroidBy(xpath = "//android.widget.Image[@index='0']"),
        @AndroidBy(xpath = "//android.widget.Image[@text='more']//preceding::android.widget.Image"),


    })
    public MobileElement clkenableDisIcon;
    
    @AndroidFindAll({
        @AndroidBy(xpath = "//android.view.View[@text='0 Discussions']"),
        @AndroidBy(xpath = "//android.view.View[@text='0 discussions']"),

    })
    public MobileElement verify0Discussions;

  
    @AndroidFindAll({
        @AndroidBy(xpath = "//android.widget.Button[@text='Start Discussion']"),
    })
    public MobileElement clkStartDiscussion;

    @AndroidFindAll({
        @AndroidBy(xpath = "//android.view.View[@text='Ask A Question Or Post An Idea']//following::android.widget.EditText"),
        @AndroidBy(xpath = "//android.widget.EditText[@index='0']"),

    })
    public MobileElement askaQuesTextBox;
    
    @AndroidFindAll({
        @AndroidBy(xpath = "//android.view.View[@text='Please Elaborate Your Question Or Idea Here']//following::android.widget.EditText"),
        @AndroidBy(xpath = "//android.view.View[@text='Please elaborate your question or idea here']//following::android.widget.EditText"),

    })
    public MobileElement enterIdeaTxtBox;
    
    @AndroidFindAll({
        @AndroidBy(xpath = "//android.widget.Button[@text='Submit']"),
    })
    public MobileElement clkAsaQueSubmitBtn;

    @AndroidFindAll({
        @AndroidBy(xpath = "//android.view.View[@text='1 Discussions']"),
        @AndroidBy(xpath = "//android.view.View[@text='1 discussions']"),

    })
    public MobileElement verify1Discussions;

    @AndroidFindAll({
        @AndroidBy(xpath = "//android.view.View[@text='1 Posts']"),
        @AndroidBy(xpath = "//android.view.View[@text='1 posts']"),

    })
    public MobileElement verify1Posts;

    
    
    @AndroidFindAll({
        @AndroidBy(xpath = "//android.view.View[@text='0 Posts']"),
        @AndroidBy(xpath = "//android.view.View[@text='0 posts']"),

    })
    public MobileElement verify0Posts;

    
    @AndroidFindAll({
        @AndroidBy(xpath = "//android.widget.Button[@text='☰']"),
    })
    public MobileElement clickHambugMenuForum;
    
    @AndroidFindAll({
        @AndroidBy(xpath = "//android.widget.TextView[@text='Categories']"),
    })
    public MobileElement verifyCatogries;
    
    @AndroidFindAll({
        @AndroidBy(xpath = "//android.widget.TextView[@text='Tags']"),
    })
    public MobileElement verifyTags;
    
    @AndroidFindAll({
        @AndroidBy(xpath = "//android.view.View[@text='My Discussions']"),
        
        @AndroidBy(xpath = "//android.widget.TextView[@text='My discussions']"),

    })
    public MobileElement verifyDiscussion;
    
    
    @AndroidFindAll({
        @AndroidBy(xpath = "//android.widget.Button[@text='Recent Posts']"),
        @AndroidBy(xpath = "//android.widget.Button[@text='Recent posts']"),

    })
    public MobileElement verifyRecentPosts;
    
    
    @AndroidFindAll({
        @AndroidBy(xpath = "//android.widget.Button[@text='Best Posts']"),
        @AndroidBy(xpath = "//android.widget.Button[@text='Best posts']"),

    })
    public MobileElement verifyBestPosts;
    
    
    @AndroidFindAll({
        @AndroidBy(xpath = "//android.widget.Button[@text='Saved Posts']"),
        @AndroidBy(xpath = "//android.widget.Button[@text='Saved posts']"),

    })
    public MobileElement verifySavedPosts;
    
    
    @AndroidFindAll({
        @AndroidBy(xpath = "//android.widget.Button[@text='Upvoted']"),

    })
    public MobileElement verifyUpvoted;
    
    
    @AndroidFindAll({
        @AndroidBy(xpath = "//android.widget.Button[@text='Downvoted']"),
    })
    public MobileElement verifyDownVoted;
    

    
    @AndroidFindAll({
        @AndroidBy(xpath = "//android.view.View[@text='Delete group']"),
    })
    public MobileElement clkDeleInMenuGrp;
    
    @AndroidFindAll({
        @AndroidBy(xpath = "//android.widget.Button[@text='Delete']"),
    })
    public MobileElement clkDeleteInPopUp;


    @AndroidFindAll({
            @AndroidBy(xpath = "//android.view.View[@text='select app langugae ಭಾಷೆ ಕನ್ನಡ']"),

            @AndroidBy(xpath = "//android.view.View[@text='ಕನ್ನಡ']"),
    })
    public MobileElement verifyKannadaText;

    @AndroidFindAll({
            @AndroidBy(xpath = "//android.widget.TextView[@text='app settings ಸೆಟ್ಟಿಂಗ್ಸ್']"),
            @AndroidBy(xpath = "//android.widget.Button[@text='ಸೆಟ್ಟಿಂಗ್ಸ್']"),
            @AndroidBy(xpath = "//android.widget.TextView[@text='ಸಹಾಯ']"),
            @AndroidBy(xpath = "//android.view.View[@text='ಸೆಟ್ಟಿಂಗ್ಸ್']"),
    })
    public MobileElement verifySetingInKannada;
    
    
    @AndroidFindAll({
        @AndroidBy(xpath = "//android.view.View[@text='Members (1)']"),
    })
    public MobileElement clkMembersGrp;

    @AndroidFindAll({
            @AndroidBy(xpath = "//android.widget.EditText[@index='1']//following::android.widget.Image"),
            @AndroidBy(xpath = "//android.view.View[contains(@text,'Add')]"),
    })
    public MobileElement clkAddMembers;
    
    @AndroidFindBy(className = "android.widget.EditText")
    public MobileElement clkEnterDikshaID;

    @AndroidFindAll({
        @AndroidBy(xpath = "//android.widget.Button[@text='Verify']"),
    })
    public MobileElement clkVerifyBtn;
    
    
    @AndroidFindAll({
        @AndroidBy(xpath = "//android.view.View[@index='4']//following::android.widget.Button"),
    })
    public MobileElement clkAddToGrp;
    
    @AndroidFindAll({
        @AndroidBy(xpath = "//android.view.View[@text='⠇']"),
    })
    public MobileElement menuMember;
    
    @AndroidFindAll({
        @AndroidBy(xpath = "//android.view.View[@text='Remove from group']"),
    })
    public MobileElement clkRemoveMembers;
    
    @AndroidFindAll({
        @AndroidBy(xpath = "//android.widget.Button[@text='Remove Member']"),
    })
    public MobileElement clkRemoveMembersPopup;
    
    
    @AndroidFindAll({
        @AndroidBy(xpath = "//android.view.View[@text='Course']//following::android.view.View[@text='⠇']"),

})
public MobileElement clkMenuActivity;
    
    @AndroidFindBy(xpath = "//android.view.View[@text='Remove activity']")
    public List<WebElement> clkRemoveActivity;
    
    @AndroidFindAll({
        @AndroidBy(xpath = "//android.widget.Button[@text='Remove']"),

})
public MobileElement clkRemovePopupActivity;
    
  
    @AndroidFindBy(xpath = "//android.widget.Button[@text='notification']")
    public MobileElement clkNotificationIcon;
    
    @AndroidFindBy(xpath = "//android.widget.Button[@text='Yes']")
    public MobileElement clkYes;
    
    @AndroidFindBy(xpath = "//android.widget.Button[@text='No']")
    public MobileElement clkNo;
    
    @AndroidFindBy(xpath = "//android.view.View[@text='Course']")
    public MobileElement recentlySearchedKeyword;

    @AndroidFindAll({
            @AndroidBy(xpath = "//android.widget.TextView[@text='Help']"),
            @AndroidBy(xpath = "//android.view.View[@text='help Help']"),
            @AndroidBy(xpath = "//android.view.View[@text='Help']"),
            @AndroidBy(xpath = "//android.widget.Button[@text='Help']"),
    })
    public MobileElement clkHelpMenu;
    
    @AndroidFindBy(xpath = "//android.view.View[@text='Frequently asked questions']//following::android.view.View[3]")
    public MobileElement verifyFQAQestions;
    

    @AndroidFindBy(xpath = "//android.widget.Button[@resource-id='close-discussion-forum']")
    public MobileElement clkCloseIconDF;
    

    @AndroidFindBy(xpath = "//android.view.View[@text='Question']")
    public MobileElement clkCreaedQues;

    @AndroidFindAll({
            @AndroidBy(xpath = "//android.view.View[@text='darkmode Switch to dark mode']"),
            @AndroidBy(xpath = "//android.widget.TextView[@text='Switch to dark mode']"),
            @AndroidBy(xpath = "//android.widget.Button[@text='Switch to dark mode']"),
    })
    public MobileElement clkSwitchDarkMode;

    @AndroidFindAll({
            @AndroidBy(xpath = "//android.widget.TextView[@text='Switch to default']"),
            @AndroidBy(xpath = "//android.view.View[@text='darkmode Switch to default']"),
            @AndroidBy(xpath = "//android.widget.Button[@text='Switch to default']"),
    })
    public MobileElement clkSwitchToDefault;


    @AndroidFindBy(xpath = "//android.view.View[@text='help Switch to classic DIKSHA experience']")
    public MobileElement clkSwitchClassDiksExpr;
    
    @AndroidFindBy(xpath = "//android.view.View[@text='Create New Project']")
    public MobileElement clkOnCreateNewProj;
    
    
    @AndroidFindBy(xpath = "//android.widget.Button[@text='Do not share']")
    public MobileElement clkDoNotShare;


    @AndroidFindAll({
            @AndroidBy(xpath = "//android.view.View[@text='Projects Created by me']//following::android.view.View[1]"),
            @AndroidBy(xpath = "//android.view.View[@text='Created by me']//following::android.view.View[1]"),
    })
    public MobileElement clkFirstProject;



    @AndroidFindBy(xpath = "//android.view.View[@text='Name your project']")
    public MobileElement EnterNameYourProject;
    
    
    @AndroidFindBy(xpath = "//android.view.View[@text='What is the Objective of your Project?']")
    public MobileElement EnterDesciprtion;

    @AndroidFindAll({
            @AndroidBy(xpath = "//android.view.View[@text='Select category(s)']"),
            @AndroidBy(xpath = "//android.view.View[@text='pricetag outline Select category(s)']")
    })
    public MobileElement clkCategories;
    
    @AndroidFindBy(xpath = "//android.widget.CheckBox[@text='Teachers']")
    public MobileElement sltTeachersInCategry;
    
    @AndroidFindBy(xpath = "//android.widget.Button[@text='SUBMIT']")
    public MobileElement clkSubmit;
    
    @AndroidFindBy(xpath = "//android.widget.Button[@text='CREATE AND CONTINUE']")
    public MobileElement clkCreateAndContinue;
    
    @AndroidFindBy(xpath = "//android.view.View[@text='Your Project has been created successfully']")
    public MobileElement assertProjectCreationMsg;
    
    @AndroidFindBy(xpath = "//android.widget.Button[@text='CONTINUE']")
    public MobileElement clkContinueBtn;
    
   
    @AndroidFindBy(xpath = "//android.view.View[@text='View Project']")
    public MobileElement clkViewProject;
    
    @AndroidFindBy(xpath = "//android.widget.Button[@text='VIEW PROJECT']")
    public MobileElement clkProjectView;
    
    @AndroidFindBy(xpath = "//android.view.View[@text='Project title : AutomationProject']")
    public MobileElement createdProjectTitle;
    
    @AndroidFindBy(xpath = "//android.view.View[@text='Objective : DescriptionProject']")
    public MobileElement createdProjectObjective;
    
    @AndroidFindBy(xpath = "//android.widget.Button[@text='ellipsis vertical']")
    public MobileElement clkHamburgeMenu;
    
    @AndroidFindBy(xpath = "//android.view.View[@text='Edit']")
    public MobileElement clkEditMenu;
    
    
    @AndroidFindBy(xpath = "//android.widget.Image[@text='create']")
    public MobileElement clkCreateIcon;
    
    @AndroidFindBy(xpath = "//android.widget.EditText[@text='AutomationProject']")
    public MobileElement clkEditProject;
    
    @AndroidFindBy(xpath = "//android.widget.EditText[@text='DescriptionProject']")
    public MobileElement clkEditProjectDesc;
    
    @AndroidFindBy(xpath = "//android.widget.Button[@text='SAVE EDITS']")
    public MobileElement clkEditProjectSave;
    
    @AndroidFindBy(xpath = "//android.view.View[@text='Project title : AutomationProjectUpdatedAutomationProject']")
    public MobileElement assertUpdatedProjectName;
    
    
    @AndroidFindBy(xpath = "//android.view.View[@text='Objective : DescriptionProjectUpdatedDescriptionProject']")
    public MobileElement assertUpdatedObjectiveDesc;
    
    @AndroidFindBy(xpath = "//android.widget.Image[@text='cloud upload']")
    public MobileElement clkCloudUploadBtn;
    
    @AndroidFindBy(xpath = "//android.view.View[@text='The project is synced successfully']")
    public MobileElement assertMsgSync;
    
    
    @AndroidFindBy(xpath = "//android.widget.Image[@text='cloud done']")
    public MobileElement assertCloudDoneBtn;
    

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='My learning']")
    public MobileElement assertMyLearningSection;
    
    

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Browse by subject']")
    public MobileElement assertBrowseBySubject;
    
    
    

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Browse by category']")
    public MobileElement assertBrowseByCategory;
    
    

    @AndroidFindBy(xpath = "//android.widget.Button[@text='Digital Textbook']")
    public MobileElement clkBrowseByCategorySection;
    
    @AndroidFindBy(xpath = "//android.view.View[@text='Course']//following::android.view.View[1]")
    public MobileElement assertContentAfterClkingSection;


    @AndroidFindAll(
            @AndroidBy(xpath = "//android.widget.Button[@text='Digital Textbook']//following::android.view.View[3]")
    )
    public MobileElement assertContentAfterClkingSection1;

    
    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Browse by subject']//following::android.widget.Button[1]")
    public MobileElement clkBrowseBySubjectSection;
    
    
    @AndroidFindAll({
            @AndroidBy(xpath = "//android.view.View[@text='discover']"),
    })
    public MobileElement clkSearchIcon;
    
    @AndroidFindBy(xpath = "//android.view.View[@text='Popular categories']")
    public MobileElement assertPopularCatrgories;
    
    @AndroidFindBy(xpath = "//android.view.View[@text='Explore content from other boards']")
    public MobileElement assertExploreContentFromOtherBoards;
    
    @AndroidFindBy(xpath = "//android.view.View[@text='Explore content for a variety of audience']")
    public MobileElement assertExploreContentForVarietyOfAudience;


    @AndroidFindAll({
            @AndroidBy(xpath = "//android.widget.TextView[@text='Try new DIKSHA experience']"),
            @AndroidBy(xpath = "//android.widget.TextView[contains(@text,'Try new DIKSHA')]"),
            @AndroidBy(xpath = "//android.view.View[@text='help Try new DIKSHA experienceBeta']"),
            @AndroidBy(xpath = "//android.widget.TextView[@text='Try new diksha_ntptest_org experience']"),
            @AndroidBy(xpath = "//android.widget.TextView[contains(@text,'Try new')]"),
    })
    public MobileElement clkNewDikshExperiece;
 
    @AndroidFindBy(xpath = "//android.widget.Button[@text='Digital Textbook']")
    public MobileElement assertDigitalTextBookSection;
    
    @AndroidFindBy(xpath = "//android.widget.Button[@text='Courses']")
    public MobileElement assertCourseSection;
    
    @AndroidFindBy(xpath = "//android.widget.Button[@text='Tv Classes']")
    public MobileElement assertTVClassesSection;
    
    @AndroidFindBy(xpath = "//android.widget.Button[@text='Videos']")
    public MobileElement assertVideoSection;
    
    @AndroidFindBy(xpath = "//android.widget.Button[@text='Audio']")
    public MobileElement assertAudioSection;
    
    @AndroidFindBy(xpath = "//android.widget.Button[@text='Interactive Content']")
    public MobileElement assertInteractiveContentSection;
    
    @AndroidFindBy(xpath = "//android.widget.Button[@text='Igot-health']")
    public MobileElement assertIGotSecInExploreContentFromOtherBoards;
    
    @AndroidFindBy(xpath = "//android.widget.Button[@text='Teacher']")
    public MobileElement assertTeacherSecInExploreContentForVarietyAudience;


    @AndroidFindBy(xpath = "//android.widget.Button[@text='Student']")
    public MobileElement assertStudentAudience;



    @AndroidFindAll({
            @AndroidBy(xpath = "//android.view.View[@text='Created By Me']"),
            @AndroidBy(xpath = "//android.view.View[@text='Created by me']")
    })
    public MobileElement assertCreatedByMeFilter;

    @AndroidFindAll({
            @AndroidBy(xpath = "//android.view.View[@text='Assigned To Me']"),
            @AndroidBy(xpath = "//android.view.View[@text='Assigned to me']")
    })
    public MobileElement assertAssignedToMe;
    
    @AndroidFindBy(xpath = "//android.view.View[@text='Skip']")
    public MobileElement clkSkipBtn;
    
    @AndroidFindBy(xpath = "//android.view.View[@text='Select category(s)']")
    public MobileElement clkSltCatgories;
    
    @AndroidFindBy(xpath = "//android.widget.CheckBox[@text='Students']")
    public MobileElement sltStudentCategory;
    
    @AndroidFindBy(xpath = "//android.view.View[@text='Category : Teachers , Students ,']")
    public MobileElement assertUpdatedCategory;
    
    
    @AndroidFindBy(xpath = "//android.view.View[@text='Share']")
    public MobileElement clkonMenuShare;
    
    
    
    @AndroidFindBy(xpath = "//android.widget.Button[@text='SYNC & SHARE']")
    public MobileElement clkonSyncAndShareBtn;
    
    @AndroidFindAll({
        @AndroidBy(xpath = "//android.widget.Image[@text='eye icon']"),
})
public MobileElement clkEyeIcon;
@AndroidFindAll({
        @AndroidBy(xpath = "//android.widget.Button[@resource-id='start-discussion']//following::android.view.View[3]"),
})
public MobileElement clkOnDiscussion;
@AndroidFindAll({
        @AndroidBy(xpath = "//android.view.View[@resource-id='group-actions']"),
})
public MobileElement clkOnKebabMenu;
@AndroidFindAll({
        @AndroidBy(xpath = "//android.view.View[@text='Edit']"),
})
public MobileElement clkEditOption;
@AndroidFindAll({
        @AndroidBy(xpath = "//android.widget.Button[@text='☰']//following::android.view.View[3]"),
})
public MobileElement updatedTitle;
@AndroidFindAll({
        @AndroidBy(xpath = "//android.widget.Button[@text='☰']//following::android.view.View[5]"),
})
public MobileElement updatedDesc;
@AndroidFindAll({
        @AndroidBy(xpath = "//android.widget.EditText"),
})
public MobileElement commentsSection;
@AndroidFindAll({
        @AndroidBy(xpath = "//android.widget.Button[@text='Post Reply']"),
        @AndroidBy(xpath = "//android.widget.Button[@resource-id='update-post']"),
})
public MobileElement clkPostReply;
@AndroidFindAll({
        @AndroidBy(xpath = "//android.widget.Button[@text='Reply']"),
})
public MobileElement clkReplyButton;
@AndroidFindAll({
        @AndroidBy(xpath = "//android.widget.Image[@text='delete']"),
})
public MobileElement clkOnDeleteBtn;
@AndroidFindAll({
        @AndroidBy(xpath = "//android.widget.Button[@text='OK']"),
        @AndroidBy(xpath = "//android.widget.Button[@resource-id='android:id/button1']"),
})
public MobileElement clkOkBtn;
@AndroidFindAll({
        @AndroidBy(xpath = "//android.widget.Button[@text='CANCEL']"),
        @AndroidBy(xpath = "//android.widget.Button[@resource-id='android:id/button2']"),
})
public MobileElement clkCancelBtn;
@AndroidFindAll({
        @AndroidBy(xpath = "//android.view.View[@text='Delete']"),
        @AndroidBy(xpath = "//android.view.View[@resource-id='delete-topic']"),
})
public MobileElement deleteDiscussion;
@AndroidFindAll({
        @AndroidBy(xpath = "//android.widget.TextView[@text='My groups']//following::android.view.View[1]"),
        @AndroidBy(xpath = "//android.widget.Button[@text='group information']//following::android.view.View[9]"),
})
public MobileElement clkFirstGroup;

@AndroidFindAll({
    @AndroidBy(xpath = "//android.widget.Button[@text='Discard']//following::android.widget.Button[@index=1]"),
    @AndroidBy(xpath = "//android.widget.Button[@text='Update']"),
   @AndroidBy(xpath = "//android.widget.Button[@resource-id='update-topic-popup']"),
})
public MobileElement clkUpdateBtn;

@AndroidFindAll({
    @AndroidBy(xpath = "//android.view.View[@text='Tags']//following::android.widget.EditText"),
})
public MobileElement tagsField;








































    @AndroidFindAll({
            @AndroidBy(xpath = "//android.view.View[@text='Projects Created by me']//following::android.view.View[1]"),
            @AndroidBy(xpath = "//android.view.View[@text='Created by me']//following::android.view.View[1]"),

    })
    public MobileElement viewproject;
    
    @AndroidFindAll({
    	@AndroidBy(xpath = "//android.widget.TextView[@text='New task']"),
	@AndroidBy(xpath = "//android.widget.Button[@text='close add']")})

	public MobileElement clknewtask;




    @AndroidFindAll({
            @AndroidBy(xpath = "//android.widget.EditText"),
            @AndroidBy(xpath = "//android.view.View[@text='Assigned to']//following::android.widget.EditText[1]")
    })
    public MobileElement clkassignedtoobj;
    	
    	@AndroidFindBy(xpath = "//android.view.View[@text='End date']")
    	public MobileElement clkondatecalender;
    	
    	@AndroidFindBy(xpath = "//android.widget.Button[@text='DONE']")
    	public MobileElement clkoncurrentdate;
    	
    	@AndroidFindBy(xpath = "//android.view.View[@text='Assigned to']//following::android.widget.EditText[2]")
    	public MobileElement clktaskdescriptionobj;
    	
    	@AndroidFindBy(xpath = "//android.widget.Button[@text='Add Task']")
    	public MobileElement clkaddtask;
    	
    	@AndroidFindBy(xpath = "//android.widget.Image[@text='ellipsis vertical outline']")
    	public MobileElement clkonverticalmenu;
    	
    	
    	 @AndroidFindAll({
    	    	@AndroidBy(xpath = "//android.view.View[@text='Edit']"),
    		@AndroidBy(xpath = "//android.view.View[@text='Edit create']")})
    		public MobileElement clkonverticalmenuedit;
    	
    
    	@AndroidFindBy(xpath = "//android.widget.Image[@index='1']")
    	public MobileElement clkoneditassigntask;
    	
    	@AndroidFindBy(xpath = "//android.view.View[@text='Not Started']")
    	public MobileElement clkonstatusedit;
    	
    	@AndroidFindBy(xpath = "//android.widget.RadioButton[@text='Completed']")
    	public MobileElement clkoneditcompleted;
    	
    	@AndroidFindBy(xpath = "//android.widget.Button[@text='OK']")
    	public MobileElement clkonok;
    	
    	@AndroidFindBy(xpath = "//android.widget.Image[@text='create'and @index='0']")
    	public MobileElement clkeditassigntask;

    @AndroidFindAll({
            @AndroidBy(xpath = "//android.widget.EditText"),
            @AndroidBy(xpath = "//android.view.View[@text='Edit Assignee’s Name']//following::android.widget.EditText")
    })

    public MobileElement editassignname;
    	
    	@AndroidFindBy(xpath = "//android.widget.Button[@text='SAVE']")
    	public MobileElement clksavebutton;
    	
    	@AndroidFindBy(xpath = "//android.widget.Image[@text='subdirectory_arrow']//following::android.widget.EditText")
    	public MobileElement clksubtask;

    @AndroidFindAll({
            @AndroidBy(xpath = "//android.widget.Button[@text='Add Files']"),
            @AndroidBy(xpath = "//android.widget.Button[@text='ADD ATTACHMENT']"),
    })

    public MobileElement clkaddattachment;
    	
    	@AndroidFindBy(xpath = "//android.view.View[@text='Reports']")
    	public MobileElement clkonreports;
    	
    	@AndroidFindBy(xpath = "//android.view.View[@text='Improvement Reports']")
    	public MobileElement clkonimprovementreports;


    	@AndroidFindBy(xpath = "//android.widget.Button[@text='OK']")
        public MobileElement noDataPopup;

    	
    	@AndroidFindBy(xpath = "//android.widget.Button[@text='Download']")
    	public MobileElement clkondownloadfromverticalmenu;
    	
    	@AndroidFindBy(xpath = "//android.widget.Button[@text='ALLOW']")
    	public MobileElement clkonallowpopup;
    	
    	@AndroidFindBy(xpath = "//android.view.View[@text='Browse DIKSHA library to find relevant content based on your preferences (Board, Medium, Class)']//preceding::android.view.View[contains(@text,'Welcome')]")
    	public MobileElement welcomelogo;
    	
    	@AndroidFindBy(className = "//android.view.View[@text='Projects']")
    	public MobileElement projectslogo;
    	
    	@AndroidFindBy(className = "//android.view.View[@text='Project view']")
    	public MobileElement projectviewlogo;
    	
    	@AndroidFindBy(className = "//android.view.View[@text='Reports']")
    	public MobileElement reportslogo;
    	
    	@AndroidFindBy(className = "//android.view.View[@text='Project overview']")
    	public MobileElement projectoverviewlogo;
    	
    	@AndroidFindBy(xpath = "//android.widget.Button[@text='search']")
    	public MobileElement clksearchIcon;
    	
    	
    	@AndroidFindBy(xpath = "//android.widget.Image[@text='log in outline']")
    	public MobileElement clkonloginofmenubar;
    		
    		
    		
    		@AndroidFindAll({
                    @AndroidBy(xpath = "//android.view.View[@text='Merge Account']"),
                    @AndroidBy(xpath = "//android.widget.Button[@text='Merge Account']"),
            })
    		public MobileElement clkonmergeaccount;
    				
    				@AndroidFindBy(xpath = "//android.widget.Button[@text='Merge']")
    				public MobileElement clkonmergebuttonofpopup;
    				
    				

    				@AndroidFindAll(
    						{@AndroidBy(xpath = "//android.view.View[@text='Account merge has been successfully initiated. You will be notified once it is complete.'][@index='1']"),
    					  @AndroidBy(xpath= "//android.view.View[@text='Merge Account']//following::android.view.View[@text='Account merge has been successfully initiated. You will be notified once it is complete.']")
    					})
    		public MobileElement errorpopup;
    				
    				
    				@AndroidFindBy(xpath = "//android.view.View[@text='Programs']")
    				public MobileElement clkonprograms;
    				
    				@AndroidFindBy(xpath = "//android.view.View[@text='Observation Led Projects Testing']")
    				public MobileElement clkonObservationledprojectstesting;
    				
    				@AndroidFindBy(xpath = "//android.view.View[@text='View and participate in educational programs active in your location and designed for the role you selected']//following::android.view.View[@index='1']")
    				public MobileElement clkonObsrvationledprojectstetingfirstindex;
    				
    				@AndroidFindBy(xpath = "//android.widget.Button[@text='ADD ENTITY']//following::android.view.View[@index='0']")
    				public MobileElement clkonleadershipselfassesmentaddentityfirstindex;
    				//android.widget.Button[@text='Completed']//following::android.view.View[@index='0']
    				
    				@AndroidFindBy(xpath = "//android.widget.Button[@text='Completed']//following::android.view.View[@index='0']")
    				public MobileElement clkonobservaionfirstindex;
    				
    				@AndroidFindBy(xpath = "//android.view.View[@text='Domains']//following::android.view.View[@index='1']")
    				public MobileElement clkondomainsfirstindex;
    				
    				@AndroidFindBy(xpath = "//android.widget.Button[@text='arrow forward Start Observation']")
    				public MobileElement clkonstartobservtion;
    				
    				@AndroidFindBy(xpath = "//android.widget.TextView[@text='Reflection & Teaching']")
    				public MobileElement clkonreflectionteaching;
    				//android.widget.CheckBox[@resource-id='ion-cb-0']
    				
    				@AndroidFindAll({ @AndroidBy(xpath = "//android.widget.CheckBox[@index='1']"),
    				    @AndroidBy(xpath = "//android.widget.CheckBox[@resource-id='ion-cb-0']") })
    					public MobileElement clkonfirstindexofhabits;
    				
    				@AndroidFindBy(xpath = "//android.widget.Button[@text='NEXT arrow forward']")
    				public MobileElement clkonnextarrowforward;
    				
    				@AndroidFindBy(xpath = "//android.widget.Button[@text='save SAVE']")
    				public MobileElement clkonsavebutton;

    @AndroidFindAll({


            @AndroidBy(xpath = "//android.view.View[@text='Programs View and participate in educational programs active in your location and designed for the role you selected']//following::android.view.View"),
            @AndroidBy(xpath = "//android.view.View[@text='View and participate in educational programs active in your location and designed for the role you selected']//following::android.view.View")
    })
    public List<MobileElement> allprogramnames;
    				
    				@AndroidFindBy(xpath = "//android.widget.Button[@text='save SAVE']")
    				public MobileElement clkDontUploadbtn;
    				
    				@AndroidFindBy(xpath = "//android.widget.Button[@text='Add subtask']")
    				public MobileElement clAddSubtaskbtn;
    				
    				@AndroidFindBy(xpath = "//android.view.View[@text='Upload Evidences']//following::android.widget.CheckBox")
    				public MobileElement clkCheckboxAAttachmentPopup;
    				
    				@AndroidFindBy(xpath = "//android.widget.Button[@text='Upload']")
    				public MobileElement clkUploadBtnAttachmentPopup;

    @AndroidFindAll({
            @AndroidBy(xpath = "//android.widget.Button[@text='Continue']"),
            @AndroidBy(xpath = "//android.widget.Button[@text='CONTINUE']")
    })

    public MobileElement clkContinuewBtn;
    				
    				@AndroidFindBy(xpath = "//android.view.View[@text='Today']//following::android.view.View")
    				public MobileElement clkCreatedTask;

    @AndroidFindBy(xpath = "//android.view.View[@text='Completed']")
    public MobileElement assertCreatedTaskWithCompleteStatus;
    				
    				

    				
    				
    				
    				@AndroidFindAll({
    	                @AndroidBy(xpath = "//android.widget.Button[@text='All']"),
    	        })
    	         public MobileElement allMediaType;
    	    	@AndroidFindAll({
    	                @AndroidBy(xpath = "//android.widget.Button[@text='Video']"),
    	        })
    	        public MobileElement videoMediaType;
    	     @AndroidFindAll({
    	             @AndroidBy(xpath = "//android.widget.Button[@text='Documents']"),
    	     })
    	    public MobileElement documentsMediaType;
    	     @AndroidFindAll({
    	             @AndroidBy(xpath = "//android.widget.Button[@text='Interactive']"),
    	     })
    	    public MobileElement interactiveMediaType;
    	     
    	 @AndroidFindBy(xpath = "//android.widget.Button[@text='search filter']")
    	    public MobileElement filtersbutton;
    	 
    	     @AndroidFindBy(xpath = "//android.view.View[@text='Media Type']")
    	     public MobileElement mediaTypefilter;
    	     
    	     @AndroidFindBy(xpath = "//android.view.View[4]")
    	    public MobileElement firstContentUnderVideoType;
    	     
    	     @AndroidFindBy(xpath = "//android.widget.Button[@text='Play video']")
    	    public MobileElement playIconOfVideo;
    	     
    	     @AndroidFindBy(xpath = "//android.view.View[@text='Course']")
    	    public MobileElement courseSecInTraining;
    	     
    	     @AndroidFindBy(xpath = "//android.view.View[@text='English']")
    	    public MobileElement englishSubject;
    	     
    	     @AndroidFindBy(xpath = "//android.view.View[@text='Accountancy']")
    	    public MobileElement accountancySubject;
    	     
    	     @AndroidFindBy(xpath = "//android.view.View[@text='Assamese']")
    	    public MobileElement assameseSubject;
    	     
    	     @AndroidFindBy(xpath = "//android.widget.Button[@text='VIEW MORE']")
    	    public MobileElement viewMoreBtn;
    	     
    	     
    	     @AndroidFindAll({
                 @AndroidBy(xpath = "//android.view.View[@text='English']"),
         })
        public MobileElement observeEnglishSub;
         @AndroidFindAll({
                 @AndroidBy(xpath = "//android.view.View[@text='Accountancy']"),
         })
        public MobileElement observeAccountancySub;
         @AndroidFindAll({
                 @AndroidBy(xpath = "//android.view.View[@text='Biology']"),
         })
        public MobileElement observeBiologySub;
         @AndroidFindAll({
                 @AndroidBy(xpath = "//android.view.View[@text='You are offline']"),
         })
        public MobileElement offlineMessage;
         @AndroidFindAll({
                 @AndroidBy(xpath = "//android.widget.Button[@text='Course details']"),
         })
        public MobileElement courseDetailsLabel;
         @AndroidFindAll({
                 @AndroidBy(xpath = "//android.widget.Button[@text='Course modules']"),
         })
        public MobileElement courseModulesLabel;
         @AndroidFindAll({
                 @AndroidBy(xpath = "//android.widget.ToggleButton"),
                 @AndroidBy(xpath = "//android.widget.Image[@text='arrow-down']//following::android.widget.Button"),
         })
        public MobileElement contentPlayBtn;


       @AndroidFindAll({
               @AndroidBy(xpath = "//android.widget.Button[@text='burger menu']"),
       })
        public MobileElement clkBurgerMenu;


       @AndroidFindAll({
               @AndroidBy(xpath = "//android.widget.Button[@text='Settings']"),
               @AndroidBy(xpath = "//android.view.View[@text='Settings']"),
       })
        public MobileElement clkSettings;


       @AndroidFindAll({
               @AndroidBy(xpath = "//android.widget.Button[@text='Merge Account']"),
               @AndroidBy(xpath = "//android.view.View[@text='Merge Account']"),
       })
        public MobileElement clkMergeAccount;


       @AndroidFindAll({
               @AndroidBy(xpath = "//android.widget.Button[@text='Merge']"),
       })
        public MobileElement clkMergeBtn;


       @AndroidFindAll({
               @AndroidBy(xpath = "//android.view.View[@text='Merge Account']"),
       })
        public MobileElement verifyMergeAccountText;


      @AndroidFindAll({
              @AndroidBy(xpath = "//android.view.View[@text='My Course']//following::android.view.View[1]"),
      })
        public MobileElement verifyTrainingAfterMerge;
    	     
    	     
      @AndroidFindAll({
          @AndroidBy(xpath = "//android.view.View[@text='delete']"),
  })
    public boolean deleteAssertGrp;
	     
	     
    	     
      @AndroidFindBy(xpath = "//android.widget.Button[@text='eye Certificate']")
      public MobileElement certificateIcon;
      @AndroidFindBy(xpath = "//android.widget.Button[@text='Allow']")
      public MobileElement clkAllowIcon;
      @AndroidFindBy(xpath = "//android.widget.Button[@text='Download Download']")
      public MobileElement clkDownloadBtn;
      @AndroidFindBy(xpath = "//android.view.View[@text='PDF']")
      public MobileElement assertPdfCertificate;
      @AndroidFindBy(xpath = "//android.view.View[@text='PNG']")
      public MobileElement assertPngCertificate;
      @AndroidFindBy(xpath = "//android.view.View[@text='Certificate is getting downloaded']")
      public MobileElement assertToastMessage;
      @AndroidFindBy(xpath = "//android.widget.Button[@text='menu']")
      public MobileElement assertHamburgerMenu;
      @AndroidFindBy(xpath = "//android.widget.Button[@text='settings']")
      public MobileElement assertSettingsButton;
      @AndroidFindBy(xpath = "//android.view.View[contains(@text,'Space taken by DIKSHA:')]")
      public MobileElement assertSpaceTakenByDiksha;
      @AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,'Available:')]")
      public MobileElement assertAvailableSpace;
      @AndroidFindBy(xpath = "//android.view.View[@text='No downloads yet']")
      public MobileElement assertNoDownloads;
      @AndroidFindBy(xpath = "//android.view.View[@text='Select All']")
      public MobileElement assertSelectAll;
      @AndroidFindBy(xpath = "//android.widget.Button[@text='Sort By Content size']")
      public MobileElement assertContentSize;
      @AndroidFindBy(xpath = "//android.view.View[contains(@text,'Showing 100 results')]//following::android.view.View[1]")
      public MobileElement clkFirstContent;
      @AndroidFindBy(xpath = "//android.widget.Button[@text='download content Download']")
      public MobileElement clkDownloadButton;
      @AndroidFindBy(xpath = "//android.widget.Button[@text='Download']")
      public MobileElement clkDownload;
      @AndroidFindBy(xpath = "//android.widget.Button[@text='Content size']")
      public MobileElement assertContentSizefilter;
      @AndroidFindBy(xpath = "//android.widget.Button[@text='Last viewed']")
      public MobileElement assertLastViewedFilter;
      @AndroidFindBy(xpath = "//android.widget.Button[contains(@text,'Delete')]")
      public MobileElement clkDeleteBtn;
      @AndroidFindBy(xpath = "//android.widget.Button[@text='Create Group Create group']")
      public MobileElement assertCreateGroupIcon;
      @AndroidFindBy(xpath = "//android.widget.Image[@text='My groups']")
      public MobileElement assertPlaceHolderImages;
      @AndroidFindBy(xpath = "//android.view.View[@text='You are just a step away from creating a group']")
      public MobileElement assertTextInMyGroupPage;
     
      @AndroidFindBy(xpath = "//android.widget.Button[@text='Permissions']")
      public MobileElement clkPermissions;
      @AndroidFindBy(xpath = "//android.view.View[@text='Camera']")
      public MobileElement assertCamera;
      @AndroidFindBy(xpath = "//android.view.View[@text='File Manager']")
      public MobileElement assertFileManager;
      @AndroidFindBy(xpath = "//android.view.View[@text='Microphone']")
      public MobileElement assertMicrophone;
      @AndroidFindBy(xpath = "//android.view.View[@text='Camera']//following::android.view.View[2]")
      public MobileElement clkCameraPermission;
      @AndroidFindBy(xpath = "//android.widget.TextView[@text='Permissions']")
      public MobileElement clkOnPermissions;
      @AndroidFindBy(xpath = "//android.widget.TextView[@text='Camera']")
      public MobileElement clkOnCamera;
      @AndroidFindBy(xpath = "//android.widget.RadioButton[@text='Allow only while using the app']")
      public MobileElement assertAllowOnlyUsingApp;
      @AndroidFindBy(xpath = "//android.widget.RadioButton[@text='Ask every time']")
      public MobileElement assertAskEveryTime;
      @AndroidFindBy(xpath = "//android.widget.RadioButton[@text='Deny']")
      public MobileElement assertDenyPermissions;

      @AndroidFindAll({
              @AndroidBy(xpath = "//android.widget.Button[@text='Language']"),
              @AndroidBy(xpath = "//android.widget.Image[@text='select app langugae']")

      })
      public MobileElement appLanguageInEnglish;

      @AndroidFindBy(xpath = "//android.widget.Button[@text='हिंदी']")
      public MobileElement sltHindiLanguage;
      @AndroidFindBy(xpath = "//android.widget.Button[@text='जारी रखें']")
      public MobileElement clkContinueInHindi;
      @AndroidFindBy(xpath = "//android.widget.Button[@text='भाषा']")
      public MobileElement appLanguageInHindi;
      @AndroidFindBy(xpath = "//android.widget.Button[@text='English']")
      public MobileElement sltEnglishLang;
      @AndroidFindBy(xpath = "//android.widget.Button[@text='CONTINUE']")
      public MobileElement clkContinueInEnglish;
     
     
      @AndroidFindAll({
              @AndroidBy(xpath = "//android.view.View[@text='Accountancy']//following::android.view.View[1]"),
              @AndroidBy(xpath = "//android.view.View[@text='Digital Textbook']//following::android.view.View[3]")
      })
    
      @AndroidFindAll({
              @AndroidBy(xpath = "//android.view.View[@text='home']"),
              @AndroidBy(xpath = "//android.view.View[contains(@text,'home')]"),
      })
      public MobileElement clkHomePageTab;

      @AndroidFindBy(xpath = "//android.view.View[contains(@text,'More')]")
      public MobileElement tapMoreBtn;
      @AndroidFindBy(xpath = "//android.view.View[@index=4]")
      public MobileElement selectUser;
      @AndroidFindBy(xpath = "//android.widget.Button[@text='Change User']")
      public MobileElement clkChangeUser;
        
      
         @AndroidFindBy(xpath = "//android.widget.Button[@text='Cancel']")
         public MobileElement clkCancel;
         @AndroidFindBy(xpath = "//android.widget.TextView[@text='If you have two accounts with DIKSHA, click ']")
         public MobileElement twoAccountswithDikshaText;
         @AndroidFindBy(xpath = "//android.widget.TextView[@text='Merge']")
         public MobileElement assertMergeText;
         @AndroidFindBy(xpath = "//android.widget.TextView[@text='Cancel']")
         public MobileElement assertCancelText;
         @AndroidFindBy(xpath = "//android.widget.TextView[@text='combine usage details of both accounts, and']")
         public MobileElement assertCombineAccountsText;
         @AndroidFindBy(xpath = "//android.widget.TextView[@text='delete the other account']")
         public MobileElement assertDeleteAccountText;
         @AndroidFindBy(xpath = "//android.view.View[@text='Login']")
         public MobileElement LoginPageText;
         @AndroidFindBy(xpath = "//android.view.View[@text='Enter Email Address / Mobile number']")
         public MobileElement assertEmailAddressLabel;
         @AndroidFindBy(xpath = "//android.view.View[@text='Password']")
         public MobileElement assertPasswordLabel;

         @AndroidFindBy(xpath = "//android.widget.Button[@text='Debug Mode']")
         public MobileElement clkDebugMode;


         @AndroidFindBy(xpath = "//android.view.View[@text='DEBUG MODE']//following::android.view.View")
         public MobileElement verifyMessageAfterClkDebug;


         @AndroidFindBy(xpath = "//android.widget.Button[@text='TURN ON']")
         public MobileElement clkTurnOnBtn;


         @AndroidFindBy(xpath = "//android.widget.CheckBox[@text='Debug Mode']")
         public MobileElement clkDebugChkBox;


         @AndroidFindBy(xpath = "//android.widget.Button[@text='TURN OFF']")
         public MobileElement clkTurnOffBtn;


         @AndroidFindBy(xpath = "//android.widget.TextView[@text='My groups']//following::android.view.View[@text='New']")
         public MobileElement assertNewTagInMyGroups;


         @AndroidFindBy(xpath = "//android.widget.TextView[@text='Import Content']//following::android.view.View[@text='New']")
         public MobileElement assertNewTagInImportContent;


         @AndroidFindBy(xpath = "//android.widget.Button[@text='log in outline Login']")
          public MobileElement assertUserLoginText;


         @AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,'Guest')]")
         public MobileElement assertGuestUserInProfile;


         @AndroidFindBy(xpath = "//android.widget.Button[@text='LOGIN']")
         public MobileElement assertUserLoginBtn;


         @AndroidFindBy(xpath = "//android.widget.TextView[@text='Login to DIKSHA']")
         public MobileElement assertLoginPageText;


         @AndroidFindBy(xpath = "//android.widget.Button[@text='app-logo Login with DIKSHA']")
         public MobileElement assertDikshaLogoLogin;


         @AndroidFindBy(xpath = "//android.view.View[@text='Course']//following::android.view.View[1]")
         public MobileElement courseUnderFirstGrp;


         @AndroidFindBy(xpath = "//android.view.View[@text='Your Progress']//following::android.view.View[contains(@text,'completed')]")
         public MobileElement assertCourseProgress;


         @AndroidFindBy(xpath = "//android.widget.Button[contains(@text,'Activity dashboard')]")
         public MobileElement clkActivityDashboard;


         @AndroidFindBy(xpath = "//android.view.View[@text='Download as CSV']")
         public MobileElement downLoadCSVfile;


         @AndroidFindBy(xpath = "//android.view.View[@text='Name: activate to sort column descending']")
         public MobileElement nameUnderDashboard;


         @AndroidFindBy(xpath = "//android.view.View[@text='Progress%: activate to sort column ascending']")
         public MobileElement progressUnderDashboard;


         @AndroidFindBy(xpath = "//android.view.View[contains(@text,'Name')]//following::android.view.View[6]")
         public MobileElement firstMemberUnderDashboard;


         @AndroidFindBy(xpath = "//android.view.View[contains(@text,'Name')]//following::android.view.View[10]")
         public MobileElement secondMemberUnderDashboard;


         @AndroidFindBy(xpath = "//android.view.View[contains(@text,'Name')]//following::android.view.View[7]")
         public MobileElement progressPercentageFirstMember;


         @AndroidFindBy(xpath = "//android.view.View[contains(@text,'Name')]//following::android.view.View[8]")
         public MobileElement individualScoreInDashboard;


         @AndroidFindBy(xpath = "//android.view.View[@text='NA']")
         public MobileElement assertNAinDashboard;


         @AndroidFindBy(xpath = "//android.view.View[@text='Explore Digital Textbook']")
         public MobileElement assertDigitalTextBookSec;


         @AndroidFindBy(xpath = "//android.widget.Button[@text='filter']")
         public MobileElement clkFilter;


         @AndroidFindBy(xpath = "//android.view.View[@text='Publisher']//following::android.widget.Image[1]")
         public MobileElement clkPublisherDropdown;


         @AndroidFindBy(xpath = "//android.widget.CheckBox")
         public MobileElement clkFirstPublisher;


         @AndroidFindBy(xpath = "//android.widget.Button[@text='SUBMIT']")
         public MobileElement clkSubmitBtn;


         @AndroidFindBy(xpath = "//android.widget.Button[@text='APPLY']")
         public MobileElement clkApplyBtn;


         @AndroidFindBy(xpath = "//android.view.View[@text='Digital Textbook']//following::android.view.View[3]")
         public MobileElement assertTextBookPostFilter;


         @AndroidFindBy(xpath = "//android.widget.Button[@text='SWITCH TO NEW EXPERIENCE']")
         public MobileElement assertDikshaExpForHead;


         @AndroidFindAll({
                 @AndroidBy(xpath = "//android.view.View[@text='Log out']"),
                 @AndroidBy(xpath = "//android.widget.Button[@text='Log out']"),
         })
         public MobileElement clkLogout;


         @AndroidFindAll({
                 @AndroidBy(xpath = "//android.widget.Image[@text='back']"),
                 @AndroidBy(xpath = "//android.widget.Button[@text='back']"),
                 @AndroidBy(xpath = "//android.widget.Button[@text='back icon Back']"),
         })
         public MobileElement clkBackBtn;


         @AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,'I confirm that this Content complies with prescribed guidelines,including the')]")
         public MobileElement assertPrivacyPopup;


         @AndroidFindBy(xpath = "//android.view.View[@text='Created by me']//following::android.view.View")
         public MobileElement assertCreatedProjectExploreProject;


    @AndroidFindBy(xpath = "//android.widget.TextView[@text='My groups']//following::android.view.View[1]")
    public MobileElement clkOnFirstGrp;


    @AndroidFindBy(xpath = "//android.view.View[@text='Edit group details']")
    public MobileElement clkEditGroupDetails;


    @AndroidFindBy(xpath = "//android.view.View[@text='Deactivate group']")
    public MobileElement clkDeactivateGroup;


    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Deactivate group?']")
    public MobileElement assertDeactivateGroupText;


    @AndroidFindBy(xpath = "//android.widget.Button[@text='Deactivate']")
    public MobileElement clkDeactivateBtn;


    @AndroidFindBy(xpath = "//android.view.View[contains(@text,'This group is temporarily inactive')]")
    public MobileElement assertInactiveGrpAfterDeactivated;


    @AndroidFindBy(xpath = "//android.widget.Button[@text='Activate']")
    public MobileElement clkActivateBtn;


    @AndroidFindBy(xpath = "//android.view.View[@text='Activate group']")
    public MobileElement clkActivateGroup;


    @AndroidFindBy(xpath = "//android.view.View[@text='Deactivated']")
    public MobileElement assertDeactivatedGroups;


    @AndroidFindBy(xpath = "//android.widget.Button[@text='Programs']")
    public MobileElement assertProgramsInHomePage;


    @AndroidFindBy(xpath = "//android.widget.Button[@text='Projects']")
    public MobileElement assertProjectsInHomePage;


    @AndroidFindBy(xpath = "//android.widget.Button[@text='Observations']")
    public MobileElement assertObservationsInHomePage;


    @AndroidFindBy(xpath = "//android.widget.Button[@text='Surveys']")
    public MobileElement assertSurveysInHomePage;


    @AndroidFindBy(xpath = "//android.widget.Button[@text='Icon Report other issue Report Other Issue']")
    public MobileElement clkOnReportOtherIssue;


    @AndroidFindBy(xpath = "//android.view.View[@text='Report an issue']")
    public MobileElement assertReportAnIssueText;


    @AndroidFindBy(xpath = "//android.view.View[@text='Select Category']")
    public MobileElement clkSelectCategory;


    @AndroidFindBy(xpath = "//android.view.View[@text='Content']")
    public MobileElement clkOnContent;


    @AndroidFindBy(xpath = "//android.widget.Button[@text='SUBMIT']")
    public MobileElement clkSubmitButton;


    @AndroidFindBy(xpath = "//android.view.View[@text='Select Subcategory']")
    public MobileElement clkSelectSubcategory;


    @AndroidFindBy(xpath = "//android.view.View[@text='Content availability']")
    public MobileElement clkOnContentAvailability;


    @AndroidFindBy(xpath = "//android.view.View[@text='Select Board']")
    public MobileElement clkSelectBoard;


    @AndroidFindBy(xpath = "//android.view.View[@text='CBSE/NCERT']")
    public MobileElement clkOnCBSEBoard;


    @AndroidFindBy(xpath = "//android.view.View[@text='Select Medium']")
    public MobileElement clkSelectMedium;


    @AndroidFindBy(xpath = "//android.view.View[@text='English']")
    public MobileElement clkOnEnglish;


    @AndroidFindBy(xpath = "//android.view.View[@text='Select Grade']")
    public MobileElement clkSelectGrade;


    @AndroidFindBy(xpath = "//android.view.View[@text='Class 1']")
    public MobileElement clkOnGrade;


    @AndroidFindBy(xpath = "//android.view.View[@text='Select Subject']")
    public MobileElement clkSelectSubject;


    @AndroidFindBy(xpath = "//android.view.View[@text='Hindi']")
    public MobileElement clkOnHindi;


    @AndroidFindBy(xpath = "//android.view.View[@text='Mathematics']")
    public MobileElement clkOnMathematics;


    @AndroidFindBy(xpath = "//android.widget.ListView[contains(@text,'English, Hindi')]")
    public MobileElement assertMultipleSubjects;


    @AndroidFindBy(xpath = "//android.view.View[@text='Select Content Type']")
    public MobileElement clkSelectContentType;


    @AndroidFindBy(xpath = "//android.view.View[@text='Digital Textbook']")
    public MobileElement clkOnDigitalTextbook;


    @AndroidFindAll({
            @AndroidBy(xpath = "//android.widget.TextView[@text='Browse other categories']"),
            @AndroidBy(xpath = "//android.view.View[@text='Browse other categories']")
    })
    public MobileElement assertbrowseOtherCategories;


    @AndroidFindBy(xpath = "//android.widget.Button[@text='Observation']")
    public MobileElement clkOnObservation;


    @AndroidFindBy(xpath = "//android.view.View[@text='Observation']")
    public MobileElement assertObservationText;


    @AndroidFindBy(xpath = "//android.widget.EditText//following::android.view.View[1]")
    public MobileElement assertFirstObservation;


    @AndroidFindBy(xpath = "//android.widget.Button[@text='back icon Back']")
    public MobileElement clkBackbutton;


    @AndroidFindBy(xpath = "//android.widget.Button[contains(@text,'Edit')]")
    public MobileElement clkOnEdit;


    @AndroidFindBy(xpath = "//android.view.View[contains(@text,'Role')]//following::android.widget.ListView[1]")
    public MobileElement clkOnRole;


    @AndroidFindBy(xpath = "//android.view.View[@text='Student']")
    public MobileElement selectStudentRole;


    @AndroidFindBy(xpath = "//android.widget.Button[@text='Submit']")
    public MobileElement clkOnSubmitBtn;


    @AndroidFindBy(xpath = "//android.view.View[@text='Teacher']")
    public MobileElement selectTeacherRole;


    @AndroidFindBy(xpath = "//android.widget.Button[@text='Course']")
    public MobileElement clkOnCourseInHomePage;


    @AndroidFindBy(xpath = "//android.view.View[@text='Explore Course']")
    public MobileElement assertExploreCourse;


    @AndroidFindBy(xpath = "//android.widget.Button[@text='Course']//following::android.view.View[3]")
    public MobileElement clkOnFirstInExploreCourse;


    @AndroidFindAll({
            @AndroidBy(xpath = "//android.view.View[@text='User Type : Student']"),
            @AndroidBy(xpath = "//android.view.View[@text='User Type : Teacher']")
    })
    public MobileElement assertUserTypeInCourseDetails;


    @AndroidFindBy(xpath = "//android.view.View[@text='No tags Available !']")
    public MobileElement assertNoTagsAvailable;


    @AndroidFindBy(xpath = "//android.view.View[@text='Stay tuned ! we will be updating our tags library and add them here']")
    public MobileElement assertTextInTagsSection;


    @AndroidFindBy(xpath = "//android.widget.Button[@text='back-image Back']")
    public MobileElement assertBackButton;


    @AndroidFindAll({
            @AndroidBy(xpath = "//android.widget.Image[@text='Buffer-image']"),
            @AndroidBy(xpath = "//android.widget.Button[@text='☰']//following::android.view.View")
    })
    public MobileElement clkOnGeneralDiscussion;


    @AndroidFindBy(xpath = "//android.view.View[@text='Discussion topic*']")
    public MobileElement assertDiscussionTopic;


    @AndroidFindBy(xpath = "//android.view.View[@text='Ask a Question']")
    public MobileElement assertAskAQuestion;


    @AndroidFindBy(xpath = "//android.widget.Button[@text='Update']")
    public MobileElement assertUpdateBtn;


    @AndroidFindBy(xpath = "//android.widget.Button[@text='Submit']")
    public MobileElement assertSubmitBtn;


    @AndroidFindBy(xpath = "//android.view.View[@text='English Medium']")
    public MobileElement assertEnglishMediumLibrary;


    @AndroidFindBy(xpath = "//android.view.View[@text='English']")
    public MobileElement assertEnglishMediumInProfile;


    @AndroidFindBy(xpath = "//android.view.View[@text='Class 4']")
    public MobileElement assertClassInProfile;


    @AndroidFindBy(xpath = "//android.view.View[@text='Hindi Medium']")
    public MobileElement clkHindiMediumInLibraryPage;


    @AndroidFindBy(xpath = "//android.view.View[@text='Class 5']")
    public MobileElement clkClass5InLibraryPage;



    @AndroidFindBy(xpath = "//android.view.View[contains(@text,'Recently viewed')]")
    public MobileElement assertRecentlyViewedSection;



    @AndroidFindBy(xpath = "//android.widget.Button[@text='JOIN COURSE']")
    public MobileElement assertJoinCourseBtn;



    @AndroidFindBy(xpath = "//android.view.View[contains(@text,'information circle Last date to join ')]")
    public MobileElement assertEnrollmentEndDate;


    @AndroidFindBy(xpath = "//android.view.View[contains(@text,'Enrolments for this batch closed on')]")
    public MobileElement assertEnrollmentClosedMsg;


    @AndroidFindBy(xpath = "//android.view.View[@text='There are no batches available for this course']")
    public MobileElement assertNoBatchesForThisCourseMsg;


    @AndroidFindBy(xpath = "//android.view.View[@text='No batches available']")
    public MobileElement assertExpiredCourseMsg;


    @AndroidFindBy(xpath = "//android.view.View[@text='courses']")
    public MobileElement assertCoursesTab;


    @AndroidFindBy(xpath = "//android.view.View[@text='qrscanner']//preceding::android.view.View[2]")
    public MobileElement assertCourseTabInClassicExperience;


    @AndroidFindBy(xpath = "//android.view.View[@text='qrscanner']//preceding::android.view.View[2]")
    public MobileElement assertSearchTabInNewExperience;


    @AndroidFindBy(xpath = "//android.view.View[@text='discover']")
    public MobileElement assertSearchTab;


    @AndroidFindBy(xpath = "//android.view.View[@text='Search DIKSHA']")
    public MobileElement assertSearchPageText;


    @AndroidFindBy(xpath = "//android.view.View[@text='Popular categories']")
    public MobileElement assertPopularCategories;


    @AndroidFindBy(xpath = "//android.view.View[@text='resources']")
    public MobileElement assertLibraryPage;


    @AndroidFindBy(xpath = "//android.view.View[@resource-id='medium0']")
    public MobileElement assertMediumInLibraryPage;


    @AndroidFindBy(xpath = "//android.view.View[@resource-id='class0']")
    public MobileElement assertClassInLibraryPage;


    @AndroidFindBy(xpath = "//android.widget.EditText")
    public MobileElement assertSearchBar;



    @AndroidFindBy(xpath = "//android.widget.Button[@text='Cbse/ncert']")
    public MobileElement assertCbseNcertBoard;


    @AndroidFindBy(xpath = "//android.view.View[@text='Explore Digital Textbook']")
    public MobileElement assertExploreDigitalTextBookText;


    @AndroidFindBy(xpath = "//android.view.View[@text='Explore CBSE/NCERT']")
    public MobileElement assertExploreCbseNcertText;


    @AndroidFindBy(xpath = "//android.view.View[@text='Explore Courses']")
    public MobileElement assertExploreCoursesUnderTeacher;


    @AndroidFindBy(xpath = "//android.view.View[@text='Subject, Subject']")
    public MobileElement assertSubjectInExploreDigitalTextbook;


    @AndroidFindBy(xpath = "//android.view.View[@text='Role, Role']")
    public MobileElement assertRoleInExploreDigitalTextbook;


    @AndroidFindBy(xpath = "//android.widget.Button[@text='filter']")
    public MobileElement assertAdvancedFilter;


    @AndroidFindBy(xpath = "//android.widget.Button[@text='Digital Textbook']")
    public MobileElement navigationBasedOnPrimaryCategory;


    @AndroidFindBy(xpath = "//android.widget.Button[@text='filter']//following::android.widget.Button[1]")
    public MobileElement navigationBasedOnPrimaryCategory1;


    @AndroidFindBy(xpath = "//android.widget.Button[@text='Digital Textbook']//following::android.view.View[2]")
    public MobileElement groupingBasedOnSubject;


    @AndroidFindBy(xpath = "//android.widget.Button[@text='filter']//following::android.view.View[4]")
    public MobileElement groupingBasedOnSubject1;


    @AndroidFindBy(xpath = "//android.widget.Button[@text='Digital Textbook']//following::android.view.View[3]")
    public MobileElement contentBasedOnSubject;



    @AndroidFindBy(xpath = "//android.widget.Button[@text='filter']//following::android.view.View[5]")
    public MobileElement contentBasedOnSubject1;



     @AndroidFindBy(xpath = "//android.widget.Button[@text='Downvoted']//following::android.view.View[2]")
    public MobileElement assertDataUnderMyDiscussions;


     @AndroidFindBy(xpath = "//android.widget.Button[@text='Start Discussion']//following::android.view.View[2]")
    public MobileElement assertDiscussionList;



     @AndroidFindBy(xpath = "//android.widget.Image[@text='book-icon']//following::android.view.View[2]")
    public MobileElement assertUpdatedCardForActivity1;



     @AndroidFindBy(xpath = "//android.widget.Image[@text='book-icon']//following::android.view.View[8]")
    public MobileElement assertUpdatedCardForMoreActivity;



     @AndroidFindBy(xpath = "//android.view.View[@text='Select category']")
     public MobileElement assertSelectcategoryText;


     @AndroidFindBy(xpath = "//android.widget.Button[@text='Course & certificates']")
    public MobileElement clkCourseAndCertificates;



     @AndroidFindBy(xpath = "//android.view.View[@text='Course & certificates']")
    public MobileElement assertCourseAndCertificatesPageText;


     @AndroidFindBy(xpath = "//android.view.View[@text='I have completed the training but my progress is not 100%.']")
    public MobileElement assertIncorrectProgressFAQ;



     @AndroidFindBy(xpath = "//android.view.View[contains(@text,'DIKSHA marks training progress as 100%')]")
    public MobileElement assertSolutionForIncorrectProgress;



     @AndroidFindBy(xpath = "//android.view.View[contains(@text,'Did this answer help you')]")
    public MobileElement assertAnswerHelpYouQuestion;



     @AndroidFindBy(xpath = "//android.widget.Button[@text='Yes']")
    public MobileElement assertYesButton;


     @AndroidFindBy(xpath = "//android.widget.Button[@text='No']")
    public MobileElement assertNoButton;



     @AndroidFindBy(xpath = "//android.view.View[contains(@text,'Hi')]")
    public MobileElement assertWelcomeMessage;


     @AndroidFindBy(xpath = "//android.widget.TextView[@text='Your preferences']")
    public MobileElement assertYourPreference;


     @AndroidFindBy(xpath = "//android.widget.Button[@text='preferences-info']")
    public MobileElement assertPreferenceInfoImage;


     @AndroidFindBy(xpath = "//android.view.View[contains(@text,'Guest')]")
    public MobileElement assertUser;


     @AndroidFindBy(xpath = "//android.view.View[@text='Browse DIKSHA library to find relevant content based on your preferences (Board, Medium, Class)']")
    public MobileElement assertBrowseDIKSHAlibraryMessage;


     @AndroidFindBy(xpath = "//android.widget.Button[@text='Change Preference']")
    public  MobileElement assertChangePreferenceBtn;



     @AndroidFindBy(xpath = "//android.view.View[@text='Download content from Courses or Library']")
    public MobileElement assertDownloadContentFromCoursesMsg;


     @AndroidFindBy(xpath = "//android.widget.Button[@text='Forum']")
    public MobileElement clkForumIcon;



     @AndroidFindBy(xpath = "//android.widget.Image[@text='bookmark icon']")
    public MobileElement assertSavePostIcon;


     @AndroidFindBy(xpath ="//android.widget.Image[@text='up arrow icon for like the post']")
    public MobileElement assertUpvoteIcon;


     @AndroidFindBy(xpath = "//android.widget.Image[@text='down arrow icon for unlike post']")
    public MobileElement assertDownvoteIcon;



     @AndroidFindBy(xpath = "//android.view.View[@text='Help']")
    public MobileElement assertHelpTextInHelpPage;


     @AndroidFindBy(xpath = "//android.view.View[@text='Frequently asked questions']")
     public MobileElement assertFAQtext;


     @AndroidFindBy(xpath = "//android.widget.Button[@text='Content (search)']")
    public MobileElement assertContentSection;


     @AndroidFindBy(xpath = "//android.view.View[@text='Faq(s)']")
    public MobileElement assertFaqText;


     @AndroidFindBy(xpath = "//android.view.View[@text='Faq(s)']//following::android.view.View[1]")
    public MobileElement assertQuestionUnderFAQ;


     @AndroidFindBy(xpath = "//android.widget.Button[@text='Content play']")
    public MobileElement assertContentPlaySection;


     @AndroidFindBy(xpath = "//android.widget.Button[@text='Profile']")
    public MobileElement assertProfileSection;


     @AndroidFindBy(xpath = "//android.widget.Button[@text='Login']")
    public MobileElement assertLoginSection;


     @AndroidFindBy(xpath = "//android.widget.Button[@text='Content creation']")
    public MobileElement assertContentCreationSection;


     @AndroidFindBy(xpath = "//android.widget.Button[@text='Other']")
    public MobileElement assertOtherSection;


     @AndroidFindBy(xpath = "//android.widget.Button[@text='Managing projects']")
    public MobileElement assertManagingProjectsSection;


     @AndroidFindBy(xpath = "//android.widget.EditText")
    public MobileElement clkOnTextBox;


     @AndroidFindBy(xpath = "//android.view.View[contains(@text,'Thanks for your feedback.')]")
    public MobileElement assertFeedbackMessage;



     @AndroidFindBy(xpath = "//android.view.View[@text='Content play']")
    public MobileElement assertCategoryInHelpPage;



     @AndroidFindBy(xpath = "//android.view.View[contains(@text,'When I try to play a video, I get an error')]")
    public MobileElement questionRelatedToVideoContent;


     @AndroidFindBy(xpath = "//android.widget.TextView[@text='Download the video and play it,']")
    public MobileElement solution1ForVideoRelatedQuestion;


     @AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,'If you do not see the download option,')]")
    public MobileElement solution2ForVideoRelatedQuestion;






    @AndroidFindAll({
            @AndroidBy(xpath = "//android.view.View[@text='Staging Custodian Organization']"),
            @AndroidBy(xpath = "//android.view.View[@text='Pre-prod Custodian Organization']"),
    })
    public MobileElement assertOrgNameBelowDikshaID;


    @AndroidFindBy(xpath = "//android.view.View[@text='Content preference']")
    public MobileElement assertContentPreferenceLabel;


    @AndroidFindBy(xpath = "//android.view.View[contains(@text,'Role')]")
    public MobileElement assertRoleSectionUnderContentPreferenceLabel;


    @AndroidFindAll({
            @AndroidBy(xpath = "//android.view.View[contains(@text,'Sub-role')]"),
            @AndroidBy(xpath = "//android.view.View[contains(@text,'Subrole')]"),
    })
    public MobileElement assertSubRoleSectionUnderContentPreferenceLabel;


    @AndroidFindBy(xpath = "//android.view.View[contains(@text,'District')]")
    public MobileElement assertDistrictSectionUnderContentPreferenceLabel;


    @AndroidFindBy(xpath = "//android.view.View[contains(@text,'State')]")
    public MobileElement assertStateSectionUnderContentPreferenceLabel;


    @AndroidFindBy(xpath = "//android.view.View[contains(@text,'Board')]")
    public MobileElement assertBoardSectionUnderContentPreferenceLabel;


    @AndroidFindBy(xpath = "//android.view.View[contains(@text,'Medium')]")
    public MobileElement assertMediumSectionUnderContentPreferenceLabel;


    @AndroidFindBy(xpath = "//android.view.View[contains(@text,'Classes')]")
    public MobileElement assertClassesSectionUnderContentPreferenceLabel;


    @AndroidFindBy(xpath = "//android.view.View[contains(@text,'Subjects')]")
    public MobileElement assertSubjectsSectionUnderContentPreferenceLabel;


    @AndroidFindBy(xpath = "//android.widget.TextView[@text='My learning']//following::android.view.View[3]")
    public MobileElement assertEnrolledCourseUnderMyLearning;



    @AndroidFindBy(xpath = "//android.widget.Button[@text='Course']")
    public MobileElement assertCourseUnderCategory;


    @AndroidFindBy(xpath = "//android.view.View[@text='Explore Course']")
    public MobileElement assertExploreCourseLabel;


    @AndroidFindBy(xpath = "//android.widget.Button[@text='Accountancy']")
    public MobileElement assertAccountancySubject;


    @AndroidFindBy(xpath = "//android.view.View[@text='Explore Accountancy']")
    public MobileElement assertExploreAccountancyLabel;


    @AndroidFindBy(xpath = "//android.view.View[@text='Category, Category']")
    public MobileElement assertCategoryFilter;



    @AndroidFindBy(xpath = "//android.view.View[@text='Role, Role']")
    public MobileElement assertRoleFilter;



    @AndroidFindBy(xpath = "//android.view.View[@text='Subject, Subject']")
public MobileElement assertSubjectFilter;



    @AndroidFindBy(xpath = "//android.widget.Button[@text='Course']//following::android.view.View[2]")
    public  MobileElement assertNavigationFilterBasedOnSubject;


    @AndroidFindBy(xpath = "//android.widget.Button[@text='Course']//following::android.view.View[3]")
    public MobileElement assertGroupingBasedOnPrimaryCategory;


    @AndroidFindBy(xpath = "//android.widget.Button[@text='Course Assessment']//following::android.view.View[2]")
    public MobileElement assertNavigationFilterBasedPrimaryCategory;


    @AndroidFindBy(xpath = "//android.widget.Button[@text='Course Assessment']//following::android.view.View[3]")
    public MobileElement assertGroupingBasedOnSubject;


}
    	
    	
    	


    




