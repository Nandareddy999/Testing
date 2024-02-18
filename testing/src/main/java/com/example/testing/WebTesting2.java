package com.example.testing;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.time.Duration;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class WebTesting2 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://openfabric.dev");

        driver.findElement(By.xpath("//*[text()='Login with OTHER']")).click();
        driver.findElement(By.xpath("//*[text()='Login with Metamask']")).click();

        driver.findElement(By.xpath("//*[@font-size='20px']")).click();
        driver.findElement(By.xpath("//*[text()='Add to Chrome']")).click();

        Thread.sleep(20000);
//        driver.switchTo().alert().accept();

        Set<String> windowHandles = driver.getWindowHandles();
        Iterator<String> iterator = windowHandles.iterator();
        String parentWindow = iterator.next();
        String childWindow = iterator.next();
        driver.switchTo().window(childWindow);

        String[] MNEMONIC = "security curve swallow few tilt attract donor tuition matter place spoon major".split(" ");
        String PASSWORD = "11111111";

        Thread.sleep(5000);

        driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div/div/ul/li[1]/div/input")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div/div/ul/li[3]/button")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div/div/div/button[2]")).click();
        Thread.sleep(1000);

        for (int i = 0; i < 3; i++) {
            driver.findElement(By.cssSelector("body")).sendKeys(Keys.TAB);
        }
        Actions actions = new Actions(driver);
        for (String word : MNEMONIC) {
            actions.sendKeys(word).sendKeys(Keys.TAB).sendKeys(Keys.TAB).build().perform();
        }
        Thread.sleep(500);
        driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div/div/div[4]/div/button")).click();
        Thread.sleep(500);

        driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div/div/div[2]/form/div[1]/label/input")).sendKeys(PASSWORD);
        driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div/div/div[2]/form/div[2]/label/input")).sendKeys(PASSWORD);
        Thread.sleep(500);
        driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div/div/div[2]/form/div[3]/label/input")).click();
        driver.findElement(By.xpath("//*[@id='app-content']/div/div[2]/div/div/div/div[2]/form/button")).click();
        driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div/div/div[2]/button")).click();
        driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div/div/div[2]/button")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("/html/body/div[2]/div/div/section/div[1]/div/button/span")).click();

        System.out.println("Import complete");




    }
}
