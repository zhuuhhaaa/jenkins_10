package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.JavascriptExecutor;

public class TestCase_4 {
    private static final String HOMEPAGE_URL = "https://www.svt.by/";
    private final WebDriver driver;

    @FindBy(xpath = "//option[@value='74']")
    private WebElement brandBtn;

    @FindBy(xpath = "//option[@value='4095']")
    private WebElement modelBtn;

    @FindBy(xpath = "//option[@value='13265']")
    private WebElement modificationBtn;

    @FindBy(xpath = "//a[@href='/tires_catalog?property%5Bdiameter%5D=17&property%5Bwidth%5D=225&property%5Bheight%5D=55&source=carbase']")
    private WebElement shinaFind;

    public TestCase_4(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    public TestCase_4 openPage() {
        driver.get(HOMEPAGE_URL);
        return this;
    }

    public void brandClick() throws InterruptedException {
        brandBtn.click();
        Thread.sleep(1500);
    }

    public void modelClick() throws InterruptedException {
        modelBtn.click();
        Thread.sleep(1500);
    }
    public void modificationClick() throws InterruptedException {
        modificationBtn.click();
        Thread.sleep(1500);}

    public void shinaClick(){shinaFind.click();}

    public void shinaFind(){
        driver.get("https://svt.by/wheel_calc");
    }

    public void scroll() throws InterruptedException {
        Thread.sleep(1000);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,600)");
    }
}