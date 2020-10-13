package core;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class DriverFactory {
    static WebDriver driver;

    public ChromeOptions chromeOptionsConfig(){
        ChromeOptions options = new ChromeOptions();
        options.addArguments("test-type");
        options.addArguments("start-maximized");
        options.addArguments("--window-size=1920,1080");

        return options;
    }

    public WebDriver driverConfig(){
        driver = new ChromeDriver(chromeOptionsConfig());

        return driver;
    }
}
