package pages.listing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import pages.base.BasePage;
import pages.home.RealtHomePage;

public class RealtListingPage extends BasePage {

    private final By cards = By.xpath("//div[@class=\"listing-item\"]");

    public RealtListingPage (WebDriver driver) {
        super(driver);
    }

    public RealtListingPage checkCountCards () {
        int countCard = driver.findElements(cards).size();
        Assert.assertEquals(countCard, 4);
        return this;
    }
}
