package com.orangehrmlive.demo.pages;

import com.orangehrmlive.demo.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class ViewSystemUsersPage extends Utility {//System Users Text,
    // Username Field, User Roll dropDown,
//    Employee Name Field,
//    Status Drop Down, Search Button, Reset Button, Add Button and Delete Button locators and

    public ViewSystemUsersPage(){
        PageFactory.initElements(driver,this);
    }
    @FindBy(xpath = "//div[@class='head']/h1")
    WebElement systemUserTxt;
    @FindBy(xpath = "//input[@id='searchSystemUser_userName']")
    WebElement userName;
    @FindBy(xpath = "//select[@id='searchSystemUser_userType']")
    WebElement userRolls;
    @FindBy(xpath = "//input[@id='btnAdd']")
    WebElement addBtn;
    @FindBy(xpath = "//div[contains(text(),'Successfully Saved')]")
    WebElement successfullySavedText;
    @FindBy(xpath = "//input[@id='searchSystemUser_employeeName_empName']")
    WebElement employeeName;
    @FindBy(xpath = "//input[@id='searchBtn']")
    WebElement searchButton;
    @FindBy(xpath = "//select[@id='searchSystemUser_status']")
    WebElement status;
    @FindBy(xpath = "//input[@id='resetBtn']")
    WebElement resetButton;
    @FindBy(xpath = "//input[@id='ohrmList_chkSelectAll']")
    WebElement checkBox;
    @FindBy(xpath = "//input[@id='btnDelete']")
    WebElement deleteButton;
    @FindBy(xpath = "//td[contains(text(),'No Records Found')]")
    WebElement noRecordsfoundText;

    public void enterUser(String user){
        Reporter.log("Enter User"+user+ " to email field "+userName.toString() + "<br>");
        sendTextToElement(userName,user);
    }
    public void selectUserRole(String userroll){
        Reporter.log("Selecting UserRole"+userroll+" from dropdown "+userRolls.toString() + "<br>");
        selectByVisibleTextFromDropDown(userRolls,userroll);
    }
//    public void selectStatus(String stt){
//        selectByVisibleTextFromDropDown(status,stt);
//    }
    public void selectViewStatus(String stat){
        Reporter.log("Selecting View Status"+stat+" from dropdown "+status.toString() + "<br>");
        selectByVisibleTextFromDropDown(status,stat);
    }
    public void enterEmpname(String ename){
        Reporter.log("Enter Empname"+ename+ " to email field "+employeeName.toString() + "<br>");
        sendTextToElement(employeeName,ename);
    }
    public void clickOnSearch(){
        Reporter.log("Clicking on Search"+ searchButton.toString()+ "<br>");
        clickOnElement(searchButton);
    }
    public void clickOnReset(){
        Reporter.log("Clicking on Reset"+ resetButton.toString()+ "<br>");
        clickOnElement(resetButton);
    }
    public void clickOnAdd(){
        Reporter.log("Clicking Add newsletterbox"+ addBtn.toString()+ "<br>");
        clickOnElement(addBtn);
    }
    public void clickOnDelete(){
        Reporter.log("Clicking on Delete"+ deleteButton.toString()+ "<br>");
        clickOnElement(deleteButton);
    }
    public String verifySytemUserText(){
        Reporter.log("getting SytemUser text from "+systemUserTxt.toString()+"<br>");
        return getTextFromElement(systemUserTxt);
    }
    public void clickOnCheckBox(){
        Reporter.log("Clicking on CheckBox"+ searchButton.toString()+ "<br>");
        clickOnElement(searchButton);
    }public String verifyNoRecordsFound(){
        Reporter.log("getting NoRecordsFound text from "+noRecordsfoundText.toString()+"<br>");
        return getTextFromElement(noRecordsfoundText);
    }

}
