package pages;

import core.CommonsBasePage;
import utils.DataProvider;

public class DealerTrackHomePage extends CommonsBasePage {
    DataProvider dataProvider = new DataProvider();
    String dealerUrl = "";
    String linkSite = dataProvider.getJsonData().get("assertLinkSite").getAsString();

    public void assertDealerTrackUrl(){
        dealerUrl = getDriver().getCurrentUrl();
        assertConditionTrue("url not containing dealertrack.com.br", dealerUrl.contains(linkSite));
    }

}
