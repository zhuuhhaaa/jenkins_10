package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.JavascriptExecutor;

import java.util.List;

public class TestCase_10 {
    private static final String HOMEPAGE_URL = "https://www.svt.by/";
    private final WebDriver driver;

    @FindBy(xpath = "//span[@class='fr-icon2-basket-2']")
    private WebElement itemFind;
    @FindBy(xpath = "//label[@for='ice_type[H4]']")
    private WebElement labelButton;

    @FindBy(xpath = "//button[@class='fr-btn fr-btn-primary floatingButton']")
    private WebElement searchButton;

    public TestCase_10(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public TestCase_10 openPage() {
        driver.get(HOMEPAGE_URL);
        return this;
    }

    public void labelClick() {
        labelButton.click();
    }

    public void searchButtonClick(){ searchButton.click();}

    public void lampFind(){
        driver.get("https://svt.by/lamps_catalog");
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

    public void addInCart(){}{
//itemFind.click();
//        List<WebElement> elementName = driver.findElements(By.xpath("//span[@class='fr-icon2-basket-2']"));
//        elementName.get(1).click();
//        elementName.get(2).click();
//        elementName.get(3).click();
//        elementName.get(4).click();
    }
    public void scroll(){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,1000)");
    }
}
