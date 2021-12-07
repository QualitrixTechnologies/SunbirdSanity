 package com.qualitrix.pageObjects;

import java.util.List;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidBy;
import io.appium.java_client.pagefactory.AndroidFindAll;
import io.appium.java_client.pagefactory.AndroidFindBy;

/**
 * This Class has all the Objects related to Training Page.
 *
 * @author Gurukiran H N
 * @version 1.0
 * @since 20/March/2020
 */
public class TrainingPageObjects {

    @AndroidFindAll({
            @AndroidBy(xpath = "//android.widget.Button[@text='ic_filter']"),
            @AndroidBy(xpath = "//android.widget.Button[@text='search filter']"),
            @AndroidBy(xpath = "//android.widget.Button[@text='filter ']")
    })
    public MobileElement filterBtn;

    @AndroidFindBy(xpath = "//android.widget.Button[@text='search']")
    public MobileElement searchBtn;

    @AndroidFindBy(xpath = "//android.widget.Button[@text='CANCEL']")
    public MobileElement cancelBtn;

    @AndroidFindBy(xpath = "//android.widget.Button[@text='APPLY']")
    public MobileElement applyBtn;

    @AndroidFindBy(xpath = "//android.view.View[@text='Topic']")
    public MobileElement topicBtn;

    @AndroidFindBy(xpath = "//android.view.View[@text='Purpose']")
    public MobileElement purposeBtn;

    @AndroidFindBy(xpath = "//android.widget.Button[@text='trash Delete']")
    public MobileElement trashDelete;

    @AndroidFindBy(xpath = "//android.widget.Button[@text='share Share']")
    public MobileElement shareBtn;

    @AndroidFindBy(xpath = "//android.widget.Image[@text='arrow up']")
    public MobileElement arrowUp;

    @AndroidFindBy(xpath = "//android.widget.Image[@text='menu-icon']")
    public MobileElement menuIcon;

    @AndroidFindBy(xpath = "//android.view.View[@text='Medium']")
    public MobileElement mediumBtn;

    @AndroidFindBy(xpath = "//android.view.View[@text='Your Progress']")
    public MobileElement progressBar;

    @AndroidFindBy(xpath = "//android.view.View[@text='Class']")
    public MobileElement classBtn;

    @AndroidFindBy(xpath = "//android.view.View[@text='Subject']")
    public MobileElement subjectBtn;

    @AndroidFindBy(xpath = "//android.view.View[@text='Organization']")
    public MobileElement orgBtn;

    @AndroidFindBy(xpath = "//android.view.View[@text=' Science']")
    public MobileElement scienceBtn;

    @AndroidFindBy(xpath = "//android.view.View[@text=' Social Science']")
    public MobileElement socialScienceBtn;

    @AndroidFindBy(xpath = "//android.view.View[@text='Biology']")
    public MobileElement bioBtn;

    @AndroidFindBy(xpath = "//android.widget.CheckBox[@text='Concepts Understanding']")
    public MobileElement conceptsBtn;

    @AndroidFindBy(xpath = "//android.widget.CheckBox[@text='Teaching Techniques']")
    public MobileElement tchngBtn;

    @AndroidFindBy(xpath = "//android.widget.CheckBox[@text='Assessment Techniques']")
    public MobileElement assessmentBtn;

    @AndroidFindBy(xpath = "//android.widget.CheckBox[@text='Communication & Engagement']")
    public MobileElement communicationBtn;

    @AndroidFindBy(xpath = "//android.widget.CheckBox[@text='Curriculum And Learning Objectives']")
    public MobileElement curriculumBtn;

    @AndroidFindBy(xpath = "//android.widget.CheckBox[@text='Telugu']")
    public MobileElement teluguMdmObj;

    @AndroidFindBy(xpath = "//android.widget.CheckBox[@text='English']")
    public MobileElement englishMdmObj;

    @AndroidFindBy(xpath = "//android.widget.CheckBox[@text='Assamese']")
    public MobileElement assameseMdmObj;

    @AndroidFindBy(xpath = "//android.widget.CheckBox[@text='Hindi']")
    public MobileElement hindiMdmObj;

    @AndroidFindBy(xpath = "//android.widget.CheckBox[@text='Konkani']")
    public MobileElement konkaniMdmObj;

    @AndroidFindBy(xpath = "//android.widget.CheckBox[@text='Class 1']")
    public MobileElement classOneObj;

    @AndroidFindBy(xpath = "//android.widget.CheckBox[@text='Class 2']")
    public MobileElement classTwoObj;

    @AndroidFindBy(xpath = "//android.widget.CheckBox[@text='Chemistry']")
    public MobileElement chemistryObj;

    @AndroidFindBy(xpath = "//android.widget.CheckBox[@text='Physics']")
    public MobileElement physicsObj;

    @AndroidFindBy(xpath = "//android.widget.CheckBox[@text='Biology']")
    public MobileElement biologyObj;

    @AndroidFindBy(xpath = "//android.widget.CheckBox[@text='Kerala State']")
    public MobileElement keralaStateObj;

    @AndroidFindBy(xpath = "//android.widget.CheckBox[@text='Punjab']")
    public MobileElement punjabObj;

    @AndroidFindBy(xpath = "//android.widget.CheckBox[@text='Rajasthan']")
    public MobileElement rajasthanObj;

    @AndroidFindBy(xpath = "//android.widget.CheckBox[@text='Gujarati']")
    public MobileElement gujaratiMdmObj;

    @AndroidFindAll({
            @AndroidBy(xpath = "//android.widget.Image[@text='eng_2nd-lang_1561704039945.thumb']"),
            @AndroidBy(xpath = "//android.view.View[@text='PISA Orientation 2021']")
    })
    public MobileElement englishImage;

    @AndroidFindAll({
            @AndroidBy(xpath = "//android.widget.Button[@text='OPEN']"),
            @AndroidBy(xpath = "//android.widget.Button[@text='OPEN ']")
    })
    public MobileElement openBtn;

    @AndroidFindAll({
            @AndroidBy(xpath = "//android.view.View[@text='Copy Of AutomationCourseContent']")
    })
    public MobileElement copiedCourse;

    @AndroidFindAll({
            @AndroidBy(xpath = "//android.view.View[@text='https://creativecommons.org/licenses/by/4.0/legalcode']"),
            @AndroidBy(xpath = "//android.view.View[@text='https://creativecommons.org/licenses/by-sa/4.0/legalcode']"),
            @AndroidBy(xpath = "//android.widget.ToggleButton[@text='https://creativecommons.org/licenses/by-sa/4.0/legalcode']"),
            @AndroidBy(xpath = "//android.view.View[@text='https://creativecommons.org/licenses/by-nc-sa/4.0/legalcode']")
    })
    public MobileElement termsAndCondLink;

    @AndroidFindAll({
            @AndroidBy(xpath = "//android.widget.Button[@text='Training Information']"),
            @AndroidBy(xpath = "//android.widget.ToggleButton[@text='Training Information']"),
            @AndroidBy(xpath = "//android.widget.Button[@text='Training Information ']"),
            @AndroidBy(xpath = "//android.widget.ToggleButton[@text='Training Information ']"),
            @AndroidBy(xpath = "//android.widget.ToggleButton[@text='Course information']"),

          
    })
    public MobileElement trainingInfoObj;

    
    
    @AndroidFindAll({
            @AndroidBy(xpath = "//android.widget.Button[@text='Training Modules']"),
            @AndroidBy(xpath = "//android.widget.ToggleButton[@text='Training Modules']"),
            @AndroidBy(xpath = "//android.widget.Button[@text='Training Modules ']"),
            @AndroidBy(xpath = "//android.widget.ToggleButton[@text='Training Modules ']")
    })
    public MobileElement trainingModuleObj;

    @AndroidFindAll({
            @AndroidBy(xpath = "//android.widget.Button[@text='Join Training']"),
            @AndroidBy(xpath = "//android.widget.Button[@text='Join Training ']"),
            @AndroidBy(xpath = "//android.widget.Button[@text='Join course']"),
            @AndroidBy(xpath = "//android.widget.ToggleButton[@text='Course details']//preceding::android.widget.Button[1]"),
            @AndroidBy(xpath = "//android.widget.Button[@text='JOIN COURSE']"),

    })
    public MobileElement joinTrainingBtn;

    @AndroidFindBy(xpath = "//android.widget.Button[@text='cloud download Download']")
    public MobileElement downloadBtn;

    @AndroidFindAll({
            @AndroidBy(xpath = "//android.widget.Button[@text='Download']"),
            @AndroidBy(xpath = "//android.widget.Button[@text='Download ']")
    })
    public MobileElement downloadPopUpBtn;

    @AndroidFindAll({
            @AndroidBy(xpath = "//android.view.View[@text='Downloading']"),
            @AndroidBy(xpath = "//android.widget.Button[@text='Hide']"),
            
            
    })
    public MobileElement downloadingObj;

    @AndroidFindBy(xpath = "//android.view.View[contains(@text,'Class 1')]")
    public MobileElement classInfo;

    @AndroidFindBy(xpath = "//android.view.View[contains(@text,'Chemistry')]")
    public MobileElement subjectInfo;

    @AndroidFindBy(xpath = "//android.view.View[contains(@text,'English')]")
    public MobileElement mediumInfo;

    @AndroidFindBy(xpath = "//*[contains(@text,'do_')]")
    public MobileElement downloadingNotification;

    @AndroidFindBy(xpath = "//*[contains(@text,'Downloads')]")
    public MobileElement downloadsNot;

    @AndroidFindBy(xpath = "//*[contains(@text,'Downloaded successfully')]")
    public MobileElement downloadSuccess;

    @AndroidFindAll({
            @AndroidBy(xpath = "//android.view.View[@text='Author:']"),
            @AndroidBy(xpath = "//android.view.View[@text='sachin atri']")
    })
    public MobileElement authorObj;

    @AndroidFindAll({
            @AndroidBy(xpath = "//android.view.View[@text='Published on DIKSHA by:']"),
            @AndroidBy(xpath = "//android.view.View[@text='Odisha']")
    })
    public MobileElement publishObj;

    @AndroidFindAll({
            @AndroidBy(xpath = "//android.view.View[@text='Attribution(s):']"),
            @AndroidBy(xpath = "//android.view.View[@text='sachin']")
    })
    public MobileElement attributionObj;

    @AndroidFindAll({
            @AndroidBy(xpath = "//android.view.View[@text='License terms:']"),
            @AndroidBy(xpath = "//android.view.View[@text='CC BY-NC-SA 4.0']")
    })
    public MobileElement licenseTermsObj;

    @AndroidFindAll({
            @AndroidBy(xpath = "//android.view.View[@text='Copyright:']"),
            @AndroidBy(xpath = "//android.view.View[@text='Odisha, 2019']")
    })
    public MobileElement copyRightObj;

    @AndroidFindAll({
            @AndroidBy(xpath = "//android.widget.Button[@text='play-icon Start Now']"),
            @AndroidBy(xpath = "//android.widget.Button[@text='play-icon Start Now ']")
    })
    public MobileElement startNowBtn;

    
    @AndroidFindAll({
        @AndroidBy(xpath = "//android.widget.Button[@text='play-icon Continue']"),
})
public MobileElement clkContinuew;

    
  
    @AndroidFindAll({
        @AndroidBy(xpath = "//android.view.View[@text='Done']"),
})
public MobileElement clkDoneButton;

    
    
    @AndroidFindAll({
            @AndroidBy(xpath = "//android.widget.Button[@text='arrow back']"),
            @AndroidBy(xpath = "//android.widget.Button[@text='arrow back ']")
    })
    public MobileElement backBtn;

    @AndroidFindAll({
            @AndroidBy(xpath = "//android.widget.Button[@text='Join']"),
            @AndroidBy(xpath = "//android.widget.Button[@text='Join ']"),
            @AndroidBy(xpath = "//android.widget.Button[@text='Join course']")

              })
    public MobileElement joinBtn;

    @AndroidFindBy(className = "android.widget.TabWidget")
    public MobileElement selectBtn;

    @AndroidFindBy(xpath = "//*[@class='android.view.View' and @text='Featured Trainings']//following::android.view.View[1]")
    public MobileElement selectEnrollmentViewAll;

    @AndroidFindBy(xpath = "//*[@class='android.view.View' and @text='Latest Courses']//following::android.view.View[1]")
    public MobileElement latestCoursesViewAll;

    @AndroidFindBy(xpath = "//*[@class='android.view.View' and @text='My Trainings']//following::android.view.View[1]")
    public MobileElement myTrainingsViewAll;

    @AndroidFindBy(xpath = "//*[@class='android.view.View' and @text='Featured Trainings']//following::android.view.View[1]")
    public MobileElement featuredTrainingViewAll;
    
   
  
   
    @AndroidFindAll({
        @AndroidBy(xpath = "//android.view.View[@text='AutomationCourseContent']"),
        @AndroidBy(xpath = "//android.view.View[@text='Copy of AutomationCourseContent']"),
        @AndroidBy(xpath = "//android.view.View[@text='DownloadAutomationContent']"),
        @AndroidBy(xpath = "//android.view.View[@text='AssesmentAutomationContent']"),
        @AndroidBy(xpath = "//android.view.View[@text='AutomationCourseUsingTextBook']"),
        @AndroidBy(xpath = "//android.view.View[@text='AutomationLeaveCourse']")

        
})
public MobileElement CourseSearch;
    
    @AndroidFindAll({
        @AndroidBy(xpath = "//android.view.View[@text='AutomationBookContent']")
})
public MobileElement BookSearch;



    @AndroidFindAll({
            @AndroidBy(xpath = "//android.view.View[@text='10SecPDF']"),
            @AndroidBy(xpath = "//android.view.View[@text='AutomationResource']"),
            @AndroidBy(xpath = "//android.widget.Image[@index='0']"),
            @AndroidBy(xpath = "//android.view.View[contains(@text,'Resource')]//following::android.view.View[1]")

    })
    public MobileElement ResourceSearch;


@AndroidFindAll({
       @AndroidBy(xpath = "//android.view.View[@text='Featured Trainings']//following::android.widget.Button"),
            @AndroidBy(xpath = "//android.view.View[@text='Featured Courses']//following::android.widget.Button"),

   
})
public MobileElement viewAllFeaturedTraings;

@AndroidFindAll({
    @AndroidBy(xpath = "//android.view.View[@text='Latest Courses']//following::android.widget.Button"),
})
public MobileElement viewAllLatestCourse;


@AndroidFindAll({
    @AndroidBy(xpath = "//android.view.View[@text='Featured Trainings']//following::android.view.View[2]"),
    @AndroidBy(xpath = "//android.view.View[@text='Featured courses']//following::android.view.View[2]"),

})
public MobileElement clkFeaturedCourse;


@AndroidFindAll({
    @AndroidBy(xpath = "//android.view.View[@text='Latest Courses']//following::android.view.View[2]"),
    @AndroidBy(xpath = "//android.view.View[@text='Latest courses']//following::android.view.View[2]"),

    
  
})
public MobileElement clkLatestCourse;


@AndroidFindBy(xpath = "//android.widget.Image[@text='menu-icon']")
public MobileElement sltCourseMenuIcon;

@AndroidFindAll({
        @AndroidBy(xpath = "//android.widget.Button[contains(@text,'Leave')]"),
        @AndroidBy(xpath = "//android.widget.Button[@text='Leave course']"),
})
public MobileElement clkLeaveCourse;

@AndroidFindAll({
        @AndroidBy(xpath = "//android.widget.Button[@text='Confirm']"),
        @AndroidBy(xpath = "//android.widget.Button[@text='CONFIRM']"),
})
public MobileElement clkConfirmButton;


@AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,'Course last updated on')]")
public MobileElement assertCourseUpdatedMessageWithDate;


@AndroidFindBy(xpath = "//android.view.View[contains(@text,'Batch ends in')]")
public MobileElement assertTimerWithXdaysYhoursZmin;

















@AndroidFindAll({ @AndroidBy(xpath = "//android.view.View[@text='Ongoing']"),

})
public MobileElement ongoingCourse;


@AndroidFindAll({ @AndroidBy(xpath = "//android.view.View[contains(@text,'Completed ')]"),

})
public MobileElement completedCourse;

@AndroidFindAll({ @AndroidBy(xpath = "//android.view.View[contains(@text,' successfully completed ')]") })
public MobileElement completedMessage;





@AndroidFindAll({ @AndroidBy(xpath = "//android.widget.Button[@text='Do not share']"),

})
public MobileElement clkDontShareBtn;

//@AndroidFindAll({ @AndroidBy(xpath = "//android.widget.Button[@text='play-icon Start learning']"),
//
//})
//public MobileElement clkStartLearning;


@AndroidFindAll({ @AndroidBy(xpath = "//android.view.View[@text='50% completed']"),

})
public MobileElement verify50PercentProgress;


@AndroidFindAll({ @AndroidBy(xpath = "//android.widget.Button[@text='play-icon Continue Learning']"),

})
public MobileElement clkContinueLearning;


@AndroidFindAll({ @AndroidBy(xpath = "//android.view.View[@text='You have successfully completed this course']"),

})
public MobileElement verifyCompletedMsg;


@AndroidFindBy(xpath = "//android.widget.Button[@text='OK']")
public MobileElement clkOkToCancel;


@AndroidFindAll({ @AndroidBy(xpath = "//android.view.View[@text='courses Courses']"),

})
public MobileElement tapCoureBtn;


@AndroidFindAll({
      
       @AndroidBy(xpath = "//android.widget.Image[@index='0']"),
       @AndroidBy(xpath = "//android.widget.Image[@index='2']"),
       @AndroidBy(xpath = "//android.widget.Image[@index='1']"),

})
public MobileElement PDFSearch;


@AndroidFindAll({
    @AndroidBy(xpath = "//android.view.View[@text='10SecVideo']"),
    })
public MobileElement tenSecVideoText;
@AndroidFindAll({ @AndroidBy(xpath = "//android.widget.Button[@text='play Start learning']"),
})
public MobileElement clkStartLearning;

@AndroidFindAll({
    @AndroidBy(xpath = "//android.view.View[@text='AutomationCourseContent']//following::android.view.View[@text='AutomationCourseContent']"),
})
public MobileElement courseContent2;

@AndroidFindAll({
    @AndroidBy(xpath = "//android.view.View[@text='AutomationCourseContent']"),
})
public MobileElement courseContentVerification;


@AndroidFindBy(xpath = "//android.view.View[@text='Board/Syllabus']")
public MobileElement boardFilter;
@AndroidFindBy(xpath = "//android.widget.CheckBox[@text='cbse']")
public MobileElement cbseBoard;
@AndroidFindBy(xpath = "//android.widget.Button[@text='APPLY FILTER']")
public MobileElement applyFilterBtn;
@AndroidFindBy(xpath = "//android.view.View[contains(@text,'CBSE')]")
public MobileElement verifyContentForAlternativeBoard;
@AndroidFindBy(xpath = "//android.view.View[contains(@text,'Showing')]//following::android.view.View[24]")
public MobileElement clkPdfContent;
@AndroidFindBy(xpath = "//android.widget.Button[@text='Play video']")
public MobileElement playPdfIcon;
@AndroidFindBy(xpath = "//android.widget.Button[@text='navigation-arrows-nextIcon']")
public MobileElement clkNextIcon;

@AndroidFindAll({
        @AndroidBy(xpath = "//android.widget.Button[@text='navigation-arrows-nextIcon']")
})
public List<MobileElement> nextIcon;

@AndroidFindBy(xpath = "//android.widget.Button[@text='navigation-arrows-previousIcon']")
public MobileElement clkPreviousIcon;

@AndroidFindBy(xpath = "//android.view.View[@resource-id='overlay-button']")
public MobileElement pdfHambergerIcon;

@AndroidFindBy(xpath = "//android.view.View[@text='Share']")
public MobileElement shareButton;

@AndroidFindBy(xpath = "//android.view.View[@text='Download']")
public MobileElement downloadButton;

@AndroidFindBy(xpath = "//android.view.View[@text='Print']")
public MobileElement printButton;

@AndroidFindBy(xpath = "//android.view.View[@text='Exit']")
public MobileElement exitButton;

@AndroidFindBy(xpath = "//android.widget.Image[@text='close']")
public MobileElement closeRatingIcon;

@AndroidFindBy(xpath = "//android.view.View[@text='You just completed']")
public MobileElement contentCompletedText;

@AndroidFindBy(xpath = "//android.view.View[@text='Replay']")
public MobileElement replayButton;

@AndroidFindBy(xpath = "//android.view.View[@text='Exit']")
public MobileElement exitButton2;

@AndroidFindBy(xpath = "//android.view.View[@index=3]")
public MobileElement userName;

@AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,'.pdf')]")
public MobileElement contentName;

@AndroidFindBy(xpath = "//android.view.View[@index=4]")
public MobileElement timeTakenToCompleteContent;

@AndroidFindBy(xpath = "//android.widget.TextView[@text='Rate Content']")
public MobileElement rateContentText;

@AndroidFindBy(xpath = "//android.widget.Button[@text='rate content Rate']")
public MobileElement updateRatingStar;

@AndroidFindBy(xpath = "//android.view.View[@text='Very Bad']")
public MobileElement veryBadRating;

@AndroidFindBy(xpath = "//android.widget.Button[@text='download content Download']")
public MobileElement clkDownloadContent;

@AndroidFindBy(xpath = "//android.widget.Button[@text='Download']")
public MobileElement clkDownloadBtn;

@AndroidFindBy(xpath = "//android.view.View[@index=3]")
public MobileElement downloadedContent;


@AndroidFindAll({ @AndroidBy(xpath = "//android.widget.ToggleButton[@text='Course details']//preceding::android.widget.Button[1]"),
@AndroidBy(xpath = "//android.widget.Button[@text='JOIN COURSE']"),
})
public MobileElement clkJoinCourseBtn;

@AndroidFindAll({
    @AndroidBy(xpath = "//android.widget.Button[@text='Forum']"),
})
public MobileElement forumIcon;

@AndroidFindAll({
    @AndroidBy(xpath = "//android.view.View[@text='प्यासा कौआ']"),
})public MobileElement hindiText;


@AndroidFindAll({
    @AndroidBy(xpath = "//android.widget.Button[@text='Course details']"),
})
public MobileElement clkCourseDetails;

@AndroidFindAll({
    @AndroidBy(xpath = "//android.view.View[@text='Currently, this course does not have a certificate. The course creator may attach a certificate later.']"),
})
public MobileElement viewCertificateMsg;

@AndroidFindBy(xpath = "//android.view.View[@text='FILTER BY']")
public MobileElement assertFilterBy;
@AndroidFindBy(xpath = "//android.widget.Button[@text='RESET filter by']")
public MobileElement assertResetBtn;
@AndroidFindBy(xpath = "//android.view.View[@text='Media Type']")
public MobileElement clkMediaTypeFilter;
@AndroidFindBy(xpath = "//android.widget.CheckBox[@text='All']")
public MobileElement clkAllMediaTypeFilter;
@AndroidFindBy(xpath = "//android.widget.Button[@text='CONFIRM']")
public MobileElement clkConfirmBtn;
@AndroidFindBy(xpath = "//android.widget.Button[@text='APPLY FILTER']")
public MobileElement clkApplyFilterBtn;
@AndroidFindBy(xpath = "//android.view.View[contains(@text,'Showing 100 results')]//following::android.view.View[1]")
public MobileElement assertContentAfterFiltering;



@AndroidFindBy(xpath = "//android.view.View[@text='Congratulations!']")
public MobileElement congratulationsMsg;
@AndroidFindBy(xpath = "//android.view.View[@text='You have successfully completed this course']")
public MobileElement courseCompletedMsg;
@AndroidFindBy(xpath = "//android.view.View[@text='Note: This course does not have a certificate']")
public MobileElement noCertificateMsg;



@AndroidFindBy(xpath = "//android.view.View[@text='Course']//following::android.view.View[1]")
public MobileElement accountancySubject;
@AndroidFindBy(xpath = "//android.view.View[@text='Course']//following::android.view.View[2]")
public MobileElement courseUnderSubject1;
@AndroidFindBy(xpath = "//android.view.View[@text='Course']//following::android.view.View[17]")
public MobileElement assameseSubject;
@AndroidFindBy(xpath = "//android.view.View[@text='Course']//following::android.view.View[18]")
public MobileElement courseUnderSubject2;
@AndroidFindBy(xpath = "//android.view.View[@text='Others']")
public MobileElement othersSection;
@AndroidFindBy(xpath = "//android.view.View[@text='Others']//following::android.view.View[1]")
public MobileElement courseUnderOthers;





@AndroidFindBy(xpath = "//android.view.View[@text='Want to check courses?']")
    public MobileElement assertCheckCourseMsg;


@AndroidFindBy(xpath = "//android.widget.Button[@text='Login']")
    public MobileElement loginBtnInCourseSection;


@AndroidFindBy(xpath = "//android.view.View[@text='LOGIN']")
    public MobileElement loginPopUp;

@AndroidFindBy(xpath = "//android.widget.TextView[@text='You must log in to access course details']")
    public MobileElement messageInLoginPopup;

@AndroidFindBy(xpath = "//android.widget.Button[@text='LOGIN']")
    public MobileElement clkLoginBtn;


@AndroidFindBy(xpath = "//android.view.View[@text='You can't enroll to a course created by self']")
    public MobileElement canNotEnrollMsg;


@AndroidFindBy(xpath = "//android.widget.ListView")
    public MobileElement assertLimitedCourse;


@AndroidFindBy(xpath = "//android.view.View[@index='4']")
    public MobileElement clkLastQuestion;


@AndroidFindBy(xpath = "//android.view.View[@index='2']")
    public MobileElement clkNextArrowIcon;


@AndroidFindBy(xpath = "//android.view.View[@text='Replay']")
    public MobileElement clkReplayBtn;


@AndroidFindBy(xpath = "//android.view.View[@text='This is the last remaining attempt']")
    public MobileElement assertLastAttemptMsg;


@AndroidFindBy(xpath = "//android.widget.Button[@text='Continue']")
    public MobileElement clkContinueBtn;


    @AndroidFindAll({
            @AndroidBy(xpath = "//android.widget.TextView[contains(@text,'attempts completed')]"),
            @AndroidBy(xpath = "//android.widget.TextView[@text='You have exceeded the maximum number of attempts to submit the assessment']"),
            @AndroidBy(xpath = "//android.view.View[@text='You have exceeded the maximum number of attempts to submit the assessment']"),
    })
    public MobileElement maxAttemptsExceededMsg;


@AndroidFindBy(xpath = "//android.view.View[contains(@text,'Score')][2]")
    public MobileElement assertScoreCard;


    @AndroidFindBy(xpath = "//android.view.View[@text='exit Exit']")
    public MobileElement assertExitBtn;


    @AndroidFindBy(xpath = "//android.view.View[contains(@text,'AutomationBookContent')]")
    public MobileElement assertContentTitle;


    @AndroidFindBy(xpath = "//android.view.View[contains(@text,'AutomationBookContent')]//following::android.view.View[1]")
    public MobileElement assertContentPublisher;


    @AndroidFindBy(xpath = "//android.view.View[contains(@text,'CBSEEnglish')]")
    public MobileElement assertBoardMediumClassSubject;


    @AndroidFindBy(xpath = "//android.view.View[@text='Content Details']")
    public MobileElement assertContentDetails;


    @AndroidFindBy(xpath = "//android.view.View[@text='This Textbook is relevant for:']")
    public MobileElement assertContentRelevantFor;


    @AndroidFindBy(xpath = "//android.view.View[contains(@text,'Class : Class')]")
    public MobileElement assertClassInContentDetails;


    @AndroidFindBy(xpath = "//android.view.View[contains(@text,'Medium : English')]")
    public MobileElement assertMediumInContentDetails;


    @AndroidFindBy(xpath = "//android.view.View[contains(@text,'Board : CBSE')]")
    public MobileElement assertBoardInContentDetails;


    @AndroidFindBy(xpath = "//android.view.View[contains(@text,'User Type : Student')]")
    public MobileElement assertUserTypeInContentDetails;



    @AndroidFindBy(xpath = "//android.widget.Button[contains(@text,'Play')]")
    public MobileElement clkOnPlayIcon;


    @AndroidFindAll({
            @AndroidBy(xpath = "//android.view.View[@text='Player Menu']"),
            @AndroidBy(xpath = "//android.widget.Button[@text='Player Menu']")
    })
    public MobileElement clkOnHamburgerMenu;


    @AndroidFindBy(xpath = "//android.view.View[@text='Share']")
    public MobileElement assertShareBtn;


    @AndroidFindBy(xpath = "//android.view.View[@text='Download']")
    public MobileElement assertDownloadBtn;


    @AndroidFindBy(xpath = "//android.view.View[@text='Print']")
    public MobileElement assertPrintBtn;


    @AndroidFindBy(xpath = "//android.view.View[@text='Exit']")
    public MobileElement assertExitButton;


    @AndroidFindBy(xpath = "//android.view.View[@text='Confirm Download']")
    public MobileElement assertConfirmDownloadPopUp;


    @AndroidFindBy(xpath = "//android.widget.Button[@text='DOWNLOAD']")
    public MobileElement assertDownloadButtonInPopup;


    @AndroidFindBy(xpath = "//android.widget.Button[@text='CANCEL']")
    public MobileElement assertCancelButtonInPopup;



    @AndroidFindBy(xpath = "//android.view.View[contains(@text,'information circle Last date to join')]")
    public MobileElement assertEnrollmentEndDate;


    @AndroidFindBy(xpath = "//android.widget.Button[@text='Course details']")
    public MobileElement assertCourseDetails;


    @AndroidFindBy(xpath = "//android.view.View[@text='This course is relevant for:']")
    public MobileElement assertCourseRelevantFor;


    @AndroidFindBy(xpath = "//android.view.View[@text='CourseContent']")
    public MobileElement assertCourse;


    @AndroidFindBy(xpath = "//android.view.View[contains(@text,'The course's batch is available from')]")
    public MobileElement assertBatchStartDateMessage;



}
