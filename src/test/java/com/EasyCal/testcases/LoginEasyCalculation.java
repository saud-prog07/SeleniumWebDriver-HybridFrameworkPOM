package com.coforge.testcases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.coforge.pages.BaseClass;
import com.coforge.pages.LoginPage;
import com.coforge.utility.ExcelDataReader;

public class LoginEasyCalculation extends BaseClass {

    @Test
    public void loginApp() throws Exception {

        ExcelDataReader excel = new ExcelDataReader();

        LoginPage loginHRM = PageFactory.initElements(driver, LoginPage.class);

        loginHRM.login_EasyCal(
                excel.getStringData("Sheet1", 0, 0),
                excel.getStringData("Sheet1", 0, 1)
        );

        Thread.sleep(10000);
    }
}