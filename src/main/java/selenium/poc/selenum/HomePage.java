package selenium.poc.selenum;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Created by martinmendez on 12/22/15.
 */
public class HomePage {
    public static final By searchInput = By.id("search_input");

    public static final By searchButton = By.id("search");

    public static void Write(WebDriver driver, String textToSearch) {
        WebDriverWait wait = new WebDriverWait(driver,30);
        wait.until(ExpectedConditions.presenceOfElementLocated(searchInput));

        WebElement input = driver.findElement(searchInput);
        input.sendKeys(textToSearch);
    }

    public static void ClickSearch(WebDriver driver) {
        WebDriverWait wait = new WebDriverWait(driver,30);
        wait.until(ExpectedConditions.presenceOfElementLocated(searchButton));

        driver.findElement(searchButton).click();
    }
}