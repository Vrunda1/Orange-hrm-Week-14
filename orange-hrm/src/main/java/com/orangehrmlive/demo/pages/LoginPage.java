package com.orangehrmlive.demo.pages;

import com.orangehrmlive.demo.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class LoginPage extends Utility {
    public LoginPage() {
        PageFactory.initElements(driver, this);
    }
    @FindBy(xpath = "//input[@id='txtUsername']")
    WebElement username;
    @FindBy(xpath = "//input[@id='txtPassword']")
    WebElement password;
    @FindBy(xpath = "//input[@id='btnLogin']")
    WebElement loginBtn;
    @FindBy(xpath = "//div[text()='LOGIN Panel']")
    WebElement loginPanelTxt;

    public void enterUser(String ename){
        Reporter.log("Enter User"+ename+ " to email field "+username.toString() + "<br>");
        sendTextToElement(username,ename);
    }
    public void enterPassowrd(String pw)
    { Reporter.log("Enter Passowrd"+pw+ " to email field "+password.toString() + "<br>");
        sendTextToElement(password,pw);
    }
    public void clickOnLoginBtn(){
        Reporter.log("Clicking on LoginBtn"+ loginBtn.toString()+ "<br>");
        clickOnElement(loginBtn);
    }
    public String verifyLogin(){
        Reporter.log("getting Login text from "+loginPanelTxt.toString()+"<br>");
        return getTextFromElement(loginPanelTxt);
    }
    }

