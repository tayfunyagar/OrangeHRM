package com.orangeHRM.pages;

import com.orangeHRM.util.ElementUtil;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import static com.orangeHRM.base.BasePage.driver;

public class LoginPage {
    @FindBy(id = "txtUsername")
    public static WebElement username;
    @FindBy(id = "txtPassword")
    public static WebElement password;
    @FindBy(id = "btnLogin")
    public static WebElement loginBtn;
    @FindBy(id = "welcome")
    public static WebElement welcome;

    public LoginPage(){
        PageFactory.initElements(driver,this);
    }

    public static String verifyTitle(){
        return ElementUtil.doGetPageTitle();
    }
    public static void enterUserName(String user) {
        ElementUtil.doSendKeys(username, user);
    }
    public static void enterPassword(String pass)  {
        ElementUtil.doSendKeys(password, pass);
    }
    public static void clickLogin(){
        ElementUtil.doClick(loginBtn);
    }
    public static String getWelcomeMessage(){
        return ElementUtil.doGetText(welcome);
    }


}
