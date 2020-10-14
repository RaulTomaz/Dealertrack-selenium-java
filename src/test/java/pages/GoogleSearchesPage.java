package pages;

import core.CommonsBasePage;
import org.openqa.selenium.By;

public class GoogleSearchesPage extends CommonsBasePage {
    String googleSearchOptionsBar = "hdtbSum";
    String firstSearch = "//*[@id='rso']/div[1]//a";

    public void validateSearchesCharged(){
        validateElement(By.id(googleSearchOptionsBar));
        validateElement(By.xpath(firstSearch));
    }

    public void clickFirstResult(){
        clickElement(By.xpath(firstSearch));
    }

}
