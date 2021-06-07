package com.kodilla.testing2.facebook;

import com.kodilla.testing2.config.WebDriverConfig;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class FacebookTestingApp{
    public static final String XPATH_COOKIES_BUTTON = "//div[contains(@class, \"_9o-r\")]/button[2]";
    public static final String XPATH_CREATE_NEW_ACCOUNT = "//div[contains(@class, \"_6ltg\")]/a";
    public static final String XPATH_WAIT_FOR = "//select[1]";
    public static final String XPATH_SELECT_DAY = "//div[contains(@class, \"_5k_5\")]/span/span/select[1]";
    public static final String XPATH_SELECT_MONTH = "//div[contains(@class, \"_5k_5\")]/span/span/select[2]";
    public static final String XPATH_SELECT_YEAR = "//div[contains(@class, \"_5k_5\")]/span/span/select[3]";

    public static void main(String[] args) {
        WebDriver driver = WebDriverConfig.getDriver(WebDriverConfig.FIREFOX);
        driver.get("https://www.facebook.com/");

        driver.findElement(By.xpath(XPATH_COOKIES_BUTTON)).click();

        driver.findElement(By.xpath(XPATH_CREATE_NEW_ACCOUNT)).click();

        while (!driver.findElement(By.xpath(XPATH_WAIT_FOR)).isDisplayed());

        WebElement selectDayCombo = driver.findElement(By.xpath(XPATH_SELECT_DAY));
        Select selectDayBoard = new Select(selectDayCombo);
        selectDayBoard.selectByIndex(28);

        WebElement selectMonthCombo = driver.findElement(By.xpath(XPATH_SELECT_MONTH));
        Select selectMonthBoard = new Select(selectMonthCombo);
        selectMonthBoard.selectByIndex(2);

        WebElement selectYearCombo = driver.findElement(By.xpath(XPATH_SELECT_YEAR));
        Select selectYearBoard = new Select(selectYearCombo);
        selectYearBoard.selectByIndex(26);
    }
}
