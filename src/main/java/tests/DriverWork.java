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

    @Test(description = "Найти ремень GoodYear с 7-ю клиньями")
    public void isNewPateCreated() throws InterruptedException {

        main = new Main(driver);
        main.openPage();
        main.beltsFind();
        main.labelClick();
        main.labelBrandClick();
        main.searchButtonClick();
        main.scroll();
    }
    @Test(description = "Найти аккумулятор")
    public void Test_1() throws InterruptedException {
        TestCase_1 testCase1 = new TestCase_1(driver);
        testCase1.openPage();
        testCase1.batteryfind();
        testCase1.scroll();
    }
    @Test(description = "Найти дешевый балонный ключ на 19")
    public void Test_2() throws InterruptedException {
        TestCase_2 testCase2 = new TestCase_2(driver);
        testCase2.openPage();
        testCase2.keyFind();
        testCase2.labelClick();
        testCase2.searchButtonClick();
        testCase2.priceBtn();
        testCase2.scroll();
    }

    @Test(description = "Найти шины на конкретный автомобиль.")
    public void Test_4() throws InterruptedException {
        TestCase_4 testCase4 = new TestCase_4(driver);
        testCase4.openPage();
        testCase4.shinaFind();
        testCase4.brandClick();
        testCase4.modelClick();
        testCase4.modificationClick();
        testCase4.shinaClick();
        testCase4.scroll();
    }

    @Test(description = "Найти запчасть ее номеру")
    public void Test_5() throws InterruptedException {
        TestCase_5 testCase5 = new TestCase_5(driver);
        testCase5.openPage();
        testCase5.inputClick();
        testCase5.enterSearchText("80001406");
        testCase5.itemClick();
        testCase5.scroll();
        }

    @Test(description = "Найти дешевую запчасть по ее номеру, которая находится в наличии")
    public void Test_6() throws InterruptedException {
        TestCase_6 testCase6 = new TestCase_6(driver);
        testCase6.openPage();
        testCase6.inputClick();
        testCase6.enterSearchText("80001406");
        testCase6.itemClick();
        testCase6.check();
        testCase6.scroll();

    }

    @Test(description = "Найти номер рулевой тяги в каталоге по VIN-коду автомобиля")
    public void Test_7() throws InterruptedException {
        TestCase_7 testCase7 = new TestCase_7(driver);
        testCase7.openPage();

        testCase7.autorizationClick();
        testCase7.enterLogin("vlad26890@gmail.com");
        testCase7.enterPassword("VLADsd1234");
        testCase7.autorizationClick();
        testCase7.garageBtn();
        testCase7.carBtn();
        testCase7.itemClick();
        testCase7.steeringClick();
        testCase7.tractionSteeringClick();
        testCase7.tractionFindClick();

//        testCase7.inputClick();
//        testCase7.enterSearchText("WDBPJ73JX2A024312");
//        testCase7.steeringClick();
//        testCase7.tractionSteeringClick();
        testCase7.tractionFindClick();
        testCase7.scroll();
    }

    @Test(description = "Просмотреть бескаркасные стеклоочистители Bosch.")
    public void Test_8() throws InterruptedException {
        TestCase_8 testCase8 = new TestCase_8(driver);
        testCase8.openPage();
        testCase8.wiperFind();
        testCase8.labelClick();
        testCase8.searchButtonClick();
        testCase8.scroll();
    }

    @Test(description = "Найти кросс номер запчасти, который соответствует введенному номеру")
    public void Test_9() throws InterruptedException {
        TestCase_9 testCase9 = new TestCase_9(driver);
        testCase9.openPage();
        testCase9.inputClick();
        testCase9.enterSearchText("19031170");
        testCase9.itemClick();
        testCase9.check();
        testCase9.scroll();
    }

    @Test(description = "Добавить 5 различных ламп имеющие тип H4 в корзину.")
    public void Test_10() throws InterruptedException {
        TestCase_10 testCase10 = new TestCase_10(driver);
        testCase10.openPage();
        testCase10.lampFind();
        testCase10.labelClick();
        testCase10.searchButtonClick();
        testCase10.addInCarts();
        testCase10.scroll();
    }

    @AfterMethod(alwaysRun = true)
    public void browserTearDown() throws InterruptedException {
        Thread.sleep(1000);
        driver.quit();
        driver = null;
    }
}
