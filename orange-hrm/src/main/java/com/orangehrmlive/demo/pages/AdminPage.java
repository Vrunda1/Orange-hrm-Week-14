package com.orangehrmlive.demo.pages;

import com.orangehrmlive.demo.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class AdminPage extends Utility {
   // UserManagement, Job, Organization Tabs Locators and it's action
   public AdminPage() {
       PageFactory.initElements(driver, this);
   }
    @FindBy(xpath = "//b[contains(text(),'Admin')]")
    WebElement adminLink;
    @FindBy(xpath = "//a[@id='menu_admin_Job']")
    WebElement jobLink;
    @FindBy(xpath = "//a[@id='menu_admin_UserManagement']")
    WebElement userManagement;
    @FindBy(xpath = "//a[@id='menu_admin_Organization']")
    WebElement organisation;


    public void clickOnAdminTab() {

        Reporter.log("Clicking on AdminTab"+ adminLink.toString()+ "<br>");
        clickOnElement(adminLink);
    }
    public void clickOnUserManagement(){
        Reporter.log("Clicking on UserManagement"+ userManagement.toString()+ "<br>");
        clickOnElement(userManagement);

}
    public void clickOnJobTab() {

        Reporter.log("Clicking on JobTab"+ jobLink.toString()+ "<br>");clickOnElement(jobLink);
    }
    public void clickOnOrganisation() {

        Reporter.log("Clicking on Organisation"+ organisation.toString()+ "<br>");
        clickOnElement(organisation);
    }

}
