package pages.home;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.base.BasePage;

import java.time.Duration;

public class GoogleHomePage extends BasePage {

    public GoogleHomePage (WebDriver driver) {
        super(driver);
    }

    public static final By mainGoogleInput = By.xpath("//input[@title=\"Поиск\"]");

    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

    public GoogleHomePage sendKeysInInput () {
        driver
                .findElement(mainGoogleInput)
                .sendKeys("Hello, my name is Niiaz");

        WebElement webElement = wait
                .until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@title=\"Поиск\"]")));

        return this;
    }

    public GoogleHomePage checkAvito () {
        WebElement avitoTitle = driver.findElement(By.xpath("//span[text()=\"Популярные легковые автомобили\"]"));
        WebElement avitoInput = driver.findElement(By.xpath("//input[@data-marker=\"search-form/suggest\"]"));

        String avitoInfo = avitoTitle.getCssValue("margin-right");
        avitoInput.sendKeys("Hello baby", Keys.ENTER);

        System.out.println(avitoInfo);

        return this;
    }
}
