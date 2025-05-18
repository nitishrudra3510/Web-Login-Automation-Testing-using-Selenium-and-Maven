package com.selenium.assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class SeleniumAssignment {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        try {
            driver.manage().window().maximize();
            driver.get("https://www.seleniumeasy.com/test/input-form-demo.html");

            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

            // Fill First Name
            WebElement firstName = wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("first_name")));
            firstName.sendKeys("Aman");

            // Fill Last Name.a
            WebElement lastName = driver.findElement(By.name("last_name"));
            lastName.sendKeys("Kumar");

            // Fill Email
            WebElement email = driver.findElement(By.name("email"));
            email.sendKeys("aman.kumar@example.com");

            // Fill Phone
            WebElement phone = driver.findElement(By.name("phone"));
            phone.sendKeys("9876543210");

            // Fill Address
            WebElement address = driver.findElement(By.name("address"));
            address.sendKeys("123 Main Street");

            // Fill City
            WebElement city = driver.findElement(By.name("city"));
            city.sendKeys("Delhi");

            // Select State from dropdown
            WebElement state = driver.findElement(By.name("state"));
            state.sendKeys("Delhi");

            // Fill Zip Code
            WebElement zip = driver.findElement(By.name("zip"));
            zip.sendKeys("110001");

            // Fill Website or domain name
            WebElement website = driver.findElement(By.name("website"));
            website.sendKeys("example.com");

            // Select Hosting - yes
            WebElement hostingYes = driver.findElement(By.xpath("//input[@name='hosting'][@value='yes']"));
            hostingYes.click();

            // Fill Project Description
            WebElement description = driver.findElement(By.name("comment"));
            description.sendKeys("This is a test project.");

            // Submit the form
            WebElement sendButton = driver.findElement(By.xpath("//button[contains(text(),'Send')]"));
            sendButton.click();

            System.out.println("Form submitted successfully!");

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // Close the browser after 5 seconds so you can see the result
            try { Thread.sleep(5000); } catch (InterruptedException e) {}
            driver.quit();
        }
    }
}


