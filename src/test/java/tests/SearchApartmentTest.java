package tests;

import org.testng.annotations.Test;
import pages.home.GoogleHomePage;

import java.time.Duration;

import static constants.Constant.Urls.GOOGLE_MAIN_PAGE;
import static constants.Constant.Urls.REALT_HOME_PAGE;

public class SearchApartmentTest extends BaseTest {

    @Test
    public void checkRedirectToListing () {
        basePage.open(REALT_HOME_PAGE);

        realtHomePage
                .enterCountRooms()
                .clickToFind();

        realtListingPage.checkCountCards();
    }

    @Test
    public void testSomeTest () {
        basePage.open(GOOGLE_MAIN_PAGE);
        googleMainPage.sendKeysInInput();
    }

    @Test
    public void testAvitoTest () {
        basePage.open("https://www.avito.ru/kazan/transport");
        googleMainPage.checkAvito();
    }


}
