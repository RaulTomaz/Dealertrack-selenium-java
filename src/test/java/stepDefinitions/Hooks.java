package stepDefinitions;

import core.DriverFactory;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import org.junit.BeforeClass;


public class Hooks extends DriverFactory {

    @BeforeClass
    public static void EnvironmentConfig(){
        System.setProperty("webdriver.driver.chrome", "driver/chromedriver.exe");
    }

    @Before
    public void InstantiateDriver() {
        driverConfig();
    }

    @After
    public void eliminarDriver() {

    }

    @AfterStep
    public void tirarScreenshot() {

    }

}
