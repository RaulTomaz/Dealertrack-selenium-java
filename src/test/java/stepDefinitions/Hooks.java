package stepDefinitions;

import core.DriverFactory;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import utils.DataProvider;

import java.util.concurrent.TimeUnit;


public class Hooks extends DriverFactory {
    DataProvider dataProvider = new DataProvider();

    @Before
    public void InstantiateDriver() {
        setChromeDriverProperty();
        driverConfig();
        dataProvider.collectJsonValues();
        getDriver().get("https://www.google.com.br");
        getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @After
    public void eliminarDriver() {
        getDriver().quit();
    }

}
