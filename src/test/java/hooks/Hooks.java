package hooks;

import helper.Utility;
import io.cucumber.java.*;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import static helper.Utility.quitDriver;
import static helper.Utility.startDriver;


public class Hooks {


    @BeforeAll
    public static void setUp() {

    }

    @AfterAll
    public static void tearDown() {

    }

    @Before
    public static void beforeTest() {
        startDriver();

    }

    @After
    public static void afterTest(Scenario scenario) throws InterruptedException {

        Thread.sleep(3000);

        if (scenario.isFailed()) {
            byte[] screenshot = ((TakesScreenshot) Utility.driver).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot, "image/png", "Screenshot");
        }

       quitDriver();
    }

}

