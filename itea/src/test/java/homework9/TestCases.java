package homework9;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.*;

public class TestCases {
    private WebDriver driver;
    private  static final String URL = "https://demoqa.com/";

    @BeforeMethod
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");

        WebDriverManager.chromedriver().setup(); //Чтобы не переживать, какая версия хрома используется

        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @AfterMethod
    public void closeDriver() {
        driver.quit(); //обращается к chromedriver
        //driver.close();// обращается к вкладке браузера
    }

    @Test
    public void joinButtonFunctionality() {


        //driver.navigate().to(URL); //он используется для перехода на конкретный веб-сайт , но он сохраняет историю браузера и файлы cookie, поэтому мы можем использовать кнопки вперед и назад для навигации между страницами во время кодирования Testcase

        driver.get(URL); // Он используется для перехода на конкретный веб-сайт , но он не поддерживает историю браузера и файлы cookie , поэтому мы не можем использовать кнопки вперед и назад , если мы нажмем на них , страница не получит расписание
        Assert.assertEquals(driver.getCurrentUrl(), URL);
        System.out.println("The tab " + driver.getCurrentUrl() + " is opened");
        System.out.println("Handle for " + driver.getCurrentUrl() + " is " + driver.getWindowHandle());
        driver.findElement(By.xpath("//div[@class=\"home-banner\"]")).click();

        List<String> newTab = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(newTab.get(newTab.size() - 1));


        String newUrl = driver.getCurrentUrl();
        Assert.assertEquals(driver.getCurrentUrl(), newUrl);
        System.out.println("The tab " + newUrl + " is opened");
        System.out.println("Handle for " + newUrl + " is " + driver.getWindowHandle());

        Assert.assertEquals(driver.getWindowHandles().size(),2);

        /*try {

            String winHandleBefore = driver.getWindowHandle();

            for(String winHandle : driver.getWindowHandles()){
                driver.switchTo().window(winHandle);
                String act = driver.getCurrentUrl();
                System.out.println(act);
            }
        }catch(Exception e){
            System.out.println("fail");
        }*/



    }

    @Test
    public void textIsCorrectForEachCards() {

        driver.get(URL);

        String elementsCard = driver.findElement(By.xpath("//*[contains(h5,'Elements')]")).getText();
        String formsCard = driver.findElement(By.xpath("//*[contains(h5, 'Forms')]")).getText();
        String alersFrameAndWindowsCard = driver.findElement(By.xpath("//*[contains(h5, 'Alerts, Frame & Windows')]")).getText();
        String widgetsCard = driver.findElement(By.xpath("//*[contains(h5, 'Widgets')]")).getText();
        String interactionsCard = driver.findElement(By.xpath("//*[contains(h5, 'Interactions')]")).getText();

        Assert.assertEquals(elementsCard, "Elements");
        Assert.assertEquals(formsCard, "Forms");
        Assert.assertEquals(alersFrameAndWindowsCard, "Alerts, Frame & Windows");
        Assert.assertEquals(widgetsCard, "Widgets");
        Assert.assertEquals(interactionsCard, "Interactions");


    }

    @Test
    public void outputAuthDataConfirm() {

        String userName = "userName";
        String userEmail = "userEmail@anymail.com";
        String currentAddress = "Test str.1";
        String permanentAddress = "Test str.2";



        driver.get(URL);
        driver.findElement(By.xpath("//*[contains(h5,'Elements')]")).click();
        driver.findElement(By.xpath("//*[@class = 'btn btn-light '][@id = 'item-0']")).click();
        driver.findElement(By.xpath("//*[@class = 'col-md-9 col-sm-12']/input[@id = 'userName']")).sendKeys(userName);
        driver.findElement(By.xpath("//*[@class = 'col-md-9 col-sm-12']/input[@id = 'userEmail']")).sendKeys(userEmail);
        driver.findElement(By.xpath("//*[@class = 'col-md-9 col-sm-12']/textarea[@id = 'currentAddress']")).sendKeys(currentAddress);
        driver.findElement(By.xpath("//*[@class = 'col-md-9 col-sm-12']/textarea[@id = 'permanentAddress']")).sendKeys(permanentAddress);
        driver.findElement(By.xpath("//button[contains(@id, 'submit')]")).click();



        Map<String, String> map = new HashMap<>();


        List<WebElement> mylist = driver.findElements(By.xpath("//div[contains(@class, 'border col-md-12 col-sm-12')]/p"));

        for (WebElement element : mylist) {
            String[] spl = element.getText().split(":");
            for (int i = 0, j = spl.length / 2; j < spl.length; i++, j++) {
                map.put(spl[i], spl[j]);
            }

            System.out.println(element.getText());

        }

        Assert.assertEquals(map.containsValue(userName), true);
        Assert.assertEquals(map.containsValue(userEmail), true);
        Assert.assertEquals(map.containsValue(currentAddress), true);
        Assert.assertEquals(map.containsValue(permanentAddress), true);


    }


}
