package core;

import org.apache.commons.exec.OS;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class DriverFactory {
    static WebDriver driver;

    public void setChromeDriverProperty(){
        if(OS.isFamilyWindows())
        {
            System.setProperty("webdriver.chrome.driver", "driver/Windows/chromedriver.exe");
        }
        else if(OS.isFamilyMac())
        {
            System.setProperty("webdriver.chrome.driver", "driver/Mac/chromedriver");
        }
        else if(OS.isFamilyUnix())
        {
            System.setProperty("webdriver.chrome.driver", "driver/Linux/chromedriver");
        }
    }

    public ChromeOptions chromeOptionsConfig(){
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--window-size=1920,1080");

        return options;
    }

    public void driverConfig(){
        driver = new ChromeDriver(chromeOptionsConfig());
    }

    public WebDriver getDriver(){
        return driver;
    }
}
