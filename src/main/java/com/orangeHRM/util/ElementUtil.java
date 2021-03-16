package com.orangeHRM.util;

import org.openqa.selenium.WebElement;

import static com.orangeHRM.base.BasePage.driver;

public class ElementUtil {

    public static String doGetPageTitle(){
        return driver.getTitle();
    }

    public static void doSendKeys(WebElement element, String key) {
        try {
            element.sendKeys(key);
        } catch (Exception e) {
            System.out.println("Some exception occurred while sending text at " + element);
        }
    }

    public static void doClick(WebElement element) {
        try {
            element.click();
        } catch (Exception e) {
            System.out.println("Some exception occurred while clicking at " + element);
        }
    }

    public static String doGetText(WebElement element) {
        return element.getText();
    }
}

