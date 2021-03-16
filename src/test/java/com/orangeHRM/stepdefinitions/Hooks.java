package com.orangeHRM.stepdefinitions;

import com.orangeHRM.base.BasePage;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {
    @Before
    public static void setUp(){
        BasePage.initializeDriver();
    }
    @After
    public static void tearDown(){
        BasePage.tearDown();
    }

}
