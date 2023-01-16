package ru.gb.lessons;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class App {
    public static void main( String[] args ) throws InterruptedException {
        WebDriver webDriver = WebDriverManager.chromedriver().create();

        webDriver.get("https://pop-music.ru");
        webDriver.manage().window().setSize(new Dimension(1500, 1100));

        webDriver.findElement(By.xpath("//div[@class='header__links']//a[div[text()='Войти']]")).click();

        Thread.sleep(5000);
        webDriver.quit();
    }
}
