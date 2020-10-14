package pages;

import core.CommonsBasePage;
import org.openqa.selenium.By;
import utils.DataProvider;

public class GooglePage extends CommonsBasePage {
    DataProvider dataProvider = new DataProvider();
    String googleLogo = "hplogo";
    String googleInputSearch = "q";
    String googleSearchButton = "btnK";
    String searchText = dataProvider.getJsonData().get("searchVariable").getAsString();

    public void validateGoogleCharged()
    {
        validateElement(By.id(googleLogo));
        validateElement(By.name(googleInputSearch));
    }

    public void sendSearchValue(){
        sendElementKeys(By.name(googleInputSearch), searchText);
    }

    public void clickSearchButton(){
        clickElement(By.name(googleSearchButton));
    }

}
