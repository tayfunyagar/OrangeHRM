package com.orangeHRM.base;

import com.orangeHRM.pages.LoginPage;

public class PageManeger {
    public static LoginPage loginPage;

    public static void initializePageObjects(){
        loginPage = new LoginPage();
    }
}
