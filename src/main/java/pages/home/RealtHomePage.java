package pages.home;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pages.base.BasePage;

public class RealtHomePage extends BasePage {

    public RealtHomePage(WebDriver driver) {
        super(driver);
    }

    private final By countRooms = By.id("rooms");
    private final By optionRooms = By.xpath("//select[@id=\"rooms\"]/option[@value=2]");
    private final By findBtn = By.xpath("//div[@id=\"residentialInputs\"]//a[text()=\"Найти\"]");

    public RealtHomePage enterCountRooms () {
        driver.findElement(countRooms).click();
        driver.findElement(optionRooms).click();

        return this;
    }

    public RealtHomePage clickToFind () {
        WebElement btnFind = driver.findElement(findBtn);
        waitElementIsVisible(btnFind).click();

        return this;
    }

}
