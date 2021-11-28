package homework10;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestCases {

    private WebDriver driver;
    private  static final String URL = "https://demoqa.com/";



    @BeforeMethod
    public void setUp() {

        WebDriverManager.chromedriver().setup();

        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

/*
    @AfterMethod
    public void closeDriver() throws InterruptedException {
        Thread.sleep(3000);
        driver.quit();
    }
*/




    @Test
    public void popIsAppeared() throws InterruptedException {

        driver.get(URL);
        driver.findElement(By.xpath("//*[@class='card-body'][contains(h5, 'Forms')]")).click();
        driver.findElement(By.xpath("//*[@class = 'btn btn-light ']//*[contains(text(), 'Practice Form')]")).click();
        driver.findElement(By.id("firstName")).sendKeys("Vasya");
        driver.findElement(By.id("lastName")).sendKeys("Pupkin");
        driver.findElement(By.id("userEmail")).sendKeys("VasyaPupkin@email.com");
        driver.findElement(By.className("custom-radio")).click();
        driver.findElement(By.id("userNumber")).sendKeys("1234567890");


        //----------------------------------------------------------------------------------------------------------------------
        //Выбор даты - пофиксил - Работает
        WebElement birth = driver.findElement(By.id("dateOfBirthInput"));
        birth.click();
        WebElement monthElement = driver.findElement(By.className("react-datepicker__month-select"));
        Select selectMonth = new Select(monthElement);
        selectMonth.selectByVisibleText("June");
        WebElement yearElement = driver.findElement(By.className("react-datepicker__year-select"));
        Select selectYear = new Select(yearElement);
        selectYear.selectByVisibleText("1976");
        WebElement dayElement = driver.findElement(By.xpath("//*[contains(@class, 'react-datepicker__day react-datepicker__day--0"+ "19" + "')]"));
        dayElement.click();
        //------------------------------------------------------------------------------------------------------------------------



        WebElement subjectsContainer = driver.findElement(By.id("subjectsInput"));
        subjectsContainer.click();
        subjectsContainer.sendKeys("English");
        subjectsContainer.sendKeys(Keys.ENTER);

        driver.findElement(By.xpath("//*[@class = 'custom-control-label'][contains(text(), 'Sports')]")).click();

        WebElement choose = driver.findElement(By.id("uploadPicture"));
        choose.sendKeys("C:\\Users\\edubinin\\IMG.png");

        driver.findElement(By.id("currentAddress")).sendKeys("Any Address");



        //----------------------------------------------------------------------------------------

        //Выбор штата и города - НЕ РАБОТАЕТ
 /*       ((JavascriptExecutor) driver).executeScript("scroll(0,600)");
        driver.findElement(By.cssSelector("#state")).click();
        WebElement state = driver.findElement(By.xpath("//div[contains(text(), 'NCR')]"));

        new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(By.xpath("//div[contains(text(), 'NCR')]")));
        Actions actionState = new Actions(driver);
        actionState.moveToElement(state).click().build().perform();




        ((JavascriptExecutor) driver).executeScript("scroll(1,600)");
        driver.findElement(By.cssSelector("#city")).click();
        WebElement city = driver.findElement(By.xpath("//div[contains(text(), 'NCR')]"));

        new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(By.xpath("//div[contains(text(), 'Delhi')]")));
        Actions actionCity = new Actions(driver);
        actionCity.moveToElement(city).click().build().perform();*/
        //-----------------------------------------------------------------------------------------------


        driver.findElement(By.id("submit")).submit();
        Thread.sleep(3000);
        Assert.assertEquals(driver.findElement(By.xpath("//*[@class = 'modal-content']")).isDisplayed(), true);

    }

    @Test
    public void checkSelectedDowloadsWordFileAndExcelFile() throws InterruptedException {

        driver.get(URL);
        driver.findElement(By.xpath("//*[contains(h5,'Elements')]")).click();
        driver.findElement(By.xpath("//*[@class = 'menu-list']//span[contains(text(), 'Check Box')]")).click();
        driver.findElement(By.cssSelector("svg.rct-icon.rct-icon-expand-all")).click();

        Assert.assertEquals(driver.findElement(By.xpath("//*[@class = 'rct-title'][contains(text(), 'Word File.doc')]")).isSelected(), false);
        Assert.assertEquals(driver.findElement(By.xpath("//*[@class = 'rct-title'][contains(text(), 'Excel File.doc')]")).isSelected(), false);


        driver.findElement(By.xpath("//*[@class = 'rct-title'][contains(text(), 'Word File.doc')]")).click();
        driver.findElement(By.xpath("//*[@class = 'rct-title'][contains(text(), 'Excel File.doc')]")).click();


        Assert.assertEquals(driver.findElement(By.xpath("//*[@class = 'text-success'][contains(text(), 'downloads')]")).isDisplayed(), true);

    }



    //Additional case about Action
    @Test
    public void testDoubleClick() {
        driver.get(URL);
        driver.findElement(By.xpath("//*[contains(h5,'Elements')]")).click();
        driver.findElement(By.xpath("//*[@id = 'item-4']/*[contains(text(), 'Buttons')]")).click();
        String currentUrl = driver.getCurrentUrl();
        Actions actions = new Actions(driver);
        actions.doubleClick(driver.findElement(By.id("doubleClickBtn"))).perform();
        Assert.assertEquals(driver.findElement(By.id("doubleClickMessage")).isDisplayed(), true);
    }
    @Test
    public void testRigtClick() {
        driver.get(URL);
        driver.findElement(By.xpath("//*[contains(h5,'Elements')]")).click();
        driver.findElement(By.xpath("//*[@id = 'item-4']/*[contains(text(), 'Buttons')]")).click();

        Actions actions = new Actions(driver);
        actions.contextClick(driver.findElement(By.id("rightClickBtn"))).build().perform();
        Assert.assertEquals(driver.findElement(By.id("rightClickMessage")).isDisplayed(), true);
    }
    @Test
    public void testDynamicClick() {
        driver.get(URL);
        driver.findElement(By.xpath("//*[contains(h5,'Elements')]")).click();
        driver.findElement(By.xpath("//*[@id = 'item-4']/*[contains(text(), 'Buttons')]")).click();

        Actions actions = new Actions(driver);

        actions.click(driver.findElement(By.cssSelector(".mt-4 > button:not(#rightClickBtn.btn.btn-primary)"))).perform();
        Assert.assertEquals(driver.findElement(By.id("dynamicClickMessage")).isDisplayed(), true);
    }

    @Test
    public void t() {

        driver.get(URL);
        driver.findElement(By.xpath("//div[@class='card-body']/h5[contains(text(), 'Forms')]")).click();

    }




}
