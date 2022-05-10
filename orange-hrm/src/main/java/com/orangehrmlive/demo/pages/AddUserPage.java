package com.orangehrmlive.demo.pages;

import com.orangehrmlive.demo.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;
import sun.security.util.Password;

public class AddUserPage extends Utility {
    public AddUserPage() {
        PageFactory.initElements(driver, this);
    }
    //User Role Drop Down, Employee Name, Username, Status Drop Down,
    //Password, Confirm Password,
    //Save and Cancle Button Locators and it's actions
    @FindBy(xpath = "//select[@id='systemUser_userType']")
    WebElement roleDropDown;

    @FindBy(xpath = "//input[@id='systemUser_employeeName_empName']")
    WebElement employeeName;
    @FindBy(xpath = "//input[@id='systemUser_userName']")
    WebElement username;
    @FindBy(xpath = "//select[@id='systemUser_status']")
    WebElement statusDropDown;
    @FindBy(xpath = "//input[@id='systemUser_password']")
    WebElement password;
    @FindBy(xpath = "//input[@id='systemUser_confirmPassword']")
    WebElement confirmpw;
    @FindBy(xpath = "//input[@id='btnSave']")
    WebElement saveBtn;
    @FindBy(xpath = "//input[@id='btnCancel']")
    WebElement cancleBtn;
    @FindBy(xpath = "//h1[@id='UserHeading']")
    WebElement addUserText;

    public void selectRole(String role){

        Reporter.log("Selecting Role"+role+" from dropdown "+roleDropDown.toString() + "<br>");
        selectByVisibleTextFromDropDown(roleDropDown,role);
    }
    public void enterEmpName(String name){
        Reporter.log("Enter EmpName"+name+ " to email field "+employeeName.toString() + "<br>");
        sendTextToElement(employeeName,name);
    }
    public void enterUserName(String uname){
        Reporter.log("Enter UserName"+uname+ " to email field "+username.toString() + "<br>");
        sendTextToElement(username,uname);
    }
    public void selectStatus(String stat){
        Reporter.log("Selecting Status"+stat+" from dropdown "+statusDropDown.toString() + "<br>");
        selectByVisibleTextFromDropDown(statusDropDown,stat);
    }
    public void enterPassword(String pw){

        Reporter.log("Enter Password"+pw+ " to email field "+password.toString() + "<br>");
        sendTextToElement(password,pw);
    }
    public void enterConfirmPassword(String confirm){
        Reporter.log("Enter Confirm Password"+confirm+ " to email field "+confirmpw.toString() + "<br>");
        sendTextToElement(confirmpw,confirm);
    }
    public void clickOnSave(){

        Reporter.log("Clicking on Save"+ saveBtn.toString()+ "<br>");
        clickOnElement(saveBtn);
    }
    public void clickOnDelete(){

        Reporter.log("Clicking on Delete"+ cancleBtn.toString()+ "<br>");
        clickOnElement(cancleBtn);
    }
    public String verifyAddUser(){

        Reporter.log("getting AddUser text from "+addUserText.toString()+"<br>");
        return getTextFromElement(addUserText);
    }
}
