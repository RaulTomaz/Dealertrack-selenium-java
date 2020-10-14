package core;

import static org.junit.Assert.assertTrue;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class CommonsBasePage extends DriverFactory{
    WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(15));

    public void validateElement(By by){
        wait.until(ExpectedConditions.visibilityOfElementLocated(by));
    }

    public void clickElement(By by){
        wait.until(ExpectedConditions.visibilityOfElementLocated(by)).click();
    }

    public void sendElementKeys(By by, CharSequence value){
        wait.until(ExpectedConditions.visibilityOfElementLocated(by)).sendKeys(value);
    }

    public void assertConditionTrue(String message, Object condition){
        assertTrue(message, (Boolean) condition);
    }

}
