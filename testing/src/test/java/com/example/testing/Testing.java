package com.example.testing;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Testing {
    public static void main(String[] args) {
//        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
//        driver.get("https://www.careers.govt.nz/my-account/sign-up/");
//        driver.manage().window().maximize();
//        driver.findElement(By.xpath("//input[@id='Form_registrationForm_FirstName']")).sendKeys("Wolf");
//        driver.findElement(By.xpath("//*[@name='Surname']")).sendKeys("Short");
//        driver.findElement(By.xpath("//*[@name='Email[_Email]']")).sendKeys("Wolfshort55@gmail.com");
//        driver.findElement(By.xpath("//*[@name='Password[_Password]']")).sendKeys("Wolfshort123");
//
//        driver.findElement(By.xpath("//*[@name='TandCConfirm']")).click();
//        driver.findElement(By.xpath("//*[@name='action_sendQuickRegistration']")).click();
        driver.get("https://www.tutorialspoint.com/selenium/practice/selenium_automation_practice.php");
        driver.findElement(By.xpath("//*[@id='name']")).sendKeys("Nanda");
        driver.findElement(By.xpath("//*[@id='email']")).sendKeys("Nanda@gmail.com");
        driver.findElement(By.xpath("//*[@id='gender']")).click();
        driver.findElement(By.xpath("//*[@id='mobile']")).sendKeys("9398754615");
        driver.findElement(By.xpath("//*[@id='dob']")).sendKeys("12/02/2024");
        driver.findElement(By.xpath("//*[@id='subjects']")).sendKeys("Science");
        driver.findElement(By.xpath("//*[@id='hobbies']")).click();
        driver.findElement(By.xpath("//label[text()='Reading']/preceding-sibling::input")).click();

        try {
            Thread.sleep(10000);
        } catch (Exception e) {
            e.printStackTrace();
        }

        driver.findElement(By.xpath("//textarea[@name='picture']")).sendKeys("Hi How are you?");

        WebElement ddown = driver.findElement(By.xpath("//*[@id='state']"));
        Select select = new Select(ddown);
        select.selectByIndex(3);

        WebElement down = driver.findElement(By.xpath("//*[@id='city']"));
        Select sel = new Select(down);
        sel.selectByIndex(2);

        driver.findElement(By.xpath("//*[@value='Login']")).click();
        

    }
}
