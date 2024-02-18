package com.example.testing;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class WebTesting3 {

    public static WebDriver driver = new ChromeDriver();
    public static SoftAssert sa = new SoftAssert();

    @Test
    public void TestUrl() {
        String expectedUrl = "https://openfabric.dev";
        driver.get("https://openfabric.dev");
        String actualUrl = driver.getCurrentUrl();
        sa.assertEquals(actualUrl,expectedUrl);
        sa.assertAll();
    }
}
