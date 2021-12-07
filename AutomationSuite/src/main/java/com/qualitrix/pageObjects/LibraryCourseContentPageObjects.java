package com.qualitrix.pageObjects;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidBy;
import io.appium.java_client.pagefactory.AndroidFindAll;
import io.appium.java_client.pagefactory.AndroidFindBy;

import java.util.List;

/**
 * This Class has all the Objects related to Library coourse content Page.
 *
 * @author Gurukiran H N
 * @version 1.0
 * @since 24/March/2020
 */
public class LibraryCourseContentPageObjects {


    
    @AndroidFindAll({
        @AndroidBy(xpath = "//android.widget.Button[@text='download content Download']"),
        @AndroidBy(xpath = "//android.widget.Button[@text='cloud download Download']"),

})
public MobileElement downloadBtn;
  

    @AndroidFindBy(xpath = "//android.widget.Button[@text='notifications outline']")
    public MobileElement notificationBtn;

    @AndroidFindBy(xpath = "//android.widget.Button[@text='SEE MORE BOOKS AND CONTENT']")
    public MobileElement viewMoreOpt;

    @AndroidFindBy(xpath = "//android.widget.Button[@text='SORT BY']")
    public MobileElement sortBy;

    @AndroidFindBy(xpath = "//android.view.View[@resource-id='mediumScroll']")
    public MobileElement mediumScroll;

   
    @AndroidFindAll({
    	
    	
        @AndroidBy(xpath = "//android.widget.Button[@text='share Share']"),
        @AndroidBy(xpath = "//android.widget.Button[@text='share content Share']"),

})
public MobileElement shareBtn;

    
    @AndroidFindBy(xpath = "//android.widget.Button[@text='trash Delete']")
    public MobileElement deleteBtn;

    @AndroidFindBy(xpath = "//android.view.View[@text='A Happy Child ']")
    public MobileElement audioContent;

    @AndroidFindAll({
    	
    	
            @AndroidBy(xpath = "//android.widget.Button[@text='play-circle']"),
            @AndroidBy(xpath = "//android.widget.Button[@text='PLAY']"),
            @AndroidBy(xpath = "//android.widget.Button[contains(@text,'PLAY')]"),
            @AndroidBy(xpath = "//android.widget.Button[@text='share content Share']//following::android.widget.Button"),

    })
    public MobileElement playIcon;


    @AndroidFindBy(xpath = "//android.widget.Button[@text='Play video']")
    public MobileElement playIcon1;

    
    @AndroidFindAll({
    	 @AndroidBy(xpath="//android.widget.Image[@text='arrow up']//following::android.widget.Image")
      //  @AndroidBy(xpath = "//android.widget.Button[@text='PLAY']")
})
public MobileElement qnWithImage;

  
   /* @AndroidFindBy(xpath = "//*[contains(@text,'Unit 1')]//following::android.view.View[6]")
    // @AndroidFindBy(xpath = "//android.view.View[@text='Question with image']")
    public MobileElement qnWithImage;
*/
    @AndroidFindBy(xpath = "//android.view.View[@text='Read More']")
    public MobileElement readMore;

    @AndroidFindBy(xpath = "//android.view.View[@text='Thank you for rating the content!']")
    public MobileElement feedbackPopUp;

    @AndroidFindBy(xpath = "//android.widget.Button[@text='trash Delete']")
    public MobileElement trashDelete;

    @AndroidFindBy(xpath = "//android.widget.Button[@text='share Share']")
    public MobileElement shareIconInsideContent;

    @AndroidFindBy(xpath = "//android.widget.Button[@text='star outline Rate']")
    public MobileElement rateObj;

    @AndroidFindBy(xpath = "//android.widget.Button[@text='star']")
    public MobileElement startBtn;

    @AndroidFindBy(xpath = "//android.widget.Button[@text='Submit']")
    public MobileElement submitBtn;

    @AndroidFindBy(className = "android.widget.EditText")
    public MobileElement editText;

    @AndroidFindBy(xpath = "//android.view.View[@text='Content is inaccurate']")
    public MobileElement feedbackChkbx;

    @AndroidFindBy(xpath = "//android.widget.Button[@text='OK']")
    public MobileElement okBtn;

    @AndroidFindBy(xpath = "//android.view.View[@text='All']")
    public MobileElement allBtn;

    @AndroidFindAll({
            @AndroidBy(xpath = "//*[contains(@text,'Three Little Pigs')]"),
            @AndroidBy(xpath = "//*[contains(@text,'Unit 1')]")
    })
    public MobileElement content1;

    @AndroidFindBy(xpath = "//*[contains(@text,'Unit 1')]")
    public MobileElement unit1;

    @AndroidFindBy(xpath = "//*[contains(@text,'UT 10sep')]")
    public MobileElement secondContent;

    @AndroidFindBy(xpath = "//*[contains(@text,'Unit 2')]")
    public MobileElement unit2;

    @AndroidFindBy(xpath = "//*[contains(@text,'The Bubble')]")
    public MobileElement content2;

    @AndroidFindBy(xpath = "//*[contains(@text,'One Little Kitten')]")
    public MobileElement content3;

    @AndroidFindBy(xpath = "//*[contains(@text,'The Tailor')]")
    public MobileElement content4;

    @AndroidFindBy(xpath = "//*[contains(@text,'Clouds')]")
    public MobileElement content5;

    @AndroidFindBy(xpath = "//android.view.View[@text='Video']")
    public MobileElement videoBtn;

    @AndroidFindBy(xpath = "//android.view.View[@text='Documents']")
    public MobileElement documentsBtn;

    @AndroidFindBy(xpath = "//android.view.View[@text='Interactive']")
    public MobileElement interactionBtn;

    @AndroidFindAll({
            @AndroidBy(xpath = "//android.widget.TextView[@text='Credits & License Info']"),
            @AndroidBy(xpath = "//android.view.View[@text='Credits & License Info']"),
            @AndroidBy(xpath = "//android.view.View[@text='Credits & License Infoarrow down']"),
    })
    public MobileElement licenseBtn;

    @AndroidFindAll({
            @AndroidBy(xpath = "//android.view.View[@text='https://creativecommons.org/licenses/by/4.0/legalcode']"),
            @AndroidBy(xpath = "//android.view.View[@text='https://creativecommons.org/licenses/by-sa/4.0/legalcode']"),
            @AndroidBy(xpath = "//android.view.View[@text='https://creativecommons.org/licenses/by/4.0/legalcode']")
    })
    public MobileElement termsAndCondLink;

    @AndroidFindAll({
            @AndroidBy(xpath = "//android.view.View[@text='Copyright:']"),
            @AndroidBy(xpath = "//android.view.View[@text='Odisha, 2019']")
    })
    public MobileElement copyRightObj;

    @AndroidFindAll({
            @AndroidBy(xpath = "//android.view.View[@text='Created on DIKSHA by:']"),
           // @AndroidBy(xpath = "//android.view.View[@text='Qualitrix Content Creator Cr']")
            @AndroidBy(xpath = "//android.view.View[@text='content creator']")

    })
    public MobileElement createdObj;

    @AndroidFindAll({
            @AndroidBy(xpath = "//android.view.View[@text='Published on DIKSHA by:']"),
            @AndroidBy(xpath = "//android.view.View[@text='diksha_ntptest_org']")
    })
    public MobileElement publishObj;

    @AndroidFindAll({
            @AndroidBy(xpath = "//android.view.View[@text='License terms:']"),
            @AndroidBy(xpath = "//android.view.View[@text='CC BY-NC-SA 4.0']"),
            @AndroidBy(xpath = "//android.view.View[@text='CC BY 4.0']")

            
    })
    public MobileElement licenseTermsObj;


    @AndroidFindAll({
            @AndroidBy(xpath = "//android.widget.RadioButton[@text='Share link']"),
            @AndroidBy(xpath = "//android.view.View[@text='Share link']")
    })
    public MobileElement shareLink;


    @AndroidFindAll({
            @AndroidBy(xpath = "//android.widget.RadioButton[@text='Send file']"),
            @AndroidBy(xpath = "//android.view.View[@text='Send file']")
    })
    public MobileElement sendFile;


   @AndroidFindAll({
           @AndroidBy(xpath = "//android.widget.RadioButton[@text='Save file on device']"),
           @AndroidBy(xpath = "//android.view.View[@text='Save file on device']")
   })
    public MobileElement saveFile;

    @AndroidFindAll({
            @AndroidBy(xpath = "//android.view.View[@text='Marigold']"),
            @AndroidBy(xpath = "//android.view.View[@text='Assam text book']"),
            @AndroidBy(xpath = "//android.view.View[@text='Assam English 1 book']")

    })
    public MobileElement courseContent;

    @AndroidFindAll({
       // @AndroidBy(xpath = "//android.view.View[@text='Marigold']"),
        //@AndroidBy(xpath = "//android.view.View[@text='Assam text book']"),
        @AndroidBy(xpath = "//android.view.View[@text='AutomationBookContent']")

})
public MobileElement offlineplayCont;

    
    @AndroidFindBy(xpath = "//android.view.View[@text='Book contains copied contents']")
    public MobileElement downloadBook;
    
    @AndroidFindAll({
            @AndroidBy(xpath = "//android.view.View[@text='Sachin book 2']"),
            @AndroidBy(xpath = "//android.view.View[@index='3']")
    })
    public MobileElement copiedBook;

    @AndroidFindAll({
            @AndroidBy(xpath = "//android.view.View[@text='Question with image']")
    })
    public MobileElement bookContent;

    @AndroidFindBy(xpath = "//android.widget.Button[@text='Share']")
    public MobileElement shareBtn1;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Share with']")
    public MobileElement shareAlertPopUp;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='WhatsApp']")
    public MobileElement shareToWhatsApp;

    @AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.whatsapp:id/contactpicker_row_name']")
    public MobileElement whatsAppHomePage;

    @AndroidFindAll({
            @AndroidBy(className = "android.widget.GridView"),
            @AndroidBy(className = "android.widget.ListView")
    })
    public MobileElement thirdPartyApp;

    @AndroidFindAll({
            @AndroidBy(xpath = "//android.view.View[@text='Select chapter']"),
            @AndroidBy(xpath = "//android.widget.Image[@text='arrow dropright circle']")
    })
    public MobileElement selectChapterObj;

    @AndroidFindBy(xpath = "//android.view.View[@text='Audio']")
    public MobileElement audioObj;

    @AndroidFindBy(xpath = "//android.view.View[@text='Images']")
    public MobileElement imageObj;

    @AndroidFindBy(className = "android.view.View")
    public List<MobileElement> booksIndex;
    
    
    @AndroidFindAll({
        @AndroidBy(xpath = "//android.widget.Button[@text='SEE MORE BOOKS AND CONTENT']"),
})
public MobileElement clkSeeMoreBooksAndContent;


    @AndroidFindAll({
            @AndroidBy(xpath = "//android.view.View[contains(@text,'Class ')][2]"),
    })
    public MobileElement clkClass1;

    @AndroidFindAll({
            @AndroidBy(xpath = "//android.view.View[contains(@text,'Class ')][3]"),
    })
    public MobileElement clkClass2;


    @AndroidFindAll({
            @AndroidBy(xpath = "//android.widget.TextView[@text='Settings']"),
            @AndroidBy(xpath = "//android.view.View[contains(@text,'Settings')]"),
            @AndroidBy(xpath = "//android.widget.Button[@text='Settings']"),
    })

    public MobileElement Clksettings;

    @AndroidFindAll({
        // @AndroidBy(xpath = "//android.view.View[@text='Marigold']"),
         //@AndroidBy(xpath = "//android.view.View[@text='Assam text book']"),
         @AndroidBy(xpath = "//android.view.View[@text='Data Sync']"),
         @AndroidBy(xpath = "//android.view.View[@text='Data Sync Backup Data, Transfer Telemetry']"),
            @AndroidBy(xpath = "//android.widget.Button[@text='Data Sync Backup Data, Transfer Telemetry']"),

 })
 public MobileElement ClkDataSync;

    
    @AndroidFindBy(xpath = "//android.widget.Button[@text='SYNC NOW']")
    public MobileElement ClkSyncNow;

    @AndroidFindAll({
            @AndroidBy(xpath = "//android.widget.Button[@text='Share the DIKSHA app']"),
            @AndroidBy(xpath = "//android.view.View[@text='Share the DIKSHA app']"),
    })
    public MobileElement ShareDikshaApp;
    
    @AndroidFindBy(xpath = "//android.view.View[@text='Users and Groups']")
    public MobileElement clkUsersAndGroups;
    
    
    @AndroidFindBy(xpath = "//android.widget.Button[@text='CREATE NEW USER']")
    public MobileElement clkCreateNewUser;
    
    
    @AndroidFindBy(xpath = "//android.widget.Button[@text='SAVE']")
    public MobileElement clkSaveCreateUser;
  
    
    
    @AndroidFindBy(xpath = "//android.widget.Button[@text='GROUPS']")
    public MobileElement clkGroups;
  
    @AndroidFindBy(xpath = "//android.widget.Button[@text='CREATE NEW GROUP']")
    public MobileElement clkCreateNewGroup;
    
    @AndroidFindBy(xpath = "//*[@class='android.widget.EditText']")
     public MobileElement enterGroupName;
  
    @AndroidFindBy(xpath = "//android.widget.Button[@text='NEXT']")
    public MobileElement ClkNextButtonGroup;
 
    @AndroidFindBy(xpath ="//android.view.View[@text='SELECT ALL']")
    public MobileElement clkSltAllUsers;
    
    @AndroidFindBy(xpath ="//android.widget.Button[@text='CREATE GROUP']")
    public MobileElement clkCreateGroup;
  

    @AndroidFindAll({
            @AndroidBy(xpath ="//android.view.View[@text='About Us']"),
            @AndroidBy(xpath = "//android.widget.Button[@text='About Us']"),
    })
    public MobileElement clkAboutUs;
    
  

    @AndroidFindAll({
        // @AndroidBy(xpath = "//android.view.View[@text='Marigold']"),
         //@AndroidBy(xpath = "//android.view.View[@text='Assam text book']"),
         @AndroidBy(xpath = "//android.view.View[@text='Device ID']"),
         @AndroidBy(xpath = "//android.view.View[@text='About Us']//following::android.view.View[8]")

 })
 public MobileElement deviceIDLabel;
    
    @AndroidFindBy(xpath ="//android.view.View[@text='Device ID']//following::android.view.View[1]")
    public MobileElement verifyDeviceID;


    @AndroidFindAll({
            @AndroidBy(xpath ="//android.widget.Button[@text='share']"),
            @AndroidBy(xpath = "//android.widget.Button[@text='share information']"),
    })
    public MobileElement ClkshareDeviceID;


    @AndroidFindAll({
            @AndroidBy(xpath = "//android.widget.Button[@text='search']//following::android.view.View[1]"),
            @AndroidBy(xpath ="//android.widget.Button[@text='search']//following::android.widget.Image[1]")
    })
    public MobileElement verifyBookAfterChangingClass;


    @AndroidFindBy(xpath ="//android.widget.TextView[@text='Textbooks']")
    public MobileElement clkTextbook;
      
  
    
    @AndroidFindBy(xpath ="//android.widget.Button[@text='search']//following::android.view.View[3]")
    public MobileElement verifyBookAfterClickingSeeMoreBooks;
  
   

 
    @AndroidFindAll({
       
         @AndroidBy(xpath = "//android.widget.Button[@text='search filter']"),
         @AndroidBy(xpath = "//android.widget.Button[@index='3']"),


 })
 public MobileElement clkLibrayFilter;

  
    @AndroidFindAll({
        // @AndroidBy(xpath = "//android.view.View[@text='Marigold']"),
         //@AndroidBy(xpath = "//android.view.View[@text='Assam text book']"),
         @AndroidBy(xpath = "//android.view.View[@text='Board']"),
         @AndroidBy(xpath = "//android.view.View[@text='Board/Syllabus']")

 })
 public MobileElement clkLibBoard;

    
    @AndroidFindBy(xpath ="//android.view.View[@text='Select From The Following']//following::android.widget.CheckBox[1]")
    public MobileElement sltFilter1;
    
    @AndroidFindBy(xpath ="//android.view.View[@text='Select From The Following']//following::android.widget.CheckBox[3]")
    public MobileElement sltFilter2;
    
    @AndroidFindBy(xpath ="//android.view.View[@text='Select From The Following']//following::android.widget.CheckBox[5]")
    public MobileElement sltFilter3;
  
    @AndroidFindBy(xpath ="//android.widget.Button[@text='CONFIRM']")
    public MobileElement clkConfirmBton;
  
    
    @AndroidFindBy(xpath ="//android.view.View[@text='Class']")
    public MobileElement clkLibClass;
    
    @AndroidFindBy(xpath ="//android.view.View[@text='Subject']")
    public MobileElement clkLibSubject;
    
    @AndroidFindBy(xpath ="//android.widget.Button[@text='APPLY FILTER']")
    public MobileElement clkApplyFilter;

    @AndroidFindAll({
            @AndroidBy(xpath ="//android.widget.Image[@index='0'][1]"),
            @AndroidBy(xpath = "//android.view.View[contains(@text,'results for')]//following::android.view.View[1]"),
    })
    public MobileElement verifyFilteredResult;
    
    @AndroidFindAll({
       
         @AndroidBy(xpath = "//android.view.View[@text='Content Type']")

 })
 public MobileElement clkContentTyp;

    
    
    @AndroidFindAll({
        
        @AndroidBy(xpath = "//android.widget.Button[@text='RESET filter by']")


})
public MobileElement clkResetBtn;
    
    
 @AndroidFindAll({
        
        @AndroidBy(xpath = "//android.view.View[@text='Publisher']")
})
public MobileElement clkPublisherType;
 
 
 @AndroidFindAll({
     
     @AndroidBy(xpath = "//android.view.View[@text='Media Type']")
})
public MobileElement clkMediaType;
 
 
 @AndroidFindAll({
     
     @AndroidBy(xpath = "//android.widget.Button[@text='LET US KNOW HERE']")
  
})
public MobileElement clkLetUsKnow;
 

 @AndroidFindAll({
     
     @AndroidBy(xpath = "//android.view.View[@text='Select Board']")
  })
public MobileElement clkSltBoardLUK;
 
 @AndroidFindAll({
     
     @AndroidBy(xpath = "//android.view.View[@text='State (Andhra Pradesh)']")
  })
public MobileElement SltBoardValueLUK;
 

@AndroidFindAll({
     
     @AndroidBy(xpath = "//android.widget.Button[@text='SUBMIT']")
  })
public MobileElement clkSubmitLUK;

@AndroidFindAll({
    
    @AndroidBy(xpath = "//android.view.View[@text='Select Medium']")
 })
public MobileElement clkSltMediumLUK;


@AndroidFindAll({
    
    @AndroidBy(xpath = "//android.view.View[@text='English']")
 })
public MobileElement SltMediumValueLUK;

@AndroidFindAll({
    
    @AndroidBy(xpath = "//android.view.View[@text='Select Grade']")
 })
public MobileElement clkGradeLUK;


@AndroidFindAll({
    
    @AndroidBy(xpath = "//android.view.View[@text='Class 1']")
 })
public MobileElement SltGradeValueLUK;


@AndroidFindAll({
    
    @AndroidBy(xpath = "//android.view.View[@text='Select Subject']")
 })
public MobileElement clkSubjectLUK;


@AndroidFindAll({
    
    @AndroidBy(xpath = "//android.view.View[@text='English']")
 })
public MobileElement SltSubjectValueLUK;


@AndroidFindAll({
    
    @AndroidBy(xpath = "//android.view.View[@text='Select Content Type']")
 })
public MobileElement clkContentTypeLUK;


@AndroidFindAll({
    
    @AndroidBy(xpath = "//android.view.View[@text='Digital Textbook']")
 })
public MobileElement SltContentValueLUK;


@AndroidFindAll({
    
    @AndroidBy(xpath = "//android.widget.Image[@index='0']"),
        @AndroidBy(xpath = "//android.widget.Button[@text='back']//following::android.widget.Button[1]"),
 })
public MobileElement verifyMatchedContent;


@AndroidFindAll({
    
    @AndroidBy(xpath = "//android.view.View[@resource-id='overlay-button']")
 })
public MobileElement clkHamMenuPDFContent;

@AndroidFindAll({    
    @AndroidBy(xpath = "//android.view.View[@text='Print']")
 })
public MobileElement clkPDFIcon;


@AndroidFindBy(xpath = "//android.widget.TextView[@text='Select a printer']")
public MobileElement clkSelectPrinter;


@AndroidFindAll({
@AndroidBy(xpath = "//android.widget.TextView[@text='Save as PDF']")
})
public MobileElement assertPDFPrintPageScreen;


@AndroidFindAll({    
    @AndroidBy(xpath = "//android.view.View[@text='Share']")
 })
public MobileElement clkShareIcon;

@AndroidFindAll({    
    @AndroidBy(xpath = "//android.view.View[@text='Download']")
 })
public MobileElement clkDownloadIcon;

@AndroidFindAll({    
    @AndroidBy(xpath = "//android.view.View[@text='Exit']")
 })
public MobileElement clkExitIcon;


@AndroidFindAll({    
    @AndroidBy(xpath = "//android.widget.Button[@text='zoom in']")
 })
public MobileElement clkZoomInIcon;

@AndroidFindAll({    
    @AndroidBy(xpath = "//android.widget.Button[@text='zoom out']")
 })
public MobileElement clkZoomOutIcon;

@AndroidFindAll({    
    @AndroidBy(xpath = "//android.widget.Button[@text='navigation-arrows-previousIcon']")
 })
public MobileElement clkPreivousPage;

@AndroidFindAll({    
    @AndroidBy(xpath = "//android.widget.Button[@text='navigation-arrows-nextIcon']")
 })
public MobileElement clkNextPage;

@AndroidFindAll({    
    @AndroidBy(xpath = "//android.widget.EditText[@text='2.0']")
    
 })
public MobileElement assertNxtPageClk;

@AndroidFindAll({    
    @AndroidBy(xpath = "//android.widget.EditText[@text='1.0']")
 })
public MobileElement assertPreviousPagClk;



@AndroidFindAll({    
    @AndroidBy(xpath = "//android.widget.Image[@index='0']")
 })
public MobileElement clkFirstPDFContent;

@AndroidFindAll({

    @AndroidBy(xpath = "//android.widget.Button[@text='Play video']"),
    @AndroidBy(xpath = "//android.widget.Button[@text='share content Share']//following::android.widget.Button"),

})
public MobileElement playIcon3;


@AndroidFindBy(xpath = "//android.view.View[@text='Content is not relevant']")
public MobileElement feedbackchkbx1;

@AndroidFindBy(xpath = "//android.widget.Button[@text='notifications']")
public MobileElement bellIcon;

@AndroidFindBy(xpath = "//android.view.View[contains(@text,'Notification')]")
public MobileElement notificationDetails;

@AndroidFindBy(xpath = "//android.view.View[@text='No new notification']")
public MobileElement noNotificationsText;


@AndroidFindBy(xpath = "//android.view.View[contains(@text,'mp4')]//following::android.view.View")
public MobileElement firstMp4Content;

@AndroidFindBy(xpath = "//android.view.View[contains(@text,'Epub')]//following::android.view.View")
public MobileElement firstEpubContent;

@AndroidFindBy(xpath = "//android.view.View[contains(@text,'assessment')]//following::android.view.View")
public MobileElement firstAssessmentContent;

@AndroidFindAll({

    @AndroidBy(xpath = "//android.view.View[@text='Medium']")

})
public MobileElement clkMedium;

@AndroidFindAll({

    @AndroidBy(xpath = "//android.view.View[@text='Meant For']")

})
public MobileElement clkMeantFor;

}


