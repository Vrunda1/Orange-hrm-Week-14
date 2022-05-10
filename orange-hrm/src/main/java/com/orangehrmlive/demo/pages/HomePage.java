package com.orangehrmlive.demo.pages;

import com.orangehrmlive.demo.utility.Utility;
import org.bouncycastle.util.Store;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class HomePage extends Utility {
    public HomePage() {
        PageFactory.initElements(driver, this);
    }
    @FindBy(xpath = "//img[@alt='OrangeHRM']")
    WebElement orangeHrmLogo;
    @FindBy(xpath = "//b[contains(text(),'Admin')]")
    WebElement adminLink;

    @FindBy(xpath = "//b[contains(text(),'PIM')]")
    WebElement pimLink;
    @FindBy(xpath = "//a[@id='welcome']")
    WebElement welcomeText;
    @FindBy(xpath = "//a[@id='welcome']")
    WebElement profileLogo;
    @FindBy(xpath = "//b[contains(text(),'Leave')]")
    WebElement leave;
    @FindBy(xpath = "//b[contains(text(),'Dashboard')]")
    WebElement dashboard;
    @FindBy(xpath = "//b[contains(text(),'PIM')]")
    WebElement logout;

    public void clickOnLogo() {
        Reporter.log("Clicking on Logo"+ orangeHrmLogo.toString()+ "<br>");
        clickOnElement(orangeHrmLogo);
    }
    public void clickOnAdminLink() {

        Reporter.log("Clicking on AdminLink"+ adminLink.toString()+ "<br>");
        clickOnElement(adminLink);
    }
    public void clickOnLeaveLink() {
        Reporter.log("Clicking on LeaveLink"+ leave.toString()+ "<br>");
        clickOnElement(leave);
    }
    public void clickOnDashboardLink() {
        Reporter.log("Clicking on DashboardLink"+ dashboard.toString()+ "<br>");
        clickOnElement(dashboard);
    }
    public void clickOnLogoutLink() {

        Reporter.log("Clicking on LogoutLink"+ logout.toString()+ "<br>");
        clickOnElement(logout);
    }
   public String verifyWelcomeText(){
       Reporter.log("getting Welcome Text from "+welcomeText.toString()+"<br>");
        return getTextFromElement(welcomeText);
   }
    public String verifyLogo(){
        Reporter.log("getting Logo from "+orangeHrmLogo.toString()+"<br>");
        return getTextFromElement(orangeHrmLogo);
    }
    public void clickOnProfileLogo(){
        Reporter.log("Clicking on ProfileLogo"+ profileLogo.toString()+ "<br>");
        clickOnElement(profileLogo);
    }

}
