package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.JavascriptExecutor;

import java.util.List;

public class TestCase_8 {
    private static final String HOMEPAGE_URL = "https://www.svt.by/";
    private final WebDriver driver;

    @FindBy(xpath = "//span[@class='fr-icon2-basket-2']")
    private WebElement itemFind;
    @FindBy(xpath = "//label[@for='Bosch']")
    private WebElement labelButton;

    @FindBy(xpath = "//label[@for='construction[flat]']")
    private WebElement labelButtonType;


    @FindBy(xpath = "//button[@class='fr-btn fr-btn-primary floatingButton']")
    private WebElement searchButton;

    public TestCase_8(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public TestCase_8 openPage() {
        driver.get(HOMEPAGE_URL);
        return this;
    }

    public void labelClick() {
        labelButton.click();
        labelButtonType.click();
    }

    public void searchButtonClick(){ searchButton.click();}

    public void wiperFind(){
        driver.get("https://svt.by/wipers_catalog");
    }

    public void addInCarts() throws InterruptedException {
//        itemFind.click();
        List<WebElement> elementName = driver.findElements(By.xpath("//span[@class='fr-icon2-basket-2']"));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,700)");
        Thread.sleep(2900);
        elementName.get(1).click();
        Thread.sleep(2900);
        elementName.get(2).click();
        Thread.sleep(2900);
        elementName.get(3).click();
        Thread.sleep(2900);
        elementName.get(4).click();
        Thread.sleep(2000);
    }

    public void scroll(){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,1000)");
    }
}
