package org.example.HomeWork3;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.concurrent.TimeUnit;

public class Registration {

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--incognito");
        options.addArguments("start-maximized");
        WebDriver driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        driver.get("https://yummybook.ru/");

        WebElement buttonRegistration = driver.findElement(By.cssSelector(".b-nuser-link .open-signup-modal > span"));
        buttonRegistration.click();

        WebElement registrationEmail = driver.findElement(By.xpath(".//input[@id='signupform-username']"));
        registrationEmail.click();
        registrationEmail.sendKeys("test@gmail.com");

        WebElement registrationName = driver.findElement(By.xpath(".//input[@id='signupform-nickname']"));
        registrationName.click();
        registrationName.sendKeys("TestTestTest");

        WebElement registrationPassword = driver.findElement(By.xpath(".//input[@id='signupform-password']"));
        registrationPassword.click();
        registrationPassword.sendKeys("test123456789");

        WebElement registrationPassConfirm = driver.findElement(By.xpath(".//input[@id='signupform-passwordconfirm']"));
        registrationPassConfirm.click();
        registrationPassConfirm.sendKeys("test123456789");

        WebElement buttonRegister = driver.findElement(By.xpath(".//button[@class='btn btn-reg']"));
        buttonRegister.click();

        WebElement buttonCloseReg = driver.findElement(By.xpath(".//button[@class='close']"));
        buttonCloseReg.click();

        // driver.quit();

    }
}
