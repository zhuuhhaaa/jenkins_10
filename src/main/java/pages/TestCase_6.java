package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.JavascriptExecutor;

import java.util.logging.Logger;


public class TestCase_6 {
    private static final String HOMEPAGE_URL = "https://www.svt.by/";
    private final WebDriver driver;
    @FindBy(xpath = "//input[@id='pcode']")
    private WebElement input;

    @FindBy(xpath = "//a[@href='/search/Corteco/80001406']")
    private WebElement itemFind;
    @FindBy(xpath = "//td[text()='На складе']")
    private WebElement check;

//    @FindBy(xpath = "//input[@name='search']")
//    private WebElement searchInput;
    public TestCase_6(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    public TestCase_6 openPage() {
        driver.get(HOMEPAGE_URL);
        return this;
    }

    public void inputClick() {
        input.click();
    }
    public void enterSearchText(String searchText) {

        input.sendKeys(searchText);
        input.submit();
    }

    public void itemClick() {itemFind.click();}

    public void check() {
        Logger log = Logger.getLogger(TestCase_6.class.getName());
        log.info("Element was find" + check.toString());
    }
    public void scroll() throws InterruptedException {
        Thread.sleep(6000);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,1600)");
    }
}