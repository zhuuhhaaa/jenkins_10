package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.JavascriptExecutor;

public class TestCase_5 {
    private static final String HOMEPAGE_URL = "https://www.svt.by/";
    private final WebDriver driver;
    @FindBy(xpath = "//input[@id='pcode']")
    private WebElement input;

    @FindBy(xpath = "//a[@href='/search/Corteco/80001406']")
    private WebElement itemFind;
//    @FindBy(xpath = "//input[@name='search']")
//    private WebElement searchInput;

    public TestCase_5(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    public TestCase_5 openPage() {
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
    public void scroll() throws InterruptedException {
        Thread.sleep(6000);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,1600)");
    }
}