package com.selenium.assignment;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class seleniumlogin1 {
    public static void main(String[] args) {
        // ChromeDriver setup using WebDriverManager
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        
        // Window maximize and open 
        driver.manage().window().maximize();
        driver.get("https://gmail.com");

        // Find email input field and type email
        WebElement email = driver.findElement(By.xpath("//*[@id='identifierId']"));
        email.click();
        email.sendKeys("your_email@gmail.com");

        // Click on Next button
        WebElement next = driver.findElement(By.xpath("//*[@id='identifierNext']/div/button"));
        next.click();

        // Note: Aage ka automation Gmail security ki wajah se block ho jata hai
        System.out.println("Email field fill aur Next click ho gaya. Further automation is blocked by Gmail.");
    }
}

