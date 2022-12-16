package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.JavascriptExecutor;

public class TestCase_2 {
    private static final String HOMEPAGE_URL = "https://www.svt.by/";
    private final WebDriver driver;
    @FindBy(xpath = "//label[@for='size[19]']")
    private WebElement labelButton;

    @FindBy(xpath = "//a[@href='/search/%D0%94%D0%B5%D0%BB%D0%BE%20%D0%A2%D0%B5%D1%85%D0%BD%D0%B8%D0%BA%D0%B8/531221?source=lug_wrenches_catalog']")
    private WebElement priceCheck;

    @FindBy(xpath = "//button[@class='fr-btn fr-btn-primary floatingButton']")
    private WebElement searchButton;

    public TestCase_2(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    public TestCase_2 openPage() {
        driver.get(HOMEPAGE_URL);
        return this;
    }

    public void labelClick() {
        labelButton.click();
    }
    public void searchButtonClick(){ searchButton.click();}

    public void priceBtn() {
        priceCheck.click();
    }

    public void keyFind(){
        driver.get("https://svt.by/lug_wrenches_catalog");
    }

    public void scroll() throws InterruptedException {
        Thread.sleep(6000);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,1600)");
    }
}