import homework3.Homework3_1;
import org.testng.Assert;
import org.testng.annotations.*;

public class IamLuckyTest {

    private Homework3_1 imLucky = new Homework3_1();

// Первый способ использования @DataProvider
    @DataProvider(name = "evenArrayData")
    public Object[][] evenArray() {
        int[] array = {2,4,6};
        Object[][] data = new Object[][] {
                {array},
        };
        return data;
    }

    @DataProvider(name = "oddArrayData")
    public Object[][] oddArray() {
        int[] array = {1, 3, 5};
        Object[][] data = new Object[][] {
                {array},
        };
        return data;
    }

// Второй спобос использования @DataProvider
/*    @DataProvider()
    public Object[][] secondData() {
        int arr1[] = {4};
        int arr2[] = {5};

        return new Object[][] {
                {arr1},
                {arr2}
        };

    }*/



//   Использовать эти массивы, если не юзается DataProvider
    /*int arr1[] = {4};
    int arr2[] = {5};*/

    @BeforeMethod
    public void beforeEachTest() {
        System.out.println("This is text before each test");
    }

    @BeforeTest
    public void beforeAllTest() {
        System.out.println("Before all tests ...");
    }

    @AfterMethod
    public void afterEachTest() {
        System.out.println("This is text after each test");
    }

    @AfterTest
    public void afterAllTest() {
        System.out.println("After all tests ...");
    }


    @Test(dataProvider = "evenArrayData")
    public void isYouLucky(Object[] array) {
        Assert.assertEquals(imLucky.isLuckyVerifying((int[])array[0]), "I am lucky");
    }

    @Test(dataProvider = "oddArrayData")
    public void isYouUnlucky(Object[] array) {
        Assert.assertEquals(imLucky.isLuckyVerifying((int[])array[0]), "Run again");
    }

    @Test(dataProvider = "oddArrayData")
    public void isYouLuckyTrue(Object[] array) {
        Assert.assertNotEquals(imLucky.isLuckyVerifying((int[])array[0]), "I am lucky");
    }

    @Test(dataProvider = "evenArrayData")
    public void isYouUnluckyTrue(Object[] array) {
        Assert.assertNotEquals(imLucky.isLuckyVerifying((int[])array[0]), "Run again");
    }

}
