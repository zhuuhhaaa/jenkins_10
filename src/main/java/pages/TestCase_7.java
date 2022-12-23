package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.JavascriptExecutor;

public class TestCase_7 {
    private final WebDriver driver;
    private static final String HOMEPAGE_URL = "https://www.svt.by/";

    @FindBy(xpath = "//a[@id='logInModal']")
    private WebElement autorizationBtn;

    @FindBy(xpath = "//input[@id='login_modal']")
    private WebElement loginInput;

    @FindBy(xpath = "//input[@id='pass_modal']")
    private WebElement passWordInput;

    public void autorizationClick() throws InterruptedException {
        autorizationBtn.click();
        Thread.sleep(1000);
    }
    public void enterLogin(String login) {

        loginInput.sendKeys(login);
    }

    public void enterPassword(String passWord) throws InterruptedException {

        passWordInput.sendKeys(passWord);
        Thread.sleep(1000);
        passWordInput.submit();
        Thread.sleep(2000);
    }
    @FindBy(xpath = "//a[@title='Гараж']")
    private WebElement garage;

    public void garageBtn() throws InterruptedException {
        garage.click();
        Thread.sleep(2000);
    }

    @FindBy(xpath = "//a[@href='/search?pcode=WDBPJ73JX2A024312']")
    private WebElement car;

    public void carBtn() throws InterruptedException {
        car.click();
        Thread.sleep(2000);
    }

    @FindBy(xpath = "//input[@id='pcode']")
    private WebElement input;

    @FindBy(xpath = "//a[@class='searchByVinDescription']")
    private WebElement itemFind;

    @FindBy(xpath = "//a[text()='Рулевое управление']")
    private WebElement steering;

    @FindBy(xpath = "//a[text()='\n" +
            "Тяга рулевая, наконечник рулевой тяги']")
    private WebElement tractionSteering;

    @FindBy(xpath = "//a[@href='/laximo?lp=qgroups&c=MB201810&vid=0&gid=520&ssd=%24%2AKwHC9ufdxcGXk7uVu6TMwJqOrqm3wsfGzJiSgsfGiIGVmbaPi9GZytOhs7KhvMOa7ePCsMbFxMLHxouLmZ2S1M3Sw8fBmpCI0t3UhJPTzNaLi5mdmtTN0rfU2IvE1dLL1MHIo9TYi9HY0svUxtKMAAAAAJynDwM%3D%24']")
    private WebElement tractionFind;

//    @FindBy(xpath = "//input[@name='search']")
//    private WebElement searchInput;

    public TestCase_7(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    public TestCase_7 openPage() {
        driver.get(HOMEPAGE_URL);
        return this;
    }

    public void inputClick() throws InterruptedException {
        input.click();
        Thread.sleep(2000);
    }
    public void enterSearchText(String searchText) throws InterruptedException {

        input.sendKeys(searchText);
        input.submit();
        Thread.sleep(2000);
    }

    public void steeringClick() throws InterruptedException {
        Thread.sleep(2000);
        steering.click();
        Thread.sleep(1000);
    }

    public void tractionSteeringClick() throws InterruptedException {
        Thread.sleep(2000);
        tractionSteering.click();
        Thread.sleep(1000);
    }

    public void tractionFindClick() throws InterruptedException {
        tractionFind.click();
        Thread.sleep(1000);
    }

    public void itemClick() throws InterruptedException {itemFind.click();
        Thread.sleep(5000);}
    public void scroll() throws InterruptedException {
        Thread.sleep(6000);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,1600)");
    }
}