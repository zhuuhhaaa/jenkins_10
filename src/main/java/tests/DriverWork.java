package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.*;

public class DriverWork {
    private WebDriver driver;
    Main main;

    @BeforeMethod
    public void driverSetup() {
        driver = new ChromeDriver();
    }

    @Test
    public void isNewPateCreated() throws InterruptedException {
//        main = new Main(driver);
//        main.openPage();
//        main.beltsFind();
//        main.labelClick();
//        main.labelBrandClick();
//        main.searchButtonClick();
//        main.scroll();

//        TestCase_1 testCase1 = new TestCase_1(driver);
//        testCase1.openPage();
//        testCase1.batteryfind();
//        testCase1.scroll();

//        TestCase_2 testCase2 = new TestCase_2(driver);
//        testCase2.openPage();
//        testCase2.keyFind();
//        testCase2.labelClick();
//        testCase2.searchButtonClick();
//        testCase2.priceBtn();
//        testCase2.scroll();

//        TestCase_4 testCase4 = new TestCase_4(driver);
//        testCase4.openPage();
//        testCase4.shinaFind();
//        testCase4.brandClick();
//        testCase4.modelClick();
//        testCase4.modificationClick();
//        testCase4.shinaClick();
//        testCase4.scroll();

        TestCase_5 testCase5 = new TestCase_5(driver);
        testCase5.openPage();
        testCase5.inputClick();
        testCase5.enterSearchText("80001406");
        testCase5.itemClick();
        testCase5.scroll();

    }

    @AfterMethod(alwaysRun = true)
    public void browserTearDown() throws InterruptedException {
        Thread.sleep(1000);
        driver.quit();
        driver = null;
    }
}
