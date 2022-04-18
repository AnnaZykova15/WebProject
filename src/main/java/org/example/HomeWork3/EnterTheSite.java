package org.example.HomeWork3;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.concurrent.TimeUnit;

public class EnterTheSite {

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--incognito");
        options.addArguments("start-maximized");
        WebDriver driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        driver.get("https://yummybook.ru/");

        WebElement buttonEnter = driver.findElement(By.cssSelector(".b-nuser-link .b-link-enter>span "));
        buttonEnter.click();

        WebElement loginUsername = driver.findElement(By.xpath(".//input[@id='loginform-username']"));
        loginUsername.click();
        loginUsername.sendKeys("4849828@gmail.com");

        WebElement passwordUser = driver.findElement(By.xpath(".//input[@id='loginform-password']"));
        passwordUser.click();
        passwordUser.sendKeys("FyzKexifz1!");

        WebElement buttonEnterAccount = driver.findElement(By.xpath(".//button[@class='btn btn-enter']"));
        buttonEnterAccount.click();

        // driver.quit();
    }
}
