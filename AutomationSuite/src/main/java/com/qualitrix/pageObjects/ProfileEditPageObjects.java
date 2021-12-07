package com.qualitrix.pageObjects;

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
public class ProfileEditPageObjects {

    @AndroidFindAll({
            @AndroidBy(xpath = "//android.widget.Button[@text='EDIT']"),
            @AndroidBy(xpath = "//android.widget.Button[@text='EDIT ']")
    })
    public MobileElement editBtn;

    @AndroidFindBy(xpath = "//android.widget.Image[@text='call']")
    public MobileElement editPhnNumBtn;



    @AndroidFindBy(xpath = "//android.widget.Image[@text='mail']")
    public MobileElement editEmailBtn;

    @AndroidFindAll({
            @AndroidBy(xpath = "//android.widget.Button[@text='LOGIN']"),
            @AndroidBy(xpath = "//android.widget.Button[@text='LOGIN ']")
    })
    public MobileElement loginBtn;

    @AndroidFindBy(className = "android.widget.EditText")
    public MobileElement editName;

    @AndroidFindBy(xpath = "//*[@text='State \u200E *']//following::android.view.View[1]")
    public MobileElement stateDropDown;

    @AndroidFindBy(xpath = "//*[@text='Board \u200E *']//following::android.view.View[1]")
    public MobileElement selectBoard;

    @AndroidFindBy(xpath = "//*[@text='Medium *']//following::android.view.View[1]")
    public MobileElement selectMedium;

    @AndroidFindBy(xpath = "//*[@text='Class *']//following::android.view.View[1]")
    public MobileElement selectClass;

    @AndroidFindBy(xpath = "//*[@text='Subjects']//following::android.view.View[1]")
    public MobileElement selectSubjects;

    @AndroidFindAll({
            @AndroidBy(xpath = "//android.widget.CheckBox[@text='English']"),
            @AndroidBy(xpath = "//android.widget.CheckBox[@text='English ']")
    })
    public MobileElement selectSubject;

    @AndroidFindBy(xpath = "//*[@text='District \u200E *']//following::android.view.View[1]")
    public MobileElement distDropDown;

    @AndroidFindBy(xpath = "//*[@class='android.view.View' and @index='18']//following::android.widget.Button[1]")
    public MobileElement editSecondBtn;

    @AndroidFindBy(xpath = "//android.widget.RadioButton[@index='1']")
    public MobileElement selectState;

    @AndroidFindBy(xpath = "//android.widget.Button[@text='SAVE']")
    public MobileElement saveBtn;

    @AndroidFindBy(xpath = "//android.widget.RadioButton[@index='0']")
    public MobileElement selectDist;

    @AndroidFindBy(xpath = "//android.view.View[@text='Email Address']")
    public MobileElement emailInsideRecovery;

    @AndroidFindBy(xpath = "//*[contains(@text,'@gmail.com')]")
    public MobileElement recoveryId;


 
    
    @AndroidFindAll({
        @AndroidBy(xpath = "//android.view.View[@text='hh@gmail.com']"),
        @AndroidBy(xpath = "//android.widget.TextView[@text='hh*@gmail.com']"),
})
public MobileElement editedRecoveryId;


    @AndroidFindBy(xpath = "//android.view.View[@text='Mobile Number']")
    public MobileElement mblRecovery;
    
    @AndroidFindAll({
        @AndroidBy(xpath = "//android.widget.Button[@text='SUBMIT']"),
        @AndroidBy(xpath = "//android.widget.Button[@text='SUBMIT' and @index='1']"),
        @AndroidBy(xpath = "//android.widget.Button[@text='SUBMIT ' and @index='1']"),
        @AndroidBy(xpath = "//android.widget.Button[@text='SUBMIT arrow round forward']")

      
})
public MobileElement submitBtn;

    
    
    @AndroidFindAll({
        @AndroidBy(xpath = "//android.view.View[@text='Add Recovery Account']"),
        @AndroidBy(xpath = "//android.widget.Image[@text='']"),
})
public MobileElement editRecoveryId;

    
    @AndroidFindAll({
        @AndroidBy(xpath = "//android.widget.ListView[@text='Head Teacher & Officials']//following::android.widget.ListView[1]"),
})
public MobileElement clkStateDropdown;
   
    @AndroidFindAll({
		@AndroidBy(xpath = "//android.view.View[@text='Andhra Pradesh']"),

	})
	public MobileElement sltStateLoc;	
    
    
    @AndroidFindAll({
		@AndroidBy(xpath = "//android.widget.ListView[@text='Head Teacher & Officials']//following::android.widget.ListView[3]"),

	})
	public MobileElement clkDistrictLoc;	
   
   
   @AndroidFindAll({
		@AndroidBy(xpath = "//android.view.View[@text='Chittoor']"),

	})
	public MobileElement sltDistrictLoc;

    
    
    
    
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
        @AndroidBy(xpath = "//android.view.View[@text='Teacher']"),
})
public MobileElement sltTeacher;
    
    @AndroidFindAll({
        @AndroidBy(xpath = "//android.widget.Button[@text='SUBMIT']"),
})
public MobileElement clkSubmit;


    @AndroidFindAll({
            @AndroidBy(xpath = "//android.view.View[@text='Select Subrole']"),
            @AndroidBy(xpath = "//android.view.View[contains(@text,'Subrole')]//following::android.widget.Image[2]"),
    })
    public MobileElement clkSubRoleDropdown;

    @AndroidFindAll({
            @AndroidBy(xpath = "//android.view.View[@text='Select Subrole']//following::android.view.View[@text='Headmaster']"),
            @AndroidBy(xpath = "//android.view.View[@text='Select Subrole']//following::android.view.View[@text='HM']"),
    })
    public MobileElement sltSubRoleDropdown;

    @AndroidFindAll({
            @AndroidBy(xpath = "//android.view.View[@text='Select Subrole']//following::android.view.View[@text='Cluster Resource Person']"),
            @AndroidBy(xpath = "//android.view.View[@text='Select Subrole']//following::android.view.View[@text='CRP']"),
    })
    public MobileElement sltSubRoleDropdown1;

    
    @AndroidFindAll({
        @AndroidBy(xpath = "//android.widget.Button[@text='Submit']"),
})
public MobileElement clkSubmitEditProfile;

    @AndroidFindAll({
        @AndroidBy(xpath = "//android.view.View[contains(@text,'Ongoing')]"),
        @AndroidBy(xpath = "//android.view.View[contains(@text,'AutomationCourseContent')]")
})
public MobileElement onGoingCourse;
@AndroidFindAll({
        @AndroidBy(xpath = "//android.widget.Image[@text='refresh circle']")
})
public MobileElement refreshCircle;
@AndroidFindAll({
        @AndroidBy(xpath = "//android.view.View[contains(@text,'Completed')]"),
})
public MobileElement completeCourse;

@AndroidFindAll({
    @AndroidBy(xpath = "//android.widget.TextView[@text='My learning (1)']")
})
public MobileElement myLearningtext;


    @AndroidFindBy(xpath = "//android.widget.TextView[@text='This email address is already linked to your profile. Enter another email address']")
    public MobileElement assertErrorMessageForSameRecoveryIDOfUser;





    @AndroidFindBy(xpath = "//android.view.View[contains(@text,'State')]//following::android.widget.ListView[1]")
    public MobileElement sltStateDropdown;



    @AndroidFindBy(xpath = "//android.view.View[contains(@text,'District')]//following::android.widget.ListView[2]")
    public MobileElement sltDistrictDropdown;


    @AndroidFindBy(xpath = "//android.view.View[contains(@text,'Block')]//following::android.widget.ListView[3]")
    public MobileElement sltBlockDropdown;


    @AndroidFindBy(xpath = "//android.widget.TextView[1]")
    public MobileElement sltFirstTextInDropdown;


    @AndroidFindBy(xpath = "//android.view.View[contains(@text,'School')]//following::android.widget.ListView[4]")
    public MobileElement sltClusterDropdown;


    @AndroidFindBy(xpath = "//android.view.View[@text='Select School']")
    public MobileElement sltSchoolDropdown;


    @AndroidFindBy(xpath = "//android.view.View[contains(@text,'Role')]")
    public MobileElement assertRoleInProfile;


    @AndroidFindBy(xpath = "//android.view.View[contains(@text,'School')]")
    public MobileElement assertSchoolInProfile;


    @AndroidFindBy(xpath = "//android.view.View[contains(@text,'Block')]")
    public MobileElement assertBlockInProfile;


    @AndroidFindBy(xpath = "//android.view.View[contains(@text,'District')]")
    public MobileElement assertDistrictInProfile;


    @AndroidFindBy(xpath = "//android.view.View[contains(@text,'State')]")
    public MobileElement assertStateInProfile;



    @AndroidFindBy(xpath = "//android.view.View[contains(@text,'Subrole')]//following::android.widget.ListView[2]")
    public MobileElement clkSubpersonaInProfile;


    @AndroidFindBy(xpath = "//android.view.View[contains(@text,'Welcome')]")
    public MobileElement assertWelcomeTextOnHomePage;


    @AndroidFindBy(xpath = "//android.view.View[contains(@text,'Learn, Manage')]")
    public MobileElement assertLearnManageActHeaderInHomePage;




}
  

