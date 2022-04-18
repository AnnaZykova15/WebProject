package org.example.HomeWork3;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class CorrectSearch {

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


        WebElement searchLine = driver.findElement(By.cssSelector(".col-lg-8 .b-top-search .navbar-form .form-group .form-control"));
        searchLine.click();
        searchLine.sendKeys("торт");

        WebElement buttonToFind = driver.findElement(By.cssSelector(".b-top-search .btn"));
        buttonToFind.click();

        // driver.quit();

    }

}
