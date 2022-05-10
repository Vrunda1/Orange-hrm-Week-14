package com.orangehrmlive.demo.testsuite;

import com.google.common.base.Verify;
import com.orangehrmlive.demo.pages.AddUserPage;
import com.orangehrmlive.demo.pages.HomePage;
import com.orangehrmlive.demo.pages.LoginPage;
import com.orangehrmlive.demo.pages.ViewSystemUsersPage;
import com.orangehrmlive.demo.testbase.TestBase;
import javafx.scene.control.Tab;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class UserTest extends TestBase {
    HomePage homePage;
    LoginPage loginPage;
    ViewSystemUsersPage viewSystemUsersPage;
    AddUserPage addUserPage;

    @BeforeMethod(alwaysRun = true)
    public void initialize() {
        homePage = new HomePage();
        loginPage = new LoginPage();
        viewSystemUsersPage = new ViewSystemUsersPage();
        addUserPage = new AddUserPage();
    }

    @Test(groups = {"sanity","smoke","regression"})
    public void adminShouldAddUserSuccessFully() throws InterruptedException {

        loginPage.enterUser("Admin");
        loginPage.enterPassowrd("admin123");
        loginPage.clickOnLoginBtn();
        homePage.clickOnAdminLink();
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(viewSystemUsersPage.verifySytemUserText(),"System Users","");
        viewSystemUsersPage.clickOnAdd();
        softAssert.assertEquals(addUserPage.verifyAddUser(),"Add User","");
        addUserPage.selectRole("Admin");
        addUserPage.enterEmpName("Ananya Dash");
        addUserPage.enterUserName("Georgiana");
        addUserPage.selectStatus("Disabled");
        addUserPage.enterPassword("abc654321");
        addUserPage.enterConfirmPassword("abc654321");
        addUserPage.clickOnSave();
    }
    @Test(groups = {"smoke","regression"})
    public void searchTheUserCreatedAndVerifyIt(){
        loginPage.enterUser("Admin");
        loginPage.enterPassowrd("admin123");
        loginPage.clickOnLoginBtn();
        homePage.clickOnAdminLink();
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(viewSystemUsersPage.verifySytemUserText(),"System Users","");
        viewSystemUsersPage.enterUser("Prime Testing");
        viewSystemUsersPage.selectUserRole("Admin");
        viewSystemUsersPage.selectViewStatus("Disabled");
        viewSystemUsersPage.clickOnSearch();

    }
    @Test(groups = {"regression"})
   public void verifyThatAdminShouldDeleteTheUserSuccessFully(){
        loginPage.enterUser("Admin");
        loginPage.enterPassowrd("admin123");
        loginPage.clickOnLoginBtn();
        homePage.clickOnAdminLink();
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(viewSystemUsersPage.verifySytemUserText(),"System Users","");
        viewSystemUsersPage.enterUser("Prime Testing");
        viewSystemUsersPage.selectUserRole("Admin");
        viewSystemUsersPage.selectViewStatus("Disabled");
        viewSystemUsersPage.clickOnSearch();
        viewSystemUsersPage.clickOnCheckBox();
        viewSystemUsersPage.clickOnDelete();
    }
    @Test(groups = {"regression"})
    public void searchTheDeletedUserAndVerifyTheMessageNoRecordFound(){
        loginPage.enterUser("Admin");
        loginPage.enterPassowrd("admin123");
        loginPage.clickOnLoginBtn();
        homePage.clickOnAdminLink();
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(viewSystemUsersPage.verifySytemUserText(),"System Users","");
        viewSystemUsersPage.enterUser("Prime Testing");
        viewSystemUsersPage.selectUserRole("Admin");
        viewSystemUsersPage.selectViewStatus("Disabled");
        viewSystemUsersPage.clickOnSearch();
        softAssert.assertEquals(viewSystemUsersPage.verifyNoRecordsFound(),"No Records Found","");
       homePage.clickOnProfileLogo();
       homePage.clickOnLogoutLink();


    }
}