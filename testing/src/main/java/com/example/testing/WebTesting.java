package com.example.testing;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import java.io.File;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class WebTesting {
    public static void main(String[] args) throws InterruptedException {
        String[] MNEMONIC = "security curve swallow few tilt attract donor tuition matter place spoon major".split(" ");
        String PASSWORD = "11111111";

        ChromeOptions options = new ChromeOptions();
        options.addExtensions(new File("src/Extensions/MetaMask_Chrome.crx"));
        WebDriver driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.get("https://openfabric.dev");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        Thread.sleep(5000);

        Set<String> windowHandles = driver.getWindowHandles();
        Iterator<String> iterator = windowHandles.iterator();
        String parentWindow = iterator.next();
        String childWindow = iterator.next();
        driver.switchTo().window(childWindow);

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
