package com.selenium.assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumLogin {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://gmail.com");
        WebElement email= driver.findElement(By.xpath("//*[@id=\"identifierId\"]"));
        email.click();
        email.sendKeys("gmail.com");
        WebElement next= driver.findElement(By.xpath("//*[@id=\"identifierNext\"]/div/button/span"));
        next.click();
        //the testing browser isn't allowed to log in for security reasons so I will be writing the steps after the login is done.
        WebElement compose = driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div[2]/div[1]/div[1]/div/div"));
        compose.click();
        WebElement recepient= driver.findElement(By.xpath("//*[@id=\":os\"]"));
        recepient.click();
        recepient.sendKeys("xyz@gmail.com");
        WebElement subject = driver.findElement(By.xpath("//*[@id=\":pu\"]"));
        subject.click();
        subject.sendKeys("testing");
        WebElement body= driver.findElement(By.xpath("//*[@id=\":r8\"]"));
        body.click();
        body.sendKeys("testing");
        WebElement send= driver.findElement(By.xpath("//*[@id=\":pk\"]"));
        send.click();
        //The email will be sent.
    }
}
