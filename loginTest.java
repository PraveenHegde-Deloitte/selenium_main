package tests;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import pages.bank_manager_login;
import pages.*;

import java.io.IOException;

@Listeners(tests.TestNGListner.class)
public class loginTest {

    @Test(priority = 1)
    private static void test1() throws InterruptedException, IOException {
        WebDriver dr;
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\prhegde\\Downloads\\chromedriver.exe");
        dr = new ChromeDriver();
        dr.get("https://www.globalsqa.com/angularJs-protractor/BankingProject/#/login");
        bank_manager_login lg = new bank_manager_login(dr);
        lg.click_bank_manager_login();
        lg.click_add_customer();
        add_customer ad = new add_customer(dr);
        ad.get_details();
        ad.add_details();
        ad.alert();
        open_account oa = new open_account(dr);
        oa.select_customer();
        oa.select_currency();
        oa.alert();
        customer_login cl = new customer_login(dr);
        cl.click_customer_login();
        cl.select_customer();
        cl.get_amount(0);
        cl.depoist();
        withdraw_amount wa = new withdraw_amount(dr);
        wa.get_amount(0);
        wa.withdraw();
        transaction tr = new transaction(dr);
        tr.transaction();
    }

    @Test(priority = 2)
    private static void test2() throws InterruptedException, IOException {
        WebDriver dr;
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\prhegde\\Downloads\\chromedriver.exe");
        dr = new ChromeDriver();
        dr.get("https://www.globalsqa.com/angularJs-protractor/BankingProject/#/login");
        bank_manager_login lg = new bank_manager_login(dr);
        lg.click_bank_manager_login();
        lg.click_add_customer();
        add_customer ad = new add_customer(dr);
        ad.get_details();
        ad.add_details();
        ad.alert();
        open_account oa = new open_account(dr);
        oa.select_customer();
        oa.select_currency();
        oa.alert();
        customer_login cl = new customer_login(dr);
        cl.click_customer_login();
        cl.select_customer();
        cl.get_amount(1);
        cl.depoist();
    }
}